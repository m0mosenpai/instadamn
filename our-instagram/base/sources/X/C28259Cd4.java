package X;

/* renamed from: X.Cd4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28259Cd4 {
    public final C27990CVn A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28259Cd4) {
                C28259Cd4 c28259Cd4 = (C28259Cd4) obj;
                if (!C14360o3.A0K(this.A00, c28259Cd4.A00) || !C14360o3.A0K(this.A01, c28259Cd4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }

    public C28259Cd4(C27990CVn c27990CVn, String str) {
        this.A00 = c27990CVn;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UIState(suggestionPreviewState=");
        A1C.append(this.A00);
        A1C.append(", screenName=");
        return AbstractC25236BEt.A0Y(this.A01, A1C);
    }

    public C28259Cd4() {
        this(null, "WriteWithAIFeedbackBottomSheet");
    }
}
