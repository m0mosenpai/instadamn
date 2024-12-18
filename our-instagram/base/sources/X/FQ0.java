package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FQ0 {
    public long A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final String A03;

    public FQ0(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A02 = userSession;
        this.A03 = str == null ? "Null" : str;
        if (str2 != null) {
            try {
                this.A00 = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
                this.A00 = -1L;
            }
        }
    }

    public final void A00(String str, boolean z, boolean z2, boolean z3) {
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(String.valueOf(this.A00));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "direct_welcome_message_events");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, str);
            AbstractC31171DnF.A1F(A0f, this.A03);
            A0f.AAk("participant_ids", A1E);
            A0f.A7v("is_ctd_wm_override", AbstractC31173DnH.A0d(A0f, AbstractC31173DnH.A0d(A0f, Boolean.valueOf(z2), "has_emoji", z), "is_from_icebreaker", z3));
            A0f.Cht();
        }
    }
}
