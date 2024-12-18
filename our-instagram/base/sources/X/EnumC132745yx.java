package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC132745yx {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC132745yx[] A03;
    public static final EnumC132745yx A04;
    public static final EnumC132745yx A05;
    public final String A00;

    static {
        EnumC132745yx enumC132745yx = new EnumC132745yx("SIMPLE_BOLD", 0, "simple_bold");
        A04 = enumC132745yx;
        EnumC132745yx enumC132745yx2 = new EnumC132745yx("WITH_IMAGE_AND_CONTEXT", 1, "with_image_and_context");
        A05 = enumC132745yx2;
        EnumC132745yx[] enumC132745yxArr = {enumC132745yx, enumC132745yx2};
        A03 = enumC132745yxArr;
        A02 = AbstractC12190kN.A00(enumC132745yxArr);
        EnumC132745yx[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC132745yx enumC132745yx3 : values) {
            linkedHashMap.put(enumC132745yx3.A00, enumC132745yx3);
        }
        A01 = linkedHashMap;
    }

    public static EnumC132745yx valueOf(String str) {
        return (EnumC132745yx) Enum.valueOf(EnumC132745yx.class, str);
    }

    public static EnumC132745yx[] values() {
        return (EnumC132745yx[]) A03.clone();
    }

    public EnumC132745yx(String str, int i, String str2) {
        this.A00 = str2;
    }
}
