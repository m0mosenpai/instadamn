package X;

/* renamed from: X.KIn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45650KIn extends C4F4 {
    public final long A00;
    public final String A01;
    public final String A02;

    public C45650KIn(String str, String str2, long j) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45650KIn c45650KIn = (C45650KIn) obj;
        C14360o3.A0B(c45650KIn, 0);
        if (C14360o3.A0K(this.A02, c45650KIn.A02) && C14360o3.A0K(this.A01, c45650KIn.A01) && this.A00 == c45650KIn.A00) {
            return true;
        }
        return false;
    }
}
