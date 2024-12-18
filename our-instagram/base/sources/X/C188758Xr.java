package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8Xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188758Xr {
    public static final C188758Xr A00 = new Object();

    public static final Integer A00(UserSession userSession) {
        String A04 = C18U.A04(C06090Tz.A05, userSession, 36890603682071430L);
        Integer num = C05F.A01;
        if (!C14360o3.A0K(A04, "destination_bar")) {
            Integer num2 = C05F.A0C;
            if (!C14360o3.A0K(A04, "first_tile")) {
                return C05F.A00;
            }
            return num2;
        }
        return num;
    }

    public static final Integer A01(UserSession userSession) {
        String A04 = C18U.A04(C06090Tz.A05, userSession, 36890603681809285L);
        Integer num = C05F.A01;
        if (!C14360o3.A0K(A04, MSV.A00(514))) {
            Integer num2 = C05F.A0C;
            if (!C14360o3.A0K(A04, "self_pog_nux")) {
                return C05F.A00;
            }
            return num2;
        }
        return num;
    }
}
