package X;

/* renamed from: X.CcS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28222CcS {
    public final C5W3 A00;
    public final C5W3 A01;
    public final C5W3 A02;
    public final C5W3 A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C28222CcS)) {
                C28222CcS c28222CcS = (C28222CcS) obj;
                if (!C14360o3.A0K(this.A03, c28222CcS.A03) || !C14360o3.A0K(this.A00, c28222CcS.A00) || !C14360o3.A0K(this.A01, c28222CcS.A01) || !C14360o3.A0K(this.A02, c28222CcS.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A06 = ((((AbstractC25235BEs.A06(this.A03) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31;
        C5W3 c5w3 = this.A02;
        if (c5w3 != null) {
            i = c5w3.hashCode();
        }
        return A06 + i;
    }

    public C28222CcS(C5W3 c5w3, C5W3 c5w32, C5W3 c5w33, C5W3 c5w34) {
        this.A03 = c5w3;
        this.A00 = c5w32;
        this.A01 = c5w33;
        this.A02 = c5w34;
    }

    public C28222CcS() {
        this(null, null, null, null);
    }
}
