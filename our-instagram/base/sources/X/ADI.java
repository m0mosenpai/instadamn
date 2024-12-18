package X;

import android.os.Parcelable;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class ADI {
    public static SubscriptionStickerDict parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            User user = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("creator".equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("creator_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("creator_profile_pic_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("creator_username".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new SubscriptionStickerDict(user, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, SubscriptionStickerDict subscriptionStickerDict) {
        anonymousClass182.A0d();
        User user = subscriptionStickerDict.A00;
        if (user != null) {
            anonymousClass182.A0r("creator");
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        String str = subscriptionStickerDict.A01;
        if (str != null) {
            anonymousClass182.A0S("creator_id", str);
        }
        String str2 = subscriptionStickerDict.A02;
        if (str2 != null) {
            anonymousClass182.A0S("creator_profile_pic_url", str2);
        }
        String str3 = subscriptionStickerDict.A03;
        if (str3 != null) {
            anonymousClass182.A0S("creator_username", str3);
        }
        anonymousClass182.A0a();
    }
}
