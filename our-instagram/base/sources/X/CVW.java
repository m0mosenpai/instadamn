package X;

/* loaded from: classes5.dex */
public final class CVW {
    public final String A00;
    public final String A01;

    public CVW(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVW) {
                CVW cvw = (CVW) obj;
                if (!C14360o3.A0K(this.A00, cvw.A00) || !C14360o3.A0K(this.A01, cvw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A14("MetaAILoggingParams(bottomSheetSessionId=", this.A00, ", surfaceSessionId=", this.A01, ", appSessionId=", null, ')');
    }

    public final int hashCode() {
        return (AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A01)) * 31;
    }
}
