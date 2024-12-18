package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7N {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7N[] A02;
    public static final C7N A03;
    public static final C7N A04;
    public final float A00;

    static {
        C7N c7n = new C7N("PORTRAIT", 0, 0.5625f);
        A03 = c7n;
        C7N c7n2 = new C7N("SQUARE", 1, 1.0f);
        A04 = c7n2;
        C7N[] c7nArr = {c7n, c7n2};
        A02 = c7nArr;
        A01 = AbstractC12190kN.A00(c7nArr);
    }

    public static C7N valueOf(String str) {
        return (C7N) Enum.valueOf(C7N.class, str);
    }

    public static C7N[] values() {
        return (C7N[]) A02.clone();
    }

    public C7N(String str, int i, float f) {
        this.A00 = f;
    }
}
