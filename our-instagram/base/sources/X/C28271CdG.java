package X;

import java.util.Map;

/* renamed from: X.CdG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28271CdG {
    public final C27995CVs A00;
    public final CVC A01;
    public final C27981CVd A02;
    public final CVD A03;
    public final Map A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28271CdG) {
                C28271CdG c28271CdG = (C28271CdG) obj;
                if (!C14360o3.A0K(this.A01, c28271CdG.A01) || !C14360o3.A0K(this.A03, c28271CdG.A03) || !C14360o3.A0K(this.A00, c28271CdG.A00) || !C14360o3.A0K(this.A02, c28271CdG.A02) || this.A05 != c28271CdG.A05 || !C14360o3.A0K(this.A04, c28271CdG.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, AbstractC167007dF.A0D(this.A05, ((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31));
    }

    public C28271CdG(C27995CVs c27995CVs, CVC cvc, C27981CVd c27981CVd, CVD cvd, Map map, boolean z) {
        this.A01 = cvc;
        this.A03 = cvd;
        this.A00 = c27995CVs;
        this.A02 = c27981CVd;
        this.A05 = z;
        this.A04 = map;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TransitionData(fade=");
        A1C.append(this.A01);
        A1C.append(", slide=");
        A1C.append(this.A03);
        A1C.append(", changeSize=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(70));
        A1C.append(this.A02);
        A1C.append(", hold=");
        A1C.append(this.A05);
        A1C.append(", effectsMap=");
        return AbstractC167017dG.A0o(this.A04, A1C);
    }

    public C28271CdG() {
        this(null, null, null, null, AbstractC06930Yk.A0E(), false);
    }
}
