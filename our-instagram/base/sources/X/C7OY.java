package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7OY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7OY {
    public final UserSession A00;

    public C7OY(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.EnumC161597Lu r6, X.C7TT r7) {
        /*
            r5 = this;
            r4 = 1
            X.C14360o3.A0B(r7, r4)
            X.52z r3 = r7.A0N
            boolean r0 = r3.A08
            if (r0 == 0) goto L90
            com.instagram.common.session.UserSession r2 = r5.A00
            X.3oI r0 = r7.A0P
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r0 instanceof X.C83693oE
            if (r0 != r4) goto L16
            r1 = 1
        L16:
            boolean r0 = X.C6X6.A0D(r2, r7, r1)
            if (r0 == 0) goto L90
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.Integer r0 = r3.A02
            java.lang.String r2 = "null"
            if (r0 != 0) goto L7f
            r1 = r2
        L28:
            java.lang.String r0 = "ttlSec"
            r4.put(r0, r1)
        L2d:
            java.lang.String r0 = r3.A07
            if (r0 != 0) goto L36
            java.lang.String r0 = "lastSetActorId"
            r4.put(r0, r2)
        L36:
            java.lang.Long r0 = r3.A05
            if (r0 != 0) goto L3f
            java.lang.String r0 = "lastSetTimestampMs"
            r4.put(r0, r2)
        L3f:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L90
            X.0wb r2 = X.C18950wb.A01
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "Invalid disappearing mode metadata"
            X.0f5 r3 = r2.AEp(r0, r1)
            java.lang.String r1 = r6.name()
            java.lang.String r0 = "VALIDATION_POINT"
            r3.ABW(r0, r1)
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L63:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.ABW(r1, r0)
            goto L63
        L7f:
            int r0 = r0.intValue()
            if (r0 != 0) goto L88
            java.lang.String r1 = "0 while DM is on"
            goto L28
        L88:
            if (r0 >= 0) goto L2d
            java.lang.String r1 = "negative while DM is on"
            goto L28
        L8d:
            r3.report()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7OY.A00(X.7Lu, X.7TT):void");
    }
}
