package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39553HdP {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39553HdP[] A01;
    public static final EnumC39553HdP A02;
    public static final EnumC39553HdP A03;
    public static final EnumC39553HdP A04;
    public static final EnumC39553HdP A05;
    public static final EnumC39553HdP A06;
    public static final EnumC39553HdP A07;
    public static final EnumC39553HdP A08;
    public static final EnumC39553HdP A09;

    static {
        EnumC39553HdP enumC39553HdP = new EnumC39553HdP("IMAGE_FOREGROUND", 0);
        A03 = enumC39553HdP;
        EnumC39553HdP enumC39553HdP2 = new EnumC39553HdP("IMAGE_BACKGROUND", 1);
        A02 = enumC39553HdP2;
        EnumC39553HdP enumC39553HdP3 = new EnumC39553HdP("IMAGE_SAVE", 2);
        A05 = enumC39553HdP3;
        EnumC39553HdP enumC39553HdP4 = new EnumC39553HdP("VIDEO_FOREGROUND", 3);
        A08 = enumC39553HdP4;
        EnumC39553HdP enumC39553HdP5 = new EnumC39553HdP("VIDEO_BACKGROUND", 4);
        A07 = enumC39553HdP5;
        EnumC39553HdP enumC39553HdP6 = new EnumC39553HdP("VIDEO_SAVE", 5);
        A09 = enumC39553HdP6;
        EnumC39553HdP enumC39553HdP7 = new EnumC39553HdP("IMAGE_GLOBAL_ADJUST", 6);
        A04 = enumC39553HdP7;
        EnumC39553HdP enumC39553HdP8 = new EnumC39553HdP("PRONOUNCED", 7);
        A06 = enumC39553HdP8;
        EnumC39553HdP[] enumC39553HdPArr = {enumC39553HdP, enumC39553HdP2, enumC39553HdP3, enumC39553HdP4, enumC39553HdP5, enumC39553HdP6, enumC39553HdP7, enumC39553HdP8, new EnumC39553HdP("EXCESSIVE_FOR_DEBUG", 8)};
        A01 = enumC39553HdPArr;
        A00 = AbstractC12190kN.A00(enumC39553HdPArr);
    }

    public static EnumC39553HdP valueOf(String str) {
        return (EnumC39553HdP) Enum.valueOf(EnumC39553HdP.class, str);
    }

    public static EnumC39553HdP[] values() {
        return (EnumC39553HdP[]) A01.clone();
    }

    public EnumC39553HdP(String str, int i) {
    }
}
