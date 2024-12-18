package X;

import java.util.Map;

/* renamed from: X.8rx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC199508rx {
    public static final Map A00;
    public static final Map A01;

    public static final int A00(String str) {
        C14360o3.A0B(str, 0);
        Number number = (Number) A01.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    static {
        C09530e4[] c09530e4Arr = new C09530e4[64];
        System.arraycopy(new C09530e4[]{new C09530e4(0, "normal"), new C09530e4(112, "clarendon"), new C09530e4(114, "gingham"), new C09530e4(111, "moon"), new C09530e4(615, "lark"), new C09530e4(614, "reyes"), new C09530e4(613, "juno"), new C09530e4(605, "slumber"), new C09530e4(616, "crema"), new C09530e4(603, "ludwig"), new C09530e4(612, "aden"), new C09530e4(608, "perpetua"), new C09530e4(24, "amaro"), new C09530e4(17, "mayfair"), new C09530e4(23, "rise"), new C09530e4(25, "valencia"), new C09530e4(1, "xpro2"), new C09530e4(27, "sierra"), new C09530e4(28, "willow"), new C09530e4(2, "lo_fi"), new C09530e4(10, "inkwell"), new C09530e4(15, "nashville"), new C09530e4(753, "gradient_transform"), new C09530e4(803, "enhance"), new C09530e4(702, "dramatic_bw"), new C09530e4(706, "crystal_clear"), new C09530e4(705, "cinema_blue")}, 0, c09530e4Arr, 0, 27);
        System.arraycopy(new C09530e4[]{new C09530e4(703, "cinema_red"), new C09530e4(707, "vintage"), new C09530e4(710, "pastel_sky"), new C09530e4(709, "pastel_pink"), new C09530e4(642, "crazy_color"), new C09530e4(643, "subtle_color"), new C09530e4(640, "bright_contrast"), new C09530e4(816, "split_screen"), new C09530e4(810, "paris"), new C09530e4(813, "los_angeles"), new C09530e4(-3, "image_overlay"), new C09530e4(1010, "hyper"), new C09530e4(1011, "rosy"), new C09530e4(1012, "emerald"), new C09530e4(1013, "midnight"), new C09530e4(1000, "fade"), new C09530e4(1001, "fade_warm"), new C09530e4(1002, "fade_cool"), new C09530e4(1003, "subtle"), new C09530e4(1004, "subtle_warm"), new C09530e4(1005, "subtle_cool"), new C09530e4(1006, "boost"), new C09530e4(1007, "boost_warm"), new C09530e4(1008, "boost_cool"), new C09530e4(1009, "grayscale"), new C09530e4(1100, "grainy"), new C09530e4(1101, "gritty")}, 0, c09530e4Arr, 27, 27);
        System.arraycopy(new C09530e4[]{new C09530e4(1102, "halo"), new C09530e4(1103, "color_leak"), new C09530e4(1104, "soft_light"), new C09530e4(1105, "zoom_blur"), new C09530e4(1106, "handheld"), new C09530e4(1107, "moire"), new C09530e4(1108, "lo_res"), new C09530e4(1109, "wavy"), new C09530e4(1110, "wide_angle"), new C09530e4(1112, "color_grading")}, 0, c09530e4Arr, 54, 10);
        A00 = AbstractC06930Yk.A06(c09530e4Arr);
        C09530e4[] c09530e4Arr2 = new C09530e4[64];
        System.arraycopy(new C09530e4[]{new C09530e4("normal", 0), new C09530e4("clarendon", 112), new C09530e4("gingham", 114), new C09530e4("moon", 111), new C09530e4("lark", 615), new C09530e4("reyes", 614), new C09530e4("juno", 613), new C09530e4("slumber", 605), new C09530e4("crema", 616), new C09530e4("ludwig", 603), new C09530e4("aden", 612), new C09530e4("perpetua", 608), new C09530e4("amaro", 24), new C09530e4("mayfair", 17), new C09530e4("rise", 23), new C09530e4("valencia", 25), new C09530e4("xpro2", 1), new C09530e4("sierra", 27), new C09530e4("willow", 28), new C09530e4("lo_fi", 2), new C09530e4("inkwell", 10), new C09530e4("nashville", 15), new C09530e4("gradient_transform", 753), new C09530e4("enhance", 803), new C09530e4("dramatic_bw", 702), new C09530e4("crystal_clear", 706), new C09530e4("cinema_blue", 705)}, 0, c09530e4Arr2, 0, 27);
        System.arraycopy(new C09530e4[]{new C09530e4("cinema_red", 703), new C09530e4("vintage", 707), new C09530e4("pastel_sky", 710), new C09530e4("pastel_pink", 709), new C09530e4("crazy_color", 642), new C09530e4("subtle_color", 643), new C09530e4("bright_contrast", 640), new C09530e4("split_screen", 816), new C09530e4("paris", 810), new C09530e4("los_angeles", 813), new C09530e4("image_overlay", -3), new C09530e4("hyper", 1010), new C09530e4("rosy", 1011), new C09530e4("emerald", 1012), new C09530e4("midnight", 1013), new C09530e4("fade", 1000), new C09530e4("fade_warm", 1001), new C09530e4("fade_cool", 1002), new C09530e4("subtle", 1003), new C09530e4("subtle_warm", 1004), new C09530e4("subtle_cool", 1005), new C09530e4("boost", 1006), new C09530e4("boost_warm", 1007), new C09530e4("boost_cool", 1008), new C09530e4("grayscale", 1009), new C09530e4("grainy", 1100), new C09530e4("gritty", 1101)}, 0, c09530e4Arr2, 27, 27);
        System.arraycopy(new C09530e4[]{new C09530e4("halo", 1102), new C09530e4("color_leak", 1103), new C09530e4("soft_light", 1104), new C09530e4("zoom_blur", 1105), new C09530e4("handheld", 1106), new C09530e4("moire", 1107), new C09530e4("lo_res", 1108), new C09530e4("wavy", 1109), new C09530e4("wide_angle", 1110), new C09530e4("color_grading", 1112)}, 0, c09530e4Arr2, 54, 10);
        A01 = AbstractC06930Yk.A06(c09530e4Arr2);
    }

    public static final String A01(int i) {
        Object obj = A00.get(Integer.valueOf(i));
        if (obj != null) {
            return (String) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
