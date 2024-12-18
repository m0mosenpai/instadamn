package X;

import com.instagram.api.schemas.EarnedOnMediaState;

/* renamed from: X.Cvg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29285Cvg implements GZ7 {
    public final /* synthetic */ EarnedOnMediaState A00;
    public final /* synthetic */ C25871BcS A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C25871BcS c25871BcS = this.A01;
        AbstractC166987dD.A1Z(new C50125MBz(c25871BcS, c38321qM, this.A04, this.A02, null, 8), AbstractC141776au.A00(c25871BcS));
    }

    public C29285Cvg(EarnedOnMediaState earnedOnMediaState, C25871BcS c25871BcS, String str, String str2, String str3) {
        this.A01 = c25871BcS;
        this.A02 = str;
        this.A04 = str2;
        this.A00 = earnedOnMediaState;
        this.A03 = str3;
    }

    @Override // X.GZ7
    public final void onFail(String str) {
        String str2;
        if (this.A00 == EarnedOnMediaState.A05) {
            str2 = this.A03;
        } else {
            str2 = null;
        }
        C25871BcS c25871BcS = this.A01;
        AbstractC166987dD.A1Z(new PYc(c25871BcS, str2, null, 8), AbstractC141776au.A00(c25871BcS));
    }
}
