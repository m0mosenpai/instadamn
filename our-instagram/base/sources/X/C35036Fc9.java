package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Fc9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35036Fc9 {
    public final synchronized C33002Egp A01(Context context, AbstractC12990ll abstractC12990ll, C35781FrJ c35781FrJ, GY7 gy7) {
        AbstractC167017dG.A1P(abstractC12990ll, c35781FrJ);
        return A02(context, abstractC12990ll, c35781FrJ, gy7, EnumC33445EqI.A05, C05F.A00);
    }

    public final synchronized C33002Egp A02(Context context, AbstractC12990ll abstractC12990ll, C35781FrJ c35781FrJ, GY7 gy7, EnumC33445EqI enumC33445EqI, Integer num) {
        String str;
        C33002Egp A00;
        UserSession userSession = c35781FrJ.A00;
        if (userSession != null) {
            str = userSession.userId;
        } else {
            str = null;
        }
        A00 = A00(context, abstractC12990ll, c35781FrJ, enumC33445EqI, num, str);
        if (gy7 != null) {
            ((AbstractC36003Fv1) A00).A02.add(gy7);
        }
        return A00;
    }

    public final synchronized C33002Egp A03(Context context, AbstractC12990ll abstractC12990ll, C35781FrJ c35781FrJ, EnumC33445EqI enumC33445EqI) {
        C14360o3.A0B(c35781FrJ, 2);
        return A02(context, abstractC12990ll, c35781FrJ, null, enumC33445EqI, C05F.A00);
    }

    public final synchronized C33002Egp A04(String str) {
        return (C33002Egp) C33002Egp.A04.get(str);
    }

    private final C33002Egp A00(Context context, AbstractC12990ll abstractC12990ll, C35781FrJ c35781FrJ, EnumC33445EqI enumC33445EqI, Integer num, String str) {
        String str2;
        HashMap hashMap = C33002Egp.A04;
        C33002Egp c33002Egp = (C33002Egp) hashMap.get(str);
        if (c33002Egp == null) {
            if (str != null) {
                c33002Egp = A00(context, abstractC12990ll, c35781FrJ, enumC33445EqI, num, null);
                Object obj = c33002Egp.A03;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.nux.impl.dynamicflow.onboarding.PendingSessionDelegate");
                ((C35781FrJ) obj).A00 = c35781FrJ.A00;
                hashMap.remove(null);
            } else {
                c33002Egp = new C33002Egp(context, abstractC12990ll, c35781FrJ, new C33010Egx(c35781FrJ, enumC33445EqI));
            }
        }
        UserSession userSession = c35781FrJ.A00;
        if (userSession != null) {
            str2 = userSession.userId;
        } else {
            str2 = null;
        }
        hashMap.put(str2, c33002Egp);
        return c33002Egp;
    }
}
