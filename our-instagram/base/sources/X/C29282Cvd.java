package X;

/* renamed from: X.Cvd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29282Cvd implements GZ7 {
    public final /* synthetic */ C25871BcS A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C25871BcS c25871BcS = this.A00;
        C141796aw A00 = AbstractC141776au.A00(c25871BcS);
        String str = this.A03;
        AbstractC166987dD.A1Z(new D50(c25871BcS, c38321qM, this.A01, this.A02, str, null, 3), A00);
    }

    @Override // X.GZ7
    public final void onFail(String str) {
    }

    public C29282Cvd(C25871BcS c25871BcS, String str, String str2, String str3) {
        this.A00 = c25871BcS;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
