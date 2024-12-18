package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39557HdT {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39557HdT[] A03;
    public static final EnumC39557HdT A04;
    public final String A00;

    static {
        EnumC39557HdT enumC39557HdT = new EnumC39557HdT("POSTS", 0, "all_posts");
        A04 = enumC39557HdT;
        EnumC39557HdT[] enumC39557HdTArr = {enumC39557HdT, new EnumC39557HdT("CLIPS", 1, "all_clips")};
        A03 = enumC39557HdTArr;
        A02 = AbstractC12190kN.A00(enumC39557HdTArr);
        EnumC39557HdT[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39557HdT enumC39557HdT2 : values) {
            A18.put(enumC39557HdT2.A00, enumC39557HdT2);
        }
        A01 = A18;
    }

    public static EnumC39557HdT valueOf(String str) {
        return (EnumC39557HdT) Enum.valueOf(EnumC39557HdT.class, str);
    }

    public static EnumC39557HdT[] values() {
        return (EnumC39557HdT[]) A03.clone();
    }

    public EnumC39557HdT(String str, int i, String str2) {
        this.A00 = str2;
    }
}
