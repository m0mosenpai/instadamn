package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39561HdX {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39561HdX[] A03;
    public static final EnumC39561HdX A04;
    public static final EnumC39561HdX A05;
    public final String A00;

    static {
        EnumC39561HdX enumC39561HdX = new EnumC39561HdX("VIEWER", 0, "viewer");
        A05 = enumC39561HdX;
        EnumC39561HdX enumC39561HdX2 = new EnumC39561HdX("CHANNEL", 1, "channel");
        A04 = enumC39561HdX2;
        EnumC39561HdX[] enumC39561HdXArr = {enumC39561HdX, enumC39561HdX2, new EnumC39561HdX("UNRECOGNIZED", 2, "unrecognized")};
        A03 = enumC39561HdXArr;
        A02 = AbstractC12190kN.A00(enumC39561HdXArr);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        for (EnumC39561HdX enumC39561HdX3 : values()) {
            A1I.put(enumC39561HdX3.A00, enumC39561HdX3);
        }
        A01 = A1I;
    }

    public static EnumC39561HdX valueOf(String str) {
        return (EnumC39561HdX) Enum.valueOf(EnumC39561HdX.class, str);
    }

    public static EnumC39561HdX[] values() {
        return (EnumC39561HdX[]) A03.clone();
    }

    public EnumC39561HdX(String str, int i, String str2) {
        this.A00 = str2;
    }
}
