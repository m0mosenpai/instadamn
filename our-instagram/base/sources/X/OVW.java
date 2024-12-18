package X;

/* loaded from: classes9.dex */
public final class OVW {
    public static OVW A01;
    public C56155OwM A00;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.OVW, java.lang.Object] */
    public static synchronized OVW A00() {
        OVW ovw;
        synchronized (OVW.class) {
            OVW ovw2 = A01;
            ovw = ovw2;
            if (ovw2 == null) {
                ?? obj = new Object();
                A01 = obj;
                ovw = obj;
            }
        }
        return ovw;
    }

    public final void A01(InterfaceC58022Po8 interfaceC58022Po8, C1P1 c1p1) {
        C56155OwM c56155OwM = this.A00;
        if (c56155OwM == null) {
            interfaceC58022Po8.onFinish();
            return;
        }
        C55832Oqi c55832Oqi = new C55832Oqi(this, interfaceC58022Po8);
        if (c56155OwM.A05) {
            C56155OwM.A00(c55832Oqi, c56155OwM, c1p1);
        } else {
            c56155OwM.A01 = c55832Oqi;
            c56155OwM.A02 = c1p1;
        }
    }
}
