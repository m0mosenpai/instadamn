package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagFollowStatus;
import com.instagram.model.hashtag.HashtagImpl;

/* renamed from: X.53r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1120253r {
    public static final HashtagImpl A00(String str) {
        C14360o3.A0B(str, 0);
        return new HashtagImpl(null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null);
    }

    public static final HashtagImpl A01(String str, String str2) {
        return new HashtagImpl(null, null, null, null, null, null, null, null, null, null, null, null, str, str2, null, null);
    }

    public static final boolean A03(Hashtag hashtag) {
        Integer B7N;
        if (hashtag != null && hashtag.B7N() != null && (B7N = hashtag.B7N()) != null && B7N.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final String A02(Hashtag hashtag) {
        HashtagFollowStatus hashtagFollowStatus;
        if (A03(hashtag)) {
            hashtagFollowStatus = HashtagFollowStatus.A04;
        } else {
            hashtagFollowStatus = HashtagFollowStatus.A05;
        }
        return hashtagFollowStatus.A00;
    }
}
