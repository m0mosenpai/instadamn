package X;

/* loaded from: classes9.dex */
public final class PO6 implements Runnable {
    public final /* synthetic */ C51474MoL A00;

    public PO6(C51474MoL c51474MoL) {
        this.A00 = c51474MoL;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Float f = C51474MoL.A0F;
        if (f != null) {
            C51474MoL c51474MoL = this.A00;
            c51474MoL.A09.setX(f.floatValue());
        }
        Float f2 = C51474MoL.A0G;
        if (f2 != null) {
            C51474MoL c51474MoL2 = this.A00;
            c51474MoL2.A09.setY(f2.floatValue());
        }
    }
}
