package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ENO extends C38K implements InterfaceC77483dY, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SupportInboxDetailFragmentImpl";
    public UserSession A00;
    public IgdsBottomButtonLayout A01;
    public C189478aR A02;
    public EPY A03;
    public EDI A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public EnumC33325EoK A09;
    public final InterfaceC41501vz A0A = new C36155FxU(this, 30);

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "support_inbox_detail_fragment";
    }

    public static void A01(ENO eno) {
        UserSession userSession = eno.A00;
        String str = eno.A06;
        String str2 = eno.A05;
        String str3 = eno.A07;
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        A0C.A0B("reports/support_info_request/");
        A0C.A0R(EDI.class, C34868FYd.class);
        A0C.A9s("reported_content_id", str);
        if (str2 != null) {
            A0C.A9s("ctrl_type", str2);
        }
        if (str3 != null) {
            A0C.A9s("ticket_id", str3);
        }
        C1ON A0N = A0C.A0N();
        C31714DwJ.A00(A0N, eno, 26);
        C1GJ.A03(A0N);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00af. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00db. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.ENO r5) {
        /*
            X.EDI r0 = r5.A04
            r0.getClass()
            android.content.Context r1 = r5.requireContext()
            com.instagram.common.session.UserSession r0 = r5.A00
            X.MYs r2 = new X.MYs
            r2.<init>(r1, r0)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.18A r1 = X.AnonymousClass189.A00(r0)
            X.EDI r0 = r5.A04
            java.lang.Long r0 = r0.A06
            java.lang.String r0 = r0.toString()
            com.instagram.user.model.User r4 = r1.A02(r0)
            if (r4 == 0) goto L90
            X.EDI r0 = r5.A04
            r0.getClass()
            X.EDI r1 = r5.A04
            java.lang.Integer r0 = r1.A03
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L3b;
                case 2: goto L90;
                case 3: goto L90;
                case 4: goto L90;
                case 5: goto L90;
                default: goto L34;
            }
        L34:
            java.lang.String r0 = "Invalid support inbox CTRL type"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L3b:
            boolean r0 = r1.A0H
            if (r0 == 0) goto L90
            boolean r0 = r4.CQf()
            if (r0 != 0) goto L5a
            r1 = 2131973264(0x7f135490, float:1.9583559E38)
            java.lang.String r0 = r4.getUsername()
            java.lang.String r3 = X.AbstractC31174DnI.A0w(r5, r0, r1)
            r1 = 25
            X.Fp5 r0 = new X.Fp5
            r0.<init>(r1, r5, r4)
            r2.A09(r3, r0)
        L5a:
            com.instagram.common.session.UserSession r0 = r5.A00
            X.2kX r0 = X.C57582kX.A00(r0)
            boolean r0 = r0.A0Q(r4)
            if (r0 == 0) goto L90
            r1 = 2131973269(0x7f135495, float:1.958357E38)
            java.lang.String r0 = r4.getUsername()
            java.lang.String r3 = X.AbstractC31174DnI.A0w(r5, r0, r1)
            r1 = 26
            X.Fp5 r0 = new X.Fp5
            r0.<init>(r1, r5, r4)
            r2.A0B(r3, r0)
            r1 = 2131973265(0x7f135491, float:1.958356E38)
            java.lang.String r0 = r4.getUsername()
            java.lang.String r3 = X.AbstractC31174DnI.A0w(r5, r0, r1)
            r1 = 27
            X.Fp5 r0 = new X.Fp5
            r0.<init>(r1, r5, r4)
            r2.A0B(r3, r0)
        L90:
            X.EDI r0 = r5.A04
            boolean r0 = r0.A0G
            if (r0 == 0) goto La2
            r1 = 2131973179(0x7f13543b, float:1.9583386E38)
            r0 = 69
            X.FpH r0 = X.ViewOnClickListenerC35682FpH.A00(r5, r0)
            r2.A03(r0, r1)
        La2:
            X.EDI r0 = r5.A04
            r0.getClass()
            X.EDI r1 = r5.A04
            java.lang.Integer r0 = r1.A03
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto Lb9;
                case 1: goto Lb9;
                case 2: goto Ld3;
                case 3: goto Ld3;
                case 4: goto Ld3;
                case 5: goto Ld3;
                default: goto Lb2;
            }
        Lb2:
            java.lang.String r0 = "Invalid support inbox CTRL type"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        Lb9:
            boolean r0 = r1.A0E
            if (r0 == 0) goto Ld3
            r1 = 2131975021(0x7f135b6d, float:1.9587123E38)
            r0 = 70
        Lc2:
            X.FpH r0 = X.ViewOnClickListenerC35682FpH.A00(r5, r0)
            r2.A03(r0, r1)
        Lc9:
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto Ld2
            X.C31727DwY.A01(r0, r2)
        Ld2:
            return
        Ld3:
            X.EDI r1 = r5.A04
            java.lang.Integer r0 = r1.A03
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto Lc9;
                case 1: goto Lc9;
                case 2: goto Le5;
                case 3: goto Le5;
                case 4: goto Lc9;
                case 5: goto Lc9;
                default: goto Lde;
            }
        Lde:
            java.lang.String r0 = "Invalid support inbox CTRL type"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        Le5:
            boolean r0 = r1.A0E
            if (r0 == 0) goto Lc9
            X.FLZ r0 = r1.A02
            if (r0 == 0) goto Lc9
            r1 = 2131975021(0x7f135b6d, float:1.9587123E38)
            r0 = 66
            goto Lc2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENO.A02(X.ENO):void");
    }

    @Override // X.C38K
    public final AbstractC12990ll A0X() {
        return this.A00;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        if (isAdded()) {
            this.A05.getClass();
            Integer A00 = FDV.A00(this.A05);
            A00.getClass();
            switch (A00.intValue()) {
                case 0:
                case 1:
                    i = 2131972368;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    i = 2131976908;
                    break;
                default:
                    throw AbstractC166987dD.A12("Invalid support inbox CTRL type");
            }
            AbstractC31175DnJ.A1I(interfaceC56362iU, getString(i));
            if (this.A09 == EnumC33325EoK.A02) {
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A06 = R.drawable.instagram_edit_list_pano_outline_24;
                A0B.A05 = 2131974979;
                AbstractC31176DnK.A1B(ViewOnClickListenerC35682FpH.A00(this, 67), A0B, interfaceC56362iU);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2097480545);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A06 = AbstractC31173DnH.A0j(requireArguments, "SupportInboxDetailFragment.ARG_REPORTED_CONTENT_ID");
        this.A05 = requireArguments.getString("SupportInboxDetailFragment.ARG_CTRL_TYPE");
        this.A07 = requireArguments.getString("SupportInboxDetailFragment.ARG_TICKET_ID");
        requireArguments.getString("SupportInboxDetailFragment.ARG_STORY_ID");
        this.A09 = (EnumC33325EoK) requireArguments.getSerializable("SupportInboxDetailFragment.ARG_SOURCE");
        EPY epy = new EPY(requireContext(), this, this.A00, this, this);
        this.A03 = epy;
        A0U(epy);
        AbstractC25651Mw.A00(this.A00).A01(this.A0A, C36075FwB.class);
        C0f9.A09(1092520571, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(287018854);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.support_inbox_detail_fragment);
        C0f9.A09(38881751, A02);
        return A0A;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-805061491);
        super.onDestroy();
        AbstractC25651Mw.A00(this.A00).A02(this.A0A, C36075FwB.class);
        C0f9.A09(1906865785, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC31172DnG.A0j(view, R.id.support_inbox_detail_more_options_button_layout);
        A01(this);
    }
}
