package X;

/* loaded from: classes6.dex */
public final class GO8 implements Runnable {
    public final /* synthetic */ C34435FFz A00;
    public final /* synthetic */ String A01;

    public GO8(C34435FFz c34435FFz, String str) {
        this.A00 = c34435FFz;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34435FFz c34435FFz = this.A00;
        String str = this.A01;
        C36010Fv8 c36010Fv8 = c34435FFz.A00;
        c36010Fv8.A04(str);
        C36684GFe c36684GFe = c36010Fv8.A02;
        c36684GFe.A0H = true;
        c36684GFe.A01 = new EY2(str);
    }
}
