package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HcA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39482HcA extends AbstractC42195Imh {
    public final Integer A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final InterfaceC116925Qy A05;
    public final String A06;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        String A01 = AbstractC42195Imh.A01(this, userSession);
        String A02 = A02();
        String str = this.A04;
        String str2 = this.A03;
        return C41713Idj.A00(userSession, this.A00, this.A01, "clips/media_notes/", null, A01, A02, str, this.A02, str2);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        String str2;
        C14360o3.A0B(userSession, 0);
        C37787Gk2 c37787Gk2 = C37787Gk2.A01;
        String str3 = this.A04;
        InterfaceC116925Qy interfaceC116925Qy = this.A05;
        C37671Gi4 c37671Gi4 = super.A01;
        if (c37671Gi4 != null) {
            str2 = c37671Gi4.A01();
        } else {
            str2 = null;
        }
        return c37787Gk2.A08(null, null, interfaceC116925Qy, userSession, null, null, null, null, str, str2, A02(), str3, null, null, null, null, null, -1.0d, false, false, false, false, false);
    }

    @Override // X.C5R4
    public final String BfW() {
        return this.A06;
    }

    public C39482HcA(InterfaceC116925Qy interfaceC116925Qy, UserSession userSession, C5Qu c5Qu, C37671Gi4 c37671Gi4, Integer num, Long l, String str, String str2, String str3) {
        super(c5Qu, c37671Gi4);
        this.A05 = interfaceC116925Qy;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = num;
        this.A01 = l;
        this.A06 = AnonymousClass001.A0R("clips/media_notes/", userSession.userId);
    }
}
