package X;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;

/* renamed from: X.Ba4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25765Ba4 extends C62Y {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25765Ba4) {
                C25765Ba4 c25765Ba4 = (C25765Ba4) obj;
                if (!C14360o3.A0K(this.A00, c25765Ba4.A00) || !C14360o3.A0K(this.A01, c25765Ba4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SweepGradient(");
        A1C.append("");
        A1C.append("colors=");
        A1C.append(this.A00);
        A1C.append(", stops=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }

    public C25765Ba4(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }

    @Override // X.C62Y
    public final Shader A01(long j) {
        long A01 = C5YB.A01(j);
        List list = this.A00;
        List list2 = this.A01;
        AbstractC25292BHl.A01(list, list2);
        return new SweepGradient(C119365at.A01(A01), C119365at.A02(A01), AbstractC25292BHl.A02(list), AbstractC001800i.A0w(list2));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC25235BEs.A03(9205357640488583168L)));
    }
}
