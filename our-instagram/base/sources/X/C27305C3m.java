package X;

/* renamed from: X.C3m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27305C3m extends AbstractC27455C9x {
    public final int A00;
    public final CWM A01;
    public final C28275CdK A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27305C3m) {
                C27305C3m c27305C3m = (C27305C3m) obj;
                if (!C14360o3.A0K(this.A01, c27305C3m.A01) || this.A03 != c27305C3m.A03 || !C14360o3.A0K(this.A02, c27305C3m.A02) || this.A00 != c27305C3m.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A00;
    }

    public C27305C3m(CWM cwm, C28275CdK c28275CdK, int i, boolean z) {
        this.A01 = cwm;
        this.A03 = z;
        this.A02 = c28275CdK;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Select(selectedImage=");
        A1C.append(this.A01);
        A1C.append(", isEdited=");
        A1C.append(this.A03);
        A1C.append(", suggestionsPromptMetadata=");
        A1C.append(this.A02);
        A1C.append(", itemIndex=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
