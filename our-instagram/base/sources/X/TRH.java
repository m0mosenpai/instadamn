package X;

/* loaded from: classes10.dex */
public final class TRH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C64078Syu A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public TRH(C64078Syu c64078Syu, String str, String str2, String str3, String str4, int i) {
        this.A01 = c64078Syu;
        this.A00 = i;
        this.A02 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00.onError(this.A00, this.A02, this.A05, this.A04, this.A03);
    }
}
