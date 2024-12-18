package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.366, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass366 extends AbstractC682735p {
    public Runnable A00;
    public final Handler A01;
    public final UserSession A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        View view = (View) ((AbstractC682735p) this).A00.get(c59062n7.A03);
        if (view instanceof AbstractC115835Lx) {
            AbstractC115835Lx abstractC115835Lx = (AbstractC115835Lx) view;
            float CGk = interfaceC57162jr.CGk(c59062n7);
            UserSession userSession = this.A02;
            C06090Tz c06090Tz = C06090Tz.A05;
            double A00 = C18U.A00(c06090Tz, userSession, 37157647568404543L);
            double d = CGk;
            if (d >= A00) {
                if (!abstractC115835Lx.isPlaying()) {
                    double A002 = C18U.A00(c06090Tz, userSession, 37157647568470080L);
                    if (A002 <= 0.0d) {
                        abstractC115835Lx.EKd();
                        return;
                    } else {
                        if (this.A00 != null) {
                            return;
                        }
                        RunnableC29583D1k runnableC29583D1k = new RunnableC29583D1k(abstractC115835Lx, this);
                        this.A00 = runnableC29583D1k;
                        this.A01.postDelayed(runnableC29583D1k, (long) (A002 * 1000.0d));
                        return;
                    }
                }
                return;
            }
            if (d < A00 && CGk > 0.0f) {
                Runnable runnable = this.A00;
                if (runnable != null) {
                    this.A01.removeCallbacks(runnable);
                    this.A00 = null;
                }
                abstractC115835Lx.pause();
                return;
            }
            Runnable runnable2 = this.A00;
            if (runnable2 != null) {
                this.A01.removeCallbacks(runnable2);
                this.A00 = null;
            }
            abstractC115835Lx.stop();
        }
    }

    public AnonymousClass366(UserSession userSession, Map map) {
        super(map);
        this.A02 = userSession;
        this.A01 = new Handler(Looper.getMainLooper());
    }
}
