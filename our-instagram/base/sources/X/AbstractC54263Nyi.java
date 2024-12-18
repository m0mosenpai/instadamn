package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Nyi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54263Nyi {
    public static final C51751Mta A00(UserSession userSession, C54825OLj c54825OLj) {
        C14360o3.A0B(c54825OLj, 0);
        C18A A00 = AnonymousClass189.A00(userSession);
        String str = c54825OLj.A02;
        User A02 = A00.A02(str);
        if (A02 == null) {
            C4LM.A02.A02(userSession, null, str);
        }
        C14360o3.A07(str);
        boolean z = c54825OLj.A01;
        EnumC53187Nfj enumC53187Nfj = c54825OLj.A00;
        C14360o3.A07(enumC53187Nfj);
        return new C51751Mta(A02, enumC53187Nfj, str, z);
    }
}
