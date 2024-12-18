package X;

/* renamed from: X.Wvk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71535Wvk implements Runnable {
    public final /* synthetic */ InterfaceC65635Tpw A00;
    public final /* synthetic */ C7CX A01;
    public final /* synthetic */ String A02;

    public RunnableC71535Wvk(InterfaceC65635Tpw interfaceC65635Tpw, C7CX c7cx, String str) {
        this.A01 = c7cx;
        this.A02 = str;
        this.A00 = interfaceC65635Tpw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7CX c7cx = this.A01;
        c7cx.A00.AOk(new WU8(this.A00, c7cx.A01), this.A02);
    }
}
