package X;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes9.dex */
public final class MbI extends Handler {
    public final /* synthetic */ C52254NAu A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MbI(Looper looper, C52254NAu c52254NAu) {
        super(looper);
        this.A00 = c52254NAu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r1 <= 0) goto L17;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            int r0 = r7.what
            r3 = 1
            if (r0 == r3) goto L94
            r3 = 2
            if (r0 == r3) goto L4a
            r2 = 3
            if (r0 != r2) goto L46
            X.NAu r3 = r6.A00
            X.MbI r0 = r3.A0Q
            boolean r0 = r0.hasMessages(r2)
            if (r0 != 0) goto L46
            boolean r5 = X.OOP.A01(r3)
            float r4 = r3.A00
            boolean r0 = X.OOP.A01(r3)
            if (r0 == 0) goto L47
            X.Pr9 r0 = r3.A0R
            int r1 = r0.AuK()
        L27:
            int r0 = r3.A0M
            int r0 = r0 / 2
            float r0 = (float) r0
            float r4 = r4 - r0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L35
            r0 = 1
            if (r1 > 0) goto L36
        L35:
            r0 = 0
        L36:
            if (r5 == 0) goto L6c
            if (r0 == 0) goto L46
            int r0 = r3.A01
            int r0 = r0 + (-1)
            X.C52254NAu.A0A(r3, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r6.sendEmptyMessageDelayed(r2, r0)
        L46:
            return
        L47:
            int r1 = r3.A01
            goto L27
        L4a:
            X.NAu r2 = r6.A00
            X.MbI r0 = r2.A0Q
            boolean r0 = r0.hasMessages(r3)
            if (r0 != 0) goto L46
            boolean r1 = X.OOP.A01(r2)
            float r0 = r2.A00
            boolean r0 = X.C52254NAu.A0J(r2, r0)
            if (r1 == 0) goto L80
            if (r0 == 0) goto L46
            int r0 = r2.A01
            int r0 = r0 + 1
            X.C52254NAu.A0A(r2, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            goto La4
        L6c:
            if (r0 == 0) goto L7c
            X.Pr9 r1 = r3.A0R
            float r0 = r1.CEh()
            r1.EMS(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r6.sendEmptyMessageDelayed(r2, r0)
        L7c:
            X.C52254NAu.A07(r3)
            return
        L80:
            if (r0 == 0) goto L90
            X.Pr9 r1 = r2.A0R
            float r0 = r1.CEh()
            r1.EML(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r6.sendEmptyMessageDelayed(r3, r0)
        L90:
            X.C52254NAu.A07(r2)
            return
        L94:
            X.NAu r2 = r6.A00
            X.Pr9 r0 = r2.A0R
            float r1 = r0.CEh()
            r0 = 1140457472(0x43fa0000, float:500.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto La8
            r0 = 100
        La4:
            r6.sendEmptyMessageDelayed(r3, r0)
            return
        La8:
            r0 = 0
            r6.removeCallbacksAndMessages(r0)
            r2.A0K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MbI.handleMessage(android.os.Message):void");
    }
}
