package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.693, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass693 extends Drawable implements InterfaceC58682mR, ValueAnimator.AnimatorUpdateListener {
    public AbstractC56582ir A01;
    public C56682j1 A02;
    public AnonymousClass696 A03;
    public C56712j4 A07;
    public boolean A08 = false;
    public int A06 = 255;
    public int A00 = 0;
    public boolean A04 = false;
    public float A05 = 0.0f;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.CPw] */
    @Override // X.InterfaceC58682mR
    public final C27859CPw CN4(String[] strArr, float f, float f2) {
        List list;
        for (String str : strArr) {
            Map map = this.A02.A0F;
            if (map != null && (list = (List) map.get(str)) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    RectF rectF = ((AbstractC56722j5) it.next()).A0A;
                    if (rectF.contains(f, f2)) {
                        ?? obj = new Object();
                        obj.A00 = rectF;
                        obj.A01 = str;
                        return obj;
                    }
                }
            }
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private void A00() {
        float f = this.A03.A03;
        this.A05 = f;
        C56712j4 c56712j4 = this.A07;
        c56712j4.A0D(null, f, this.A06);
        c56712j4.A06();
        invalidateSelf();
    }

    public final void A01(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            A00();
        }
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR A8x(Animator.AnimatorListener animatorListener) {
        this.A03.addListener(animatorListener);
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR AAi(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A03.addUpdateListener(animatorUpdateListener);
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR ABF(boolean z) {
        this.A02.A06 = z;
        this.A07.A00 = null;
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final void ABL(float f) {
        Float f2;
        float floatValue;
        AnonymousClass696 anonymousClass696 = this.A03;
        if (f > 0.0f && f < 60.0f) {
            anonymousClass696.A0B = true;
            float f3 = 1.0E9f / f;
            anonymousClass696.A02 = f3;
            f2 = Float.valueOf(f3);
        } else {
            anonymousClass696.A0B = false;
            f2 = null;
        }
        C56702j3 c56702j3 = this.A02.A04;
        if (f2 == null) {
            floatValue = 1.6666667E7f;
        } else {
            floatValue = f2.floatValue();
        }
        c56702j3.A00 = floatValue;
    }

    @Override // X.InterfaceC58682mR
    public final void APX() {
        this.A03.A0C = false;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR AWO(String str) {
        AnonymousClass692[] anonymousClass692Arr = this.A02.A0E.A04;
        if (anonymousClass692Arr != null) {
            for (AnonymousClass692 anonymousClass692 : anonymousClass692Arr) {
                if (str.equals(anonymousClass692.A02)) {
                    AnonymousClass696 anonymousClass696 = this.A03;
                    anonymousClass696.A00(anonymousClass692.A01, anonymousClass692.A00);
                    EMk(anonymousClass696.A03);
                    return this;
                }
            }
        }
        throw new Exception("Specified marker does not exist");
    }

    @Override // X.InterfaceC58682mR
    public final float Aze() {
        AbstractC56582ir abstractC56582ir = this.A01;
        return abstractC56582ir.A04[abstractC56582ir.A00].A00;
    }

    @Override // X.InterfaceC58682mR
    public final float BiI() {
        return this.A03.A03;
    }

    @Override // X.InterfaceC58682mR
    public final int Bmx() {
        return this.A03.A08;
    }

    @Override // X.InterfaceC58682mR
    public final void E4S() {
        this.A03.start();
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // X.InterfaceC58682mR
    public final void EEv() {
        this.A03.removeAllListeners();
    }

    @Override // X.InterfaceC58682mR
    public final void EFV(Animator.AnimatorListener animatorListener) {
        this.A03.removeListener(animatorListener);
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EH0(int i) {
        this.A03.setRepeatCount(i);
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EMk(float f) {
        float max;
        AnonymousClass696 anonymousClass696 = this.A03;
        float f2 = anonymousClass696.A00;
        float f3 = anonymousClass696.A07;
        if (f2 < f3) {
            max = Math.min(f3, Math.max(f2, f));
        } else {
            max = Math.max(f3, Math.min(f2, f));
        }
        anonymousClass696.setCurrentFraction(max);
        A00();
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EWJ(TimeInterpolator timeInterpolator) {
        this.A03.setInterpolator(timeInterpolator);
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR FEB(float f, float f2) {
        AnonymousClass696 anonymousClass696 = this.A03;
        anonymousClass696.A00(f, f2);
        EMk(anonymousClass696.A03);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = false;
        if (this.A04) {
            E4S();
        } else {
            this.A00 = 0;
        }
        if (canvas != null) {
            if (getBounds().left != 0 || getBounds().top != 0) {
                z = true;
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
            }
            this.A07.A0B(canvas, this.A05);
            if (z) {
                canvas.restore();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.A02.A0E.A03.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.A02.A0E.A03.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int i = this.A06;
        if (i >= 255) {
            return -1;
        }
        if (i > 0) {
            return -3;
        }
        return -2;
    }

    @Override // X.InterfaceC58682mR
    public final boolean isFinished() {
        if (this.A03.A08 != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58682mR
    public final boolean isPlaying() {
        return this.A03.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A08) {
            int i = this.A00;
            if (i >= 5) {
                this.A03.pause();
                this.A04 = true;
                return;
            }
            this.A00 = i + 1;
            A00();
            C56702j3 c56702j3 = this.A02.A04;
            long j = this.A03.A09;
            if (!c56702j3.A08) {
                return;
            }
            if (c56702j3.A06 == 0) {
                c56702j3.A05 = j;
                c56702j3.A06 = j;
            }
            c56702j3.A03++;
            int max = Math.max(Math.round(((float) (j - c56702j3.A05)) / c56702j3.A00) - 1, 0);
            if (max >= 8) {
                c56702j3.A01++;
            } else if (max >= 4) {
                c56702j3.A02++;
            } else if (max >= 2) {
                c56702j3.A07++;
            } else if (max == 1) {
                c56702j3.A04++;
            }
            Iterator it = c56702j3.A0A.iterator();
            if (it.hasNext()) {
                it.next();
                c56702j3.A09.size();
                throw new NullPointerException("onFrameRendered");
            }
            c56702j3.A05 = j;
            c56702j3.A09.clear();
        }
    }

    @Override // X.InterfaceC58682mR
    public final void pause() {
        this.A03.pause();
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // X.InterfaceC58682mR
    public final void stop() {
        this.A03.end();
        this.A00 = 0;
        this.A04 = false;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.695, java.lang.Object] */
    public AnonymousClass693(AbstractC56582ir abstractC56582ir) {
        int i;
        this.A01 = abstractC56582ir;
        byte[] bArr = abstractC56582ir.A03;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            if (i2 >= 0 && i3 >= 0 && i3 <= 255) {
                if (i3 != 0) {
                    if (AnonymousClass694.A00 == null) {
                        AnonymousClass694.A00 = new Object();
                    }
                    switch (i2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        case 14:
                        case 17:
                        case 18:
                        case Process.SIGSTOP /* 19 */:
                        case 20:
                        case 21:
                            i = 1;
                            break;
                        case 4:
                        case Process.SIGTERM /* 15 */:
                            i = 2;
                            break;
                    }
                    if (i3 <= i) {
                    }
                }
            }
            throw new Exception(AnonymousClass001.A0n("capability ", " version ", " is unsupported", i2, i3));
        }
        C56682j1 c56682j1 = new C56682j1(abstractC56582ir);
        this.A02 = c56682j1;
        this.A07 = C56712j4.A00(c56682j1.A0E, c56682j1);
        AnonymousClass696 anonymousClass696 = new AnonymousClass696(this.A02);
        this.A03 = anonymousClass696;
        anonymousClass696.addUpdateListener(this);
        this.A03.A0C = true;
        EMk(0.0f);
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EH1() {
        EH0(Integer.MAX_VALUE);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        C56682j1 c56682j1 = this.A02;
        c56682j1.A0C.set(i, i2, i3, i4);
        float width = getBounds().width();
        AbstractC56652iy abstractC56652iy = c56682j1.A0E;
        float min = Math.min(width / abstractC56652iy.A03.A01, getBounds().height() / abstractC56652iy.A03.A00);
        this.A08 = true;
        if (c56682j1.A00 != min) {
            c56682j1.A00 = min;
            this.A07.A07();
            EMk(this.A03.A03);
        }
    }
}
