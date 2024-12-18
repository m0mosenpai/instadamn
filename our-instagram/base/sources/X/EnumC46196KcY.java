package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46196KcY {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46196KcY[] A03;
    public static final EnumC46196KcY A04;
    public static final EnumC46196KcY A05;
    public static final EnumC46196KcY A06;
    public final String A00;

    static {
        EnumC46196KcY enumC46196KcY = new EnumC46196KcY("EMOJIS_AND_STICKER_SET", 0, "emojis_and_sticker_set");
        A04 = enumC46196KcY;
        EnumC46196KcY enumC46196KcY2 = new EnumC46196KcY("RECENT_EMOJIS_AND_STICKER_SET", 1, "recent_emojis_and_sticker_set");
        A05 = enumC46196KcY2;
        EnumC46196KcY enumC46196KcY3 = new EnumC46196KcY("RECENT_NAMETAG_EMOJIS_SET", 2, "recent_nametag_emojis_set");
        A06 = enumC46196KcY3;
        EnumC46196KcY[] enumC46196KcYArr = {enumC46196KcY, enumC46196KcY2, enumC46196KcY3};
        A03 = enumC46196KcYArr;
        A02 = AbstractC12190kN.A00(enumC46196KcYArr);
        EnumC46196KcY[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC46196KcY enumC46196KcY4 : values) {
            A18.put(enumC46196KcY4.A00, enumC46196KcY4);
        }
        A01 = A18;
    }

    public static EnumC46196KcY valueOf(String str) {
        return (EnumC46196KcY) Enum.valueOf(EnumC46196KcY.class, str);
    }

    public static EnumC46196KcY[] values() {
        return (EnumC46196KcY[]) A03.clone();
    }

    public EnumC46196KcY(String str, int i, String str2) {
        this.A00 = str2;
    }
}
