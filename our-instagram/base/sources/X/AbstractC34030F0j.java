package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.F0j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34030F0j {
    public static final Integer A00(AbstractC12990ll abstractC12990ll, Integer num, String str) {
        if (num.intValue() != 0) {
            if (abstractC12990ll instanceof UserSession) {
                AnonymousClass253 A00 = AnonymousClass252.A00((UserSession) abstractC12990ll);
                CallerContext.A01(str);
                A00.A00(null);
                CallerContext.A01(str);
                if (A00.A01) {
                    return C05F.A0C;
                }
            }
            return C05F.A01;
        }
        return C05F.A00;
    }
}
