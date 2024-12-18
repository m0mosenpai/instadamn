package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes11.dex */
public final class U9E extends Handler {
    public Message A00;
    public C66340UAd A01;

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, X.VsU] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, X.VuE] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C69465Vno c69465Vno;
        float f;
        C14360o3.A0B(message, 0);
        C66340UAd c66340UAd = this.A01;
        if (c66340UAd == null) {
            this.A00 = message;
            return;
        }
        this.A00 = null;
        Object obj = message.obj;
        if (!(obj instanceof C69465Vno) || (c69465Vno = (C69465Vno) obj) == null) {
            return;
        }
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            U9E u9e = c66340UAd.A03;
            u9e.removeMessages(2, c69465Vno);
            u9e.removeMessages(1, c69465Vno);
            ValueAnimator valueAnimator = c69465Vno.A06;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c69465Vno.A0A = true;
            c69465Vno.A0B = false;
            c66340UAd.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new DecelerateInterpolator(2.0f));
            ofFloat.setDuration(1000L);
            ofFloat.addListener(new C66300U7y(1, c69465Vno, c66340UAd));
            ofFloat.addUpdateListener(new WH5(1, c69465Vno, c66340UAd));
            ofFloat.start();
            c69465Vno.A06 = ofFloat;
            c69465Vno.A0D.start();
            return;
        }
        c66340UAd.A03.removeMessages(1, c69465Vno);
        c69465Vno.A0D.cancel();
        ValueAnimator valueAnimator2 = c69465Vno.A06;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        c69465Vno.A06 = null;
        c69465Vno.A0A = true;
        c69465Vno.A0B = true;
        c66340UAd.invalidate();
        C69627VsU c69627VsU = c69465Vno.A0E;
        C14360o3.A0B(c69627VsU, 1);
        float f2 = c69627VsU.A05;
        float f3 = c69627VsU.A06;
        float f4 = c69627VsU.A02;
        float f5 = c69627VsU.A03;
        float f6 = c69627VsU.A04;
        float f7 = f2 + c69465Vno.A02;
        float f8 = f3 + c69465Vno.A03;
        VaZ vaZ = c69465Vno.A09;
        if (vaZ != null) {
            Drawable drawable = c69465Vno.A07;
            boolean z = c69465Vno.A0C;
            UAV uav = vaZ.A00;
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                c66340UAd.getLocationInWindow(r12);
                Rect bounds = drawable.getBounds();
                C14360o3.A07(bounds);
                int[] iArr = {iArr[0] + bounds.left, iArr[1] + bounds.top};
                int[] iArr2 = new int[2];
                uav.getLocationInWindow(iArr2);
                int i2 = iArr[0] - iArr2[0];
                int i3 = iArr[1] - iArr2[1];
                Drawable newDrawable = constantState.newDrawable();
                newDrawable.setBounds(0, 0, bounds.width(), bounds.height());
                newDrawable.setCallback(uav);
                float f9 = uav.A02;
                ?? obj2 = new Object();
                obj2.A00 = 0.0f;
                obj2.A01 = f9;
                obj2.A08 = 0.0f;
                obj2.A09 = 0.0f;
                obj2.A07 = 0.0f;
                obj2.A04 = 0.0f;
                obj2.A05 = 0.0f;
                obj2.A06 = 0.0f;
                obj2.A03 = -3.4028235E38f;
                obj2.A02 = Float.MAX_VALUE;
                float f10 = i2 + f7;
                float f11 = i3 + f8;
                float A0F = AbstractC166997dE.A0F(newDrawable);
                float A00 = AbstractC167007dF.A00(newDrawable);
                ?? obj3 = new Object();
                obj3.A05 = f10;
                obj3.A06 = f11;
                obj3.A02 = f4;
                obj3.A03 = f5;
                obj3.A04 = f6;
                obj3.A00 = A0F;
                obj3.A01 = A00;
                if (z) {
                    f = (float) Math.acos((f5 - 0.75f) / 0.45f);
                } else {
                    f = 0.0f;
                }
                uav.A05.add(new C69332Vle(newDrawable, obj2, obj3, f, z));
                uav.invalidate();
                Runnable runnable = uav.A04;
                uav.removeCallbacks(runnable);
                if (uav.A03.A01) {
                    uav.postOnAnimation(runnable);
                }
            } else {
                throw new IllegalStateException("HeartsReleaseView requires that the source drawable has a ConstantState that can be used to create a new drawable.");
            }
        }
        c69465Vno.A09 = null;
        C66340UAd.A03(c69465Vno, c66340UAd, 3000L);
    }
}
