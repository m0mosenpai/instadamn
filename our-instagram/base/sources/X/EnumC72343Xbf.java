package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Xbf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72343Xbf {
    public static final EnumC72343Xbf A01;
    public int A00;

    static {
        new EnumC72343Xbf("API", 0, 0);
        new EnumC72343Xbf("API2", 1, 1);
        new EnumC72343Xbf("STORAGE", 2, 2);
        new EnumC72343Xbf("DEBUG_UI_API", 3, 6);
        new EnumC72343Xbf("DEBUG_UI_STORAGE", 4, 7);
        new EnumC72343Xbf("EARLY_ACCESS", 5, 8);
        new EnumC72343Xbf("RN", 6, 10);
        new EnumC72343Xbf("SERVICE", 7, 11);
        A01 = new EnumC72343Xbf("BATCH_API", 8, 12);
    }

    public EnumC72343Xbf(String str, int i, int i2) {
        this.A00 = i2;
    }
}
