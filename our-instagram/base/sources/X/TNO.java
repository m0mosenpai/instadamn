package X;

/* loaded from: classes10.dex */
public final class TNO implements Runnable {
    public final /* synthetic */ SM7 A00;
    public final /* synthetic */ String A01;

    public TNO(SM7 sm7, String str) {
        this.A00 = sm7;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.setText(this.A01);
    }
}
