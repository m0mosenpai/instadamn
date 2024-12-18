package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HcB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39483HcB extends AbstractC42195Imh {
    public final UserSession A00;
    public final C5Qu A01;
    public final C37671Gi4 A02;
    public final String A03;
    public final String A04;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        return A00(this, null);
    }

    public static final C1ON A00(C39483HcB c39483HcB, String str) {
        String str2;
        UserSession userSession = c39483HcB.A00;
        C37671Gi4 c37671Gi4 = ((AbstractC42195Imh) c39483HcB).A01;
        if (c37671Gi4 != null) {
            str2 = c37671Gi4.A01();
        } else {
            str2 = null;
        }
        return C41713Idj.A01(userSession, "clips/connected/", str, str2, c39483HcB.A02(), c39483HcB.A03);
    }

    @Override // X.C5R4
    public final String BfW() {
        return this.A04;
    }

    public C39483HcB(UserSession userSession, C5Qu c5Qu, C37671Gi4 c37671Gi4, String str) {
        super(c5Qu, c37671Gi4);
        this.A00 = userSession;
        this.A02 = c37671Gi4;
        this.A01 = c5Qu;
        this.A03 = str;
        this.A04 = AnonymousClass001.A0R("clips/connected/", userSession.userId);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        return A00(this, str);
    }
}
