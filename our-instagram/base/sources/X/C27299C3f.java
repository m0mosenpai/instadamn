package X;

/* renamed from: X.C3f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27299C3f extends AbstractC27455C9x {
    public final C27990CVn A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27299C3f) {
                C27299C3f c27299C3f = (C27299C3f) obj;
                if (!C14360o3.A0K(this.A00, c27299C3f.A00) || this.A01 != c27299C3f.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }

    public C27299C3f(C27990CVn c27990CVn, boolean z) {
        this.A00 = c27990CVn;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NegativeFeedbackClicked(suggestionPreviewState=");
        A1C.append(this.A00);
        A1C.append(", isEditScreen=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}
