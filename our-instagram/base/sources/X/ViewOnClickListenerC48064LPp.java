package X;

import android.graphics.Bitmap;
import android.util.SizeF;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.LPp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48064LPp implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC48064LPp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC48064LPp(obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        int A052;
        int i2;
        Object obj;
        String str2;
        View view2;
        View view3;
        Integer num;
        Object value;
        C8OS c8os;
        Bitmap bitmap;
        Bitmap A00;
        C45112Jxh c45112Jxh;
        Integer num2;
        Integer num3;
        Object value2;
        C8OS c8os2;
        Bitmap A01;
        Bitmap A002;
        C45112Jxh c45112Jxh2;
        Integer num4;
        KN8 kn8;
        SizeF sizeF;
        String str3;
        float width;
        float width2;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1402778775);
                ((C44515JmL) ((KBS) this.A01).A07.getValue()).A00();
                i = 1007065191;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A052 = C0f9.A05(1119832561);
                KBS kbs = (KBS) this.A01;
                C55555Olp c55555Olp = kbs.A01;
                if (c55555Olp != null) {
                    kbs.A06.getValue();
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    A0q.put("event_name", "reload_avatar");
                    c55555Olp.A02(AbstractC166987dD.A1L("avatar_fetch_event", A0q));
                }
                i2 = 1908537793;
                C0f9.A0C(i2, A052);
                return;
            case 2:
                A05 = C0f9.A05(-1062184754);
                ((C44515JmL) ((KBS) this.A01).A07.getValue()).A00();
                i = 2112726630;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(13947324);
                AbstractC31176DnK.A1Y(this.A01);
                i = -465714688;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-1033832052);
                ((C44474Jlg) this.A01).A00.Egh(KAF.A00);
                i = 565675987;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(-446696327);
                ((C44474Jlg) this.A01).A00.Egh(KAE.A00);
                i = -1181838792;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(-783661157);
                ((C44474Jlg) this.A01).A00.Egh(KAH.A00);
                i = -1864193832;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(451821432);
                ((C44474Jlg) this.A01).A00.Egh(KAG.A00);
                i = -1573068000;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(-505333024);
                ((C44474Jlg) this.A01).A00.Egh(KAI.A00);
                i = 429248974;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A052 = C0f9.A05(-768394930);
                C44474Jlg c44474Jlg = (C44474Jlg) this.A01;
                C05A c05a = c44474Jlg.A01;
                ((C47515Kyi) c05a.getValue()).A00 = !((C47515Kyi) c05a.getValue()).A00;
                boolean z = ((C47515Kyi) c05a.getValue()).A00;
                C05A c05a2 = c44474Jlg.A00;
                if (z) {
                    obj = KAK.A00;
                } else {
                    obj = KAJ.A00;
                }
                c05a2.Egh(obj);
                i2 = -885889323;
                C0f9.A0C(i2, A052);
                return;
            case 10:
                A05 = C0f9.A05(-2092334001);
                KBR.A00((KBR) this.A01, true);
                i = 1318418150;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(-2097771510);
                KBR.A00((KBR) this.A01, false);
                i = -1583192512;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A052 = C0f9.A05(-1591330962);
                KDX kdx = (KDX) this.A01;
                kdx.A0H = true;
                C44486Jls c44486Jls = (C44486Jls) kdx.A0L.getValue();
                C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(c44486Jls.A00, "ig_exit_nux_see_avatar_stickers_event"), 221);
                A0A.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c44486Jls.A02);
                A0A.Cht();
                C189478aR c189478aR = kdx.A0E;
                if (c189478aR != null) {
                    c189478aR.A07();
                }
                i2 = 484253145;
                C0f9.A0C(i2, A052);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-458868062);
                AbstractC31176DnK.A1Y(this.A01);
                i = 1844163665;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A05 = C0f9.A05(854966643);
                AbstractC31176DnK.A1Y(this.A01);
                i = -908540873;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(1166766308);
                ((AbstractC45465KBa) this.A01).A0K(null);
                i = 52460397;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A05 = C0f9.A05(-1101281729);
                AbstractC25227BEk.A1B((KCC) this.A01);
                i = -1857574638;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(1415751576);
                N6K.A00((N6K) this.A01);
                i = -505205869;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A052 = C0f9.A05(1682080732);
                C44548Jms c44548Jms = (C44548Jms) this.A01;
                InterfaceC19630xq A03 = c44548Jms.A0A.A03(C1AV.A0Z);
                if (!AbstractC31172DnG.A1a(A03, "has_user_seen_desktop_tool")) {
                    AbstractC167007dF.A17(A03.ARD(), "has_user_seen_desktop_tool");
                }
                LL0.A01(c44548Jms.A06, c44548Jms.A07, C05F.A0A);
                C44548Jms.A01(C45532KDx.A00, c44548Jms);
                i2 = -1214217870;
                C0f9.A0C(i2, A052);
                return;
            case Process.SIGSTOP /* 19 */:
                A052 = C0f9.A05(-1229158830);
                C44548Jms c44548Jms2 = (C44548Jms) this.A01;
                InterfaceC19630xq A032 = c44548Jms2.A0A.A03(C1AV.A0Z);
                if (!AbstractC31172DnG.A1a(A032, "has_user_seen_project_board")) {
                    AbstractC167007dF.A17(A032.ARD(), "has_user_seen_project_board");
                }
                C44548Jms.A01(C45533KDy.A00, c44548Jms2);
                i2 = -1567770612;
                C0f9.A0C(i2, A052);
                return;
            case 20:
                A05 = C0f9.A05(508062113);
                Fragment fragment = (Fragment) this.A01;
                C6WQ c6wq = new C6WQ(fragment.requireContext(), true);
                c6wq.A00(fragment.getString(2131954367));
                C0fJ.A00(c6wq);
                C1GJ.A06(new KK2(0, c6wq, fragment), 255, 1, false, false);
                i = -465852651;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(940491445);
                C45502KCr.A00((C45502KCr) this.A01);
                i = 2089806;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A05 = C0f9.A05(688076138);
                C45502KCr.A00((C45502KCr) this.A01);
                i = 1123567249;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A05 = C0f9.A05(-1141025093);
                C45502KCr.A00((C45502KCr) this.A01);
                i = -980064867;
                C0f9.A0C(i, A05);
                return;
            case 24:
                A05 = C0f9.A05(1050928044);
                C45502KCr c45502KCr = (C45502KCr) this.A01;
                AbstractC43594JPz.A0N(c45502KCr.A09).A0S(VG4.A11.toString(), "switch_to_single_post");
                ((C44544Jmo) c45502KCr.A08.getValue()).A05(EnumC68121VCe.A03);
                i = -1407923134;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A052 = C0f9.A05(-312629632);
                KCH kch = (KCH) this.A01;
                InterfaceC09390do interfaceC09390do = kch.A0B;
                List A0X = AbstractC001800i.A0X(((C45106Jxa) C44544Jmo.A00((C44544Jmo) interfaceC09390do.getValue()).A02.A03.getValue()).A01());
                String str4 = (String) AbstractC001800i.A0J(A0X);
                if (str4 != null) {
                    InterfaceC09390do interfaceC09390do2 = kch.A0A;
                    C70399WUb A0N = AbstractC43594JPz.A0N(interfaceC09390do2);
                    String obj2 = VG4.A11.toString();
                    A0N.A0S(obj2, AnonymousClass001.A0O("complete_media_selection_", A0X.size()));
                    C70399WUb A0N2 = AbstractC43594JPz.A0N(interfaceC09390do2);
                    InterfaceC09390do interfaceC09390do3 = kch.A06;
                    String A15 = AbstractC25225BEi.A15(interfaceC09390do3);
                    String obj3 = ((C44544Jmo) interfaceC09390do.getValue()).A01().toString();
                    Long A0V = AbstractC31171DnF.A0V(AbstractC37302Gc3.A02(((C45106Jxa) C44544Jmo.A00((C44544Jmo) interfaceC09390do.getValue()).A02.A03.getValue()).A00(str4)));
                    if (A15 != null) {
                        A0N2.A01 = A15;
                    }
                    A0N2.A02 = str4;
                    C70399WUb.A01(null, null, A0N2, A0V, obj2, null, obj3, null, null, null, null, null);
                    AbstractC69888VxF.A00().A08(kch, new C42150Ily(kch, 0), kch, AbstractC166987dD.A0r(interfaceC09390do2), AbstractC25225BEi.A15(interfaceC09390do3), AbstractC25225BEi.A15(kch.A05), A0X, AbstractC167007dF.A1Z(kch.A07), AbstractC167007dF.A1Z(kch.A09), AbstractC167007dF.A1Z(kch.A08));
                }
                i2 = -887981803;
                C0f9.A0C(i2, A052);
                return;
            case 26:
                A05 = C0f9.A05(-1124775839);
                C45503KCs c45503KCs = (C45503KCs) this.A01;
                AbstractC43594JPz.A0N(c45503KCs.A0C).A0S(VG4.A11.toString(), "switch_to_compare_2_posts");
                ((C44544Jmo) c45503KCs.A0B.getValue()).A05(EnumC68121VCe.A02);
                i = 1210354294;
                C0f9.A0C(i, A05);
                return;
            case 27:
                A05 = C0f9.A05(1266303720);
                C45503KCs.A00((C45503KCs) this.A01);
                i = -1551204255;
                C0f9.A0C(i, A05);
                return;
            case 28:
                A05 = C0f9.A05(-1048384936);
                C45503KCs.A00((C45503KCs) this.A01);
                i = 1317724839;
                C0f9.A0C(i, A05);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A05 = C0f9.A05(-1791835917);
                C45503KCs.A00((C45503KCs) this.A01);
                i = 795295240;
                C0f9.A0C(i, A05);
                return;
            case 30:
                A05 = C0f9.A05(-381708003);
                C67865Uzw c67865Uzw = (C67865Uzw) this.A01;
                C63397SjR A0y = AbstractC25228BEl.A0y(c67865Uzw.requireActivity(), AbstractC166987dD.A0r(c67865Uzw.A02), C2Fb.A35, "https://www.facebook.com/help/instagram/145903034165129?ref=igapp");
                A0y.A0S = "promote_automatic_creative_optimization_bottom_sheet";
                A0y.A0A();
                i = -1762712539;
                C0f9.A0C(i, A05);
                return;
            case 31:
                A052 = C0f9.A05(-700604291);
                C67865Uzw c67865Uzw2 = (C67865Uzw) this.A01;
                FragmentActivity activity = c67865Uzw2.getActivity();
                if (activity != null) {
                    C63397SjR A0y2 = AbstractC25228BEl.A0y(activity, AbstractC166987dD.A0r(c67865Uzw2.A02), C2Fb.A0L, "https://www.facebook.com/legal/terms/ad_creative_generative_ai_terms");
                    A0y2.A0S = "promote_automatic_creative_optimization_bottom_sheet";
                    A0y2.A0A();
                }
                i2 = 877716851;
                C0f9.A0C(i2, A052);
                return;
            case 32:
                A05 = C0f9.A05(973477284);
                AbstractC31176DnK.A1Y(this.A01);
                i = 2039637294;
                C0f9.A0C(i, A05);
                return;
            case 33:
                A052 = C0f9.A05(592466382);
                AbstractC31178DnM.A1T(this.A01);
                i2 = 1680110535;
                C0f9.A0C(i2, A052);
                return;
            case 34:
                A052 = C0f9.A05(-58301448);
                KBj kBj = (KBj) this.A01;
                FragmentActivity activity2 = kBj.getActivity();
                if (activity2 != null) {
                    AbstractC69888VxF.A00().A0A(activity2, AbstractC166987dD.A0r(kBj.A05), "organic_insights_compare_cell", null, AbstractC001800i.A0u(AbstractC16830sb.A07("direct_inbox_setting_entrypoint", "direct_inbox_outcome_upsell", "direct_inbox_setting_entrypoint_suggest_post"), kBj.A01), false, false);
                }
                i2 = -1580812014;
                C0f9.A0C(i2, A052);
                return;
            case 35:
                A052 = C0f9.A05(-2079849488);
                C1Y6 A003 = AbstractC69888VxF.A00();
                KBj kBj2 = (KBj) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(kBj2.A05);
                FragmentActivity requireActivity = kBj2.requireActivity();
                String str5 = kBj2.A01;
                if (str5 == null) {
                    str5 = "unknown";
                }
                A003.A0A(requireActivity, A0r, str5, null, AbstractC001800i.A0u(AbstractC16830sb.A07("direct_inbox_setting_entrypoint", "direct_inbox_outcome_upsell", "direct_inbox_setting_entrypoint_suggest_post"), kBj2.A01), false, false);
                i2 = 427459423;
                C0f9.A0C(i2, A052);
                return;
            case 36:
                A05 = C0f9.A05(-447385014);
                AbstractC155756z4.A00().A02();
                V16 v16 = (V16) this.A01;
                v16.getSession();
                String str6 = v16.A0M;
                if (str6 == null) {
                    str = "entryPoint";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                AbstractC166987dD.A0b().putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str6);
                AbstractC25229BEm.A18(new KBj(), AbstractC25225BEi.A0r(v16.requireActivity(), v16.getSession()));
                i = 1495848726;
                C0f9.A0C(i, A05);
                return;
            case 37:
                A05 = C0f9.A05(183436348);
                C45472KBi c45472KBi = (C45472KBi) this.A01;
                FragmentActivity requireActivity2 = c45472KBi.requireActivity();
                InterfaceC09390do interfaceC09390do4 = c45472KBi.A03;
                C63397SjR A0y3 = AbstractC25228BEl.A0y(requireActivity2, AbstractC166987dD.A0r(interfaceC09390do4), C2Fb.A35, "https://business.facebook.com/business/help/204798856225114?id=649869995454285");
                A0y3.A0S = "promotions_in_review_fragment";
                A0y3.A0A();
                W6I A004 = VRC.A00(AbstractC166987dD.A0r(interfaceC09390do4));
                String str7 = c45472KBi.A00;
                if (str7 == null) {
                    str = "mediaId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A004.A08("promotion_details", "learn_more_cta", str7, null);
                i = -1811267840;
                C0f9.A0C(i, A05);
                return;
            case 38:
                A05 = C0f9.A05(-1311604156);
                KCG kcg = (KCG) this.A01;
                C44504JmA c44504JmA = (C44504JmA) kcg.A04.getValue();
                AbstractC43592JPx.A1Q(c44504JmA.A01, c44504JmA.A05, "lead_gen_cta_selection", "done", "click");
                ((AbstractC51032Mgg) kcg.A03.getValue()).A0B(kcg.requireActivity(), null, false);
                i = -127884374;
                C0f9.A0C(i, A05);
                return;
            case 39:
                int A053 = C0f9.A05(1251735242);
                KCI kci = (KCI) this.A01;
                C70399WUb c70399WUb = kci.A02;
                String str8 = null;
                if (c70399WUb != null) {
                    c70399WUb.A0G(VG4.A0w, "done_button");
                    P4U p4u = kci.A01;
                    if (p4u != null) {
                        Long l = kci.A06;
                        PromoteData promoteData = kci.A03;
                        if (promoteData != null) {
                            LeadForm leadForm = promoteData.A16;
                            if (leadForm != null) {
                                str8 = leadForm.A03;
                            }
                            C25531Mh A005 = P4U.A00(p4u, l, "lead_gen_form_list", "update_selection", "click");
                            A005.A0Q("lead_form_id", AbstractC25233BEq.A0n(str8));
                            A005.Cht();
                            kci.A07 = true;
                            AbstractC25226BEj.A1Q(kci);
                            C0f9.A0C(-1489707274, A053);
                            return;
                        }
                        str = "promoteData";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    str = "leadAdsLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "promoteLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 40:
                A05 = C0f9.A05(1839976952);
                ((KCN) this.A01).onBackPressed();
                i = 1086323380;
                C0f9.A0C(i, A05);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A052 = C0f9.A05(681256064);
                KCN kcn = (KCN) this.A01;
                KCN.A00(kcn);
                C70399WUb c70399WUb2 = kcn.A07;
                String str9 = null;
                if (c70399WUb2 != null) {
                    c70399WUb2.A0G(VG4.A10, "done_button");
                    P4U p4u2 = kcn.A06;
                    if (p4u2 != null) {
                        Long l2 = kcn.A0B;
                        PromoteData promoteData2 = kcn.A09;
                        if (promoteData2 != null) {
                            LeadForm leadForm2 = promoteData2.A16;
                            if (leadForm2 != null) {
                                str9 = leadForm2.A03;
                            }
                            C25531Mh A006 = P4U.A00(p4u2, l2, "lead_gen_manage_lead_forms", "update_selection", "click");
                            A006.A0Q("lead_form_id", AbstractC25233BEq.A0n(str9));
                            A006.Cht();
                            AbstractC25226BEj.A1Q(kcn);
                            i2 = -235848192;
                            C0f9.A0C(i2, A052);
                            return;
                        }
                        str = "promoteData";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    str = "leadAdsLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "promoteLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                int A054 = C0f9.A05(985096403);
                KCN kcn2 = (KCN) this.A01;
                C70399WUb c70399WUb3 = kcn2.A07;
                if (c70399WUb3 != null) {
                    c70399WUb3.A0G(VG4.A10, "create_lead_form_button");
                    P4U p4u3 = kcn2.A06;
                    if (p4u3 != null) {
                        AbstractC43592JPx.A1Q(p4u3, kcn2.A0B, "lead_gen_manage_lead_forms", "create_new_form", "click");
                        C52564NNk A055 = AbstractC155756z4.A00().A02().A05();
                        FragmentActivity requireActivity3 = kcn2.requireActivity();
                        PromoteData promoteData3 = kcn2.A09;
                        if (promoteData3 != null) {
                            AbstractC31177DnL.A16(A055, requireActivity3, promoteData3.A0y);
                            C0f9.A0C(-202687964, A054);
                            return;
                        }
                        str = "promoteData";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    str = "leadAdsLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "promoteLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 43:
                A05 = C0f9.A05(-374568479);
                KCN kcn3 = (KCN) this.A01;
                C70399WUb c70399WUb4 = kcn3.A07;
                if (c70399WUb4 != null) {
                    c70399WUb4.A0G(VG4.A10, "see_all_button");
                    P4U p4u4 = kcn3.A06;
                    if (p4u4 != null) {
                        AbstractC43592JPx.A1Q(p4u4, kcn3.A0B, "lead_gen_manage_lead_forms", "see_all", "click");
                        AbstractC155756z4.A00().A02();
                        KCI kci2 = new KCI();
                        FragmentActivity requireActivity4 = kcn3.requireActivity();
                        PromoteData promoteData4 = kcn3.A09;
                        if (promoteData4 != null) {
                            AbstractC31177DnL.A16(kci2, requireActivity4, promoteData4.A0y);
                            i = 484556171;
                            C0f9.A0C(i, A05);
                            return;
                        }
                        str = "promoteData";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    str = "leadAdsLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "promoteLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 44:
                A05 = C0f9.A05(1681792781);
                V0L v0l = (V0L) this.A01;
                AbstractC68460VRq.A00(v0l.requireActivity(), AbstractC166987dD.A0r(v0l.A05), "instagram_business_request_review_button");
                AbstractC25227BEk.A1B(v0l);
                i = -1136682622;
                C0f9.A0C(i, A05);
                return;
            case 45:
                A05 = C0f9.A05(-1048171006);
                V0L v0l2 = (V0L) this.A01;
                AbstractC68467VRx.A00(v0l2.requireActivity(), AbstractC166987dD.A0r(v0l2.A05), AbstractC25227BEk.A0v(v0l2, 2131970731), "https://business.facebook.com");
                i = 1342121613;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A05 = C0f9.A05(-103762687);
                AbstractC31176DnK.A1Y(this.A01);
                i = 1993905495;
                C0f9.A0C(i, A05);
                return;
            case 47:
                A05 = C0f9.A05(157979885);
                AbstractC31176DnK.A1Y(this.A01);
                i = -935887958;
                C0f9.A0C(i, A05);
                return;
            case 48:
                A05 = C0f9.A05(-830519836);
                V0L v0l3 = (V0L) this.A01;
                AbstractC68460VRq.A00(v0l3.requireActivity(), AbstractC166987dD.A0r(v0l3.A05), "instagram_ad_account_request_review_button");
                AbstractC25227BEk.A1B(v0l3);
                i = -33888701;
                C0f9.A0C(i, A05);
                return;
            case 49:
                A05 = C0f9.A05(-1430924558);
                V0L v0l4 = (V0L) this.A01;
                AbstractC68467VRx.A00(v0l4.requireActivity(), AbstractC166987dD.A0r(v0l4.A05), AbstractC25227BEk.A0v(v0l4, 2131970709), "https://help.instagram.com/contact/502692143473097");
                i = -832891977;
                C0f9.A0C(i, A05);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A05 = C0f9.A05(-1130904692);
                KCK kck = (KCK) this.A01;
                O7Z A007 = AbstractC53937NtA.A00(AbstractC166987dD.A0r(kck.A0C));
                A007.A01.flowMarkPoint(A007.A00, "RENAME_AUDIO_CANCELLED");
                AbstractC25226BEj.A1Q(kck);
                i = -1697229545;
                C0f9.A0C(i, A05);
                return;
            case 51:
                A05 = C0f9.A05(521034079);
                KCK kck2 = (KCK) this.A01;
                InterfaceC09390do interfaceC09390do5 = kck2.A0C;
                O7Z A008 = AbstractC53937NtA.A00(AbstractC166987dD.A0r(interfaceC09390do5));
                A008.A01.flowMarkPoint(A008.A00, "RENAME_AUDIO_SAVED");
                String str10 = kck2.A04;
                String A009 = KCK.A00(kck2);
                String str11 = kck2.A05;
                if (str11 == null) {
                    str = "originalTitle";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (!A009.contentEquals(str11)) {
                    if (str10 != null) {
                        AbstractC31178DnM.A10(kck2, true);
                        C50120MBu.A01(kck2, str10, AbstractC25235BEs.A0S(kck2), 25);
                        i = -1923165651;
                        C0f9.A0C(i, A05);
                        return;
                    }
                    C44466JlY c44466JlY = (C44466JlY) kck2.A0B.getValue();
                    String A0010 = KCK.A00(kck2);
                    C14360o3.A0B(A0010, 0);
                    c44466JlY.A00.A0B(A0010);
                    kck2.A08 = true;
                    LBG.A00(kck2, AbstractC166987dD.A0r(interfaceC09390do5), AbstractC37302Gc3.A0V(kck2.A02), kck2.A06);
                }
                AbstractC25226BEj.A1Q(kck2);
                i = -1923165651;
                C0f9.A0C(i, A05);
                return;
            case 52:
                A05 = C0f9.A05(-419220486);
                LYZ.A03((LYZ) this.A01);
                i = -1019517619;
                C0f9.A0C(i, A05);
                return;
            case 53:
                A05 = C0f9.A05(-965253132);
                KBW.A01((KBW) this.A01, true);
                i = -1579247606;
                C0f9.A0C(i, A05);
                return;
            case 54:
                A05 = C0f9.A05(541824025);
                KBW.A01((KBW) this.A01, false);
                i = 580333986;
                C0f9.A0C(i, A05);
                return;
            case 55:
                DialogC44330JiS dialogC44330JiS = (DialogC44330JiS) this.A01;
                dialogC44330JiS.dismiss();
                InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
                ARD.E7D("eligible_to_mock_notification_dialog_showing_quota", 0);
                ARD.apply();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(dialogC44330JiS.A00), "instagram_android_13_notifications_priming_event");
                if (!A0f.isSampled()) {
                    return;
                }
                A0f.AAP("experiment_group", "no_in_test");
                AbstractC43593JPy.A1J(A0f, "mock_system_dialog_accept_clicked");
                return;
            case 56:
                A05 = C0f9.A05(-1794644340);
                GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD = (GestureDetectorOnGestureListenerC44266JhD) this.A01;
                if (gestureDetectorOnGestureListenerC44266JhD.A0H.A01 == 0.0d) {
                    gestureDetectorOnGestureListenerC44266JhD.A03((com.instagram.creation.base.ui.mediatabbar.Tab) view.getTag(), true);
                }
                i = 490226912;
                C0f9.A0C(i, A05);
                return;
            case 57:
                A05 = C0f9.A05(-660878134);
                ((C44561Jni) this.A01).A02.invoke();
                i = -1124983467;
                C0f9.A0C(i, A05);
                return;
            case 58:
                A052 = C0f9.A05(1977731964);
                C48593LeV c48593LeV = (C48593LeV) this.A01;
                C48593LeV.A02(c48593LeV);
                view.setVisibility(4);
                AbstractC167007dF.A0x(c48593LeV.A09);
                AbstractC13880nE.A0O(view);
                C22C A012 = AnonymousClass229.A01(c48593LeV.A0L);
                String str12 = c48593LeV.A0D;
                IgdsInlineSearchBox igdsInlineSearchBox = c48593LeV.A0C;
                if (igdsInlineSearchBox != null) {
                    str2 = igdsInlineSearchBox.getSearchString();
                } else {
                    str2 = null;
                }
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(((C22F) A012).A01, "ig_camera_entity_search");
                EnumC114925Hg A0J = A012.A0J();
                C22M c22m = ((C22F) A012).A04;
                String str13 = c22m.A0L;
                if (A0f2.isSampled() && A0J != null && str13 != null) {
                    A0f2.AAP("entity", "GEN_AI_STICKER_BROWSER_PROMPT_SUBMIT");
                    AbstractC167017dG.A1A(c22m.A09, A0f2);
                    A0f2.A8R(EnumC50631MWs.A0I, "surface");
                    AbstractC166987dD.A1S(A0f2, str13);
                    AbstractC167017dG.A1B(A0f2);
                    A0f2.AAP("sticker_tray_session_id", c22m.A0U);
                    A0f2.AAP("browse_session_id", str12);
                    A0f2.A8R(c22m.A0A, "media_type");
                    AbstractC43594JPz.A1B(A0f2, c22m);
                    A0f2.A8R(A0J, "camera_destination");
                    AbstractC37302Gc3.A0t(A0f2);
                    A0f2.AAP("text_prompt", str2);
                    A0f2.Cht();
                }
                if (!c48593LeV.A0E) {
                    View view4 = c48593LeV.A07;
                    if (view4 != null) {
                        view4.setVisibility(4);
                    }
                    View view5 = c48593LeV.A03;
                    if (view5 != null) {
                        view5.setVisibility(4);
                    }
                    IgdsInlineSearchBox igdsInlineSearchBox2 = c48593LeV.A0C;
                    if (igdsInlineSearchBox2 != null && (view2 = c48593LeV.A05) != null && (view3 = c48593LeV.A02) != null) {
                        AbstractC13880nE.A0e(igdsInlineSearchBox2, 0);
                        AbstractC13880nE.A0V(igdsInlineSearchBox2, 0);
                        c48593LeV.A00 = igdsInlineSearchBox2.getHeight();
                        c48593LeV.A01 = igdsInlineSearchBox2.getWidth();
                        int A0C = AbstractC167017dG.A0C(c48593LeV.A0H);
                        int height = igdsInlineSearchBox2.getHeight() - A0C;
                        int A09 = AbstractC43594JPz.A09(view2, view3);
                        int i3 = c48593LeV.A0F;
                        AbstractC125325le A0A2 = AbstractC43592JPx.A0o(igdsInlineSearchBox2, 0).A0A();
                        A0A2.A0K((view3.getY() - igdsInlineSearchBox2.getY()) - (i3 / 2));
                        A0A2.A0J(i3);
                        A0A2.A0R(AbstractC166987dD.A07(igdsInlineSearchBox2), A09 - i3);
                        A0A2.A06 = new C49611Lw4(igdsInlineSearchBox2, A0C, height);
                        C44065Jdq.A00(A0A2, c48593LeV, 4);
                    }
                    c48593LeV.A0E = true;
                }
                i2 = -1820125242;
                C0f9.A0C(i2, A052);
                return;
            case 59:
                A05 = C0f9.A05(821140670);
                C48593LeV c48593LeV2 = (C48593LeV) this.A01;
                C22C A013 = AnonymousClass229.A01(c48593LeV2.A0L);
                String str14 = c48593LeV2.A0D;
                C448124l c448124l = A013.A09;
                C25531Mh A08 = C25531Mh.A08(c448124l.A01);
                EnumC114925Hg A0J2 = c448124l.A0J();
                if (AbstractC25226BEj.A1Z(A08) && A0J2 != null) {
                    A08.A0s("IG_CAMERA_ENTITY_TAP");
                    A08.A0q("GEN_AI_STICKER_BROWSER_PROMPT_BAR");
                    C448124l.A00(A08, c448124l);
                    A08.A0a(A0J2);
                    C22M c22m2 = c448124l.A04;
                    AbstractC167007dF.A14(A08, c22m2);
                    A08.A0U();
                    AbstractC167007dF.A13(A08);
                    A08.A0R("sticker_tray_session_id", c22m2.A0U);
                    A08.A0R("browse_session_id", str14);
                    JQ0.A1C(A08, c22m2);
                    AbstractC167017dG.A1D(A08);
                }
                i = -1947339165;
                C0f9.A0C(i, A05);
                return;
            case 60:
                A05 = C0f9.A05(1212734718);
                ((C48593LeV) this.A01).A0M.CwB();
                i = 1951540655;
                C0f9.A0C(i, A05);
                return;
            case 61:
                A05 = C0f9.A05(-615257029);
                ((KJJ) this.A01).A00.invoke();
                i = 1353800602;
                C0f9.A0C(i, A05);
                return;
            case 62:
                A05 = C0f9.A05(2027226102);
                ((C45182JzO) this.A01).A00.invoke();
                i = 730432791;
                C0f9.A0C(i, A05);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A05 = C0f9.A05(-440261107);
                C45200Jzg c45200Jzg = (C45200Jzg) this.A01;
                c45200Jzg.A02.invoke(c45200Jzg.A01);
                i = 842283174;
                C0f9.A0C(i, A05);
                return;
            case 64:
                A05 = C0f9.A05(35255863);
                ((C48591LeT) this.A01).A0R.D95();
                i = 1327881255;
                C0f9.A0C(i, A05);
                return;
            case 65:
                A052 = C0f9.A05(1741638299);
                C48591LeT c48591LeT = (C48591LeT) this.A01;
                C8EV c8ev = (C8EV) c48591LeT.A0X.getValue();
                Integer num5 = c48591LeT.A0T;
                if (c48591LeT.A04 instanceof KN7) {
                    num = C05F.A00;
                } else {
                    num = C05F.A01;
                }
                Integer num6 = c48591LeT.A0D;
                AbstractC167017dG.A1N(num5, num);
                C8EV.A00(c8ev, num5, num, num6, null, "manual_selection_undo_button_tapped");
                C8OP c8op = c48591LeT.A0S;
                LAD lad = c8op.A00;
                if (lad != null && lad.A05()) {
                    if (lad.A05()) {
                        lad.A00--;
                    }
                    C05A c05a3 = c8op.A0H;
                    do {
                        value = c05a3.getValue();
                        c8os = (C8OS) value;
                        if (lad.A05()) {
                            bitmap = lad.A01();
                        } else {
                            bitmap = lad.A02;
                        }
                        A00 = lad.A00();
                        C45112Jxh c45112Jxh3 = c8os.A03;
                        c45112Jxh = null;
                        Integer num7 = null;
                        if (c45112Jxh3 != null) {
                            C0UO c0uo = c8op.A0I;
                            C45112Jxh c45112Jxh4 = AbstractC43592JPx.A0X(c0uo).A03;
                            if (c45112Jxh4 != null) {
                                num2 = Integer.valueOf(c45112Jxh4.A02);
                            } else {
                                num2 = null;
                            }
                            C45112Jxh c45112Jxh5 = AbstractC43592JPx.A0X(c0uo).A03;
                            if (c45112Jxh5 != null) {
                                num7 = Integer.valueOf(c45112Jxh5.A01);
                            }
                            c45112Jxh = C45112Jxh.A00(c45112Jxh3, lad.A03(num2, num7));
                        }
                    } while (!c05a3.AIi(value, new C8OS(c8os.A02, bitmap, A00, c45112Jxh, c8os.A04, C05F.A0j, c8os.A08, lad.A05(), lad.A04())));
                }
                i2 = -32107636;
                C0f9.A0C(i2, A052);
                return;
            case 66:
                A052 = C0f9.A05(-1774385886);
                C48591LeT c48591LeT2 = (C48591LeT) this.A01;
                C8EV c8ev2 = (C8EV) c48591LeT2.A0X.getValue();
                Integer num8 = c48591LeT2.A0T;
                if (c48591LeT2.A04 instanceof KN7) {
                    num3 = C05F.A00;
                } else {
                    num3 = C05F.A01;
                }
                Integer num9 = c48591LeT2.A0D;
                AbstractC167017dG.A1N(num8, num3);
                C8EV.A00(c8ev2, num8, num3, num9, null, "manual_selection_redo_button_tapped");
                C8OP c8op2 = c48591LeT2.A0S;
                LAD lad2 = c8op2.A00;
                if (lad2 != null && lad2.A04()) {
                    if (lad2.A04()) {
                        lad2.A00++;
                    }
                    C05A c05a4 = c8op2.A0H;
                    do {
                        value2 = c05a4.getValue();
                        c8os2 = (C8OS) value2;
                        A01 = lad2.A01();
                        A002 = lad2.A00();
                        C45112Jxh c45112Jxh6 = c8os2.A03;
                        c45112Jxh2 = null;
                        Integer num10 = null;
                        if (c45112Jxh6 != null) {
                            C0UO c0uo2 = c8op2.A0I;
                            C45112Jxh c45112Jxh7 = AbstractC43592JPx.A0X(c0uo2).A03;
                            if (c45112Jxh7 != null) {
                                num4 = Integer.valueOf(c45112Jxh7.A02);
                            } else {
                                num4 = null;
                            }
                            C45112Jxh c45112Jxh8 = AbstractC43592JPx.A0X(c0uo2).A03;
                            if (c45112Jxh8 != null) {
                                num10 = Integer.valueOf(c45112Jxh8.A01);
                            }
                            c45112Jxh2 = C45112Jxh.A00(c45112Jxh6, lad2.A03(num4, num10));
                        }
                    } while (!c05a4.AIi(value2, new C8OS(c8os2.A02, A01, A002, c45112Jxh2, c8os2.A04, C05F.A0j, c8os2.A08, lad2.A05(), lad2.A04())));
                }
                i2 = 1562187384;
                C0f9.A0C(i2, A052);
                return;
            case 67:
                A052 = C0f9.A05(-1700265106);
                C48591LeT c48591LeT3 = (C48591LeT) this.A01;
                AbstractC47286Kux abstractC47286Kux = c48591LeT3.A04;
                List list = null;
                if ((abstractC47286Kux instanceof KN8) && (kn8 = (KN8) abstractC47286Kux) != null) {
                    C8OP c8op3 = c48591LeT3.A0S;
                    Bitmap A0E = c8op3.A0E(null, null, null, c48591LeT3.A0D, true);
                    if (A0E == null) {
                        i2 = 123815920;
                    } else {
                        SizeF sizeF2 = new SizeF((float) AbstractC166987dD.A0N(c48591LeT3.A0a.getValue()), (float) AbstractC166987dD.A0N(c48591LeT3.A0Z.getValue()));
                        int i4 = AbstractC28121CaU.A00;
                        SizeF sizeF3 = new SizeF(A0E.getWidth(), A0E.getHeight());
                        if (sizeF3.getWidth() < sizeF2.getWidth() && sizeF3.getHeight() < sizeF2.getHeight()) {
                            float width3 = sizeF3.getWidth() / sizeF3.getHeight();
                            if (width3 < sizeF2.getWidth() / sizeF2.getHeight()) {
                                width = width3 * sizeF2.getHeight();
                                width2 = sizeF2.getHeight();
                            } else {
                                width = sizeF2.getWidth();
                                width2 = sizeF2.getWidth() / width3;
                            }
                            sizeF = new SizeF(width, width2);
                        } else {
                            sizeF = new SizeF(sizeF3.getWidth(), sizeF3.getHeight());
                        }
                        Bitmap A0011 = C0fK.A00(A0E, (int) sizeF.getWidth(), (int) sizeF.getHeight(), true);
                        C14360o3.A07(A0011);
                        C48591LeT.A01(c48591LeT3);
                        InterfaceC186068Na interfaceC186068Na = c48591LeT3.A0R;
                        C0UO c0uo3 = c8op3.A0I;
                        C45112Jxh c45112Jxh9 = AbstractC43592JPx.A0X(c0uo3).A03;
                        if (c45112Jxh9 != null) {
                            str3 = c45112Jxh9.A05;
                        } else {
                            str3 = null;
                        }
                        Medium medium = kn8.A02;
                        long j = kn8.A01;
                        long j2 = kn8.A00;
                        int width4 = A0011.getWidth();
                        int height2 = A0011.getHeight();
                        C45112Jxh c45112Jxh10 = AbstractC43592JPx.A0X(c0uo3).A03;
                        if (c45112Jxh10 != null) {
                            list = (List) c45112Jxh10.A03;
                        }
                        interfaceC186068Na.D98(new C9ZM(A0011, AbstractC43592JPx.A0X(c0uo3).A01, medium, str3, list, width4, height2, j, j2, kn8.A03));
                        i2 = 781426636;
                    }
                } else {
                    i2 = 629403799;
                }
                C0f9.A0C(i2, A052);
                return;
            case 68:
                A05 = C0f9.A05(-40152981);
                C48596LeY.A03((C48596LeY) this.A01);
                i = -1120771762;
                C0f9.A0C(i, A05);
                return;
            case 69:
                A05 = C0f9.A05(-1362739540);
                C48596LeY.A06((C48596LeY) this.A01, true, true);
                i = -30128121;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(1181914305);
                ((C48590LeS) this.A01).A08.D95();
                i = 1415766697;
                C0f9.A0C(i, A05);
                return;
        }
    }
}
