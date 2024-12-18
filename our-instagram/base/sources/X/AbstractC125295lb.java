package X;

import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import java.io.IOException;

/* renamed from: X.5lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125295lb {
    /* JADX WARN: Type inference failed for: r1v2, types: [com.instagram.direct.model.thread.DiscoverableThreadInfo, java.lang.Object] */
    public static DiscoverableThreadInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("join_link".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_thread_recipient".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("ig_creator_igid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("channel_invite_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (str != null) {
                obj.A02 = str;
            }
            if (bool != null) {
                obj.A03 = bool.booleanValue();
            }
            if (str2 != null) {
                obj.A01 = str2;
            }
            if (str3 != null) {
                obj.A00 = str3;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, DiscoverableThreadInfo discoverableThreadInfo) {
        anonymousClass182.A0d();
        String str = discoverableThreadInfo.A02;
        if (str != null) {
            anonymousClass182.A0S("join_link", str);
        }
        anonymousClass182.A0T("is_thread_recipient", discoverableThreadInfo.A03);
        String str2 = discoverableThreadInfo.A01;
        if (str2 != null) {
            anonymousClass182.A0S("ig_creator_igid", str2);
        }
        String str3 = discoverableThreadInfo.A00;
        if (str3 != null) {
            anonymousClass182.A0S("channel_invite_id", str3);
        }
        anonymousClass182.A0a();
    }
}
