package X;

/* renamed from: X.Cd9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28264Cd9 {
    public final float A00;
    public final C6D A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28264Cd9) {
                C28264Cd9 c28264Cd9 = (C28264Cd9) obj;
                if (Float.compare(this.A00, c28264Cd9.A00) != 0 || this.A01 != c28264Cd9.A01 || this.A02 != c28264Cd9.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC25235BEs.A02(this.A00)));
    }

    public C28264Cd9(C6D c6d, float f, boolean z) {
        this.A00 = f;
        this.A01 = c6d;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AssetData(radius=");
        A1C.append(this.A00);
        A1C.append(", assetType=");
        A1C.append(this.A01);
        A1C.append(", isActive=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }

    public C28264Cd9() {
        this(C6D.A02, 6.0f, false);
    }
}
