package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7M {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7M[] A02;
    public static final C7M A03;
    public static final C7M A04;
    public final int A00;

    public static C7M valueOf(String str) {
        return (C7M) Enum.valueOf(C7M.class, str);
    }

    public static C7M[] values() {
        return (C7M[]) A02.clone();
    }

    static {
        C7M c7m = new C7M("PEOPLE_TAB", 0, 2131972923);
        A04 = c7m;
        C7M c7m2 = new C7M("CHANNELS_TAB", 1, 2131972922);
        A03 = c7m2;
        C7M[] c7mArr = {c7m, c7m2};
        A02 = c7mArr;
        A01 = AbstractC12190kN.A00(c7mArr);
    }

    public C7M(String str, int i, int i2) {
        this.A00 = i2;
    }
}
