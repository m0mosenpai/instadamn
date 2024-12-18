package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.Oje, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55429Oje implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ IgFrameLayout A01;
    public final /* synthetic */ MWD A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ InterfaceC145436h2 A04;
    public final /* synthetic */ C139686Tx A05;
    public final /* synthetic */ String A06;

    public ViewOnClickListenerC55429Oje(UserSession userSession, IgFrameLayout igFrameLayout, MWD mwd, C41181vS c41181vS, InterfaceC145436h2 interfaceC145436h2, C139686Tx c139686Tx, String str) {
        this.A05 = c139686Tx;
        this.A03 = c41181vS;
        this.A00 = userSession;
        this.A01 = igFrameLayout;
        this.A06 = str;
        this.A04 = interfaceC145436h2;
        this.A02 = mwd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j;
        int A05 = C0f9.A05(2092349363);
        C139686Tx c139686Tx = this.A05;
        IgLinearLayout igLinearLayout = c139686Tx.A08;
        if (igLinearLayout != null) {
            C12500ku c12500ku = new C12500ku(igLinearLayout);
            while (c12500ku.hasNext()) {
                MSW.A0A(c12500ku).setSelected(false);
            }
            Long l = c139686Tx.A0B;
            Long l2 = null;
            if (l != null) {
                long longValue = l.longValue();
                long currentTimeMillis = System.currentTimeMillis();
                c139686Tx.A0B = null;
                c139686Tx.A0D = false;
                l2 = Long.valueOf(currentTimeMillis - longValue);
            }
            C41181vS c41181vS = this.A03;
            UserSession userSession = this.A00;
            if (!c41181vS.A1g() && !c41181vS.A1a() && !c41181vS.A1P()) {
                j = C18U.A01(C06090Tz.A05, userSession, 36610344180848671L);
            } else {
                j = -1;
            }
            boolean z = false;
            if (j > 0 && l2 != null && l2.longValue() >= j) {
                z = true;
            }
            if (!z) {
                c139686Tx.A02(false);
            }
            IgFrameLayout igFrameLayout = this.A01;
            igFrameLayout.setSelected(true);
            String str = this.A06;
            C14360o3.A0B(str, 0);
            c139686Tx.A0C = str;
            c41181vS.A0I = str;
            InterfaceC145436h2 interfaceC145436h2 = this.A04;
            interfaceC145436h2.DgA();
            if (z) {
                c139686Tx.A0E = true;
                MWD.A00(this.A02, l2, "lead_ads_stories_first_question", "lead_ads_first_question_one_tap_dwell_option_click", "click").Cht();
                interfaceC145436h2.DMW(c41181vS, C2Fb.A3f, igFrameLayout.getPivotX(), igFrameLayout.getPivotY());
                C71313Hs.A00(userSession).A07(igFrameLayout, EnumC71343Hv.A0H, new String[]{c41181vS.A0k}, 1);
            } else {
                MWD.A00(this.A02, l2, "lead_ads_stories_first_question", "lead_ads_first_question_option_click", "click").Cht();
            }
            C0f9.A0C(843471508, A05);
            return;
        }
        C14360o3.A0F("optionsListView");
        throw C00O.createAndThrow();
    }
}
