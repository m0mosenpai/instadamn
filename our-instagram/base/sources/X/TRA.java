package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class TRA implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C64446TEg A01;
    public final /* synthetic */ SO9 A02;
    public final /* synthetic */ AbstractC53512Nle A03;
    public final /* synthetic */ String A04;

    public TRA(C64446TEg c64446TEg, SO9 so9, AbstractC53512Nle abstractC53512Nle, String str, int i) {
        this.A03 = abstractC53512Nle;
        this.A01 = c64446TEg;
        this.A04 = str;
        this.A00 = i;
        this.A02 = so9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = ((NRV) this.A03).A00.A07;
        if (str != null) {
            Map map = this.A01.A03;
            map.put(this.A04, str);
            if (map.size() >= this.A00) {
                this.A02.A01(AbstractC06930Yk.A0B(map));
                return;
            }
            return;
        }
        C64446TEg c64446TEg = this.A01;
        c64446TEg.A01.post(new RunnableC64665TOw(c64446TEg, this.A02));
    }
}
