package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.MbJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC50753MbJ extends Handler {
    public final /* synthetic */ N5Z A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC50753MbJ(Looper looper, N5Z n5z) {
        super(looper);
        this.A00 = n5z;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        FragmentActivity activity;
        Handler handler;
        Runnable runnable;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                N5Z n5z = this.A00;
                if (n5z.A0n != null) {
                    handler = n5z.A0c;
                    runnable = new Runnable() { // from class: X.PMG
                        @Override // java.lang.Runnable
                        public final void run() {
                            N5Z n5z2 = HandlerC50753MbJ.this.A00;
                            if (!n5z2.A0W && n5z2.A0n != null) {
                                n5z2.A0W = true;
                                n5z2.A0n.A02();
                            }
                        }
                    };
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            N5Z n5z2 = this.A00;
            if (n5z2.A0n != null || (activity = n5z2.getActivity()) == null) {
                return;
            }
            UserSession userSession = n5z2.A0B;
            C14360o3.A0B(userSession, 0);
            n5z2.A0n = ((OGm) userSession.A01(NM0.class, new C50152MDf(userSession, 44))).createGooglePlayLocationSettingsController(activity, n5z2.A0B, n5z2.A0d, "nearby_venues", "find_nearby_venues");
            if (n5z2.A0n == null) {
                return;
            }
            handler = n5z2.A0c;
            runnable = new Runnable() { // from class: X.PMF
                @Override // java.lang.Runnable
                public final void run() {
                    N5Z n5z3 = HandlerC50753MbJ.this.A00;
                    if (n5z3.isResumed() && n5z3.A0n != null) {
                        n5z3.registerLifecycleListener(n5z3.A0n);
                    }
                }
            };
        }
        handler.post(runnable);
    }
}
