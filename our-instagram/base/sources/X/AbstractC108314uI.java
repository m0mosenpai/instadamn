package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.4uI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108314uI {
    public static final C108324uJ A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReelTrayPerPogCache.getInstance", 1509121793);
        }
        try {
            C108324uJ c108324uJ = (C108324uJ) userSession.A01(C108324uJ.class, new C9E7(userSession, 29));
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1605182295);
            }
            return c108324uJ;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1826007621);
            }
            throw th;
        }
    }
}
