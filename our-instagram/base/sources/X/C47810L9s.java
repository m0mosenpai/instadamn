package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.L9s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47810L9s {
    public final UserSession A00;
    public final C9AW A01;
    public final C26141Ov A02;
    public final C48502Lct A03;
    public final LAA A04;
    public final C2DS A05;
    public final C26141Ov A06;

    public final void A02(String str) {
        C1OW c1ow;
        C14360o3.A0B(str, 0);
        L4J l4j = (L4J) this.A03.A00.get(str);
        if (l4j != null) {
            c1ow = l4j.A03;
        } else {
            c1ow = null;
        }
        if (c1ow instanceof AbstractC29011ae) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36323968646983410L)) {
                AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
                abstractC29011ae.A01 = EnumC46200Kcc.A05;
                C26141Ov c26141Ov = this.A06;
                String str2 = abstractC29011ae.A05;
                C120185cH c120185cH = c26141Ov.A0A;
                Pair A01 = c120185cH.A01(str2);
                if (A01 != null) {
                    c120185cH.A02((C1OW) A01.first, (MNP) A01.second);
                }
            }
        }
        this.A01.A00(new KOB(c1ow, str));
    }

    public final void A00(TransportPayload transportPayload, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, DirectThreadKey directThreadKey, String str, String str2, String str3, long j) {
        AbstractC167017dG.A1S(str, str2);
        this.A01.A00(new KOD(c1ow, null, C05F.A00, Long.valueOf(j), str2, null, str3));
        this.A03.A00.put(str, new L4J(transportPayload, interfaceC37261GbE, c1ow, directThreadKey, str2, j));
    }

    public final void A01(TransportPayload transportPayload, InterfaceC37261GbE interfaceC37261GbE, C114675Fx c114675Fx, String str) {
        AbstractC167017dG.A1P(c114675Fx, interfaceC37261GbE);
        C14360o3.A0B(transportPayload, 3);
        String str2 = c114675Fx.A03;
        String str3 = c114675Fx.A04;
        C0K8.A0O("ArmadilloExpressSendEventListener", "Send message failed: errorCode=%s, errorMessage=%s", str2, str3);
        interfaceC37261GbE.DUq(c114675Fx, null);
        L4J l4j = (L4J) this.A03.A00.remove(str);
        if (l4j != null) {
            C9AW c9aw = this.A01;
            Integer num = C05F.A0C;
            Long valueOf = Long.valueOf(l4j.A00);
            C1OW c1ow = l4j.A03;
            String str4 = l4j.A04.A00;
            if (str4 != null) {
                c9aw.A00(new KOD(c1ow, c114675Fx, num, valueOf, null, str4, null));
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C47618L1d A00 = AbstractC46894Kob.A00(this.A00);
        int hashCode = str.hashCode();
        if (str3 != null) {
            A00.A00.markerAnnotate(20128010, hashCode, "error", str3);
        }
        A00.A00.markerEnd(20128010, hashCode, (short) 3);
    }

    public C47810L9s(UserSession userSession) {
        this.A00 = userSession;
        this.A02 = C26141Ov.A01(userSession);
        this.A01 = C9AV.A00(userSession);
        C14360o3.A0B(userSession, 0);
        this.A03 = (C48502Lct) userSession.A01(C48502Lct.class, C50222MGd.A00);
        this.A06 = C26141Ov.A01(userSession);
        this.A05 = C2JD.A00(userSession);
        this.A04 = AbstractC46927Kp8.A00(userSession);
    }
}
