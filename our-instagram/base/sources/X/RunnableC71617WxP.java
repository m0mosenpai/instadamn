package X;

import java.util.Map;

/* renamed from: X.WxP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71617WxP implements Runnable {
    public final /* synthetic */ C6PT A00;
    public final /* synthetic */ WY2 A01;
    public final /* synthetic */ AbstractC115825Lw A02;
    public final /* synthetic */ InterfaceC115855Lz A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public RunnableC71617WxP(C6PT c6pt, WY2 wy2, AbstractC115825Lw abstractC115825Lw, InterfaceC115855Lz interfaceC115855Lz, String str, Map map) {
        this.A04 = str;
        this.A02 = abstractC115825Lw;
        this.A03 = interfaceC115855Lz;
        this.A01 = wy2;
        this.A05 = map;
        this.A00 = c6pt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = this.A04;
            if (str != null) {
                InterfaceC115855Lz interfaceC115855Lz = this.A03;
                interfaceC115855Lz.AUw(interfaceC115855Lz, this.A00, this.A01, interfaceC115855Lz, str, this.A05);
            }
        } catch (C902840n unused) {
            C11T.A02(new RunnableC71260Wqp(new RunnableC71259Wqo(this.A03)));
        }
    }
}
