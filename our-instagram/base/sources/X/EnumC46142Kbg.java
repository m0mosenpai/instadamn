package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46142Kbg {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46142Kbg[] A01;
    public static final EnumC46142Kbg A02;
    public static final EnumC46142Kbg A03;

    static {
        EnumC46142Kbg enumC46142Kbg = new EnumC46142Kbg("SEPARATE", 0);
        A03 = enumC46142Kbg;
        EnumC46142Kbg enumC46142Kbg2 = new EnumC46142Kbg("LAYOUT", 1);
        A02 = enumC46142Kbg2;
        EnumC46142Kbg[] enumC46142KbgArr = {enumC46142Kbg, enumC46142Kbg2};
        A01 = enumC46142KbgArr;
        A00 = AbstractC12190kN.A00(enumC46142KbgArr);
    }

    public static EnumC46142Kbg valueOf(String str) {
        return (EnumC46142Kbg) Enum.valueOf(EnumC46142Kbg.class, str);
    }

    public static EnumC46142Kbg[] values() {
        return (EnumC46142Kbg[]) A01.clone();
    }

    public EnumC46142Kbg(String str, int i) {
    }
}
