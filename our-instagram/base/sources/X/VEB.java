package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEB {
    public static Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VEB[] A03;
    public static final VEB A04;
    public static final VEB A05;
    public static final VEB A06;
    public static final VEB A07;
    public static final VEB A08;
    public static final VEB A09;
    public static final VEB A0A;
    public static final VEB A0B;
    public static final VEB A0C;
    public static final VEB A0D;
    public static final VEB A0E;
    public static final VEB A0F;
    public static final VEB A0G;
    public static final VEB A0H;
    public final String A00;

    static {
        VEB veb = new VEB("COMMENT_FRICTION", 0, "comment_friction");
        A04 = veb;
        VEB veb2 = new VEB("COMMENT_INFORM_TREATMENT", 1, "comment_inform_treatment");
        A05 = veb2;
        VEB veb3 = new VEB("CONTEXTUAL_FEED", 2, "contextual_feed");
        A06 = veb3;
        VEB veb4 = new VEB("DEEPLINK", 3, "deeplink");
        A07 = veb4;
        VEB veb5 = new VEB("DIRECT_SHARE", 4, "direct_share");
        A08 = veb5;
        VEB veb6 = new VEB("HOUSE_AD", 5, "house_ad");
        A09 = veb6;
        VEB veb7 = new VEB("MAIN_FEED_BANNER", 6, "main_feed_banner");
        A0A = veb7;
        VEB veb8 = new VEB("NOTIFICATION", 7, "notification");
        A0B = veb8;
        VEB veb9 = new VEB("POLITICAL_AD", 8, "political_ad");
        A0C = veb9;
        VEB veb10 = new VEB("PROFILE_SETTINGS", 9, "profile_settings");
        A0D = veb10;
        VEB veb11 = new VEB("QUICK_PROMOTION", 10, "quick_promotion");
        A0E = veb11;
        VEB veb12 = new VEB("STICKER", 11, "sticker");
        A0F = veb12;
        VEB veb13 = new VEB("STORY_SHARE", 12, "story_share");
        A0G = veb13;
        VEB veb14 = new VEB("UNKNOWN", 13, "unknown");
        A0H = veb14;
        VEB[] vebArr = {veb, veb2, veb3, veb4, veb5, veb6, veb7, veb8, veb9, veb10, veb11, veb12, veb13, veb14};
        A03 = vebArr;
        A02 = AbstractC12190kN.A00(vebArr);
        A01 = new HashMap();
        for (VEB veb15 : values()) {
            Map map = A01;
            if (map == null) {
                C14360o3.A0F("reverseMap");
                throw C00O.createAndThrow();
            }
            map.put(veb15.A00, veb15);
        }
    }

    public static VEB valueOf(String str) {
        return (VEB) Enum.valueOf(VEB.class, str);
    }

    public static VEB[] values() {
        return (VEB[]) A03.clone();
    }

    public VEB(String str, int i, String str2) {
        this.A00 = str2;
    }
}
