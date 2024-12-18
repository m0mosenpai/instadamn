package X;

/* renamed from: X.Mn1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51396Mn1 extends AbstractC53630Nnb {
    public final C53385Nja A00;
    public final Integer A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final InterfaceC57790PkH A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Throwable, X.Nja, java.lang.Exception] */
    public C51396Mn1(InterfaceC57790PkH interfaceC57790PkH, Integer num, Object obj, String str, String str2) {
        ?? r2;
        C14360o3.A0B(obj, 1);
        AbstractC25233BEq.A0x(2, str, interfaceC57790PkH, num);
        this.A02 = obj;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = interfaceC57790PkH;
        this.A01 = num;
        String A0n = AbstractC167017dG.A0n(obj, " value: ", AbstractC166997dE.A11(str2));
        C14360o3.A0B(A0n, 1);
        ?? exc = new Exception(A0n);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        C14360o3.A07(stackTrace);
        int length = stackTrace.length;
        int i = length - 2;
        if (i >= 0 && i != 0) {
            if (i >= length) {
                r2 = AbstractC009903n.A0J(stackTrace);
            } else if (i == 1) {
                r2 = AbstractC166987dD.A1J(stackTrace[length - 1]);
            } else {
                r2 = AbstractC25225BEi.A17(i);
                for (int i2 = length - i; i2 < length; i2++) {
                    r2.add(stackTrace[i2]);
                }
            }
        } else {
            r2 = C16930sl.A00;
        }
        exc.setStackTrace((StackTraceElement[]) r2.toArray(new StackTraceElement[0]));
        this.A00 = exc;
    }
}
