package X;

/* loaded from: classes10.dex */
public final class TK7 implements Runnable {
    public final /* synthetic */ C64082Syy A00;

    public TK7(C64082Syy c64082Syy) {
        this.A00 = c64082Syy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64082Syy c64082Syy = this.A00;
        Integer num = C05F.A00;
        if (!c64082Syy.A0E) {
            c64082Syy.A0E = true;
            c64082Syy.A0D.A0A();
        }
        c64082Syy.A0D.A0E(num);
    }
}
