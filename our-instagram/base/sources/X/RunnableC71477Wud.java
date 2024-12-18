package X;

/* renamed from: X.Wud, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71477Wud implements Runnable {
    public final /* synthetic */ V0X A00;
    public final /* synthetic */ C149686oL A01;

    public RunnableC71477Wud(V0X v0x, C149686oL c149686oL) {
        this.A00 = v0x;
        this.A01 = c149686oL;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V0X v0x = this.A00;
        C5SU c5su = new C5SU(v0x.requireActivity(), this.A01);
        C66359UCf c66359UCf = v0x.A0D;
        if (c66359UCf == null) {
            C14360o3.A0F("multiDestinationRadioButton");
            throw C00O.createAndThrow();
        }
        c5su.A03(c66359UCf);
        c5su.A0B = true;
        c5su.A01();
        AbstractC166997dE.A1P(c5su);
    }
}
