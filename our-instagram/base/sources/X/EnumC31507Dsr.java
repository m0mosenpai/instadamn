package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Dsr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31507Dsr {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC31507Dsr[] A03;
    public static final EnumC31507Dsr A04;
    public static final EnumC31507Dsr A05;
    public static final EnumC31507Dsr A06;
    public static final EnumC31507Dsr A07;
    public final int A00;

    static {
        EnumC31507Dsr enumC31507Dsr = new EnumC31507Dsr("UNKNOWN", 0, 0);
        A07 = enumC31507Dsr;
        EnumC31507Dsr enumC31507Dsr2 = new EnumC31507Dsr("NEW", 1, 1);
        A04 = enumC31507Dsr2;
        EnumC31507Dsr enumC31507Dsr3 = new EnumC31507Dsr("RENEW", 2, 2);
        A05 = enumC31507Dsr3;
        EnumC31507Dsr enumC31507Dsr4 = new EnumC31507Dsr("RESURRECTED", 3, 3);
        A06 = enumC31507Dsr4;
        EnumC31507Dsr[] enumC31507DsrArr = {enumC31507Dsr, enumC31507Dsr2, enumC31507Dsr3, enumC31507Dsr4};
        A03 = enumC31507DsrArr;
        A02 = AbstractC12190kN.A00(enumC31507DsrArr);
        EnumC31507Dsr[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC31507Dsr enumC31507Dsr5 : values) {
            A18.put(Integer.valueOf(enumC31507Dsr5.A00), enumC31507Dsr5);
        }
        A01 = A18;
    }

    public static EnumC31507Dsr valueOf(String str) {
        return (EnumC31507Dsr) Enum.valueOf(EnumC31507Dsr.class, str);
    }

    public static EnumC31507Dsr[] values() {
        return (EnumC31507Dsr[]) A03.clone();
    }

    public EnumC31507Dsr(String str, int i, int i2) {
        this.A00 = i2;
    }
}
