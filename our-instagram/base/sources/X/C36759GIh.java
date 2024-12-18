package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GIh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36759GIh implements InterfaceC37187GZy {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C3o9 A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public C36759GIh(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3o9 c3o9, User user, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        this.A04 = c3o9;
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A05 = user;
        this.A08 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = i;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37187GZy
    public final void D9X() {
        UserSession userSession;
        AbstractC31602DuU kWi;
        C3o9 c3o9 = this.A04;
        if (JRE.A0A(c3o9)) {
            FragmentActivity fragmentActivity = this.A01;
            userSession = this.A03;
            AbstractC167017dG.A1N(fragmentActivity, userSession);
            kWi = new C31605DuX(fragmentActivity, userSession);
        } else {
            FragmentActivity fragmentActivity2 = this.A01;
            userSession = this.A03;
            kWi = new KWi(fragmentActivity2, userSession);
        }
        kWi.A02(c3o9, C05F.A05);
        String A03 = C7KH.A03(c3o9);
        if (A03 != null) {
            InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
            AbstractC31171DnF.A1C(A07, "block_action_chaining_delete_cta_clicked");
            AbstractC31171DnF.A1F(A07, A03);
            A07.Cht();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37187GZy
    public final void DfZ() {
        UserSession userSession = this.A03;
        User user = this.A05;
        boolean z = true;
        if (user.BJ8() != 1 && !C18U.A06(C06090Tz.A05, userSession, 36311319967695351L)) {
            z = false;
        }
        FragmentActivity fragmentActivity = this.A01;
        if (z) {
            boolean z2 = this.A08;
            boolean z3 = this.A09;
            boolean z4 = this.A0A;
            String str = this.A06;
            String str2 = this.A07;
            String A03 = C7KH.A03(this.A04);
            if (A03 != null) {
                C35225FgI.A01(fragmentActivity, this.A02, userSession, null, str, str2, A03, user.getId(), this.A00, z2, z3, z4, false, false);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            C35225FgI.A02(fragmentActivity, this.A02, userSession, user.getId(), this.A06, this.A09);
        }
        String A032 = C7KH.A03(this.A04);
        if (A032 != null) {
            InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
            AbstractC31171DnF.A1C(A07, "block_action_chaining_report_cta_clicked");
            AbstractC31171DnF.A1F(A07, A032);
            A07.Cht();
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC37187GZy
    public final void onDismiss() {
        UserSession userSession = this.A03;
        String A03 = C7KH.A03(this.A04);
        if (A03 != null) {
            InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
            AbstractC31171DnF.A1C(A07, "block_action_chaining_report_dismissed");
            AbstractC31171DnF.A1F(A07, A03);
            A07.Cht();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
