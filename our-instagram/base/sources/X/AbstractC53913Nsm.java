package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Nsm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53913Nsm {
    public static final File A00(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 0);
        if (C04100Kb.A00(AbstractC25225BEi.A0F(userSession)) >= 2016) {
            String A0D = AbstractC916948n.A0D(null, i, false);
            String A0g = AnonymousClass001.A0g(AbstractC916948n.A08(System.currentTimeMillis()), "_recorded", ".mp4");
            final File A0w = MSW.A0w(AbstractC23881Ey.A00().CHo(null, 554767808), A0D);
            Handler handler = AbstractC916948n.A00;
            if (handler == null) {
                handler = new Handler(C1CG.A00());
                AbstractC916948n.A00 = handler;
            }
            handler.post(new Runnable() { // from class: X.POY
                @Override // java.lang.Runnable
                public final void run() {
                    A0w.mkdirs();
                }
            });
            return AbstractC166987dD.A11(MSW.A0w(A0w, A0g).getPath());
        }
        return AbstractC166987dD.A11(AbstractC916948n.A0C(AbstractC916948n.A0D(null, i, false)));
    }
}
