package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.leadads.ui.LeadAdsBottomSheetNavHeader;
import com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Ncu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53022Ncu extends AbstractC52152N6c implements InterfaceC60122ou, InterfaceC60112ot {
    public static final String __redex_internal_original_name = "LeadAdsFormContainerFragment";
    public IgFrameLayout A00;
    public SpinnerImageView A01;
    public LeadAdsBottomSheetNavHeader A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A04;
    public final String A05;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (((com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel) r3.A04.getValue()).A0C != false) goto L8;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.0h2 r1 = r3.getChildFragmentManager()
            r0 = 2131435327(0x7f0b1f3f, float:1.8492493E38)
            androidx.fragment.app.Fragment r2 = r1.A0O(r0)
            boolean r1 = r2 instanceof X.InterfaceC60122ou
            r0 = 0
            if (r1 == 0) goto L44
            X.2ou r2 = (X.InterfaceC60122ou) r2
            if (r2 == 0) goto L25
            X.0do r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel r0 = (com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel) r0
            boolean r1 = r0.A0C
            r0 = 1
            if (r1 == 0) goto L26
        L25:
            r0 = 0
        L26:
            r4.EkF(r0)
            if (r0 == 0) goto L30
            if (r2 == 0) goto L30
            r2.configureActionBar(r4)
        L30:
            X.0do r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel r0 = (com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel) r0
            X.0UO r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            X.Pkz r0 = (X.InterfaceC57833Pkz) r0
            A00(r3, r0)
            return
        L44:
            r2 = r0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53022Ncu.configureActionBar(X.2iU):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC53712dA interfaceC53712dA;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (LeadAdsBottomSheetNavHeader) view.findViewById(R.id.lead_form_header_for_bottom_sheet);
        this.A01 = (SpinnerImageView) view.findViewById(R.id.loading_spinner);
        this.A00 = (IgFrameLayout) view.findViewById(R.id.lead_form_container);
        SpinnerImageView spinnerImageView = this.A01;
        if (spinnerImageView != null) {
            ViewOnClickListenerC55455Ok9.A01(spinnerImageView, 56, this);
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new PZP(viewLifecycleOwner, c07s, this, null, 16), C07Y.A00(viewLifecycleOwner));
        C1UC activity = getActivity();
        if ((activity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) activity) != null) {
            interfaceC53712dA.EfL(8);
        }
    }

    public static final void A00(C53022Ncu c53022Ncu, InterfaceC57833Pkz interfaceC57833Pkz) {
        C51838Mvg c51838Mvg;
        int A0G;
        if ((interfaceC57833Pkz instanceof C51838Mvg) && (c51838Mvg = (C51838Mvg) interfaceC57833Pkz) != null) {
            if (!((LeadAdsPostClickEntryViewModel) c53022Ncu.A04.getValue()).A0C) {
                AbstractC167007dF.A0x(c53022Ncu.A02);
                return;
            }
            AbstractC167007dF.A0w(c53022Ncu.A02);
            LeadAdsBottomSheetNavHeader leadAdsBottomSheetNavHeader = c53022Ncu.A02;
            if (leadAdsBottomSheetNavHeader == null) {
                return;
            }
            String str = c51838Mvg.A01;
            EnumC53270Nh8 enumC53270Nh8 = c51838Mvg.A00;
            O3Q o3q = new O3Q(c53022Ncu);
            boolean A1R = AbstractC167007dF.A1R(0, str, enumC53270Nh8);
            leadAdsBottomSheetNavHeader.A02.setText(str);
            Integer num = enumC53270Nh8.A00;
            IgImageView igImageView = leadAdsBottomSheetNavHeader.A03;
            int i = 0;
            igImageView.setVisibility(MSY.A04(num));
            if (num != null) {
                igImageView.setImageResource(num.intValue());
            }
            igImageView.setOnClickListener(ViewOnClickListenerC55455Ok9.A00(o3q, 60));
            IgTextView igTextView = leadAdsBottomSheetNavHeader.A01;
            if (!enumC53270Nh8.A01) {
                i = 8;
            }
            igTextView.setVisibility(i);
            igTextView.setOnClickListener(ViewOnClickListenerC55455Ok9.A00(o3q, 61));
            int ordinal = enumC53270Nh8.ordinal();
            if (ordinal != 0 && ordinal != A1R) {
                A0G = leadAdsBottomSheetNavHeader.A00;
            } else {
                A0G = AbstractC53242c7.A0G(AbstractC166997dE.A0L(leadAdsBottomSheetNavHeader), R.attr.actionBarButtonWidth);
            }
            AbstractC43592JPx.A1F(leadAdsBottomSheetNavHeader, A0G);
        }
    }

    @Override // X.InterfaceC86363t8
    public final void CwR(Integer num, float f) {
        LeadAdsPostClickEntryViewModel leadAdsPostClickEntryViewModel = (LeadAdsPostClickEntryViewModel) this.A04.getValue();
        EnumC53270Nh8 enumC53270Nh8 = EnumC53270Nh8.A05;
        C14360o3.A0B(enumC53270Nh8, 0);
        leadAdsPostClickEntryViewModel.A08.Egh(enumC53270Nh8);
    }

    @Override // X.InterfaceC86363t8
    public final void D5p(Integer num) {
        LeadAdsPostClickEntryViewModel leadAdsPostClickEntryViewModel = (LeadAdsPostClickEntryViewModel) this.A04.getValue();
        EnumC53270Nh8 enumC53270Nh8 = EnumC53270Nh8.A05;
        C14360o3.A0B(enumC53270Nh8, 0);
        leadAdsPostClickEntryViewModel.A08.Egh(enumC53270Nh8);
    }

    @Override // X.InterfaceC86363t8
    public final void DId(Integer num) {
        EnumC53270Nh8 enumC53270Nh8;
        AbstractC52562NNi abstractC52562NNi;
        ViewPager2 viewPager2;
        LeadAdsPostClickEntryViewModel leadAdsPostClickEntryViewModel = (LeadAdsPostClickEntryViewModel) this.A04.getValue();
        Fragment A0O = getChildFragmentManager().A0O(R.id.lead_form_container);
        if (!(A0O instanceof C52573NNt) || (abstractC52562NNi = (AbstractC52562NNi) A0O) == null || ((viewPager2 = abstractC52562NNi.A00) != null && viewPager2.A00 == 0)) {
            enumC53270Nh8 = EnumC53270Nh8.A06;
        } else {
            enumC53270Nh8 = EnumC53270Nh8.A07;
        }
        leadAdsPostClickEntryViewModel.A08.Egh(enumC53270Nh8);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C53022Ncu() {
        C57554PgS A01 = C57554PgS.A01(this, 4);
        InterfaceC09390do A00 = C57554PgS.A00(C57554PgS.A01(this, 1), EnumC09460dv.A02, 2);
        this.A04 = AbstractC25225BEi.A0a(C57554PgS.A01(A00, 3), A01, C57534Pg8.A00(A00, null, 5), AbstractC25225BEi.A1D(LeadAdsPostClickEntryViewModel.class));
        this.A05 = "lead_ad_question_page";
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        InterfaceC60112ot interfaceC60112ot;
        InterfaceC08430c6 A0O = getChildFragmentManager().A0O(R.id.lead_form_container);
        if ((A0O instanceof InterfaceC60112ot) && (interfaceC60112ot = (InterfaceC60112ot) A0O) != null && interfaceC60112ot.CPM()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC08430c6 A0O = getChildFragmentManager().A0O(R.id.lead_form_container);
        if (A0O instanceof InterfaceC60072op) {
            return ((InterfaceC60072op) A0O).onBackPressed();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(305345856);
        super.onCreate(bundle);
        EVO.A01(this);
        C0f9.A09(938760503, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(777898105);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_consumer_initialization_view, viewGroup, false);
        C0f9.A09(-433985182, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-588075035);
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        C0f9.A09(175260693, A02);
    }
}
