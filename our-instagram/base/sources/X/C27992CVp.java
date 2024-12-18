package X;

/* renamed from: X.CVp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27992CVp {
    public final String A00;
    public final String A01;
    public final C28371CfX A02;

    public C27992CVp(C28371CfX c28371CfX, String str, String str2) {
        C14360o3.A0B(c28371CfX, 2);
        this.A01 = str;
        this.A02 = c28371CfX;
        this.A00 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27992CVp) {
                C27992CVp c27992CVp = (C27992CVp) obj;
                if (!C14360o3.A0K(this.A01, c27992CVp.A01) || !C14360o3.A0K(this.A02, c27992CVp.A02) || !C14360o3.A0K(this.A00, c27992CVp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A01)) + AbstractC167017dG.A0O(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StackParams(screenName=");
        A1C.append(this.A01);
        A1C.append(", bottomSheetParams=");
        A1C.append(this.A02);
        A1C.append(", fromScreenName=");
        return AbstractC25236BEt.A0Y(this.A00, A1C);
    }
}
