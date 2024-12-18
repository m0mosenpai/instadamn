package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C66 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C66[] A01;
    public static final C66 A02;
    public static final C66 A03;

    static {
        C66 c66 = new C66("FOOTER", 0);
        A03 = c66;
        C66 c662 = new C66("CTA", 1);
        A02 = c662;
        C66[] c66Arr = {c66, c662};
        A01 = c66Arr;
        A00 = AbstractC12190kN.A00(c66Arr);
    }

    public static C66 valueOf(String str) {
        return (C66) Enum.valueOf(C66.class, str);
    }

    public static C66[] values() {
        return (C66[]) A01.clone();
    }

    public C66(String str, int i) {
    }
}
