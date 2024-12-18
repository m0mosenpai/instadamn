package X;

import android.os.SystemClock;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0pU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15140pU implements InterfaceC04640Mg {
    public final int A00;
    public final Object A01;

    public C15140pU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC04640Mg
    public final void DI7(final boolean z) {
        boolean z2;
        if (this.A00 != 0) {
            synchronized (C0L6.class) {
                if (z != C0L6.A06) {
                    C0L6.A06 = z;
                    final HashSet hashSet = new HashSet(C0L6.A02);
                    C0L6.A03.execute(new Runnable() { // from class: X.0Kz
                        @Override // java.lang.Runnable
                        public final void run() {
                            HashSet hashSet2 = hashSet;
                            boolean z3 = z;
                            boolean z4 = C0L6.A06;
                            Iterator it = hashSet2.iterator();
                            while (it.hasNext()) {
                                C0L3 c0l3 = (C0L3) it.next();
                                if (z3) {
                                    c0l3.Cwx();
                                } else {
                                    c0l3.Cx1();
                                }
                            }
                        }
                    });
                }
            }
            C04670Mj c04670Mj = (C04670Mj) this.A01;
            c04670Mj.A05 = z;
            C04280Ku c04280Ku = c04670Mj.A01;
            boolean z3 = !z;
            synchronized (c04280Ku) {
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z4 = false;
                if (c04280Ku.A09) {
                    c04280Ku.A08 = z3;
                    if (z3) {
                        c04280Ku.A00 = SystemClock.elapsedRealtime();
                    } else {
                        c04280Ku.A01 = uptimeMillis;
                        c04280Ku.A04 = uptimeMillis;
                        c04280Ku.A02 = 1L;
                    }
                    c04280Ku.A09 = false;
                    return;
                }
                boolean z5 = c04280Ku.A08;
                if (z5 && !z3) {
                    z2 = true;
                    long j = c04280Ku.A02;
                    if (j > 0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - c04280Ku.A00;
                        if (elapsedRealtime <= 0) {
                            c04280Ku.A03++;
                        }
                        c04280Ku.A06 += elapsedRealtime;
                    } else {
                        c04280Ku.A04 = uptimeMillis;
                    }
                    c04280Ku.A01 = uptimeMillis;
                    c04280Ku.A02 = j + 1;
                } else {
                    z2 = false;
                    if (!z5 && z3) {
                        z4 = true;
                        c04280Ku.A00 = SystemClock.elapsedRealtime();
                        c04280Ku.A05 += uptimeMillis - c04280Ku.A01;
                    }
                }
                c04280Ku.A08 = z3;
                synchronized (c04280Ku.A0A) {
                    if (z4 || z2) {
                        AnonymousClass091 anonymousClass091 = c04280Ku.A07;
                        if (anonymousClass091 != null) {
                            anonymousClass091.A00.A09(new C024209q(null), C0M6.CRITICAL_REPORT, anonymousClass091);
                        }
                    }
                }
                return;
            }
        }
        Iterator it = C0OD.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC04640Mg) it.next()).DI7(z);
        }
    }
}
