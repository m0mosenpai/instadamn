package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class Hc9 extends AbstractC42195Imh {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        String A01 = AbstractC42195Imh.A01(this, userSession);
        String A02 = A02();
        String str = this.A03;
        String str2 = this.A02;
        return C41713Idj.A00(userSession, null, this.A00, "clips/media_notes/", null, A01, A02, str, this.A01, str2);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        String A01 = AbstractC42195Imh.A01(this, userSession);
        String A02 = A02();
        String str2 = this.A03;
        String str3 = this.A02;
        return C41713Idj.A00(userSession, null, this.A00, "clips/media_notes/", str, A01, A02, str2, this.A01, str3);
    }

    @Override // X.C5R4
    public final String BfW() {
        return this.A04;
    }

    public Hc9(UserSession userSession, C5Qu c5Qu, C37671Gi4 c37671Gi4, Long l, String str, String str2, String str3) {
        super(c5Qu, c37671Gi4);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = l;
        this.A04 = AnonymousClass001.A0R("clips/media_notes/", userSession.userId);
    }
}
