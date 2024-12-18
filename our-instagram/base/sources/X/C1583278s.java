package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.78s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1583278s implements InterfaceC1582578k {
    public static final C1583278s A00 = new Object();

    @Override // X.InterfaceC1582578k
    public final C7QY AMI(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        String str;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7ql, 2);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(c160787Im, 4);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        C38321qM c38321qM = c83403nh.A0s;
        if (c38321qM != null) {
            DirectMessageIdentifier A0V = c83403nh.A0V();
            ExtendedImageUrl A1q = c38321qM.A1q(context);
            if (A1q != null) {
                C158737Aj c158737Aj = new C158737Aj(A1q, false, Float.valueOf(c38321qM.A0m()), null, null, null, null, null, null, null);
                C2EY c2ey = c83403nh.A10;
                C14360o3.A07(c2ey);
                String str2 = c83403nh.A1u;
                C14360o3.A07(str2);
                C9C9 c9c9 = new C9C9(LBk.A01(userSession, C47842LBj.A00(), c2ey, c38321qM, new MHL(userSession, 1)), str2, 5);
                EnumC910243u enumC910243u = EnumC910243u.SINGLE;
                User user = c160787Im.A0K;
                if (user != null) {
                    str = user.getUsername();
                } else {
                    str = null;
                }
                return new C7QY(null, null, null, c9c9, null, null, null, null, C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10), c7ql, null, null, c158737Aj, null, null, null, enumC910243u, null, A0V, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
