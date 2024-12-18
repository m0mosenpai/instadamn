package androidx.datastore.core;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC31171DnF;
import X.AbstractC53417Nk6;
import X.AnonymousClass058;
import X.BF2;
import X.C05A;
import X.C10E;
import X.C14360o3;
import X.C19L;
import X.C50832MdP;
import X.C57514Pfo;
import X.C57560PgY;
import X.C73163Pr;
import X.D52;
import X.InterfaceC09390do;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC57783PkA;
import X.InterfaceC57892Plw;
import X.InterfaceC58011Pnv;
import X.MT0;
import X.MT2;
import java.util.List;
import java.util.Set;

/* loaded from: classes9.dex */
public final class SingleProcessDataStore implements InterfaceC58011Pnv {
    public List A00;
    public final BF2 A01;
    public final InterfaceC09390do A02;
    public final InterfaceC16820sZ A03;
    public final C05A A04;
    public final InterfaceC57892Plw A05;
    public final InterfaceC57783PkA A06;
    public final C19L A07;
    public final InterfaceC19390xP A08;
    public static final Set A0A = AbstractC31171DnF.A0l();
    public static final Object A09 = new Object();

    public SingleProcessDataStore(InterfaceC57892Plw interfaceC57892Plw, InterfaceC57783PkA interfaceC57783PkA, List list, InterfaceC16820sZ interfaceC16820sZ, C19L c19l) {
        C14360o3.A0B(interfaceC57892Plw, 4);
        this.A03 = interfaceC16820sZ;
        this.A06 = interfaceC57783PkA;
        this.A05 = interfaceC57892Plw;
        this.A07 = c19l;
        this.A08 = new AnonymousClass058(new D52(this, (InterfaceC23621Ds) null, 28));
        this.A02 = AbstractC09440dt.A01(new C57514Pfo(this, 17));
        this.A04 = C10E.A00(MT2.A00);
        this.A00 = AbstractC001800i.A0a(list);
        this.A01 = new BF2(new C57560PgY(this, 4), MT0.A00, new D52(this, (InterfaceC23621Ds) null, 27), c19l);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(7:(1:(1:(2:12|13))(2:15|16))|26|27|20|(1:22)(1:25)|23|24)(3:28|29|(6:31|(1:33)|20|(0)(0)|23|24)(3:34|(1:36)|(2:38|(2:40|(1:42))(2:43|44))(2:45|(2:47|48)(2:49|50))))|17|(1:19)|20|(0)(0)|23|24))|53|6|7|(0)(0)|17|(0)|20|(0)(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        r1 = X.MSW.A1D(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C50832MdP r8, androidx.datastore.core.SingleProcessDataStore r9, X.InterfaceC23621Ds r10) {
        /*
            r6 = 3
            boolean r0 = X.MAL.A01(r10, r6)
            if (r0 == 0) goto L2a
            r4 = r10
            X.MAL r4 = (X.MAL) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A04
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L45
            if (r0 == r2) goto L3d
            if (r0 == r7) goto L30
            if (r0 == r6) goto L3d
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2a:
            X.MAL r4 = new X.MAL
            r4.<init>(r9, r10, r6)
            goto L15
        L30:
            java.lang.Object r3 = r4.A03
            X.3Pr r3 = (X.C73163Pr) r3
            java.lang.Object r9 = r4.A02
            androidx.datastore.core.SingleProcessDataStore r9 = (androidx.datastore.core.SingleProcessDataStore) r9
            java.lang.Object r8 = r4.A01
            X.MdP r8 = (X.C50832MdP) r8
            goto L7b
        L3d:
            java.lang.Object r3 = r4.A01
            X.3Pr r3 = (X.C73163Pr) r3
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> La5
            goto Laa
        L45:
            X.AbstractC09560e7.A00(r1)
            X.3Pr r3 = r8.A03
            X.05A r0 = r9.A04     // Catch: java.lang.Throwable -> La5
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> La5
            X.Nk6 r1 = (X.AbstractC53417Nk6) r1     // Catch: java.lang.Throwable -> La5
            boolean r0 = r1 instanceof X.MTA     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L65
            X.0sF r1 = r8.A02     // Catch: java.lang.Throwable -> La5
            X.12W r0 = r8.A01     // Catch: java.lang.Throwable -> La5
            r4.A01 = r3     // Catch: java.lang.Throwable -> La5
            r4.A00 = r2     // Catch: java.lang.Throwable -> La5
            java.lang.Object r1 = A06(r9, r4, r0, r1)     // Catch: java.lang.Throwable -> La5
            if (r1 != r5) goto Laa
            return r5
        L65:
            boolean r0 = r1 instanceof X.C50834MdR     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto L6b
            boolean r2 = r1 instanceof X.MT2     // Catch: java.lang.Throwable -> La5
        L6b:
            if (r2 == 0) goto L97
            X.Nk6 r0 = r8.A00     // Catch: java.lang.Throwable -> La5
            if (r1 != r0) goto L92
            X.AbstractC25235BEs.A1J(r8, r9, r3, r4, r7)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r0 = A02(r9, r4)     // Catch: java.lang.Throwable -> La5
            if (r0 != r5) goto L7e
            return r5
        L7b:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> La5
        L7e:
            X.0sF r2 = r8.A02     // Catch: java.lang.Throwable -> La5
            X.12W r1 = r8.A01     // Catch: java.lang.Throwable -> La5
            r4.A01 = r3     // Catch: java.lang.Throwable -> La5
            r0 = 0
            r4.A02 = r0     // Catch: java.lang.Throwable -> La5
            r4.A03 = r0     // Catch: java.lang.Throwable -> La5
            r4.A00 = r6     // Catch: java.lang.Throwable -> La5
            java.lang.Object r1 = A06(r9, r4, r1, r2)     // Catch: java.lang.Throwable -> La5
            if (r1 != r5) goto Laa
            return r5
        L92:
            X.MdR r1 = (X.C50834MdR) r1     // Catch: java.lang.Throwable -> La5
            java.lang.Throwable r0 = r1.A00     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> La5
        L97:
            boolean r0 = r1 instanceof X.C50833MdQ     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto La0
            X.MdQ r1 = (X.C50833MdQ) r1     // Catch: java.lang.Throwable -> La5
            java.lang.Throwable r0 = r1.A00     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> La5
        La0:
            X.B4Z r0 = X.B4Z.A00()     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> La5
        La5:
            r0 = move-exception
            X.0e5 r1 = X.MSW.A1D(r0)
        Laa:
            java.lang.Throwable r0 = X.C09550e6.A00(r1)
            if (r0 != 0) goto Lb6
            r3.A0L(r1)
        Lb3:
            X.0eB r5 = X.C0eB.A00
            return r5
        Lb6:
            r3.A0X(r0)
            goto Lb3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A00(X.MdP, androidx.datastore.core.SingleProcessDataStore, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0060, code lost:
    
        if ((r2.getValue() instanceof X.C50834MdR) != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(androidx.datastore.core.SingleProcessDataStore r14, X.InterfaceC23621Ds r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A01(androidx.datastore.core.SingleProcessDataStore, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x0137. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(androidx.datastore.core.SingleProcessDataStore r11, X.InterfaceC23621Ds r12) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A04(androidx.datastore.core.SingleProcessDataStore, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(2:15|(1:(1:(3:19|20|21)(2:22|23))(3:24|25|26))(3:27|28|29))(3:9|10|(1:12)(1:14))))|37|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        r0 = r7.A05;
        X.MAO.A00(r7, r1, r5, 2);
        r0 = r0.CJh(r1, r5);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r0 == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(androidx.datastore.core.SingleProcessDataStore r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = 3
            boolean r0 = X.MAO.A02(r8, r6)
            if (r0 == 0) goto L2c
            r5 = r8
            X.MAO r5 = (X.MAO) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r0 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r3 = r5.A00
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L4f
            if (r3 == r1) goto L47
            if (r3 == r2) goto L3b
            if (r3 != r6) goto L36
            java.lang.Object r4 = r5.A02
            java.lang.Object r1 = r5.A01
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            goto L32
        L2c:
            X.MAO r5 = new X.MAO
            r5.<init>(r7, r8, r6)
            goto L15
        L32:
            X.AbstractC09560e7.A00(r0)     // Catch: java.io.IOException -> L72
            return r4
        L36:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A13()
            throw r1
        L3b:
            java.lang.Object r1 = r5.A02
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r7 = r5.A01
            androidx.datastore.core.SingleProcessDataStore r7 = (androidx.datastore.core.SingleProcessDataStore) r7
            X.AbstractC09560e7.A00(r0)
            goto L6b
        L47:
            java.lang.Object r7 = r5.A01
            androidx.datastore.core.SingleProcessDataStore r7 = (androidx.datastore.core.SingleProcessDataStore) r7
            X.AbstractC09560e7.A00(r0)     // Catch: X.C53087Ne0 -> L5e
            return r0
        L4f:
            X.AbstractC09560e7.A00(r0)
            r5.A01 = r7     // Catch: X.C53087Ne0 -> L5e
            r5.A00 = r1     // Catch: X.C53087Ne0 -> L5e
            java.lang.Object r0 = A04(r7, r5)     // Catch: X.C53087Ne0 -> L5e
            if (r0 != r4) goto L5d
            return r4
        L5d:
            return r0
        L5e:
            r1 = move-exception
            X.Plw r0 = r7.A05
            X.MAO.A00(r7, r1, r5, r2)
            java.lang.Object r0 = r0.CJh(r1, r5)
            if (r0 != r4) goto L6b
            return r4
        L6b:
            X.MAO.A00(r1, r0, r5, r6)     // Catch: java.io.IOException -> L72
            r7.A07(r0, r5)     // Catch: java.io.IOException -> L72
            return r0
        L72:
            r0 = move-exception
            X.C2Ql.A01(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A05(androidx.datastore.core.SingleProcessDataStore, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(androidx.datastore.core.SingleProcessDataStore r10, X.InterfaceC23621Ds r11, X.C12W r12, X.InterfaceC16620sF r13) {
        /*
            r3 = 5
            boolean r0 = X.MAL.A01(r11, r3)
            if (r0 == 0) goto L87
            r5 = r11
            X.MAL r5 = (X.MAL) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r2 = r5.A04
            X.1JX r9 = X.C1JX.A02
            int r0 = r5.A00
            r6 = 0
            r4 = 2
            r8 = 1
            if (r0 == 0) goto L3c
            if (r0 == r8) goto L62
            if (r0 != r4) goto L8d
            java.lang.Object r3 = r5.A02
            java.lang.Object r10 = r5.A01
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            X.AbstractC09560e7.A00(r2)
        L2d:
            X.05A r2 = r10.A04
            int r1 = X.AbstractC25235BEs.A06(r3)
            X.MTA r0 = new X.MTA
            r0.<init>(r3, r1)
            r2.Egh(r0)
        L3b:
            return r3
        L3c:
            X.AbstractC09560e7.A00(r2)
            X.05A r0 = r10.A04
            java.lang.Object r7 = r0.getValue()
            X.MTA r7 = (X.MTA) r7
            java.lang.Object r3 = r7.A01
            int r1 = X.AbstractC25235BEs.A06(r3)
            int r0 = r7.A00
            if (r1 != r0) goto L99
            r1 = 29
            X.D52 r0 = new X.D52
            r0.<init>(r13, r3, r6, r1)
            X.AbstractC25235BEs.A1J(r10, r7, r3, r5, r8)
            java.lang.Object r2 = X.AbstractC23641Du.A00(r5, r12, r0)
            if (r2 != r9) goto L6f
            return r9
        L62:
            java.lang.Object r3 = r5.A03
            java.lang.Object r7 = r5.A02
            X.MTA r7 = (X.MTA) r7
            java.lang.Object r10 = r5.A01
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            X.AbstractC09560e7.A00(r2)
        L6f:
            java.lang.Object r0 = r7.A01
            int r1 = X.AbstractC25235BEs.A06(r0)
            int r0 = r7.A00
            if (r1 != r0) goto L92
            boolean r0 = X.C14360o3.A0K(r3, r2)
            if (r0 != 0) goto L3b
            X.AbstractC25235BEs.A1J(r10, r2, r6, r5, r4)
            r10.A07(r2, r5)
            r3 = r2
            goto L2d
        L87:
            X.MAL r5 = new X.MAL
            r5.<init>(r10, r11, r3)
            goto L15
        L8d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L92:
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L99:
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A06(androidx.datastore.core.SingleProcessDataStore, X.1Ds, X.12W, X.0sF):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(androidx.datastore.core.SingleProcessDataStore r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 10
            boolean r0 = X.MAN.A02(r6, r3)
            if (r0 == 0) goto L26
            r4 = r6
            X.MAN r4 = (X.MAN) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 != r0) goto L30
            java.lang.Object r5 = r4.A01
            androidx.datastore.core.SingleProcessDataStore r5 = (androidx.datastore.core.SingleProcessDataStore) r5
            goto L2c
        L26:
            X.MAN r4 = new X.MAN
            r4.<init>(r5, r6, r3)
            goto L16
        L2c:
            X.AbstractC09560e7.A00(r3)     // Catch: java.lang.Throwable -> L46
            goto L43
        L30:
            java.lang.IllegalStateException r2 = X.AbstractC166987dD.A13()
            throw r2
        L35:
            X.AbstractC09560e7.A00(r3)
            r4.A01 = r5     // Catch: java.lang.Throwable -> L46
            r4.A00 = r0     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = A01(r5, r4)     // Catch: java.lang.Throwable -> L46
            if (r0 != r2) goto L43
            return r2
        L43:
            X.0eB r2 = X.C0eB.A00
            return r2
        L46:
            r2 = move-exception
            X.05A r1 = r5.A04
            X.MdR r0 = new X.MdR
            r0.<init>(r2)
            r1.Egh(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A02(androidx.datastore.core.SingleProcessDataStore, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        r5.A04.Egh(new X.C50834MdR(r2));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(androidx.datastore.core.SingleProcessDataStore r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 11
            boolean r0 = X.MAN.A02(r6, r3)
            if (r0 == 0) goto L26
            r4 = r6
            X.MAN r4 = (X.MAN) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 != r0) goto L30
            java.lang.Object r5 = r4.A01
            androidx.datastore.core.SingleProcessDataStore r5 = (androidx.datastore.core.SingleProcessDataStore) r5
            goto L2c
        L26:
            X.MAN r4 = new X.MAN
            r4.<init>(r5, r6, r3)
            goto L16
        L2c:
            X.AbstractC09560e7.A00(r3)     // Catch: java.lang.Throwable -> L43
            goto L4e
        L30:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L35:
            X.AbstractC09560e7.A00(r3)
            r4.A01 = r5     // Catch: java.lang.Throwable -> L43
            r4.A00 = r0     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = A01(r5, r4)     // Catch: java.lang.Throwable -> L43
            if (r0 != r2) goto L4e
            return r2
        L43:
            r2 = move-exception
            X.05A r1 = r5.A04
            X.MdR r0 = new X.MdR
            r0.<init>(r2)
            r1.Egh(r0)
        L4e:
            X.0eB r2 = X.C0eB.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A03(androidx.datastore.core.SingleProcessDataStore, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02e0 A[Catch: IOException -> 0x030f, TRY_LEAVE, TryCatch #2 {IOException -> 0x030f, blocks: (B:13:0x02ce, B:17:0x02e0, B:143:0x030e, B:28:0x0085, B:142:0x030b, B:11:0x02c2, B:12:0x02c5, B:29:0x008a, B:30:0x00b3, B:32:0x00b9, B:34:0x00cd, B:35:0x00db, B:36:0x00df, B:38:0x00e9, B:40:0x00fe, B:42:0x0104, B:45:0x025e, B:94:0x0307, B:47:0x0108, B:49:0x010c, B:50:0x0122, B:51:0x0125, B:53:0x0129, B:54:0x0140, B:56:0x0144, B:57:0x015b, B:59:0x015f, B:60:0x0176, B:62:0x017a, B:63:0x018d, B:65:0x0191, B:67:0x01b1, B:70:0x01bb, B:71:0x01c1, B:73:0x01ca, B:74:0x01db, B:76:0x01e1, B:88:0x01e7, B:89:0x026b, B:91:0x026f, B:93:0x0303, B:78:0x01f8, B:85:0x01fc, B:81:0x0202, B:96:0x0246, B:98:0x0257, B:100:0x0281, B:102:0x0206, B:104:0x020a, B:106:0x020e, B:107:0x021d, B:108:0x0225, B:110:0x022b, B:114:0x0231, B:115:0x0273, B:117:0x0277, B:119:0x027b, B:112:0x0242, B:123:0x028d, B:126:0x029c, B:128:0x02a6, B:131:0x02b0, B:133:0x02bc, B:135:0x02f7, B:139:0x0309), top: B:7:0x001f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9 A[Catch: all -> 0x0308, TryCatch #0 {all -> 0x0308, blocks: (B:11:0x02c2, B:12:0x02c5, B:29:0x008a, B:30:0x00b3, B:32:0x00b9, B:34:0x00cd, B:35:0x00db, B:36:0x00df, B:38:0x00e9, B:40:0x00fe, B:42:0x0104, B:45:0x025e, B:94:0x0307, B:47:0x0108, B:49:0x010c, B:50:0x0122, B:51:0x0125, B:53:0x0129, B:54:0x0140, B:56:0x0144, B:57:0x015b, B:59:0x015f, B:60:0x0176, B:62:0x017a, B:63:0x018d, B:65:0x0191, B:67:0x01b1, B:70:0x01bb, B:71:0x01c1, B:73:0x01ca, B:74:0x01db, B:76:0x01e1, B:88:0x01e7, B:89:0x026b, B:91:0x026f, B:93:0x0303, B:78:0x01f8, B:85:0x01fc, B:81:0x0202, B:96:0x0246, B:98:0x0257, B:100:0x0281, B:102:0x0206, B:104:0x020a, B:106:0x020e, B:107:0x021d, B:108:0x0225, B:110:0x022b, B:114:0x0231, B:115:0x0273, B:117:0x0277, B:119:0x027b, B:112:0x0242, B:123:0x028d, B:126:0x029c, B:128:0x02a6, B:131:0x02b0, B:133:0x02bc, B:135:0x02f7), top: B:7:0x001f, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.1Ds, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0eB A07(java.lang.Object r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A07(java.lang.Object, X.1Ds):X.0eB");
    }

    @Override // X.InterfaceC58011Pnv
    public final InterfaceC19390xP Ave() {
        return this.A08;
    }

    @Override // X.InterfaceC58011Pnv
    public final Object FAf(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        C73163Pr c73163Pr = new C73163Pr();
        this.A01.A00(new C50832MdP((AbstractC53417Nk6) this.A04.getValue(), interfaceC23621Ds.getContext(), interfaceC16620sF, c73163Pr));
        return c73163Pr.A0E(interfaceC23621Ds);
    }
}
