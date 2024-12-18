package X;

import android.os.Build;
import android.view.Surface;

/* renamed from: X.4ST, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ST {
    public C6Q3 A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final C122265gM A05;
    public final C126145nB A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final Surface A00() {
        C126145nB c126145nB;
        C122265gM c122265gM = this.A05;
        if (c122265gM != null) {
            return c122265gM.A00;
        }
        C6Q3 c6q3 = this.A00;
        if (c6q3 != null) {
            return c6q3.A01;
        }
        if (Build.VERSION.SDK_INT >= 29 && (c126145nB = this.A06) != null) {
            return c126145nB.A00();
        }
        return null;
    }

    public final C126145nB A01() {
        return this.A06;
    }

    public final void A02() {
        C122265gM c122265gM = this.A05;
        if (c122265gM != null) {
            c122265gM.release();
        }
        C6Q3 c6q3 = this.A00;
        if (c6q3 != null) {
            c6q3.A01.release();
            c6q3.A00.release();
        }
        C126145nB c126145nB = this.A06;
        if (c126145nB != null && Build.VERSION.SDK_INT >= 29) {
            c126145nB.A02();
        }
    }

    public C4ST(C122265gM c122265gM, C126145nB c126145nB, String str, String str2, String str3, String str4, int i, long j, long j2) {
        this.A03 = j;
        this.A05 = c122265gM;
        this.A06 = c126145nB;
        this.A07 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A02 = i;
        this.A04 = j2;
    }
}
