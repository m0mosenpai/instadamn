package X;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.SrG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63650SrG implements InterfaceC48932Mm {
    public static final String A0B = C48442Kl.A01("SystemAlarmDispatcher");
    public Intent A00;
    public C2N0 A01;
    public InterfaceC65191TfZ A02;
    public final Context A03;
    public final C2MX A04;
    public final InterfaceC49022Mv A05;
    public final C2L1 A06;
    public final C63649SrF A07;
    public final C62942SYk A08;
    public final C2LC A09;
    public final List A0A;

    public C63650SrG(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A03 = applicationContext;
        this.A01 = new C2N0();
        C2L1 A00 = C2L1.A00(context);
        this.A06 = A00;
        C2L2 c2l2 = A00.A02;
        this.A07 = new C63649SrF(applicationContext, c2l2.A00, this.A01);
        this.A08 = new C62942SYk(c2l2.A02);
        C2MX c2mx = A00.A03;
        this.A04 = c2mx;
        C2LC c2lc = A00.A06;
        this.A09 = c2lc;
        this.A05 = new C49012Mu(c2mx, c2lc);
        c2mx.A02(this);
        this.A0A = AbstractC166987dD.A1E();
        this.A00 = null;
    }

    @Override // X.InterfaceC48932Mm
    public final void DEk(C2WP id, boolean needsReschedule) {
        Executor executor = ((C2LB) this.A09).A02;
        Intent A08 = MSW.A08(this.A03, SystemAlarmService.class);
        A08.setAction("ACTION_EXECUTION_COMPLETED");
        A08.putExtra("KEY_NEEDS_RESCHEDULE", needsReschedule);
        C63649SrF.A00(A08, id);
        RunnableC64725TRh.A00(A08, this, executor, 0);
    }

    public static void A00() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw AbstractC166987dD.A14("Needs to be invoked on the main thread.");
        }
    }

    public static void A01(C63650SrG c63650SrG) {
        A00();
        PowerManager.WakeLock A00 = ST7.A00(c63650SrG.A03, "ProcessCommand");
        try {
            AbstractC09820fg.A00(A00);
            c63650SrG.A06.A06.ATa(new TJK(c63650SrG));
        } finally {
            AbstractC09820fg.A01(A00);
        }
    }

    public final void A02(final Intent intent, final int startId) {
        boolean z;
        C48442Kl.A00();
        String str = A0B;
        A00();
        String action = intent.getAction();
        boolean z2 = false;
        if (TextUtils.isEmpty(action)) {
            C48442Kl.A00();
            android.util.Log.w(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            A00();
            List list = this.A0A;
            synchronized (list) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", startId);
        List list2 = this.A0A;
        synchronized (list2) {
            if (!list2.isEmpty()) {
                z2 = true;
            }
            list2.add(intent);
            if (!z2) {
                A01(this);
            }
        }
    }
}
