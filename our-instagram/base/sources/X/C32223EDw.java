package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EDw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32223EDw extends AnonymousClass935 {
    public final /* synthetic */ FHG A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32223EDw(UserSession userSession, FHG fhg, String str) {
        super(userSession);
        this.A01 = str;
        this.A00 = fhg;
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03 = C0f9.A03(-1729131106);
        C36006Fv4 c36006Fv4 = this.A00.A00;
        c36006Fv4.A09.hide();
        C9GR.A0D(c36006Fv4.A01, "direct_whitelist_failed");
        C0f9.A0A(-1607821000, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(1789408115);
        int A032 = C0f9.A03(-1639455342);
        C14360o3.A0B(userSession, 0);
        C18A A00 = AnonymousClass189.A00(userSession);
        User A02 = A00.A02(this.A01);
        if (A02 != null) {
            A02.A03.EZn(false);
            A00.A01(A02, false, false);
        }
        this.A00.A00.A09.hide();
        C0f9.A0A(-378152730, A032);
        C0f9.A0A(1029112287, A03);
    }
}
