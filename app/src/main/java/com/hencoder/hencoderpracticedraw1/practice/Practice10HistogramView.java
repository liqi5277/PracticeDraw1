package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint rectPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);



    {
        linePaint.setColor(Color.WHITE);

        rectPaint.setColor(Color.parseColor("#72b916"));


        textPaint.setColor(Color.WHITE);
        textPaint.setStrokeWidth(2);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(40);

    }

    private static final int sHorizontalMargin = 100;
    private static final  int sBottomMargin = 300;
    private static final  int sTopMargin = 100;

    private int coordBottom;
    private int coordRight;

    private int values[] = {5, 30, 30, 200, 360, 450, 210};

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        coordBottom = h - sBottomMargin;
        coordRight = w - sHorizontalMargin;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        final int width = getWidth();
        final int height = getHeight();


        canvas.drawLine(sHorizontalMargin, sTopMargin, sHorizontalMargin, coordBottom, linePaint);
        canvas.drawLine(sHorizontalMargin, coordBottom, coordRight, coordBottom, linePaint);


        int valueMargin = 40;
        int valueWidth = 130;

        int startX = sHorizontalMargin + valueMargin;
        for (int v : values) {
            canvas.drawRect(new RectF(startX, coordBottom - v, startX + valueWidth, coordBottom), rectPaint);
            canvas.drawText("test", startX + valueWidth / 2, coordBottom + 40, textPaint);
            startX += valueMargin + valueWidth;

        }






    }
}
