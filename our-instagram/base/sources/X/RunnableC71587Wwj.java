package X;

import com.facebook.locationsharing.core.models.LiveLocationSharer;

/* renamed from: X.Wwj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71587Wwj implements Runnable {
    public final /* synthetic */ InterfaceC65635Tpw A00;
    public final /* synthetic */ C70452WWf A01;
    public final /* synthetic */ LiveLocationSharer A02;
    public final /* synthetic */ String A03;

    public RunnableC71587Wwj(InterfaceC65635Tpw interfaceC65635Tpw, C70452WWf c70452WWf, LiveLocationSharer liveLocationSharer, String str) {
        this.A01 = c70452WWf;
        this.A03 = str;
        this.A02 = liveLocationSharer;
        this.A00 = interfaceC65635Tpw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C70452WWf c70452WWf = this.A01;
        C7CU c7cu = c70452WWf.A00;
        String str = this.A03;
        c7cu.FDG(new WU8(this.A00, c70452WWf.A01), this.A02, str);
    }
}
