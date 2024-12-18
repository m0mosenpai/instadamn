package X;

/* loaded from: classes9.dex */
public final class OGI {
    public final OTX A00() {
        OTX otx = OTX.A03;
        if (otx == null) {
            synchronized (this) {
                otx = OTX.A03;
                if (otx == null) {
                    otx = new OTX(AbstractC43592JPx.A0N());
                    OTX.A03 = otx;
                }
            }
        }
        return otx;
    }
}
