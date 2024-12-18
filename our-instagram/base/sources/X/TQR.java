package X;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class TQR implements Runnable {
    public final /* synthetic */ C48532Kv A00;
    public final /* synthetic */ C1114750l A01;
    public final /* synthetic */ C49182Nr A02;
    public final /* synthetic */ UUID A03;

    public TQR(final C48532Kv this$0, final C1114750l val$id, final C49182Nr val$data, final UUID val$future) {
        this.A01 = val$id;
        this.A03 = val$future;
        this.A00 = this$0;
        this.A02 = val$data;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C48412Ki CHq;
        String obj = this.A03.toString();
        C48442Kl.A00();
        String str = C1114750l.A02;
        C48532Kv c48532Kv = this.A00;
        WorkDatabase workDatabase = this.A01.A00;
        workDatabase.beginTransaction();
        try {
            CHq = workDatabase.A05().CHq(obj);
        } finally {
            try {
                return;
            } finally {
            }
        }
        if (CHq != null) {
            if (CHq.A0E == EnumC48482Kp.RUNNING) {
                SD1 sd1 = new SD1(c48532Kv, obj);
                C2TZ c2tz = (C2TZ) workDatabase.A04();
                C1YP c1yp = c2tz.A01;
                c1yp.assertNotSuspendingTransaction();
                c1yp.beginTransaction();
                try {
                    c2tz.A00.insert(sd1);
                    c1yp.setTransactionSuccessful();
                    c1yp.endTransaction();
                } catch (Throwable th) {
                    c1yp.endTransaction();
                    throw th;
                }
            } else {
                C48442Kl.A00();
                android.util.Log.w(str, AnonymousClass001.A0g("Ignoring setProgressAsync(...). WorkSpec (", obj, ") is not in a RUNNING state."));
            }
            this.A02.A07(null);
            workDatabase.setTransactionSuccessful();
            return;
        }
        throw AbstractC166987dD.A14("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    }
}
