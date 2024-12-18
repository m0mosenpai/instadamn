package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68144VDh {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68144VDh[] A03;
    public static final EnumC68144VDh A04;
    public static final EnumC68144VDh A05;
    public static final EnumC68144VDh A06;
    public final String A00;

    public static EnumC68144VDh valueOf(String str) {
        return (EnumC68144VDh) Enum.valueOf(EnumC68144VDh.class, str);
    }

    public static EnumC68144VDh[] values() {
        return (EnumC68144VDh[]) A03.clone();
    }

    static {
        EnumC68144VDh enumC68144VDh = new EnumC68144VDh("LEFT", 0, "left");
        A05 = enumC68144VDh;
        EnumC68144VDh enumC68144VDh2 = new EnumC68144VDh("CENTER", 1, "center");
        A04 = enumC68144VDh2;
        EnumC68144VDh enumC68144VDh3 = new EnumC68144VDh("RIGHT", 2, "right");
        A06 = enumC68144VDh3;
        EnumC68144VDh[] enumC68144VDhArr = {enumC68144VDh, enumC68144VDh2, enumC68144VDh3};
        A03 = enumC68144VDhArr;
        A02 = AbstractC12190kN.A00(enumC68144VDhArr);
        EnumC68144VDh[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68144VDh enumC68144VDh4 : values) {
            linkedHashMap.put(enumC68144VDh4.A00, enumC68144VDh4);
        }
        A01 = linkedHashMap;
    }

    public EnumC68144VDh(String str, int i, String str2) {
        this.A00 = str2;
    }
}
