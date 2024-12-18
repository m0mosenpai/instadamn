package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* loaded from: classes7.dex */
public final class HDO extends C53Z implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DisclaimerPageFragment";
    public String A00;
    public String A01;
    public String A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "disclaimer_page";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C56352iT AYT = ((BaseFragmentActivity) requireActivity()).AYT();
        AYT.getClass();
        AYT.A0T();
        TextView A0e = AbstractC166987dD.A0e(view, R.id.page_voice);
        C57012jc A0V = AbstractC31177DnL.A0V(view, R.id.text_view_stub);
        C57012jc A0V2 = AbstractC31177DnL.A0V(view, R.id.web_view_stub);
        String str = this.A01;
        if (str != null) {
            String str2 = this.A02;
            if (str2 != null) {
                UserSession session = getSession();
                C14240no c14240no = new C14240no(getChildFragmentManager());
                A0e.setText(AbstractC166997dE.A0r(A0e.getResources(), str.toLowerCase(), 2131960959));
                SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig(str2, (String) null, (String) null, (String) null, false, false, false, false, false, true, false, true, true, false, false, false);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putParcelable(MSV.A00(2), simpleWebViewConfig);
                AbstractC31173DnH.A1C(A0b, session);
                AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                abstractC59962oe.setArguments(A0b);
                c14240no.A09(abstractC59962oe, R.id.web_view_fragment);
                c14240no.A00();
                A0V2.A01().setVisibility(0);
                return;
            }
            String str3 = this.A00;
            if (str3 == null) {
                return;
            }
            A0e.setText(AbstractC166997dE.A0r(A0e.getResources(), str.toLowerCase(), 2131960959));
            ((TextView) A0V.A01()).setText(str3);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131960958);
        interfaceC56362iU.Ehg(new C35026Fbz(C05F.A00).A01());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1383940749);
        super.onCreate(bundle);
        this.A01 = requireArguments().getString("DisclaimerPageFragment.TITLE");
        this.A00 = requireArguments().getString("DisclaimerPageFragment.TEXT");
        this.A02 = requireArguments().getString("DisclaimerPageFragment.URL");
        C0f9.A09(-1637261349, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(992534044);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_disclaimer_page);
        C0f9.A09(-1928763940, A02);
        return A0A;
    }
}
