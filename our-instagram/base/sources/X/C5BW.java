package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5BW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BW {
    public InterfaceC1127157b A00;
    public C5BX A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC16660sJ A07;
    public final AtomicReference A06 = new AtomicReference(null);
    public final InterfaceC16620sF A08 = new C206989Ed(this, 5);
    public final InterfaceC16660sJ A09 = new C206929Dx(this, 41);
    public final C57S A05 = new C57S(new C5BX[16]);
    public long A04 = -1;

    /* JADX WARN: Code restructure failed: missing block: B:215:0x0506, code lost:
    
        if (r0 != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0550, code lost:
    
        return r26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.C5BW r53) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5BW.A00(X.5BW):boolean");
    }

    public final void A01() {
        C57S c57s = this.A05;
        synchronized (c57s) {
            int i = c57s.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = c57s.A02;
                do {
                    C5BX c5bx = (C5BX) objArr[i2];
                    c5bx.A09.A00.A08();
                    c5bx.A04.A08();
                    c5bx.A08.A00.A08();
                    c5bx.A0A.clear();
                    i2++;
                } while (i2 < i);
            }
        }
    }

    public final void A02(Object obj, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        Object obj2;
        C5BX c5bx;
        C57S c57s = this.A05;
        synchronized (c57s) {
            int i = c57s.A00;
            if (i > 0) {
                Object[] objArr = c57s.A02;
                int i2 = 0;
                do {
                    obj2 = objArr[i2];
                    if (((C5BX) obj2).A0B == interfaceC16660sJ) {
                        break;
                    } else {
                        i2++;
                    }
                } while (i2 < i);
            }
            obj2 = null;
            c5bx = (C5BX) obj2;
            if (c5bx == null) {
                C14360o3.A0C(interfaceC16660sJ, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                C15500q5.A06(interfaceC16660sJ, 1);
                c5bx = new C5BX(interfaceC16660sJ);
                c57s.A09(c5bx);
            }
        }
        boolean z = this.A02;
        C5BX c5bx2 = this.A01;
        long j = this.A04;
        if (j != -1) {
            Thread currentThread = Thread.currentThread();
            if (j != currentThread.getId()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Detected multithreaded access to SnapshotStateObserver: previousThreadId=");
                sb.append(j);
                sb.append("), currentThread={id=");
                sb.append(currentThread.getId());
                sb.append(", name=");
                sb.append(currentThread.getName());
                sb.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                SQP.A00(sb.toString());
                throw C00O.createAndThrow();
            }
        }
        try {
            this.A02 = false;
            this.A01 = c5bx;
            this.A04 = Thread.currentThread().getId();
            InterfaceC16660sJ interfaceC16660sJ2 = this.A09;
            Object obj3 = c5bx.A03;
            C18630vq c18630vq = c5bx.A02;
            int i3 = c5bx.A00;
            c5bx.A03 = obj;
            c5bx.A02 = (C18630vq) c5bx.A04.A03(obj);
            if (c5bx.A00 == -1) {
                c5bx.A00 = AbstractC75013Yr.A00().A0F();
            }
            InterfaceC117545Tp interfaceC117545Tp = c5bx.A06;
            C57S A00 = C5U3.A00();
            try {
                A00.A09(interfaceC117545Tp);
                C3Z5.A04(interfaceC16820sZ, interfaceC16660sJ2);
                A00.A00(A00.A00 - 1);
                Object obj4 = c5bx.A03;
                C14360o3.A0A(obj4);
                int i4 = c5bx.A00;
                C18630vq c18630vq2 = c5bx.A02;
                if (c18630vq2 != null) {
                    long[] jArr = c18630vq2.A03;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j2 = jArr[i5];
                            if (((((-1) ^ j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - (((i5 - length) ^ (-1)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((255 & j2) < 128) {
                                        int i8 = (i5 << 3) + i7;
                                        Object obj5 = c18630vq2.A04[i8];
                                        if (c18630vq2.A02[i8] != i4) {
                                            C5BX.A01(c5bx, obj4, obj5);
                                            c18630vq2.A05(i8);
                                        }
                                    }
                                    j2 >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                c5bx.A03 = obj3;
                c5bx.A02 = c18630vq;
                c5bx.A00 = i3;
            } catch (Throwable th) {
                A00.A00(A00.A00 - 1);
                throw th;
            }
        } finally {
            this.A01 = c5bx2;
            this.A02 = z;
            this.A04 = j;
        }
    }

    public C5BW(InterfaceC16660sJ interfaceC16660sJ) {
        this.A07 = interfaceC16660sJ;
    }
}
