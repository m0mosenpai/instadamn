package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68140VDd {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68140VDd[] A03;
    public static final EnumC68140VDd A04;
    public static final EnumC68140VDd A05;
    public static final EnumC68140VDd A06;
    public final int A00;

    static {
        EnumC68140VDd enumC68140VDd = new EnumC68140VDd("ALL", 0, 0);
        A04 = enumC68140VDd;
        EnumC68140VDd enumC68140VDd2 = new EnumC68140VDd("DIAGONAL", 1, 1);
        A06 = enumC68140VDd2;
        EnumC68140VDd enumC68140VDd3 = new EnumC68140VDd("ANTI_DIAGONAL", 2, 2);
        A05 = enumC68140VDd3;
        EnumC68140VDd[] enumC68140VDdArr = {enumC68140VDd, enumC68140VDd2, enumC68140VDd3, new EnumC68140VDd("PLAY_TOP_POSITION_ONLY", 3, 3)};
        A03 = enumC68140VDdArr;
        A02 = AbstractC12190kN.A00(enumC68140VDdArr);
        EnumC68140VDd[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68140VDd enumC68140VDd4 : values) {
            AbstractC25227BEk.A1O(enumC68140VDd4, linkedHashMap, enumC68140VDd4.A00);
        }
        A01 = linkedHashMap;
    }

    public static EnumC68140VDd valueOf(String str) {
        return (EnumC68140VDd) Enum.valueOf(EnumC68140VDd.class, str);
    }

    public static EnumC68140VDd[] values() {
        return (EnumC68140VDd[]) A03.clone();
    }

    public EnumC68140VDd(String str, int i, int i2) {
        this.A00 = i2;
    }
}
