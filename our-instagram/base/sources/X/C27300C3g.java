package X;

/* renamed from: X.C3g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27300C3g extends AbstractC27455C9x {
    public final CharSequence A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27300C3g) {
                C27300C3g c27300C3g = (C27300C3g) obj;
                if (!C14360o3.A0K(this.A00, c27300C3g.A00) || !C14360o3.A0K(this.A01, c27300C3g.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C27300C3g(String str, CharSequence charSequence) {
        this.A00 = charSequence;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PromptUpdated(prompt=");
        A1C.append((Object) this.A00);
        A1C.append(", displayPrompt=");
        return AbstractC25236BEt.A0Y(this.A01, A1C);
    }
}
