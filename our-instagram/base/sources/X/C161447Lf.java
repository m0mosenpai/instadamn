package X;

/* renamed from: X.7Lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161447Lf extends C4F4 implements C7VC {
    public final int A00;
    public final long A01;
    public final C162297Or A02;
    public final String A03;
    public final String A04;

    public C161447Lf(C162297Or c162297Or, String str, String str2, int i, long j) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(c162297Or, 5);
        this.A04 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A01 = j;
        this.A02 = c162297Or;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C161447Lf) {
                C161447Lf c161447Lf = (C161447Lf) obj;
                if (!C14360o3.A0K(this.A04, c161447Lf.A04) || !C14360o3.A0K(this.A03, c161447Lf.A03) || this.A00 != c161447Lf.A00 || this.A01 != c161447Lf.A01 || !C14360o3.A0K(this.A02, c161447Lf.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C7VC
    public final long C8f() {
        return this.A01;
    }

    @Override // X.C7VC
    public final int getType() {
        return 68;
    }

    public final int hashCode() {
        int hashCode = ((((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A00) * 31;
        long j = this.A01;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.A02.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
