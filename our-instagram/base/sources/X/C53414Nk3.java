package X;

/* renamed from: X.Nk3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53414Nk3 extends IllegalStateException {
    public final Integer A00;
    public final String A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53414Nk3(Integer num, String str, Throwable th) {
        this(num, str, th.getMessage(), th);
        C14360o3.A0B(th, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53414Nk3(Integer num, String str, String str2, Throwable th) {
        super(str2, th);
        C14360o3.A0B(str, 2);
        this.A00 = num;
        this.A01 = str;
    }
}
