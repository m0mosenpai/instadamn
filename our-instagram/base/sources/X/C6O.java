package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6O {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6O[] A01;
    public static final C6O A02;
    public static final C6O A03;
    public static final C6O A04;

    static {
        C6O c6o = new C6O("DEFAULT", 0);
        A03 = c6o;
        C6O c6o2 = new C6O("LIGHT", 1);
        A04 = c6o2;
        C6O c6o3 = new C6O("DARK", 2);
        A02 = c6o3;
        C6O[] c6oArr = {c6o, c6o2, c6o3, new C6O("ON_MEDIA", 3)};
        A01 = c6oArr;
        A00 = AbstractC12190kN.A00(c6oArr);
    }

    public static C6O valueOf(String str) {
        return (C6O) Enum.valueOf(C6O.class, str);
    }

    public static C6O[] values() {
        return (C6O[]) A01.clone();
    }

    public C6O(String str, int i) {
    }
}
