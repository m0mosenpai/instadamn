package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* loaded from: classes10.dex */
public final class QDN extends WUC {
    public final /* synthetic */ InterfaceC65635Tpw A00;
    public final /* synthetic */ C62943SYl A01;

    public QDN(InterfaceC65635Tpw interfaceC65635Tpw, C62943SYl c62943SYl) {
        this.A01 = c62943SYl;
        this.A00 = interfaceC65635Tpw;
    }

    @Override // X.WUC
    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        LiveLocationSession liveLocationSession = (LiveLocationSession) obj;
        if (liveLocationSession == null) {
            this.A00.onSuccess();
            return;
        }
        C62943SYl c62943SYl = this.A01;
        c62943SYl.A01.A00(new C63924Svz(this.A00, c62943SYl, liveLocationSession), liveLocationSession);
    }

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        throw C00O.createAndThrow();
    }
}
