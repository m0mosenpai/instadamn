package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.user.model.User;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.78o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1582978o implements InterfaceC1582578k {
    public static final C1582978o A00 = new Object();

    @Override // X.InterfaceC1582578k
    public final C7QY AMI(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        User user;
        boolean z;
        ImageUrl imageUrl;
        String str;
        AbstractC1583778x c45931KUi;
        String str2;
        ImageUrl A02;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7ql, 2);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(c160787Im, 4);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        User user2 = c160787Im.A0K;
        Object obj = c83403nh.A1T;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectLiveViewerInvite");
        IKN ikn = (IKN) obj;
        DirectMessageIdentifier A0V = c83403nh.A0V();
        C105824pt c105824pt = ikn.A01;
        if (c105824pt != null) {
            user = c105824pt.A03();
        } else {
            user = ikn.A02;
        }
        C105824pt c105824pt2 = ikn.A01;
        if (c105824pt2 != null) {
            EnumC109104va enumC109104va = c105824pt2.A06;
            if (enumC109104va == null) {
                enumC109104va = EnumC109104va.A0E;
            }
            z = enumC109104va.A00();
        } else {
            z = true;
        }
        String str3 = null;
        if (user != null) {
            imageUrl = user.Bhu();
        } else {
            imageUrl = null;
        }
        List A1O = AbstractC16960so.A1O(imageUrl);
        if (user != null) {
            str = user.getUsername();
        } else {
            String str4 = ikn.A07;
            if (str4 != null) {
                Matcher A09 = AbstractC13670mt.A09(str4);
                if (A09.find()) {
                    String group = A09.group(1);
                    if (group != null) {
                        str = group.substring(1);
                        C14360o3.A07(str);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            str = "";
        }
        if (z) {
            str3 = context.getString(2131964104);
        }
        C1583678w c1583678w = new C1583678w(null, null, str, str3, null, null, null, null, null, null, A1O);
        C105824pt c105824pt3 = ikn.A01;
        if (c105824pt3 != null && (A02 = c105824pt3.A02()) != null) {
            c45931KUi = new C158737Aj(A02, false, null, null, null, null, null, -2, null, null);
        } else {
            ImageUrl imageUrl2 = ikn.A00;
            if (imageUrl2 != null) {
                c45931KUi = new C158737Aj(imageUrl2, false, null, null, null, null, null, null, null, null);
            } else {
                c45931KUi = new C45931KUi(context.getColor(R.color.black));
            }
        }
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        String str5 = c83403nh.A1u;
        C14360o3.A07(str5);
        C9C9 c9c9 = new C9C9(LBk.A01(userSession, C47842LBj.A00(), c2ey, ikn, new MHL(userSession, 1)), str5, 5);
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        if (user2 != null) {
            str2 = user2.getUsername();
        } else {
            str2 = null;
        }
        return new C7QY(null, null, null, c9c9, null, null, null, null, C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10), c7ql, null, c1583678w, c45931KUi, null, null, null, enumC910243u, null, A0V, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
    }
}
