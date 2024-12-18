package X;

/* renamed from: X.Fy6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36192Fy6 implements InterfaceC66482zP {
    public final int A00;
    public final InterfaceC37124GXj A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36192Fy6 c36192Fy6 = (C36192Fy6) obj;
        C14360o3.A0B(c36192Fy6, 0);
        return AbstractC167007dF.A1P(this.A00, c36192Fy6.A00);
    }

    public C36192Fy6(InterfaceC37124GXj interfaceC37124GXj, int i) {
        this.A00 = i;
        this.A01 = interfaceC37124GXj;
    }
}
