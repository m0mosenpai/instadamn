package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class P2Q implements InterfaceC38371qR, C1NI {
    public OUJ A00 = null;
    public final ImageUrl A01;
    public final C38321qM A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public P2Q(ImageUrl imageUrl, C38321qM c38321qM, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = imageUrl;
        this.A02 = c38321qM;
        this.A07 = str4;
        this.A03 = str5;
        this.A08 = str6;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return false;
    }

    @Override // X.InterfaceC38371qR, X.C1NI
    public final boolean CdW() {
        return true;
    }

    @Override // X.InterfaceC38371qR
    public final C38321qM BQN() {
        return this.A02;
    }

    @Override // X.InterfaceC38371qR, X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A03;
    }

    @Override // X.InterfaceC38371qR, X.C1NI
    public final String BzL(UserSession userSession) {
        return this.A08;
    }
}
