package X;

/* renamed from: X.C3j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27302C3j extends AbstractC27455C9x {
    public final int A00;
    public final C29509CzN A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27302C3j) {
                C27302C3j c27302C3j = (C27302C3j) obj;
                if (!C14360o3.A0K(this.A01, c27302C3j.A01) || this.A00 != c27302C3j.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public C27302C3j(C29509CzN c29509CzN, int i) {
        this.A01 = c29509CzN;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SuggestionClicked(imagineSuggestion=");
        A1C.append(this.A01);
        A1C.append(", itemIndex=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
