package X;

/* renamed from: X.LzF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49808LzF implements Comparable {
    public final long A00;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long A00;
        long j;
        C49808LzF c49808LzF = (C49808LzF) obj;
        C14360o3.A0B(c49808LzF, 1);
        long j2 = this.A00;
        long j3 = c49808LzF.A00;
        C36G c36g = C36G.A08;
        if (((j3 - 1) | 1) == Long.MAX_VALUE) {
            if (j2 == j3) {
                A00 = 0;
            } else {
                if (j3 < 0) {
                    j = C36J.A02;
                } else {
                    j = C36J.A01;
                }
                A00 = ((-(j >> 1)) << 1) + (((int) j) & 1);
            }
        } else if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            if (j2 < 0) {
                A00 = C36J.A02;
            } else {
                A00 = C36J.A01;
            }
        } else {
            A00 = AbstractC84323pP.A00(c36g, j2, j3);
        }
        return C36J.A02(A00, 0L);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C49808LzF) || j != ((C49808LzF) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0K("ValueTimeMark(reading=", ')', this.A00);
    }

    public /* synthetic */ C49808LzF(long j) {
        this.A00 = j;
    }
}
