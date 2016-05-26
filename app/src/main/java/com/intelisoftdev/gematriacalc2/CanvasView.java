package com.intelisoftdev.gematriacalc2; /**
 * Created by Andrew Howson on 5/25/2016.
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class CanvasView extends View {
    private Paint paint;
    private Paint rpaint;
    private Canvas mcanvas;
    private Context context;
    public float sX, sY;
    DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
    int screenWidth = ToDp(metrics.widthPixels);
    int screenHeight = ToDp(metrics.heightPixels);

    public CanvasView(Context c, AttributeSet attrs) {
        super(c, attrs);
        context = c;

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(40);

        // set attributes for rect
        rpaint = new Paint();
        rpaint.setColor(ContextCompat.getColor(context, R.color.midBlue));
        rpaint.setStyle(Paint.Style.FILL);
        rpaint.setStrokeJoin(Paint.Join.ROUND);
        rpaint.setStrokeWidth(4f);
    }
    private int ToDp(float pix) {
        int dp = (int)((pix)/ Resources.getSystem().getDisplayMetrics().density);
        return dp;
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText((String)getResources().getText(R.string.instr1), screenWidth - 100, screenHeight, paint);
        sX = 100; sY = 230;

        canvas.drawRect(screenWidth + 100, screenHeight - 40, screenWidth + sX + 80, screenHeight + 20, rpaint);
        canvas.drawText("σ,ς", screenWidth + 115, screenHeight, paint);
        canvas.drawText((String)getResources().getText(R.string.instr2), screenWidth + 190, screenHeight, paint);
    }

}

