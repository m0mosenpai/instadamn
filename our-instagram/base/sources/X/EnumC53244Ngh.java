package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53244Ngh {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53244Ngh[] A03;
    public static final EnumC53244Ngh A04;
    public static final EnumC53244Ngh A05;
    public static final EnumC53244Ngh A06;
    public static final EnumC53244Ngh A07;
    public static final EnumC53244Ngh A08;
    public static final EnumC53244Ngh A09;
    public static final EnumC53244Ngh A0A;
    public static final EnumC53244Ngh A0B;
    public static final EnumC53244Ngh A0C;
    public static final EnumC53244Ngh A0D;
    public static final EnumC53244Ngh A0E;
    public static final EnumC53244Ngh A0F;
    public static final EnumC53244Ngh A0G;
    public final String A00;

    static {
        EnumC53244Ngh enumC53244Ngh = new EnumC53244Ngh("IGT", 0, "IGT");
        A0A = enumC53244Ngh;
        EnumC53244Ngh enumC53244Ngh2 = new EnumC53244Ngh("LVI", 1, "LVI");
        A0G = enumC53244Ngh2;
        EnumC53244Ngh enumC53244Ngh3 = new EnumC53244Ngh("LVG", 2, "LVG");
        A0F = enumC53244Ngh3;
        EnumC53244Ngh enumC53244Ngh4 = new EnumC53244Ngh("IAC", 3, "IAC");
        A05 = enumC53244Ngh4;
        EnumC53244Ngh enumC53244Ngh5 = new EnumC53244Ngh("IGF", 4, "IGF");
        A08 = enumC53244Ngh5;
        EnumC53244Ngh enumC53244Ngh6 = new EnumC53244Ngh("ITB", 5, "ITB");
        A0E = enumC53244Ngh6;
        EnumC53244Ngh enumC53244Ngh7 = new EnumC53244Ngh("ISI", 6, "ISI");
        A0D = enumC53244Ngh7;
        EnumC53244Ngh enumC53244Ngh8 = new EnumC53244Ngh("IBC", 7, "IBC");
        A07 = enumC53244Ngh8;
        EnumC53244Ngh enumC53244Ngh9 = new EnumC53244Ngh("IBB", 8, "IBB");
        A06 = enumC53244Ngh9;
        EnumC53244Ngh enumC53244Ngh10 = new EnumC53244Ngh("IOO", 9, "IOO");
        A0C = enumC53244Ngh10;
        EnumC53244Ngh enumC53244Ngh11 = new EnumC53244Ngh("IOA", 10, "IOA");
        A0B = enumC53244Ngh11;
        EnumC53244Ngh enumC53244Ngh12 = new EnumC53244Ngh("GTI", 11, "GTI");
        A04 = enumC53244Ngh12;
        EnumC53244Ngh enumC53244Ngh13 = new EnumC53244Ngh("IGS", 12, "IGS");
        A09 = enumC53244Ngh13;
        EnumC53244Ngh[] enumC53244NghArr = {enumC53244Ngh, enumC53244Ngh2, enumC53244Ngh3, enumC53244Ngh4, enumC53244Ngh5, enumC53244Ngh6, enumC53244Ngh7, enumC53244Ngh8, enumC53244Ngh9, enumC53244Ngh10, enumC53244Ngh11, enumC53244Ngh12, enumC53244Ngh13};
        A03 = enumC53244NghArr;
        A02 = AbstractC12190kN.A00(enumC53244NghArr);
        EnumC53244Ngh[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53244Ngh enumC53244Ngh14 : values) {
            A18.put(enumC53244Ngh14.A00, enumC53244Ngh14);
        }
        A01 = A18;
    }

    public static EnumC53244Ngh valueOf(String str) {
        return (EnumC53244Ngh) Enum.valueOf(EnumC53244Ngh.class, str);
    }

    public static EnumC53244Ngh[] values() {
        return (EnumC53244Ngh[]) A03.clone();
    }

    public EnumC53244Ngh(String str, int i, String str2) {
        this.A00 = str2;
    }
}
