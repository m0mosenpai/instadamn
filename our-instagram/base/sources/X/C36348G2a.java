package X;

/* renamed from: X.G2a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36348G2a implements GXW {
    public final InterfaceC165037Zs A00;

    public C36348G2a(InterfaceC165037Zs interfaceC165037Zs) {
        C14360o3.A0B(interfaceC165037Zs, 1);
        this.A00 = interfaceC165037Zs;
    }

    @Override // X.GXW
    public final boolean CoA(android.net.Uri uri, C32051E6d c32051E6d) {
        AbstractC167017dG.A1N(uri, c32051E6d);
        String A00 = AbstractC34106F3i.A00(uri);
        if (A00 != null) {
            this.A00.Cr9(c32051E6d.A05, A00);
            return true;
        }
        return false;
    }
}
