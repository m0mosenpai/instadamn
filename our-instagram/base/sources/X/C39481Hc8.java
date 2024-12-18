package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hc8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39481Hc8 extends AbstractC42195Imh {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        return C41713Idj.A00(userSession, null, AbstractC167007dF.A0d(), "clips/connected/", null, AbstractC42195Imh.A01(this, userSession), A02(), this.A00, this.A01, null);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        return C41713Idj.A01(userSession, "clips/connected/", str, AbstractC42195Imh.A01(this, userSession), A02(), this.A00);
    }

    @Override // X.C5R4
    public final String BfW() {
        return this.A02;
    }

    public C39481Hc8(UserSession userSession, C5Qu c5Qu, C37671Gi4 c37671Gi4, String str, String str2) {
        super(c5Qu, c37671Gi4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = AnonymousClass001.A0R("clips/connected/", userSession.userId);
    }
}
