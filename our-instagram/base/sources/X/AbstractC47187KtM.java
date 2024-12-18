package X;

/* renamed from: X.KtM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47187KtM {
    public static final ThreadLocal[] A00;

    static {
        int i = 0;
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        do {
            threadLocalArr[i] = new ThreadLocal();
            i++;
        } while (i < 4);
        A00 = threadLocalArr;
    }
}
