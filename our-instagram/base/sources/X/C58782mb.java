package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: X.2mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58782mb implements InterfaceC58682mR {
    public int A04 = 0;
    public int A05 = Integer.MIN_VALUE;
    public float A02 = 0.0f;
    public float A01 = Float.MIN_VALUE;
    public float A03 = Float.MIN_VALUE;
    public float A00 = Float.MIN_VALUE;
    public java.util.Set A08 = null;
    public java.util.Set A09 = null;
    public String A07 = null;
    public TimeInterpolator A06 = null;
    public boolean A0A = false;
    public boolean A0B = false;

    @Override // X.InterfaceC58682mR
    public final void APX() {
        this.A0B = true;
    }

    @Override // X.InterfaceC58682mR
    public final float Aze() {
        return 0.0f;
    }

    @Override // X.InterfaceC58682mR
    public final C27859CPw CN4(String[] strArr, float f, float f2) {
        return null;
    }

    @Override // X.InterfaceC58682mR
    public final void E4S() {
        this.A04 = 3;
    }

    @Override // X.InterfaceC58682mR
    public final boolean isFinished() {
        return false;
    }

    @Override // X.InterfaceC58682mR
    public final void pause() {
        this.A04 = 2;
    }

    @Override // X.InterfaceC58682mR
    public final void stop() {
        this.A04 = 1;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR A8x(Animator.AnimatorListener animatorListener) {
        java.util.Set set = this.A08;
        if (set == null) {
            set = new C012504o(0);
            this.A08 = set;
        }
        set.add(animatorListener);
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR AAi(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        java.util.Set set = this.A09;
        if (set == null) {
            set = new C012504o(0);
            this.A09 = set;
        }
        set.add(animatorUpdateListener);
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final float BiI() {
        return this.A02;
    }

    @Override // X.InterfaceC58682mR
    public final int Bmx() {
        return this.A05;
    }

    @Override // X.InterfaceC58682mR
    public final void EEv() {
        java.util.Set set = this.A08;
        if (set == null) {
            set = new C012504o(0);
            this.A08 = set;
        }
        set.clear();
    }

    @Override // X.InterfaceC58682mR
    public final void EFV(Animator.AnimatorListener animatorListener) {
        java.util.Set set = this.A08;
        if (set == null) {
            set = new C012504o(0);
            this.A08 = set;
        }
        set.remove(animatorListener);
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR FEB(float f, float f2) {
        this.A03 = f;
        this.A00 = f2;
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final boolean isPlaying() {
        if (this.A04 != 3) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EH1() {
        this.A05 = Integer.MAX_VALUE;
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR ABF(boolean z) {
        this.A0A = z;
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final void ABL(float f) {
        this.A01 = f;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR AWO(String str) {
        this.A07 = str;
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EH0(int i) {
        this.A05 = i;
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EMk(float f) {
        this.A02 = f;
        return this;
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EWJ(TimeInterpolator timeInterpolator) {
        this.A06 = timeInterpolator;
        return this;
    }
}
