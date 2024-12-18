package X;

/* renamed from: X.IoS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42304IoS implements InterfaceC66482zP {
    public final C51750MtZ A00;
    public final String A01;

    public C42304IoS(C51750MtZ c51750MtZ, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = c51750MtZ;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51750MtZ c51750MtZ;
        C42304IoS c42304IoS = (C42304IoS) obj;
        C51750MtZ c51750MtZ2 = this.A00;
        if (c42304IoS != null) {
            c51750MtZ = c42304IoS.A00;
        } else {
            c51750MtZ = null;
        }
        return C14360o3.A0K(c51750MtZ2, c51750MtZ);
    }
}
