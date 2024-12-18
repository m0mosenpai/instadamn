package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.78n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1582878n implements InterfaceC1582578k {
    public static final C1582878n A00 = new Object();

    @Override // X.InterfaceC1582578k
    public final C7QY AMI(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        C38321qM c38321qM;
        C1583678w c1583678w;
        C158737Aj c158737Aj;
        C06090Tz c06090Tz;
        long j;
        String str;
        String str2;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7ql, 2);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(c160787Im, 4);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        User user = c160787Im.A0K;
        Object obj = c83403nh.A1T;
        if (obj != null) {
            if (C206409Bx.A00(obj, 8)) {
                c38321qM = (C38321qM) ((C206409Bx) obj).A00;
            } else if (obj instanceof C1575375n) {
                c38321qM = ((C1575375n) obj).A01;
                C14360o3.A07(c38321qM);
            } else {
                throw new UnsupportedOperationException(AnonymousClass001.A0R("Unsupported message content type: ", obj.getClass().getName()));
            }
            boolean z = true;
            if (!C206409Bx.A00(obj, 8)) {
                if (obj instanceof C1575375n) {
                    z = !(!TextUtils.isEmpty(((C1575375n) obj).A03));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid content: ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            }
            DirectMessageIdentifier A0V = c83403nh.A0V();
            if (z) {
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    c1583678w = new C1583678w(null, null, A2E.getUsername(), null, null, null, null, null, null, null, AbstractC16960so.A1O(A2E.Bhu()));
                } else {
                    c1583678w = null;
                }
            } else {
                c1583678w = null;
            }
            C37059GUt c37059GUt = new C37059GUt(obj, 21);
            ExtendedImageUrl A1q = c38321qM.A1q(context);
            if (A1q != null) {
                c158737Aj = new C158737Aj(A1q, false, null, null, null, null, null, (Integer) c37059GUt.invoke(), null, null);
            } else {
                c158737Aj = null;
            }
            C2EY c2ey = c83403nh.A10;
            C14360o3.A07(c2ey);
            AbstractC34114F3q abstractC34114F3q = AbstractC34114F3q.$redex_init_class;
            int ordinal = c2ey.ordinal();
            C1579877i c1579877i = null;
            if (ordinal != 37) {
                if (ordinal != 46) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid type: ");
                    sb2.append(c2ey);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                String title = c38321qM.A0C.getTitle();
                if (title != null) {
                    c1579877i = new C1579877i(null, null, null, title, null, null, null, null, null, null, null, null, null, null, null, 3);
                }
            }
            C2EY c2ey2 = c83403nh.A10;
            C14360o3.A07(c2ey2);
            String str3 = c83403nh.A1u;
            C14360o3.A07(str3);
            int ordinal2 = c2ey2.ordinal();
            if (ordinal2 != 37) {
                if (ordinal2 == 46) {
                    c06090Tz = C06090Tz.A05;
                    j = 36313321423112070L;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid contentType: ");
                    sb3.append(c2ey2);
                    throw new IllegalStateException(sb3.toString());
                }
            } else {
                c06090Tz = C06090Tz.A05;
                j = 36313321423046533L;
            }
            boolean A06 = C18U.A06(c06090Tz, userSession, j);
            C14360o3.A0A(Boolean.valueOf(A06));
            if (A06) {
                str = LBk.A01(userSession, C47842LBj.A00(), c2ey2, obj, new MHL(userSession, 1));
            } else {
                str = "";
            }
            C9C9 c9c9 = new C9C9(str, str3, 5);
            EnumC910243u enumC910243u = EnumC910243u.SINGLE;
            if (user != null) {
                str2 = user.getUsername();
            } else {
                str2 = null;
            }
            return new C7QY(LC0.A00(c38321qM), null, null, c9c9, null, null, null, null, C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10), c7ql, c1579877i, c1583678w, c158737Aj, null, null, null, enumC910243u, null, A0V, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
