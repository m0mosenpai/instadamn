package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.nux.ndx.util.NdxStepsFilterer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.EUl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32535EUl extends C1P1 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C3BK A01;
    public final /* synthetic */ Integer A02;

    public C32535EUl(C3BK c3bk, Integer num, long j) {
        this.A01 = c3bk;
        this.A00 = j;
        this.A02 = num;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int i;
        Integer num;
        String str2;
        int A03 = C0f9.A03(-1320734051);
        C32165EBm c32165EBm = (C32165EBm) obj;
        int A032 = C0f9.A03(-832751050);
        C14360o3.A0B(c32165EBm, 0);
        List list = c32165EBm.A00;
        C14360o3.A0C(list, MSV.A00(114));
        ArrayList arrayList = (ArrayList) list;
        C3BK c3bk = this.A01;
        UserSession userSession = c3bk.A01;
        InterfaceC19610xo A0c = AbstractC31173DnH.A0c(C1AT.A01(userSession), C1AV.A2J);
        A0c.E7G("ndx_immersive_written_timestamp", System.currentTimeMillis());
        A0c.apply();
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A00;
        C3BL c3bl = c3bk.A02;
        Integer num2 = this.A02;
        c3bl.A01(num2, arrayList, currentTimeMillis - j);
        if (arrayList.isEmpty()) {
            A00(c3bl, C05F.A15, j);
            i = -1486879032;
        } else {
            AbstractC59962oe abstractC59962oe = c3bk.A00;
            Activity rootActivity = abstractC59962oe.getRootActivity();
            if (rootActivity == null) {
                A00(c3bl, C05F.A0D, j);
                i = -1198366184;
            } else {
                NdxStepsFilterer ndxStepsFilterer = new NdxStepsFilterer(rootActivity, userSession, c3bl, num2, arrayList);
                ArrayList arrayList2 = ndxStepsFilterer.A04;
                if (arrayList2.contains("contact_importer") && !ndxStepsFilterer.A02()) {
                    arrayList2.remove("contact_importer");
                }
                String A00 = AbstractC111324zv.A00(1082);
                if (arrayList2.contains(A00)) {
                    C70683Wf4 A002 = FA6.A00(ndxStepsFilterer.A01);
                    Context applicationContext = ndxStepsFilterer.A00.getApplicationContext();
                    C4IB c4ib = C4IB.A0C;
                    C14360o3.A0A(applicationContext);
                    C4IC A003 = A002.A00(applicationContext, c4ib, "IG4A_NDX", AbstractC166987dD.A1J(C4I9.UNKNOWN));
                    C4IC c4ic = C4IC.A06;
                    C3BL c3bl2 = ndxStepsFilterer.A02;
                    Integer num3 = ndxStepsFilterer.A03;
                    boolean z = true;
                    if (A003 == c4ic) {
                        z = false;
                    }
                    C14360o3.A0B(num3, 0);
                    if (z) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                    }
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c3bl2.A00, "ig4a_ndx_request");
                    A0f.AAP("flow_name", A00);
                    if (num.intValue() != 0) {
                        str2 = "fail_client_filter";
                    } else {
                        str2 = "pass_client_filter";
                    }
                    AbstractC31177DnL.A1E(A0f, str2);
                    AbstractC31175DnJ.A18(A0f, AbstractC34276F9w.A00(num3));
                    if (!z) {
                        arrayList2.remove(A00);
                    }
                }
                if (arrayList2.isEmpty()) {
                    i = -2065298308;
                } else {
                    A00(c3bl, C05F.A0u, j);
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("ndx_eligible_flows", AbstractC31175DnJ.A0b(arrayList2));
                    A1G.put("qp_id", "3");
                    A1G.put("family_device_id", AbstractC31172DnG.A0P(userSession).A02(C19T.A25));
                    A1G.put(MSV.A00(385), AbstractC31174DnI.A0s());
                    A1G.put("app_id", "567067343352427");
                    if (1 - num2.intValue() != 0) {
                        str = "NDX_IG_IMMERSIVE_A13";
                    } else {
                        str = "NDX_IG_IMMERSIVE";
                    }
                    A1G.put("ig_ndx_source", str);
                    try {
                        C62862tP A033 = C62862tP.A03(abstractC59962oe, userSession, null);
                        AbstractC192798gL A02 = C192108fB.A02(null, userSession, "com.instagram.ndx.common.push_ig_ndx_screen", A1G);
                        A02.A00(new C32386EOm(A033, c3bk, j));
                        abstractC59962oe.schedule(A02);
                        i = 1722689896;
                    } catch (IllegalStateException e) {
                        AbstractC167017dG.A1J(C18950wb.A01, "ig_ndx_show_flows_error", e, 817895070);
                        A00(c3bl, C05F.A07, j);
                        C0f9.A0A(-103151592, A032);
                    }
                }
            }
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-160228574, A03);
    }

    public static void A00(C3BL c3bl, Integer num, long j) {
        c3bl.A00(num, Long.valueOf(System.currentTimeMillis() - j));
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1336312353);
        InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
        if (A0L != null) {
            str = A0L.getErrorMessage();
        } else {
            str = null;
        }
        C0f5 AEp = C18950wb.A01.AEp("ig_ndx_server_request_error", 817895070);
        AEp.ERI(new Exception(str));
        AEp.report();
        this.A01.A02.A00(C05F.A1I, Long.valueOf(System.currentTimeMillis() - this.A00));
        C0f9.A0A(-1881079797, A0N);
    }
}
