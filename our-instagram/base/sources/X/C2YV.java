package X;

/* renamed from: X.2YV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2YV implements C2YT {
    public static final C2YV A00 = new Object();

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return CCS.A00(this, (C2YT) obj);
    }

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        long A01 = AbstractC78873ft.A01(j);
        if (A01 == AbstractC78683fa.A00) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected exact SizeConstraints where minWidth==maxWidth and minHeight==maxHeight but got ");
            sb.append((Object) C78613fT.A04(j));
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        return new C2YU(A01, null);
    }
}
