package X;

/* renamed from: X.KIl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45648KIl extends C4F4 {
    public final String A00;
    public final String A01;

    public C45648KIl(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45648KIl c45648KIl = (C45648KIl) obj;
        C14360o3.A0B(c45648KIl, 0);
        if (C14360o3.A0K(this.A01, c45648KIl.A01) && C14360o3.A0K(this.A00, c45648KIl.A00)) {
            return true;
        }
        return false;
    }
}
