package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* loaded from: classes9.dex */
public final class N64 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenOneTapOnboardingFragmentV2";
    public IgdsBottomButtonLayout A00;
    public IgRadioGroup A01;
    public boolean A02;
    public boolean A03;
    public NestedScrollView A04;
    public AnonymousClass195 A05;
    public final ViewTreeObserver.OnPreDrawListener A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final int[] A09;
    public final int[] A0A;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String A0q;
        C14360o3.A0B(interfaceC56362iU, 0);
        InterfaceC09390do interfaceC09390do = this.A08;
        if (MSW.A0k(interfaceC09390do).A04 == EnumC53251Ngp.A04) {
            A0q = "";
        } else {
            A0q = MSZ.A0q(this, getString(MSW.A0k(interfaceC09390do).A04.A00), 2131964873);
        }
        interfaceC56362iU.setTitle(A0q);
        AbstractC31179DnN.A1G(interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "organic_lead_gen_one_tap_onboarding";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = (NestedScrollView) view.requireViewById(R.id.one_tap_onboarding_container);
        AbstractC166997dE.A0T(view, R.id.one_tap_onboarding_title).setText(AbstractC25227BEk.A0v(this, 2131965014));
        TextView A0T = AbstractC166997dE.A0T(view, R.id.one_tap_onboarding_subtitle);
        InterfaceC09390do interfaceC09390do = this.A08;
        int i3 = 2131965012;
        if (MSW.A0k(interfaceC09390do).A04 == EnumC53251Ngp.A06) {
            i3 = 2131965013;
        }
        A0T.setText(AbstractC25227BEk.A0v(this, i3));
        IgRadioGroup igRadioGroup = (IgRadioGroup) view.requireViewById(R.id.onboarding_options);
        for (EnumC53267Nh5 enumC53267Nh5 : EnumC53267Nh5.values()) {
            C66359UCf c66359UCf = new C66359UCf(requireActivity());
            c66359UCf.setTag(enumC53267Nh5);
            int ordinal = enumC53267Nh5.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i = 2131965007;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i = 2131965009;
            }
            c66359UCf.setPrimaryText(i);
            int i4 = 2131965011;
            if (ordinal != 0) {
                i4 = 2131965008;
            }
            Integer valueOf = Integer.valueOf(i4);
            if (valueOf != null) {
                i2 = valueOf.intValue();
            } else {
                i2 = enumC53267Nh5.A01;
            }
            c66359UCf.setSecondaryText(i2);
            c66359UCf.A04(true);
            Integer num = enumC53267Nh5.A02;
            if (num != null) {
                c66359UCf.setActionLabel(AbstractC25227BEk.A0v(this, num.intValue()), MSW.A0k(interfaceC09390do).A02, ViewOnClickListenerC55465OkK.A00(enumC53267Nh5, this, 61));
            }
            c66359UCf.A9c(new C49662Lwt(4, enumC53267Nh5, c66359UCf));
            igRadioGroup.addView(c66359UCf);
        }
        igRadioGroup.A02 = new PID(2, this, igRadioGroup);
        this.A01 = igRadioGroup;
        this.A00 = AbstractC31172DnG.A0j(view, R.id.one_tap_onboarding_bottom_button_layout);
        SpannableStringBuilder A09 = O0E.A00.A09(getActivity(), requireContext(), MSW.A0k(interfaceC09390do).A02);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setFooterText(A09);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setPrimaryActionOnClickListener(new ViewOnClickListenerC55461OkG(this, 61));
        }
        View A0S = AbstractC166997dE.A0S(view, R.id.main_container);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.bottom_banner);
        View A0S3 = AbstractC166997dE.A0S(A0S2, R.id.banner_close);
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), MSW.A0k(interfaceC09390do).A01, new C30184DRp(2, A0S, A0S2, this), 52);
        ViewOnClickListenerC55465OkK.A01(A0S3, 60, A0S2, this);
        C50949MfI A0k = MSW.A0k(interfaceC09390do);
        OH4 oh4 = A0k.A03;
        String str = A0k.A06;
        C14360o3.A0B(str, 0);
        InterfaceC58268PsC.A03(oh4.A00, str, "lead_gen_one_tap_setup", "one_tap_setup_impression");
        C50949MfI A0k2 = MSW.A0k(interfaceC09390do);
        FragmentActivity requireActivity = requireActivity();
        LeadGenFormData leadGenFormData = A0k2.A05;
        leadGenFormData.A07 = true;
        leadGenFormData.A09 = true;
        leadGenFormData.A06 = AbstractC16960so.A1M(new LeadFormCustomQuestion(EnumC53203Nfz.A04, AbstractC166997dE.A0p(requireActivity, 2131965018), C16930sl.A00));
        C57743PjW.A00(getViewLifecycleOwner(), MSW.A0k(interfaceC09390do).A00, this, 43, 52);
        C57743PjW.A00(getViewLifecycleOwner(), MSW.A0h(this.A07).A00, this, 44, 52);
    }

    public static final boolean A00(N64 n64) {
        View findViewWithTag;
        NestedScrollView nestedScrollView;
        IgRadioGroup igRadioGroup = n64.A01;
        if (igRadioGroup == null || (findViewWithTag = igRadioGroup.findViewWithTag(EnumC53267Nh5.A05)) == null || (nestedScrollView = n64.A04) == null) {
            return false;
        }
        int[] iArr = n64.A09;
        findViewWithTag.getLocationInWindow(iArr);
        int[] iArr2 = n64.A0A;
        nestedScrollView.getLocationInWindow(iArr2);
        if (iArr2[1] + nestedScrollView.getHeight() < iArr[1] + (findViewWithTag.getHeight() / 3)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return MSW.A0k(this.A08).A02;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A08;
        C50949MfI A0k = MSW.A0k(interfaceC09390do);
        OH4 oh4 = A0k.A03;
        String str = A0k.A06;
        C14360o3.A0B(str, 0);
        InterfaceC58268PsC.A02(oh4.A00, str, "lead_gen_one_tap_setup", "cancel");
        if (!AbstractC166997dE.A1Z(MSW.A0h(this.A07).A00.A02(), true)) {
            if (MSW.A0k(interfaceC09390do).A04 == EnumC53251Ngp.A06) {
                AbstractC25227BEk.A1B(this);
            } else {
                AbstractC25225BEi.A0r(requireActivity(), MSW.A0k(interfaceC09390do).A02).A06();
                return true;
            }
        }
        return true;
    }

    public N64() {
        C37015GSu c37015GSu = new C37015GSu(this, 0);
        C57552PgQ A01 = C57552PgQ.A01(this, 44);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C57552PgQ.A00(A01, enumC09460dv, 45);
        this.A08 = AbstractC25225BEi.A0a(C57552PgQ.A01(A00, 46), c37015GSu, C57534Pg8.A00(A00, null, 45), AbstractC25225BEi.A1D(C50949MfI.class));
        C57552PgQ A012 = C57552PgQ.A01(this, 43);
        InterfaceC09390do A002 = C57552PgQ.A00(C57552PgQ.A01(this, 47), enumC09460dv, 48);
        this.A07 = AbstractC25225BEi.A0a(C57552PgQ.A01(A002, 49), A012, C57534Pg8.A00(A002, null, 46), AbstractC25225BEi.A1D(C51038Mgo.class));
        this.A09 = new int[2];
        this.A0A = new int[2];
        this.A03 = true;
        this.A06 = new ViewTreeObserverOnPreDrawListenerC55503Okw(this, 10);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1573636533);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_one_tap_onboarding, viewGroup, false);
        C0f9.A09(-1314020296, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(144312982);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        C0f9.A09(1774583010, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1031251722);
        super.onStart();
        this.A05 = PZH.A01(this, MSW.A0h(this.A07).A0A, 45);
        C0f9.A09(-1299048844, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1900433499);
        super.onStop();
        this.A05 = MSY.A0r(this.A05);
        C0f9.A09(-147797542, A02);
    }
}
