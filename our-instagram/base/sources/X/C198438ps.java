package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8ps, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198438ps {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final C24Q A04;

    public C198438ps(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = new C24Q(userSession);
        this.A03 = 518917368L;
        this.A01 = 518927515L;
        this.A00 = 518925558L;
        this.A02 = 518925448L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C22P r13, X.C55U r14, java.lang.String r15, java.util.List r16, boolean r17) {
        /*
            r12 = this;
            r11 = 0
            X.C14360o3.A0B(r13, r11)
            r0 = 1
            X.C14360o3.A0B(r14, r0)
            X.24Q r5 = r12.A04
            r6 = 0
            r8 = 518925448(0x1eee2c88, float:2.5217648E-20)
            r9 = 60000(0xea60, double:2.9644E-319)
            r7 = r6
            long r7 = r5.A04(r6, r7, r8, r9)
            r12.A02 = r7
            java.lang.String r10 = r13.name()
            java.lang.String r9 = "entry_point"
            r6 = r5
            r6.A0B(r7, r9, r10, r11)
            long r7 = r12.A02
            java.lang.String r10 = r14.A02
            java.lang.String r9 = "camera_destination"
            r6.A0B(r7, r9, r10, r11)
            long r7 = r12.A02
            r4 = r16
            int r1 = r4.size()
            java.lang.String r10 = java.lang.String.valueOf(r1)
            java.lang.String r9 = "media_count"
            r6.A0B(r7, r9, r10, r11)
            long r7 = r12.A02
            boolean r1 = r4 instanceof java.util.Collection
            if (r1 == 0) goto L6b
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L6b
        L48:
            java.lang.Integer r1 = X.C05F.A00
        L4a:
            java.lang.String r10 = X.AbstractC198448pt.A00(r1)
            java.lang.String r9 = "media_type"
            r6.A0B(r7, r9, r10, r11)
            long r7 = r12.A02
            java.lang.String r10 = java.lang.String.valueOf(r17)
            java.lang.String r9 = "is_layout"
            r6.A0B(r7, r9, r10, r11)
            r4 = r15
            if (r15 == 0) goto L6a
            long r1 = r12.A02
            java.lang.String r3 = "transport_type"
            r0 = r5
            r5 = r11
            r0.A0B(r1, r3, r4, r5)
        L6a:
            return
        L6b:
            java.util.Iterator r3 = r4.iterator()
            r2 = 0
        L70:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r3.next()
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
            if (r1 == 0) goto L70
            boolean r1 = r1.Cff()
            if (r1 == 0) goto L70
            int r2 = r2 + 1
            if (r2 >= 0) goto L70
            X.AbstractC16960so.A1T()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L90:
            if (r2 == 0) goto L48
            int r1 = r4.size()
            if (r2 != r1) goto L9b
            java.lang.Integer r1 = X.C05F.A01
            goto L4a
        L9b:
            java.lang.Integer r1 = X.C05F.A0C
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198438ps.A00(X.22P, X.55U, java.lang.String, java.util.List, boolean):void");
    }

    public final void A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        this.A02 = this.A04.A07(str, str2, 518925448, this.A02);
    }

    public final void A04(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A03 = this.A04.A07(str, str2, 518917368, this.A03);
    }

    public final void A01(String str) {
        this.A00 = this.A04.A07(str, "", 518925558, this.A00);
    }

    public final void A02(String str, String str2) {
        this.A02 = this.A04.A06(str, str2, 518925448, this.A02);
    }
}
