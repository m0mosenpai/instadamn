package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8QI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8QI {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8QI[] A01;
    public static final C8QI A02;
    public static final C8QI A03;

    static {
        C8QI c8qi = new C8QI("COLOUR_WHEEL", 0);
        A02 = c8qi;
        C8QI c8qi2 = new C8QI("GRADIENT_BUTTON", 1);
        A03 = c8qi2;
        C8QI[] c8qiArr = {c8qi, c8qi2};
        A01 = c8qiArr;
        A00 = AbstractC12190kN.A00(c8qiArr);
    }

    public static C8QI valueOf(String str) {
        return (C8QI) Enum.valueOf(C8QI.class, str);
    }

    public static C8QI[] values() {
        return (C8QI[]) A01.clone();
    }

    public C8QI(String str, int i) {
    }
}
