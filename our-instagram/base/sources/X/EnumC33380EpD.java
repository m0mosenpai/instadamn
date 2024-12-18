package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33380EpD {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33380EpD[] A03;
    public static final EnumC33380EpD A04;
    public final String A00 = "CLIPS_PLAYLIST";

    static {
        EnumC33380EpD enumC33380EpD = new EnumC33380EpD();
        A04 = enumC33380EpD;
        EnumC33380EpD[] enumC33380EpDArr = {enumC33380EpD};
        A03 = enumC33380EpDArr;
        A02 = AbstractC12190kN.A00(enumC33380EpDArr);
        EnumC33380EpD[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33380EpD enumC33380EpD2 : values) {
            A18.put(enumC33380EpD2.A00, enumC33380EpD2);
        }
        A01 = A18;
    }

    public static EnumC33380EpD valueOf(String str) {
        return (EnumC33380EpD) Enum.valueOf(EnumC33380EpD.class, str);
    }

    public static EnumC33380EpD[] values() {
        return (EnumC33380EpD[]) A03.clone();
    }
}
