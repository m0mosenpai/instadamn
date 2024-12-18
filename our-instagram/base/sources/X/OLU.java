package X;

/* loaded from: classes9.dex */
public final class OLU {
    public final OLe A00;
    public final boolean A01;

    public OLU(OLe oLe, boolean z) {
        C14360o3.A0B(oLe, 1);
        this.A00 = oLe;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OLU) {
                OLU olu = (OLU) obj;
                if (!C14360o3.A0K(this.A00, olu.A00) || this.A01 != olu.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StickerEditRequest(uploadEditInputData=");
        A1C.append(this.A00);
        A1C.append(", optimisticallySaveSticker=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}
