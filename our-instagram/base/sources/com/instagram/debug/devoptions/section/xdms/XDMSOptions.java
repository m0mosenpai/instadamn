package com.instagram.debug.devoptions.section.xdms;

import X.AbstractC018607g;
import X.AbstractC111324zv;
import X.AbstractC16960so;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC59962oe;
import X.C0f9;
import X.C14360o3;
import X.C9GR;
import X.GHY;
import X.InterfaceC19610xo;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes6.dex */
public final class XDMSOptions implements DeveloperOptionsSection {
    public static final XDMSOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        C14360o3.A0B(fragmentActivity, 1);
        return AbstractC16960so.A1Q(GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xdms.XDMSOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(694311490);
                InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC31171DnF.A0Q());
                A0P.E7G(AbstractC111324zv.A00(2655), 0L);
                A0P.apply();
                C9GR.A07(FragmentActivity.this, 2131958481);
                C0f9.A0C(1920533823, A05);
            }
        }, 2131958480), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xdms.XDMSOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1610019867);
                InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC31171DnF.A0Q());
                A0P.E7D("preference_long_press_avatar_show_mac_account_switcher_tooltip_impressions", 0);
                A0P.apply();
                C9GR.A07(FragmentActivity.this, 2131958487);
                C0f9.A0C(910858374, A05);
            }
        }, 2131958486), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xdms.XDMSOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(824741931);
                InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC31171DnF.A0Q());
                A0P.E7D("preference_double_tap_profile_tab_tooltip_impressions", 0);
                A0P.apply();
                C9GR.A07(FragmentActivity.this, 2131958479);
                C0f9.A0C(454674165, A05);
            }
        }, 2131958478), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xdms.XDMSOptions$getItems$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1973811972);
                C9GR.A09(FragmentActivity.this, String.valueOf(AbstractC31172DnG.A1a(AbstractC31174DnI.A0f(), "has_entered_switcher_linkage_tooltip_eligibility")));
                C0f9.A0C(295050505, A05);
            }
        }, 2131958492), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xdms.XDMSOptions$getItems$5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-92034117);
                InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC31171DnF.A0Q());
                A0P.E77("has_entered_switcher_linkage_tooltip_eligibility", false);
                A0P.apply();
                C9GR.A07(FragmentActivity.this, 2131958489);
                C0f9.A0C(-1041299588, A05);
            }
        }, 2131958488), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xdms.XDMSOptions$getItems$6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(138223203);
                C9GR.A09(FragmentActivity.this, String.valueOf(AbstractC31172DnG.A01(AbstractC31174DnI.A0f(), "switcher_long_press_linkage_tooltip_impressions")));
                C0f9.A0C(1377186539, A05);
            }
        }, 2131958491), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xdms.XDMSOptions$getItems$7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(212935151);
                InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC31171DnF.A0Q());
                A0P.E7D("switcher_long_press_linkage_tooltip_impressions", 0);
                A0P.apply();
                C9GR.A07(FragmentActivity.this, 2131958483);
                C0f9.A0C(-411112154, A05);
            }
        }, 2131958482), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xdms.XDMSOptions$getItems$8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1975267211);
                InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC31171DnF.A0Q());
                A0P.E7G("switcher_long_press_linkage_tooltip_last_seen_time", 0L);
                A0P.apply();
                C9GR.A07(FragmentActivity.this, 2131958485);
                C0f9.A0C(1841431892, A05);
            }
        }, 2131958484), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xdms.XDMSOptions$getItems$9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1503931824);
                C9GR.A09(FragmentActivity.this, String.valueOf(AbstractC31172DnG.A01(AbstractC31174DnI.A0f(), "switcher_double_tap_linkage_tooltip_impressions")));
                C0f9.A0C(-1100923546, A05);
            }
        }, 2131958490), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xdms.XDMSOptions$getItems$10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2032363189);
                InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC31171DnF.A0Q());
                A0P.E7D("switcher_double_tap_linkage_tooltip_impressions", 0);
                A0P.apply();
                C9GR.A07(FragmentActivity.this, 2131958475);
                C0f9.A0C(1308382486, A05);
            }
        }, 2131958474), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xdms.XDMSOptions$getItems$11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-430914125);
                InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC31171DnF.A0Q());
                A0P.E7G("switcher_double_tap_linkage_tooltip_last_seen_time", 0L);
                A0P.apply();
                C9GR.A07(FragmentActivity.this, 2131958477);
                C0f9.A0C(-1520835859, A05);
            }
        }, 2131958476));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958411;
    }
}
