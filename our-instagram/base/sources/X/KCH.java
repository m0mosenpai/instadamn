package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;

/* loaded from: classes8.dex */
public final class KCH extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BoostMediaPickerFragment";
    public C44807JsZ A00;
    public IgSegmentedTabLayout2 A01;
    public Exception A02;
    public ViewPager2 A03;
    public InterfaceC56362iU A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final C43748JWj A0C;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        this.A04 = interfaceC56362iU;
        interfaceC56362iU.EkS(true);
        A00(((C44544Jmo) this.A0B.getValue()).A01(), this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "boost_media_picker_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C64P c64p = (C64P) AbstractC166997dE.A0R(view, R.id.action_button);
        c64p.setPrimaryAction(getString(2131968535), new ViewOnClickListenerC48064LPp(this, 25));
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.media_picker_view_pager);
        if (viewPager2 != null) {
            viewPager2.A05(this.A0C);
            C44807JsZ c44807JsZ = new C44807JsZ(this, AbstractC166987dD.A0r(this.A0A));
            this.A00 = c44807JsZ;
            viewPager2.setAdapter(c44807JsZ);
            IgSegmentedTabLayout2 igSegmentedTabLayout2 = (IgSegmentedTabLayout2) view.findViewById(R.id.media_type_segmented_tab);
            igSegmentedTabLayout2.setViewPager(viewPager2);
            this.A01 = igSegmentedTabLayout2;
        } else {
            viewPager2 = null;
        }
        this.A03 = viewPager2;
        AbstractC166987dD.A1Z(new MCK(c64p, this, (InterfaceC23621Ds) null, 6), AbstractC25229BEm.A0a(this));
        InterfaceC09390do interfaceC09390do = this.A0A;
        C70399WUb A0N = AbstractC43594JPz.A0N(interfaceC09390do);
        String A15 = AbstractC25225BEi.A15(this.A06);
        VG4 vg4 = VG4.A11;
        A0N.A0T(A15, vg4.toString());
        InterfaceC09390do interfaceC09390do2 = this.A0B;
        ((C44544Jmo) interfaceC09390do2.getValue()).A04((EnumC68121VCe) ((C45124Jxt) ((C44544Jmo) interfaceC09390do2.getValue()).A01.getValue()).A05);
        if (this.A02 != null) {
            AbstractC43594JPz.A0N(interfaceC09390do).A0Z(vg4.toString(), "throw_exception", this.A02);
            this.A02 = null;
            AbstractC167007dF.A0J().postDelayed(new RunnableC49844Lzp(this), 1000L);
        }
    }

    public static final void A00(BoostMediaPickerTabType boostMediaPickerTabType, KCH kch) {
        if (boostMediaPickerTabType != null && boostMediaPickerTabType.ordinal() == 3) {
            InterfaceC56362iU interfaceC56362iU = kch.A04;
            if (interfaceC56362iU != null) {
                interfaceC56362iU.Efu(2131966121);
                return;
            }
            return;
        }
        InterfaceC56362iU interfaceC56362iU2 = kch.A04;
        if (interfaceC56362iU2 == null) {
            return;
        }
        interfaceC56362iU2.EaW(interfaceC56362iU2.C94().getText(), "");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C70399WUb A0N = AbstractC43594JPz.A0N(this.A0A);
        String obj = VG4.A11.toString();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0N.A05, "promoted_posts_cancel");
        if (A0f.isSampled()) {
            A0f.AAP("waterfall_id", A0N.A03);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A03("is_business_user_access_token_enabled", AbstractC166997dE.A0b());
            c0Zx.A03("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(A0N.A04));
            A0f.AAQ(c0Zx, "configurations");
            AbstractC31171DnF.A1G(A0f, A0N.A01);
            A0f.AAP("m_pk", A0N.A02);
            A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, obj);
            A0f.Cht();
            return false;
        }
        return false;
    }

    public KCH() {
        X2y x2y = new X2y(this, 25);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2y(new X2y(this, 21), 22));
        this.A0B = AbstractC25225BEi.A0a(new X2y(A00, 23), x2y, new C57253Pbb(12, null, A00), AbstractC25225BEi.A1D(C44544Jmo.class));
        this.A06 = JQ0.A0q(this, 17);
        this.A05 = JQ0.A0q(this, 16);
        this.A09 = JQ0.A0q(this, 20);
        this.A07 = JQ0.A0q(this, 18);
        this.A08 = JQ0.A0q(this, 19);
        this.A0C = new C43748JWj(this, 3);
        this.A0A = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(779330747);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_media_picker_revamp_fragment, false);
        C0f9.A09(963921973, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-285041904);
        super.onDestroyView();
        ViewPager2 viewPager2 = this.A03;
        if (viewPager2 != null) {
            viewPager2.A05.A00.remove(this.A0C);
        }
        this.A01 = null;
        this.A03 = null;
        this.A00 = null;
        A00(null, this);
        this.A04 = null;
        C0f9.A09(764776118, A02);
    }
}
