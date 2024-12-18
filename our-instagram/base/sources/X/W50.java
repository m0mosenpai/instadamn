package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes11.dex */
public final class W50 {
    public final C006802i A00;
    public final C71175WpE A01;
    public static final AtomicLong A03 = new AtomicLong(0);
    public static final W50 A02 = new W50();

    public final void A00(C69658Vsz c69658Vsz, Integer num) {
        ExecutorService BtQ;
        C14360o3.A0B(c69658Vsz, 0);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 3) {
                if (intValue != 4) {
                    if (intValue == 2) {
                        c69658Vsz.A02 = this.A00.currentMonotonicTimestamp();
                    }
                } else {
                    c69658Vsz.A00 = this.A00.currentMonotonicTimestamp();
                }
            } else {
                c69658Vsz.A01 = this.A00.currentMonotonicTimestamp();
            }
        } else {
            c69658Vsz.A03 = this.A00.currentMonotonicTimestamp();
        }
        C71175WpE c71175WpE = this.A01;
        C69452Vnb A00 = c69658Vsz.A00();
        C68114VBx c68114VBx = c71175WpE.A00;
        long currentMonotonicTimestampNanos = ((C68115VBy) c68114VBx.A00).A00.currentMonotonicTimestampNanos();
        if (c68114VBx.A01.CDU() && (BtQ = c68114VBx.A02.BtQ()) != null) {
            BtQ.execute(new Wx8(A00, c68114VBx, num, currentMonotonicTimestampNanos));
        } else {
            C68114VBx.A00(A00, c68114VBx, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C69658Vsz r18, java.lang.Integer r19) {
        /*
            r17 = this;
            r0 = 0
            r2 = r18
            X.C14360o3.A0B(r2, r0)
            r0 = 1
            r6 = r19
            int r1 = r6.intValue()
            r3 = r17
            if (r1 == r0) goto L7a
            r0 = 2
            if (r1 != r0) goto L1c
            X.02i r0 = r3.A00
            long r0 = r0.currentMonotonicTimestamp()
            r2.A04 = r0
        L1c:
            X.WpE r0 = r3.A01
            X.Vnb r4 = r2.A00()
            X.VBx r5 = r0.A00
            X.WpF r3 = r5.A01
            boolean r0 = r3.BOn()
            if (r0 == 0) goto L72
            java.lang.String r0 = r4.A09
            if (r0 == 0) goto L72
            int r9 = r0.hashCode()
            java.lang.Object r1 = r4.A07
            boolean r0 = r1 instanceof com.facebook.common.callercontext.CallerContext
            if (r0 == 0) goto L78
            com.facebook.common.callercontext.CallerContext r1 = (com.facebook.common.callercontext.CallerContext) r1
        L3c:
            r7 = 0
            if (r1 == 0) goto L73
            com.facebook.common.callercontext.ContextChain r2 = r1.A00
            if (r2 == 0) goto L74
            java.util.Map r0 = r2.A01
            if (r0 == 0) goto L74
            java.lang.String r7 = r0.toString()
        L4b:
            java.lang.String r1 = "feed_unit_id"
            java.util.Map r0 = r2.A01
            r8 = 0
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L5c
            java.lang.String r8 = java.lang.String.valueOf(r0)
        L5c:
            boolean r0 = r3.CDU()
            if (r0 == 0) goto L83
            X.WpF r0 = r5.A02
            java.util.concurrent.ExecutorService r0 = r0.BtQ()
            if (r0 == 0) goto L83
            X.WxW r3 = new X.WxW
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.execute(r3)
        L72:
            return
        L73:
            r2 = r7
        L74:
            if (r2 != 0) goto L4b
            r8 = r7
            goto L5c
        L78:
            r1 = 0
            goto L3c
        L7a:
            X.02i r0 = r3.A00
            long r0 = r0.currentMonotonicTimestamp()
            r2.A05 = r0
            goto L1c
        L83:
            int r15 = r3.getMarkerId()
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            r14 = r8
            r16 = r9
            X.C68114VBx.A01(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W50.A01(X.Vsz, java.lang.Integer):void");
    }

    public W50() {
        C006802i c006802i = C006802i.A0p;
        this.A00 = c006802i;
        C14360o3.A07(c006802i);
        this.A01 = new C71175WpE(new C68115VBy(c006802i));
    }
}
