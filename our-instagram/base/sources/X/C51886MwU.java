package X;

/* renamed from: X.MwU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51886MwU extends C0T6 implements InterfaceC57855PlL {
    public final boolean A00;
    public final boolean A01;

    public C51886MwU() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51886MwU) {
                C51886MwU c51886MwU = (C51886MwU) obj;
                if (this.A01 != c51886MwU.A01 || this.A00 != c51886MwU.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC25225BEi.A08(this.A01));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcLoungeModel(show=");
        A1C.append(this.A01);
        A1C.append(", isAudioOn=");
        return AbstractC25236BEt.A0a(A1C, this.A00);
    }

    public C51886MwU(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
