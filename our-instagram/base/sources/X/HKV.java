package X;

/* loaded from: classes7.dex */
public final class HKV extends AbstractC127945qN implements InterfaceC127965qP, InterfaceC127985qR {
    public long A00;
    public C38321qM A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    @Override // X.AbstractC127945qN
    public final long A00() {
        EnumC130515uw enumC130515uw;
        if (this.A02 == C05F.A01) {
            enumC130515uw = EnumC130515uw.A06;
        } else {
            enumC130515uw = EnumC130515uw.A0D;
        }
        return enumC130515uw.A00;
    }

    @Override // X.InterfaceC127975qQ
    public final C38321qM BQN() {
        return this.A01;
    }

    @Override // X.InterfaceC127985qR
    public final long Bb4() {
        return this.A00;
    }

    @Override // X.InterfaceC127965qP
    public final boolean CQJ() {
        return this.A06;
    }

    public HKV(C127915qK c127915qK, C130505uv c130505uv, C38321qM c38321qM, Integer num, String str, String str2, String str3, boolean z) {
        super(c127915qK, c130505uv, str);
        this.A03 = str;
        this.A01 = c38321qM;
        this.A02 = num;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = z;
        this.A00 = -1L;
    }

    @Override // X.InterfaceC127965qP
    public final String getId() {
        return getKey();
    }

    @Override // X.InterfaceC127985qR
    public final void EaT(long j) {
        this.A00 = j;
    }
}
