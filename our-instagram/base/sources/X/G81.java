package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G81 implements GZA {
    public final int A00;
    public final Object A01;

    public G81(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(IgdsBanner igdsBanner, Object obj, int i) {
        igdsBanner.A00 = new G81(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, X.XCT] */
    @Override // X.GZA
    public final void onActionClicked() {
        android.net.Uri uri;
        String str;
        C63397SjR A0y;
        Map map;
        switch (this.A00) {
            case 0:
                ((NEC) this.A01).A00.invoke();
                return;
            case 1:
            case 2:
            case 3:
            case 5:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                return;
            case 4:
                ENB enb = (ENB) this.A01;
                C33185EkW c33185EkW = new C33185EkW();
                C08730cb c08730cb = C17060sy.A01;
                InterfaceC09390do interfaceC09390do = enb.A09;
                User A0g = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do);
                Bundle A0b = AbstractC166987dD.A0b();
                InterfaceC83733oI interfaceC83733oI = enb.A04;
                String str2 = null;
                if (interfaceC83733oI == null) {
                    str = "threadId";
                } else {
                    AbstractC35077Fco.A02(A0b, interfaceC83733oI, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
                    E70 e70 = enb.A03;
                    if (e70 != null && (map = e70.A0W) != null) {
                        str2 = AbstractC166987dD.A1A(A0g.getId(), map);
                    }
                    A0b.putString("self_setting", str2);
                    Capabilities capabilities = enb.A00;
                    if (capabilities == null) {
                        str = "threadCapabilities";
                    } else {
                        A0b.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", capabilities);
                        c33185EkW.setArguments(A0b);
                        C189448aO A0g2 = AbstractC25231BEo.A0g(interfaceC09390do);
                        AbstractC31172DnG.A1G(AbstractC166997dE.A0N(enb), A0g2, 2131959120);
                        AbstractC31177DnL.A14(enb, c33185EkW, A0g2);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                ((L6V) this.A01).A00();
                return;
            case 7:
                ((InterfaceC16660sJ) this.A01).invoke(C52638NQl.A00);
                return;
            case 8:
                C31721DwQ c31721DwQ = (C31721DwQ) this.A01;
                C1571673v.A0B(AbstractC31171DnF.A0D("nme_profile_editing_banner"), c31721DwQ.A0V, true);
                UserSession userSession = c31721DwQ.A0V;
                C34649FOh c34649FOh = c31721DwQ.A0f;
                C14360o3.A0B(userSession, 0);
                if (F9Q.A00(userSession, c34649FOh) == C05F.A0C) {
                    String A04 = C18U.A04(C06090Tz.A05, c31721DwQ.A0V, 36880351596249411L);
                    if (c31721DwQ.getActivity() == null || TextUtils.isEmpty(A04)) {
                        return;
                    }
                    A0y = new C63397SjR(c31721DwQ.getActivity(), c31721DwQ.A0V, C2Fb.A2z, A04);
                    A0y.A0A();
                    return;
                }
                UserSession userSession2 = c31721DwQ.A0V;
                C14360o3.A0B(userSession2, 0);
                C62862tP A0N = AbstractC31172DnG.A0N(c31721DwQ, userSession2);
                Map A0n = AbstractC167007dF.A0n("node_id", "im_profile");
                HashMap A1G = AbstractC166987dD.A1G();
                HashMap A0h = AbstractC31177DnL.A0h();
                AbstractC31171DnF.A1T(AbstractC111324zv.A00(4954), A1G);
                A1G.put("deeplink_destination", "individual_setting");
                if (!A0n.isEmpty()) {
                    A1G.put("deeplink_params", A0n);
                }
                FTe.A00(new Object(), "com.bloks.www.fxcal.settings.async", A1G, A0h).A00(c31721DwQ.getActivity(), A0N);
                return;
            case 9:
                C31721DwQ c31721DwQ2 = (C31721DwQ) this.A01;
                InterfaceC69973Cg interfaceC69973Cg = c31721DwQ2.A0d;
                if (interfaceC69973Cg != null && (uri = c31721DwQ2.A00) != null) {
                    interfaceC69973Cg.EnC(uri, C22P.A41, null, 0, 10004);
                    return;
                } else {
                    C31721DwQ.A0C(c31721DwQ2);
                    C9GR.A0F(c31721DwQ2.getActivity(), AbstractC43591JPw.A00(219), 2131976043);
                    return;
                }
            case 10:
                C32287EJz c32287EJz = (C32287EJz) this.A01;
                FragmentActivity activity = c32287EJz.getActivity();
                AbstractC10360h2 abstractC10360h2 = c32287EJz.mFragmentManager;
                User user = c32287EJz.A05;
                if (user == null) {
                    str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                AbstractC31510Dsu.A04(activity, null, abstractC10360h2, AbstractC018607g.A00(c32287EJz), c32287EJz, AbstractC166987dD.A0r(c32287EJz.A0B), user, null, "edit_links", null, null, null, false);
                return;
            case 11:
                FRN frn = (FRN) this.A01;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(C35033Fc6.A00(frn.A06), "ig_push_notification_settings_banner");
                if (A0f.isSampled()) {
                    A0f.AAP("event_type", "click");
                    A0f.Cht();
                }
                AbstractC14480oK.A00(frn.A02);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C32244EId c32244EId = (C32244EId) this.A01;
                AbstractC31173DnH.A1I(c32244EId, AbstractC31176DnK.A0d(c32244EId.requireActivity(), AbstractC31178DnM.A06(AbstractC111324zv.A00(1505), c32244EId.getString(2131953842)), AbstractC166987dD.A0o(c32244EId.A05), ModalActivity.class, AbstractC111324zv.A00(1981)));
                return;
            case 14:
                ES9 es9 = (ES9) this.A01;
                UserSession userSession3 = es9.A02;
                String A042 = C18U.A04(C06090Tz.A05, userSession3, 36884676627006030L);
                if (A042.length() == 0) {
                    return;
                }
                A0y = AbstractC25228BEl.A0y(es9.A01, userSession3, C2Fb.A39, A042);
                A0y.A0A();
                return;
            case Process.SIGTERM /* 15 */:
                C32367ENr c32367ENr = (C32367ENr) this.A01;
                C18920wW c18920wW = c32367ENr.A00;
                if (c18920wW == null) {
                    str = "logger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C75R.A09(c18920wW, null, "click", "learn_how_it_works");
                if (c32367ENr.getActivity() == null) {
                    return;
                }
                C66277U6x A00 = C66277U6x.A00("com.instagram.bullying.restrict.screens.learn_more");
                boolean A06 = C18U.A06(C06090Tz.A06, c32367ENr.getSession(), 36321443205621192L);
                FragmentActivity requireActivity = c32367ENr.requireActivity();
                if (A06) {
                    IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(c32367ENr.getSession());
                    A0C.A0R = "restrict_home";
                    AbstractC31171DnF.A17(c32367ENr, A0C, 2131972540);
                    A0C.A0P = C05F.A01;
                    A00.A05(requireActivity, A0C);
                    return;
                }
                IgBloksScreenConfig A0C2 = AbstractC31171DnF.A0C(c32367ENr.getSession());
                A0C2.A0R = "restrict_home";
                AbstractC31171DnF.A17(c32367ENr, A0C2, 2131972524);
                AbstractC31173DnH.A14(requireActivity, A0C2, A00);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GZA
    public final void onBannerDismissed() {
        InterfaceC19610xo A0c;
        boolean z;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        C23031Ai c23031Ai;
        switch (this.A00) {
            case 1:
                C2056398n A00 = AbstractC2056298m.A00(((C31829Dyn) ((EJM) this.A01).A07.getValue()).A01);
                z = true;
                interfaceC16530ry = A00.A0N;
                c0yrArr = C2056398n.A0d;
                i = 29;
                c23031Ai = A00;
                AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, i, z);
                return;
            case 2:
            case 3:
                C23031Ai c23031Ai2 = (C23031Ai) this.A01;
                z = true;
                interfaceC16530ry = c23031Ai2.A3F;
                c0yrArr = C23031Ai.A8c;
                i = 377;
                c23031Ai = c23031Ai2;
                AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, i, z);
                return;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                return;
            case 5:
                C23031Ai c23031Ai3 = ((EIF) this.A01).A03;
                if (c23031Ai3 == null) {
                    C14360o3.A0F("userPreferences");
                    throw C00O.createAndThrow();
                }
                z = true;
                interfaceC16530ry = c23031Ai3.A3g;
                c0yrArr = C23031Ai.A8c;
                i = 525;
                c23031Ai = c23031Ai3;
                AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, i, z);
                return;
            case 10:
                A0c = AbstractC166987dD.A0w(AbstractC23021Ah.A00(AbstractC166987dD.A0r(((C32287EJz) this.A01).A0B)));
                A0c.E77("should_show_edit_links_copy_profile_link_banner", false);
                A0c.apply();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C23031Ai c23031Ai4 = (C23031Ai) this.A01;
                z = true;
                interfaceC16530ry = c23031Ai4.A5O;
                c0yrArr = C23031Ai.A8c;
                i = 432;
                c23031Ai = c23031Ai4;
                AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, i, z);
                return;
            case 14:
                A0c = AbstractC31173DnH.A0c(C1AT.A01(((ES9) this.A01).A02), C1AV.A1u);
                A0c.E77("PLAYCOUNT_WITH_REPLAY_BANNER_DISMISSED_BY_USER", true);
                A0c.apply();
                return;
        }
    }
}
