package X;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UAd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66340UAd extends View {
    public VaZ A00;
    public String A01;
    public boolean A02;
    public final U9E A03;
    public final Runnable A04;
    public final List A05;
    public final PointF A06;
    public final W2X A07;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.U9E, android.os.Handler] */
    public C66340UAd(Context context) {
        super(context, null, 0);
        this.A01 = "";
        this.A05 = new ArrayList();
        this.A03 = new Handler();
        this.A06 = new PointF();
        this.A04 = new RunnableC71276Wr6(this);
        this.A07 = new W2X(this, new X2o(this, 6));
        this.A02 = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        for (C69465Vno c69465Vno : this.A05) {
            if (!c69465Vno.A0A) {
                int save = canvas.save();
                try {
                    canvas.translate(c69465Vno.A02, c69465Vno.A03);
                    c69465Vno.A0E.A00(canvas);
                    c69465Vno.A07.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        W2X.A00(this.A07);
    }

    public final void setTargetId(String str) {
        C14360o3.A0B(str, 0);
        this.A01 = str;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        List list = this.A05;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C69465Vno) it.next()).A07, drawable)) {
                    return true;
                }
            }
        }
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    private final void A01(C69465Vno c69465Vno) {
        int paddingLeft;
        int paddingTop;
        Drawable drawable = c69465Vno.A07;
        Rect bounds = drawable.getBounds();
        C14360o3.A07(bounds);
        int i = c69465Vno.A04;
        if ((i & 5) == 5) {
            paddingLeft = AbstractC65702TsY.A08(this) - bounds.width();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if ((i & 80) == 80) {
            paddingTop = AbstractC65702TsY.A07(this) - bounds.height();
        } else {
            paddingTop = getPaddingTop();
        }
        drawable.setBounds(paddingLeft, paddingTop, bounds.width() + paddingLeft, bounds.height() + paddingTop);
        C69627VsU c69627VsU = c69465Vno.A0E;
        c69627VsU.A00 = AbstractC166997dE.A0F(drawable);
        c69627VsU.A01 = AbstractC167007dF.A00(drawable);
    }

    public static final void A02(C69465Vno c69465Vno, C66340UAd c66340UAd, float f) {
        float f2;
        float f3;
        C69054Vgv c69054Vgv = c69465Vno.A08;
        PointF pointF = c66340UAd.A06;
        C14360o3.A0B(pointF, 1);
        float[] fArr = c69054Vgv.A01;
        int length = fArr.length;
        if (length == 1) {
            pointF.set(fArr[0], c69054Vgv.A02[0]);
        } else {
            float f4 = f * (length - 1);
            int A03 = C17s.A03((int) f4, 0, length - 2);
            int i = A03 + 1;
            float f5 = f4 - A03;
            float f6 = fArr[A03];
            float f7 = ((fArr[i] - f6) * f5) + f6;
            float[] fArr2 = c69054Vgv.A02;
            float f8 = fArr2[A03];
            pointF.set(f7, ((fArr2[i] - f8) * f5) + f8);
        }
        float[] fArr3 = c69054Vgv.A00;
        int length2 = fArr3.length;
        if (length2 == 1) {
            f2 = fArr3[0];
            f3 = f2;
        } else {
            float f9 = length2 - 1;
            float A01 = C17s.A01(f) * f9;
            int i2 = length2 - 2;
            int A032 = C17s.A03((int) A01, 0, i2);
            float f10 = fArr3[A032];
            f2 = ((fArr3[A032 + 1] - f10) * (A01 - A032)) + f10;
            float A012 = C17s.A01(1.0f) * f9;
            int A033 = C17s.A03((int) A012, 0, i2);
            int i3 = A033 + 1;
            float f11 = A012 - A033;
            float f12 = fArr3[A033];
            f3 = ((fArr3[i3] - f12) * f11) + f12;
        }
        C69627VsU c69627VsU = c69465Vno.A0E;
        C14360o3.A07(c66340UAd.getResources());
        c69627VsU.A05 = AbstractC69815Vw1.A01(r2, pointF.x);
        c69627VsU.A06 = AbstractC69815Vw1.A01(r2, pointF.y);
        c69627VsU.A02 = c69465Vno.A00 + (f2 - f3);
        float f13 = f * c69465Vno.A01;
        c69627VsU.A03 = f13;
        c69627VsU.A04 = f13;
        c66340UAd.invalidate();
    }

    public static final void A03(C69465Vno c69465Vno, C66340UAd c66340UAd, long j) {
        U9E u9e = c66340UAd.A03;
        u9e.removeMessages(2, c69465Vno);
        u9e.removeMessages(1, c69465Vno);
        u9e.sendMessageDelayed(Message.obtain(u9e, 2, 0, 0, c69465Vno), j);
    }

    public static final void A04(C69465Vno c69465Vno, C66340UAd c66340UAd, VaZ vaZ) {
        U9E u9e = c66340UAd.A03;
        u9e.removeMessages(1, c69465Vno);
        c69465Vno.A09 = vaZ;
        u9e.sendMessageDelayed(Message.obtain(u9e, 1, 0, 0, c69465Vno), c69465Vno.A05);
    }

    public final void A05(Path path, float f, float f2, int i, long j, boolean z) {
        Drawable drawable = getContext().getDrawable(R.drawable.ig_msgr_power_ups_heart);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.setCallback(this);
            C69054Vgv c69054Vgv = new C69054Vgv(path);
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(A00("x"), A00("y"));
            AbstractC43593JPy.A18(ofPropertyValuesHolder);
            ofPropertyValuesHolder.setDuration(8000L);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.setRepeatCount(-1);
            C69465Vno c69465Vno = new C69465Vno(ofPropertyValuesHolder, drawable, c69054Vgv, f2, f, i, j, z);
            c69465Vno.A0D.addUpdateListener(new WH6(0, drawable, this, c69465Vno));
            A02(c69465Vno, this, 0.0f);
            A01(c69465Vno);
            this.A05.add(c69465Vno);
            invalidate();
            if (this.A07.A01) {
                A03(c69465Vno, this, 0L);
                return;
            } else {
                this.A02 = true;
                return;
            }
        }
        throw new RuntimeException("Could not load heart drawable.");
    }

    public final String getTargetId() {
        return this.A01;
    }

    public static final PropertyValuesHolder A00(String str) {
        double d;
        double d2;
        double random = Math.random() * 256.0d;
        Keyframe[] keyframeArr = new Keyframe[9];
        int i = 0;
        do {
            float f = i / 9.0f;
            double d3 = (2.0f * f) + random;
            double d4 = (d3 + random) * 0.36602540380000004d;
            double d5 = d3 + d4;
            int i2 = (int) d5;
            if (d5 < i2) {
                i2--;
            }
            double d6 = random + d4;
            int i3 = (int) d6;
            if (d6 < i3) {
                i3--;
            }
            double d7 = (i2 + i3) * 0.21132486539999998d;
            double d8 = d3 - (i2 - d7);
            double d9 = random - (i3 - d7);
            int i4 = 0;
            int i5 = 1;
            if (d8 > d9) {
                i4 = 1;
                i5 = 0;
            }
            double d10 = (d8 - i4) + 0.21132486539999998d;
            double d11 = 0.21132486539999998d + (d9 - i5);
            double d12 = (d8 - 1.0d) + 0.42264973079999996d;
            double d13 = (d9 - 1.0d) + 0.42264973079999996d;
            int i6 = i2 & 255;
            int i7 = i3 & 255;
            short[] sArr = VZX.A02;
            short[] sArr2 = VZX.A01;
            short s = sArr[sArr2[i7] + i6];
            short s2 = sArr[i4 + i6 + sArr2[i5 + i7]];
            short s3 = sArr[i6 + 1 + sArr2[i7 + 1]];
            double d14 = (0.5d - (d8 * d8)) - (d9 * d9);
            double d15 = 0.0d;
            if (d14 < 0.0d) {
                d = 0.0d;
            } else {
                double d16 = d14 * d14;
                W1k w1k = VZX.A00[s];
                d = d16 * d16 * ((w1k.A00 * d8) + (w1k.A01 * d9));
            }
            double d17 = (0.5d - (d10 * d10)) - (d11 * d11);
            if (d17 < 0.0d) {
                d2 = 0.0d;
            } else {
                double d18 = d17 * d17;
                W1k w1k2 = VZX.A00[s2];
                d2 = d18 * d18 * ((w1k2.A00 * d10) + (w1k2.A01 * d11));
            }
            double d19 = (0.5d - (d12 * d12)) - (d13 * d13);
            if (d19 >= 0.0d) {
                double d20 = d19 * d19;
                W1k w1k3 = VZX.A00[s3];
                d15 = d20 * d20 * ((w1k3.A00 * d12) + (w1k3.A01 * d13));
            }
            Keyframe ofFloat = Keyframe.ofFloat(f, (float) ((d + d2 + d15) * 70.0d));
            C14360o3.A07(ofFloat);
            keyframeArr[i] = ofFloat;
            i++;
        } while (i < 9);
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(str, (Keyframe[]) Arrays.copyOf(keyframeArr, 9));
        C14360o3.A07(ofKeyframe);
        return ofKeyframe;
    }

    public final void A06(VaZ vaZ) {
        ValueAnimator valueAnimator;
        if (getWindowToken() == null) {
            this.A00 = vaZ;
            return;
        }
        U9E u9e = this.A03;
        u9e.removeMessages(1);
        for (C69465Vno c69465Vno : this.A05) {
            if (!c69465Vno.A0B) {
                if (!u9e.hasMessages(2, c69465Vno) && (valueAnimator = c69465Vno.A06) != null && !valueAnimator.isRunning()) {
                    A04(c69465Vno, this, vaZ);
                } else {
                    c69465Vno.A09 = vaZ;
                }
            }
        }
    }

    public final boolean getCanReleaseHearts() {
        if (getWindowToken() != null) {
            U9E u9e = this.A03;
            if (!u9e.hasMessages(1) && !u9e.hasMessages(2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-621448613);
        super.onAttachedToWindow();
        U9E u9e = this.A03;
        u9e.A01 = this;
        Message message = u9e.A00;
        if (message != null) {
            u9e.handleMessage(message);
        }
        C0f9.A0D(-1855042483, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-400503078);
        super.onDetachedFromWindow();
        this.A03.A01 = null;
        C0f9.A0D(1145748163, A06);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            A01((C69465Vno) it.next());
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        int A06 = C0f9.A06(1274900244);
        super.onWindowVisibilityChanged(i);
        W2X w2x = this.A07;
        w2x.A00 = i;
        W2X.A00(w2x);
        C0f9.A0D(-43385045, A06);
    }
}
