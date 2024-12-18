package X;

/* renamed from: X.CVr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27994CVr {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27994CVr) {
                C27994CVr c27994CVr = (C27994CVr) obj;
                if (!C14360o3.A0K(this.A01, c27994CVr.A01) || !C14360o3.A0K(this.A02, c27994CVr.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)) * 31) + 16627232;
    }

    public final String toString() {
        return AnonymousClass001.A17("SuggestedPrompt(text=", this.A01, ", pillType=", this.A02, ", promptId=", null, ", suggestedPromptType=", "SUGGESTED_PROMPT", ')');
    }

    public C27994CVr(String str, Integer num, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
    }
}
