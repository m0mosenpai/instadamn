package X;

/* renamed from: X.Cz2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29488Cz2 implements InterfaceC30840DhF {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29488Cz2) {
                C29488Cz2 c29488Cz2 = (C29488Cz2) obj;
                if (!C14360o3.A0K(this.A02, c29488Cz2.A02) || !C14360o3.A0K(this.A03, c29488Cz2.A03) || !C14360o3.A0K(this.A00, c29488Cz2.A00) || !C14360o3.A0K(this.A01, c29488Cz2.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A17("MetaAIReelsData(reelsUrl=", this.A02, ", thumbnailUrl=", this.A03, ", author=", this.A00, MSV.A00(293), this.A01, ')');
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C29488Cz2(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A01 = str4;
    }
}
