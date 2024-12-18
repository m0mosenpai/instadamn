package X;

/* renamed from: X.CVm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27989CVm {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27989CVm) {
                C27989CVm c27989CVm = (C27989CVm) obj;
                if (!C14360o3.A0K(this.A02, c27989CVm.A02) || !C14360o3.A0K(this.A00, c27989CVm.A00) || !C14360o3.A0K(this.A01, c27989CVm.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A14("GeneratedPromptSummaryData(text=", this.A02, ", requestId=", this.A00, ", responseId=", this.A01, ')');
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C27989CVm(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
