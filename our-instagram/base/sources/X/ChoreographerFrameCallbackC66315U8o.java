package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.Choreographer;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.U8o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ChoreographerFrameCallbackC66315U8o extends Drawable implements Choreographer.FrameCallback {
    public float A00;
    public float A01;
    public float A02;
    public C69362Vm8 A03;
    public String A04;
    public long A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final List A09;
    public final int A0A;
    public final Rect A0B;
    public final TextPaint A0C;
    public final List A0D;

    public ChoreographerFrameCallbackC66315U8o(Context context) {
        C14360o3.A0B(context, 1);
        this.A09 = new ArrayList();
        this.A0D = new ArrayList();
        this.A0B = new Rect();
        this.A0C = new TextPaint(1);
        this.A04 = "😍";
        Resources resources = context.getResources();
        this.A0A = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        this.A08 = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        this.A07 = resources.getDimensionPixelSize(R.dimen.action_button_min_width);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C69362Vm8 c69362Vm8 = this.A03;
        if (c69362Vm8 != null) {
            A00(canvas, c69362Vm8);
        }
        List list = this.A09;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            C14360o3.A0A(obj);
            A00(canvas, (C69362Vm8) obj);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private final void A00(Canvas canvas, C69362Vm8 c69362Vm8) {
        TextPaint textPaint = this.A0C;
        textPaint.setTextSize(c69362Vm8.A01);
        String str = c69362Vm8.A05;
        textPaint.getTextBounds(str, 0, str.length(), this.A0B);
        canvas.drawText(str, c69362Vm8.A03 - (r4.width() / 2.0f), (c69362Vm8.A04 + c69362Vm8.A00) - (r4.height() / 2.0f), textPaint);
    }

    public final void A01() {
        C69362Vm8 c69362Vm8 = new C69362Vm8(this.A04);
        this.A03 = c69362Vm8;
        c69362Vm8.A03 = this.A01;
        c69362Vm8.A04 = this.A02;
        C14360o3.A0A(c69362Vm8);
        c69362Vm8.A01 = this.A00;
        if (!this.A06) {
            this.A06 = true;
            doFrame(System.currentTimeMillis());
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C69362Vm8 c69362Vm8 = this.A03;
        if (c69362Vm8 != null) {
            c69362Vm8.A00 = (float) ((Math.sin(Math.toRadians(System.currentTimeMillis() / 8)) * 16.0d) - this.A0A);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.A05;
        if (j2 != 0) {
            float f = ((float) (currentTimeMillis - j2)) / 1000.0f;
            List list = this.A09;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C69362Vm8 c69362Vm82 = (C69362Vm8) list.get(i);
                C14360o3.A0A(c69362Vm82);
                float f2 = c69362Vm82.A02 + ((-1000.0f) * f);
                c69362Vm82.A02 = f2;
                float f3 = c69362Vm82.A04 + (f2 * f);
                c69362Vm82.A04 = f3;
                if (f3 < getBounds().top - (2.0f * c69362Vm82.A01)) {
                    this.A0D.add(c69362Vm82);
                }
            }
            List list2 = this.A0D;
            if (!list2.isEmpty()) {
                list.removeAll(list2);
                list2.clear();
            }
        }
        this.A05 = currentTimeMillis;
        if (this.A03 == null && this.A09.isEmpty()) {
            this.A06 = false;
        } else {
            Choreographer.getInstance().postFrameCallback(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0C.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0C.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
