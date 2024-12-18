package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2xw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65602xw {
    public final C65502xm A00;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[EDGE_INSN: B:11:0x003d->B:12:0x003d BREAK  A[LOOP:0: B:2:0x000c->B:16:0x0053], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C66772zu A00(java.lang.String r9, final X.InterfaceC16820sZ r10) {
        /*
            r8 = this;
            r6 = 0
            X.C14360o3.A0B(r9, r6)
            X.2xm r4 = r8.A00
            X.2xq[] r5 = X.EnumC65542xq.values()
            int r3 = r5.length
            r2 = 0
        Lc:
            if (r2 >= r3) goto L61
            r7 = r5[r2]
            X.C14360o3.A0B(r7, r6)
            X.2xp r1 = r4.A04
            X.2xq r0 = X.EnumC65542xq.A09
            if (r7 == r0) goto L56
            java.util.Set r0 = r1.A04
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L4a
            java.util.Map r0 = r1.A02
            java.lang.Object r0 = r0.get(r7)
            X.2xt r0 = (X.AbstractC65572xt) r0
            boolean r0 = X.C65532xp.A00(r0, r9)
            if (r0 != 0) goto L3d
            java.util.Map r0 = r1.A03
            java.lang.Object r0 = r0.get(r7)
            X.2xt r0 = (X.AbstractC65572xt) r0
            boolean r0 = X.C65532xp.A00(r0, r9)
        L3b:
            if (r0 == 0) goto L53
        L3d:
            java.util.Set r0 = X.C66772zu.A05
            X.2zv r1 = new X.2zv
            r1.<init>()
            X.2zu r0 = new X.2zu
            r0.<init>(r4, r1)
            return r0
        L4a:
            java.lang.Integer r1 = r4.A02(r7, r9)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L53
            goto L3d
        L53:
            int r2 = r2 + 1
            goto Lc
        L56:
            boolean r0 = X.C65532xp.A01(r1, r9)
            if (r0 != 0) goto L3d
            boolean r0 = X.C65532xp.A02(r1, r9)
            goto L3b
        L61:
            X.2xp r3 = r4.A04
            boolean r0 = X.C65532xp.A01(r3, r9)
            if (r0 != 0) goto L3d
            boolean r0 = X.C65532xp.A02(r3, r9)
            if (r0 != 0) goto L3d
            java.util.Set r1 = r3.A04
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L7d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L7d
        L7b:
            r0 = 0
            return r0
        L7d:
            java.util.Iterator r2 = r1.iterator()
        L81:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r3.A02
            java.lang.Object r0 = r0.get(r1)
            X.2xt r0 = (X.AbstractC65572xt) r0
            boolean r0 = X.C65532xp.A00(r0, r9)
            if (r0 != 0) goto L3d
            java.util.Map r0 = r3.A03
            java.lang.Object r0 = r0.get(r1)
            X.2xt r0 = (X.AbstractC65572xt) r0
            boolean r0 = X.C65532xp.A00(r0, r9)
            if (r0 == 0) goto L81
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65602xw.A00(java.lang.String, X.0sZ):X.2zu");
    }

    public C65602xw(UserSession userSession) {
        this.A00 = AbstractC65492xl.A00(userSession);
    }
}
