package X;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: X.GcO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37322GcO extends AbstractRunnableC14200nk {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ RunnableC37320GcM A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37322GcO(Context context, RunnableC37320GcM runnableC37320GcM, String str, long j) {
        super(154, 4, false, false);
        this.A02 = runnableC37320GcM;
        this.A01 = context;
        this.A03 = str;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A01;
        C61902rr c61902rr = this.A02.A01;
        C28071Xl.A00(context, c61902rr.A01).A03(this.A03);
        C61442r7 c61442r7 = c61902rr.A02;
        long j = this.A00;
        if (c61442r7.A0I.A0V() && C02M.A00()) {
            AbstractC09780fb.A01("ig_cold_start_to_cached_content", 27635112);
            AbstractC09780fb.A00(1056309089);
        }
        C1IZ c1iz = c61442r7.A0H.A01.A00;
        C1IN c1in = c1iz.A01;
        C1IN.A00(c1in).markerPoint(15335435, "CACHED_FEED_UI_RENDER_END", j, TimeUnit.MILLISECONDS);
        c1iz.A00().Egh(C1IT.A08);
    }
}
