package X;

/* renamed from: X.1KS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KS extends C1KR {
    public final long A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1KS(C1KQ c1kq, C1KO c1ko, Boolean bool, Integer num, String str, String str2, String str3, long j) {
        super(c1ko, "NO_ID", str, j);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A03 = str2;
        this.A02 = num;
        this.A04 = str3;
        this.A01 = bool;
        this.A06 = c1kq.A01;
        this.A00 = ((C1KP) c1kq).A00;
        this.A05 = c1kq.A00;
    }

    @Override // X.C1KP
    public final String A00() {
        return "enter module";
    }

    public final String toString() {
        return AnonymousClass001.A0q("Enter ", ((C1KP) this).A01, " at ", ((C1KP) this).A00);
    }
}
