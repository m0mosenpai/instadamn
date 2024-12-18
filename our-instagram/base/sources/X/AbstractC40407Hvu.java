package X;

import com.instagram.api.schemas.TextPostAppUserFediverseInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hvu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40407Hvu {
    public static Map A00(TextPostAppUserFediverseInfo textPostAppUserFediverseInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (textPostAppUserFediverseInfo.C6S() != null) {
            A1I.put("text_post_app_fediverse_followers_count", textPostAppUserFediverseInfo.C6S());
        }
        if (textPostAppUserFediverseInfo.C6T() != null) {
            A1I.put("text_post_app_fediverse_followers_instance_count", textPostAppUserFediverseInfo.C6T());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
