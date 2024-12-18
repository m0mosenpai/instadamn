package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167997eu {
    public static final /* synthetic */ C167997eu A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.7ev] */
    public static final C168007ev A00(final Application application, final UserSession userSession, final String str) {
        C14360o3.A0B(application, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        return new InterfaceC168017ew() { // from class: X.7ev
            @Override // X.InterfaceC168017ew
            public final ETP AMF(C104024mO c104024mO, EnumC33402EpZ enumC33402EpZ, User user) {
                C14360o3.A0B(user, 0);
                C14360o3.A0B(enumC33402EpZ, 1);
                UserSession userSession2 = userSession;
                String str2 = enumC33402EpZ.A00;
                C14360o3.A0B(str2, 4);
                return new ETP(userSession2, c104024mO, user, str2, false);
            }
        };
    }
}
