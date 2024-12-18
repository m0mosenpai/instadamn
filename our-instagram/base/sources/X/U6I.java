package X;

/* loaded from: classes11.dex */
public final class U6I implements InterfaceC65469Tkm {
    public final Object A00;
    public final int A01;
    public final InterfaceC65469Tkm A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof U6I) {
                U6I u6i = (U6I) obj;
                if (!C14360o3.A0K(this.A02, u6i.A02) || !C14360o3.A0K(this.A00, u6i.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65469Tkm
    public final Integer BfI() {
        return null;
    }

    @Override // X.InterfaceC65469Tkm
    public final int Bql() {
        return this.A01;
    }

    public final int hashCode() {
        return (this.A02.hashCode() * 31) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConfigWithLayoutData(config=");
        sb.append(this.A02);
        sb.append(", layoutData=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }

    public U6I(InterfaceC65469Tkm interfaceC65469Tkm, Object obj) {
        this.A02 = interfaceC65469Tkm;
        this.A00 = obj;
        this.A01 = interfaceC65469Tkm.Bql();
    }
}
