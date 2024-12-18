package com.instagram.direct.fragment.icebreaker;

import X.AbstractC10360h2;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC33235ElU;
import X.AbstractC34057F1k;
import X.C05F;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.C31651DvH;
import X.C32360ENh;
import X.C34675FPk;
import X.C34923Fa9;
import X.C35009Fbg;
import X.C36063Fvz;
import X.C36292Fzm;
import X.C53Z;
import X.C56352iT;
import X.C9GR;
import X.EnumC153216up;
import X.F0Z;
import X.G1R;
import X.InterfaceC1571373s;
import X.InterfaceC37166GZd;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC35681FpG;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class DirectIceBreakerSettingFragment extends AbstractC33235ElU implements InterfaceC60072op, InterfaceC37166GZd, InterfaceC60122ou, InterfaceC1571373s {
    public Context A00;
    public Bundle A01;
    public Toast A02;
    public FragmentActivity A03;
    public UserSession A04;
    public C34675FPk A05;
    public C35009Fbg A06;
    public C34923Fa9 A07;
    public C36292Fzm A08;
    public String A09;
    public EmptyStateView mEmptyStateView;
    public boolean A0B = false;
    public boolean A0A = false;
    public final InterfaceC37166GZd A0C = new G1R(this);

    public static synchronized void A01(DirectIceBreakerSettingFragment directIceBreakerSettingFragment, boolean z) {
        synchronized (directIceBreakerSettingFragment) {
            directIceBreakerSettingFragment.A0A = z;
        }
    }

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_icebreaker_setting_fragment";
    }

    public static void A00(DirectIceBreakerSettingFragment directIceBreakerSettingFragment) {
        if (directIceBreakerSettingFragment.A09.equals("inbox_qp_creation_flow")) {
            Intent A04 = AbstractC31171DnF.A04();
            A04.putExtra("is_icebreaker_added", AbstractC167007dF.A1O(directIceBreakerSettingFragment.A08.A01()));
            directIceBreakerSettingFragment.A03.setResult(-1, A04);
        }
        directIceBreakerSettingFragment.A03.onBackPressed();
    }

    public final void A02() {
        C34923Fa9 c34923Fa9;
        HashMap A1G;
        String str;
        String str2;
        boolean z;
        this.mEmptyStateView.A0K();
        C36292Fzm c36292Fzm = this.A08;
        boolean z2 = c36292Fzm.A06;
        int intValue = c36292Fzm.A02().intValue();
        if (intValue != 3) {
            if (intValue != 2) {
                if (intValue != 0) {
                    EmptyStateView emptyStateView = this.mEmptyStateView;
                    EnumC153216up enumC153216up = EnumC153216up.A04;
                    emptyStateView.A0T(enumC153216up, 2131959497);
                    this.mEmptyStateView.A0Q(enumC153216up, 2131959504);
                    this.mEmptyStateView.A0O(this, enumC153216up);
                    this.mEmptyStateView.A0J();
                    c34923Fa9 = this.A07;
                    A1G = AbstractC166987dD.A1G();
                    AbstractC31171DnF.A1U("FETCH_QUESTIONS_REQUEST_FAILURE", A1G);
                    str = "There was a HTTP request failure to load icebreaker questions from server";
                    str2 = "icebreaker_settings_error_screen_impression";
                } else {
                    this.mEmptyStateView.A0P(EnumC153216up.A06);
                    return;
                }
            } else {
                AbstractC10360h2 abstractC10360h2 = this.A05.A00;
                if (abstractC10360h2 != null) {
                    Fragment A0Q = abstractC10360h2.A0Q(C32360ENh.__redex_internal_original_name);
                    if (A0Q instanceof C32360ENh) {
                        C14360o3.A0A(abstractC10360h2);
                        C14240no c14240no = new C14240no(abstractC10360h2);
                        c14240no.A03(A0Q);
                        c14240no.A01();
                    }
                }
                setItems(this.A06.A01());
                c34923Fa9 = this.A07;
                int A01 = this.A08.A01();
                boolean z3 = this.A08.A08;
                A1G = AbstractC166987dD.A1G();
                A1G.put("icebreaker_num", String.valueOf(A01));
                String str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                Object obj = "0";
                if (z3) {
                    obj = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                }
                A1G.put("enabled_status", obj);
                if (!z2) {
                    str3 = "0";
                }
                A1G.put("show_import_option", str3);
                str = null;
                str2 = "icebreaker_settings_question_list_screen_impression";
            }
        } else {
            List list = Collections.EMPTY_LIST;
            if (!z2) {
                setItems(list);
                synchronized (this) {
                    z = this.A0A;
                }
                if (z) {
                    return;
                }
                A01(this, true);
                this.A05.A00(this, null, this.A09, null);
                return;
            }
            setItems(list);
            C34675FPk c34675FPk = this.A05;
            Bundle bundle = this.A01;
            C14360o3.A0B(bundle, 0);
            AbstractC10360h2 abstractC10360h22 = c34675FPk.A00;
            if (abstractC10360h22 != null) {
                bundle.putBoolean("show_set_up_preference", z2);
                C53Z c53z = new C53Z();
                c53z.setArguments(bundle);
                C14360o3.A0A(abstractC10360h22);
                C14240no c14240no2 = new C14240no(abstractC10360h22);
                c14240no2.A0D(c53z, C32360ENh.__redex_internal_original_name, R.id.layout_listview_parent_container);
                c14240no2.A01();
            }
            c34923Fa9 = this.A07;
            boolean z4 = !this.A09.equals("business_settings");
            A1G = AbstractC166987dD.A1G();
            String str4 = "0";
            if (z4) {
                str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A1G.put("from_qp", str4);
            A1G.put("show_import_option", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            str = null;
            str2 = "icebreaker_settings_null_state_screen_impression";
        }
        C34923Fa9.A00(c34923Fa9, str2, str, A1G);
    }

    @Override // X.InterfaceC37166GZd
    public final void Cue() {
        Toast toast = this.A02;
        if (toast != null) {
            toast.cancel();
            this.A02 = null;
        }
        C35009Fbg.A00(this);
        AbstractC34057F1k.A00(this.A00, this.A04, 2131974293);
        C34923Fa9 c34923Fa9 = this.A07;
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC31171DnF.A1U("TOGGLE_SHOW_QUESTIONS_STATUS_REQUEST_FAILURE", A1G);
        C34923Fa9.A00(c34923Fa9, "icebreaker_settings_error_screen_impression", "There was a HTTP request failure to toggle icebreaker show questions switch button", A1G);
    }

    @Override // X.InterfaceC37166GZd
    public final void Cun() {
        this.A02 = C9GR.A01(this.A00, null, 2131959507, 1);
        C56352iT.A0t.A03(this.A03).ETp(false);
    }

    @Override // X.InterfaceC37166GZd
    public final void Cuo() {
        Toast toast = this.A02;
        if (toast != null) {
            toast.cancel();
            this.A02 = null;
        }
        C56352iT.A0t.A03(this.A03).ETp(true);
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        this.mEmptyStateView.A0P(EnumC153216up.A06);
        this.A08.A03();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C36292Fzm c36292Fzm = this.A08;
        if (!c36292Fzm.A06 && c36292Fzm.A02() == C05F.A0N) {
            return;
        }
        interfaceC56362iU.Efu(2131959495);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35681FpG.A00(this, 54), AbstractC31174DnI.A0K(), interfaceC56362iU);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A0B) {
            return false;
        }
        this.A0B = false;
        F0Z.A00(requireActivity(), this.A04);
        return true;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 17465) {
            A01(this, false);
        }
        if (intent != null && intent.getIntExtra("should_seen_messaging_hub_afterparty_dialog", -1) == 504) {
            this.A0B = true;
        }
        if (i == 17465 && i2 == 0 && this.A08.A02() == C05F.A0N) {
            A00(this);
        }
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-459228465);
        super.onCreate(bundle);
        this.A03 = requireActivity();
        this.A00 = requireContext();
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments;
        this.A04 = AbstractC31171DnF.A0G(requireArguments);
        this.A09 = this.A01.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "business_settings");
        C36292Fzm c36292Fzm = (C36292Fzm) C31651DvH.A00(this.A04, C36292Fzm.class, 4);
        this.A08 = c36292Fzm;
        c36292Fzm.A04 = this;
        c36292Fzm.A03 = this.A0C;
        this.A07 = new C34923Fa9(this, this.A04);
        UserSession userSession = this.A04;
        Context context = this.A00;
        this.A06 = new C35009Fbg(this.A03, context, AbstractC25651Mw.A00(userSession), userSession, this, this.A07, this.A08, this.A09);
        UserSession userSession2 = this.A04;
        FragmentActivity fragmentActivity = this.A03;
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        AbstractC167017dG.A1P(userSession2, fragmentActivity);
        C34675FPk c34675FPk = new C34675FPk(userSession2, fragmentActivity);
        c34675FPk.A00 = childFragmentManager;
        this.A05 = c34675FPk;
        C0f9.A09(-1935793505, A02);
    }

    @Override // X.AbstractC33235ElU, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(507197975);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_listview_with_empty_state);
        C0f9.A09(-595563091, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(49496972);
        super.onDestroy();
        C36292Fzm c36292Fzm = this.A08;
        c36292Fzm.A04 = null;
        c36292Fzm.A03 = null;
        C35009Fbg c35009Fbg = this.A06;
        if (c35009Fbg != null) {
            c35009Fbg.A02.A02(c35009Fbg.A03, C36063Fvz.class);
        }
        C0f9.A09(57037523, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1463217217);
        super.onResume();
        A02();
        C0f9.A09(2138543227, A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View view2 = this.mEmptyView;
        view2.getClass();
        this.mEmptyStateView = (EmptyStateView) view2;
    }
}
