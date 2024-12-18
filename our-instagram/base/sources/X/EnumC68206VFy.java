package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VFy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68206VFy {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68206VFy[] A03;
    public static final EnumC68206VFy A04;
    public static final EnumC68206VFy A05;
    public static final EnumC68206VFy A06;
    public static final EnumC68206VFy A07;
    public static final EnumC68206VFy A08;
    public static final EnumC68206VFy A09;
    public static final EnumC68206VFy A0A;
    public final String A00;

    static {
        EnumC68206VFy enumC68206VFy = new EnumC68206VFy("UNSPECIFIED", 0, "unspecified");
        A0A = enumC68206VFy;
        EnumC68206VFy enumC68206VFy2 = new EnumC68206VFy("TOP", 1, "top");
        A08 = enumC68206VFy2;
        EnumC68206VFy enumC68206VFy3 = new EnumC68206VFy("TOP_RECENT", 2, "top_w_recent_filter");
        A09 = enumC68206VFy3;
        EnumC68206VFy enumC68206VFy4 = new EnumC68206VFy("RECENT", 3, "recent");
        A07 = enumC68206VFy4;
        EnumC68206VFy enumC68206VFy5 = new EnumC68206VFy("CLIPS", 4, "clips");
        A05 = enumC68206VFy5;
        EnumC68206VFy enumC68206VFy6 = new EnumC68206VFy("IGTV", 5, "igtv");
        A06 = enumC68206VFy6;
        EnumC68206VFy enumC68206VFy7 = new EnumC68206VFy("ACCOUNT", 6, "account");
        A04 = enumC68206VFy7;
        EnumC68206VFy[] enumC68206VFyArr = {enumC68206VFy, enumC68206VFy2, enumC68206VFy3, enumC68206VFy4, enumC68206VFy5, enumC68206VFy6, enumC68206VFy7};
        A03 = enumC68206VFyArr;
        A02 = AbstractC12190kN.A00(enumC68206VFyArr);
        EnumC68206VFy[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68206VFy enumC68206VFy8 : values) {
            linkedHashMap.put(enumC68206VFy8.A00, enumC68206VFy8);
        }
        A01 = linkedHashMap;
    }

    public static EnumC68206VFy valueOf(String str) {
        return (EnumC68206VFy) Enum.valueOf(EnumC68206VFy.class, str);
    }

    public static EnumC68206VFy[] values() {
        return (EnumC68206VFy[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC68206VFy(String str, int i, String str2) {
        this.A00 = str2;
    }
}
