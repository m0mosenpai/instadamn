package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I3C {
    public static Map A00(C40I c40i) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c40i.B21() != null) {
            A1I.put(AbstractC111324zv.A00(4378), c40i.B21());
        }
        if (c40i.B7T() != null) {
            A1I.put("follower_count", c40i.B7T());
        }
        if (c40i.BEu() != null) {
            A1I.put("icon_style", c40i.BEu());
        }
        if (c40i.BEy() != null) {
            A1I.put("icon_url", c40i.BEy());
        }
        if (c40i.BGX() != null) {
            A1I.put("image_ad_length", c40i.BGX());
        }
        if (c40i.CbA() != null) {
            A1I.put("is_profile_pic_end_scene", c40i.CbA());
        }
        if (c40i.BKK() != null) {
            A1I.put(AbstractC111324zv.A00(2647), c40i.BKK());
        }
        if (c40i.BgL() != null) {
            A1I.put(AbstractC111324zv.A00(5087), c40i.BgL());
        }
        if (c40i.getSubtitle() != null) {
            A1I.put("subtitle", c40i.getSubtitle());
        }
        if (c40i.C4Y() != null) {
            A1I.put("swipe_area_height", c40i.C4Y());
        }
        if (c40i.C4Z() != null) {
            A1I.put("swipe_area_width", c40i.C4Z());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
