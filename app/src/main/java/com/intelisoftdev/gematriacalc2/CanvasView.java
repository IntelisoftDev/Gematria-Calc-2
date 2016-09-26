package com.intelisoftdev.gematriacalc2; /**
 * Created by Andrew Howson on 5/25/2016.
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;

import java.util.Locale;

public class CanvasView extends View {
    private Paint paint;
    private Paint rpaint;
    private Canvas mcanvas;
    private Context context;
    public float sX, sY;
    DisplayMetrics metrics = new DisplayMetrics();

    int screenWidth = ToDp(getResources().getDisplayMetrics().widthPixels);
    int screenHeight = ToDp(getResources().getDisplayMetrics().heightPixels);

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
        sX = 40; sY = 230;
        String sysLang = Locale.getDefault().getDisplayLanguage();
        if(sysLang.equals("español")) {
            int relaLang = 45;
            canvas.drawText((String) getResources().getText(R.string.instr1), screenWidth - 100 - relaLang, screenHeight, paint);
            canvas.drawText((String)getResources().getText(R.string.instr3), screenWidth - 100 - relaLang, screenHeight + 100, paint);
        }
        else {
            int relaLang = -35;
            canvas.drawText((String) getResources().getText(R.string.instr1), screenWidth - 100 - relaLang, screenHeight, paint);
            canvas.drawText((String)getResources().getText(R.string.instr3), screenWidth - 100 - relaLang, screenHeight + 100, paint);
        }
        float radius = 5;
        final RectF rectf = new RectF();
        rectf.set(screenWidth + sX, screenHeight - 50, screenWidth + sX + 80, screenHeight + 40);
        canvas.drawRoundRect(rectf, 15, 15, rpaint);
        canvas.drawText("σ,ς", screenWidth + sX + 10, screenHeight, paint);
        canvas.drawText((String)getResources().getText(R.string.instr2), screenWidth + sX + 100, screenHeight, paint);

    }

}

