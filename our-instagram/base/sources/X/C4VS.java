package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4VS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4VS implements C2BC, C2B5 {
    public static C4VS A0E;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public int A07;
    public long A08;
    public final C2A9 A09;
    public final boolean A0A;
    public final C4VU A0B;
    public final C2A7 A0C;
    public final Map A0D;
    public static final List A0K = C4VT.A00(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final List A0F = C4VT.A00(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final List A0G = C4VT.A00(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final List A0H = C4VT.A00(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final List A0I = C4VT.A00(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final List A0J = C4VT.A00(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    @Override // X.C2B5
    public final synchronized long AgD() {
        return this.A02;
    }

    @Override // X.C2B5
    public final C2BC CAV() {
        return this;
    }

    @Override // X.C2BC
    public final synchronized void D15(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, int i, boolean z) {
        if (z) {
            if ((c4c7.A00 & 8) != 8) {
                this.A03 += i;
            }
        }
    }

    @Override // X.C2BC
    public final synchronized void DvH(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z, boolean z2) {
        if (z) {
            if ((c4c7.A00 & 8) != 8) {
                int i = this.A01;
                if (i == 0) {
                    this.A04 = SystemClock.elapsedRealtime();
                }
                this.A01 = i + 1;
            }
        }
    }

    public static long A00(C4VS c4vs, int i) {
        Map map = c4vs.A0D;
        Number number = (Number) map.get(Integer.valueOf(i));
        if (number == null && (number = (Number) map.get(0)) == null) {
            number = 1000000L;
        }
        return number.longValue();
    }

    public static void A01(C4VS c4vs, int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == c4vs.A08) {
            return;
        }
        c4vs.A08 = j2;
        Iterator it = c4vs.A0B.A00.iterator();
        while (it.hasNext()) {
            final C72766Xmi c72766Xmi = (C72766Xmi) it.next();
            if (!c72766Xmi.A00) {
                c72766Xmi.A01.post(new Runnable() { // from class: X.YGS
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }
    }

    @Override // X.C2BC
    public final synchronized void Dv9(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z) {
        if (z) {
            if ((c4c7.A00 & 8) != 8) {
                boolean z2 = false;
                if (this.A01 > 0) {
                    z2 = true;
                }
                C4B8.A04(z2);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i = (int) (elapsedRealtime - this.A04);
                this.A06 += i;
                long j = this.A05;
                long j2 = this.A03;
                this.A05 = j + j2;
                if (i > 0) {
                    this.A09.A01((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i);
                    if (this.A06 >= 2000 || this.A05 >= 524288) {
                        this.A02 = r7.A00();
                    }
                    this.A07++;
                    A01(this, i, this.A03, this.A02);
                    this.A04 = elapsedRealtime;
                    this.A03 = 0L;
                }
                this.A01--;
            }
        }
    }

    @Override // X.C2B5
    public final void EFK(C4WB c4wb) {
        this.A0B.A00(c4wb);
    }

    public C4VS(Context context, C2A7 c2a7, Map map, boolean z) {
        final C4VV c4vv;
        int i;
        this.A0D = new HashMap(map);
        this.A0B = new C4VU();
        this.A09 = new C2A9();
        this.A0C = c2a7;
        this.A0A = z;
        if (context != null) {
            synchronized (C4VV.class) {
                c4vv = C4VV.A04;
                if (c4vv == null) {
                    c4vv = new C4VV(context);
                    C4VV.A04 = c4vv;
                }
            }
            synchronized (c4vv.A02) {
                i = c4vv.A00;
            }
            this.A00 = i;
            this.A02 = A00(this, i);
            final InterfaceC96584Vt interfaceC96584Vt = new InterfaceC96584Vt() { // from class: X.4Vs
                @Override // X.InterfaceC96584Vt
                public final void DVM(int i2) {
                    int i3;
                    C4VS c4vs = C4VS.this;
                    C4VS c4vs2 = C4VS.A0E;
                    synchronized (c4vs) {
                        int i4 = c4vs.A00;
                        if ((i4 == 0 || c4vs.A0A) && i4 != i2) {
                            c4vs.A00 = i2;
                            if (i2 != 1 && i2 != 0 && i2 != 8) {
                                long A00 = C4VS.A00(c4vs, i2);
                                c4vs.A02 = A00;
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (c4vs.A01 > 0) {
                                    i3 = (int) (elapsedRealtime - c4vs.A04);
                                } else {
                                    i3 = 0;
                                }
                                C4VS.A01(c4vs, i3, c4vs.A03, A00);
                                c4vs.A04 = elapsedRealtime;
                                c4vs.A03 = 0L;
                                c4vs.A05 = 0L;
                                c4vs.A06 = 0L;
                                C2A9 c2a9 = c4vs.A09;
                                c2a9.A04.clear();
                                c2a9.A00 = -1;
                                c2a9.A01 = 0;
                                c2a9.A02 = 0;
                            }
                        }
                    }
                }
            };
            CopyOnWriteArrayList copyOnWriteArrayList = c4vv.A03;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                if (reference.get() == null) {
                    copyOnWriteArrayList.remove(reference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(interfaceC96584Vt));
            c4vv.A01.post(new Runnable() { // from class: X.4Vu
                @Override // java.lang.Runnable
                public final void run() {
                    int i2;
                    C4VV c4vv2 = c4vv;
                    InterfaceC96584Vt interfaceC96584Vt2 = interfaceC96584Vt;
                    synchronized (c4vv2.A02) {
                        i2 = c4vv2.A00;
                    }
                    interfaceC96584Vt2.DVM(i2);
                }
            });
            return;
        }
        this.A00 = 0;
        this.A02 = A00(this, 0);
    }

    @Override // X.C2B5
    public final void A8V(Handler handler, C4WB c4wb) {
        c4wb.getClass();
        C4VU c4vu = this.A0B;
        c4vu.A00(c4wb);
        c4vu.A00.add(new C72766Xmi(handler, c4wb));
    }

    @Deprecated
    public C4VS() {
        this(null, C2A7.A00, Collections.emptyMap(), false);
    }
}
