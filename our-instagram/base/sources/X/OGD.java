package X;

/* loaded from: classes9.dex */
public final class OGD {
    public final OTB A00() {
        OTB otb = OTB.A02;
        if (otb == null) {
            synchronized (this) {
                otb = OTB.A02;
                if (otb == null) {
                    otb = new OTB();
                    OTB.A02 = otb;
                }
            }
        }
        return otb;
    }
}
