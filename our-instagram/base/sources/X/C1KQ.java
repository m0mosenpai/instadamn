package X;

/* renamed from: X.1KQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KQ extends C1KR {
    public final String A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1KQ(C1KO c1ko, String str, String str2, String str3, String str4, long j) {
        super(c1ko, "NO_ID", str, j);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }

    @Override // X.C1KP
    public final String A00() {
        return "exit module";
    }

    public final String toString() {
        return AnonymousClass001.A0q("Exit ", ((C1KP) this).A01, " at ", ((C1KP) this).A00);
    }
}
