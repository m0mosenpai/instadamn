package X;

/* renamed from: X.4Z9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Z9 implements Comparable {
    public int A00;
    public long A01;
    public Object A02;
    public final C96814Wq A03;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C4Z9 c4z9 = (C4Z9) obj;
        Object obj2 = this.A02;
        int i = 0;
        boolean z = false;
        if (obj2 == null) {
            z = true;
        }
        boolean z2 = false;
        if (c4z9.A02 == null) {
            z2 = true;
        }
        if (z != z2) {
            if (obj2 == null) {
                return 1;
            }
        } else if (obj2 != null && (i = this.A00 - c4z9.A00) == 0) {
            long j = this.A01;
            long j2 = c4z9.A01;
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

    public C4Z9(C96814Wq c96814Wq) {
        this.A03 = c96814Wq;
    }
}
