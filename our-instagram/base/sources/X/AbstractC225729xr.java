package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.9xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225729xr {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        User user;
        String str = (String) c6fw.A02();
        String str2 = (String) c6fw.A00();
        String str3 = (String) c6fw.A03(3);
        String str4 = (String) c6fw.A03(4);
        String str5 = (String) c6fw.A03(5);
        String str6 = (String) c6fw.A03(6);
        C34396FEm c34396FEm = (C34396FEm) c6fw.A00.get(7);
        if (c34396FEm == null || (user = c34396FEm.A00) == null) {
            user = null;
        }
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        int[] iArr = AlB.A03;
        C44I c44i = new C189138Ze(AJu.A00(), null, null, "", "", null, null, "", "", "", "", "", "", 0).A01;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 0);
        C14360o3.A0B(str3, 0);
        C14360o3.A0B(str4, 0);
        C14360o3.A0B(str5, 0);
        C14360o3.A0B(str6, 0);
        AbstractC167017dG.A0x();
        AbstractC23115AHe.A02(C6BQ.A04(c6fq), C22P.A2v, userSession, new AlB(new C189138Ze(c44i.F55(), user, null, str6, str5, "DEFAULT", null, "", "bloks", str4, str3, str, str2, 0)), false);
        return null;
    }
}
