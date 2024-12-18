package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VP2 {
    public static Map A00(XGK xgk) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        User AdB = xgk.AdB();
        if (AdB != null) {
            linkedHashMap.put("attribution", AdB.A07());
        }
        if (xgk.Af0() != null) {
            linkedHashMap.put("background_image_url", xgk.Af0());
        }
        if (xgk.As3() != null) {
            linkedHashMap.put("countdown_id", xgk.As3());
        }
        if (xgk.AxN() != null) {
            linkedHashMap.put("digit_card_color", xgk.AxN());
        }
        if (xgk.AxO() != null) {
            linkedHashMap.put("digit_color", xgk.AxO());
        }
        if (xgk.getEndBackgroundColor() != null) {
            linkedHashMap.put("end_background_color", xgk.getEndBackgroundColor());
        }
        if (xgk.B2C() != null) {
            linkedHashMap.put("end_ts", xgk.B2C());
        }
        if (xgk.B7Y() != null) {
            linkedHashMap.put("following_enabled", xgk.B7Y());
        }
        if (xgk.CZx() != null) {
            linkedHashMap.put("is_owner", xgk.CZx());
        }
        if (xgk.getStartBackgroundColor() != null) {
            linkedHashMap.put("start_background_color", xgk.getStartBackgroundColor());
        }
        if (xgk.getText() != null) {
            linkedHashMap.put("text", xgk.getText());
        }
        if (xgk.getTextColor() != null) {
            linkedHashMap.put("text_color", xgk.getTextColor());
        }
        if (xgk.CGB() != null) {
            linkedHashMap.put("viewer_is_following", xgk.CGB());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
