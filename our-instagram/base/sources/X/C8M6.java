package X;

import android.util.SparseArray;
import com.facebook.R;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.common.session.UserSession;
import com.instagram.model.filterkit.TextureAsset;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.8M6, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8M6 {
    public static List A00;
    public static List A01;

    public static final SparseArray A00(UserSession userSession) {
        String str;
        SparseArray sparseArray = new SparseArray();
        if (C18U.A06(C06090Tz.A05, userSession, 36320725947392866L)) {
            str = "Original";
        } else {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        sparseArray.put(0, new C8M7(null, str, null, ReactProgressBarViewManager.DEFAULT_STYLE, new LinkedList(), 0, R.drawable.filter_normal, false));
        sparseArray.put(-2, new C8M7(null, "OES", null, "OES", new LinkedList(), -2, 0, false));
        sparseArray.put(-1, new C8M7(null, "YUV", null, "YUV", new LinkedList(), -1, 0, false));
        LinkedList linkedList = new LinkedList();
        linkedList.add(new TextureAsset("map", "video/gingham/curves1.png"));
        linkedList.add(new TextureAsset("mapLgg", "video/gingham/curves_lgg.png"));
        sparseArray.put(114, new C8M7(null, "Gingham", "Lagos", "Gingham", linkedList, 114, R.drawable.lagos, false));
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(new TextureAsset("map", "brightcontrast/map.png"));
        sparseArray.put(640, new C8M7(null, "BrightContrast", "Melbourne", "StandardColorMap", linkedList2, 640, R.drawable.melbourne, false));
        LinkedList linkedList3 = new LinkedList();
        linkedList3.add(new TextureAsset("map", "crazycolor/map.png"));
        linkedList3.add(new TextureAsset("overlay_map", "crazycolor/overlay_map.png"));
        sparseArray.put(642, new C8M7(null, "Crazy", "Rio de Janeiro", "CrazyColor", linkedList3, 642, R.drawable.rio, false));
        LinkedList linkedList4 = new LinkedList();
        linkedList4.add(new TextureAsset("map", "subtlecolor/map.png"));
        sparseArray.put(643, new C8M7(null, "Subtle", "Oslo", "StandardColorMap", linkedList4, 643, R.drawable.oslo, false));
        sparseArray.put(810, new C8M7(C05F.A0N, "paris", "Paris", "Retouching", new LinkedList(), 810, R.drawable.paris, false));
        sparseArray.put(811, new C8M7(C05F.A0Y, "TouchUp", "Touch Up", "IGFastRetouchingFilter", new LinkedList(), 811, R.drawable.paris, true));
        LinkedList linkedList5 = new LinkedList();
        linkedList5.add(new TextureAsset("sLookup", "magic/map.png"));
        sparseArray.put(813, new C8M7(C05F.A0j, "Magic", "Los Angeles", "Magic", linkedList5, 813, R.drawable.la, false));
        LinkedList linkedList6 = new LinkedList();
        linkedList6.add(new TextureAsset("uColorLut", "tint/clut_bw.png"));
        Integer num = C05F.A01;
        sparseArray.put(702, new C8M7(num, "DramaticBlackWhite", "Tokyo", "Tint", linkedList6, 702, R.drawable.tokyo, false));
        LinkedList linkedList7 = new LinkedList();
        linkedList7.add(new TextureAsset("uColorLut", "tint/clut_cinema_red.png"));
        sparseArray.put(703, new C8M7(num, "CinemaRed", "Abu Dhabi", "Tint", linkedList7, 703, R.drawable.abu, false));
        LinkedList linkedList8 = new LinkedList();
        linkedList8.add(new TextureAsset("uColorLut", "tint/clut_cinema_blue.png"));
        sparseArray.put(705, new C8M7(num, "CinemaBlue", "Buenos Aires", "Tint", linkedList8, 705, R.drawable.buenos, false));
        LinkedList linkedList9 = new LinkedList();
        linkedList9.add(new TextureAsset("uColorLut", "tint/clut_clear.png"));
        sparseArray.put(706, new C8M7(num, "CrystalClear", "Jakarta", "Tint", linkedList9, 706, R.drawable.jakarta, false));
        LinkedList linkedList10 = new LinkedList();
        linkedList10.add(new TextureAsset("uColorLut", "tint/clut_vintage.png"));
        sparseArray.put(707, new C8M7(num, "Vintage", "New York", "Tint", linkedList10, 707, R.drawable.newyork, false));
        LinkedList linkedList11 = new LinkedList();
        linkedList11.add(new TextureAsset("uColorLut", "tint/clut_pastel_pink.png"));
        sparseArray.put(709, new C8M7(num, "PastelPink", "Jaipur", "Tint", linkedList11, 709, R.drawable.jaipur, false));
        LinkedList linkedList12 = new LinkedList();
        linkedList12.add(new TextureAsset("uColorLut", "tint/clut_pastel_sky.png"));
        sparseArray.put(710, new C8M7(num, "PastelSky", "Cairo", "Tint", linkedList12, 710, R.drawable.cairo, false));
        LinkedList linkedList13 = new LinkedList();
        linkedList13.add(new TextureAsset("uColorLut", "tint/clut_bw.png"));
        sparseArray.put(702, new C8M7(num, "DramaticBlackWhite", "Tokyo", "Tint", linkedList13, 702, R.drawable.tokyo, false));
        LinkedList linkedList14 = new LinkedList();
        Integer num2 = C05F.A0C;
        sparseArray.put(753, new C8M7(num2, "GradientBackgroundTextured", null, "GradientBackgroundTextured", linkedList14, 753, R.drawable.filter_normal, false));
        sparseArray.put(754, new C8M7(num2, "GradientAndBitmapBackgroundTextured", null, "GradientAndBitmapBackgroundTextured", new LinkedList(), 754, R.drawable.filter_normal, false));
        sparseArray.put(1112, new C8M7(C05F.A0u, "ColorGrading", "AI Filter", "ColorGrading", new LinkedList(), 1112, R.drawable.filter_normal, false));
        return sparseArray;
    }
}
