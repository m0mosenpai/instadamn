package X;

/* renamed from: X.2Xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51282Xb {
    public final Object[] A01 = new Object[5];
    public short A00 = 0;

    public static String A00(int i) {
        if (i == 0) {
            return "CONTENT";
        }
        if (i == 1) {
            return "BACKGROUND";
        }
        if (i == 2) {
            return "FOREGROUND";
        }
        if (i == 3) {
            return "HOST";
        }
        if (i != 4) {
            return null;
        }
        return "BORDER";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C51282Xb c51282Xb = (C51282Xb) obj;
                if (this.A00 == c51282Xb.A00) {
                    int i = 0;
                    while (true) {
                        Object[] objArr = this.A01;
                        if (i >= 5) {
                            break;
                        }
                        if (objArr[i] != c51282Xb.A01[i]) {
                            break;
                        }
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int A01(int i) {
        if (i >= 0 && i < this.A00) {
            int i2 = 0;
            int i3 = 0;
            do {
                if (this.A01[i3] != null) {
                    i2++;
                }
                i3++;
            } while (i2 <= i);
            return i3 - 1;
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, this.A00, "index=", ", size="));
    }

    public final Object A02() {
        Object[] objArr = this.A01;
        char c = 3;
        if (objArr[3] == null) {
            c = 0;
            if (objArr[0] == null) {
                c = 1;
                if (objArr[1] == null) {
                    c = 2;
                    if (objArr[2] == null) {
                        c = 4;
                    }
                }
            }
        }
        return objArr[c];
    }

    public final void A03(int i, Object obj) {
        Object[] objArr = this.A01;
        if (objArr[i] == null) {
            if (objArr[3] == null && (i != 3 || this.A00 <= 0)) {
                objArr[i] = obj;
                this.A00 = (short) (this.A00 + 1);
                return;
            }
            throw new RuntimeException("OutputUnitType.HOST unit should be the only member of an OutputUnitsAffinityGroup");
        }
        throw new RuntimeException(AnonymousClass001.A0R("Already contains unit for type ", A00(i)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for (int i = 0; i < this.A00; i++) {
            int A01 = A01(i);
            Object obj = this.A01[A01(i)];
            sb.append("\n\t");
            sb.append(A00(A01));
            sb.append(": ");
            sb.append(obj.toString());
        }
        return sb.toString();
    }
}
