package X;

import com.instagram.api.schemas.MessagingOffPlatformShareType;
import java.io.IOException;

/* renamed from: X.EvT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33741EvT {
    public static MUD parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MessagingOffPlatformShareType messagingOffPlatformShareType = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("messaging_off_platform_share_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    messagingOffPlatformShareType = (MessagingOffPlatformShareType) MessagingOffPlatformShareType.A01.get(A1P);
                    if (messagingOffPlatformShareType == null) {
                        messagingOffPlatformShareType = MessagingOffPlatformShareType.A04;
                    }
                } else if ("parent_content_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("shared_content_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new MUD(messagingOffPlatformShareType, str, str2, 7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
