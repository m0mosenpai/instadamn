package X;

/* renamed from: X.KYd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46015KYd extends OKu implements InterfaceC66482zP {
    public final int A00;
    public final C56389P2a A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.OKu
    public final boolean A01() {
        return this.A02;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return super.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C46015KYd c46015KYd = (C46015KYd) obj;
        C14360o3.A0B(c46015KYd, 0);
        if (C14360o3.A0K(((OKu) c46015KYd).A00.getId(), super.A00.getId()) && c46015KYd.A00 == this.A00 && c46015KYd.A03 == this.A03) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46015KYd(C38321qM c38321qM, C56389P2a c56389P2a, String str, int i, boolean z, boolean z2, boolean z3) {
        super(c38321qM, str, AnonymousClass001.A0i("media_", str, c38321qM.A38(), '_'));
        AbstractC167017dG.A1P(str, c38321qM);
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
        this.A01 = c56389P2a;
    }
}
