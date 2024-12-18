package X;

import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4As, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92124As {
    public long A00;
    public String A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final android.net.Uri A0F;
    public final C5QW A0G;
    public final C5QY A0H;
    public final C5QX A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final List A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r2 == (-9223372036854775807L)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A00(int r7) {
        /*
            r6 = this;
            java.util.List r1 = r6.A0Q
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != r0) goto L1a
            long r2 = r6.A06
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L24
        L15:
            long r0 = com.google.android.exoplayer2.util.Util.A07(r4)
            return r0
        L1a:
            int r0 = r7 + 1
            java.lang.Object r0 = r1.get(r0)
            X.4BI r0 = (X.C4BI) r0
            long r2 = r0.A00
        L24:
            java.lang.Object r0 = r1.get(r7)
            X.4BI r0 = (X.C4BI) r0
            long r0 = r0.A00
            long r2 = r2 - r0
            r4 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92124As.A00(int):long");
    }

    public final Pair A01() {
        C4BI c4bi;
        int A00;
        List list = this.A0Q;
        if (list.size() == 0 || (A00 = (c4bi = (C4BI) list.get(0)).A00(2)) == -1) {
            return null;
        }
        C4BF c4bf = (C4BF) c4bi.A03.get(A00);
        return new Pair(c4bf.A03, c4bf.A04);
    }

    public final C4BI A02(int i) {
        return (C4BI) this.A0Q.get(i);
    }

    public final String A03() {
        C4BI c4bi;
        int A00;
        String str;
        List list = this.A0Q;
        if (list.size() == 0 || (A00 = (c4bi = (C4BI) list.get(0)).A00(2)) == -1 || (str = ((C4BF) c4bi.A03.get(A00)).A02) == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public final boolean A04() {
        C4BI c4bi;
        int A00;
        List list = this.A0Q;
        if (list.size() != 0 && (A00 = (c4bi = (C4BI) list.get(0)).A00(1)) != -1) {
            C4BF c4bf = (C4BF) c4bi.A03.get(A00);
            if (c4bf.A09 && c4bf.A0A) {
                Iterator it = c4bf.A07.iterator();
                while (it.hasNext()) {
                    if (!"mp4a.40.42".equals(((C4BB) it.next()).A02.A0R)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C92124As(android.net.Uri uri, C5QW c5qw, C5QY c5qy, C5QX c5qx, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A04 = j;
        this.A06 = j2;
        this.A09 = j3;
        this.A0R = z;
        this.A0A = j4;
        this.A0E = j5;
        this.A0D = j6;
        this.A0C = j7;
        this.A0G = c5qw;
        this.A0I = c5qx;
        this.A0F = uri;
        this.A0H = c5qy;
        this.A0Q = list;
        this.A03 = j8;
        this.A07 = j9;
        this.A05 = j10;
        this.A08 = j11;
        this.A0B = j12;
        this.A0U = z2;
        this.A0S = z3;
        this.A0W = z4;
        this.A0V = z5;
        this.A0P = str;
        this.A02 = i;
        this.A0K = str2;
        this.A0N = str3;
        this.A0J = str4;
        this.A0M = str5;
        this.A0L = str6;
        this.A0O = str7;
        this.A0T = z6;
        this.A00 = j13;
    }
}
