package X;

/* renamed from: X.Fy9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36195Fy9 implements InterfaceC66482zP {
    public final C44Q A00;
    public final boolean A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String C7K = this.A00.C7K();
        if (C7K == null) {
            return "";
        }
        return C7K;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C44Q c44q;
        C36195Fy9 c36195Fy9 = (C36195Fy9) obj;
        C44Q c44q2 = this.A00;
        if (c36195Fy9 != null) {
            c44q = c36195Fy9.A00;
        } else {
            c44q = null;
        }
        return AbstractC50102Ry.A00(c44q2, c44q);
    }

    public C36195Fy9(C44Q c44q, boolean z) {
        this.A00 = c44q;
        this.A01 = z;
    }
}
