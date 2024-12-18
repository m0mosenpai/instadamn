package X;

/* loaded from: classes10.dex */
public final class TQZ implements Runnable {
    public final /* synthetic */ InterfaceC65622ToD A00;
    public final /* synthetic */ SEA A01;
    public final /* synthetic */ SZ5 A02;
    public final /* synthetic */ String A03;

    public TQZ(InterfaceC65622ToD interfaceC65622ToD, SEA sea, SZ5 sz5, String str) {
        this.A02 = sz5;
        this.A01 = sea;
        this.A03 = str;
        this.A00 = interfaceC65622ToD;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A01(new T3S(this.A00, 0), this.A01, this.A03, AbstractC166987dD.A1H(), C2FP.A06().A00.A03);
    }
}
