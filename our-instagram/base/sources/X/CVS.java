package X;

/* loaded from: classes5.dex */
public final class CVS {
    public final long A00;
    public final FRT A01;

    public CVS(FRT frt, long j) {
        C14360o3.A0B(frt, 3);
        this.A01 = frt;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVS) {
                CVS cvs = (CVS) obj;
                if (!C14360o3.A0K(this.A01, cvs.A01) || this.A00 != cvs.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, (2245082 + AbstractC53644Nnp.A00()) * 31) + AbstractC25228BEl.A03(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAIPromptSheetParams(metaAiPromptSheetAppSurface=");
        A1C.append("IGD");
        AbstractC25235BEs.A1M(A1C, ", isDarkModeForced=");
        A1C.append(", metaAIPromptSheetLoggingParams=");
        A1C.append(this.A01);
        A1C.append(AbstractC58317Pt9.A00(424));
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
