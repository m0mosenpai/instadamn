package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JQb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43596JQb implements InterfaceC65626Tpm {
    public Runnable A00;
    public final Context A01;
    public final UserSession A02;
    public final Handler A03;
    public final C26771Rh A04;
    public final java.util.Set A05;

    public C43596JQb(Context context, Handler handler, C26771Rh c26771Rh, UserSession userSession, java.util.Set set) {
        AbstractC167007dF.A1G(handler, 3, set);
        this.A02 = userSession;
        this.A01 = context;
        this.A03 = handler;
        this.A04 = c26771Rh;
        this.A05 = set;
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onResume(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStart(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        Runnable runnable = this.A00;
        if (runnable != null) {
            try {
                this.A03.removeCallbacks(runnable);
            } catch (Exception e) {
                C0K8.A0C("ResetToFeedLifecycleObserver", AbstractC167017dG.A0n(e, "onStart, unable to remove callback: ", AbstractC166987dD.A1C()));
            }
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStop(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        M24 m24 = new M24(this);
        this.A00 = m24;
        if (!this.A05.contains(this.A04.A00)) {
            this.A03.postDelayed(m24, TimeUnit.SECONDS.toMillis(C18U.A01(C06090Tz.A05, this.A02, 36601964699586974L)));
        }
    }
}
