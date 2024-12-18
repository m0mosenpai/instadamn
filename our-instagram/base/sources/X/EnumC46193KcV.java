package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46193KcV {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46193KcV[] A03;
    public static final EnumC46193KcV A04;
    public static final EnumC46193KcV A05;
    public final String A00;

    static {
        EnumC46193KcV enumC46193KcV = new EnumC46193KcV("Emoji", 0, "Emoji");
        A05 = enumC46193KcV;
        EnumC46193KcV enumC46193KcV2 = new EnumC46193KcV("Avatar", 1, "Avatar");
        A04 = enumC46193KcV2;
        EnumC46193KcV[] enumC46193KcVArr = {enumC46193KcV, enumC46193KcV2};
        A03 = enumC46193KcVArr;
        A02 = AbstractC12190kN.A00(enumC46193KcVArr);
        EnumC46193KcV[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC46193KcV enumC46193KcV3 : values) {
            A18.put(enumC46193KcV3.A00, enumC46193KcV3);
        }
        A01 = A18;
    }

    public static EnumC46193KcV valueOf(String str) {
        return (EnumC46193KcV) Enum.valueOf(EnumC46193KcV.class, str);
    }

    public static EnumC46193KcV[] values() {
        return (EnumC46193KcV[]) A03.clone();
    }

    public EnumC46193KcV(String str, int i, String str2) {
        this.A00 = str2;
    }
}
