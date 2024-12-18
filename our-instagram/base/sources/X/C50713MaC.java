package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.MaC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50713MaC {
    public static final C55105ObK A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C55105ObK) userSession.A01(C55105ObK.class, new C50156MDj(userSession, 42));
    }

    public static final void A01(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 0);
        C55105ObK c55105ObK = (C55105ObK) userSession.A00(C55105ObK.class);
        if (c55105ObK != null) {
            synchronized (c55105ObK) {
                AbstractC13530mf.A0A(AbstractC50522MSa.A0g(context));
                File file = c55105ObK.A02;
                if (file != null) {
                    file.delete();
                }
                c55105ObK.A06.removeCallbacksAndMessages(null);
                c55105ObK.A03 = null;
                c55105ObK.A01 = null;
                c55105ObK.A07.evictAll();
                final C54790OJi c54790OJi = c55105ObK.A00;
                if (c54790OJi != null) {
                    c54790OJi.A08 = true;
                    c54790OJi.A04.post(new Runnable() { // from class: X.MaE
                        @Override // java.lang.Runnable
                        public final void run() {
                            C54790OJi c54790OJi2 = C54790OJi.this;
                            C178577wV c178577wV = c54790OJi2.A00;
                            if (c178577wV != null) {
                                c54790OJi2.A00 = null;
                                c54790OJi2.A01 = null;
                                c54790OJi2.A08 = false;
                                c54790OJi2.A04.removeCallbacks(c54790OJi2.A06);
                                c178577wV.A04();
                            }
                        }
                    });
                    c55105ObK.A00 = null;
                }
            }
        }
        userSession.A03(C55105ObK.class);
    }

    public final File A02(Context context, int i) {
        File A11 = AbstractC166987dD.A11(AbstractC50522MSa.A0g(context));
        if (!A11.exists() && !A11.mkdir()) {
            return null;
        }
        return MSW.A0w(A11, AnonymousClass001.A0c("icon_", ".jpg", i));
    }
}
