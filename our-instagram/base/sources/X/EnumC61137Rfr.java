package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61137Rfr {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61137Rfr[] A01;
    public static final EnumC61137Rfr A02;
    public static final EnumC61137Rfr A03;
    public static final EnumC61137Rfr A04;
    public static final EnumC61137Rfr A05;
    public static final EnumC61137Rfr A06;
    public static final EnumC61137Rfr A07;

    public static EnumC61137Rfr valueOf(String str) {
        return (EnumC61137Rfr) Enum.valueOf(EnumC61137Rfr.class, str);
    }

    public static EnumC61137Rfr[] values() {
        return (EnumC61137Rfr[]) A01.clone();
    }

    static {
        EnumC61137Rfr enumC61137Rfr = new EnumC61137Rfr("ID_DETECTOR_BINARY", 0);
        A03 = enumC61137Rfr;
        EnumC61137Rfr enumC61137Rfr2 = new EnumC61137Rfr("ID_DETECTOR_MODEL", 1);
        A04 = enumC61137Rfr2;
        EnumC61137Rfr enumC61137Rfr3 = new EnumC61137Rfr("CREDIT_CARD_BINARY", 2);
        A02 = enumC61137Rfr3;
        EnumC61137Rfr enumC61137Rfr4 = new EnumC61137Rfr("OCR_DETECTOR_MODEL", 3);
        A06 = enumC61137Rfr4;
        EnumC61137Rfr enumC61137Rfr5 = new EnumC61137Rfr("OCR_RECOGNIZER_MODEL", 4);
        A07 = enumC61137Rfr5;
        EnumC61137Rfr enumC61137Rfr6 = new EnumC61137Rfr("OCR_CONFIGURATION", 5);
        A05 = enumC61137Rfr6;
        EnumC61137Rfr[] enumC61137RfrArr = {enumC61137Rfr, enumC61137Rfr2, enumC61137Rfr3, enumC61137Rfr4, enumC61137Rfr5, enumC61137Rfr6};
        A01 = enumC61137RfrArr;
        A00 = AbstractC12190kN.A00(enumC61137RfrArr);
    }

    public EnumC61137Rfr(String str, int i) {
    }
}
