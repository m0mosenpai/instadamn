package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bty, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26897Bty extends C3r5 {
    public final UserSession A00;
    public final C26898Btz A01;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C26897Bty(UserSession userSession) {
        C26898Btz c26898Btz = new C26898Btz(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c26898Btz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (r11.A07 != com.instagram.api.schemas.MidCardLayoutType.A05) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C008002u A00(X.C26136BhN r11, X.C26897Bty r12, java.util.List r13, int r14) {
        /*
            r7 = r11
            com.instagram.api.schemas.ClipsMidCardType r2 = r11.A04
            com.instagram.api.schemas.ClipsMidCardType r0 = com.instagram.api.schemas.ClipsMidCardType.A0J
            r11 = r14
            if (r2 != r0) goto L4d
            com.instagram.api.schemas.MidCardLayoutType r1 = r7.A07
            com.instagram.api.schemas.MidCardLayoutType r0 = com.instagram.api.schemas.MidCardLayoutType.A05
            if (r1 != r0) goto L4d
            X.BhK r4 = r7.A06
            X.BhL r0 = r4.A01
        L12:
            java.lang.String r0 = r0.A01
            X.BQO r0 = X.MVZ.A00(r0)
        L18:
            X.02u r10 = X.C10E.A00(r0)
            java.util.List r0 = r4.A09
            int r0 = r0.size()
            if (r14 >= r0) goto L4c
            java.lang.Object r1 = r13.get(r14)
            r0 = 2
            boolean r0 = X.BWV.A00(r1, r0)
            if (r0 == 0) goto L4c
            X.BWV r1 = (X.BWV) r1
            if (r1 == 0) goto L4c
            java.lang.Object r0 = r1.A02
            X.0xP r0 = (X.InterfaceC19390xP) r0
            if (r0 == 0) goto L4c
            r9 = 0
            X.D4w r6 = new X.D4w
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            X.0po r1 = new X.0po
            r1.<init>(r6, r0)
            X.19L r0 = r12.A03()
            X.AbstractC18560vj.A03(r0, r1)
        L4c:
            return r10
        L4d:
            com.instagram.api.schemas.ClipsMidCardType r0 = com.instagram.api.schemas.ClipsMidCardType.A07
            r6 = 1
            r5 = 0
            if (r2 != r0) goto L6a
            com.instagram.api.schemas.MidCardLayoutType r1 = r7.A07
            com.instagram.api.schemas.MidCardLayoutType r0 = com.instagram.api.schemas.MidCardLayoutType.A05
            if (r1 != r0) goto L6a
            X.BhK r4 = r7.A06
            java.util.List r1 = r4.A09
            boolean r0 = X.AbstractC166987dD.A1b(r1)
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.get(r5)
        L67:
            X.BhL r0 = (X.C26134BhL) r0
            goto L12
        L6a:
            X.BhK r4 = r7.A06
            java.util.List r3 = r4.A09
            int r0 = r3.size()
            if (r14 >= r0) goto Lc1
            java.lang.Object r1 = r13.get(r14)
            r0 = 2
            boolean r0 = X.BWV.A00(r1, r0)
            if (r0 == 0) goto L91
            X.BWV r1 = (X.BWV) r1
            if (r1 == 0) goto L91
            java.lang.Object r0 = r1.A02
            X.05A r0 = (X.C05A) r0
            if (r0 == 0) goto L91
            java.lang.Object r0 = r0.getValue()
            boolean r5 = X.AbstractC166987dD.A1a(r0)
        L91:
            java.lang.Object r0 = r3.get(r14)
            X.BhL r0 = (X.C26134BhL) r0
            X.BhM r0 = r0.A00
            java.lang.Boolean r0 = r0.A08
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r6)
            if (r0 == 0) goto Lbc
            if (r5 == 0) goto Lbc
            com.instagram.api.schemas.ClipsMidCardType r0 = com.instagram.api.schemas.ClipsMidCardType.A0X
            r3 = 0
            if (r2 != r0) goto Lb1
            com.instagram.api.schemas.MidCardLayoutType r2 = r7.A07
            com.instagram.api.schemas.MidCardLayoutType r0 = com.instagram.api.schemas.MidCardLayoutType.A05
            r1 = 2131963739(0x7f132f5b, float:1.956424E38)
            if (r2 == r0) goto Lb4
        Lb1:
            r1 = 2131957295(0x7f13162f, float:1.955117E38)
        Lb4:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.BHS r0 = X.BHS.A00(r0, r1)
            goto L18
        Lbc:
            java.lang.Object r0 = r3.get(r14)
            goto L67
        Lc1:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131963729(0x7f132f51, float:1.956422E38)
            X.BHS r0 = X.BHS.A00(r1, r0)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26897Bty.A00(X.BhN, X.Bty, java.util.List, int):X.02u");
    }
}
