package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.7DH, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7DH {
    public static final C45127Jxw A00(UserSession userSession, String str) {
        String string;
        if (str != null && (string = AbstractC23021Ah.A00(userSession).A01.getString(AnonymousClass001.A0R("direct_thread_formatted_draft_", str), null)) != null && string.length() > 0) {
            try {
                return AbstractC34126F4c.parseFromJson(C16V.A00(string));
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
