package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.28i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C457428i implements InterfaceC456127v {
    public List A00;
    public final EnumC456327x A01;
    public final UserSession A02;

    public C457428i(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        EnumC456327x enumC456327x = EnumC456327x.A0A;
        this.A01 = enumC456327x;
        AnonymousClass280.A01.A05(userSession, enumC456327x);
        this.A00 = C16930sl.A00;
    }

    @Override // X.InterfaceC456127v
    public final List BOx() {
        return this.A00;
    }

    @Override // X.InterfaceC456127v
    public final EnumC456327x CBj() {
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (r1 != null) goto L15;
     */
    @Override // X.InterfaceC456127v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map CNY() {
        /*
            r7 = this;
            java.util.List r0 = X.AnonymousClass280.A02
            com.instagram.common.session.UserSession r3 = r7.A02
            boolean r0 = X.AnonymousClass282.A02(r3)
            if (r0 == 0) goto L63
            java.util.List r0 = X.AnonymousClass282.A01(r3)
            if (r0 == 0) goto L63
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36595810011580680(0x8203b200020908, double:3.2066758385980866E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "interval"
            r6.put(r0, r1)
            X.28i r2 = new X.28i
            r2.<init>(r3)
            X.0sk r1 = X.C16920sk.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            X.C14360o3.A0C(r1, r0)
            X.9BN r0 = r2.Cst(r1)
            if (r0 == 0) goto L59
            long r4 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            if (r0 == 0) goto L59
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            long r4 = r4 - r2
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            if (r0 == 0) goto L59
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L5c
        L59:
            java.lang.String r1 = "no_next_instance"
        L5c:
            java.lang.String r0 = "next_instance"
            r6.put(r0, r1)
            return r6
        L63:
            X.0sk r6 = X.C16920sk.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            X.C14360o3.A0C(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C457428i.CNY():java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (X.AnonymousClass292.A06(r9) == false) goto L6;
     */
    @Override // X.InterfaceC456127v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9BN Cst(java.util.Map r15) {
        /*
            r14 = this;
            X.282 r5 = X.AnonymousClass280.A01
            com.instagram.common.session.UserSession r9 = r14.A02
            boolean r0 = X.AnonymousClass282.A02(r9)
            if (r0 == 0) goto L11
            boolean r1 = X.AnonymousClass292.A06(r9)
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 0
        L12:
            r7 = 0
            if (r0 == 0) goto L8a
            X.XG6 r0 = X.AnonymousClass292.A02(r9)
            if (r0 != 0) goto L8a
            X.XG6 r0 = X.AnonymousClass292.A03(r9)
            if (r0 == 0) goto L8a
            java.lang.Integer r0 = r0.Bzj()
            if (r0 == 0) goto L8a
            int r8 = r0.intValue()
            long r3 = X.C123815iv.A00()
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r1
            boolean r0 = X.C461529z.A0A(r9)
            if (r0 == 0) goto L6d
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 / r1
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36597454985235283(0x82053100140b53, double:3.207716126561035E-306)
            long r10 = X.C18U.A01(r2, r9, r0)
            X.27x r0 = X.EnumC456327x.A0A
            long r5 = r5.A05(r9, r0)
            long r5 = r5 + r10
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 < 0) goto L8a
            long r7 = (long) r8
            long r5 = r7 - r10
            r0 = 36597454985431893(0x82053100170b55, double:3.207716126685372E-306)
            long r0 = X.C18U.A01(r2, r9, r0)
            long r7 = r7 - r0
            long r5 = r5 + r3
            long r3 = r3 + r7
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r0 = 3
            X.9BN r1 = new X.9BN
            r1.<init>(r5, r2, r0)
            return r1
        L6d:
            long r5 = (long) r8
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36595810011580680(0x8203b200020908, double:3.2066758385980866E-306)
            long r0 = X.C18U.A01(r2, r9, r0)
            long r5 = r5 - r0
            long r1 = X.AnonymousClass292.A00()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L8a
            long r3 = r3 + r5
            r0 = 3
            X.9BN r1 = new X.9BN
            r1.<init>(r3, r7, r0)
            return r1
        L8a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C457428i.Cst(java.util.Map):X.9BN");
    }

    @Override // X.InterfaceC456127v
    public final Long BLw() {
        throw C00O.createAndThrow();
    }
}
