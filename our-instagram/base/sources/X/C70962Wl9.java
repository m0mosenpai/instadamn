package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Wl9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70962Wl9 implements XDP {
    public final /* synthetic */ V1D A00;

    @Override // X.XDP
    public final void Ddz() {
    }

    public C70962Wl9(V1D v1d) {
        this.A00 = v1d;
    }

    @Override // X.XDP
    public final void Ddh(Reel reel) {
        V1D v1d = this.A00;
        C69366VmC c69366VmC = v1d.A04;
        v1d.A04 = new C69366VmC(reel.A07(), reel, c69366VmC.A05, c69366VmC.A02, c69366VmC.A03, c69366VmC.A04);
        V1D.A00(v1d);
    }

    @Override // X.XDP
    public final void Ddj(C38321qM c38321qM) {
        V1D v1d = this.A00;
        C69366VmC c69366VmC = v1d.A04;
        v1d.A04 = new C69366VmC(c38321qM.A1S(), c69366VmC.A01, c69366VmC.A05, c69366VmC.A02, c69366VmC.A03, c69366VmC.A04);
        V1D.A00(v1d);
    }
}
