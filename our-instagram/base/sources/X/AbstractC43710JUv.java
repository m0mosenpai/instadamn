package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

/* renamed from: X.JUv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43710JUv {
    public static final C51u A00(Context context, UserSession userSession, int i) {
        String A0t;
        AbstractC167017dG.A1O(context, userSession);
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36599254575287784L);
        boolean z = true;
        Resources resources = context.getResources();
        if (i > A07) {
            A0t = AbstractC43594JPz.A0t(resources, A07, 2131960897);
            i = A07;
        } else {
            if (i == 0) {
                A0t = resources.getString(2131959913);
            } else {
                A0t = AbstractC43594JPz.A0t(resources, i, 2131959914);
            }
            z = false;
        }
        C14360o3.A0A(A0t);
        return new C51u(Integer.valueOf(i), Boolean.valueOf(z), A0t);
    }
}
