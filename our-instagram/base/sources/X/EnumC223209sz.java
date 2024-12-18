package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated(message = "")
/* renamed from: X.9sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223209sz {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC223209sz[] A03;
    public static final EnumC223209sz A04;
    public static final EnumC223209sz A05;
    public static final EnumC223209sz A06;
    public static final EnumC223209sz A07;
    public static final EnumC223209sz A08;
    public static final EnumC223209sz A09;
    public static final EnumC223209sz A0A;
    public static final EnumC223209sz A0B;
    public static final EnumC223209sz A0C;
    public static final EnumC223209sz A0D;
    public static final EnumC223209sz A0E;
    public static final EnumC223209sz A0F;
    public final String A00;

    static {
        EnumC223209sz enumC223209sz = new EnumC223209sz("NORMAL", 0, "normal");
        A0D = enumC223209sz;
        EnumC223209sz enumC223209sz2 = new EnumC223209sz("TEXT", 1, "text");
        A0F = enumC223209sz2;
        EnumC223209sz enumC223209sz3 = new EnumC223209sz("LIVE", 2, "live");
        A0A = enumC223209sz3;
        EnumC223209sz enumC223209sz4 = new EnumC223209sz("FEED", 3, "feed");
        A06 = enumC223209sz4;
        EnumC223209sz enumC223209sz5 = new EnumC223209sz("BOOMERANG", 4, "boomerang");
        A04 = enumC223209sz5;
        EnumC223209sz enumC223209sz6 = new EnumC223209sz("HANDS_FREE", 5, "hands_free");
        A08 = enumC223209sz6;
        EnumC223209sz enumC223209sz7 = new EnumC223209sz("IGTV_CAMERA", 6, "igtv");
        A09 = enumC223209sz7;
        EnumC223209sz enumC223209sz8 = new EnumC223209sz("FOCUS", 7, "focus");
        A07 = enumC223209sz8;
        EnumC223209sz enumC223209sz9 = new EnumC223209sz("MUSIC", 8, "music");
        A0C = enumC223209sz9;
        EnumC223209sz enumC223209sz10 = new EnumC223209sz("CLOSE_FRIENDS", 9, "closefriends");
        A05 = enumC223209sz10;
        EnumC223209sz enumC223209sz11 = new EnumC223209sz("STOPMOTION", 10, "stopmotion");
        A0E = enumC223209sz11;
        EnumC223209sz enumC223209sz12 = new EnumC223209sz("MULTICAPTURE", 11, "multicapture");
        A0B = enumC223209sz12;
        EnumC223209sz[] enumC223209szArr = {enumC223209sz, enumC223209sz2, enumC223209sz3, enumC223209sz4, enumC223209sz5, enumC223209sz6, enumC223209sz7, enumC223209sz8, enumC223209sz9, enumC223209sz10, enumC223209sz11, enumC223209sz12, new EnumC223209sz("LAYOUT", 12, "layout")};
        A03 = enumC223209szArr;
        A02 = AbstractC12190kN.A00(enumC223209szArr);
        EnumC223209sz[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC223209sz enumC223209sz13 : values) {
            linkedHashMap.put(AbstractC167007dF.A0h(enumC223209sz13.A00), enumC223209sz13);
        }
        A01 = linkedHashMap;
    }

    public static EnumC223209sz valueOf(String str) {
        return (EnumC223209sz) Enum.valueOf(EnumC223209sz.class, str);
    }

    public static EnumC223209sz[] values() {
        return (EnumC223209sz[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC223209sz(String str, int i, String str2) {
        this.A00 = str2;
    }
}
