package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.profile.intf.UserDetailEntryInfo;

/* loaded from: classes6.dex */
public abstract class FAJ {
    public static final UserDetailEntryInfo A00(Hashtag hashtag) {
        return new UserDetailEntryInfo(hashtag.getId(), hashtag.getName(), AbstractC1120253r.A02(hashtag), "hashtag", null, null, null, null, null, null, null, null);
    }
}
