package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import java.util.List;

/* renamed from: X.EKv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32308EKv extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AddObjectivesFlowSeeMoreFragment";
    public RecyclerView A00;
    public C31867DzZ A01;
    public BusinessFlowAnalyticsLogger A02;
    public C31500Dsk A03;
    public IgdsBottomButtonLayout A04;
    public String A05;
    public List A06;
    public List A07;
    public InterfaceC37222GaX A08;
    public IgdsStepperHeader A09;
    public final java.util.Set A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131952331);
        AbstractC31176DnK.A1C(new Fp1(this, 60), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "add_objectives_flow_see_more_fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        InterfaceC37222GaX interfaceC37222GaX;
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        C1UC requireActivity = requireActivity();
        if (requireActivity instanceof InterfaceC37222GaX) {
            interfaceC37222GaX = (InterfaceC37222GaX) requireActivity;
        } else {
            interfaceC37222GaX = null;
        }
        this.A08 = interfaceC37222GaX;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
        this.A09 = igdsStepperHeader;
        if (igdsStepperHeader != null) {
            igdsStepperHeader.A03(0, 2, true, false);
        }
        IgdsStepperHeader igdsStepperHeader2 = this.A09;
        if (igdsStepperHeader2 != null) {
            igdsStepperHeader2.A01();
        }
        this.A01 = new C31867DzZ(this);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.A00 = A0F;
        if (A0F != null) {
            AbstractC31177DnL.A17(this, A0F);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            C31867DzZ c31867DzZ = this.A01;
            if (c31867DzZ == null) {
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            recyclerView.setAdapter(c31867DzZ);
        }
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.action_bottom_button);
        A0j.setPrimaryButtonEnabled(false);
        A0j.setPrimaryActionOnClickListener(new Fp1(this, 61));
        this.A04 = A0j;
        C31500Dsk c31500Dsk = this.A03;
        if (c31500Dsk == null) {
            str = "onboardingChecklistNetworkHelper";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C32548EUy c32548EUy = new C32548EUy(this, 8);
        C1GL c1gl = c31500Dsk.A01;
        C25621Ms A0M = AbstractC31177DnL.A0M(c31500Dsk.A00);
        A0M.A0B("business/account/get_business_objectives_connection_methods/");
        A0M.A0R(ECK.class, FTH.class);
        AbstractC31175DnJ.A1L(A0M, c32548EUy, c1gl);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public C32308EKv() {
        C0YZ A1D = AbstractC25225BEi.A1D(C31808DyS.class);
        this.A0B = AbstractC25225BEi.A0a(new X2y(this, 35), new X2y(this, 36), new C57253Pbb(16, null, this), A1D);
        this.A07 = AbstractC166987dD.A1E();
        this.A0A = AbstractC31171DnF.A0l();
        this.A0C = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(261899016);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC09390do interfaceC09390do = this.A0C;
        this.A03 = new C31500Dsk(AbstractC166987dD.A0r(interfaceC09390do), this);
        this.A05 = AbstractC31171DnF.A0Z(requireArguments);
        BusinessFlowAnalyticsLogger A00 = AbstractC35211Fg4.A00(this.A08, this, AbstractC166987dD.A0o(interfaceC09390do));
        this.A02 = A00;
        if (A00 != null) {
            A00.Clo(new Y7A("business_objectives", this.A05, null, null, null, null, null, null));
        }
        C0f9.A09(-1385959575, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2120024836);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.add_objectives_flow_see_more_fragment, viewGroup, false);
        AbstractC31180DnO.A06(inflate).setText(2131952333);
        AbstractC31176DnK.A0E(inflate).setText(2131952332);
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((C31808DyS) this.A0B.getValue()).A03, new C50259MHo(this, 39), 46);
        C0f9.A09(-903777615, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1853298034);
        super.onDestroyView();
        this.A09 = null;
        this.A00 = null;
        this.A04 = null;
        C0f9.A09(-943214330, A02);
    }
}
