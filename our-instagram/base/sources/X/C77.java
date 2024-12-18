package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C77 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C77[] A01;
    public static final C77 A02;
    public static final C77 A03;
    public static final C77 A04;
    public static final C77 A05;
    public static final C77 A06;
    public static final C77 A07;
    public static final C77 A08;

    static {
        C77 c77 = new C77("LOADING_MASK", 0);
        A07 = c77;
        C77 c772 = new C77("SEGMENTATION_ERROR", 1);
        A08 = c772;
        C77 c773 = new C77("EDIT_MASK", 2);
        A02 = c773;
        C77 c774 = new C77("ENTER_PROMPT", 3);
        A03 = c774;
        C77 c775 = new C77("GENERATING", 4);
        A06 = c775;
        C77 c776 = new C77("GENERATED_IMAGE_SELECTION", 5);
        A04 = c776;
        C77 c777 = new C77("GENERATED_IMAGE_SELECTION_4UP", 6);
        A05 = c777;
        C77[] c77Arr = {c77, c772, c773, c774, c775, c776, c777};
        A01 = c77Arr;
        A00 = AbstractC12190kN.A00(c77Arr);
    }

    public static C77 valueOf(String str) {
        return (C77) Enum.valueOf(C77.class, str);
    }

    public static C77[] values() {
        return (C77[]) A01.clone();
    }

    public C77(String str, int i) {
    }
}
