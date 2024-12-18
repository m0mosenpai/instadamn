package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C61 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C61[] A01;
    public static final C61 A02;
    public static final C61 A03;

    static {
        C61 c61 = new C61("FEEDBACK", 0);
        A03 = c61;
        C61 c612 = new C61("EDIT_PROMPT", 1);
        A02 = c612;
        C61[] c61Arr = {c61, c612};
        A01 = c61Arr;
        A00 = AbstractC12190kN.A00(c61Arr);
    }

    public static C61 valueOf(String str) {
        return (C61) Enum.valueOf(C61.class, str);
    }

    public static C61[] values() {
        return (C61[]) A01.clone();
    }

    public C61(String str, int i) {
    }
}
