package X;

/* renamed from: X.5xS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131925xS implements Comparable {
    public final long A00;
    public final C4WQ A01;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C131925xS c131925xS = (C131925xS) obj;
        long j = this.A00 - c131925xS.A00;
        if (j >= 0) {
            if (j <= 0) {
                if (this.A01 != null) {
                    if (c131925xS.A01 != null) {
                        return 0;
                    }
                } else {
                    return -1;
                }
            }
            return 1;
        }
        return -1;
    }

    public C131925xS(C4WQ c4wq, long j) {
        this.A01 = c4wq;
        this.A00 = j;
    }
}
