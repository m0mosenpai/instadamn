package X;

import android.view.Surface;

/* loaded from: classes12.dex */
public final class YFi implements YQR {
    public C72740XmC A00;
    public final YQG A01;

    public YFi(YQG yqg) {
        C14360o3.A0B(yqg, 1);
        this.A01 = yqg;
        ((YCI) yqg).A02 = new C72691XlK(this);
    }

    @Override // X.YQR
    public final int C4O() {
        return ((YCI) this.A01).A00;
    }

    @Override // X.YQR
    public final int C4S() {
        return ((YCI) this.A01).A01;
    }

    @Override // X.YQR
    public final boolean Ca8() {
        return ((YCI) this.A01).A06;
    }

    @Override // X.YQR
    public final void Ecc(long j) {
        ((YCI) this.A01).A03.set(j);
    }

    @Override // X.YQR
    public final Surface getSurface() {
        return ((YCI) this.A01).A05;
    }

    @Override // X.YQR
    public final void EYM(C72740XmC c72740XmC) {
        this.A00 = c72740XmC;
    }
}
