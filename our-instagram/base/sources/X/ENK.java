package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes6.dex */
public final class ENK extends C38K implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CitySearchFragment";
    public C32405EPg A00;
    public BusinessFlowAnalyticsLogger A01;
    public InterfaceC37222GaX A02;
    public UserSession A03;
    public SearchEditText A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09 = new HandlerC31740Dwt(Looper.getMainLooper(), this, 1);

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ViewOnClickListenerC35690FpP A00 = ViewOnClickListenerC35690FpP.A00(this, 4);
        if (this.A08) {
            ?? obj = new Object();
            C35197Ffp.A02(AbstractC166997dE.A0N(this), obj, 2131955173);
            ActionButton A002 = C31722DwR.A00(A00, interfaceC56362iU, obj);
            A002.setButtonResource(R.drawable.instagram_arrow_cw_pano_outline_24);
            AbstractC31173DnH.A1E(A002, this, 2131972101);
            return;
        }
        interfaceC56362iU.Efu(2131955173);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.EkH(A00, true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "business_city_search";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A07 && (businessFlowAnalyticsLogger = this.A01) != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("page_import_info_city_town", this.A06, null, null, null, null, null, null));
            return false;
        }
        return false;
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A03;
    }

    public final void A0b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Handler handler = this.A09;
            if (handler.hasMessages(1)) {
                handler.removeMessages(1);
            }
            handler.sendMessageDelayed(handler.obtainMessage(1, str), 300L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A02 = AbstractC35211Fg4.A01(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-512637828);
        super.onCreate(bundle);
        this.A06 = AbstractC31180DnO.A0b(this);
        this.A00 = new C32405EPg(requireContext(), this);
        this.A08 = requireArguments().getBoolean("BusinessLocationFragment.EXTRA_SHOULD_SHOW_IN_MODAL");
        this.A03 = AbstractC31176DnK.A0S(this);
        C60462pV c60462pV = new C60462pV();
        c60462pV.A0E(new EVO(getActivity()));
        A0a(c60462pV);
        BusinessFlowAnalyticsLogger A00 = AbstractC35211Fg4.A00(this.A02, this, this.A03);
        this.A01 = A00;
        if (A00 != null) {
            A00.Clo(new Y7A("page_import_info_city_town", this.A06, null, null, null, null, null, null));
        }
        C0f9.A09(-799310722, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1561778261);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.city_search_fragment);
        C0f9.A09(-1785230283, A02);
        return A0A;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1058252905);
        super.onResume();
        this.A04.requestFocus();
        AbstractC13880nE.A0R(this.A04);
        C0f9.A09(159950364, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1191392317);
        super.onStop();
        AbstractC31171DnF.A16(this);
        C0f9.A09(-1973735218, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A04 = (SearchEditText) view.requireViewById(R.id.search_edit_text);
        ColorFilter A09 = AbstractC31174DnI.A09(requireContext(), R.color.grey_5);
        this.A04.setClearButtonColorFilter(A09);
        AbstractC167027dH.A0d(A09, this.A04.getCompoundDrawablesRelative()[0]);
        this.A04.addTextChangedListener(C106904rr.A00(this.A03));
        C31703Dw8.A00(this.A04, this, 0);
        A0U(this.A00);
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setOnScrollListener(new LRB(this, 0));
    }
}
