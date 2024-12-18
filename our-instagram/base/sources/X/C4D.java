package X;

/* loaded from: classes5.dex */
public final class C4D extends AbstractC27457C9z {
    public final C27990CVn A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C4D) && C14360o3.A0K(this.A00, ((C4D) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C4D(C27990CVn c27990CVn) {
        this.A00 = c27990CVn;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BadOptionsFeedback(suggestionPreviewState=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C4D() {
        this(null);
    }
}
