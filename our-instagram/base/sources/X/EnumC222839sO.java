package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222839sO {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC222839sO[] A03;
    public static final EnumC222839sO A04;
    public final String A00;

    static {
        EnumC222839sO enumC222839sO = new EnumC222839sO("SIMPLE_CTA_END_CARD", 0, "simple_cta_end_card");
        A04 = enumC222839sO;
        EnumC222839sO[] enumC222839sOArr = {enumC222839sO, new EnumC222839sO("SIMPLE_CTA_CLOSE_FRIENDS_FACEPILE", 1, "simple_cta_close_friends_facepile")};
        A03 = enumC222839sOArr;
        A02 = AbstractC12190kN.A00(enumC222839sOArr);
        EnumC222839sO[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC222839sO enumC222839sO2 : values) {
            linkedHashMap.put(enumC222839sO2.A00, enumC222839sO2);
        }
        A01 = linkedHashMap;
    }

    public static EnumC222839sO valueOf(String str) {
        return (EnumC222839sO) Enum.valueOf(EnumC222839sO.class, str);
    }

    public static EnumC222839sO[] values() {
        return (EnumC222839sO[]) A03.clone();
    }

    public EnumC222839sO(String str, int i, String str2) {
        this.A00 = str2;
    }
}
