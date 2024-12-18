package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class TI1 implements Serializable {
    public int A00 = -1;
    public String A01;
    public String A02;
    public transient Object A03;

    public final String toString() {
        Class<?> cls;
        char c;
        String str = this.A01;
        if (str == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            Object obj = this.A03;
            if (obj == null) {
                A1C.append("UNKNOWN");
            } else {
                if (obj instanceof Class) {
                    cls = (Class) obj;
                } else {
                    cls = obj.getClass();
                }
                int i = 0;
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                    i++;
                }
                String name = cls.getName();
                while (true) {
                    A1C.append(name);
                    i--;
                    if (i < 0) {
                        break;
                    }
                    name = "[]";
                }
            }
            A1C.append('[');
            String str2 = this.A02;
            if (str2 != null) {
                c = '\"';
                A1C.append('\"');
                A1C.append(str2);
            } else {
                int i2 = this.A00;
                if (i2 >= 0) {
                    A1C.append(i2);
                    String A14 = AbstractC58320PtC.A14(A1C);
                    this.A01 = A14;
                    return A14;
                }
                c = '?';
            }
            A1C.append(c);
            String A142 = AbstractC58320PtC.A14(A1C);
            this.A01 = A142;
            return A142;
        }
        return str;
    }
}
