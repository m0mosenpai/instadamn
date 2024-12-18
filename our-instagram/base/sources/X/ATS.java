package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;

/* loaded from: classes4.dex */
public final class ATS implements View.OnTouchListener {
    public final Drawable A00;
    public final Drawable A01;
    public final View A02;
    public final Runnable A03;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r3 == 3) goto L14;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            r4 = 1
            X.C14360o3.A0B(r7, r4)
            int r3 = r7.getAction()
            r2 = 1060320051(0x3f333333, float:0.7)
            if (r3 == 0) goto L17
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L2a
            r0 = 2
            if (r3 == r0) goto L17
            r0 = 3
            if (r3 == r0) goto L2f
        L17:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            android.graphics.drawable.Drawable r2 = r5.A01
        L1d:
            float r1 = r0.floatValue()
            android.view.View r0 = r5.A02
            r0.setAlpha(r1)
            r0.setBackground(r2)
            return r4
        L2a:
            java.lang.Runnable r0 = r5.A03
            r0.run()
        L2f:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            android.graphics.drawable.Drawable r2 = r5.A00
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATS.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public ATS(View view, Runnable runnable, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        this.A02 = view;
        this.A03 = runnable;
        Context context = view.getContext();
        if (z2) {
            i = R.drawable.secondary_media_button_on_black_rounded_pill;
            if (z3) {
                i = R.drawable.round_white_button_background;
            }
        } else {
            i = R.drawable.filled_white_10_more_rounded_rect;
            if (z) {
                i = R.drawable.primary_media_button;
            }
        }
        this.A01 = context.getDrawable(i);
        if (z2) {
            i2 = R.drawable.secondary_media_button_on_black_rounded_pill;
            if (z3) {
                i2 = R.drawable.round_white_button_background;
            }
        } else {
            i2 = R.drawable.empty_white_more_rounded_rect;
            if (z) {
                i2 = R.drawable.primary_media_button;
            }
        }
        this.A00 = context.getDrawable(i2);
    }
}
