package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.1yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43081yb implements InterfaceC12850lX, InterfaceC13000lm {
    public final UserSession A00;
    public final HashMap A01;
    public final Handler A02;
    public final HashMap A03;

    public C43081yb(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new HashMap();
        this.A03 = new HashMap();
        this.A02 = new Handler(Looper.getMainLooper());
    }

    @Override // X.InterfaceC12850lX
    public final void Cuw(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cux(Activity activity) {
        C14360o3.A0B(activity, 0);
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36314828956044106L)) {
            this.A01.put(activity, new OCD(activity, userSession, new C57215Paz(this)));
        }
    }

    @Override // X.InterfaceC12850lX
    public final void Cuy(Activity activity) {
        C14360o3.A0B(activity, 0);
        Runnable runnable = (Runnable) this.A03.remove(activity);
        if (runnable != null) {
            runnable.run();
        }
        this.A01.remove(activity);
    }

    @Override // X.InterfaceC12850lX
    public final void Cv0(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv5(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv6(Activity activity) {
        C14360o3.A0B(activity, 0);
        Runnable runnable = (Runnable) this.A03.get(activity);
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
        }
        OCD ocd = (OCD) this.A01.get(activity);
        if (ocd != null) {
            ocd.A01.A00();
        }
    }

    @Override // X.InterfaceC12850lX
    public final void Cv7(Activity activity) {
        C14360o3.A0B(activity, 0);
        HashMap hashMap = this.A03;
        Runnable runnable = (Runnable) hashMap.get(activity);
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
        }
        PRJ prj = new PRJ(activity, this);
        hashMap.put(activity, prj);
        this.A02.postDelayed(prj, 1000L);
    }

    @Override // X.InterfaceC12850lX
    public final void Cv8(Activity activity, boolean z) {
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC12860lY.A08(this);
    }
}
