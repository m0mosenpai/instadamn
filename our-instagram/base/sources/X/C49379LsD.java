package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LsD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49379LsD implements C1NI, JPW {
    public final int A00;
    public final long A01;
    public final long A02;
    public final ImageUrl A03;
    public final C38321qM A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    @Override // X.JPW
    public final C105824pt AiE() {
        return null;
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return this.A04.A33();
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return this.A04.CW9();
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return this.A04.CZq();
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return this.A04.CdW();
    }

    @Override // X.JPW
    public final String An2() {
        return this.A08;
    }

    @Override // X.JPW
    public final C38321qM BQN() {
        return this.A04;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String id = this.A04.getId();
        if (id != null) {
            return id;
        }
        throw AbstractC166997dE.A0g();
    }

    public C49379LsD(ImageUrl imageUrl, C38321qM c38321qM, String str, String str2, String str3, String str4, int i, long j, long j2) {
        this.A08 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = imageUrl;
        this.A05 = str4;
        this.A02 = j;
        this.A00 = i;
        this.A01 = j2;
        this.A04 = c38321qM;
    }
}
