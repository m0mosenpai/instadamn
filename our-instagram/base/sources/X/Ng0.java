package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Ng0 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ Ng0[] A02;
    public static final Ng0 A03;
    public static final Ng0 A04;
    public final String A00;

    static {
        Ng0 ng0 = new Ng0("EDIT", 0, "edit");
        A03 = ng0;
        Ng0 ng02 = new Ng0("VIEW", 1, "view");
        A04 = ng02;
        Ng0[] ng0Arr = {ng0, ng02};
        A02 = ng0Arr;
        A01 = AbstractC12190kN.A00(ng0Arr);
    }

    public static Ng0 valueOf(String str) {
        return (Ng0) Enum.valueOf(Ng0.class, str);
    }

    public static Ng0[] values() {
        return (Ng0[]) A02.clone();
    }

    public Ng0(String str, int i, String str2) {
        this.A00 = str2;
    }
}
