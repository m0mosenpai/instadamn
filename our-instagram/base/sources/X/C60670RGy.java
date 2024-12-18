package X;

/* renamed from: X.RGy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60670RGy extends AbstractC60671RGz {
    public final SWk A00;
    public final C58411Pup A01;
    public final InterfaceC1335661b A02;

    public C60670RGy(InterfaceC1335661b interfaceC1335661b, SWk sWk, C58411Pup c58411Pup, int i) {
        super(i);
        this.A01 = c58411Pup;
        this.A00 = sWk;
        this.A02 = interfaceC1335661b;
        if (i == 2 && sWk.A01) {
            throw AbstractC166987dD.A12("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
}
