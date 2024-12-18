package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.common.session.UserSession;

/* renamed from: X.6v1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC153326v1 {
    /* JADX WARN: Type inference failed for: r2v2, types: [X.1vV, X.5mT, X.3ZN] */
    public static final C43121yf A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, EnumC125765mR enumC125765mR, String str, int i, int i2) {
        C3ZM A03;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c38321qM, 3);
        int ordinal = enumC125765mR.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (str == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Can't generate prefetch resource for unknown tabMode: ");
                            sb.append(enumC125765mR);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        str = "profile_reposts";
                    }
                } else {
                    str = "profile_fan_club_grid";
                }
            } else {
                str = "profile_tagged_media_photos_of_you";
            }
        } else {
            str = "profile_media_grid";
        }
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        Integer num = enumC125765mR.A01;
        C14360o3.A0B(num, 2);
        ?? c3zn = new C3ZN(pair, C05F.A00);
        c3zn.A01 = num;
        c3zn.A00 = enumC125765mR;
        c3zn.A02 = str;
        Integer num2 = C05F.A01;
        String moduleName = interfaceC11380iw.getModuleName();
        if (num == num2) {
            A03 = C3ZH.A05(context, userSession, c38321qM, moduleName, false);
        } else {
            A03 = C3ZH.A03(context, userSession, c38321qM, num, moduleName);
        }
        return new C43121yf(A03, c3zn);
    }
}
