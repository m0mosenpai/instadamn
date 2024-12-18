package X;

/* renamed from: X.4V2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4V2 implements InterfaceC46362Ay {
    public final C2BZ A00;

    @Override // X.InterfaceC46362Ay
    public final void EbI(String str, String str2) {
    }

    @Override // X.InterfaceC46362Ay
    public final boolean CR3(android.net.Uri uri, String str, String str2, long j, long j2) {
        C2QD A03 = this.A00.A03();
        if (A03 != null) {
            return A03.CR5(str, j, j2);
        }
        return false;
    }

    public C4V2(C2BZ c2bz) {
        this.A00 = c2bz;
    }
}
