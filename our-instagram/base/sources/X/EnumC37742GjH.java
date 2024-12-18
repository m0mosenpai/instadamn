package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.GjH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC37742GjH implements InterfaceC43393JFi {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC37742GjH[] A01;
    public static final EnumC37742GjH A02;
    public static final EnumC37742GjH A03;
    public static final EnumC37742GjH A04;
    public static final EnumC37742GjH A05;
    public static final EnumC37742GjH A06;

    static {
        EnumC37742GjH enumC37742GjH = new EnumC37742GjH("SHOW_CTA", 0);
        A06 = enumC37742GjH;
        EnumC37742GjH enumC37742GjH2 = new EnumC37742GjH("HIGHLIGHT_CTA", 1);
        A03 = enumC37742GjH2;
        EnumC37742GjH enumC37742GjH3 = new EnumC37742GjH("SHOW_AND_HIDE_PREVIEW_COMMENT", 2);
        A05 = enumC37742GjH3;
        EnumC37742GjH enumC37742GjH4 = new EnumC37742GjH("MID_SCENE", 3);
        A04 = enumC37742GjH4;
        EnumC37742GjH enumC37742GjH5 = new EnumC37742GjH("ANIMATE_PE_COLLECTION", 4);
        A02 = enumC37742GjH5;
        EnumC37742GjH[] enumC37742GjHArr = {enumC37742GjH, enumC37742GjH2, enumC37742GjH3, enumC37742GjH4, enumC37742GjH5};
        A01 = enumC37742GjHArr;
        A00 = AbstractC12190kN.A00(enumC37742GjHArr);
    }

    public static EnumC37742GjH valueOf(String str) {
        return (EnumC37742GjH) Enum.valueOf(EnumC37742GjH.class, str);
    }

    public static EnumC37742GjH[] values() {
        return (EnumC37742GjH[]) A01.clone();
    }

    public EnumC37742GjH(String str, int i) {
    }
}
