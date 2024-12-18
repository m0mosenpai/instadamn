package X;

/* loaded from: classes7.dex */
public final class Gs8 extends C6DX {
    public final Object A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public Gs8(Object obj, Object obj2, String str, String str2) {
        C14360o3.A0B(str2, 3);
        this.A02 = str;
        this.A00 = obj;
        this.A03 = str2;
        this.A01 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Gs8) {
                Gs8 gs8 = (Gs8) obj;
                if (!C14360o3.A0K(this.A02, gs8.A02) || !C14360o3.A0K(this.A00, gs8.A00) || !C14360o3.A0K(this.A03, gs8.A03) || !C14360o3.A0K(this.A01, gs8.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02))) + AbstractC167017dG.A0M(this.A01);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SnapshotAndVariableUpdate(dataModuleType=");
        A1C.append(this.A02);
        A1C.append(", snapshot=");
        A1C.append(this.A00);
        A1C.append(", variableIdentifier=");
        A1C.append(this.A03);
        A1C.append(AbstractC43591JPw.A00(15));
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
