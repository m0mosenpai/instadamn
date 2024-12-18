package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68152VDw {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68152VDw[] A03;
    public static final EnumC68152VDw A04;
    public static final EnumC68152VDw A05;
    public static final EnumC68152VDw A06;
    public static final EnumC68152VDw A07;
    public static final EnumC68152VDw A08;
    public final String A00;

    public static EnumC68152VDw valueOf(String str) {
        return (EnumC68152VDw) Enum.valueOf(EnumC68152VDw.class, str);
    }

    public static EnumC68152VDw[] values() {
        return (EnumC68152VDw[]) A03.clone();
    }

    static {
        EnumC68152VDw enumC68152VDw = new EnumC68152VDw("UNKNOWN", 0, "unknown");
        A08 = enumC68152VDw;
        EnumC68152VDw enumC68152VDw2 = new EnumC68152VDw("TEXT", 1, "text");
        A07 = enumC68152VDw2;
        EnumC68152VDw enumC68152VDw3 = new EnumC68152VDw("MUSIC", 2, "music");
        A06 = enumC68152VDw3;
        EnumC68152VDw enumC68152VDw4 = new EnumC68152VDw("LOCATION", 3, "location");
        A05 = enumC68152VDw4;
        EnumC68152VDw enumC68152VDw5 = new EnumC68152VDw("ANON", 4, "anon");
        A04 = enumC68152VDw5;
        EnumC68152VDw[] enumC68152VDwArr = {enumC68152VDw, enumC68152VDw2, enumC68152VDw3, enumC68152VDw4, enumC68152VDw5};
        A03 = enumC68152VDwArr;
        A02 = AbstractC12190kN.A00(enumC68152VDwArr);
        EnumC68152VDw[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68152VDw enumC68152VDw6 : values) {
            linkedHashMap.put(enumC68152VDw6.A00, enumC68152VDw6);
        }
        A01 = linkedHashMap;
    }

    public EnumC68152VDw(String str, int i, String str2) {
        this.A00 = str2;
    }
}
