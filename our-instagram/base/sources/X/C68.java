package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C68 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C68[] A01;
    public static final C68 A02;
    public static final C68 A03;

    static {
        C68 c68 = new C68("Name", 0);
        A03 = c68;
        C68 c682 = new C68("Bio", 1);
        A02 = c682;
        C68[] c68Arr = {c68, c682};
        A01 = c68Arr;
        A00 = AbstractC12190kN.A00(c68Arr);
    }

    public static C68 valueOf(String str) {
        return (C68) Enum.valueOf(C68.class, str);
    }

    public static C68[] values() {
        return (C68[]) A01.clone();
    }

    public C68(String str, int i) {
    }
}
