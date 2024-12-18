package X;

/* renamed from: X.IoP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42301IoP implements InterfaceC66482zP {
    public final C51750MtZ A00;
    public final String A01;

    public C42301IoP(C51750MtZ c51750MtZ, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = c51750MtZ;
        this.A01 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51750MtZ c51750MtZ;
        C42301IoP c42301IoP = (C42301IoP) obj;
        C51750MtZ c51750MtZ2 = this.A00;
        if (c42301IoP != null) {
            c51750MtZ = c42301IoP.A00;
        } else {
            c51750MtZ = null;
        }
        return C14360o3.A0K(c51750MtZ2, c51750MtZ);
    }
}
