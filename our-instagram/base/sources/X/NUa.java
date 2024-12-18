package X;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class NUa extends AbstractC71026Wmh {
    public final int A00;
    public final Object A01;

    public NUa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC71026Wmh, X.XBC
    public final void DAv(InterfaceC11380iw interfaceC11380iw, AbstractC65924TwV abstractC65924TwV, Tx0 tx0) {
        if (2 - this.A00 == 0) {
            C14360o3.A0B(abstractC65924TwV, 0);
            N8I n8i = (N8I) this.A01;
            C65741TtG c65741TtG = (C65741TtG) abstractC65924TwV;
            User A06 = c65741TtG.A06();
            AbstractC166987dD.A1Z(new MCJ(A06, n8i, null, 41), AbstractC25235BEs.A0S(n8i));
            N8I.A00(n8i, "decline_request", c65741TtG.A06().getId());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC71026Wmh, X.XLU
    public final void DFE(Tx0 tx0, C65741TtG c65741TtG) {
        N8I n8i;
        String id;
        String str;
        C193328hC A0O;
        int i;
        DialogInterfaceOnClickListenerC48021LMq dialogInterfaceOnClickListenerC48021LMq;
        C19L A0S;
        InterfaceC16620sF mcj;
        int i2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c65741TtG, 0);
                N8G n8g = (N8G) this.A01;
                N8G.A02(n8g, c65741TtG.A06());
                JQ1.A0i(n8g);
                return;
            case 1:
                C14360o3.A0B(c65741TtG, 0);
                ((C51047Mgz) ((N8F) this.A01).A05.getValue()).A05(null, c65741TtG.A06());
                return;
            case 2:
                boolean A1a = AbstractC167017dG.A1a(c65741TtG, tx0);
                String str2 = tx0.A09;
                if (C14360o3.A0K(str2, "approval_search_item_state_source")) {
                    BrandedContentBrandTaggingRequestApprovalStatus Afn = c65741TtG.A06().A03.Afn();
                    BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus = BrandedContentBrandTaggingRequestApprovalStatus.A07;
                    n8i = (N8I) this.A01;
                    if (Afn == brandedContentBrandTaggingRequestApprovalStatus) {
                        User A06 = c65741TtG.A06();
                        A0O = AbstractC31175DnJ.A0O(n8i);
                        A0O.A0A(2131972184);
                        A0O.A09(2131972183);
                        i = 2131972202;
                        dialogInterfaceOnClickListenerC48021LMq = new DialogInterfaceOnClickListenerC48021LMq(A1a ? 1 : 0, A06, n8i);
                        A0O.A0L(dialogInterfaceOnClickListenerC48021LMq, i);
                        A0O.A0Q(null, EnumC193348hE.A04, 2131954179);
                        AbstractC166987dD.A1W(A0O);
                        return;
                    }
                    User A062 = c65741TtG.A06();
                    AbstractC166987dD.A1Z(new MCJ(A062, n8i, null, 39), AbstractC25235BEs.A0S(n8i));
                    id = c65741TtG.A06().getId();
                    str = "approve_creator";
                } else {
                    if (!C14360o3.A0K(str2, "request_search_item_state_source")) {
                        return;
                    }
                    n8i = (N8I) this.A01;
                    User A063 = c65741TtG.A06();
                    AbstractC166987dD.A1Z(new MCJ(A063, n8i, null, 38), AbstractC25235BEs.A0S(n8i));
                    id = c65741TtG.A06().getId();
                    str = "approve_request";
                }
                N8I.A00(n8i, str, id);
                return;
            case 3:
                C14360o3.A0B(c65741TtG, 0);
                if (c65741TtG.A06().A1s()) {
                    return;
                }
                BrandedContentBrandTaggingRequestApprovalStatus AcS = c65741TtG.A06().A03.AcS();
                if (AcS != null) {
                    int ordinal = AcS.ordinal();
                    if (ordinal != 5) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                return;
                            }
                        } else {
                            A0O = AbstractC31175DnJ.A0O((Fragment) this.A01);
                            A0O.A0A(2131954197);
                            A0O.A09(2131954196);
                            A0O.A0Q(null, EnumC193348hE.A04, 2131968948);
                            AbstractC166987dD.A1W(A0O);
                            return;
                        }
                    } else {
                        Fragment fragment = (Fragment) this.A01;
                        User A064 = c65741TtG.A06();
                        A0O = AbstractC31175DnJ.A0O(fragment);
                        A0O.A0A(2131954178);
                        A0O.A09(2131954177);
                        i = 2131954176;
                        dialogInterfaceOnClickListenerC48021LMq = new DialogInterfaceOnClickListenerC48021LMq(2, A064, fragment);
                        A0O.A0L(dialogInterfaceOnClickListenerC48021LMq, i);
                        A0O.A0Q(null, EnumC193348hE.A04, 2131954179);
                        AbstractC166987dD.A1W(A0O);
                        return;
                    }
                }
                Fragment fragment2 = (Fragment) this.A01;
                User A065 = c65741TtG.A06();
                A0S = AbstractC25235BEs.A0S(fragment2);
                mcj = new MCJ(A065, fragment2, null, 45);
                AbstractC166987dD.A1Z(mcj, A0S);
                return;
            case 4:
                C14360o3.A0B(c65741TtG, 0);
                C50962MfV c50962MfV = (C50962MfV) ((C52147N5w) this.A01).A05.getValue();
                AbstractC53509Nlb abstractC53509Nlb = (AbstractC53509Nlb) c50962MfV.A0E.getValue();
                if (!(abstractC53509Nlb instanceof NRB)) {
                    return;
                }
                C05A c05a = c50962MfV.A0C;
                do {
                } while (!c05a.AIi(c05a.getValue(), AbstractC166997dE.A0b()));
                String id2 = c65741TtG.A06().getId();
                boolean contains = ((NRB) abstractC53509Nlb).A00.contains(c65741TtG.A06());
                A0S = AbstractC141776au.A00(c50962MfV);
                if (contains) {
                    i2 = 15;
                } else {
                    i2 = 14;
                }
                mcj = new PZ1(c50962MfV, id2, null, i2);
                AbstractC166987dD.A1Z(mcj, A0S);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [X.OY9, java.lang.Object] */
    @Override // X.XLU
    public final void Dxi(InterfaceC11380iw interfaceC11380iw, Tx0 tx0, C65741TtG c65741TtG) {
        String id;
        UserSession A0r;
        FragmentActivity requireActivity;
        String str;
        InputMethodManager inputMethodManager;
        switch (this.A00) {
            case 0:
                AbstractC167027dH.A12(c65741TtG, tx0, interfaceC11380iw);
                N8G n8g = (N8G) this.A01;
                if (C4A4.A02(AbstractC166987dD.A0r(((AbstractC52114N4m) n8g).A09))) {
                    N8G.A02(n8g, c65741TtG.A06());
                    JQ1.A0i(n8g);
                    return;
                }
                return;
            case 1:
                AbstractC167027dH.A12(c65741TtG, tx0, interfaceC11380iw);
                N8F n8f = (N8F) this.A01;
                if (C4A4.A02(AbstractC166987dD.A0r(n8f.A09))) {
                    ((C51047Mgz) n8f.A05.getValue()).A05(null, c65741TtG.A06());
                    return;
                }
                return;
            case 2:
                C14360o3.A0B(c65741TtG, 0);
                id = c65741TtG.A06().getId();
                AbstractC52114N4m abstractC52114N4m = (AbstractC52114N4m) this.A01;
                A0r = AbstractC166987dD.A0r(abstractC52114N4m.A09);
                requireActivity = abstractC52114N4m.requireActivity();
                str = N8I.__redex_internal_original_name;
                break;
            case 3:
                C14360o3.A0B(c65741TtG, 0);
                id = c65741TtG.A06().getId();
                AbstractC52114N4m abstractC52114N4m2 = (AbstractC52114N4m) this.A01;
                A0r = AbstractC166987dD.A0r(abstractC52114N4m2.A09);
                requireActivity = abstractC52114N4m2.requireActivity();
                str = N8H.__redex_internal_original_name;
                break;
            case 4:
                C14360o3.A0B(c65741TtG, 0);
                String id2 = c65741TtG.A06().getId();
                C52147N5w c52147N5w = (C52147N5w) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(c52147N5w.A04);
                FragmentActivity requireActivity2 = c52147N5w.requireActivity();
                C14360o3.A0B(A0r2, 1);
                C31368DqX.A02(AbstractC31173DnH.A0P(requireActivity2, A0r2), A0r2, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(A0r2, id2, "profile_ads_creator_blocked_account", "publisher_control_blocked_accounts"));
                return;
            default:
                boolean A1R = AbstractC167007dF.A1R(0, c65741TtG, tx0);
                C54481O5j c54481O5j = ((OL1) this.A01).A01;
                User A06 = c65741TtG.A06();
                int i = tx0.A00;
                C52174N7f c52174N7f = c54481O5j.A00;
                if (OQE.A01(c52174N7f.getSession(), A06)) {
                    C18920wW A01 = AbstractC12220kQ.A01(c52174N7f, c52174N7f.getSession());
                    AbstractC55114ObY.A02(c52174N7f.requireActivity(), c52174N7f, c52174N7f.getSession(), A06, c52174N7f.A0D);
                    AbstractC54294NzE.A00(A01, c52174N7f.getSession(), A06);
                    C65974TxR c65974TxR = c52174N7f.A04;
                    if (c65974TxR == null) {
                        C14360o3.A0F("queuedTypeaheadManager");
                        throw C00O.createAndThrow();
                    }
                    c65974TxR.A06.clear();
                    return;
                }
                Integer num = C05F.A01;
                if (IAS.A00(A06, num) != null) {
                    RunnableC57053PSs runnableC57053PSs = new RunnableC57053PSs(c52174N7f, A06, i);
                    FragmentActivity requireActivity3 = c52174N7f.requireActivity();
                    UserSession session = c52174N7f.getSession();
                    GrowthFrictionInterventionDetail A00 = IAS.A00(A06, num);
                    C14360o3.A0B(session, A1R ? 1 : 0);
                    if (A00 != null) {
                        ITB.A00(requireActivity3, A00, session, EnumC193348hE.A03, A06, num, runnableC57053PSs, false);
                        return;
                    }
                    return;
                }
                Integer num2 = c52174N7f.A07;
                Integer num3 = C05F.A0C;
                if (num2 != num3) {
                    Object systemService = c52174N7f.getThemedContext().getSystemService("input_method");
                    if (systemService instanceof InputMethodManager) {
                        inputMethodManager = (InputMethodManager) systemService;
                    } else {
                        inputMethodManager = null;
                    }
                    View currentFocus = c52174N7f.requireActivity().getCurrentFocus();
                    if (inputMethodManager != null && currentFocus != null && currentFocus.getWindowToken() != null) {
                        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    }
                    ?? obj = new Object();
                    ContextThemeWrapper themedContext = c52174N7f.getThemedContext();
                    FragmentActivity requireActivity4 = c52174N7f.requireActivity();
                    UserSession session2 = c52174N7f.getSession();
                    OB3 ob3 = new OB3(c52174N7f, A06, i);
                    String str2 = c52174N7f.A0A;
                    Integer num4 = c52174N7f.A07;
                    AbstractC25229BEm.A1I(session2, 2, num4);
                    if (num4 != num3) {
                        C18920wW A02 = AbstractC12220kQ.A02(session2);
                        C50674MYs c50674MYs = new C50674MYs(themedContext, session2);
                        c50674MYs.A0C(A06.getUsername(), AbstractC31178DnM.A0c(themedContext, A06, 2131956296));
                        c50674MYs.A06(A06.Bhu());
                        c50674MYs.A03(new ViewOnClickListenerC55418OjT(A02, obj, ob3, str2, 2), 2131956297);
                        c50674MYs.A03 = new C56404P2r(A02, obj, str2);
                        if (num4 == num) {
                            c50674MYs.A03(new ViewOnClickListenerC55418OjT(A02, obj, ob3, str2, A1R ? 1 : 0), 2131956298);
                        }
                        C31727DwY.A00(requireActivity4, c50674MYs);
                        return;
                    }
                    return;
                }
                if (c52174N7f.A0D) {
                    C52174N7f.A01(c52174N7f, A06, i);
                    return;
                }
                C52174N7f.A00(c52174N7f, A06, i);
                InterfaceC58082Pp7 interfaceC58082Pp7 = c52174N7f.A05;
                if (interfaceC58082Pp7 != null) {
                    interfaceC58082Pp7.AAT(A06, false);
                    return;
                }
                return;
        }
        C14360o3.A0B(A0r, 1);
        C31368DqX.A02(AbstractC31173DnH.A0P(requireActivity, A0r), A0r, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(A0r, id, "user_list", str));
    }
}
