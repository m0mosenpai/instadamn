package X;

/* renamed from: X.Fxt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36179Fxt implements InterfaceC66482zP {
    public final FRF A00;

    public C36179Fxt(FRF frf) {
        C14360o3.A0B(frf, 1);
        this.A00 = frf;
    }

    @Override // X.InterfaceC66482zP
    public final Object getKey() {
        String str = this.A00.A05;
        C14360o3.A07(str);
        return str;
    }

    @Override // X.InterfaceC66492zQ
    public final boolean isContentSame(Object obj) {
        return C14360o3.A0K(this.A00, obj);
    }
}
