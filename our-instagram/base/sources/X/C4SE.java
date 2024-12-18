package X;

import android.os.SystemClock;

/* renamed from: X.4SE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SE {
    public float A00;
    public int A01;
    public long A02;
    public C4QP A03;
    public C4SF A04;
    public boolean A05;
    public boolean A06;
    public final float A07;
    public final int A08;
    public final long A09;
    public final C75363a3 A0A;
    public final C4S7 A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public C4SE(C4SE c4se, int i) {
        this.A0C = c4se.A0C;
        this.A0A = c4se.A0A;
        this.A09 = c4se.A09;
        this.A0B = c4se.A0B;
        this.A01 = c4se.A01;
        this.A02 = c4se.A02;
        this.A00 = c4se.A00;
        this.A08 = i;
        this.A07 = c4se.A07;
        this.A06 = c4se.A06;
        this.A03 = c4se.A03;
        this.A05 = c4se.A05;
        this.A0E = c4se.A0E;
        this.A0D = c4se.A0D;
        this.A04 = c4se.A04;
    }

    public C4SE(C4QP c4qp, C75363a3 c75363a3, C4S7 c4s7, String str, float f, int i, int i2, boolean z, boolean z2) {
        String str2;
        this.A0C = str;
        this.A0A = c75363a3;
        this.A0B = c4s7;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A09 = elapsedRealtime;
        this.A02 = elapsedRealtime;
        this.A08 = i;
        this.A07 = f;
        this.A01 = i2;
        this.A03 = c4qp;
        this.A0E = z;
        if (z) {
            if (z2) {
                str2 = "resume";
            } else {
                str2 = "autoplay";
            }
        } else {
            str2 = "early_prepare";
        }
        this.A0D = str2;
        this.A04 = new C4SF(str2, elapsedRealtime);
    }
}
