package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61942rv {
    public final UserSession A00;
    public final C61952rw A01;
    public final C1M1 A02;

    public final void A00(C61982rz c61982rz, C4QH c4qh, int i) {
        InterfaceC674632l interfaceC674632l = new InterfaceC674632l() { // from class: X.4QI
            /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r4, 36322980805094198L) == false) goto L22;
             */
            @Override // X.InterfaceC674632l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List Ctr(java.util.List r11) {
                /*
                    r10 = this;
                    r6 = 0
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    java.util.Iterator r5 = r11.iterator()
                La:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L40
                    java.lang.Object r4 = r5.next()
                    X.3XG r4 = (X.C3XG) r4
                    X.1qS r0 = r4.A05
                    X.1qM r3 = X.C3XH.A02(r0)
                    if (r3 == 0) goto La
                    X.1XV r1 = r4.A06
                    X.1XV r0 = X.C1XV.A0Y
                    if (r1 == r0) goto L28
                    X.1XV r0 = X.C1XV.A0H
                    if (r1 != r0) goto La
                L28:
                    boolean r0 = r3.CdW()
                    if (r0 != 0) goto La
                    java.lang.String r0 = r3.getId()
                    if (r0 == 0) goto L38
                    r2.put(r0, r4)
                    goto La
                L38:
                    java.lang.String r1 = "Required value was null."
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>(r1)
                    throw r0
                L40:
                    long r0 = X.C23051Ak.A02
                    X.2rv r5 = X.C61942rv.this
                    com.instagram.common.session.UserSession r4 = r5.A00
                    X.1Ak r1 = X.C23061Al.A00(r4)
                    X.1Am r0 = X.EnumC23071Am.A0F
                    boolean r0 = r1.A00(r0)
                    if (r0 == 0) goto L60
                    X.0Tz r3 = X.C06090Tz.A05
                    r0 = 36322980805094198(0x810b8f00122b36, double:3.0341375498210005E-306)
                    boolean r0 = X.C18U.A06(r3, r4, r0)
                    r1 = 1
                    if (r0 != 0) goto L61
                L60:
                    r1 = 0
                L61:
                    boolean r0 = r2.isEmpty()
                    r0 = r0 ^ 1
                    if (r0 == 0) goto Lf8
                    if (r1 != 0) goto Lf8
                    X.2rw r0 = r5.A01
                    X.5vn r4 = new X.5vn
                    r4.<init>(r5, r2)
                    com.instagram.common.session.UserSession r1 = r0.A00
                    r5 = 0
                    r0 = -2
                    X.1Ms r3 = new X.1Ms
                    r3.<init>(r1, r0)
                    java.lang.Integer r0 = X.C05F.A01
                    r3.A09(r0)
                    java.lang.String r0 = "feed/invalidate_privacy_violating_media_v2/"
                    r3.A0B(r0)
                    java.io.StringWriter r9 = new java.io.StringWriter     // Catch: java.io.IOException -> Ld5
                    r9.<init>()     // Catch: java.io.IOException -> Ld5
                    X.15v r0 = X.AbstractC221915u.A00     // Catch: java.io.IOException -> Ld5
                    X.17z r8 = r0.A0A(r9)     // Catch: java.io.IOException -> Ld5
                    r8.A0c()     // Catch: java.io.IOException -> Ld5
                    java.util.Set r0 = r2.entrySet()     // Catch: java.io.IOException -> Ld5
                    java.util.Iterator r7 = r0.iterator()     // Catch: java.io.IOException -> Ld5
                L9b:
                    boolean r0 = r7.hasNext()     // Catch: java.io.IOException -> Ld5
                    if (r0 == 0) goto Lca
                    java.lang.Object r0 = r7.next()     // Catch: java.io.IOException -> Ld5
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.io.IOException -> Ld5
                    java.lang.Object r1 = r0.getKey()     // Catch: java.io.IOException -> Ld5
                    java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.IOException -> Ld5
                    java.lang.Object r2 = r0.getValue()     // Catch: java.io.IOException -> Ld5
                    X.3XG r2 = (X.C3XG) r2     // Catch: java.io.IOException -> Ld5
                    r8.A0d()     // Catch: java.io.IOException -> Ld5
                    java.lang.String r0 = "media_id"
                    r8.A0S(r0, r1)     // Catch: java.io.IOException -> Ld5
                    java.lang.String r1 = "item_type"
                    X.1XV r0 = r2.A06     // Catch: java.io.IOException -> Ld5
                    java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> Ld5
                    r8.A0S(r1, r0)     // Catch: java.io.IOException -> Ld5
                    r8.A0a()     // Catch: java.io.IOException -> Ld5
                    goto L9b
                Lca:
                    r8.A0Z()     // Catch: java.io.IOException -> Ld5
                    r8.close()     // Catch: java.io.IOException -> Ld5
                    java.lang.String r1 = r9.toString()     // Catch: java.io.IOException -> Ld5
                    goto Lde
                Ld5:
                    r2 = move-exception
                    java.lang.String r1 = "MainFeedInvalidateMediaNetworkSourceV2"
                    java.lang.String r0 = "Failed to convert a map to json array"
                    X.C0K8.A0G(r1, r0, r2)
                    r1 = 0
                Lde:
                    java.lang.String r0 = "media_ids_item_types"
                    r3.A0H(r0, r1)
                    java.lang.Class<X.5vo> r1 = X.C131005vo.class
                    java.lang.Class<X.5vp> r0 = X.C131015vp.class
                    r3.A0P(r5, r1, r0, r6)
                    X.1ON r1 = r3.A0N()
                    X.5vq r0 = new X.5vq
                    r0.<init>()
                    r1.A00 = r0
                    X.C1GJ.A03(r1)
                Lf8:
                    X.0sl r0 = X.C16930sl.A00
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4QI.Ctr(java.util.List):java.util.List");
            }

            @Override // X.InterfaceC674632l
            public final void DHK(boolean z) {
            }
        };
        C16930sl c16930sl = C16930sl.A00;
        c61982rz.A01.ATO(new C4QJ(null, this.A00, c61982rz, interfaceC674632l, c4qh, c16930sl, i, false));
    }

    public C61942rv(UserSession userSession, C1M1 c1m1) {
        this.A00 = userSession;
        this.A02 = c1m1;
        this.A01 = new C61952rw(userSession);
    }
}
