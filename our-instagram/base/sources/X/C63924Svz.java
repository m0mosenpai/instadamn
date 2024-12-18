package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.Svz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63924Svz implements InterfaceC65635Tpw {
    public final /* synthetic */ InterfaceC65635Tpw A00;
    public final /* synthetic */ C62943SYl A01;
    public final /* synthetic */ LiveLocationSession A02;

    public C63924Svz(InterfaceC65635Tpw interfaceC65635Tpw, C62943SYl c62943SYl, LiveLocationSession liveLocationSession) {
        this.A01 = c62943SYl;
        this.A02 = liveLocationSession;
        this.A00 = interfaceC65635Tpw;
    }

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        this.A00.onError(th);
    }

    @Override // X.InterfaceC65635Tpw
    public final void onSuccess() {
        this.A01.A00.AOk(this.A00, this.A02.A02);
    }
}
