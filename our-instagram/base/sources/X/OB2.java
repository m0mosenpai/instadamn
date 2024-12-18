package X;

import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.suggestedusers.database.SuggestedUsersDatabase;

/* loaded from: classes9.dex */
public final class OB2 {
    public final UserSession A00;
    public final SuggestedUsersDatabase A01;
    public final C19L A02;

    public OB2(UserSession userSession) {
        this.A00 = userSession;
        P9T p9t = SuggestedUsersDatabase.A00;
        IgRoomDatabase A0p = MSW.A0p(userSession, SuggestedUsersDatabase.class);
        if (A0p == null) {
            synchronized (p9t) {
                A0p = MSW.A0p(userSession, SuggestedUsersDatabase.class);
                if (A0p == null) {
                    C1Ye A0K = AbstractC43594JPz.A0K(userSession, p9t, SuggestedUsersDatabase.class);
                    AbstractC28241Yh.A00(A0K, 966282908, 879196953, true);
                    A0p = AbstractC43594JPz.A0k(A0K, userSession, SuggestedUsersDatabase.class);
                }
            }
        }
        this.A01 = (SuggestedUsersDatabase) A0p;
        this.A02 = AbstractC167017dG.A0w(C12L.A00, 879196953);
    }
}
