package X;

import android.view.View;

/* renamed from: X.LRd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48103LRd implements C07X, InterfaceC62892tS {
    public final C0eR A00;
    public final int A01;
    public final InterfaceC147266kB A02;

    @Override // X.InterfaceC62892tS
    public final boolean CtU() {
        return true;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
        C14360o3.A0B(c3vz, 2);
        if (c3vz == C3VZ.A02) {
            C0eR c0eR = this.A00;
            if (c0eR.A07().A00(C07S.RESUMED)) {
                c0eR.A0B(C07R.ON_PAUSE);
            }
        }
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void E0r(View view) {
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        if (i2 == this.A01) {
            ((C147256kA) this.A02).A04.A0Q(this);
            this.A00.A0B(C07R.ON_STOP);
        }
    }

    @Override // X.C07X
    public final C07T getLifecycle() {
        return this.A00;
    }

    public C48103LRd(C07X c07x, InterfaceC147266kB interfaceC147266kB, int i) {
        this.A02 = interfaceC147266kB;
        this.A01 = i;
        C0eR c0eR = new C0eR(c07x);
        this.A00 = c0eR;
        c0eR.A0B(C07R.ON_CREATE);
        c0eR.A0B(C07R.ON_START);
        c0eR.A0B(C07R.ON_RESUME);
        interfaceC147266kB.A95(this);
        c07x.getLifecycle().A09(new C50623MWk(this, 6));
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
        C0eR c0eR;
        C07R c07r;
        AbstractC167017dG.A1N(c3vz, c3vz2);
        if (c3vz == C3VZ.A02 && c3vz2 == C3VZ.A03) {
            c0eR = this.A00;
            c07r = C07R.ON_PAUSE;
        } else {
            if (c3vz != C3VZ.A03 || c3vz2 != C3VZ.A04) {
                return;
            }
            c0eR = this.A00;
            c07r = C07R.ON_RESUME;
        }
        c0eR.A0B(c07r);
    }
}
