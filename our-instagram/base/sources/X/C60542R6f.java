package X;

import com.facebook.rsys.log.gen.CallSummaryInfo;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.R6f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60542R6f extends LogPersistenceProxy {
    public SW0 A00;
    public C1B4 A01;
    public ExecutorService A02;

    @Override // com.facebook.rsys.log.gen.LogPersistenceProxy
    public final void deleteCallSummaryLog(String str) {
        C14360o3.A0B(str, 0);
        SW0 sw0 = this.A00;
        sw0.A00.execute(new RunnableC64640TNw(sw0, str));
    }

    public C60542R6f() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.A02 = newSingleThreadExecutor;
        C1B4 A00 = AbstractC23881Ey.A00();
        this.A01 = A00;
        this.A00 = new SW0(A00, newSingleThreadExecutor);
    }

    @Override // com.facebook.rsys.log.gen.LogPersistenceProxy
    public final void writeCallSummaryLog(CallSummaryInfo callSummaryInfo, String str) {
        AbstractC167017dG.A1N(callSummaryInfo, str);
        SW0 sw0 = this.A00;
        sw0.A00.execute(new YIC(sw0, callSummaryInfo, str));
    }
}
