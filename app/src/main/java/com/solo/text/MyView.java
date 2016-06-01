package com.solo.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by solo on 2016/4/8.
 */
public class MyView extends ViewGroup
{
    Paint paint;
    public MyView(Context context)
    {
        this(context, null);
    }

    public MyView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measureChildren(widthMeasureSpec,heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b)
    {
        int chidCount=getChildCount();
        for(int i=0;i<chidCount;i++)
        {
            View child=getChildAt(i);
            child.layout(0,0,child.getMeasuredWidth(),child.getMeasuredHeight());
        }
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawRect(200,200,300,300,paint);
    }

}
