package X;

/* renamed from: X.SZh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62964SZh {
    public static final C62964SZh A03;
    public int A00 = 0;
    public int[] A01 = new int[8];
    public Object[] A02 = new Object[8];

    /* JADX WARN: Type inference failed for: r0v0, types: [X.SZh, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A01 = new int[0];
        obj.A02 = new Object[0];
        A03 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C62964SZh)) {
                C62964SZh c62964SZh = (C62964SZh) obj;
                int i = this.A00;
                if (i == c62964SZh.A00) {
                    int[] iArr = this.A01;
                    int[] iArr2 = c62964SZh.A01;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A02;
                            Object[] objArr2 = c62964SZh.A02;
                            for (int i3 = 0; i3 < i; i3++) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        int A01 = JQ0.A01(i);
        int[] iArr = this.A01;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        int i4 = (A01 + i2) * 31;
        Object[] objArr = this.A02;
        int i5 = 17;
        for (int i6 = 0; i6 < i; i6++) {
            i5 = AbstractC166987dD.A0I(objArr[i6], i5 * 31);
        }
        return i4 + i5;
    }
}
