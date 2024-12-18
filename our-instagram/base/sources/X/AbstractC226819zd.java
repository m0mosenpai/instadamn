package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.9zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226819zd {
    public static final String A00(Context context, C9J0 c9j0, UserSession userSession) {
        C14360o3.A0B(c9j0, 0);
        AbstractC167007dF.A1D(context, 1, userSession);
        File A01 = C2Ps.A00(context, userSession).A01();
        String str = c9j0.A09;
        String canonicalPath = new File(A01, str).getCanonicalPath();
        String str2 = c9j0.A0D;
        if (str2 != null) {
            C14360o3.A0A(canonicalPath);
            if (AbstractC002300n.A0h(str2, canonicalPath, false)) {
                return str2;
            }
        }
        C49602Pt A00 = C2Ps.A00(context, userSession);
        C14360o3.A0B(A00, 0);
        C14360o3.A0B(str, 1);
        File file = new File(A00.A01(), str);
        AbstractC189888b7.A00(file);
        return new File(file, "cover_photo.jpg").getCanonicalPath();
    }
}
