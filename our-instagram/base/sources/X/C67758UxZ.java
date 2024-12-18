package X;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import android.util.Property;
import java.util.Arrays;

/* renamed from: X.UxZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67758UxZ extends AbstractC66307U8g {
    public VKG A00;
    public AbstractC69573Vrc A01;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            VKG vkg = this.A00;
            AbstractC69617VsK abstractC69617VsK = this.A09;
            if (abstractC69617VsK.A01 == 0 && abstractC69617VsK.A00 == 0) {
                f = 1.0f;
            } else {
                f = super.A00;
            }
            vkg.A00.A00();
            vkg.A02(canvas, f);
            VKG vkg2 = this.A00;
            Paint paint = this.A08;
            vkg2.A03(canvas, paint);
            int i = 0;
            while (true) {
                AbstractC69573Vrc abstractC69573Vrc = this.A01;
                int[] iArr = abstractC69573Vrc.A02;
                if (i < iArr.length) {
                    VKG vkg3 = this.A00;
                    float[] fArr = abstractC69573Vrc.A01;
                    int i2 = i * 2;
                    vkg3.A04(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.A01();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        VKG vkg = this.A00;
        if (vkg instanceof C67760Uxb) {
            return -1;
        }
        C67756UxX c67756UxX = (C67756UxX) vkg.A00;
        return c67756UxX.A02 + (c67756UxX.A01 * 2);
    }

    @Override // X.AbstractC66307U8g
    public final boolean A02(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator;
        boolean A02 = super.A02(z, z2, z3);
        if (!isRunning()) {
            this.A01.A00();
        }
        Settings.Global.getFloat(this.A07.getContentResolver(), "animator_duration_scale", 1.0f);
        if (z && z3) {
            AbstractC69573Vrc abstractC69573Vrc = this.A01;
            if (abstractC69573Vrc instanceof C67764Uxf) {
                C67764Uxf c67764Uxf = (C67764Uxf) abstractC69573Vrc;
                if (c67764Uxf.A03 == null) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c67764Uxf, (Property<C67764Uxf, Float>) C67764Uxf.A08, 0.0f, 1.0f);
                    c67764Uxf.A03 = ofFloat;
                    ofFloat.setDuration(5400L);
                    c67764Uxf.A03.setInterpolator(null);
                    c67764Uxf.A03.setRepeatCount(-1);
                    U5Q.A00(c67764Uxf.A03, c67764Uxf, 8);
                }
                if (c67764Uxf.A04 == null) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c67764Uxf, (Property<C67764Uxf, Float>) C67764Uxf.A09, 0.0f, 1.0f);
                    c67764Uxf.A04 = ofFloat2;
                    ofFloat2.setDuration(333L);
                    c67764Uxf.A04.setInterpolator(c67764Uxf.A06);
                    U5Q.A00(c67764Uxf.A04, c67764Uxf, 9);
                }
                c67764Uxf.A02 = 0;
                ((AbstractC69573Vrc) c67764Uxf).A02[0] = AbstractC69853Vwe.A01(c67764Uxf.A07.A05[0], ((AbstractC66307U8g) ((AbstractC69573Vrc) c67764Uxf).A00).A01);
                c67764Uxf.A01 = 0.0f;
                objectAnimator = c67764Uxf.A03;
            } else if (abstractC69573Vrc instanceof C67763Uxe) {
                C67763Uxe c67763Uxe = (C67763Uxe) abstractC69573Vrc;
                if (c67763Uxe.A02 == null) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c67763Uxe, (Property<C67763Uxe, Float>) C67763Uxe.A08, 0.0f, 1.0f);
                    c67763Uxe.A02 = ofFloat3;
                    ofFloat3.setDuration(1800L);
                    c67763Uxe.A02.setInterpolator(null);
                    c67763Uxe.A02.setRepeatCount(-1);
                    U5Q.A00(c67763Uxe.A02, c67763Uxe, 13);
                }
                c67763Uxe.A01 = 0;
                int A01 = AbstractC69853Vwe.A01(c67763Uxe.A06.A05[0], ((AbstractC66307U8g) ((AbstractC69573Vrc) c67763Uxe).A00).A01);
                int[] iArr = ((AbstractC69573Vrc) c67763Uxe).A02;
                iArr[0] = A01;
                iArr[1] = A01;
                objectAnimator = c67763Uxe.A02;
            } else {
                C67762Uxd c67762Uxd = (C67762Uxd) abstractC69573Vrc;
                if (c67762Uxd.A02 == null) {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c67762Uxd, (Property<C67762Uxd, Float>) C67762Uxd.A06, 0.0f, 1.0f);
                    c67762Uxd.A02 = ofFloat4;
                    ofFloat4.setDuration(333L);
                    c67762Uxd.A02.setInterpolator(null);
                    c67762Uxd.A02.setRepeatCount(-1);
                    U5Q.A00(c67762Uxd.A02, c67762Uxd, 12);
                }
                c67762Uxd.A04 = true;
                c67762Uxd.A01 = 1;
                Arrays.fill(((AbstractC69573Vrc) c67762Uxd).A02, AbstractC69853Vwe.A01(c67762Uxd.A05.A05[0], ((AbstractC66307U8g) ((AbstractC69573Vrc) c67762Uxd).A00).A01));
                objectAnimator = c67762Uxd.A02;
            }
            objectAnimator.start();
        }
        return A02;
    }
}
