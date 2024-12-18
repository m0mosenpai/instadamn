package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final /* synthetic */ class TJI implements Runnable {
    public final /* synthetic */ C63651SrH A00;

    public /* synthetic */ TJI(C63651SrH c63651SrH) {
        this.A00 = c63651SrH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63651SrH c63651SrH = this.A00;
        C2WP c2wp = c63651SrH.A08;
        String str = c2wp.A01;
        if (c63651SrH.A00 < 2) {
            c63651SrH.A00 = 2;
            C48442Kl.A00();
            Context context = c63651SrH.A04;
            Intent A08 = MSW.A08(context, SystemAlarmService.class);
            A08.setAction("ACTION_STOP_WORK");
            C63649SrF.A00(A08, c2wp);
            Executor executor = c63651SrH.A09;
            C63650SrG c63650SrG = c63651SrH.A06;
            int i = c63651SrH.A03;
            RunnableC64725TRh.A00(A08, c63650SrG, executor, i);
            boolean A05 = c63650SrG.A04.A05(str);
            C48442Kl.A00();
            if (A05) {
                Intent A082 = MSW.A08(context, SystemAlarmService.class);
                A082.setAction("ACTION_SCHEDULE_WORK");
                C63649SrF.A00(A082, c2wp);
                RunnableC64725TRh.A00(A082, c63650SrG, executor, i);
                return;
            }
            return;
        }
        C48442Kl.A00();
    }
}
