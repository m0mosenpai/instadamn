package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.model.effect.AREffect;
import java.util.List;

/* loaded from: classes9.dex */
public final class N75 extends AbstractC59962oe implements InterfaceC1119353f {
    public static final String __redex_internal_original_name = "EffectInfoBottomSheetFragment";
    public TouchInterceptorFrameLayout A00;
    public EffectInfoBottomSheetConfiguration A01;
    public InterfaceC149856oe A02;
    public boolean A03;
    public C55907Ory A04;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final String A05 = "ig_camera_end_effect_info_sheet";

    @Override // X.InterfaceC1119353f
    public final void EK1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String id;
        boolean isDeviceLocked;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (TouchInterceptorFrameLayout) view.requireViewById(R.id.effect_info_bottom_sheet_root);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            AbstractC12120kG.A07("EffectInfoBottomSheetFragment::onViewCreated", "No configuration arguments for the bottom sheet.", null);
            return;
        }
        this.A01 = (EffectInfoBottomSheetConfiguration) AbstractC153636vY.A00(bundle2, EffectInfoBottomSheetConfiguration.class, "ar_effect_bottom_sheet_info");
        if (bundle2.containsKey("ar_effect_is_e2ee_mandated")) {
            this.A03 = bundle2.getBoolean("ar_effect_is_e2ee_mandated");
        }
        Context A0O = AbstractC166987dD.A0O(requireContext());
        InterfaceC09390do interfaceC09390do = this.A06;
        C50881MeC c50881MeC = (C50881MeC) MSW.A0F(new C52272NBn(A0O, AbstractC166987dD.A0r(interfaceC09390do)), this).A00(C50881MeC.class);
        EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = this.A01;
        C14360o3.A0A(effectInfoBottomSheetConfiguration);
        this.A04 = new C55907Ory(bundle2, view, effectInfoBottomSheetConfiguration, this, this.A02, c50881MeC);
        EnumC50631MWs enumC50631MWs = (EnumC50631MWs) bundle2.getSerializable("ar_effect_surface");
        if (enumC50631MWs == null) {
            return;
        }
        EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration2 = this.A01;
        C14360o3.A0A(effectInfoBottomSheetConfiguration2);
        EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = (EffectInfoAttributionConfiguration) effectInfoBottomSheetConfiguration2.A02.get(0);
        C14360o3.A07(effectInfoAttributionConfiguration);
        C22C A0T = AbstractC43593JPy.A0T(interfaceC09390do);
        String str = null;
        if (this.A03) {
            id = null;
        } else {
            AREffect aREffect = effectInfoAttributionConfiguration.A04;
            id = aREffect.getId();
            str = aREffect.A06();
        }
        KeyguardManager keyguardManager = (KeyguardManager) requireContext().getSystemService("keyguard");
        if (keyguardManager == null) {
            isDeviceLocked = false;
        } else {
            isDeviceLocked = keyguardManager.isDeviceLocked();
        }
        C448524p c448524p = A0T.A0D;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448524p.A01, "ig_camera_start_session");
        if (!A0f.isSampled()) {
            return;
        }
        List A1J = AbstractC166987dD.A1J(AbstractC449424y.A08(id));
        List A1J2 = AbstractC166987dD.A1J(AbstractC449424y.A08(str));
        MSW.A1V(A0f, "IG_CAMERA_START_EFFECT_INFO_SHEET_SESSION");
        MSW.A1R(A0f, "EFFECT_INFO_SHEET");
        C22M c22m = c448524p.A04;
        AbstractC166987dD.A1S(A0f, MSX.A0f(c22m));
        A0f.AAk("applied_effect_ids", A1J);
        A0f.AAk("applied_effect_instance_ids", A1J2);
        AbstractC50522MSa.A17(A0f, MSZ.A05(c22m));
        AbstractC167007dF.A11(A0f, c448524p);
        MSX.A1F(A0f, c22m);
        AbstractC166997dE.A1N(A0f, "event_type", 1);
        MSX.A1G(A0f, c22m);
        AbstractC167017dG.A1B(A0f);
        MSW.A1M(enumC50631MWs, A0f);
        A0f.A7v("is_device_locked", Boolean.valueOf(isDeviceLocked));
        A0f.AAP("discovery_session_id", c22m.A0O);
        AbstractC25233BEq.A17(A0f, "search_session_id", c22m.A0P);
        AbstractC50522MSa.A19(A0f, c448524p);
        A0f.AAP(AbstractC111324zv.A00(4261), AbstractC82673mV.A00);
        A0f.AAP(AbstractC111324zv.A00(4262), AbstractC82683mW.A00);
        A0f.A7v(AbstractC111324zv.A00(4264), AbstractC82693mX.A00);
        A0f.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
        A0f.Cht();
    }

    @Override // X.InterfaceC1119353f
    public final InterfaceC59992oh B8R() {
        return this;
    }

    @Override // X.InterfaceC1119353f
    public final TouchInterceptorFrameLayout CA1() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A00;
        C14360o3.A0A(touchInterceptorFrameLayout);
        return touchInterceptorFrameLayout;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1239366370);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.effect_info_bottom_sheet_fragment_layout, viewGroup, false);
        C0f9.A09(-949016469, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration;
        String id;
        int A02 = C0f9.A02(1301193694);
        super.onDestroy();
        Bundle bundle = this.mArguments;
        if (bundle != null && (effectInfoBottomSheetConfiguration = this.A01) != null) {
            EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = (EffectInfoAttributionConfiguration) AbstractC166987dD.A16(effectInfoBottomSheetConfiguration.A02);
            C14360o3.A07(effectInfoAttributionConfiguration);
            EnumC50631MWs enumC50631MWs = (EnumC50631MWs) bundle.getSerializable("ar_effect_surface");
            if (enumC50631MWs != null) {
                C22C A0T = AbstractC43593JPy.A0T(this.A06);
                String str = null;
                if (this.A03) {
                    id = null;
                } else {
                    AREffect aREffect = effectInfoAttributionConfiguration.A04;
                    id = aREffect.getId();
                    str = aREffect.A06();
                }
                C448024k c448024k = A0T.A07;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448024k.A01, "ig_camera_end_session");
                if (A0f.isSampled()) {
                    MSW.A1R(A0f, "EFFECT_INFO_SHEET");
                    MSW.A1V(A0f, "IG_CAMERA_END_EFFECT_INFO_SHEET_SESSION");
                    C22M c22m = c448024k.A04;
                    AbstractC166987dD.A1S(A0f, MSX.A0f(c22m));
                    A0f.AAk("applied_effect_ids", AbstractC166987dD.A1J(AbstractC449424y.A08(id)));
                    A0f.AAk("applied_effect_instance_ids", AbstractC166987dD.A1J(AbstractC449424y.A08(str)));
                    AbstractC50522MSa.A17(A0f, MSZ.A05(c22m));
                    AbstractC167007dF.A11(A0f, c448024k);
                    MSX.A1F(A0f, c22m);
                    AbstractC166997dE.A1N(A0f, "event_type", 1);
                    MSX.A1G(A0f, c22m);
                    AbstractC167017dG.A1B(A0f);
                    MSW.A1M(enumC50631MWs, A0f);
                    AbstractC37302Gc3.A0t(A0f);
                    AbstractC50522MSa.A19(A0f, c448024k);
                    String str2 = c22m.A0O;
                    if (str2 != null) {
                        A0f.AAP("discovery_session_id", str2);
                    }
                    String str3 = c22m.A0P;
                    if (str3 != null && str3.length() != 0) {
                        A0f.AAP("search_session_id", str3);
                    }
                    AbstractC25234BEr.A11(A0f, "device_aspect_ratio_category", AbstractC82663mU.A00);
                    A0f.Cht();
                }
            }
        }
        C0f9.A09(-1927053105, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-915205086);
        super.onPause();
        this.A02 = null;
        C0f9.A09(-637755109, A02);
    }
}
