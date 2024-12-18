package X;

/* loaded from: classes11.dex */
public final class X6G extends C0YT {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X6G(Object obj, int i) {
        super(obj);
        this.A00 = i;
    }

    @Override // X.C0YT
    public final void A00(Object obj, Object obj2, C0YR c0yr) {
        int i = this.A00;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        WFS wfs = WFS.A0E;
        if (i != 0) {
            WFS.A02(wfs, AbstractC167017dG.A1b(wfs, WFS.A0G, WFS.A0J, 0), booleanValue);
        } else {
            WFS.A02(wfs, booleanValue, AbstractC167017dG.A1b(wfs, WFS.A0H, WFS.A0J, 1));
        }
    }
}
