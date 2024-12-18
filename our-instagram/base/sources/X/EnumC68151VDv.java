package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68151VDv {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68151VDv[] A03;
    public static final EnumC68151VDv A04;
    public static final EnumC68151VDv A05;
    public static final EnumC68151VDv A06;
    public static final EnumC68151VDv A07;
    public static final EnumC68151VDv A08;
    public final String A00;

    public static EnumC68151VDv valueOf(String str) {
        return (EnumC68151VDv) Enum.valueOf(EnumC68151VDv.class, str);
    }

    public static EnumC68151VDv[] values() {
        return (EnumC68151VDv[]) A03.clone();
    }

    static {
        EnumC68151VDv enumC68151VDv = new EnumC68151VDv("UNKNOWN", 0, "unknown");
        A08 = enumC68151VDv;
        EnumC68151VDv enumC68151VDv2 = new EnumC68151VDv("TEXT", 1, "text");
        A07 = enumC68151VDv2;
        EnumC68151VDv enumC68151VDv3 = new EnumC68151VDv("MUSIC", 2, "music");
        A06 = enumC68151VDv3;
        EnumC68151VDv enumC68151VDv4 = new EnumC68151VDv("MEDIA", 3, "media");
        A05 = enumC68151VDv4;
        EnumC68151VDv enumC68151VDv5 = new EnumC68151VDv("LOCATION", 4, "location");
        A04 = enumC68151VDv5;
        EnumC68151VDv[] enumC68151VDvArr = {enumC68151VDv, enumC68151VDv2, enumC68151VDv3, enumC68151VDv4, enumC68151VDv5};
        A03 = enumC68151VDvArr;
        A02 = AbstractC12190kN.A00(enumC68151VDvArr);
        EnumC68151VDv[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68151VDv enumC68151VDv6 : values) {
            linkedHashMap.put(enumC68151VDv6.A00, enumC68151VDv6);
        }
        A01 = linkedHashMap;
    }

    public EnumC68151VDv(String str, int i, String str2) {
        this.A00 = str2;
    }
}
