package X;

/* renamed from: X.S2k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62215S2k {
    public static String A00(String str, Object... objArr) {
        int length;
        String A0N;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                A0N = "null";
            } else {
                try {
                    A0N = obj.toString();
                } catch (Exception e) {
                    A0N = AbstractC58324PtG.A0N(obj, e);
                }
            }
            objArr[i2] = A0N;
            i2++;
        }
        int length2 = str.length();
        StringBuilder A0r = AbstractC58318PtA.A0r(length2, length * 16);
        int i3 = 0;
        while (i < length) {
            int indexOf = str.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0r.append((CharSequence) str, i3, indexOf);
            A0r.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0r.append((CharSequence) str, i3, length2);
        if (i < length) {
            int A0B = AbstractC58322PtE.A0B(" [", A0r, objArr, i);
            while (A0B < length) {
                A0B = AbstractC58322PtE.A0B(", ", A0r, objArr, A0B);
            }
            A0r.append(']');
        }
        return A0r.toString();
    }
}
