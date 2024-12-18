package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Hd0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ Hd0[] A01;
    public static final Hd0 A02;
    public static final Hd0 A03;

    static {
        Hd0 hd0 = new Hd0("ON_APP_FOREGROUNDED", 0);
        A03 = hd0;
        Hd0 hd02 = new Hd0("ON_APP_BACKGROUNDED", 1);
        A02 = hd02;
        Hd0[] hd0Arr = {hd0, hd02};
        A01 = hd0Arr;
        A00 = AbstractC12190kN.A00(hd0Arr);
    }

    public static Hd0 valueOf(String str) {
        return (Hd0) Enum.valueOf(Hd0.class, str);
    }

    public static Hd0[] values() {
        return (Hd0[]) A01.clone();
    }

    public Hd0(String str, int i) {
    }
}
