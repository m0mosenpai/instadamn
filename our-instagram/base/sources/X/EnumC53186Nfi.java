package X;

import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53186Nfi {
    public static final Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53186Nfi[] A02;
    public static final EnumC53186Nfi A03;
    public static final EnumC53186Nfi A04;
    public static final EnumC53186Nfi A05;
    public static final EnumC53186Nfi A06;
    public static final EnumC53186Nfi A07;
    public static final EnumC53186Nfi A08;
    public static final EnumC53186Nfi A09;
    public static final EnumC53186Nfi A0A;
    public static final EnumC53186Nfi A0B;

    static {
        EnumC53186Nfi enumC53186Nfi = new EnumC53186Nfi("Incoming", 0);
        A04 = enumC53186Nfi;
        EnumC53186Nfi enumC53186Nfi2 = new EnumC53186Nfi("Outgoing", 1);
        A09 = enumC53186Nfi2;
        EnumC53186Nfi enumC53186Nfi3 = new EnumC53186Nfi("Ongoing", 2);
        A08 = enumC53186Nfi3;
        EnumC53186Nfi enumC53186Nfi4 = new EnumC53186Nfi("Left", 3);
        A06 = enumC53186Nfi4;
        EnumC53186Nfi enumC53186Nfi5 = new EnumC53186Nfi("Ended", 4);
        A03 = enumC53186Nfi5;
        EnumC53186Nfi enumC53186Nfi6 = new EnumC53186Nfi("Missed", 5);
        A07 = enumC53186Nfi6;
        EnumC53186Nfi enumC53186Nfi7 = new EnumC53186Nfi("Scheduled", 6);
        A0A = enumC53186Nfi7;
        EnumC53186Nfi enumC53186Nfi8 = new EnumC53186Nfi("IncomingTransfer", 7);
        A05 = enumC53186Nfi8;
        EnumC53186Nfi enumC53186Nfi9 = new EnumC53186Nfi("Unknown", 8);
        A0B = enumC53186Nfi9;
        EnumC53186Nfi[] enumC53186NfiArr = {enumC53186Nfi, enumC53186Nfi2, enumC53186Nfi3, enumC53186Nfi4, enumC53186Nfi5, enumC53186Nfi6, enumC53186Nfi7, enumC53186Nfi8, enumC53186Nfi9};
        A02 = enumC53186NfiArr;
        A01 = AbstractC12190kN.A00(enumC53186NfiArr);
        A00 = AbstractC06930Yk.A06(AbstractC166987dD.A1L(enumC53186Nfi, AbstractC16960so.A1Q(enumC53186Nfi3, enumC53186Nfi6, enumC53186Nfi5, enumC53186Nfi4)), AbstractC166987dD.A1L(enumC53186Nfi8, AbstractC16960so.A1Q(enumC53186Nfi3, enumC53186Nfi6, enumC53186Nfi5, enumC53186Nfi4)), AbstractC166987dD.A1L(enumC53186Nfi2, AbstractC16960so.A1Q(enumC53186Nfi3, enumC53186Nfi5)), AbstractC166987dD.A1L(enumC53186Nfi3, AbstractC16960so.A1Q(enumC53186Nfi4, enumC53186Nfi5)), AbstractC166987dD.A1L(enumC53186Nfi4, AbstractC16960so.A1Q(enumC53186Nfi3, enumC53186Nfi5, enumC53186Nfi8)), AbstractC166987dD.A1L(enumC53186Nfi5, AbstractC16960so.A1Q(enumC53186Nfi6, enumC53186Nfi, enumC53186Nfi8, enumC53186Nfi5)));
    }

    public static EnumC53186Nfi valueOf(String str) {
        return (EnumC53186Nfi) Enum.valueOf(EnumC53186Nfi.class, str);
    }

    public static EnumC53186Nfi[] values() {
        return (EnumC53186Nfi[]) A02.clone();
    }

    public EnumC53186Nfi(String str, int i) {
    }
}
