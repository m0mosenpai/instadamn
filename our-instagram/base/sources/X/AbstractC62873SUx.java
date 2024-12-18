package X;

import java.util.Arrays;

/* renamed from: X.SUx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62873SUx {
    public static final S2V A00;
    public static final S2V A01;
    public static final Class A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.S2V] */
    static {
        Class<?> cls;
        S2V s2v = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        A02 = cls;
        try {
            Class<?> cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            if (cls2 != null) {
                s2v = (S2V) AbstractC58320PtC.A0s(cls2);
            }
        } catch (Throwable unused2) {
        }
        A00 = s2v;
        A01 = new Object();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [X.Sh4, java.lang.Object] */
    public static void A00(Object obj, Object obj2) {
        RLJ rlj = (RLJ) obj;
        C63300Sh4 c63300Sh4 = rlj.zzc;
        C63300Sh4 c63300Sh42 = ((RLJ) obj2).zzc;
        C63300Sh4 c63300Sh43 = C63300Sh4.A04;
        C63300Sh4 c63300Sh44 = c63300Sh4;
        if (!c63300Sh43.equals(c63300Sh42)) {
            if (c63300Sh43.equals(c63300Sh4)) {
                int i = c63300Sh4.A00 + c63300Sh42.A00;
                int[] copyOf = Arrays.copyOf(c63300Sh4.A02, i);
                System.arraycopy(c63300Sh42.A02, 0, copyOf, c63300Sh4.A00, c63300Sh42.A00);
                Object[] copyOf2 = Arrays.copyOf(c63300Sh4.A03, i);
                System.arraycopy(c63300Sh42.A03, 0, copyOf2, c63300Sh4.A00, c63300Sh42.A00);
                ?? obj3 = new Object();
                obj3.A00 = i;
                obj3.A02 = copyOf;
                obj3.A03 = copyOf2;
                obj3.A01 = true;
                c63300Sh44 = obj3;
            } else {
                c63300Sh44 = c63300Sh4;
                if (!c63300Sh42.equals(c63300Sh43)) {
                    if (c63300Sh4.A01) {
                        int i2 = c63300Sh4.A00 + c63300Sh42.A00;
                        C63300Sh4.A01(c63300Sh4, i2);
                        System.arraycopy(c63300Sh42.A02, 0, c63300Sh4.A02, c63300Sh4.A00, c63300Sh42.A00);
                        System.arraycopy(c63300Sh42.A03, 0, c63300Sh4.A03, c63300Sh4.A00, c63300Sh42.A00);
                        c63300Sh4.A00 = i2;
                        c63300Sh44 = c63300Sh4;
                    } else {
                        throw AbstractC43592JPx.A11();
                    }
                }
            }
        }
        rlj.zzc = c63300Sh44;
    }
}
