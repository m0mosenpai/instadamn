package X;

/* renamed from: X.XOx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72125XOx extends C56J {
    public final /* synthetic */ C72126XOy A00;

    public C72125XOx(C72126XOy c72126XOy) {
        this.A00 = c72126XOy;
    }

    @Override // X.C56J
    public final String A05() {
        C72123XOu c72123XOu = (C72123XOu) this.A00.A01.get();
        if (c72123XOu == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("tag=[");
        A1C.append(c72123XOu.A02);
        return AbstractC58319PtB.A0w(A1C);
    }
}
