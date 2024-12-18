package X;

/* loaded from: classes5.dex */
public final class C47 extends AbstractC27457C9z {
    public final CWM A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47) {
                C47 c47 = (C47) obj;
                if (!C14360o3.A0K(this.A00, c47.A00) || this.A01 != c47.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }

    public C47(CWM cwm, boolean z) {
        this.A00 = cwm;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Edit(selectedMedia=");
        A1C.append(this.A00);
        A1C.append(", primaryActionIsSave=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}
