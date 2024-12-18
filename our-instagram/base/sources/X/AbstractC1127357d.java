package X;

/* renamed from: X.57d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1127357d {
    public static final Object[] A00(Object obj, Object obj2, Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 2];
        AbstractC06960Yn.A0W(objArr, objArr2, 0, 0, i);
        AbstractC06960Yn.A0W(objArr, objArr2, i + 2, i, length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] A01(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 2];
        AbstractC06960Yn.A0W(objArr, objArr2, 0, 0, i);
        AbstractC06960Yn.A0W(objArr, objArr2, i, i + 2, length);
        return objArr2;
    }
}
