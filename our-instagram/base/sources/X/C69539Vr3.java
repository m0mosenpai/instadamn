package X;

import java.util.List;

/* renamed from: X.Vr3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69539Vr3 {
    public final XG2[] A00;
    public final List A01;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if ("application/cea-708".equals(r6) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.InterfaceC72026XFo r8, X.W4Q r9) {
        /*
            r7 = this;
            r4 = 0
        L1:
            X.XG2[] r3 = r7.A00
            int r0 = r3.length
            if (r4 >= r0) goto L66
            r9.A01()
            X.W4Q.A00(r9)
            int r1 = r9.A00
            r0 = 3
            X.XG2 r2 = r8.F87(r1, r0)
            java.util.List r0 = r7.A01
            java.lang.Object r5 = r0.get(r4)
            X.W5r r5 = (X.C70130W5r) r5
            java.lang.String r6 = r5.A0Y
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 == 0) goto L2f
        L2e:
            r1 = 1
        L2f:
            java.lang.String r0 = "Invalid closed caption MIME type provided: "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r6)
            X.WDn.A03(r1, r0)
            java.lang.String r0 = r5.A0V
            if (r0 == 0) goto L60
            java.lang.String r0 = r5.A0V
        L3e:
            X.W4o r1 = new X.W4o
            r1.<init>()
            r1.A0T = r0
            r1.A00(r6)
            int r0 = r5.A0J
            r1.A0H = r0
            java.lang.String r0 = r5.A0X
            r1.A0V = r0
            int r0 = r5.A03
            r1.A02 = r0
            java.util.List r0 = r5.A0Z
            r1.A0X = r0
            X.XG2.A00(r1, r2)
            r3[r4] = r2
            int r4 = r4 + 1
            goto L1
        L60:
            X.W4Q.A00(r9)
            java.lang.String r0 = r9.A01
            goto L3e
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69539Vr3.A00(X.XFo, X.W4Q):void");
    }

    public C69539Vr3(List list) {
        this.A01 = list;
        this.A00 = new XG2[list.size()];
    }
}
