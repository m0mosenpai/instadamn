package com.instagram.business.fragment;

import X.AbstractC1566171j;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC59962oe;
import X.AnonymousClass773;
import X.C08730cb;
import X.C0f9;
import X.C14360o3;
import X.C17060sy;
import X.C222015v;
import X.C25621Ms;
import X.C32548EUy;
import X.C35198Ffq;
import X.EBI;
import X.EQ3;
import X.Em1;
import X.FTO;
import X.InterfaceC111194zh;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes6.dex */
public class SupportServicePartnerSelectionFragment extends AbstractC59962oe implements InterfaceC60122ou {
    public InterfaceC111194zh A00;
    public SMBPartnerType A01;
    public EQ3 A02;
    public C35198Ffq A03;
    public UserSession A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "service_partner_selection";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        if (this.A05.equals("sticker")) {
            interfaceC56362iU.Ehk(AbstractC166997dE.A0N(this).getString(2131975007));
        } else {
            AbstractC25229BEm.A1G(interfaceC56362iU, 2131952140);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(895805237);
        super.onCreate(bundle);
        this.A02 = new EQ3(this);
        Bundle requireArguments = requireArguments();
        this.A04 = AbstractC31176DnK.A0S(this);
        this.A06 = AbstractC31173DnH.A0j(requireArguments, "args_session_id");
        this.A05 = AbstractC31173DnH.A0j(requireArguments, "args_entry_point");
        Serializable serializable = requireArguments.getSerializable("args_service_type");
        serializable.getClass();
        this.A01 = (SMBPartnerType) serializable;
        this.A03 = new C35198Ffq(this, this.A04, this.A06, this.A05);
        UserSession userSession = this.A04;
        C08730cb c08730cb = C17060sy.A01;
        this.A08 = AbstractC167007dF.A1W(AbstractC1566171j.A00(this.A01, c08730cb.A01(userSession)));
        this.A00 = AbstractC1566171j.A00(this.A01, c08730cb.A01(this.A04));
        C0f9.A09(1304577856, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1720926573);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.support_service_partner_selection_fragment);
        C0f9.A09(52117911, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        C222015v c222015v;
        C25621Ms A0M;
        String str;
        super.onViewCreated(view, bundle);
        this.mLoadingSpinner = (SpinnerImageView) view.findViewById(R.id.loading_indicator);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.mRecyclerView = A0F;
        A0F.setAdapter(this.A02);
        if (this.A07 == null) {
            AbstractC167007dF.A0w(this.mLoadingSpinner);
            C32548EUy c32548EUy = new C32548EUy(this, 29);
            SMBPartnerType sMBPartnerType = this.A01;
            if (sMBPartnerType.equals(SMBPartnerType.A09)) {
                UserSession userSession = this.A04;
                z = false;
                C14360o3.A0B(userSession, 0);
                c222015v = null;
                A0M = AbstractC31177DnL.A0M(userSession);
                str = "business/instant_experience/get_support_button_partners_bundle/";
            } else if (sMBPartnerType.equals(SMBPartnerType.A06)) {
                UserSession userSession2 = this.A04;
                z = false;
                C14360o3.A0B(userSession2, 0);
                c222015v = null;
                A0M = AbstractC31177DnL.A0M(userSession2);
                str = "business/instant_experience/get_delivery_button_partners_bundle/";
            }
            A0M.A0E = str;
            A0M.A0P(c222015v, EBI.class, FTO.class, z);
            A0M.A0R = true;
            AbstractC31175DnJ.A1L(A0M, c32548EUy, this);
        }
        TextView A06 = AbstractC31180DnO.A06(view);
        if (this.A05.equals("sticker")) {
            i = 2131973329;
            if (this.A01.equals(SMBPartnerType.A09)) {
                i = 2131973330;
            }
        } else {
            i = 2131973328;
        }
        AbstractC25227BEk.A12(A06, this, i);
        TextView A0E = AbstractC31176DnK.A0E(view);
        int i2 = 2131973325;
        if (this.A05.equals("sticker")) {
            i2 = 2131973326;
            if (this.A01.equals(SMBPartnerType.A09)) {
                i2 = 2131973327;
            }
        }
        String string = getString(2131954430);
        SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, string, i2);
        AnonymousClass773.A05(A08, new Em1(Integer.valueOf(AbstractC31179DnN.A01(this)), this, 5), string);
        A0E.setText(A08);
        A0E.setHighlightColor(0);
        AbstractC25227BEk.A11(A0E);
    }
}
