package X;

import android.util.SparseArray;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.filterkit.TextureAsset;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.8M5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8M5 extends C1YQ {
    public SparseArray A00;
    public final UserSession A01;
    public final C8M7 A02 = A01(0);

    public static final SparseArray A00(C8M5 c8m5) {
        SparseArray sparseArray = c8m5.A00;
        if (sparseArray == null) {
            synchronized (c8m5) {
                sparseArray = c8m5.A00;
                if (sparseArray == null) {
                    sparseArray = C8M6.A00(c8m5.A01);
                    sparseArray.put(803, new C8M7(null, "enhance", null, "Enhance", new LinkedList(), 803, R.drawable.filter_normal, false));
                    sparseArray.put(804, new C8M7(null, "Enhance", null, "EnhanceDebug", new LinkedList(), 804, R.drawable.filter_normal, false));
                    sparseArray.put(816, new C8M7(null, "split_screen", null, "dummy_shader_name", new LinkedList(), 816, 0, false));
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(new TextureAsset("map", "lark/map.png"));
                    sparseArray.put(615, new C8M7(null, "Lark", null, "Lark", linkedList, 615, 0, false));
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(new TextureAsset("map", "reyes/map.png"));
                    sparseArray.put(614, new C8M7(null, "Reyes", null, "StandardColorMap", linkedList2, 614, 0, false));
                    LinkedList linkedList3 = new LinkedList();
                    linkedList3.add(new TextureAsset("map", "juno/map.png"));
                    sparseArray.put(613, new C8M7(null, "Juno", null, "StandardColorMap", linkedList3, 613, 0, false));
                    LinkedList linkedList4 = new LinkedList();
                    linkedList4.add(new TextureAsset("map", "aden/map.png"));
                    sparseArray.put(612, new C8M7(null, "Aden", null, "StandardColorMap", linkedList4, 612, 0, false));
                    LinkedList linkedList5 = new LinkedList();
                    linkedList5.add(new TextureAsset("map", "perpetua/map.png"));
                    linkedList5.add(new TextureAsset("overlay_map", "perpetua/overlay_map.png"));
                    sparseArray.put(608, new C8M7(null, "Perpetua", null, "Perpetua", linkedList5, 608, 0, false));
                    LinkedList linkedList6 = new LinkedList();
                    linkedList6.add(new TextureAsset("map", "ludwig/map.png"));
                    sparseArray.put(603, new C8M7(null, "Ludwig", null, "Ludwig", linkedList6, 603, 0, false));
                    LinkedList linkedList7 = new LinkedList();
                    linkedList7.add(new TextureAsset("map", "slumber/map.png"));
                    sparseArray.put(605, new C8M7(null, "Slumber", null, "Slumber", linkedList7, 605, 0, false));
                    LinkedList linkedList8 = new LinkedList();
                    linkedList8.add(new TextureAsset("map", "crema/map.png"));
                    sparseArray.put(616, new C8M7(null, "Crema", null, "StandardColorMap", linkedList8, 616, 0, false));
                    LinkedList linkedList9 = new LinkedList();
                    linkedList9.add(new TextureAsset("map", "amaro/map.png"));
                    linkedList9.add(new TextureAsset("overlay_map", "amaro/overlay_map.png"));
                    linkedList9.add(new TextureAsset("blackboard", "shared/blackboard.png"));
                    sparseArray.put(24, new C8M7(null, "Amaro", null, "Amaro", linkedList9, 24, 0, false));
                    LinkedList linkedList10 = new LinkedList();
                    linkedList10.add(new TextureAsset("map", "mayfair/colorGradient.png"));
                    linkedList10.add(new TextureAsset("glowField", "mayfair/glowField.png"));
                    linkedList10.add(new TextureAsset("overlay", "mayfair/overlayMap100.png"));
                    linkedList10.add(new TextureAsset("colorOverlay", "mayfair/colorOverlay.png"));
                    sparseArray.put(17, new C8M7(null, "Mayfair", null, "Mayfair", linkedList10, 17, 0, false));
                    LinkedList linkedList11 = new LinkedList();
                    linkedList11.add(new TextureAsset("map", "rise/map.png"));
                    linkedList11.add(new TextureAsset("overlay_map", "shared/overlay_map.png"));
                    linkedList11.add(new TextureAsset("blackboard", "shared/blackboard.png"));
                    sparseArray.put(23, new C8M7(null, "Rise", null, "Rise", linkedList11, 23, 0, false));
                    LinkedList linkedList12 = new LinkedList();
                    linkedList12.add(new TextureAsset("map", "valencia/map.png"));
                    linkedList12.add(new TextureAsset("gradient_map", "valencia/gradient_map.png"));
                    sparseArray.put(25, new C8M7(null, "Valencia", null, "Valencia", linkedList12, 25, 0, false));
                    LinkedList linkedList13 = new LinkedList();
                    linkedList13.add(new TextureAsset("map", "x_pro2/map.png"));
                    linkedList13.add(new TextureAsset("vignette_map_plus_darker", "shared/vignette_map_plus_darker.png"));
                    sparseArray.put(1, new C8M7(null, "X-Pro II", null, "XPro2", linkedList13, 1, 0, false));
                    LinkedList linkedList14 = new LinkedList();
                    linkedList14.add(new TextureAsset("map", "sierra/map.png"));
                    linkedList14.add(new TextureAsset("smoke", "sierra/smoke.png"));
                    linkedList14.add(new TextureAsset("vignette", "sierra/vignette.png"));
                    linkedList14.add(new TextureAsset("overlay_map", "amaro/overlay_map.png"));
                    linkedList14.add(new TextureAsset("soft_light", "sierra/soft_light.png"));
                    sparseArray.put(27, new C8M7(null, "Sierra", null, "Sierra", linkedList14, 27, 0, false));
                    LinkedList linkedList15 = new LinkedList();
                    linkedList15.add(new TextureAsset("glowMap", "willow/glowField.png"));
                    linkedList15.add(new TextureAsset("overlayMap", "willow/overlayMap81.png"));
                    linkedList15.add(new TextureAsset("borderTexture", "willow/borderTexture.png"));
                    linkedList15.add(new TextureAsset("vignette", "willow/willowVignette.png"));
                    linkedList15.add(new TextureAsset("softLightMap", "willow/willowSoftLight100.png"));
                    linkedList15.add(new TextureAsset("map", "willow/willowMap.png"));
                    sparseArray.put(28, new C8M7(null, "Willow", null, "Willow", linkedList15, 28, 0, false));
                    LinkedList linkedList16 = new LinkedList();
                    linkedList16.add(new TextureAsset("map", "lo_fi/map.png"));
                    linkedList16.add(new TextureAsset("vignette_map", "lo_fi/vignette_map.png"));
                    sparseArray.put(2, new C8M7(null, "Lo-Fi", null, "LoFi", linkedList16, 2, 0, false));
                    LinkedList linkedList17 = new LinkedList();
                    linkedList17.add(new TextureAsset("map", "inkwell/map.png"));
                    sparseArray.put(10, new C8M7(null, "Inkwell", null, "Inkwell", linkedList17, 10, 0, false));
                    LinkedList linkedList18 = new LinkedList();
                    linkedList18.add(new TextureAsset("map", "nashville/map.png"));
                    sparseArray.put(15, new C8M7(null, "Nashville", null, "Nashville", linkedList18, 15, 0, false));
                    sparseArray.put(1010, new C8M7(null, "Hyper", "Hyper", "hyper", new LinkedList(), 1010, 0, false));
                    sparseArray.put(1011, new C8M7(null, "Rosy", "Rosy", "rosy", new LinkedList(), 1011, 0, false));
                    sparseArray.put(1012, new C8M7(null, "Emerald", null, "emerald", new LinkedList(), 1012, 0, false));
                    sparseArray.put(1013, new C8M7(null, "Midnight", "Midnight", "midnight", new LinkedList(), 1013, 0, false));
                    sparseArray.put(1000, new C8M7(null, "Fade", "Fade", "fade", new LinkedList(), 1000, 0, false));
                    sparseArray.put(1001, new C8M7(null, "Fade Warm", null, "fade_warm", new LinkedList(), 1001, 0, false));
                    sparseArray.put(1002, new C8M7(null, "Fade Cool", null, "fade_cool", new LinkedList(), 1002, 0, false));
                    sparseArray.put(1003, new C8M7(null, "Simple", "Simple", "subtle", new LinkedList(), 1003, 0, false));
                    sparseArray.put(1004, new C8M7(null, "Simple Warm", null, "subtle_warm", new LinkedList(), 1004, 0, false));
                    sparseArray.put(1005, new C8M7(null, "Simple Cool", null, "subtle_cool", new LinkedList(), 1005, 0, false));
                    sparseArray.put(1006, new C8M7(null, "Boost", "Boost", "boost", new LinkedList(), 1006, 0, false));
                    sparseArray.put(1007, new C8M7(null, "Boost Warm", null, "boost_warm", new LinkedList(), 1007, 0, false));
                    sparseArray.put(1008, new C8M7(null, "Boost Cool", null, "boost_cool", new LinkedList(), 1008, 0, false));
                    sparseArray.put(1009, new C8M7(null, "Graphite", "Graphite", "grayscale", new LinkedList(), 1009, 0, false));
                    sparseArray.put(1100, new C8M7(null, "Grainy", "Grainy", "grainy", new LinkedList(), 1100, 0, false));
                    sparseArray.put(1101, new C8M7(null, "Gritty", "Gritty", "gritty", new LinkedList(), 1101, 0, false));
                    sparseArray.put(1102, new C8M7(null, "Halo", null, "halo", new LinkedList(), 1102, 0, false));
                    sparseArray.put(1103, new C8M7(null, "Color Leak", "Color Leak", "color_leak", new LinkedList(), 1103, 0, false));
                    sparseArray.put(1104, new C8M7(null, "Soft Light", "Soft Light", "soft_light", new LinkedList(), 1104, 0, false));
                    sparseArray.put(1105, new C8M7(null, "Zoom Blur", "Zoom Blur", "zoom_blur", new LinkedList(), 1105, 0, false));
                    sparseArray.put(1106, new C8M7(null, "Handheld", "Handheld", "handheld", new LinkedList(), 1106, 0, false));
                    sparseArray.put(1107, new C8M7(null, "Moire", "Moire", "moire", new LinkedList(), 1107, 0, false));
                    sparseArray.put(1108, new C8M7(null, "Lo-Res", "Lo-Res", "lo_res", new LinkedList(), 1108, 0, false));
                    sparseArray.put(1109, new C8M7(null, "Wavy", null, "wavy", new LinkedList(), 1109, 0, false));
                    sparseArray.put(1110, new C8M7(null, "Wide Angle", null, "wide_angle", new LinkedList(), 1110, 0, false));
                    LinkedList linkedList19 = new LinkedList();
                    linkedList19.add(new TextureAsset("map", "video/clarendon/Glacial1.png"));
                    linkedList19.add(new TextureAsset("map2", "video/clarendon/Glacial2.png"));
                    sparseArray.put(112, new C8M7(null, "Clarendon", null, "Clarendon", linkedList19, 112, 0, false));
                    LinkedList linkedList20 = new LinkedList();
                    linkedList20.add(new TextureAsset("map1", "video/moon/curves1.png"));
                    linkedList20.add(new TextureAsset("map2", "video/moon/curves2.png"));
                    sparseArray.put(111, new C8M7(null, "Moon", null, "Moon", linkedList20, 111, 0, false));
                    sparseArray.put(644, new C8M7(null, "Pixelated", null, "Pixelated", new LinkedList(), 644, R.drawable.filter_normal, false));
                    LinkedList linkedList21 = new LinkedList();
                    Integer num = C05F.A0C;
                    sparseArray.put(753, new C8M7(num, "gradient_transform", null, "GradientBackgroundTextured", linkedList21, 753, R.drawable.filter_normal, false));
                    sparseArray.put(754, new C8M7(num, "GradientAndBitmapBackgroundTextured", null, "GradientAndBitmapBackgroundTextured", new LinkedList(), 754, R.drawable.filter_normal, false));
                    c8m5.A00 = sparseArray;
                }
            }
        }
        return sparseArray;
    }

    @Override // X.C1YQ
    public final List A02(boolean z) {
        UserSession userSession = this.A01;
        List list = C8M6.A00;
        if (list == null) {
            List A1Q = AbstractC16960so.A1Q(0, 810, 813, 643, 114, 640, 706, 703, 705, 707, 709, 710, 702, 642);
            list = AbstractC16960so.A1Q(0, 1000, 810, 1003, 813, 1013, 706, 1100, 1101, 1009, 1010, 1105, 1104, 1103, 642, 1106, 1108);
            C06090Tz c06090Tz = C06090Tz.A05;
            if ((!C18U.A06(c06090Tz, userSession, 36326902109255863L) || !z) && (!C18U.A06(c06090Tz, userSession, 36326902109190326L) || z)) {
                list = A1Q;
            }
            C8M6.A00 = list;
        }
        return list;
    }

    public C8M5(UserSession userSession) {
        this.A01 = userSession;
    }

    @Override // X.C1YQ
    public final C8M7 A01(int i) {
        Object obj = A00(this).get(i);
        C14360o3.A07(obj);
        return (C8M7) obj;
    }
}
