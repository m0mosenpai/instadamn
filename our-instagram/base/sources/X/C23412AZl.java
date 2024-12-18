package X;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.AZl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23412AZl implements InterfaceC25203BDb {
    public final int A00;
    public final Object A01;

    public C23412AZl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC25203BDb
    public final void D2K(C212409b9 c212409b9) {
        if (this.A00 != 0) {
            C24201AoO.A01((C24201AoO) this.A01, "Controller capture failed", c212409b9);
            return;
        }
        C23467Aae c23467Aae = (C23467Aae) this.A01;
        c23467Aae.A07 = c212409b9;
        CountDownLatch countDownLatch = c23467Aae.A05;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.countDown();
    }

    @Override // X.InterfaceC25203BDb
    public final void D2M() {
        if (this.A00 != 0) {
            C24201AoO c24201AoO = (C24201AoO) this.A01;
            if (c24201AoO.A03) {
                c24201AoO.A02 = null;
                c24201AoO.A03 = false;
            }
            if (c24201AoO.A04) {
                c24201AoO.A07.DdZ();
            }
            c24201AoO.A04 = true;
            return;
        }
        CountDownLatch countDownLatch = ((C23467Aae) this.A01).A05;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.countDown();
    }

    @Override // X.InterfaceC25203BDb
    public final void D2S(long j) {
        if (this.A00 != 0) {
            C24201AoO c24201AoO = (C24201AoO) this.A01;
            c24201AoO.A07.DdX(true);
            c24201AoO.A05.postDelayed(new RunnableC24507AtQ(c24201AoO), 100L);
            return;
        }
        ((C23467Aae) this.A01).A03.A02(Y1s.A0W, Long.valueOf(j));
    }

    @Override // X.InterfaceC25203BDb
    public final long now() {
        if (this.A00 != 0) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime();
    }
}
