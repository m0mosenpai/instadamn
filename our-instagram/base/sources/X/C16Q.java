package X;

/* renamed from: X.16Q, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C16Q {
    public int A00;
    public int A01;

    public abstract C16Q A00();

    public abstract Object A01();

    public abstract String A03();

    public abstract void A04(Object obj);

    public final String A02() {
        int i = this.A01;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return "?";
                }
                return "Object";
            }
            return "Array";
        }
        return "root";
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder(64);
        int i = this.A01;
        if (i != 0) {
            if (i != 1) {
                sb.append('{');
                String A03 = A03();
                char c2 = '?';
                if (A03 != null) {
                    c2 = '\"';
                    sb.append('\"');
                    int[] iArr = AnonymousClass167.A07;
                    int length = A03.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char charAt = A03.charAt(i2);
                        if (charAt < 128 && iArr[charAt] != 0) {
                            sb.append('\\');
                            int i3 = iArr[charAt];
                            if (i3 < 0) {
                                sb.append('u');
                                sb.append('0');
                                sb.append('0');
                                char[] cArr = AnonymousClass167.A00;
                                sb.append(cArr[charAt >> 4]);
                                charAt = cArr[charAt & 15];
                            } else {
                                charAt = (char) i3;
                            }
                        }
                        sb.append(charAt);
                    }
                }
                sb.append(c2);
                c = '}';
            } else {
                sb.append('[');
                int i4 = this.A00;
                if (i4 < 0) {
                    i4 = 0;
                }
                sb.append(i4);
                c = ']';
            }
            sb.append(c);
        } else {
            sb.append("/");
        }
        return sb.toString();
    }
}
