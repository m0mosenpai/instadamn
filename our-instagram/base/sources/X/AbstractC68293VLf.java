package X;

/* renamed from: X.VLf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68293VLf {
    public static float A00(C6FG c6fg, String str, String str2) {
        if (str == null) {
            return 0.0f;
        }
        try {
            return C6BE.A01(str);
        } catch (C41M e) {
            AbstractC25241Le.A00(c6fg, AbstractC111324zv.A00(1507), String.format("Error parsing %s: %s", str2, str), e);
            return 0.0f;
        }
    }
}
