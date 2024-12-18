package X;

/* renamed from: X.BWv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25685BWv {
    public static final int A00(String str, int i) {
        int i2 = Integer.MAX_VALUE;
        if (str == null) {
            return AbstractC135576Bi.A01(Integer.MAX_VALUE, i);
        }
        try {
            i2 = AbstractC135576Bi.A01((int) C6BE.A01(str), i);
            return i2;
        } catch (C41M e) {
            int A01 = AbstractC135576Bi.A01(i2, i);
            AbstractC25241Le.A03("IgIconBinderUtils", e);
            return A01;
        }
    }
}
