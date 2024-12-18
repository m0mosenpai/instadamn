package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46154Kbs {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46154Kbs[] A01;
    public static final EnumC46154Kbs A02;
    public static final EnumC46154Kbs A03;
    public static final EnumC46154Kbs A04;
    public static final EnumC46154Kbs A05;

    static {
        EnumC46154Kbs enumC46154Kbs = new EnumC46154Kbs("LOADING", 0);
        A03 = enumC46154Kbs;
        EnumC46154Kbs enumC46154Kbs2 = new EnumC46154Kbs("EMPTY", 1);
        A02 = enumC46154Kbs2;
        EnumC46154Kbs enumC46154Kbs3 = new EnumC46154Kbs("SHOW_PROJECTS", 2);
        A05 = enumC46154Kbs3;
        EnumC46154Kbs enumC46154Kbs4 = new EnumC46154Kbs("SHOW_API_ERROR_DIALOG", 3);
        A04 = enumC46154Kbs4;
        EnumC46154Kbs[] enumC46154KbsArr = {enumC46154Kbs, enumC46154Kbs2, enumC46154Kbs3, enumC46154Kbs4};
        A01 = enumC46154KbsArr;
        A00 = AbstractC12190kN.A00(enumC46154KbsArr);
    }

    public static EnumC46154Kbs valueOf(String str) {
        return (EnumC46154Kbs) Enum.valueOf(EnumC46154Kbs.class, str);
    }

    public static EnumC46154Kbs[] values() {
        return (EnumC46154Kbs[]) A01.clone();
    }

    public EnumC46154Kbs(String str, int i) {
    }
}
