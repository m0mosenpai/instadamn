package X;

/* loaded from: classes10.dex */
public final class TR4 implements Runnable {
    public final /* synthetic */ InterfaceC65388TjL A00;
    public final /* synthetic */ SZ5 A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Throwable A04;

    public TR4(InterfaceC65388TjL interfaceC65388TjL, SZ5 sz5, Object obj, String str, Throwable th) {
        this.A01 = sz5;
        this.A00 = interfaceC65388TjL;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.Dgi(this.A02, this.A03, this.A04);
    }
}
