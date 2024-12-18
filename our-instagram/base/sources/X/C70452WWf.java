package X;

import com.facebook.locationsharing.core.models.LiveLocationSharer;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.WWf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70452WWf implements C7CU {
    public final C7CU A00;
    public final Executor A01;
    public final Executor A02;

    @Override // X.C7CU
    public final void BuS(InterfaceC65636Tpx interfaceC65636Tpx, String str) {
        this.A02.execute(new RunnableC71536Wvl(interfaceC65636Tpx, this, str));
    }

    @Override // X.C7CU
    public final void FDG(InterfaceC65635Tpw interfaceC65635Tpw, LiveLocationSharer liveLocationSharer, String str) {
        this.A02.execute(new RunnableC71587Wwj(interfaceC65635Tpw, this, liveLocationSharer, str));
    }

    @Override // X.C7CU
    public final void FDH(InterfaceC65635Tpw interfaceC65635Tpw, String str, List list) {
        this.A02.execute(new RunnableC71586Wwi(interfaceC65635Tpw, this, str, list));
    }

    public C70452WWf(C7CU c7cu, Executor executor, Executor executor2) {
        this.A00 = c7cu;
        this.A02 = executor;
        this.A01 = executor2;
    }
}
