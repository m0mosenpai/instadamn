package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.Map;

/* renamed from: X.ELp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32321ELp extends AbstractC59962oe implements InterfaceC23471Cj {
    public static final String __redex_internal_original_name = "TurnOnNotificationsFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        boolean z;
        InterfaceC19610xo A0P;
        String str;
        C14360o3.A0B(map, 0);
        AbstractC31175DnJ.A1Q(AbstractC34275F9v.A00(this));
        C19740y2 A0Q = AbstractC31171DnF.A0Q();
        Object obj = map.get("android.permission.POST_NOTIFICATIONS");
        if (obj == EnumC172127lh.A05) {
            z = true;
            A0P = AbstractC31171DnF.A0P(A0Q);
            str = AbstractC111324zv.A00(2893);
        } else {
            if (obj != EnumC172127lh.A03) {
                return;
            }
            z = true;
            A0P = AbstractC31171DnF.A0P(A0Q);
            str = "preference_has_denied_push_system_dialog";
        }
        A0P.E77(str, z);
        A0P.apply();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "turn_on_notifications_nux";
    }

    public static final void A00(C32321ELp c32321ELp) {
        C35111FeD.A00(AbstractC166987dD.A0o(c32321ELp.A00), null, "push_opt_in");
        AbstractC31175DnJ.A1P(AbstractC34275F9v.A00(c32321ELp));
    }

    public static final void A01(C32321ELp c32321ELp) {
        C35031Fc4.A00.A00(AbstractC166987dD.A0o(c32321ELp.A00), null, "push_opt_in");
        Context context = c32321ELp.getContext();
        if (context != null) {
            if (!AbstractC23451Ch.A07(context, "android.permission.POST_NOTIFICATIONS")) {
                AbstractC23451Ch.A04(c32321ELp.requireActivity(), c32321ELp, "android.permission.POST_NOTIFICATIONS");
                C19740y2 A0Q = AbstractC31171DnF.A0Q();
                A0Q.A01(A0Q.A00.getInt(AbstractC111324zv.A00(498), 0) + 1);
                return;
            }
            AbstractC31175DnJ.A1Q(AbstractC34275F9v.A00(c32321ELp));
            return;
        }
        AbstractC31175DnJ.A1P(AbstractC34275F9v.A00(c32321ELp));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1251221666);
        super.onCreate(bundle);
        C0f9.A09(1509230398, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        boolean z;
        int A02 = C0f9.A02(886957189);
        C14360o3.A0B(layoutInflater, 0);
        InterfaceC09390do interfaceC09390do = this.A00;
        AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0k, 36324600006783237L)) {
            inflate = layoutInflater.inflate(R.layout.nux_turn_on_notifications_redesign, viewGroup, false);
            View A0S = AbstractC166997dE.A0S(inflate, R.id.turn_on_button);
            View A0S2 = AbstractC166997dE.A0S(inflate, R.id.prompt_top_button);
            View A0S3 = AbstractC166997dE.A0S(inflate, R.id.skip_button);
            View A0S4 = AbstractC166997dE.A0S(inflate, R.id.prompt_bottom_button);
            z = true;
            A0S.setEnabled(true);
            ViewOnClickListenerC31724DwT.A00(A0S, 32, this);
            ViewOnClickListenerC31724DwT.A00(A0S2, 33, this);
            ViewOnClickListenerC31724DwT.A00(A0S3, 34, this);
            ViewOnClickListenerC31724DwT.A00(A0S4, 35, this);
        } else {
            boolean A06 = C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36324600006652163L);
            boolean A062 = C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36324600006848774L);
            boolean A063 = C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36329728197542404L);
            inflate = layoutInflater.inflate(R.layout.nux_turn_on_notifications, viewGroup, false);
            View A0S5 = AbstractC166997dE.A0S(inflate, R.id.turn_on_button);
            View A0R = AbstractC166997dE.A0R(inflate, R.id.skip_button);
            ProgressButton progressButton = (ProgressButton) AbstractC166997dE.A0R(inflate, R.id.turn_on_button_new);
            View A0S6 = AbstractC166997dE.A0S(inflate, R.id.skip_button_new);
            View A0S7 = AbstractC166997dE.A0S(inflate, R.id.button_container_new);
            z = true;
            if (A06) {
                AbstractC31180DnO.A19(A0S7, A0S5, A0R, 0, 8);
                if (A062) {
                    A0S6.setVisibility(8);
                    progressButton.setText(2131968535);
                }
                progressButton.setEnabled(true);
                ViewOnClickListenerC31724DwT.A00(progressButton, 28, this);
                ViewOnClickListenerC31724DwT.A00(A0S6, 29, this);
            } else {
                AbstractC31180DnO.A19(A0S7, A0S5, A0R, 8, 0);
                A0S5.setEnabled(true);
                ViewOnClickListenerC31724DwT.A00(A0S5, 30, this);
                ViewOnClickListenerC31724DwT.A00(A0R, 31, this);
            }
            View A0S8 = AbstractC166997dE.A0S(inflate, R.id.turn_on_illo);
            View A0S9 = AbstractC166997dE.A0S(inflate, R.id.turn_on_new_illo);
            if (A063) {
                A0S8.setVisibility(8);
                A0S9.setVisibility(0);
            } else {
                A0S8.setVisibility(0);
                A0S9.setVisibility(8);
            }
        }
        C18720vz c18720vz = AbstractC12960li.A00;
        InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC19730y1.A00(c18720vz));
        A0P.E77(AbstractC111324zv.A00(1177), z);
        A0P.apply();
        AbstractC19730y1.A00(c18720vz).A03(z);
        C35203Ffv.A01(AbstractC166987dD.A0o(interfaceC09390do), "push_opt_in");
        C0f9.A09(2123481375, A02);
        return inflate;
    }
}
