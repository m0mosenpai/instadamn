package X;

/* renamed from: X.OLt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54834OLt {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54834OLt) {
                C54834OLt c54834OLt = (C54834OLt) obj;
                if (this.A04 != c54834OLt.A04 || this.A00 != c54834OLt.A00 || !C14360o3.A0K(this.A01, c54834OLt.A01) || !C14360o3.A0K(this.A03, c54834OLt.A03) || !C14360o3.A0K(this.A02, c54834OLt.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A01, (AbstractC25225BEi.A08(this.A04) + this.A00) * 31)));
    }

    public C54834OLt(String str, String str2, String str3, int i, boolean z) {
        this.A04 = z;
        this.A00 = i;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ZeroHeadersHttpResponse(result=");
        A1C.append(this.A04);
        A1C.append(", httpCode=");
        A1C.append(this.A00);
        A1C.append(", content=");
        A1C.append(this.A01);
        A1C.append(", responseHeaders=");
        A1C.append(this.A03);
        A1C.append(", errorMessage=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
