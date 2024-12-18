package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Fzo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36294Fzo implements InterfaceC13000lm {
    public String A00;
    public String A01;
    public String A02;
    public UserSession A03;
    public final C18920wW A04;
    public final Map A05 = new C71665WyH();
    public final Map A06 = new C71665WyH();

    public static C36294Fzo A00(UserSession userSession) {
        return (C36294Fzo) C31651DvH.A00(userSession, C36294Fzo.class, 10);
    }

    private void A01() {
        Iterator A16 = AbstractC166997dE.A16(this.A05);
        while (A16.hasNext()) {
            C0Ah c0Ah = (C0Ah) A16.next();
            if (c0Ah != null) {
                c0Ah.Cht();
            }
        }
        Iterator A162 = AbstractC166997dE.A16(this.A06);
        while (A162.hasNext()) {
            C0Ah c0Ah2 = (C0Ah) A162.next();
            if (c0Ah2 != null) {
                c0Ah2.Cht();
            }
        }
    }

    public final void A02(String str) {
        if (this.A00 != null && str != null && str.equals(this.A01)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "direct_message_search_end");
            if (A0f.isSampled()) {
                A0f.AAP("message_search_session_id", this.A00);
                A0f.AAP("end_action", "back");
                A0f.AAP("universal_search_session_id", this.A02);
                A0f.Cht();
            }
            A01();
            this.A00 = null;
            this.A02 = null;
            this.A05.clear();
            this.A06.clear();
        }
    }

    public final void A03(String str, String str2) {
        if (this.A00 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "direct_message_search_thread_list_click");
            if (A0f.isSampled()) {
                A0f.AAP("message_search_session_id", this.A00);
                A0f.AAP("query_string", str);
                A0f.AAP("thread_type", str2);
                A0f.AAP("universal_search_session_id", this.A02);
                AbstractC31171DnF.A1F(A0f, null);
                A0f.Cht();
            }
        }
    }

    public final void A04(String str, String str2, String str3, long j) {
        if (this.A00 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "direct_message_search_msg_result_chosen");
            if (A0f.isSampled()) {
                A0f.AAP("message_search_session_id", this.A00);
                A0f.AAP("query_string", str);
                A0f.AAP("thread_type", str2);
                A0f.AAP("click_surface_name", str3);
                A0f.A8I("message_sent_time", Double.valueOf(j));
                A0f.AAP("universal_search_session_id", this.A02);
                A0f.Cht();
            }
            A01();
        }
    }

    public final void A05(String str, String str2, String str3, boolean z) {
        if (this.A00 != null) {
            A02(this.A01);
        }
        this.A00 = AbstractC166997dE.A0n();
        this.A02 = str;
        this.A01 = str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "direct_message_search_start");
        if (A0f.isSampled()) {
            A0f.AAP("message_search_session_id", this.A00);
            A0f.AAP("surface_name", str2);
            A0f.AAP("entry_surface", str3);
            A0f.AAP("universal_search_session_id", this.A02);
            if (C18U.A06(C06090Tz.A05, this.A03, 36317496133096738L)) {
                A0f.A7v("is_fts", Boolean.valueOf(z));
            }
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A02(this.A01);
    }

    public C36294Fzo(UserSession userSession) {
        this.A03 = userSession;
        this.A04 = AbstractC12220kQ.A01(new C35983Fuh(this), userSession);
    }
}
