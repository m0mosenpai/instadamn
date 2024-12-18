package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2t7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC62682t7 implements InterfaceC43071ya {
    public static final long A06 = TimeUnit.SECONDS.toMillis(1);
    public static final long A07 = TimeUnit.MINUTES.toMillis(1);
    public final long A00;
    public final long A01;
    public final C1BX A02;
    public final C62792tI A03;
    public final InterfaceC62702t9 A04;
    public final C62802tJ A05;

    public AbstractC62682t7(C1BX c1bx, InterfaceC62702t9 interfaceC62702t9) {
        C62792tI c62792tI = new C62792tI(c1bx, C13920nI.A00);
        C62802tJ c62802tJ = new C62802tJ(0.5f);
        long j = A06;
        long j2 = A07;
        this.A03 = c62792tI;
        this.A05 = c62802tJ;
        this.A04 = interfaceC62702t9;
        this.A02 = c1bx;
        this.A01 = j;
        this.A00 = c1bx.A0G("override_staleTime_in_testMode", false) ? TimeUnit.MINUTES.toMillis(0L) : j2;
    }

    public void A00(Object obj, long j, Object obj2) {
        if (!(this instanceof C34Y)) {
            if ((this instanceof C62672t6) || (this instanceof C63722ut)) {
                ((Number) obj2).intValue();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A01(java.lang.Object r26, long r27, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62682t7.A01(java.lang.Object, long, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC43071ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATP(X.C59062n7 r7, X.InterfaceC57162jr r8) {
        /*
            r6 = this;
            java.lang.Integer r1 = r8.CFq(r7)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L22
            float r1 = r8.CGk(r7)
            X.2tJ r4 = r6.A05
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
            java.lang.String r3 = r7.A05
            float r2 = r8.CGk(r7)
            long r0 = r8.BmE()
            r4.A01(r3, r2, r0)
        L21:
            return
        L22:
            java.lang.Integer r1 = r8.CFq(r7)
            java.lang.Integer r0 = X.C05F.A00
            if (r1 == r0) goto L78
            float r1 = r8.CGk(r7)
            X.2tJ r5 = r6.A05
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L78
            java.lang.String r2 = r7.A05
            long r0 = r8.BmE()
            long r3 = r5.A00(r2, r0)
            X.01p r0 = r5.A01
            r0.remove(r2)
        L45:
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L21
            X.2t9 r0 = r6.A04
            java.lang.String r5 = r0.BKe(r7)
            X.2tI r2 = r6.A03
            X.1BX r0 = r2.A00
            boolean r0 = r0.A0F(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L68
            java.lang.Object r1 = r7.A03
            java.lang.Object r0 = r7.A04
            r6.A01(r1, r3, r0)
        L64:
            r2.A02(r5)
            return
        L68:
            long r0 = r6.A00
            boolean r0 = r2.A03(r5, r0)
            if (r0 == 0) goto L21
            java.lang.Object r1 = r7.A03
            java.lang.Object r0 = r7.A04
            r6.A00(r1, r3, r0)
            goto L64
        L78:
            r3 = -1
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62682t7.ATP(X.2n7, X.2jr):void");
    }

    public AbstractC62682t7(C1BX c1bx, InterfaceC62702t9 interfaceC62702t9, long j) {
        C62792tI c62792tI = new C62792tI(c1bx, C13920nI.A00);
        C62802tJ c62802tJ = new C62802tJ(0.5f);
        long j2 = A07;
        this.A03 = c62792tI;
        this.A05 = c62802tJ;
        this.A04 = interfaceC62702t9;
        this.A02 = c1bx;
        this.A01 = j;
        this.A00 = c1bx.A0G("override_staleTime_in_testMode", false) ? TimeUnit.MINUTES.toMillis(0L) : j2;
    }
}
