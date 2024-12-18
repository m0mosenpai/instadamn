package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hc4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39478Hc4 extends AbstractC42195Imh {
    public final String A00;
    public final String A01;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        return C41713Idj.A01(userSession, "clips/mixed_media_only/", null, AbstractC42195Imh.A01(this, userSession), A02(), this.A00);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        return C41713Idj.A01(userSession, "clips/mixed_media_only/", str, AbstractC42195Imh.A01(this, userSession), A02(), this.A00);
    }

    @Override // X.C5R4
    public final String BfW() {
        return this.A01;
    }

    public C39478Hc4(UserSession userSession, C5Qu c5Qu, C37671Gi4 c37671Gi4, String str) {
        super(c5Qu, c37671Gi4);
        this.A00 = str;
        this.A01 = AnonymousClass001.A0R("clips/mixed_media_only/", userSession.userId);
    }
}
