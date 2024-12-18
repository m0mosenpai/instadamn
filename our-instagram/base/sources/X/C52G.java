package X;

/* renamed from: X.52G, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C52G {
    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    return "executorch";
                }
                throw new RuntimeException();
            }
            return "liteNN";
        }
        return "pyTorch";
    }
}
