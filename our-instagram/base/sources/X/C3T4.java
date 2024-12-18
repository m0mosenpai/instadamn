package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3T4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3T4 {
    public int A00;
    public int[] A01;
    public Object[] A02 = new Object[8];

    public final String A00() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i = this.A00 + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.A02[i2];
            String str = "]";
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean A0K = C14360o3.A0K(serialDescriptor.BKw(), C3TH.A00);
                int[] iArr = this.A01;
                int i3 = iArr[i2];
                if (A0K) {
                    if (i3 != -1) {
                        sb.append("[");
                        sb.append(iArr[i2]);
                        sb.append(str);
                    }
                } else if (i3 >= 0) {
                    sb.append(".");
                    str = serialDescriptor.B0v(i3);
                    sb.append(str);
                }
            } else if (obj != C3TP.A00) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append(str);
            }
        }
        String obj2 = sb.toString();
        C14360o3.A07(obj2);
        return obj2;
    }

    public C3T4() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.A01 = iArr;
        this.A00 = -1;
    }

    public final String toString() {
        return A00();
    }
}
