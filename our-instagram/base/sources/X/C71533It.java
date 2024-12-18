package X;

import java.util.Map;

/* renamed from: X.3It, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71533It extends C24721Ip {
    public final Integer A00;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
    
        return new X.C89973zd(A0I());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object A05(java.lang.Object r18) {
        /*
            r17 = this;
            r11 = r17
            java.lang.Integer r1 = r11.A00
            java.lang.Integer r0 = X.C05F.A0C
            r9 = r18
            if (r1 != r0) goto L19
            java.lang.Object r1 = super.F8s(r9)
            boolean r0 = r1 instanceof X.C2QW
            r0 = r0 ^ 1
            if (r0 != 0) goto L18
            boolean r0 = r1 instanceof X.C89973zd
            if (r0 == 0) goto La2
        L18:
            return r1
        L19:
            X.0zt r10 = X.AbstractC24761It.A03
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C24721Ip.A09
            java.lang.Object r4 = r0.get(r11)
            X.1Iu r4 = (X.C1Iu) r4
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C24721Ip.A04
            long r0 = r0.getAndIncrement(r11)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r14 = r0 & r2
            r2 = 0
            boolean r16 = X.C24721Ip.A0G(r11, r0, r2)
            int r7 = X.AbstractC24761It.A01
            long r0 = (long) r7
            long r2 = r14 / r0
            long r5 = r14 % r0
            int r13 = (int) r5
            long r5 = r4.A00
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L55
            X.1Iu r12 = X.C24721Ip.A07(r11, r4, r2)
            if (r12 != 0) goto L56
            if (r16 == 0) goto L23
        L4b:
            java.lang.Throwable r0 = r11.A0I()
            X.3zd r1 = new X.3zd
            r1.<init>(r0)
            return r1
        L55:
            r12 = r4
        L56:
            int r3 = X.C24721Ip.A00(r9, r10, r11, r12, r13, r14, r16)
            if (r3 == 0) goto L89
            r2 = 1
            if (r3 == r2) goto La2
            r2 = 2
            if (r3 == r2) goto L7b
            r0 = 3
            if (r3 == r0) goto L81
            r0 = 4
            if (r3 == r0) goto L6d
            r12.A01()
            r4 = r12
            goto L23
        L6d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C24721Ip.A03
            long r1 = r0.get(r11)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4b
            r12.A01()
            goto L4b
        L7b:
            if (r16 == 0) goto L8d
            r12.A05()
            goto L4b
        L81:
            java.lang.String r1 = "unexpected"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L89:
            r12.A01()
            goto La2
        L8d:
            boolean r2 = r10 instanceof X.InterfaceC24871Jm
            if (r2 == 0) goto L9a
            X.1Jm r10 = (X.InterfaceC24871Jm) r10
            if (r10 == 0) goto L9a
            int r2 = r13 + r7
            r10.CPB(r12, r2)
        L9a:
            long r2 = r12.A00
            long r2 = r2 * r0
            long r0 = (long) r13
            long r2 = r2 + r0
            r11.A0J(r2)
        La2:
            X.0eB r1 = X.C0eB.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71533It.A05(java.lang.Object):java.lang.Object");
    }

    @Override // X.C24721Ip
    public final boolean A0L() {
        if (this.A00 != C05F.A01) {
            return false;
        }
        return true;
    }

    public C71533It(int i, Integer num) {
        super(i);
        this.A00 = num;
        if (num != C05F.A00) {
            if (i >= 1) {
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0c("Buffered channel capacity must be at least 1, but ", " was specified", i));
            }
        } else {
            Map map = C0YZ.A03;
            throw new IllegalArgumentException(AnonymousClass001.A0g("This implementation does not support suspension for senders, use ", AbstractC13230m9.A01(C24721Ip.class), " instead"));
        }
    }

    @Override // X.C24721Ip, X.InterfaceC24741Ir
    public final Object EMz(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (A05(obj) instanceof C89973zd) {
            throw A0I();
        }
        return C0eB.A00;
    }

    @Override // X.C24721Ip, X.InterfaceC24741Ir
    public final Object F8s(Object obj) {
        return A05(obj);
    }
}
