package X;

import android.content.Context;
import android.util.Size;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.41C, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C41C {
    public static final Size A00(Context context, UserSession userSession, C38321qM c38321qM, int i, boolean z) {
        int i2;
        ExtendedImageUrl A1q = c38321qM.A1q(context);
        if (A1q != null && C903540u.A00.A01(userSession, c38321qM)) {
            i2 = AbstractC13690mv.A01(userSession.deviceSession.A06(), (int) C18U.A01(C06090Tz.A05, userSession, 36612143772670313L));
        } else {
            i2 = 0;
        }
        Size A01 = C86193sq.A00.A01(context, A1q, i, i2);
        if (A01 == null) {
            return null;
        }
        if (i2 <= 0) {
            if (c38321qM.A6P() && C41754IeU.A02(userSession)) {
                return new Size((int) (A01.getWidth() * 0.83f), (int) (A01.getHeight() * 0.83f));
            }
            if (z) {
                return null;
            }
        }
        return A01;
    }
}
