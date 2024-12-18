package X;

/* renamed from: X.VLd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68291VLd {
    public static final float A00(String str, float f, float f2) {
        if (str != null) {
            if (str.endsWith("%")) {
                return C6BE.A00(str) * 0.01f * f2;
            }
            return C6BE.A01(str);
        }
        return f;
    }
}
