package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.Wvj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71534Wvj implements Runnable {
    public final /* synthetic */ InterfaceC65635Tpw A00;
    public final /* synthetic */ C7CX A01;
    public final /* synthetic */ LiveLocationSession A02;

    public RunnableC71534Wvj(InterfaceC65635Tpw interfaceC65635Tpw, C7CX c7cx, LiveLocationSession liveLocationSession) {
        this.A01 = c7cx;
        this.A02 = liveLocationSession;
        this.A00 = interfaceC65635Tpw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7CX c7cx = this.A01;
        c7cx.A00.FDF(new WU8(this.A00, c7cx.A01), this.A02);
    }
}
