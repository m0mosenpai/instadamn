package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource;
import com.instagram.direct.securityalert.data.room.SecurityAlertDatabase;
import com.instagram.roomdb.IgDeviceScopedRoomDatabase;

/* renamed from: X.Jfo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44185Jfo {
    public static final SecurityAlertLocalDataSource A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C46083Kah A00 = AbstractC44183Jfm.A00(userSession);
        C46916Kox c46916Kox = SecurityAlertDatabase.A00;
        C18720vz c18720vz = AbstractC12960li.A00;
        Object A002 = c18720vz.A00(SecurityAlertDatabase.class);
        if (A002 == null) {
            synchronized (c46916Kox) {
                A002 = (IgDeviceScopedRoomDatabase) c18720vz.A00(SecurityAlertDatabase.class);
                if (A002 == null) {
                    C1Ye A003 = C1Yc.A00(c18720vz.A06(), SecurityAlertDatabase.class, "ig_security_alert");
                    AbstractC28241Yh.A00(A003, 170156951, 170156951, true);
                    A003.A01();
                    A002 = (IgDeviceScopedRoomDatabase) A003.A00();
                    c18720vz.A04(SecurityAlertDatabase.class, A002);
                }
            }
        }
        return (SecurityAlertLocalDataSource) userSession.A01(SecurityAlertLocalDataSource.class, new ME4(21, A002, userSession, A00));
    }
}
