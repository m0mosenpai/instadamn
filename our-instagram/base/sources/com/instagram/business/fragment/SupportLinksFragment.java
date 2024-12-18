package com.instagram.business.fragment;

import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC59962oe;
import X.AnonymousClass001;
import X.C0f9;
import X.C25621Ms;
import X.C31722DwR;
import X.C32548EUy;
import X.C35197Ffp;
import X.C35198Ffq;
import X.C55218Oeh;
import X.ECL;
import X.EVO;
import X.EnumC33415Epm;
import X.FTL;
import X.InterfaceC111194zh;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC35690FpP;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.Locale;

/* loaded from: classes6.dex */
public class SupportLinksFragment extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String A06 = AnonymousClass001.A0R(SupportLinksFragment.class.getName(), ".BACK_STACK");
    public LayoutInflater A00;
    public C35198Ffq A01;
    public UserSession A02;
    public String A03;
    public String A04;
    public boolean A05;
    public View mLoadingIndicator;
    public ViewGroup mPartnerTypeRowsContainer;
    public ViewGroup mProfileDisplayRow;
    public View mSelectButtonRow;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "support_links_fragment";
    }

    public static void A00(SupportLinksFragment supportLinksFragment) {
        View view;
        String string;
        if (supportLinksFragment.A05) {
            Context context = supportLinksFragment.getContext();
            InterfaceC111194zh Ayj = AbstractC31174DnI.A0m(supportLinksFragment.A02).Ayj();
            if (Ayj != null && Ayj.AyS() != null) {
                string = Ayj.AyS();
            } else {
                context.getClass();
                string = context.getString(2131954433);
            }
            AbstractC31175DnJ.A09(supportLinksFragment.mProfileDisplayRow, R.id.shown_button_text).setText(string);
            supportLinksFragment.mProfileDisplayRow.setVisibility(0);
            view = supportLinksFragment.mSelectButtonRow;
        } else {
            supportLinksFragment.mSelectButtonRow.setVisibility(0);
            view = supportLinksFragment.mProfileDisplayRow;
        }
        view.setVisibility(8);
    }

    public static boolean A01(InterfaceC111194zh interfaceC111194zh, String str) {
        if (interfaceC111194zh != null && interfaceC111194zh.Aj3() != null && !interfaceC111194zh.Aj3().equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            Object obj = XIGIGBoostCallToAction.A02.get(interfaceC111194zh.Aj3().toUpperCase(Locale.US));
            if (obj == null) {
                obj = XIGIGBoostCallToAction.A0S;
            }
            return C55218Oeh.A05().contains(obj);
        }
        return EnumC33415Epm.A07.A01.equals(str);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ?? obj = new Object();
        C35197Ffp.A01(AbstractC166997dE.A0N(this), obj, 2131975003);
        C31722DwR.A00(ViewOnClickListenerC35690FpP.A00(this, 42), interfaceC56362iU, obj).setEnabled(true);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(545035804);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC31176DnK.A0S(this);
        this.A03 = AbstractC31173DnH.A0j(requireArguments, "args_entry_point");
        String A0j = AbstractC31173DnH.A0j(requireArguments, "args_session_id");
        this.A04 = A0j;
        this.A01 = new C35198Ffq(this, this.A02, A0j, this.A03);
        this.A05 = false;
        registerLifecycleListener(new EVO(getActivity()));
        C0f9.A09(-1761377935, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1521402440);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.support_links_setup_fragment);
        this.A00 = layoutInflater;
        C0f9.A09(-1380120416, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(view, R.id.links_setup_headline);
        A0Q.setImageResource(R.drawable.ig_illustrations_illo_business_flare_refresh);
        A0Q.setHeadline(2131952143);
        A0Q.setBody(2131975004);
        this.mSelectButtonRow = view.requireViewById(R.id.action_button_section_title);
        this.mProfileDisplayRow = AbstractC31173DnH.A0F(view, R.id.profile_display_options_row);
        A00(this);
        ViewOnClickListenerC35690FpP.A01(this.mProfileDisplayRow, 41, this);
        this.mPartnerTypeRowsContainer = AbstractC31173DnH.A0F(view, R.id.partner_type_rows_container);
        this.mLoadingIndicator = view.requireViewById(R.id.loading_spinner);
        UserSession userSession = this.A02;
        C32548EUy c32548EUy = new C32548EUy(this, 25);
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        A0C.A0B("business/profile_action_buttons/get_all_cta_categories_info/");
        A0C.A0R(ECL.class, FTL.class);
        AbstractC31175DnJ.A1L(A0C, c32548EUy, this);
    }
}
