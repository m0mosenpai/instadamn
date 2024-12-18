package X;

/* renamed from: X.VlR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69319VlR {
    public int A00;
    public AbstractC65392xb A01 = new UH2(this, 1);
    public final X75 A02;
    public final C2UU A03;
    public final X76 A04;
    public final InterfaceC30920DiX A05;

    public C69319VlR(X75 x75, C2UU c2uu, X76 x76, X78 x78) {
        this.A03 = c2uu;
        this.A02 = x75;
        this.A05 = new WT2(this, (WT3) x78);
        this.A04 = x76;
        this.A00 = c2uu.getItemCount();
        c2uu.registerAdapterDataObserver(this.A01);
    }
}
