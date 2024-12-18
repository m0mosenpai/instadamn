package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC59012mz {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC59012mz[] A03;
    public static final EnumC59012mz A04;
    public static final EnumC59012mz A05;
    public static final EnumC59012mz A06;
    public static final EnumC59012mz A07;
    public static final EnumC59012mz A08;
    public static final EnumC59012mz A09;
    public static final EnumC59012mz A0A;
    public static final EnumC59012mz A0B;
    public static final EnumC59012mz A0C;
    public final String A00;

    static {
        EnumC59012mz enumC59012mz = new EnumC59012mz("INAPPLICABLE", 0, "-2");
        A0B = enumC59012mz;
        EnumC59012mz enumC59012mz2 = new EnumC59012mz("UNKNOWN", 1, "-1");
        A0C = enumC59012mz2;
        EnumC59012mz enumC59012mz3 = new EnumC59012mz("EVERSTORE_IGPHOTO_BLOB", 2, "2885");
        A04 = enumC59012mz3;
        EnumC59012mz enumC59012mz4 = new EnumC59012mz("EVERSTORE_IGVIDEO_BLOB", 3, "2886");
        A05 = enumC59012mz4;
        EnumC59012mz enumC59012mz5 = new EnumC59012mz("EVERSTORE_PRODUCT_IMAGE_BLOB", 4, "5328");
        A0A = enumC59012mz5;
        EnumC59012mz enumC59012mz6 = new EnumC59012mz("EVERSTORE_IG_REEL_PHOTO", 5, "9792");
        A06 = enumC59012mz6;
        EnumC59012mz enumC59012mz7 = new EnumC59012mz("EVERSTORE_IG_REEL_VIDEO", 6, "9793");
        A08 = enumC59012mz7;
        EnumC59012mz enumC59012mz8 = new EnumC59012mz("EVERSTORE_IG_REEL_VIDEO_PERM", 7, "12441");
        A09 = enumC59012mz8;
        EnumC59012mz enumC59012mz9 = new EnumC59012mz("EVERSTORE_IG_REEL_PHOTO_PERM", 8, "12442");
        A07 = enumC59012mz9;
        EnumC59012mz[] enumC59012mzArr = {enumC59012mz, enumC59012mz2, enumC59012mz3, enumC59012mz4, enumC59012mz5, enumC59012mz6, enumC59012mz7, enumC59012mz8, enumC59012mz9, new EnumC59012mz("EVERSTORE_IG_REEL_VIDEO_2DAY", 9, "14836")};
        A03 = enumC59012mzArr;
        A02 = AbstractC12190kN.A00(enumC59012mzArr);
        EnumC59012mz[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC59012mz enumC59012mz10 : values) {
            linkedHashMap.put(enumC59012mz10.A00, enumC59012mz10);
        }
        A01 = linkedHashMap;
    }

    public static EnumC59012mz valueOf(String str) {
        return (EnumC59012mz) Enum.valueOf(EnumC59012mz.class, str);
    }

    public static EnumC59012mz[] values() {
        return (EnumC59012mz[]) A03.clone();
    }

    public EnumC59012mz(String str, int i, String str2) {
        this.A00 = str2;
    }
}
