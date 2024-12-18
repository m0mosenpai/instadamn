package X;

import android.os.Looper;
import android.os.Message;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3wC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88043wC implements InterfaceC88013w9 {
    public static final Map A08 = new HashMap();
    public C88023wA A01;
    public Thread A02;
    public final InterfaceC100264eo[] A03;
    public final InterfaceC100384f0 A04;
    public final boolean A06;
    public final boolean A07;
    public long A00 = 0;
    public final C100344ew A05 = new C100344ew();

    @Override // X.InterfaceC88013w9
    public final void AVj() {
        AVg(null);
    }

    @Override // X.InterfaceC88013w9
    public final void Ena() {
        EnF(null);
    }

    @Override // X.InterfaceC88013w9
    public final void AVg(Message message) {
        Integer num;
        C88023wA c88023wA = this.A01;
        if (c88023wA != null) {
            c88023wA.A04();
            if (this.A07) {
                C88023wA.A0F = null;
            }
            C88023wA c88023wA2 = this.A01;
            c88023wA2.A0B = true;
            if (this.A06 && c88023wA2.A01() >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                if (C87973w5.A02.A01.get()) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A01;
                }
                c88023wA2.A06 = num;
            }
            this.A04.E66(this.A01);
            this.A01 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r5 == null) goto L6;
     */
    @Override // X.InterfaceC88013w9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EnF(android.os.Message r7) {
        /*
            r6 = this;
            X.4ew r4 = r6.A05
            java.util.LinkedList r3 = r4.A00
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L1e
            java.lang.Object r5 = r3.pollLast()
            X.3wA r5 = (X.C88023wA) r5
            if (r5 != 0) goto L40
        L12:
            java.util.concurrent.atomic.AtomicInteger r2 = r4.A02
            int r0 = r2.get()
            if (r0 <= 0) goto L82
            java.util.LinkedList r1 = r4.A01
            monitor-enter(r1)
            goto L20
        L1e:
            r5 = 0
            goto L12
        L20:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L39
            java.lang.Object r5 = r1.pollLast()     // Catch: java.lang.Throwable -> L3b
            X.3wA r5 = (X.C88023wA) r5     // Catch: java.lang.Throwable -> L3b
            r3.addAll(r1)     // Catch: java.lang.Throwable -> L3b
            r1.clear()     // Catch: java.lang.Throwable -> L3b
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L3b
            r2.set(r0)     // Catch: java.lang.Throwable -> L3b
        L39:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            goto L3e
        L3b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L3e:
            if (r5 == 0) goto L82
        L40:
            java.lang.Thread r4 = r6.A02
            long r2 = r6.A00
            r0 = 1
            long r0 = r0 + r2
            r6.A00 = r0
            r5.A09 = r4
            r5.A05 = r2
            r5.A05(r7)
            r5.A02()
            r0 = 0
            r5.A01 = r0
            X.3w5 r0 = X.C87973w5.A02
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A01
            boolean r0 = r0.get()
            if (r0 == 0) goto L7f
            java.lang.Integer r0 = X.C05F.A0C
        L62:
            r5.A07 = r0
            r0 = 1
            r5.A0C = r0
            boolean r0 = r6.A07
            if (r0 == 0) goto L6d
            X.C88023wA.A0F = r5
        L6d:
            X.4f0 r0 = r6.A04
            r0.E66(r5)
            r6.A01 = r5
            long r3 = r6.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L7e
            r6.A00 = r1
        L7e:
            return
        L7f:
            java.lang.Integer r0 = X.C05F.A01
            goto L62
        L82:
            X.3wA r5 = new X.3wA
            r5.<init>(r4)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88043wC.EnF(android.os.Message):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C88043wC(android.os.Looper r6, X.AbstractC100334ev r7, X.InterfaceC100264eo[] r8) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.A00 = r0
            X.4ew r0 = new X.4ew
            r0.<init>()
            r5.A05 = r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0 = 0
            if (r6 != r1) goto L16
            r0 = 1
        L16:
            r5.A07 = r0
            r5.A03 = r8
            boolean r4 = r7 instanceof X.C100324eu
            if (r4 == 0) goto L57
            r0 = r7
            X.4eu r0 = (X.C100324eu) r0
            X.0ll r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36313098087171850(0x810292002e070a, double:3.0278876792123967E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L57
            X.QDL r2 = new X.QDL
            r2.<init>(r8)
        L35:
            r5.A04 = r2
            boolean r0 = r7.A00()
            r5.A06 = r0
            if (r4 == 0) goto L54
            X.4eu r7 = (X.C100324eu) r7
            X.0ll r3 = r7.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36594573064734492(0x820292003b071c, double:3.205893588431772E-306)
            long r1 = X.C18U.A01(r2, r3, r0)
            int r0 = (int) r1
            if (r0 <= 0) goto L53
        L51:
            X.C100344ew.A03 = r0
        L53:
            return
        L54:
            r0 = 256(0x100, float:3.59E-43)
            goto L51
        L57:
            boolean r0 = r7.A01()
            if (r0 == 0) goto L78
            if (r4 == 0) goto L75
            r0 = r7
            X.4eu r0 = (X.C100324eu) r0
            X.0ll r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36594573062637334(0x820292001b0716, double:3.205893587105521E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
        L6f:
            X.4ex r2 = new X.4ex
            r2.<init>(r8, r0)
            goto L35
        L75:
            r0 = 250(0xfa, double:1.235E-321)
            goto L6f
        L78:
            X.QDK r2 = new X.QDK
            r2.<init>(r8)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88043wC.<init>(android.os.Looper, X.4ev, X.4eo[]):void");
    }

    @Override // X.InterfaceC88013w9
    public final void EnU(Looper looper, String str) {
        this.A02 = looper.getThread();
        C100344ew c100344ew = this.A05;
        int i = 100;
        do {
            c100344ew.A00.add(new C88023wA(c100344ew));
            i--;
        } while (i >= 0);
        for (InterfaceC100264eo interfaceC100264eo : this.A03) {
            if (interfaceC100264eo instanceof InterfaceC100254en) {
                ((InterfaceC100254en) interfaceC100264eo).CxZ(str);
            }
        }
        this.A04.start();
    }
}
