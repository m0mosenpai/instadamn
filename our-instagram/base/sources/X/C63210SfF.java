package X;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SfF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63210SfF {
    public final int A04;
    public final C58621Pyp A05;
    public final R8F[] A06;
    public final AtomicInteger A07 = new AtomicInteger();
    public int A00 = -1;
    public int A01 = 1;
    public Exception A02 = null;
    public boolean A03 = false;

    public static synchronized int A00(C63210SfF c63210SfF, Exception exc, int i) {
        synchronized (c63210SfF) {
            if (i == 1 && exc != null) {
                C0K8.A0K("DownloadStateHandler", "Result should not be SUCCESS when exception != null", exc);
                i = 2;
            }
            if (c63210SfF.A01 == 1) {
                c63210SfF.A01 = i;
            }
            if (c63210SfF.A02 == null) {
                c63210SfF.A02 = exc;
            }
        }
        return i;
    }

    private synchronized void A01() {
        if (!this.A03) {
            R8F[] r8fArr = this.A06;
            int i = 0;
            do {
                R8F r8f = r8fArr[i];
                int i2 = this.A01;
                Exception exc = this.A02;
                if (r8f instanceof R8E) {
                    R8E r8e = (R8E) r8f;
                    int i3 = 3;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            i3 = 2;
                        }
                    } else {
                        i3 = 1;
                    }
                    r8e.A00.A01(new C62674SLm(exc, null, i3));
                }
                i++;
            } while (i < 2);
            this.A03 = true;
        }
    }

    public final void A02(C0g8 c0g8, Exception exc, int i) {
        Integer num;
        R8F[] r8fArr = this.A06;
        int i2 = 0;
        do {
            R8F r8f = r8fArr[i2];
            String str = c0g8.A02;
            if (r8f instanceof R8D) {
                R8D r8d = (R8D) r8f;
                if (i == 1) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A0N;
                }
                r8d.A00.A05(str, num);
            }
            i2++;
        } while (i2 < 2);
        synchronized (this) {
            A00(this, exc, i);
            int incrementAndGet = this.A07.incrementAndGet();
            int i3 = this.A00;
            if (i3 < 0) {
                i3 = this.A05.A02.size();
            }
            if (incrementAndGet == i3) {
                A01();
            }
        }
    }

    public final void A03(IOException iOException, int i, int i2) {
        for (int i3 = 0; i3 < 2; i3++) {
        }
        synchronized (this) {
            Integer valueOf = Integer.valueOf(i2);
            java.util.Set set = this.A05.A02;
            if (i2 != set.size()) {
                C0K8.A0P("DownloadStateHandler", "Expected metadata for %d modules, got %d", Integer.valueOf(set.size()), valueOf);
            }
            this.A00 = i2;
            if (A00(this, iOException, i) != 1) {
                A01();
            }
        }
    }

    public final synchronized void A04(Exception exc, int i) {
        A00(this, exc, i);
        A01();
    }

    public C63210SfF(C58621Pyp c58621Pyp, R8F[] r8fArr, int i) {
        this.A04 = i;
        this.A05 = c58621Pyp;
        this.A06 = r8fArr;
    }
}
