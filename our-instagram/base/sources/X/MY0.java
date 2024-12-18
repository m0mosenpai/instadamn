package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class MY0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ MY0[] A01;
    public static final MY0 A02;
    public static final MY0 A03;

    static {
        MY0 my0 = new MY0("LOADING", 0);
        A02 = my0;
        MY0 my02 = new MY0("SUCCESS", 1);
        A03 = my02;
        MY0[] my0Arr = {my0, my02};
        A01 = my0Arr;
        A00 = AbstractC12190kN.A00(my0Arr);
    }

    public static MY0 valueOf(String str) {
        return (MY0) Enum.valueOf(MY0.class, str);
    }

    public static MY0[] values() {
        return (MY0[]) A01.clone();
    }

    public MY0(String str, int i) {
    }
}
