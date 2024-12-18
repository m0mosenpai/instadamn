package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ENF extends C38K implements InterfaceC60122ou, CallerContextable, GWT {
    public static final CallerContext A05 = CallerContext.A00(ENF.class);
    public static final String __redex_internal_original_name = "FBIGTVPageListFragment";
    public View A00;
    public ImageView A01;
    public C32410EPl A02;
    public UserSession A03;
    public View A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fb_igtv_page_list_fragment";
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A03;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ViewOnClickListenerC35690FpP.A02(AbstractC31174DnI.A0K(), interfaceC56362iU, this, 14);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = getString(2131961124);
        AbstractC31176DnK.A1B(ViewOnClickListenerC35690FpP.A00(this, 15), A0B, interfaceC56362iU);
        C35026Fbz c35026Fbz = new C35026Fbz(C05F.A00);
        c35026Fbz.A02(requireContext().getColor(R.color.design_dark_default_color_on_background));
        C35026Fbz.A00(interfaceC56362iU, c35026Fbz);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-693724464);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = AbstractC31176DnK.A0S(this);
        Context requireContext = requireContext();
        this.A02 = new C32410EPl(requireContext, this, this, requireArguments.getString(MSV.A00(1472)), AbstractC166997dE.A0p(requireContext, 2131968558), AbstractC166997dE.A0q(requireContext.getResources(), 2131956624));
        C0f9.A09(-998037026, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1337441966);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.igtv_page_list_fragment);
        C0f9.A09(-2026288108, A02);
        return A0A;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1028534278);
        super.onResume();
        C0f9.A09(247803771, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A00 = view.requireViewById(R.id.page_list_group);
        this.A01 = AbstractC31173DnH.A0I(view, R.id.refresh);
        View requireViewById = view.requireViewById(R.id.no_admin_pages_view);
        this.A04 = requireViewById;
        requireViewById.setVisibility(8);
        Bundle requireArguments = requireArguments();
        AbstractC166997dE.A0T(this.A04, R.id.title_text).setText(requireArguments.getString(MSV.A00(1474)));
        AbstractC166997dE.A0T(this.A04, R.id.explanation_text).setText(requireArguments.getString(MSV.A00(1473)));
        this.A01.setVisibility(8);
        ViewOnClickListenerC35690FpP.A01(this.A01, 13, this);
        this.A00.setVisibility(0);
        A0U(this.A02);
        AbstractC31557Dth.A01(this, this.A02.isEmpty());
    }
}
