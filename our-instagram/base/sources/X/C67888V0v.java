package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.survey.structuredsurvey.views.SurveyListView;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.V0v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67888V0v extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "RapidFeedbackSurveyFragment";
    public int A00;
    public C69127ViI A02;
    public C67888V0v A03;
    public UB6 A04;
    public SurveyListView A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public View A0C;
    public boolean A0D;
    public final HashMap A0G = new HashMap();
    public final Map A0I = new HashMap();
    public final Map A0H = new HashMap();
    public final C69162Vir A0F = new C69162Vir();
    public final InterfaceC09390do A0J = AbstractC09440dt.A01(C71784X4l.A00);
    public final long A0E = System.currentTimeMillis();
    public long A01 = System.currentTimeMillis();
    public final InterfaceC09390do A0K = AbstractC60492pY.A02(this);
    public final View.OnClickListener A0L = new WNS(this, 15);

    public final void A05(String str, boolean z) {
        C14360o3.A0B(str, 0);
        this.A0H.put(str, Boolean.valueOf(z));
        C67888V0v c67888V0v = this.A03;
        if (c67888V0v != null) {
            A03(c67888V0v);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        boolean z;
        ColorFilter A00;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.Efu(2131971488);
        Integer num = C05F.A00;
        WNS wns = new WNS(this, 14);
        Iterator A15 = AbstractC166997dE.A15(this.A0I);
        while (true) {
            if (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                Object key = entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    Object obj = this.A0H.get(key);
                    if (obj != null) {
                        if (!((Boolean) obj).booleanValue()) {
                            z = false;
                            break;
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            } else {
                z = true;
                break;
            }
        }
        Context requireContext = requireContext();
        if (z) {
            A00 = C3DY.A00(requireContext.getColor(R.color.badge_color));
            interfaceC56362iU.ARS(true);
        } else {
            A00 = C3DY.A00(requireContext.getColor(R.color.blue_3));
            interfaceC56362iU.ARS(false);
        }
        interfaceC56362iU.EkH(this.A0L, true);
        interfaceC56362iU.Ehg(new C114795Gm(null, A00, null, null, null, wns, num, -2, -2, -2, 2131954754, R.drawable.instagram_x_pano_outline_24, 2131968535, R.drawable.nav_arrow_next, true));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = A01(requireContext(), this);
        View view2 = this.A0C;
        if (view2 == null) {
            str = "rootView";
        } else {
            SurveyListView surveyListView = (SurveyListView) AbstractC166997dE.A0S(view2, R.id.rapidfeedback_page).requireViewById(R.id.rapidfeedback_page_list);
            this.A05 = surveyListView;
            if (surveyListView == null) {
                str = "surveyListView";
            } else {
                surveyListView.setAdapter((ListAdapter) this.A04);
                UB6 ub6 = this.A04;
                if (ub6 != null) {
                    ub6.A00 = getActivity();
                }
                this.A03 = this;
                A03(this);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r1.equals(com.instagram.realtimeclient.RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00eb, code lost:
    
        if (r1 != null) goto L57;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A00(X.XEN r7) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67888V0v.A00(X.XEN):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0328 A[Catch: IllegalArgumentException -> 0x0361, NullPointerException -> 0x0369, TryCatch #2 {IllegalArgumentException -> 0x0361, NullPointerException -> 0x0369, blocks: (B:52:0x011a, B:54:0x012a, B:56:0x012f, B:119:0x0360, B:59:0x0141, B:60:0x014a, B:62:0x0150, B:63:0x015c, B:65:0x0162, B:66:0x0174, B:68:0x017a, B:73:0x0189, B:74:0x0192, B:76:0x0198, B:92:0x01a4, B:93:0x01ae, B:95:0x01b4, B:98:0x01bc, B:120:0x01c5, B:137:0x01da, B:127:0x020b, B:128:0x02fe, B:129:0x0306, B:130:0x0309, B:141:0x0234, B:142:0x0253, B:144:0x0259, B:151:0x0265, B:147:0x028f, B:154:0x02f1, B:156:0x02f5, B:157:0x030e, B:159:0x02a3, B:161:0x02c6, B:163:0x02cc, B:170:0x02d8, B:166:0x02dc, B:173:0x02e1, B:175:0x02e7, B:103:0x0322, B:105:0x0328, B:106:0x0338, B:108:0x033e, B:111:0x0348, B:116:0x0356, B:118:0x0359), top: B:51:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0359 A[Catch: IllegalArgumentException -> 0x0361, NullPointerException -> 0x0369, TryCatch #2 {IllegalArgumentException -> 0x0361, NullPointerException -> 0x0369, blocks: (B:52:0x011a, B:54:0x012a, B:56:0x012f, B:119:0x0360, B:59:0x0141, B:60:0x014a, B:62:0x0150, B:63:0x015c, B:65:0x0162, B:66:0x0174, B:68:0x017a, B:73:0x0189, B:74:0x0192, B:76:0x0198, B:92:0x01a4, B:93:0x01ae, B:95:0x01b4, B:98:0x01bc, B:120:0x01c5, B:137:0x01da, B:127:0x020b, B:128:0x02fe, B:129:0x0306, B:130:0x0309, B:141:0x0234, B:142:0x0253, B:144:0x0259, B:151:0x0265, B:147:0x028f, B:154:0x02f1, B:156:0x02f5, B:157:0x030e, B:159:0x02a3, B:161:0x02c6, B:163:0x02cc, B:170:0x02d8, B:166:0x02dc, B:173:0x02e1, B:175:0x02e7, B:103:0x0322, B:105:0x0328, B:106:0x0338, B:108:0x033e, B:111:0x0348, B:116:0x0356, B:118:0x0359), top: B:51:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b4 A[Catch: IllegalArgumentException -> 0x0361, NullPointerException -> 0x0369, TryCatch #2 {IllegalArgumentException -> 0x0361, NullPointerException -> 0x0369, blocks: (B:52:0x011a, B:54:0x012a, B:56:0x012f, B:119:0x0360, B:59:0x0141, B:60:0x014a, B:62:0x0150, B:63:0x015c, B:65:0x0162, B:66:0x0174, B:68:0x017a, B:73:0x0189, B:74:0x0192, B:76:0x0198, B:92:0x01a4, B:93:0x01ae, B:95:0x01b4, B:98:0x01bc, B:120:0x01c5, B:137:0x01da, B:127:0x020b, B:128:0x02fe, B:129:0x0306, B:130:0x0309, B:141:0x0234, B:142:0x0253, B:144:0x0259, B:151:0x0265, B:147:0x028f, B:154:0x02f1, B:156:0x02f5, B:157:0x030e, B:159:0x02a3, B:161:0x02c6, B:163:0x02cc, B:170:0x02d8, B:166:0x02dc, B:173:0x02e1, B:175:0x02e7, B:103:0x0322, B:105:0x0328, B:106:0x0338, B:108:0x033e, B:111:0x0348, B:116:0x0356, B:118:0x0359), top: B:51:0x011a }] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.VAU, java.lang.Object, X.W1u] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.VAU, java.lang.Object, X.W1u] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, X.W1u, X.VAQ] */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.VJX] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [X.VJX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.VJX, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.UB6 A01(android.content.Context r18, X.C67888V0v r19) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67888V0v.A01(android.content.Context, X.V0v):X.UB6");
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, X.Vd4] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, X.VgH] */
    public static final void A02(Context context, C67888V0v c67888V0v, String str, String str2) {
        C69162Vir c69162Vir = c67888V0v.A0F;
        ArrayList arrayList = new ArrayList();
        Iterator A14 = AbstractC166997dE.A14(c69162Vir.A00);
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            String str3 = (String) entry.getKey();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                arrayList2.add(((VJX) it.next()).A02);
            }
            ?? obj = new Object();
            obj.A00 = str3;
            obj.A01 = arrayList2;
            arrayList.add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (List list : c69162Vir.A01) {
            ?? obj2 = new Object();
            obj2.A00 = list;
            arrayList3.add(obj2);
        }
        String A0j = AbstractC167017dG.A0j();
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0r("input");
            A0S.A0d();
            A0S.A0S("survey_id", str);
            C16V.A03(A0S, "answers");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                VgH vgH = (VgH) it2.next();
                if (vgH != null) {
                    A0S.A0d();
                    String str4 = vgH.A00;
                    if (str4 != null) {
                        A0S.A0S("question_id", str4);
                    }
                    List list2 = vgH.A01;
                    if (list2 != null) {
                        Iterator A0q = AbstractC37301Gc2.A0q(A0S, "answers", list2);
                        while (A0q.hasNext()) {
                            AbstractC167017dG.A1F(A0S, A0q);
                        }
                        A0S.A0Z();
                    }
                    A0S.A0a();
                }
            }
            A0S.A0Z();
            C16V.A03(A0S, "pages");
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                C68848Vd4 c68848Vd4 = (C68848Vd4) it3.next();
                if (c68848Vd4 != null) {
                    A0S.A0d();
                    List list3 = c68848Vd4.A00;
                    if (list3 != null) {
                        Iterator A0q2 = AbstractC37301Gc2.A0q(A0S, "question_ids", list3);
                        while (A0q2.hasNext()) {
                            AbstractC167017dG.A1F(A0S, A0q2);
                        }
                        A0S.A0Z();
                    }
                    A0S.A0a();
                }
            }
            A0S.A0Z();
            A0S.A0S("session_blob", str2);
            A0S.A0S("client_mutation_id", A0j);
            A0S.A0S("actor_id", "0");
            A0S.A0a();
            C907642p c907642p = new C907642p(OPA.class, "StructuredSurveySubmitResponseMutation", AbstractC167017dG.A0l(A0S, stringWriter), false);
            C67954V3t c67954V3t = new C67954V3t(17, context, c67888V0v);
            C907542o c907542o = new C907542o(AbstractC25230BEn.A0k(c67888V0v.A0K, 0));
            c907542o.A09(c907642p);
            Integer num = C05F.A00;
            c907542o.A08 = "ads_viewer_context_policy";
            C1ON A07 = c907542o.A07(num);
            A07.A00 = c67954V3t;
            C1GJ.A03(A07);
        } catch (IOException e) {
            String A00 = AbstractC111324zv.A00(629);
            C0K8.A0G(__redex_internal_original_name, A00, e);
            C0w9.A06(__redex_internal_original_name, A00, e);
        }
    }

    public static final void A04(C67888V0v c67888V0v, List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        List<String> list2 = (List) c67888V0v.A0J.getValue();
        ArrayList<C09530e4> arrayList2 = new ArrayList();
        for (String str : list2) {
            ArrayList A00 = AbstractC68580VWh.A00(str, list);
            if (A00 != null) {
                AbstractC166997dE.A1R(str, A00, arrayList2);
            }
        }
        for (C09530e4 c09530e4 : arrayList2) {
            Object obj = c09530e4.A00;
            List list3 = (List) c09530e4.A01;
            ArrayList A0q = AbstractC167017dG.A0q(list3);
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                A0q.add(((VJX) it.next()).A02);
            }
            AbstractC166997dE.A1R(obj, A0q, arrayList);
        }
        if (!arrayList.isEmpty()) {
            AbstractC68579VWg.A00((UserSession) c67888V0v.A0K.getValue()).A04(arrayList, c67888V0v.A0E, c67888V0v.A01, c67888V0v.A00, false);
            return;
        }
        if (z) {
            return;
        }
        C41703IdX A002 = AbstractC68579VWg.A00((UserSession) c67888V0v.A0K.getValue());
        long j = c67888V0v.A0E;
        long j2 = c67888V0v.A01;
        long j3 = c67888V0v.A00;
        if (A002.A00 == null) {
            return;
        }
        UserSession userSession = A002.A01;
        C18920wW A003 = AbstractC12220kQ.A00(null, C12180kM.A05, userSession);
        InterfaceC02590Ai A004 = A003.A00(A003.A00, "ig_survey_skip");
        if (!A004.isSampled()) {
            return;
        }
        Long[] A01 = C41703IdX.A01(j, j2, false);
        C41596Iaj c41596Iaj = A002.A00;
        if (c41596Iaj != null) {
            String str2 = c41596Iaj.A08;
            if (str2 != null) {
                A004.AAP("survey_id", str2);
                C41596Iaj c41596Iaj2 = A002.A00;
                if (c41596Iaj2 != null) {
                    Long l = c41596Iaj2.A02;
                    if (l != null) {
                        A004.A9K("tessa_config_id", l);
                        C41596Iaj c41596Iaj3 = A002.A00;
                        if (c41596Iaj3 != null) {
                            Long l2 = c41596Iaj3.A03;
                            if (l2 != null) {
                                A004.A9K(AbstractC111324zv.A00(3221), l2);
                                A004.A9K("ig_user_id", AbstractC25228BEl.A13(userSession.userId));
                                C41596Iaj c41596Iaj4 = A002.A00;
                                if (c41596Iaj4 != null) {
                                    String str3 = c41596Iaj4.A04;
                                    if (str3 != null) {
                                        A004.AAP("container_module", str3);
                                        A004.A9K(AbstractC111324zv.A00(5039), A01[1]);
                                        A004.A9K("total_dwell_time", A01[0]);
                                        A004.A9K("page_id", Long.valueOf(j3));
                                        A004.A9K(AbstractC111324zv.A00(1972), null);
                                        A004.A9K(AbstractC111324zv.A00(1971), null);
                                        A004.AAP(AbstractC111324zv.A00(1973), null);
                                        A004.A9K(AbstractC111324zv.A00(1970), null);
                                        if (A002.A00 != null) {
                                            A004.AAP(AbstractC111324zv.A00(385), null);
                                            C41596Iaj c41596Iaj5 = A002.A00;
                                            if (c41596Iaj5 != null) {
                                                A004.A9K("ig_media_id", c41596Iaj5.A00);
                                                if (A002.A00 != null) {
                                                    A004.AAP(AbstractC43591JPw.A00(178), null);
                                                    if (A002.A00 != null) {
                                                        A004.AAP(AbstractC111324zv.A00(2769), null);
                                                        if (A002.A00 != null) {
                                                            A004.AAP("notification_type", null);
                                                            if (A002.A00 != null) {
                                                                A004.A9K("ad_campaign_id", null);
                                                                if (A002.A00 != null) {
                                                                    A004.AAP("ad_tracking_token", null);
                                                                    if (A002.A00 != null) {
                                                                        A004.A9K("ad_id", null);
                                                                        C41596Iaj c41596Iaj6 = A002.A00;
                                                                        if (c41596Iaj6 != null) {
                                                                            A004.AAP("ranking_info_token", c41596Iaj6.A07);
                                                                            if (A002.A00 != null) {
                                                                                A004.AAP(AbstractC111324zv.A00(2027), null);
                                                                                if (A002.A00 != null) {
                                                                                    A004.A9K(AbstractC111324zv.A00(360), null);
                                                                                    if (A002.A00 != null) {
                                                                                        A004.A9K(AbstractC111324zv.A00(937), null);
                                                                                        C41596Iaj c41596Iaj7 = A002.A00;
                                                                                        if (c41596Iaj7 != null) {
                                                                                            A004.A9K("position_in_tray", c41596Iaj7.A01);
                                                                                            C41596Iaj c41596Iaj8 = A002.A00;
                                                                                            if (c41596Iaj8 != null) {
                                                                                                A004.AAP(AbstractC111324zv.A00(104), c41596Iaj8.A06);
                                                                                                C41596Iaj c41596Iaj9 = A002.A00;
                                                                                                if (c41596Iaj9 != null) {
                                                                                                    AbstractC25232BEp.A1L(A004, AbstractC111324zv.A00(2181), c41596Iaj9.A05);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C14360o3.A0F("baseEventFields");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0K.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A0K;
        if (AbstractC25351Lp.A02((UserSession) interfaceC09390do.getValue())) {
            List list = this.A0B;
            if (list != null) {
                A04(this, list, true);
            }
            AbstractC68579VWg.A00((UserSession) interfaceC09390do.getValue()).A02(this.A0E, this.A01, this.A00, false);
        }
        AbstractC25227BEk.A1B(this);
        return true;
    }

    public static final void A03(C67888V0v c67888V0v) {
        C1UC requireActivity = c67888V0v.requireActivity();
        C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(21));
        C56352iT AYT = ((C2d4) requireActivity).AYT();
        if (AYT != null) {
            c67888V0v.configureActionBar(AYT);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(797301382);
        super.onActivityCreated(bundle);
        if (!this.A0D) {
            String str2 = this.A07;
            if (str2 == null) {
                str = "integrationPointId";
            } else {
                String str3 = this.A0A;
                if (str3 == null) {
                    str = "surveyId";
                } else {
                    String str4 = this.A09;
                    if (str4 == null) {
                        str = "sessionBlob";
                    } else {
                        InterfaceC09390do interfaceC09390do = this.A0K;
                        AbstractC68578VWf.A00((UserSession) interfaceC09390do.getValue(), C05F.A0C, str2, str3, str4, null);
                        if (AbstractC25351Lp.A02((UserSession) interfaceC09390do.getValue())) {
                            C41703IdX A00 = AbstractC68579VWg.A00((UserSession) interfaceC09390do.getValue());
                            if (A00.A00 == null) {
                                AbstractC12120kG.A07(AbstractC111324zv.A00(3722), "Unable to log survey enter event ig_survey_enter due to Base event fields not initialized from initial impression", null);
                            } else {
                                UserSession userSession = A00.A01;
                                C18920wW A002 = AbstractC12220kQ.A00(null, C12180kM.A05, userSession);
                                InterfaceC02590Ai A003 = A002.A00(A002.A00, "ig_survey_enter");
                                if (A003.isSampled()) {
                                    C41596Iaj c41596Iaj = A00.A00;
                                    str = "baseEventFields";
                                    if (c41596Iaj != null) {
                                        String str5 = c41596Iaj.A08;
                                        if (str5 != null) {
                                            A003.AAP("survey_id", str5);
                                            C41596Iaj c41596Iaj2 = A00.A00;
                                            if (c41596Iaj2 != null) {
                                                Long l = c41596Iaj2.A02;
                                                if (l != null) {
                                                    A003.A9K("tessa_config_id", l);
                                                    C41596Iaj c41596Iaj3 = A00.A00;
                                                    if (c41596Iaj3 != null) {
                                                        Long l2 = c41596Iaj3.A03;
                                                        if (l2 != null) {
                                                            A003.A9K(AbstractC111324zv.A00(3221), l2);
                                                            A003.A9K("ig_user_id", AbstractC25228BEl.A13(userSession.userId));
                                                            C41596Iaj c41596Iaj4 = A00.A00;
                                                            if (c41596Iaj4 != null) {
                                                                String str6 = c41596Iaj4.A04;
                                                                if (str6 != null) {
                                                                    A003.AAP("container_module", str6);
                                                                    if (A00.A00 != null) {
                                                                        A003.AAP(AbstractC111324zv.A00(385), null);
                                                                        C41596Iaj c41596Iaj5 = A00.A00;
                                                                        if (c41596Iaj5 != null) {
                                                                            A003.A9K("ig_media_id", c41596Iaj5.A00);
                                                                            if (A00.A00 != null) {
                                                                                A003.AAP(AbstractC43591JPw.A00(178), null);
                                                                                if (A00.A00 != null) {
                                                                                    A003.AAP(AbstractC111324zv.A00(2769), null);
                                                                                    if (A00.A00 != null) {
                                                                                        A003.AAP("notification_type", null);
                                                                                        if (A00.A00 != null) {
                                                                                            A003.A9K("ad_campaign_id", null);
                                                                                            if (A00.A00 != null) {
                                                                                                A003.AAP("ad_tracking_token", null);
                                                                                                if (A00.A00 != null) {
                                                                                                    A003.A9K("ad_id", null);
                                                                                                    C41596Iaj c41596Iaj6 = A00.A00;
                                                                                                    if (c41596Iaj6 != null) {
                                                                                                        A003.AAP("ranking_info_token", c41596Iaj6.A07);
                                                                                                        if (A00.A00 != null) {
                                                                                                            A003.AAP(AbstractC111324zv.A00(2027), null);
                                                                                                            if (A00.A00 != null) {
                                                                                                                A003.A9K(AbstractC111324zv.A00(360), null);
                                                                                                                if (A00.A00 != null) {
                                                                                                                    A003.A9K(AbstractC111324zv.A00(937), null);
                                                                                                                    C41596Iaj c41596Iaj7 = A00.A00;
                                                                                                                    if (c41596Iaj7 != null) {
                                                                                                                        A003.A9K("position_in_tray", c41596Iaj7.A01);
                                                                                                                        C41596Iaj c41596Iaj8 = A00.A00;
                                                                                                                        if (c41596Iaj8 != null) {
                                                                                                                            A003.AAP(AbstractC111324zv.A00(104), c41596Iaj8.A06);
                                                                                                                            C41596Iaj c41596Iaj9 = A00.A00;
                                                                                                                            if (c41596Iaj9 != null) {
                                                                                                                                AbstractC25232BEp.A1L(A003, AbstractC111324zv.A00(2181), c41596Iaj9.A05);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException("Required value was null.");
                                                                }
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Required value was null.");
                                                        }
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            }
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                }
                            }
                        }
                        this.A0D = true;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A09(1697671062, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1564340856);
        super.onCreate(bundle);
        EVO.A00(this);
        this.A00 = -1;
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("ARG_OUTRO_TOAST_TEXT");
        if (string != null) {
            this.A08 = string;
            String string2 = requireArguments.getString("ARG_INTEGRATION_POINT_ID");
            if (string2 != null) {
                this.A07 = string2;
                String string3 = requireArguments.getString("ARG_SURVEY_ID");
                if (string3 != null) {
                    this.A0A = string3;
                    String string4 = requireArguments.getString("ARG_SESSION_BLOB");
                    if (string4 != null) {
                        this.A09 = string4;
                        try {
                            C69127ViI parseFromJson = AbstractC69952VyS.parseFromJson(C16V.A00(requireArguments.getString("ARG_SERIALIZED_MODEL_DATA")));
                            this.A02 = parseFromJson;
                            if (parseFromJson == null) {
                                C14360o3.A0F("model");
                                throw C00O.createAndThrow();
                            }
                            this.A06 = parseFromJson.A01;
                            if (AbstractC001800i.A0u(AbstractC16960so.A1Q("linear", "linear_bucket", "control_node"), this.A06)) {
                                C0f9.A09(1243151552, A02);
                                return;
                            }
                            throw AbstractC31172DnG.A0u();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2103771436);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.rapidfeedback_page_view, viewGroup, false);
        this.A0C = inflate;
        if (inflate == null) {
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
        C0f9.A09(-1136727333, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        int A02 = C0f9.A02(1033711817);
        super.onPause();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        C0f9.A09(-2133435124, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        int A02 = C0f9.A02(-1286123284);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        C0f9.A09(1672787879, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        Window window;
        int A02 = C0f9.A02(-835903758);
        super.onStop();
        AbstractC13880nE.A0O(this.mView);
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(3);
        }
        C0f9.A09(-1861074974, A02);
    }
}
