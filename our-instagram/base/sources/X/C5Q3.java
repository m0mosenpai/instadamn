package X;

/* renamed from: X.5Q3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Q3 implements Comparable {
    public int A00;
    public long A01;
    public Object A02;
    public final C96814Wq A03;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C5Q3 c5q3 = (C5Q3) obj;
        Object obj2 = this.A02;
        int i = 0;
        boolean z = false;
        if (obj2 == null) {
            z = true;
        }
        boolean z2 = false;
        if (c5q3.A02 == null) {
            z2 = true;
        }
        if (z != z2) {
            if (obj2 == null) {
                return 1;
            }
        } else if (obj2 != null && (i = this.A00 - c5q3.A00) == 0) {
            long j = this.A01;
            long j2 = c5q3.A01;
            if (j >= j2) {
                if (j != j2) {
                    return 1;
                }
                return 0;
            }
        } else {
            return i;
        }
        return -1;
    }

    public C5Q3(C96814Wq c96814Wq) {
        this.A03 = c96814Wq;
    }
}
