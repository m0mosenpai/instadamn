package X;

import android.net.Uri;
import com.facebook.R;

/* renamed from: X.KkI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46641KkI {
    public static final String A00(C6FW c6fw) {
        int i;
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        C14360o3.A0B(A0e, 0);
        String A00 = new C11L("[-/]").A00(new C11L("_(light|dark)").A00(AbstractC167007dF.A0h(A0e), ""), "_");
        switch (A00.hashCode()) {
            case -1549306977:
                if (!A00.equals("meta_brand_design_system_icons_raster_caret_left_outline_24")) {
                    return null;
                }
                i = R.drawable.meta_brand_design_system_icons_raster_caret_left_outline_24;
                break;
            case -1362722511:
                if (!A00.equals("caa_central_images_instagram")) {
                    return null;
                }
                i = R.drawable.caa_central_images_instagram;
                break;
            case -1178054961:
                if (!A00.equals("meta_brand_design_system_icons_raster_checkmark_shield_outline_24")) {
                    return null;
                }
                i = R.drawable.meta_brand_design_system_icons_raster_checkmark_shield_outline_24;
                break;
            case -717200796:
                if (!A00.equals("company_brand_meta_lockup_monochromatic_12")) {
                    return null;
                }
                i = R.drawable.company_brand_meta_lockup_monochromatic_12;
                break;
            case -629525319:
                if (!A00.equals("meta_brand_design_system_icons_raster_eye_off_outline_24")) {
                    return null;
                }
                i = R.drawable.meta_brand_design_system_icons_raster_eye_off_outline_24;
                break;
            case -180826903:
                if (!A00.equals("meta_brand_design_system_icons_raster_eye_outline_24")) {
                    return null;
                }
                i = R.drawable.meta_brand_design_system_icons_raster_eye_outline_24;
                break;
            case -94519085:
                if (!A00.equals("meta_brand_design_system_icons_raster_gear_outline_24")) {
                    return null;
                }
                i = R.drawable.meta_brand_design_system_icons_raster_gear_outline_24;
                break;
            case 1915714204:
                if (!A00.equals("meta_brand_design_system_icons_raster_i_circle_outline_24")) {
                    return null;
                }
                i = R.drawable.meta_brand_design_system_icons_raster_i_circle_outline_24;
                break;
            case 1989145410:
                if (!A00.equals("meta_brand_design_system_icons_raster_x_outline_24")) {
                    return null;
                }
                i = R.drawable.meta_brand_design_system_icons_raster_x_filled_24;
                break;
            default:
                return null;
        }
        android.net.Uri uri = AbstractC47136KsV.A00;
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build().toString();
    }
}
