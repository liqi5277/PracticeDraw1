package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {
    Path heartPath = new Path();
    Paint heartPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    Path linePath = new Path();
    Path linePath2 = new Path();
    Paint linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    {
        heartPaint.setColor(Color.RED);

        heartPath.addArc(new RectF(200, 200, 400, 400), -225, 225);
        heartPath.arcTo(new RectF(400, 200, 600, 400), -180, 225, false);
        heartPath.lineTo(400, 542);
        ///////////////////////////////////////////////////////////////////
        linePaint.setColor(Color.GREEN);

        //STROKE模式下绘制线条
        //FILL模式下绘制区域
        linePaint.setStyle(Paint.Style.STROKE);
        linePaint.setStrokeWidth(10);

        linePath.moveTo(600, 0);
        linePath.lineTo(600, 400);
        linePath.lineTo(800, 400);
//        linePath.close();


        linePath2.moveTo(600, 500);
//        linePath2.lineTo(700, 700);
        linePath2.arcTo(new RectF(600, 600, 900, 900), 180, 290, false);
        ///////////////////////////////////////////////////////////////////


    }

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        练习内容：使用 canvas.drawPath() 方法画心形
        canvas.drawPath(heartPath, heartPaint);

        canvas.drawPath(linePath, linePaint);

        canvas.drawPath(linePath2, linePaint);
    }
}
