package X;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.W5r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70130W5r {
    public static final C70130W5r A0c = new C70130W5r(new C70116W4o());
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final long A0O;
    public final C70171WEr A0P;
    public final DrmInitData A0Q;
    public final Metadata A0R;
    public final Object A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final List A0Z;
    public final List A0a;
    public final byte[] A0b;

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C70130W5r c70130W5r = (C70130W5r) obj;
            int i2 = this.A00;
            if ((i2 == 0 || (i = c70130W5r.A00) == 0 || i2 == i) && this.A0J == c70130W5r.A0J && this.A0G == c70130W5r.A0G && this.A04 == c70130W5r.A04 && this.A0F == c70130W5r.A0F && this.A0C == c70130W5r.A0C && this.A0O == c70130W5r.A0O && this.A0N == c70130W5r.A0N && this.A0B == c70130W5r.A0B && this.A0H == c70130W5r.A0H && this.A0K == c70130W5r.A0K && this.A06 == c70130W5r.A06 && this.A0I == c70130W5r.A0I && this.A0E == c70130W5r.A0E && this.A09 == c70130W5r.A09 && this.A0A == c70130W5r.A0A && this.A03 == c70130W5r.A03 && this.A0L == c70130W5r.A0L && this.A0M == c70130W5r.A0M && this.A07 == c70130W5r.A07 && Float.compare(this.A01, c70130W5r.A01) == 0 && Float.compare(this.A02, c70130W5r.A02) == 0 && C2I7.A00(this.A0V, c70130W5r.A0V) && C2I7.A00(this.A0W, c70130W5r.A0W) && this.A0a.equals(c70130W5r.A0a) && C2I7.A00(this.A0T, c70130W5r.A0T) && C2I7.A00(this.A0U, c70130W5r.A0U) && C2I7.A00(this.A0Y, c70130W5r.A0Y) && C2I7.A00(this.A0X, c70130W5r.A0X) && Arrays.equals(this.A0b, c70130W5r.A0b) && C2I7.A00(this.A0R, c70130W5r.A0R) && C2I7.A00(this.A0P, c70130W5r.A0P) && C2I7.A00(this.A0Q, c70130W5r.A0Q)) {
                List list = this.A0Z;
                int size = list.size();
                List list2 = c70130W5r.A0Z;
                if (size == list2.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < list.size()) {
                            if (!Arrays.equals((byte[]) list.get(i3), (byte[]) list2.get(i3))) {
                                break;
                            }
                            i3++;
                        } else if (C2I7.A00(this.A0S, c70130W5r.A0S)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int i2 = 0;
            int A0O = (((((((((((((((((((((((527 + AbstractC167017dG.A0O(this.A0V)) * 31) + AbstractC167017dG.A0O(this.A0W)) * 31) + this.A0a.hashCode()) * 31) + AbstractC167017dG.A0O(this.A0X)) * 31) + this.A0J) * 31) + this.A0G) * 31) + this.A04) * 31) + this.A0F) * 31) + AbstractC167017dG.A0O(this.A0T)) * 31) + AbstractC167017dG.A0M(this.A0R)) * 31) + AbstractC167017dG.A0M(this.A0S)) * 31) + AbstractC167017dG.A0O(this.A0U)) * 31;
            String str = this.A0Y;
            if (str != null) {
                i2 = str.hashCode();
            }
            int A00 = ((((((((((((((((((AbstractC166997dE.A00((AbstractC166997dE.A00((((((((((A0O + i2) * 31) + this.A0C) * 31) + ((int) this.A0O)) * 31) + this.A0N) * 31) + this.A0B) * 31, this.A01) + this.A0H) * 31, this.A02) + this.A0K) * 31) + this.A06) * 31) + this.A0I) * 31) + this.A0E) * 31) + this.A09) * 31) + this.A0A) * 31) + this.A03) * 31) + this.A0L) * 31) + this.A0M) * 31) + this.A07;
            this.A00 = A00;
            return A00;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC111324zv.A00(1634));
        sb.append(this.A0V);
        sb.append(", ");
        sb.append(this.A0W);
        sb.append(", ");
        sb.append(this.A0U);
        sb.append(", ");
        sb.append(this.A0Y);
        sb.append(", ");
        sb.append(this.A0T);
        sb.append(", ");
        sb.append(this.A05);
        sb.append(", ");
        sb.append(this.A0X);
        sb.append(", [");
        sb.append(this.A0N);
        sb.append(", ");
        sb.append(this.A0B);
        sb.append(", ");
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A0P);
        sb.append("], [");
        sb.append(this.A06);
        sb.append(", ");
        sb.append(this.A0I);
        return AbstractC166997dE.A0x("])", sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
    
        if (r2 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C70130W5r(X.C70116W4o r6) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70130W5r.<init>(X.W4o):void");
    }
}
