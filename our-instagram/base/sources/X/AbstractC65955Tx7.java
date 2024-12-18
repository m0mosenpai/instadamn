package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.Hashtag;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Tx7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65955Tx7 {
    public static Map A00(Hashtag hashtag) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (hashtag.AbF() != null) {
            linkedHashMap.put("allow_following", hashtag.AbF());
        }
        if (hashtag.AbI() != null) {
            linkedHashMap.put("allow_muting_story", hashtag.AbI());
        }
        if (hashtag.B7N() != null) {
            linkedHashMap.put("follow_status", hashtag.B7N());
        }
        if (hashtag.B7W() != null) {
            linkedHashMap.put("following", hashtag.B7W());
        }
        if (hashtag.B8G() != null) {
            linkedHashMap.put("formatted_media_count", hashtag.B8G());
        }
        if (hashtag.BDt() != null) {
            linkedHashMap.put("hide_use_hashtag_button", hashtag.BDt());
        }
        if (hashtag.getId() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, hashtag.getId());
        }
        if (hashtag.CTY() != null) {
            linkedHashMap.put("is_eligible_for_survey", hashtag.CTY());
        }
        if (hashtag.CXj() != null) {
            linkedHashMap.put("is_local", hashtag.CXj());
        }
        if (hashtag.BQb() != null) {
            linkedHashMap.put("media_count", hashtag.BQb());
        }
        if (hashtag.getName() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, hashtag.getName());
        }
        if (hashtag.BXF() != null) {
            linkedHashMap.put("non_violating", hashtag.BXF());
        }
        if (hashtag.Bhu() != null) {
            ImageUrl Bhu = hashtag.Bhu();
            if (Bhu != null) {
                str = Bhu.getUrl();
            } else {
                str = null;
            }
            linkedHashMap.put("profile_pic_url", str);
        }
        if (hashtag.BrA() != null) {
            linkedHashMap.put("search_result_subtitle", hashtag.BrA());
        }
        if (hashtag.BrH() != null) {
            linkedHashMap.put("search_subtitle", hashtag.BrH());
        }
        if (hashtag.CDb() != null) {
            linkedHashMap.put("use_default_avatar", hashtag.CDb());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
