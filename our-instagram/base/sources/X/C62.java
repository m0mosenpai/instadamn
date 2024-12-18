package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C62 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C62[] A01;
    public static final C62 A02;
    public static final C62 A03;

    static {
        C62 c62 = new C62("BITMAP_DOWNLOAD_ERROR", 0);
        A02 = c62;
        C62 c622 = new C62("BITMAP_MISSING_INFO", 1);
        A03 = c622;
        C62[] c62Arr = {c62, c622};
        A01 = c62Arr;
        A00 = AbstractC12190kN.A00(c62Arr);
    }

    public static C62 valueOf(String str) {
        return (C62) Enum.valueOf(C62.class, str);
    }

    public static C62[] values() {
        return (C62[]) A01.clone();
    }

    public C62(String str, int i) {
    }
}
