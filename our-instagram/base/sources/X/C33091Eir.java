package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Eir, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33091Eir extends C4A7 {
    public final UserSession A00;
    public final InterfaceC24731Iq A01;
    public final InterfaceC19390xP A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33091Eir(UserSession userSession) {
        super("Direct", C4A8.A00(1695661322));
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A01 = c24721Ip;
        this.A02 = AbstractC07080Za.A03(c24721Ip);
    }

    public final void A01(String str, boolean z, String str2) {
        C14360o3.A0B(str, 0);
        AbstractC166987dD.A1Z(new C50114MAn(this, str2, str, null, 1, z), super.A01);
    }

    public final InterfaceC19390xP A00(C50679MYx c50679MYx, C50679MYx c50679MYx2, C50679MYx c50679MYx3, String str) {
        C25621Ms A0M;
        String str2;
        C1ON A0A;
        if (c50679MYx2 != null) {
            UserSession userSession = this.A00;
            String str3 = c50679MYx2.A00;
            A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0B("direct_v2/join_thread_via_story_join_chat/");
            A0M.A9s("story_id", str3);
        } else {
            if (str != null) {
                A0M = AbstractC31173DnH.A0M(this.A00);
                A0M.A0B("direct_v2/join_thread_via_note_chat/");
                str2 = "note_id";
            } else {
                if (c50679MYx != null) {
                    A0A = AbstractC47995LLh.A0A(this.A00, c50679MYx.A00, c50679MYx.A01);
                    return A0A.A03(1695661322);
                }
                if (c50679MYx3 != null) {
                    UserSession userSession2 = this.A00;
                    String str4 = c50679MYx3.A01;
                    str = c50679MYx3.A00;
                    A0M = AbstractC31173DnH.A0M(userSession2);
                    AbstractC31173DnH.A1P(A0M, "direct_v2/join_pinned_subscriber_social_channel/", str4);
                    str2 = "fan_club_id";
                } else {
                    return null;
                }
            }
            A0M.A9s(str2, str);
        }
        A0A = AbstractC31172DnG.A0S(A0M, EBV.class, C34795FUx.class);
        return A0A.A03(1695661322);
    }
}
