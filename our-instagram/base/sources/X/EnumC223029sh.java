package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223029sh {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC223029sh[] A03;
    public static final EnumC223029sh A04;
    public static final EnumC223029sh A05;
    public static final EnumC223029sh A06;
    public static final EnumC223029sh A07;
    public final EnumC223239t9 A00;
    public final String A01;

    static {
        EnumC223029sh enumC223029sh = new EnumC223029sh(EnumC223239t9.A0T, "ModelPlaced", "onModelPlacementSuccess", 0);
        A05 = enumC223029sh;
        EnumC223029sh enumC223029sh2 = new EnumC223029sh(EnumC223239t9.A0e, "RotationUsed", "onEnterRotation", 1);
        A06 = enumC223029sh2;
        EnumC223029sh enumC223029sh3 = new EnumC223029sh(EnumC223239t9.A0E, "DimensionsUsed", "onEnterDimensions", 2);
        A04 = enumC223029sh3;
        EnumC223029sh enumC223029sh4 = new EnumC223029sh(EnumC223239t9.A0g, "SliderRotationUsed", "onRotateSlider", 3);
        A07 = enumC223029sh4;
        EnumC223029sh[] enumC223029shArr = {enumC223029sh, enumC223029sh2, enumC223029sh3, enumC223029sh4, new EnumC223029sh(EnumC223239t9.A0b, "PitchToZoomUsed", "onPinchToZoom", 4)};
        A03 = enumC223029shArr;
        A02 = AbstractC12190kN.A00(enumC223029shArr);
    }

    public static EnumC223029sh valueOf(String str) {
        return (EnumC223029sh) Enum.valueOf(EnumC223029sh.class, str);
    }

    public static EnumC223029sh[] values() {
        return (EnumC223029sh[]) A03.clone();
    }

    public EnumC223029sh(EnumC223239t9 enumC223239t9, String str, String str2, int i) {
        this.A01 = str2;
        this.A00 = enumC223239t9;
    }
}
