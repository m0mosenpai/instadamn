package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.1YZ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract /* synthetic */ class C1YZ {
    public static String A00(UserSession userSession, C1YX c1yx) {
        C14360o3.A0B(userSession, 1);
        return AnonymousClass001.A0T(c1yx.dbFilenamePrefix(), userSession.userId, '_');
    }

    public static boolean A01(UserSession userSession, C1YX c1yx) {
        C14360o3.A0B(userSession, 1);
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgRoomDatabase.deleteDatabase", -624721697);
        }
        try {
            boolean deleteDatabase = AbstractC12290kX.A00.deleteDatabase(A00(userSession, c1yx));
            if (Systrace.A0E(1L)) {
                C0fO.A00(709160118);
            }
            return deleteDatabase;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-438914018);
            }
            throw th;
        }
    }
}
