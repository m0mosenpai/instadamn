package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.Ojl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55436Ojl implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ IgFrameLayout A02;
    public final /* synthetic */ MWD A03;
    public final /* synthetic */ C41181vS A04;
    public final /* synthetic */ InterfaceC145436h2 A05;
    public final /* synthetic */ C6U3 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public ViewOnClickListenerC55436Ojl(UserSession userSession, IgFrameLayout igFrameLayout, MWD mwd, C41181vS c41181vS, InterfaceC145436h2 interfaceC145436h2, C6U3 c6u3, String str, int i, boolean z) {
        this.A06 = c6u3;
        this.A00 = i;
        this.A08 = z;
        this.A04 = c41181vS;
        this.A05 = interfaceC145436h2;
        this.A01 = userSession;
        this.A02 = igFrameLayout;
        this.A07 = str;
        this.A03 = mwd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(381571719);
        C6U3 c6u3 = this.A06;
        IgLinearLayout igLinearLayout = c6u3.A08;
        if (igLinearLayout != null) {
            C12500ku c12500ku = new C12500ku(igLinearLayout);
            while (c12500ku.hasNext()) {
                MSW.A0A(c12500ku).setSelected(false);
            }
            if (this.A00 == 0) {
                if (this.A08) {
                    C41181vS c41181vS = this.A04;
                    InterfaceC145436h2 interfaceC145436h2 = this.A05;
                    UserSession userSession = this.A01;
                    IgFrameLayout igFrameLayout = this.A02;
                    interfaceC145436h2.DMW(c41181vS, C2Fb.A3f, igFrameLayout.getPivotX(), igFrameLayout.getPivotY());
                    C71313Hs.A00(userSession).A07(igFrameLayout, EnumC71343Hv.A0H, new String[]{c41181vS.A0k}, 1);
                } else {
                    c6u3.A03();
                    this.A02.setSelected(true);
                    String str2 = this.A07;
                    C14360o3.A0B(str2, 0);
                    c6u3.A0B = str2;
                    this.A04.A0I = str2;
                }
                MWD.A02(this.A03, "lead_ads_stories_offsite_generic_question", "lead_ads_stories_offsite_generic_question_option_yes_click");
                this.A05.DgA();
            } else {
                if (c6u3.A0B.length() > 0) {
                    ConstraintLayout constraintLayout = c6u3.A05;
                    if (constraintLayout != null) {
                        AbstractC31173DnH.A0z(c6u3.A00().getContext(), constraintLayout, R.drawable.reel_ctwa_story_messaging_card_rounded_corner_background);
                    } else {
                        str = "cardViewWithoutCta";
                    }
                }
                c6u3.A0B = "";
                c6u3.A02();
                MWD.A02(this.A03, "lead_ads_stories_offsite_generic_question", "lead_ads_stories_offsite_generic_question_option_no_click");
                this.A05.EmA();
            }
            C0f9.A0C(1691981897, A05);
            return;
        }
        str = "optionsListView";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
