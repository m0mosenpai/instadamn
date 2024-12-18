package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import java.io.IOException;

/* renamed from: X.5lZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125285lZ {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.instagram.direct.model.thread.CreatorSubscriberThreadInfo] */
    public static CreatorSubscriberThreadInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("pause_unix_timestamp".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("ig_creator_igid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ig_creator_profile_picture_url".equals(A0q)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (l != null) {
                obj.A01 = l;
            }
            if (str != null) {
                obj.A02 = str;
            }
            if (simpleImageUrl != null) {
                obj.A00 = simpleImageUrl;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, CreatorSubscriberThreadInfo creatorSubscriberThreadInfo) {
        anonymousClass182.A0d();
        Long l = creatorSubscriberThreadInfo.A01;
        if (l != null) {
            anonymousClass182.A0R("pause_unix_timestamp", l.longValue());
        }
        String str = creatorSubscriberThreadInfo.A02;
        if (str != null) {
            anonymousClass182.A0S("ig_creator_igid", str);
        }
        if (creatorSubscriberThreadInfo.A00 != null) {
            anonymousClass182.A0r("ig_creator_profile_picture_url");
            AbstractC222616c.A01(anonymousClass182, creatorSubscriberThreadInfo.A00);
        }
        anonymousClass182.A0a();
    }
}
