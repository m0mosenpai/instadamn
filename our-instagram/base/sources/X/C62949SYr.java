package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.SYr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62949SYr {
    public final C62451SCe A00;
    public final C41761wQ A01;
    public final C41761wQ A02;
    public final Map A03;

    public C62949SYr(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = AbstractC166987dD.A1G();
        this.A01 = new C41761wQ(null);
        this.A02 = C41761wQ.A00();
        this.A00 = new C62451SCe(userSession);
    }

    public static final C42201xA A00(C62949SYr c62949SYr, String str) {
        Map map = c62949SYr.A03;
        if (!map.containsKey(str)) {
            C42201xA A01 = AbstractC42021ws.A01(new QIy(EnumC61182Rgi.A08, str, (String) null, (List) null, (List) null, (List) null, 124));
            c62949SYr.A01.A02(A01, new THF());
            map.put(str, A01);
        }
        Object obj = map.get(str);
        C14360o3.A0A(obj);
        return (C42201xA) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
    
        if (r0 != null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C54755OHk r25, X.C54756OHl r26, X.InterfaceC65491TlC r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62949SYr.A01(X.OHk, X.OHl, X.TlC, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }
}
