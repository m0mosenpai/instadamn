package X;

import android.content.res.Resources;

/* loaded from: classes5.dex */
public final class BQO extends C5QE {
    public final CharSequence A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BQO) && C14360o3.A0K(this.A00, ((BQO) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public BQO(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StringLiteral(text=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    @Override // X.C5QE
    public final CharSequence A02(Resources resources) {
        return this.A00;
    }
}
