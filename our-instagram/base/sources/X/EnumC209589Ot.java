package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9Ot, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC209589Ot {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC209589Ot[] A03;
    public static final EnumC209589Ot A04;
    public static final EnumC209589Ot A05;
    public final String A00;

    static {
        EnumC209589Ot enumC209589Ot = new EnumC209589Ot("STORY", 0, "STORY");
        A05 = enumC209589Ot;
        EnumC209589Ot enumC209589Ot2 = new EnumC209589Ot("CLIPS", 1, "CLIPS");
        A04 = enumC209589Ot2;
        EnumC209589Ot[] enumC209589OtArr = {enumC209589Ot, enumC209589Ot2};
        A03 = enumC209589OtArr;
        A02 = AbstractC12190kN.A00(enumC209589OtArr);
        EnumC209589Ot[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC209589Ot enumC209589Ot3 : values) {
            linkedHashMap.put(enumC209589Ot3.A00, enumC209589Ot3);
        }
        A01 = linkedHashMap;
    }

    public static EnumC209589Ot valueOf(String str) {
        return (EnumC209589Ot) Enum.valueOf(EnumC209589Ot.class, str);
    }

    public static EnumC209589Ot[] values() {
        return (EnumC209589Ot[]) A03.clone();
    }

    public EnumC209589Ot(String str, int i, String str2) {
        this.A00 = str2;
    }
}
