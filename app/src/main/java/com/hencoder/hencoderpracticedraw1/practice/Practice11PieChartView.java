package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private RectF mCircle = new RectF(100, 100, 800, 800);

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        canvas.save();
        canvas.translate(-20, -20);
        paint.setColor(Color.RED);
        canvas.drawArc(mCircle, 180, 120, true, paint);
        canvas.restore();

        paint.setColor(Color.parseColor("#f7be14"));
        canvas.drawArc(mCircle, 300, 40, true, paint);

        paint.setColor(Color.parseColor("#9c27b0"));
        canvas.drawArc(mCircle, 340, 10, true, paint);

        paint.setColor(Color.parseColor("#96989a"));
        canvas.drawArc(mCircle, 350, 10, true, paint);


        paint.setColor(Color.parseColor("#009698"));
        canvas.drawArc(mCircle, 360, 30, true, paint);

        paint.setColor(Color.parseColor("#2196f3"));
        canvas.drawArc(mCircle, 390, 80, true, paint);

    }
}
