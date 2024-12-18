package X;

/* renamed from: X.C3i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27301C3i extends AbstractC27455C9x {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27301C3i) {
                C27301C3i c27301C3i = (C27301C3i) obj;
                if (!C14360o3.A0K(this.A00, c27301C3i.A00) || !C14360o3.A0K(this.A01, c27301C3i.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("SubmitPositiveFeedback(requestId=", this.A00, ", responseId=", this.A01, ')');
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C27301C3i(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
