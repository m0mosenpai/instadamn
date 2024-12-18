package X;

import java.util.Map;

/* renamed from: X.PHy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56781PHy implements XDS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C51371MmW A01;
    public final /* synthetic */ C51141Mik A02;
    public final /* synthetic */ C51631MrO A03;

    public C56781PHy(C51371MmW c51371MmW, C51141Mik c51141Mik, C51631MrO c51631MrO, int i) {
        this.A02 = c51141Mik;
        this.A00 = i;
        this.A01 = c51371MmW;
        this.A03 = c51631MrO;
    }

    @Override // X.XDS
    public final void DC5() {
        C51371MmW c51371MmW = this.A01;
        float f = c51371MmW.A01;
        C51631MrO c51631MrO = this.A03;
        O2A o2a = c51631MrO.A03;
        C51371MmW.A03(c51371MmW, o2a, f);
        c51371MmW.A0B.A01(o2a, c51631MrO.A04, c51631MrO.A05, c51631MrO.A07, c51371MmW.A01);
        C51141Mik c51141Mik = this.A02;
        Map map = c51141Mik.A06;
        int i = this.A00;
        AbstractC43592JPx.A1W(Integer.valueOf(i), map, false);
        ((C51631MrO) c51141Mik.A00.get(i)).A00 = c51371MmW.A01;
    }

    @Override // X.XDS
    public final void DCA() {
        AbstractC43592JPx.A1W(Integer.valueOf(this.A00), this.A02.A06, true);
    }

    @Override // X.XDS
    public final void Dbr(int i) {
        if (AbstractC31177DnL.A1b(AbstractC166997dE.A0m(this.A02.A06, this.A00))) {
            C51371MmW c51371MmW = this.A01;
            float f = i / 100.0f;
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            c51371MmW.A01 = f;
            MSX.A15(c51371MmW.A09, AbstractC166987dD.A0B(f, 100.0f));
            OKE oke = c51371MmW.A0B;
            float f2 = c51371MmW.A01;
            C51631MrO c51631MrO = this.A03;
            oke.A00(c51631MrO.A03, c51631MrO.A08, f2);
            C51371MmW.A02(c51371MmW, i);
        }
    }
}
