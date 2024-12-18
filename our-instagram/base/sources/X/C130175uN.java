package X;

/* renamed from: X.5uN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130175uN {
    public static final C130175uN A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A01(android.app.Activity r9, com.instagram.common.session.UserSession r10, X.C38321qM r11) {
        /*
            r8 = this;
            r5 = 0
            if (r9 == 0) goto L3b
            r1 = r9
        L4:
            X.2iT r0 = X.C56342iS.A00(r9)
            if (r0 == 0) goto L39
            int r0 = r0.AYS()
        Le:
            android.util.Size r7 = X.C41C.A00(r1, r10, r11, r0, r5)
            java.util.List r6 = r11.A3j()
            r2 = 0
            if (r6 == 0) goto Lcf
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r6.iterator()
        L22:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.4lS r0 = (X.InterfaceC103524lS) r0
            boolean r0 = X.BSN.A01(r0)
            if (r0 == 0) goto L22
            r4.add(r1)
            goto L22
        L39:
            r0 = 0
            goto Le
        L3b:
            X.0vz r0 = r10.deviceSession
            android.content.Context r1 = r0.A06()
            goto L4
        L42:
            boolean r0 = r11.A5M()
            r3 = 1069547520(0x3fc00000, float:1.5)
            if (r0 == 0) goto L9f
            if (r7 == 0) goto Laa
            int r0 = r7.getWidth()
            float r1 = (float) r0
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
        L57:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto Laa
            java.lang.Integer r3 = X.C05F.A00
        L5d:
            X.C14360o3.A0B(r3, r5)
            int r0 = r3.intValue()
            r1 = 1
            if (r0 == r5) goto L68
            r1 = 2
        L68:
            int r0 = r6.size()
            if (r0 > r1) goto L72
            int r1 = r6.size()
        L72:
            int r0 = r4.size()
            if (r0 > r1) goto Lad
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r4.iterator()
        L81:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lcf
            java.lang.Object r0 = r3.next()
            X.4lS r0 = (X.InterfaceC103524lS) r0
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L81
            r0 = 10
            java.lang.Long r0 = X.AbstractC003100w.A0k(r0, r1)
            if (r0 == 0) goto L81
            r2.add(r0)
            goto L81
        L9f:
            boolean r0 = r11.A5P()
            if (r0 != 0) goto Laa
            float r1 = r11.A0m()
            goto L57
        Laa:
            java.lang.Integer r3 = X.C05F.A01
            goto L5d
        Lad:
            java.lang.Integer r0 = X.C05F.A00
            if (r3 == r0) goto Lcf
            java.lang.Object r0 = X.AbstractC001800i.A0J(r4)
            X.4lS r0 = (X.InterfaceC103524lS) r0
            if (r0 == 0) goto Lcf
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto Lcf
            r0 = 10
            java.lang.Long r0 = X.AbstractC003100w.A0k(r0, r1)
            if (r0 == 0) goto Lcf
            java.lang.Long[] r0 = new java.lang.Long[]{r0}
            java.util.ArrayList r2 = X.AbstractC16960so.A1N(r0)
        Lcf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130175uN.A01(android.app.Activity, com.instagram.common.session.UserSession, X.1qM):java.util.List");
    }

    public static final Long A00(C38321qM c38321qM) {
        if (c38321qM.A3j() != null) {
            return Long.valueOf(r0.size());
        }
        return null;
    }
}
