package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class T55 implements InterfaceC65403Tja {
    public final /* synthetic */ AbstractC61584Rq8 A00;
    public final /* synthetic */ InterfaceC65407Tje A01;
    public final /* synthetic */ InterfaceC65250Tgg A02;
    public final /* synthetic */ C58411Pup A03;

    public T55(AbstractC61584Rq8 abstractC61584Rq8, InterfaceC65407Tje interfaceC65407Tje, InterfaceC65250Tgg interfaceC65250Tgg, C58411Pup c58411Pup) {
        this.A00 = abstractC61584Rq8;
        this.A03 = c58411Pup;
        this.A01 = interfaceC65407Tje;
        this.A02 = interfaceC65250Tgg;
    }

    @Override // X.InterfaceC65403Tja
    public final void D6T(Status status) {
        if (status.A00 <= 0) {
            AbstractC61584Rq8 abstractC61584Rq8 = this.A00;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) abstractC61584Rq8;
            C3U5.A09(!basePendingResult.A0C, "Result has already been consumed.");
            try {
                if (!basePendingResult.A0A.await(0L, timeUnit)) {
                    basePendingResult.A08(Status.A0A);
                }
            } catch (InterruptedException unused) {
                basePendingResult.A08(Status.A07);
            }
            C3U5.A09(AbstractC167007dF.A1N((basePendingResult.A0A.getCount() > 0L ? 1 : (basePendingResult.A0A.getCount() == 0L ? 0 : -1))), "Result is not ready.");
            this.A03.A01(this.A01.AK0(BasePendingResult.A00(basePendingResult)));
            return;
        }
        this.A03.A00(S2O.A00(status));
    }
}
