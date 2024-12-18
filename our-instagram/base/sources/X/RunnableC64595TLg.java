package X;

/* renamed from: X.TLg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64595TLg implements Runnable {
    public final /* synthetic */ InterfaceC65635Tpw A00;

    public RunnableC64595TLg(InterfaceC65635Tpw interfaceC65635Tpw) {
        this.A00 = interfaceC65635Tpw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onError(new Throwable("Failed live location update to server"));
    }
}
