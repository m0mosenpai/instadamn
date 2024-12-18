package X;

/* loaded from: classes8.dex */
public final class L9W {
    public final long A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof L9W) {
                L9W l9w = (L9W) obj;
                if (this.A00 != l9w.A00 || !C14360o3.A0K(this.A01, l9w.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC25235BEs.A03(this.A00));
    }

    public L9W(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GenerateOneTimeCodeResponse(sessionId=");
        A1C.append(this.A00);
        A1C.append(", code=");
        return AbstractC25236BEt.A0Y(this.A01, A1C);
    }
}
