package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEO {
    public static final Map A02;
    public static final Map A03;
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ VEO[] A05;
    public static final VEO A06;
    public static final VEO A07;
    public static final VEO A08;
    public static final VEO A09;
    public static final VEO A0A;
    public static final VEO A0B;
    public static final VEO A0C;
    public static final VEO A0D;
    public static final VEO A0E;
    public static final VEO A0F;
    public final int A00;
    public final String A01;

    static {
        VEO veo = new VEO("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A0E = veo;
        VEO veo2 = new VEO("RICH_TEXT", 1, 1, "RICH_TEXT");
        A0B = veo2;
        VEO veo3 = new VEO("PHOTO", 2, 2, "PHOTO");
        A0A = veo3;
        VEO veo4 = new VEO("VIDEO", 3, 3, "VIDEO");
        A0F = veo4;
        VEO veo5 = new VEO("HEADER", 4, 4, "HEADER");
        A08 = veo5;
        VEO veo6 = new VEO("FOOTER", 5, 5, "FOOTER");
        A07 = veo6;
        VEO veo7 = new VEO("BUTTON", 6, 6, "BUTTON");
        A06 = veo7;
        VEO veo8 = new VEO("SLIDESHOW", 7, 7, "SLIDESHOW");
        A0C = veo8;
        VEO veo9 = new VEO("SWIPE_TO_OPEN", 8, 8, "SWIPE_TO_OPEN");
        A0D = veo9;
        VEO veo10 = new VEO("INSTAGRAM_PRODUCT", 9, 9, "INSTAGRAM_PRODUCT");
        A09 = veo10;
        VEO[] veoArr = {veo, veo2, veo3, veo4, veo5, veo6, veo7, veo8, veo9, veo10};
        A05 = veoArr;
        A04 = AbstractC12190kN.A00(veoArr);
        A02 = new HashMap();
        A03 = new HashMap();
        for (VEO veo11 : values()) {
            AbstractC25227BEk.A1O(veo11, A02, veo11.A00);
            A03.put(veo11.A01, veo11);
        }
    }

    public static VEO valueOf(String str) {
        return (VEO) Enum.valueOf(VEO.class, str);
    }

    public static VEO[] values() {
        return (VEO[]) A05.clone();
    }

    public VEO(String str, int i, int i2, String str2) {
        this.A00 = i2;
        this.A01 = str2;
    }
}
