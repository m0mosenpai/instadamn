package X;

/* renamed from: X.IoL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42297IoL implements InterfaceC66482zP {
    public final C40857I8h A00;
    public final String A01;

    public C42297IoL(C40857I8h c40857I8h, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = c40857I8h;
        this.A01 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C40857I8h c40857I8h;
        C42297IoL c42297IoL = (C42297IoL) obj;
        C40857I8h c40857I8h2 = this.A00;
        if (c42297IoL != null) {
            c40857I8h = c42297IoL.A00;
        } else {
            c40857I8h = null;
        }
        return C14360o3.A0K(c40857I8h2, c40857I8h);
    }
}
