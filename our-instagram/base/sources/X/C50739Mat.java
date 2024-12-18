package X;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.Mat, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50739Mat extends ContentObserver {
    public int A00;
    public final O1W A01;
    public final /* synthetic */ OEF A02;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50739Mat(Handler handler, O1W o1w, OEF oef) {
        super(handler);
        this.A02 = oef;
        this.A01 = o1w;
        this.A00 = -1;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        OEF oef = this.A02;
        RunnableC56963PPe runnableC56963PPe = new RunnableC56963PPe(this, oef);
        ExecutorService executorService = oef.A05;
        C53738Npq c53738Npq = oef.A01;
        if (c53738Npq instanceof N0A) {
            if (C18U.A06(C06090Tz.A05, ((N0A) c53738Npq).A00, 36316151806300173L)) {
                Future future = oef.A02;
                if (future == null || future.isDone()) {
                    oef.A02 = executorService.submit(runnableC56963PPe);
                    return;
                }
                return;
            }
        }
        runnableC56963PPe.run();
    }
}
