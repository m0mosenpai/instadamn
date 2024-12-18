package X;

/* loaded from: classes6.dex */
public final class GOS implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public GOS(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A0D = this.A01;
        A0K.A0I = this.A00;
        A0K.A06();
        AbstractC25233BEq.A1F(A0K);
    }
}
