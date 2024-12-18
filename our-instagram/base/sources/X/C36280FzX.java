package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FzX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36280FzX implements InterfaceC13000lm {
    public final UserSession A00;
    public final boolean A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
    }

    public final void A00(int i, int i2, int i3, long j) {
        String str;
        long j2;
        long j3;
        if (this.A01 && i == 0) {
            C36303Fzy A00 = C36303Fzy.A00(this.A00);
            C14360o3.A07(A00);
            C34721FRi c34721FRi = A00.A01;
            if (c34721FRi != null && (str = c34721FRi.A07) != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34721FRi.A0E, "igd_search_latency");
                if (A0f.isSampled()) {
                    AbstractC166997dE.A1N(A0f, "search_surface", 0);
                    if (AbstractC13670mt.A0B(c34721FRi.A06)) {
                        j2 = System.currentTimeMillis();
                    } else {
                        j2 = c34721FRi.A00;
                    }
                    A0f.A9K(AbstractC111324zv.A00(5399), Long.valueOf(j2));
                    A0f.A9K("end_time_ms", AbstractC31173DnH.A0g());
                    AbstractC166997dE.A1N(A0f, "data_source", i2);
                    A0f.A9K("result_count", Long.valueOf(j));
                    AbstractC166997dE.A1N(A0f, "load_status", i3);
                    A0f.AAP("query_string", null);
                    A0f.AAP("search_session_id", str);
                    String str2 = c34721FRi.A06;
                    if (str2 != null) {
                        j3 = str2.length();
                    } else {
                        j3 = 0;
                    }
                    A0f.A9K("query_string_length", Long.valueOf(j3));
                    A0f.Cht();
                }
            }
        }
    }

    public C36280FzX(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = C18U.A06(C06090Tz.A06, userSession, 36313918422911297L);
    }
}
