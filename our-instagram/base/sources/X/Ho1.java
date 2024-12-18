package X;

import com.instagram.api.schemas.CaptionTextFontStyle;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Ho1 {
    public static Map A00(IGAdCreativeStory9x16CaptionData iGAdCreativeStory9x16CaptionData) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iGAdCreativeStory9x16CaptionData.Alf() != null) {
            A1I.put(AbstractC111324zv.A00(2029), iGAdCreativeStory9x16CaptionData.Alf());
        }
        if (iGAdCreativeStory9x16CaptionData.Alg() != null) {
            A1I.put(AbstractC111324zv.A00(2030), iGAdCreativeStory9x16CaptionData.Alg());
        }
        if (iGAdCreativeStory9x16CaptionData.Alh() != null) {
            A1I.put("caption_box_width_pct", iGAdCreativeStory9x16CaptionData.Alh());
        }
        if (iGAdCreativeStory9x16CaptionData.Ali() != null) {
            A1I.put("caption_center_x_pct", AbstractC166997dE.A0f(iGAdCreativeStory9x16CaptionData.Ali()));
        }
        if (iGAdCreativeStory9x16CaptionData.Alj() != null) {
            A1I.put("caption_center_y_pct", AbstractC166997dE.A0f(iGAdCreativeStory9x16CaptionData.Alj()));
        }
        if (iGAdCreativeStory9x16CaptionData.Alk() != null) {
            A1I.put("caption_color", iGAdCreativeStory9x16CaptionData.Alk());
        }
        if (iGAdCreativeStory9x16CaptionData.All() != null) {
            A1I.put("caption_font_size", iGAdCreativeStory9x16CaptionData.All());
        }
        if (iGAdCreativeStory9x16CaptionData.Alm() != null) {
            CaptionTextFontStyle Alm = iGAdCreativeStory9x16CaptionData.Alm();
            if (Alm != null) {
                str = Alm.A00;
            } else {
                str = null;
            }
            A1I.put("caption_font_style", str);
        }
        if (iGAdCreativeStory9x16CaptionData.Alp() != null) {
            A1I.put("caption_num_lines", iGAdCreativeStory9x16CaptionData.Alp());
        }
        if (iGAdCreativeStory9x16CaptionData.Alq() != null) {
            A1I.put("caption_tap_area_more_present", iGAdCreativeStory9x16CaptionData.Alq());
        }
        if (iGAdCreativeStory9x16CaptionData.Alr() != null) {
            A1I.put("caption_tap_area_underline_present", iGAdCreativeStory9x16CaptionData.Alr());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
