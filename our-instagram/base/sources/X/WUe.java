package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WUe implements C1MT {
    public static final long A0B = TimeUnit.HOURS.toMillis(2);
    public static final long A0C = TimeUnit.MINUTES.toMillis(30);
    public final VMA A01;
    public final InterfaceC71969XDb A02;
    public final CountDownLatch A07;
    public final VY1 A08;
    public final VY2 A09;
    public final Object A05 = new Object();
    public final C0JK A0A = C0JK.A01();
    public long A00 = -1;
    public final C69562VrR A03 = new C69562VrR();
    public final C0JM A04 = C03250Di.A00;
    public final java.util.Set A06 = new HashSet();

    public static void A00(WUe wUe) {
        boolean z;
        long j;
        C0JM c0jm = wUe.A04;
        long now = c0jm.now();
        C69562VrR c69562VrR = wUe.A03;
        synchronized (c69562VrR) {
            z = c69562VrR.A02;
        }
        if (z) {
            long j2 = wUe.A00;
            if (j2 != -1 && now - j2 <= A0C) {
                return;
            }
        }
        long now2 = c0jm.now();
        long j3 = A0B + now2;
        try {
            long j4 = 0;
            int i = 0;
            for (C69583Vrm c69583Vrm : wUe.A02.B2M()) {
                i++;
                long j5 = c69583Vrm.A00;
                if (j5 < 0) {
                    j5 = c69583Vrm.A02.A00.length();
                    c69583Vrm.A00 = j5;
                }
                j4 += j5;
                if (c69583Vrm.A00() > j3) {
                    if (c69583Vrm.A00 < 0) {
                        c69583Vrm.A00 = c69583Vrm.A02.A00.length();
                    }
                    c69583Vrm.A00();
                }
            }
            synchronized (c69562VrR) {
                j = c69562VrR.A00;
            }
            long j6 = i;
            if (j != j6 || c69562VrR.A00() != j4) {
                synchronized (c69562VrR) {
                    c69562VrR.A00 = j6;
                    c69562VrR.A01 = j4;
                    c69562VrR.A02 = true;
                }
            }
            wUe.A00 = now2;
        } catch (IOException e) {
            e.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1MT
    public final void F8g() {
        W1i w1i;
        synchronized (this.A05) {
            A00(this);
            C69562VrR c69562VrR = this.A03;
            long A00 = c69562VrR.A00();
            if (A00 > 0 && A00 >= 2097152) {
                double d = 1.0d - (2097152.0d / A00);
                if (d > 0.02d) {
                    try {
                        synchronized (c69562VrR) {
                            try {
                                c69562VrR.A02 = false;
                                c69562VrR.A00 = -1L;
                                c69562VrR.A01 = -1L;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        A00(this);
                        long A002 = c69562VrR.A00();
                        long j = A002 - ((long) (d * A002));
                        try {
                            InterfaceC71969XDb interfaceC71969XDb = this.A02;
                            Collection<C69583Vrm> B2M = interfaceC71969XDb.B2M();
                            long now = this.A04.now() + A0B;
                            ArrayList arrayList = new ArrayList(B2M.size());
                            ArrayList arrayList2 = new ArrayList(B2M.size());
                            for (C69583Vrm c69583Vrm : B2M) {
                                if (c69583Vrm.A00() > now) {
                                    arrayList.add(c69583Vrm);
                                } else {
                                    arrayList2.add(c69583Vrm);
                                }
                            }
                            Collections.sort(arrayList2, new C71659WyA(this.A01, 1));
                            arrayList.addAll(arrayList2);
                            long A003 = c69562VrR.A00() - j;
                            int i = 0;
                            Iterator it = arrayList.iterator();
                            long j2 = 0;
                            while (it.hasNext()) {
                                C69583Vrm c69583Vrm2 = (C69583Vrm) it.next();
                                if (j2 > A003) {
                                    break;
                                }
                                long EEf = interfaceC71969XDb.EEf(c69583Vrm2);
                                this.A06.remove(c69583Vrm2.A03);
                                if (EEf > 0) {
                                    i++;
                                    j2 += EEf;
                                    Object obj = W1i.A03;
                                    synchronized (obj) {
                                        try {
                                            W1i w1i2 = W1i.A02;
                                            if (w1i2 != null) {
                                                W1i.A02 = w1i2.A00;
                                                w1i2.A00 = null;
                                                W1i.A01--;
                                                w1i = w1i2;
                                            } else {
                                                w1i = new Object();
                                            }
                                        } finally {
                                        }
                                    }
                                    synchronized (obj) {
                                        try {
                                            int i2 = W1i.A01;
                                            if (i2 < 5) {
                                                W1i.A01 = i2 + 1;
                                                W1i w1i3 = W1i.A02;
                                                if (w1i3 != null) {
                                                    w1i.A00 = w1i3;
                                                }
                                                W1i.A02 = w1i;
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            }
                            long j3 = -j2;
                            long j4 = -i;
                            synchronized (c69562VrR) {
                                if (c69562VrR.A02) {
                                    c69562VrR.A01 += j3;
                                    c69562VrR.A00 += j4;
                                }
                            }
                            interfaceC71969XDb.E6q();
                        } catch (IOException e) {
                            e.getMessage();
                            throw e;
                        }
                    } catch (IOException e2) {
                        e2.getMessage();
                    }
                }
            }
        }
    }

    @Override // X.C1MT
    public final void F8h() {
        synchronized (this.A05) {
            try {
                this.A02.AHb();
                this.A06.clear();
            } catch (IOException | NullPointerException e) {
                e.getMessage();
            }
            C69562VrR c69562VrR = this.A03;
            synchronized (c69562VrR) {
                c69562VrR.A02 = false;
                c69562VrR.A00 = -1L;
                c69562VrR.A01 = -1L;
            }
        }
    }

    public WUe(VY1 vy1, VY2 vy2, VMA vma, InterfaceC71969XDb interfaceC71969XDb, C1MZ c1mz) {
        this.A02 = interfaceC71969XDb;
        this.A01 = vma;
        this.A09 = vy2;
        this.A08 = vy1;
        if (c1mz != null) {
            c1mz.EDD(this);
        }
        this.A07 = new CountDownLatch(0);
    }
}
