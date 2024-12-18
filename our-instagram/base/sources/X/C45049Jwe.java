package X;

/* renamed from: X.Jwe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45049Jwe extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C45049Jwe(String str, String str2, String str3, String str4, int i, boolean z) {
        AbstractC25233BEq.A0x(3, str2, str3, str4);
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A05 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45049Jwe) {
                C45049Jwe c45049Jwe = (C45049Jwe) obj;
                if (!C14360o3.A0K(this.A03, c45049Jwe.A03) || this.A00 != c45049Jwe.A00 || !C14360o3.A0K(this.A04, c45049Jwe.A04) || !C14360o3.A0K(this.A02, c45049Jwe.A02) || !C14360o3.A0K(this.A01, c45049Jwe.A01) || this.A05 != c45049Jwe.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A04, (AbstractC166987dD.A0J(this.A03) + this.A00) * 31))));
    }
}
