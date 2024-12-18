package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import java.util.concurrent.Executor;

/* renamed from: X.7CX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7CX implements C7CW {
    public final C7CW A00;
    public final Executor A01;
    public final Executor A02;

    @Override // X.C7CW
    public final void AOk(InterfaceC65635Tpw interfaceC65635Tpw, String str) {
        this.A02.execute(new RunnableC71535Wvk(interfaceC65635Tpw, this, str));
    }

    @Override // X.C7CW
    public final void AYs(WUC wuc, String str) {
        this.A02.execute(new RunnableC71533Wvi(wuc, this, str));
    }

    @Override // X.C7CW
    public final void AYt(InterfaceC65636Tpx interfaceC65636Tpx) {
        this.A02.execute(new RunnableC71414Wtc(interfaceC65636Tpx, this));
    }

    @Override // X.C7CW
    public final void FDF(InterfaceC65635Tpw interfaceC65635Tpw, LiveLocationSession liveLocationSession) {
        this.A02.execute(new RunnableC71534Wvj(interfaceC65635Tpw, this, liveLocationSession));
    }

    public C7CX(C7CW c7cw, Executor executor, Executor executor2) {
        this.A00 = c7cw;
        this.A02 = executor;
        this.A01 = executor2;
    }
}
