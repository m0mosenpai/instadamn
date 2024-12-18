package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class M55 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C51762Yz A01;
    public final /* synthetic */ C25562BRz A02;

    public M55(Handler handler, C51762Yz c51762Yz, C25562BRz c25562BRz) {
        this.A01 = c51762Yz;
        this.A00 = handler;
        this.A02 = c25562BRz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C51762Yz c51762Yz = this.A01;
        c51762Yz.A00();
        Handler handler = this.A00;
        RunnableC49851Lzw runnableC49851Lzw = new RunnableC49851Lzw(c51762Yz);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        UserSession userSession = this.A02.A04;
        handler.postDelayed(runnableC49851Lzw, timeUnit.toMillis(C18U.A01(AbstractC166997dE.A0U(userSession), userSession, 36604571745981525L)));
    }
}
