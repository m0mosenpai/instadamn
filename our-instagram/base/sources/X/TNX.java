package X;

/* loaded from: classes10.dex */
public final class TNX implements Runnable {
    public final /* synthetic */ C4Q9 A00;
    public final /* synthetic */ C64082Syy A01;

    public TNX(C4Q9 c4q9, C64082Syy c64082Syy) {
        this.A01 = c64082Syy;
        this.A00 = c4q9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onFailure();
    }
}
