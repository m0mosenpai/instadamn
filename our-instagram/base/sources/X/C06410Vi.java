package X;

import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.0Vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06410Vi extends AbstractC02970Bv {
    public final ThreadLocal A00 = new ThreadLocal();
    public final ThreadLocal A01 = new ThreadLocal();

    public static double A00(C02940Bs c02940Bs) {
        long j = 1;
        long j2 = 0;
        boolean z = true;
        while (true) {
            if (c02940Bs.A03()) {
                C02940Bs.A00(c02940Bs);
                if (Character.isDigit(c02940Bs.A00)) {
                    j2 = (j2 * 10) + (c02940Bs.A00 - '0');
                } else if (z) {
                    if (c02940Bs.A00 == '-') {
                        j = -1;
                    } else {
                        throw new RuntimeException("Couldn't read number!");
                    }
                } else if (!c02940Bs.A06) {
                    c02940Bs.A03--;
                    c02940Bs.A00 = c02940Bs.A01;
                    c02940Bs.A06 = true;
                } else {
                    throw new RuntimeException("Can only rewind one step!");
                }
                z = false;
            } else if (z) {
                throw new RuntimeException("Couldn't read number because the file ended!");
            }
        }
        double d = ((j * j2) * 1.0d) / C0C1.A00;
        c02940Bs.A02();
        return d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Bu, java.lang.Object] */
    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03() {
        return new Object();
    }

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ boolean A04(AbstractC02960Bu abstractC02960Bu) {
        C0WB c0wb = (C0WB) abstractC02960Bu;
        AbstractC03000By.A00(c0wb);
        try {
            ThreadLocal threadLocal = this.A01;
            C02940Bs c02940Bs = (C02940Bs) threadLocal.get();
            if (c02940Bs == null) {
                c02940Bs = new C02940Bs();
                threadLocal.set(c02940Bs);
            }
            c02940Bs.A05 = true;
            RandomAccessFile randomAccessFile = c02940Bs.A04;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.seek(0L);
                } catch (IOException unused) {
                    c02940Bs.A01();
                }
            }
            if (c02940Bs.A04 == null) {
                try {
                    c02940Bs.A04 = new RandomAccessFile("/proc/self/stat", "r");
                } catch (IOException unused2) {
                    c02940Bs.A05 = false;
                    c02940Bs.A01();
                }
            }
            if (c02940Bs.A05) {
                c02940Bs.A03 = -1;
                c02940Bs.A02 = 0;
                c02940Bs.A00 = (char) 0;
                c02940Bs.A01 = (char) 0;
                c02940Bs.A06 = false;
                int i = 0;
                do {
                    c02940Bs.A02();
                    i++;
                } while (i < 13);
                c0wb.A03 = A00(c02940Bs);
                c0wb.A02 = A00(c02940Bs);
                c0wb.A01 = A00(c02940Bs);
                c0wb.A00 = A00(c02940Bs);
                ThreadLocal threadLocal2 = this.A00;
                if (threadLocal2.get() == null) {
                    threadLocal2.set(new Object());
                }
                C0WB c0wb2 = (C0WB) threadLocal2.get();
                if (Double.compare(c0wb.A03, c0wb2.A03) >= 0 && Double.compare(c0wb.A02, c0wb2.A02) >= 0 && Double.compare(c0wb.A01, c0wb2.A01) >= 0 && Double.compare(c0wb.A00, c0wb2.A00) >= 0) {
                    c0wb2.A06(c0wb);
                    return true;
                }
                android.util.Log.e("CpuMetricsCollector", AnonymousClass001.A0u("Cpu Time Decreased from ", c0wb2.toString(), " to ", c0wb.toString()), null);
                return false;
            }
            return false;
        } catch (C02930Br e) {
            android.util.Log.e("CpuMetricsCollector", "Unable to parse CPU time field", e);
            return false;
        }
    }
}
