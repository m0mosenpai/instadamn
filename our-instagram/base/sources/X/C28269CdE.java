package X;

/* renamed from: X.CdE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28269CdE {
    public final CAZ A00;
    public final CWM A01;
    public final CWM A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28269CdE) {
                C28269CdE c28269CdE = (C28269CdE) obj;
                if (!C14360o3.A0K(this.A01, c28269CdE.A01) || this.A04 != c28269CdE.A04 || !C14360o3.A0K(this.A03, c28269CdE.A03) || !C14360o3.A0K(this.A02, c28269CdE.A02) || !C14360o3.A0K(this.A00, c28269CdE.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A04, AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C28269CdE(CAZ caz, CWM cwm, CWM cwm2, String str, boolean z) {
        this.A01 = cwm;
        this.A04 = z;
        this.A03 = str;
        this.A02 = cwm2;
        this.A00 = caz;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EditHistoryNode(media=");
        A1C.append(this.A01);
        A1C.append(", isEdited=");
        A1C.append(this.A04);
        A1C.append(", editPrompt=");
        A1C.append(this.A03);
        A1C.append(", parentMedia=");
        A1C.append(this.A02);
        A1C.append(", generationError=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C28269CdE() {
        this(null, null, null, null, false);
    }
}
