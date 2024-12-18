package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

/* renamed from: X.EIa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32242EIa extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BoostGuidanceBottomSheetFragment";
    public C31886Dzs A00;
    public BusinessFlowAnalyticsLogger A01;
    public C31500Dsk A02;
    public String A03;
    public InterfaceC37222GaX A04;
    public final String A06 = "boost_guidance_bottom_sheet";
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

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
        this.A04 = interfaceC37222GaX;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        String str = this.A03;
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A05;
        this.A00 = new C31886Dzs(requireContext, requireActivity, businessFlowAnalyticsLogger, this, AbstractC166987dD.A0r(interfaceC09390do), str, "boost_guidance_bottom_sheet", true);
        View requireViewById = view.requireViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        AbstractC31178DnM.A0z(this, recyclerView);
        C14360o3.A07(requireViewById);
        C31886Dzs c31886Dzs = this.A00;
        if (c31886Dzs == null) {
            C14360o3.A0F("boostGuidanceAdapter");
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(c31886Dzs);
        C31500Dsk c31500Dsk = new C31500Dsk(AbstractC166987dD.A0r(interfaceC09390do), this);
        this.A02 = c31500Dsk;
        C32548EUy c32548EUy = new C32548EUy(this, 9);
        C1GL c1gl = c31500Dsk.A01;
        C25621Ms A0M = AbstractC31177DnL.A0M(c31500Dsk.A00);
        A0M.A0B("business/account/get_boost_guidance_content/");
        A0M.A0R(EBD.class, FTG.class);
        AbstractC31175DnJ.A1L(A0M, c32548EUy, c1gl);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1097315709);
        super.onCreate(bundle);
        this.A03 = AbstractC31180DnO.A0b(this);
        BusinessFlowAnalyticsLogger A00 = AbstractC35211Fg4.A00(this.A04, this, AbstractC166987dD.A0o(this.A05));
        this.A01 = A00;
        if (A00 != null) {
            A00.Clo(new Y7A("boost_guidance_bottom_sheet", this.A03, null, null, null, null, null, null));
        }
        C0f9.A09(-492798736, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2032852209);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.boost_guidance_list_fragment, false);
        C0f9.A09(-934890830, A02);
        return A0R;
    }
}
