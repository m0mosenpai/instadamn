package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.Bsl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26823Bsl extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SchoolTabFragment";
    public EnumC39642HiX A00 = EnumC39642HiX.PROFILE_BIO;
    public String A01;
    public final C56039OuB A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(this.A01);
        interfaceC56362iU.EkS(true);
        if (AbstractC167007dF.A1Z(this.A0E)) {
            C3LO c3lo = new C3LO();
            c3lo.A06 = R.drawable.instagram_settings_pano_outline_24;
            c3lo.A05 = 2131966021;
            c3lo.A0G = ViewOnClickListenerC28666ClE.A00(this, 31);
            c3lo.A0N = true;
            interfaceC56362iU.AA9(new C3LY(c3lo));
            C3LO c3lo2 = new C3LO();
            c3lo2.A06 = R.drawable.instagram_direct_pano_outline_24;
            c3lo2.A05 = 2131964644;
            c3lo2.A0G = ViewOnClickListenerC28666ClE.A00(this, 30);
            c3lo2.A0N = true;
            View AA9 = interfaceC56362iU.AA9(new C3LY(c3lo2));
            if (this.A01.length() > 0) {
                ((C64742wY) this.A08.getValue()).A00(AA9, QPTooltipAnchor.A1A, (AbstractC55352ga) this.A07.getValue());
                return;
            }
            return;
        }
        interfaceC56362iU.Eha(ViewOnClickListenerC28666ClE.A00(this, 29), R.drawable.instagram_more_vertical_pano_outline_24).setColorFilter(C3DY.A00(AbstractC53242c7.A0F(requireContext(), R.attr.textColorPrimary)));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "schooltab_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC25226BEj.A12(this.A0A).A03(this.A00, C8n.DIRECTORY);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 2), C07Y.A00(viewLifecycleOwner));
        ((AbstractC55352ga) this.A07.getValue()).DiZ();
    }

    public static final void A00(C26823Bsl c26823Bsl) {
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A0D = AbstractC167007dF.A0f(c26823Bsl.requireActivity(), c26823Bsl.A01, 2131972295);
        c146106i8.A0R = true;
        AbstractC166997dE.A1O(c41451vu, c146106i8.A00());
        AbstractC25226BEj.A1Q(c26823Bsl);
    }

    public static final void A01(C26823Bsl c26823Bsl) {
        AbstractC12990ll A0o = AbstractC166987dD.A0o(c26823Bsl.A0B);
        C6XJ c6xj = new C6XJ(c26823Bsl.requireActivity(), AbstractC166987dD.A0b(), A0o, ModalActivity.class, "school_settings");
        c6xj.A08();
        c6xj.A0A(c26823Bsl.requireActivity(), 7001);
    }

    public static final void A02(C26823Bsl c26823Bsl) {
        C34726FRp A08 = C28531Zo.A04.A02.A08(AbstractC166987dD.A0r(c26823Bsl.A0B), C2EY.A1Y, "schooltab_fragment");
        A08.A01 = new C29270CvR();
        A08.A06("as");
        A08.A01();
        DirectShareSheetFragment A00 = A08.A00();
        C3DN A002 = C3DN.A00.A00(c26823Bsl.getActivity());
        if (A002 != null) {
            A002.A0K(A00);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25226BEj.A12(this.A0A).A04(this.A00, C8n.DIRECTORY);
        return false;
    }

    public C26823Bsl() {
        X30 x30 = new X30(this, 22);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X30(new X30(this, 17), 18));
        this.A0F = AbstractC25225BEi.A0a(new X30(A00, 19), x30, new C57252Pba(10, null, A00), AbstractC25225BEi.A1D(C51015MgN.class));
        this.A01 = "";
        this.A06 = AbstractC09440dt.A01(new X30(this, 7));
        this.A0E = AbstractC09440dt.A01(new X30(this, 21));
        this.A05 = C1XM.A00(new X30(this, 6));
        this.A04 = C1XM.A00(new X30(this, 5));
        this.A0C = C1XM.A00(new X30(this, 16));
        this.A03 = C1XM.A00(C29820DDm.A00);
        this.A08 = C1XM.A00(new X30(this, 13));
        this.A07 = C1XM.A00(new X30(this, 12));
        this.A02 = new C56039OuB(this, 2);
        this.A0D = AbstractC09440dt.A01(new X30(this, 20));
        this.A09 = AbstractC09440dt.A01(new X30(this, 14));
        this.A0A = AbstractC09440dt.A01(new X30(this, 15));
        this.A0B = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-816246407);
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            ((IgFragmentActivity) requireActivity).registerOnActivityResultListener(this.A02);
        }
        ((C51015MgN) this.A0F.getValue()).A01(0);
        C0f9.A09(-1334209165, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(897603333);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30482DbR.A00(this, 6), 599289769);
        C0f9.A09(-1345555394, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(989673599);
        super.onDestroy();
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            ((IgFragmentActivity) requireActivity).unregisterOnActivityResultListener(this.A02);
        }
        C0f9.A09(1960744287, A02);
    }
}
