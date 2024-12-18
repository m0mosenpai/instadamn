package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Ng1 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ Ng1[] A02;
    public static final Ng1 A03;
    public static final Ng1 A04;
    public final int A00;

    static {
        Ng1 ng1 = new Ng1("POSTS", 0, 1);
        A04 = ng1;
        Ng1 ng12 = new Ng1("GALLERY", 1, 2);
        A03 = ng12;
        Ng1[] ng1Arr = {ng1, ng12};
        A02 = ng1Arr;
        A01 = AbstractC12190kN.A00(ng1Arr);
    }

    public static Ng1 valueOf(String str) {
        return (Ng1) Enum.valueOf(Ng1.class, str);
    }

    public static Ng1[] values() {
        return (Ng1[]) A02.clone();
    }

    public Ng1(String str, int i, int i2) {
        this.A00 = i2;
    }
}
