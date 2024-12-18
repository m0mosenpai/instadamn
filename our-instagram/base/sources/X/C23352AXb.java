package X;

/* renamed from: X.AXb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23352AXb implements InterfaceC48212Jk {
    public final /* synthetic */ AA6 A00;

    public C23352AXb(AA6 aa6) {
        this.A00 = aa6;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C0K8.A0C("FXIGAccessLibrarySSOAndRegFlagNetworkManager", AbstractC167017dG.A0n(th, "Fetch failed: ", AbstractC166987dD.A1C()));
        AA6 aa6 = this.A00;
        C0K8.A0C("FXIGAccessLibrarySSOAndRegFlagAppJob", "App start fetch failed");
        BD7 bd7 = aa6.A03;
        if (bd7 != null) {
            bd7.onFailure();
        }
    }
}
