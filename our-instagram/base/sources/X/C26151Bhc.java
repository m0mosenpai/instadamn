package X;

/* renamed from: X.Bhc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26151Bhc extends C0T6 implements InterfaceC132245y2 {
    public final C132175xv A00;
    public final C26036BfP A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26151Bhc) {
                C26151Bhc c26151Bhc = (C26151Bhc) obj;
                if (!C14360o3.A0K(this.A00, c26151Bhc.A00) || !C14360o3.A0K(this.A01, c26151Bhc.A01) || !C14360o3.A0K(this.A07, c26151Bhc.A07) || !C14360o3.A0K(this.A02, c26151Bhc.A02) || !C14360o3.A0K(this.A05, c26151Bhc.A05) || !C14360o3.A0K(this.A06, c26151Bhc.A06) || !C14360o3.A0K(this.A04, c26151Bhc.A04) || !C14360o3.A0K(this.A03, c26151Bhc.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "timelyTopicLabel", this.A00.A03);
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C26151Bhc(C132175xv c132175xv, C26036BfP c26036BfP, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = c132175xv;
        this.A01 = c26036BfP;
        this.A07 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A04 = str5;
        this.A03 = str6;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A00;
    }
}
