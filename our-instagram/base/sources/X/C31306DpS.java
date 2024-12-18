package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.DpS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31306DpS extends AbstractC46524KiP implements GZA {
    public C34602FMl A00;
    public C2EC A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C31305DpR A04;
    public final int A05;
    public final Capabilities A06;
    public final C7TT A07;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        String str;
        C14360o3.A0B(context, 0);
        C34602FMl c34602FMl = new C34602FMl(context, this.A04, this, C4GQ.A09(this.A01));
        this.A00 = c34602FMl;
        String str2 = c34602FMl.A04;
        if (str2 != null) {
            str = AbstractC31179DnN.A0d(c34602FMl.A02.A01, "ads_event_sharing_notice_content", str2);
        } else {
            str = "";
        }
        IgdsBanner igdsBanner = new IgdsBanner(c34602FMl.A01, null, 0);
        AbstractC31172DnG.A1U(igdsBanner, str, false);
        Context context2 = igdsBanner.getContext();
        AbstractC31172DnG.A1B(context2, igdsBanner, AbstractC53242c7.A0D(context2));
        igdsBanner.setAction(context2.getString(2131952514));
        igdsBanner.setDismissible(true);
        igdsBanner.A00 = c34602FMl.A03;
        c34602FMl.A00 = igdsBanner;
        return igdsBanner;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        String A09;
        C14360o3.A0B(interfaceC37159GYw, 1);
        if (AbstractC31303DpP.A00(this.A03, false) && c2ec != null && !c2ec.CVQ() && (A09 = C4GQ.A09(c2ec)) != null) {
            C31305DpR c31305DpR = this.A04;
            if (c31305DpR.A00(A09).length() > 0) {
                String A092 = C4GQ.A09(c2ec);
                if (A092 != null && AbstractC31179DnN.A0d(c31305DpR.A01, "ads_event_sharing_notice_ui_type", A092).equals("TOAST")) {
                    String A093 = C4GQ.A09(c2ec);
                    if (A093 != null) {
                        c31305DpR.A01(this.A02, A093, false);
                    }
                } else {
                    this.A01 = c2ec;
                    interfaceC37159GYw.Dpu(this);
                    return;
                }
            }
        }
        interfaceC37159GYw.onFailure();
    }

    @Override // X.AbstractC46524KiP
    public final void A04(boolean z) {
        C31305DpR.A03 = new C50251MHg(this, 45);
        String A09 = C4GQ.A09(this.A01);
        if (A09 != null) {
            String A00 = this.A04.A00(A09);
            if (A00.length() != 0) {
                UserSession userSession = this.A03;
                AbstractC34058F1l.A00(userSession).A01(userSession.userId, A00);
            }
        }
    }

    @Override // X.AbstractC46524KiP
    public final boolean A05() {
        IgdsBanner igdsBanner;
        C34602FMl c34602FMl = this.A00;
        if (c34602FMl == null || (igdsBanner = c34602FMl.A00) == null || igdsBanner.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.GZA
    public final void onActionClicked() {
        String C7I;
        C2EC c2ec = this.A01;
        if (c2ec != null && (C7I = c2ec.C7I()) != null) {
            C83693oE A0N = AbstractC31171DnF.A0N(C7I);
            UserSession userSession = this.A03;
            C7TT c7tt = this.A07;
            AbstractC167017dG.A1O(userSession, c7tt);
            ELx A00 = AbstractC34092F2u.A00(userSession, this.A06, A0N, this.A05, C6X6.A0C(userSession, c7tt, true));
            String A09 = C4GQ.A09(this.A01);
            if (A09 != null) {
                this.A04.A02(A09);
                C31305DpR.A03 = null;
            }
            AbstractC25229BEm.A18(A00, AbstractC25225BEi.A0r(this.A02, userSession));
        }
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        String A09 = C4GQ.A09(this.A01);
        if (A09 != null) {
            this.A04.A02(A09);
            C31305DpR.A03 = null;
        }
    }

    public C31306DpS(FragmentActivity fragmentActivity, UserSession userSession, Capabilities capabilities, C7TT c7tt, int i) {
        this.A03 = userSession;
        this.A02 = fragmentActivity;
        this.A06 = capabilities;
        this.A07 = c7tt;
        this.A05 = i;
        this.A04 = new C31305DpR(userSession);
    }
}
