package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;

/* renamed from: X.1VJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VJ extends C1VL {
    public Handler A00;
    public boolean A01;
    public final Context A02;

    @Override // X.C1VL
    public final synchronized boolean A00(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4, String str5) {
        if (this.A01 || !(abstractC12990ll instanceof UserSession)) {
            return false;
        }
        this.A01 = true;
        UserSession userSession = (UserSession) abstractC12990ll;
        Handler handler = this.A00;
        if (handler == null || handler.getLooper() == null) {
            this.A00 = new Handler(Looper.getMainLooper());
        }
        C14120nc.A00().ATO(new C32670EZu(userSession, this, C17060sy.A01.A01(userSession), str4, str5, str2, str3));
        return true;
    }

    public C1VJ() {
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        this.A02 = context;
    }
}
