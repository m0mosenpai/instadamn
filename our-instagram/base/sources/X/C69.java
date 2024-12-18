package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C69 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C69[] A01;
    public static final C69 A02;
    public static final C69 A03;

    static {
        C69 c69 = new C69("Posts", 0);
        A03 = c69;
        C69 c692 = new C69("Clips", 1);
        A02 = c692;
        C69[] c69Arr = {c69, c692};
        A01 = c69Arr;
        A00 = AbstractC12190kN.A00(c69Arr);
    }

    public static C69 valueOf(String str) {
        return (C69) Enum.valueOf(C69.class, str);
    }

    public static C69[] values() {
        return (C69[]) A01.clone();
    }

    public C69(String str, int i) {
    }
}
