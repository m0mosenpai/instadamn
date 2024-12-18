package X;

import java.lang.reflect.Array;

/* renamed from: X.4jC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102374jC {
    public RDD A00 = null;
    public RDE A01 = null;
    public RDJ A06 = null;
    public RDH A04 = null;
    public RDI A05 = null;
    public RDG A03 = null;
    public RDF A02 = null;

    public static Object[] A00(Object obj, Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (objArr[i] == obj) {
                    if (i == 0) {
                        return objArr;
                    }
                    objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
                    System.arraycopy(objArr, 0, objArr2, 1, i);
                    objArr2[0] = obj;
                    int i2 = i + 1;
                    int i3 = length - i2;
                    if (i3 > 0) {
                        System.arraycopy(objArr, i2, objArr2, i2, i3);
                        return objArr2;
                    }
                } else {
                    i++;
                }
            } else {
                objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length + 1);
                if (length > 0) {
                    System.arraycopy(objArr, 0, objArr2, 1, length);
                }
                objArr2[0] = obj;
            }
        }
        return objArr2;
    }
}
