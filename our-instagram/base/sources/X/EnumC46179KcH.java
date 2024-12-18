package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46179KcH {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46179KcH[] A01;
    public static final EnumC46179KcH A02;
    public static final EnumC46179KcH A03;
    public static final EnumC46179KcH A04;
    public static final EnumC46179KcH A05;
    public static final EnumC46179KcH A06;
    public static final EnumC46179KcH A07;
    public static final EnumC46179KcH A08;

    static {
        EnumC46179KcH enumC46179KcH = new EnumC46179KcH("PHOTO", 0);
        A04 = enumC46179KcH;
        EnumC46179KcH enumC46179KcH2 = new EnumC46179KcH("VIDEO", 1);
        A08 = enumC46179KcH2;
        EnumC46179KcH enumC46179KcH3 = new EnumC46179KcH("RAVEN_PHOTO", 2);
        A05 = enumC46179KcH3;
        EnumC46179KcH enumC46179KcH4 = new EnumC46179KcH("RAVEN_VIDEO", 3);
        A06 = enumC46179KcH4;
        EnumC46179KcH enumC46179KcH5 = new EnumC46179KcH("GIF", 4);
        A03 = enumC46179KcH5;
        EnumC46179KcH enumC46179KcH6 = new EnumC46179KcH("STICKER", 5);
        A07 = enumC46179KcH6;
        EnumC46179KcH enumC46179KcH7 = new EnumC46179KcH("AUDIO", 6);
        A02 = enumC46179KcH7;
        EnumC46179KcH[] enumC46179KcHArr = {enumC46179KcH, enumC46179KcH2, enumC46179KcH3, enumC46179KcH4, enumC46179KcH5, enumC46179KcH6, enumC46179KcH7};
        A01 = enumC46179KcHArr;
        A00 = AbstractC12190kN.A00(enumC46179KcHArr);
    }

    public static EnumC46179KcH valueOf(String str) {
        return (EnumC46179KcH) Enum.valueOf(EnumC46179KcH.class, str);
    }

    public static EnumC46179KcH[] values() {
        return (EnumC46179KcH[]) A01.clone();
    }

    public EnumC46179KcH(String str, int i) {
    }
}
