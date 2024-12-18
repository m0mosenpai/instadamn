package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39576Hdm {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39576Hdm[] A03;
    public static final EnumC39576Hdm A04;
    public static final EnumC39576Hdm A05;
    public static final EnumC39576Hdm A06;
    public static final EnumC39576Hdm A07;
    public static final EnumC39576Hdm A08;
    public static final EnumC39576Hdm A09;
    public final String A00;

    static {
        EnumC39576Hdm enumC39576Hdm = new EnumC39576Hdm("DIRECT_TO_PDP", 0, "direct_to_pdp");
        A04 = enumC39576Hdm;
        EnumC39576Hdm enumC39576Hdm2 = new EnumC39576Hdm("SELECT", 1, "select");
        A07 = enumC39576Hdm2;
        EnumC39576Hdm enumC39576Hdm3 = new EnumC39576Hdm("ROUTE", 2, "route");
        A06 = enumC39576Hdm3;
        EnumC39576Hdm enumC39576Hdm4 = new EnumC39576Hdm("TOAST", 3, "toast");
        A08 = enumC39576Hdm4;
        EnumC39576Hdm enumC39576Hdm5 = new EnumC39576Hdm("MULTI_SELECT", 4, "multi_select");
        A05 = enumC39576Hdm5;
        EnumC39576Hdm enumC39576Hdm6 = new EnumC39576Hdm("UNKNOWN", 5, "unknown");
        A09 = enumC39576Hdm6;
        EnumC39576Hdm[] enumC39576HdmArr = {enumC39576Hdm, enumC39576Hdm2, enumC39576Hdm3, enumC39576Hdm4, enumC39576Hdm5, enumC39576Hdm6};
        A03 = enumC39576HdmArr;
        A02 = AbstractC12190kN.A00(enumC39576HdmArr);
        EnumC39576Hdm[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39576Hdm enumC39576Hdm7 : values) {
            A18.put(enumC39576Hdm7.A00, enumC39576Hdm7);
        }
        A01 = A18;
    }

    public static EnumC39576Hdm valueOf(String str) {
        return (EnumC39576Hdm) Enum.valueOf(EnumC39576Hdm.class, str);
    }

    public static EnumC39576Hdm[] values() {
        return (EnumC39576Hdm[]) A03.clone();
    }

    public EnumC39576Hdm(String str, int i, String str2) {
        this.A00 = str2;
    }
}
