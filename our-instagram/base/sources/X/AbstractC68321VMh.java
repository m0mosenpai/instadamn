package X;

/* renamed from: X.VMh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68321VMh {
    public static final int A00(String str, int i) {
        float A01;
        if (str == null) {
            return i;
        }
        try {
            if (str.endsWith("%")) {
                A01 = (AbstractC167007dF.A0K(C1LZ.A00().A00).heightPixels * C6BE.A00(str)) / 100.0f;
            } else {
                A01 = C6BE.A01(str);
            }
            return (int) A01;
        } catch (C41M unused) {
            return i;
        }
    }
}
