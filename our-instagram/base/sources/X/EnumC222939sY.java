package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222939sY {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC222939sY[] A03;
    public static final EnumC222939sY A04;
    public static final EnumC222939sY A05;
    public static final EnumC222939sY A06;
    public static final EnumC222939sY A07;
    public static final EnumC222939sY A08;
    public final String A00;

    static {
        EnumC222939sY enumC222939sY = new EnumC222939sY("HORIZONTAL", 0, "HORIZONTAL");
        A05 = enumC222939sY;
        EnumC222939sY enumC222939sY2 = new EnumC222939sY("VERTICAL", 1, "VERTICAL");
        A08 = enumC222939sY2;
        EnumC222939sY enumC222939sY3 = new EnumC222939sY("PICTURE_IN_PICTURE", 2, "PICTURE_IN_PICTURE");
        A07 = enumC222939sY3;
        EnumC222939sY enumC222939sY4 = new EnumC222939sY("GREEN_SCREEN", 3, "GREEN_SCREEN");
        A04 = enumC222939sY4;
        EnumC222939sY enumC222939sY5 = new EnumC222939sY("NOT_CLIPS", 4, "NOT_CLIPS");
        A06 = enumC222939sY5;
        EnumC222939sY[] enumC222939sYArr = {enumC222939sY, enumC222939sY2, enumC222939sY3, enumC222939sY4, enumC222939sY5};
        A03 = enumC222939sYArr;
        A02 = AbstractC12190kN.A00(enumC222939sYArr);
        EnumC222939sY[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC222939sY enumC222939sY6 : values) {
            linkedHashMap.put(enumC222939sY6.A00, enumC222939sY6);
        }
        A01 = linkedHashMap;
    }

    public static EnumC222939sY valueOf(String str) {
        return (EnumC222939sY) Enum.valueOf(EnumC222939sY.class, str);
    }

    public static EnumC222939sY[] values() {
        return (EnumC222939sY[]) A03.clone();
    }

    public EnumC222939sY(String str, int i, String str2) {
        this.A00 = str2;
    }
}
