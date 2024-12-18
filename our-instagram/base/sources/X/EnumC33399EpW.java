package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33399EpW {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33399EpW[] A03;
    public static final EnumC33399EpW A04;
    public static final EnumC33399EpW A05;
    public static final EnumC33399EpW A06;
    public static final EnumC33399EpW A07;
    public static final EnumC33399EpW A08;
    public final String A00;

    static {
        EnumC33399EpW enumC33399EpW = new EnumC33399EpW("PHOTO_BLOCK_GLOBAL", 0, "photo_block_global");
        A06 = enumC33399EpW;
        EnumC33399EpW enumC33399EpW2 = new EnumC33399EpW("PHOTO_BLOCK_ALLOWLIST", 1, "photo_block_allowlist");
        A04 = enumC33399EpW2;
        EnumC33399EpW enumC33399EpW3 = new EnumC33399EpW("PHOTO_BLOCK_BLOCKLIST", 2, "photo_block_blocklist");
        A05 = enumC33399EpW3;
        EnumC33399EpW enumC33399EpW4 = new EnumC33399EpW("SEGMENTED_VIDEO_BLOCK_GLOBAL", 3, "segmented_video_block_global");
        A08 = enumC33399EpW4;
        EnumC33399EpW enumC33399EpW5 = new EnumC33399EpW("SEGMENTED_VIDEO_BLOCK_ALLOWLIST", 4, "segmented_video_block_whitelist");
        A07 = enumC33399EpW5;
        EnumC33399EpW[] enumC33399EpWArr = {enumC33399EpW, enumC33399EpW2, enumC33399EpW3, enumC33399EpW4, enumC33399EpW5, new EnumC33399EpW("SEGMENTED_VIDEO_BLOCK_BLOCKLIST", 5, "segmented_video_block_blacklist")};
        A03 = enumC33399EpWArr;
        A02 = AbstractC12190kN.A00(enumC33399EpWArr);
        EnumC33399EpW[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33399EpW enumC33399EpW6 : values) {
            A18.put(enumC33399EpW6.A00, enumC33399EpW6);
        }
        A01 = A18;
    }

    public static EnumC33399EpW valueOf(String str) {
        return (EnumC33399EpW) Enum.valueOf(EnumC33399EpW.class, str);
    }

    public static EnumC33399EpW[] values() {
        return (EnumC33399EpW[]) A03.clone();
    }

    public EnumC33399EpW(String str, int i, String str2) {
        this.A00 = str2;
    }
}
