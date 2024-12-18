package X;

import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.List;

/* renamed from: X.Kok, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46903Kok {
    public static final void A00(UserSession userSession, String str, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4) {
        AbstractC24481Hr kkc;
        List list;
        int i5;
        AbstractC167007dF.A1H(userSession, 0, str);
        Integer valueOf = Integer.valueOf(i4);
        L8o A00 = AbstractC47002KqL.A00(userSession);
        if (!C18U.A06(C06090Tz.A05, userSession, 2342161871144688255L)) {
            C0K8.A0C("ArmadilloExpressIncomingPlaceholderDispatcher", "ArmadilloExpress placeholder message is currently disabled.");
            list = null;
            i5 = 1;
        } else if (i != 5) {
            C0K8.A0C("ArmadilloExpressIncomingPlaceholderDispatcher", "Placeholder is only enabled for ArmadilloExpress.");
            list = null;
            i5 = 2;
        } else {
            A00.A00(str, AbstractC43594JPz.A10(i4), 7100, 0);
            C9AV.A00(userSession).A01(C05F.A0u, valueOf, str, TraceLogger.getTraceIdForAliasId(14, str), j2, j3, j4);
            C48518LdG c48518LdG = ((C47620L1f) userSession.A01(C47620L1f.class, new C37056GUm(userSession, 42))).A02;
            LAB lab = c48518LdG.A07;
            lab.A02(null, str, "placeholder", true);
            C47912LEg c47912LEg = c48518LdG.A04;
            C81663kb B3V = c47912LEg.A02.B3V(j2);
            if (B3V == null) {
                C47282Kut c47282Kut = new C47282Kut();
                c47912LEg.A01.A00(ThreadFetchReason.AE_MISSING_THREAD_AT_PLACEHOLDER_SYNC_OP_RENDERER, str, new MIS(c47282Kut, c47912LEg, str, i3, i4, j3, j4), i2, j2, j3);
                kkc = c47282Kut.A00;
            } else {
                List A002 = C47912LEg.A00(B3V, c47912LEg, str, i3, i4, j3, j4);
                kkc = new KKC();
                kkc.A0A(A002);
            }
            LJA lja = lab.A01;
            lja.A03(str, "render_start");
            kkc.A03(new C48529LdS(c48518LdG, str, 1)).A03(new C48530LdT(c48518LdG, str, j));
            lja.A03(str, "dispatch_end");
            return;
        }
        A00.A00(str, list, 7100, i5);
        A00.A01(str, false);
    }
}
