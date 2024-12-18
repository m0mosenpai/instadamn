package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.SYl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62943SYl {
    public final C7CW A00;
    public final C7CY A01;
    public final LiveLocationSession A02;
    public final String A03;

    public final void A00(InterfaceC65635Tpw interfaceC65635Tpw) {
        LiveLocationSession liveLocationSession = this.A02;
        if (liveLocationSession != null) {
            this.A01.A00(new C63924Svz(interfaceC65635Tpw, this, liveLocationSession), liveLocationSession);
            return;
        }
        this.A00.AYs(new QDN(interfaceC65635Tpw, this), this.A03);
    }

    public C62943SYl(C7CW c7cw, LiveLocationSession liveLocationSession, C7CY c7cy) {
        this.A01 = c7cy;
        this.A00 = c7cw;
        this.A03 = liveLocationSession.A02;
        this.A02 = liveLocationSession;
    }

    public C62943SYl(C7CW c7cw, C7CY c7cy, String str) {
        this.A01 = c7cy;
        this.A00 = c7cw;
        this.A03 = str;
        this.A02 = null;
    }
}
