package X;

/* renamed from: X.C3l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27304C3l extends AbstractC27455C9x {
    public final C28275CdK A00;
    public final CharSequence A01;
    public final String A02;

    public C27304C3l(C28275CdK c28275CdK, CharSequence charSequence, String str) {
        C14360o3.A0B(charSequence, 1);
        this.A01 = charSequence;
        this.A02 = str;
        this.A00 = c28275CdK;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27304C3l) {
                C27304C3l c27304C3l = (C27304C3l) obj;
                if (!C14360o3.A0K(this.A01, c27304C3l.A01) || !C14360o3.A0K(this.A02, c27304C3l.A02) || !C14360o3.A0K(this.A00, c27304C3l.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PromptSubmitted(prompt=");
        A1C.append((Object) this.A01);
        A1C.append(", displayPrompt=");
        A1C.append(this.A02);
        A1C.append(", suggestionsPromptMetadata=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
