package X;

/* renamed from: X.LZr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48318LZr implements InterfaceC66482zP {
    public boolean A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C48318LZr c48318LZr = (C48318LZr) obj;
        C14360o3.A0B(c48318LZr, 0);
        return C14360o3.A0K(this.A02, c48318LZr.A02);
    }

    public C48318LZr(String str) {
        this.A02 = AnonymousClass001.A0R("header:", str);
        this.A01 = str;
    }

    public C48318LZr(String str, boolean z) {
        this.A02 = AnonymousClass001.A0R("header:", str);
        this.A01 = str;
        this.A00 = z;
    }
}
