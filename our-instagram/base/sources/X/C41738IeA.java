package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IeA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41738IeA {
    public static final C41738IeA A00 = new Object();

    public static final C50112Sa A01(C07X c07x, UserSession userSession, String str) {
        C07T lifecycle;
        if (str == null || (lifecycle = c07x.getLifecycle()) == null) {
            return null;
        }
        return AbstractC23641Du.A02(AnonymousClass191.A00, new PXV(userSession, str, null, 12), AbstractC57302k5.A00(lifecycle));
    }

    public static final C50112Sa A02(C07X c07x, UserSession userSession, String str, String str2) {
        C07T lifecycle = c07x.getLifecycle();
        if (lifecycle == null) {
            return null;
        }
        C57312k6 A002 = AbstractC57302k5.A00(lifecycle);
        return AbstractC23641Du.A02(AnonymousClass191.A00, new C43165J6d(userSession, str, str2, null), A002);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
    
        if (r0 == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r8, X.C41738IeA r9, java.lang.String r10, java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r3 = 29
            boolean r0 = X.C57147PWz.A02(r12, r3)
            if (r0 == 0) goto Lc5
            r6 = r12
            X.PWz r6 = (X.C57147PWz) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc5
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r0 = r6.A03
            X.1JX r4 = X.C1JX.A02
            int r1 = r6.A00
            r7 = 1
            if (r1 == 0) goto L8b
            if (r1 != r7) goto Ld1
            java.lang.Object r11 = r6.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r6.A01
            java.lang.String r10 = (java.lang.String) r10
            X.AbstractC09560e7.A00(r0)
        L2c:
            r4 = r0
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L45
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.H8b r0 = (X.H8b) r0
            X.Gxo r0 = r0.A00
            if (r0 != 0) goto L4e
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L45:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L55
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4e:
            X.3p2 r0 = r0.A00
            X.3NX r4 = new X.3NX
            r4.<init>(r0)
        L55:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto Lc4
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Lcc
            X.8jk r4 = (X.C194848jk) r4
            java.lang.Object r4 = r4.A00
            X.0wb r3 = X.C18950wb.A01
            r2 = 245701013(0xea51995, float:4.0700275E-30)
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "error toast shown for mediaId: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " from source "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ". Failure: "
            java.lang.String r0 = X.AbstractC167017dG.A0n(r4, r0, r1)
            X.AbstractC166987dD.A1T(r3, r0, r2)
            X.0eB r0 = X.C0eB.A00
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
            return r4
        L8b:
            X.AbstractC09560e7.A00(r0)
            X.1Ms r2 = X.AbstractC25228BEl.A0q(r8)
            java.lang.String r0 = "clips/get_mashup_info_for_media/"
            r2.A0B(r0)
            r2.A05()
            java.lang.Class<X.H8b> r1 = X.H8b.class
            java.lang.Class<X.IOF> r0 = X.IOF.class
            r5 = 0
            r2.A0R(r1, r0)
            r2.A0R = r7
            java.lang.String r0 = "media_id"
            X.1ON r3 = X.AbstractC31172DnG.A0T(r2, r0, r10)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36601432123838674(0x8208cf000310d2, double:3.210231285028471E-306)
            int r1 = X.AbstractC25225BEi.A07(r2, r8, r0)
            r6.A01 = r10
            r6.A02 = r11
            r6.A00 = r7
            r0 = 110868677(0x69bb8c5, float:5.8576014E-35)
            java.lang.Object r0 = r3.A02(r6, r0, r1, r5)
            if (r0 != r4) goto L2c
        Lc4:
            return r4
        Lc5:
            X.PWz r6 = new X.PWz
            r6.<init>(r9, r12, r3)
            goto L16
        Lcc:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41738IeA.A00(com.instagram.common.session.UserSession, X.IeA, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }
}
