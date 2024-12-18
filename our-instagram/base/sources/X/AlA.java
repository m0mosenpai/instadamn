package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class AlA implements C5NL {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AlA alA = (AlA) obj;
            if (!C2I7.A00(this.A02, alA.A02) || !C2I7.A00(this.A01, alA.A01) || !C2I7.A00(this.A00, alA.A00) || !C2I7.A00(this.A03, alA.A03)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00, this.A03});
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG A0V = AbstractC167007dF.A0V();
        AbstractC166987dD.A1V(C148276lx.A11, A0V);
        return A0V;
    }
}
