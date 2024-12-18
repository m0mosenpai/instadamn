package X;

/* loaded from: classes5.dex */
public final class BZQ extends BHD {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BZQ)) {
            return false;
        }
        BHD bhd = (BHD) obj;
        return C14360o3.A0K(bhd.A01, this.A01) && C14360o3.A0K(bhd.A00, this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC25235BEs.A06(this.A01) * 31 * 31);
    }
}
