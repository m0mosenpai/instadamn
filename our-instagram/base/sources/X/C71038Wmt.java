package X;

/* renamed from: X.Wmt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71038Wmt implements InterfaceC125355lh {
    public final /* synthetic */ WEW A00;
    public final /* synthetic */ InterfaceC125355lh A01;

    public C71038Wmt(WEW wew, InterfaceC125355lh interfaceC125355lh) {
        this.A00 = wew;
        this.A01 = interfaceC125355lh;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        this.A00.A05 = false;
        this.A01.onFinish();
    }
}
