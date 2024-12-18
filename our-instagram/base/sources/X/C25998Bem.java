package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bem, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25998Bem extends C0T6 {
    public final int A00;
    public final long A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25998Bem) {
                C25998Bem c25998Bem = (C25998Bem) obj;
                if (!C14360o3.A0K(this.A04, c25998Bem.A04) || this.A01 != c25998Bem.A01 || !C14360o3.A0K(this.A02, c25998Bem.A02) || !C14360o3.A0K(this.A03, c25998Bem.A03) || !C14360o3.A0K(this.A05, c25998Bem.A05) || this.A00 != c25998Bem.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC25236BEt.A01(this.A01, AbstractC166987dD.A0J(this.A04))))) + this.A00;
    }

    public C25998Bem(ImageUrl imageUrl, String str, String str2, String str3, int i, long j) {
        this.A04 = str;
        this.A01 = j;
        this.A02 = imageUrl;
        this.A03 = str2;
        this.A05 = str3;
        this.A00 = i;
    }
}
