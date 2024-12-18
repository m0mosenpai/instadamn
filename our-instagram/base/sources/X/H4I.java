package X;

/* loaded from: classes7.dex */
public final class H4I extends C0T6 implements JJT {
    public final C111034zF A00;
    public final Float A01;
    public final Float A02;

    @Override // X.JJT
    public final H4I Ewq(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4I) {
                H4I h4i = (H4I) obj;
                if (!C14360o3.A0K(this.A01, h4i.A01) || !C14360o3.A0K(this.A00, h4i.A00) || !C14360o3.A0K(this.A02, h4i.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public H4I(C111034zF c111034zF, Float f, Float f2) {
        this.A01 = f;
        this.A00 = c111034zF;
        this.A02 = f2;
    }

    @Override // X.JJT
    public final JJT E9L(C1DY c1dy) {
        return this;
    }
}
