package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39555HdR {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39555HdR[] A03;
    public static final EnumC39555HdR A04;
    public final String A00;

    static {
        EnumC39555HdR enumC39555HdR = new EnumC39555HdR("SOCIAL_CONTEXT", 0, "social_context");
        A04 = enumC39555HdR;
        EnumC39555HdR[] enumC39555HdRArr = {enumC39555HdR, new EnumC39555HdR("NUM_MEDIA", 1, "num_media")};
        A03 = enumC39555HdRArr;
        A02 = AbstractC12190kN.A00(enumC39555HdRArr);
        EnumC39555HdR[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39555HdR enumC39555HdR2 : values) {
            A18.put(enumC39555HdR2.A00, enumC39555HdR2);
        }
        A01 = A18;
    }

    public static EnumC39555HdR valueOf(String str) {
        return (EnumC39555HdR) Enum.valueOf(EnumC39555HdR.class, str);
    }

    public static EnumC39555HdR[] values() {
        return (EnumC39555HdR[]) A03.clone();
    }

    public EnumC39555HdR(String str, int i, String str2) {
        this.A00 = str2;
    }
}
