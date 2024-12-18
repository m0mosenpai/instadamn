package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33387EpK {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33387EpK[] A03;
    public static final EnumC33387EpK A04;
    public static final EnumC33387EpK A05;
    public final String A00;

    static {
        EnumC33387EpK enumC33387EpK = new EnumC33387EpK("DISMISS", 0, "dismiss");
        A04 = enumC33387EpK;
        EnumC33387EpK enumC33387EpK2 = new EnumC33387EpK("VIEW_REQUESTS", 1, "view_requests");
        A05 = enumC33387EpK2;
        EnumC33387EpK[] enumC33387EpKArr = {enumC33387EpK, enumC33387EpK2, new EnumC33387EpK("OPEN_URL", 2, "open_url")};
        A03 = enumC33387EpKArr;
        A02 = AbstractC12190kN.A00(enumC33387EpKArr);
        EnumC33387EpK[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33387EpK enumC33387EpK3 : values) {
            A18.put(enumC33387EpK3.A00, enumC33387EpK3);
        }
        A01 = A18;
    }

    public static EnumC33387EpK valueOf(String str) {
        return (EnumC33387EpK) Enum.valueOf(EnumC33387EpK.class, str);
    }

    public static EnumC33387EpK[] values() {
        return (EnumC33387EpK[]) A03.clone();
    }

    public EnumC33387EpK(String str, int i, String str2) {
        this.A00 = str2;
    }
}
