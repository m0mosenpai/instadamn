package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RgM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61161RgM {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61161RgM[] A02;
    public static final EnumC61161RgM A03;
    public static final EnumC61161RgM A04;
    public static final EnumC61161RgM A05;
    public static final EnumC61161RgM A06;
    public static final EnumC61161RgM A07;
    public static final EnumC61161RgM A08;
    public final String A00;

    static {
        EnumC61161RgM enumC61161RgM = new EnumC61161RgM("EDGE_LEFT", 0, "edge_left");
        A04 = enumC61161RgM;
        EnumC61161RgM enumC61161RgM2 = new EnumC61161RgM("EDGE_RIGHT", 1, "edge_right");
        A05 = enumC61161RgM2;
        EnumC61161RgM enumC61161RgM3 = new EnumC61161RgM("INSET_LEFT", 2, "inset_left");
        A07 = enumC61161RgM3;
        EnumC61161RgM enumC61161RgM4 = new EnumC61161RgM("INSET_RIGHT", 3, "inset_right");
        A08 = enumC61161RgM4;
        EnumC61161RgM enumC61161RgM5 = new EnumC61161RgM("EDGE_TOP", 4, "edge_top");
        A06 = enumC61161RgM5;
        EnumC61161RgM enumC61161RgM6 = new EnumC61161RgM("EDGE_BOTTOM", 5, "edge_bottom");
        A03 = enumC61161RgM6;
        EnumC61161RgM[] enumC61161RgMArr = {enumC61161RgM, enumC61161RgM2, enumC61161RgM3, enumC61161RgM4, enumC61161RgM5, enumC61161RgM6};
        A02 = enumC61161RgMArr;
        A01 = AbstractC12190kN.A00(enumC61161RgMArr);
    }

    public static EnumC61161RgM valueOf(String str) {
        return (EnumC61161RgM) Enum.valueOf(EnumC61161RgM.class, str);
    }

    public static EnumC61161RgM[] values() {
        return (EnumC61161RgM[]) A02.clone();
    }

    public EnumC61161RgM(String str, int i, String str2) {
        this.A00 = str2;
    }
}
