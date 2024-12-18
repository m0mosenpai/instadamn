package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95414Rb {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C5RE A05;
    public C5RE A06;
    public C5RE A07;
    public long A08;
    public final C4RZ A09;
    public final C95404Ra A0A;
    public final List A0B = new ArrayList();

    public final synchronized void A00() {
        this.A00 = 0;
        this.A01 = 0;
        this.A04 = 0L;
        this.A03 = -1L;
        this.A02 = -1L;
        this.A05 = null;
        this.A06 = null;
        this.A07 = null;
        this.A0B.clear();
        this.A08 = -1L;
    }

    public final synchronized void A01() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A03;
        if (j >= 0) {
            long j2 = elapsedRealtime - j;
            if (j2 > 0) {
                this.A00++;
                if (j2 > 200) {
                    this.A01++;
                }
                this.A04 += j2;
                C5RE c5re = new C5RE(this.A02, j, j2);
                if (this.A05 == null) {
                    this.A05 = c5re;
                }
                this.A06 = c5re;
                C5RE c5re2 = this.A07;
                if (c5re2 == null || j2 > c5re2.A00) {
                    this.A07 = c5re;
                }
                this.A0B.add(c5re);
            }
        }
        this.A03 = -1L;
        this.A02 = -1L;
        this.A08 = -1L;
    }

    public C95414Rb(C4RZ c4rz, C95404Ra c95404Ra) {
        this.A09 = c4rz;
        this.A0A = c95404Ra;
        A00();
    }
}
