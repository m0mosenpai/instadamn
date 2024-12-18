package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C70 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C70[] A01;
    public static final C70 A02;
    public static final C70 A03;
    public static final C70 A04;
    public static final C70 A05;
    public static final C70 A06;

    static {
        C70 c70 = new C70("DEFAULT", 0);
        A02 = c70;
        C70 c702 = new C70("DEFAULT_WITH_PROFILE_LINK", 1);
        A03 = c702;
        C70 c703 = new C70("FEATURED_PRODUCTS", 2);
        A04 = c703;
        C70 c704 = new C70("MULTIPLE_CHOICE_QUESTION", 3);
        A05 = c704;
        C70 c705 = new C70("SHORT_ANSWER_QUESTION", 4);
        A06 = c705;
        C70[] c70Arr = {c70, c702, c703, c704, c705};
        A01 = c70Arr;
        A00 = AbstractC12190kN.A00(c70Arr);
    }

    public static C70 valueOf(String str) {
        return (C70) Enum.valueOf(C70.class, str);
    }

    public static C70[] values() {
        return (C70[]) A01.clone();
    }

    public C70(String str, int i) {
    }
}
