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

/* renamed from: X.EKu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32307EKu extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AddObjectivesFlowConnectFragment";
    public RecyclerView A00;
    public C31868Dza A01;
    public BusinessFlowAnalyticsLogger A02;
    public C31500Dsk A03;
    public IgdsBottomButtonLayout A04;
    public String A05;
    public List A06;
    public InterfaceC37222GaX A07;
    public IgdsStepperHeader A08;
    public final java.util.Set A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC41501vz A0C;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131952331);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A01 = R.drawable.instagram_arrow_left_pano_outline_24;
        AbstractC31176DnK.A1C(new Fp1(this, 58), A0B, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "add_objectives_flow_connect_fragment";
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
        this.A07 = interfaceC37222GaX;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
        this.A08 = igdsStepperHeader;
        if (igdsStepperHeader != null) {
            igdsStepperHeader.A03(1, 2, true, false);
        }
        IgdsStepperHeader igdsStepperHeader2 = this.A08;
        if (igdsStepperHeader2 != null) {
            igdsStepperHeader2.A01();
        }
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.action_bottom_button);
        A0j.setPrimaryButtonEnabled(false);
        A0j.setPrimaryActionOnClickListener(new Fp1(this, 59));
        this.A04 = A0j;
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((C31808DyS) this.A0A.getValue()).A02, new C50369MLw(16, this, view), 45);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A02;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("business_objectives", this.A05, null, null, null, null, null, null));
            return false;
        }
        return false;
    }

    public C32307EKu() {
        C0YZ A1D = AbstractC25225BEi.A1D(C31808DyS.class);
        this.A0A = AbstractC25225BEi.A0a(new X2y(this, 33), new X2y(this, 34), new C57253Pbb(15, null, this), A1D);
        this.A09 = AbstractC31171DnF.A0l();
        this.A0C = C31650DvG.A00(this, 2);
        this.A0B = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1252348747);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC09390do interfaceC09390do = this.A0B;
        this.A03 = new C31500Dsk(AbstractC166987dD.A0r(interfaceC09390do), this);
        C41451vu.A01.A02(this.A0C, C0KL.class);
        this.A05 = AbstractC31171DnF.A0Z(requireArguments);
        BusinessFlowAnalyticsLogger A00 = AbstractC35211Fg4.A00(this.A07, this, AbstractC166987dD.A0o(interfaceC09390do));
        this.A02 = A00;
        if (A00 != null) {
            A00.Clo(new Y7A("business_objectives", this.A05, null, null, null, null, null, null));
        }
        C0f9.A09(-1755835421, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-138260677);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.add_objectives_flow_connect_fragment, viewGroup, false);
        AbstractC31180DnO.A06(inflate).setText(2131952329);
        AbstractC31176DnK.A0E(inflate).setText(2131952328);
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((C31808DyS) this.A0A.getValue()).A03, new C50259MHo(this, 38), 45);
        C0f9.A09(-1511279716, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(770164341);
        super.onDestroyView();
        this.A08 = null;
        this.A00 = null;
        C41451vu.A01.A03(this.A0C, C0KL.class);
        C0f9.A09(-1319679847, A02);
    }
}
