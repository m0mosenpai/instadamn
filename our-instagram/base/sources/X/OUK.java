package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OUK {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final InterfaceC09390do A05;

    public OUK(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        AbstractC167027dH.A0a(1, userSession, interfaceC11380iw, str, str2);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A05 = AbstractC09440dt.A01(C57541PgF.A01(this, 1));
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, OUK ouk, Long l) {
        interfaceC02590Ai.A9K("upcoming_event_id", l);
        interfaceC02590Ai.AAP("creation_session_id", ouk.A02);
        interfaceC02590Ai.AAP("upcoming_event_type", "scheduled_live");
        interfaceC02590Ai.Cht();
    }
}
