package X;

import java.util.List;

/* renamed from: X.Wwi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71586Wwi implements Runnable {
    public final /* synthetic */ InterfaceC65635Tpw A00;
    public final /* synthetic */ C70452WWf A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public RunnableC71586Wwi(InterfaceC65635Tpw interfaceC65635Tpw, C70452WWf c70452WWf, String str, List list) {
        this.A01 = c70452WWf;
        this.A02 = str;
        this.A03 = list;
        this.A00 = interfaceC65635Tpw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C70452WWf c70452WWf = this.A01;
        c70452WWf.A00.FDH(new WU8(this.A00, c70452WWf.A01), this.A02, this.A03);
    }
}
