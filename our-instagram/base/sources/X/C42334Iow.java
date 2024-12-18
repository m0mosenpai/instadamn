package X;

/* renamed from: X.Iow, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42334Iow implements InterfaceC66482zP {
    public final C26080Bg9 A00;
    public final InterfaceC60442pS A01;
    public final IK8 A02;

    public C42334Iow(C26080Bg9 c26080Bg9, InterfaceC60442pS interfaceC60442pS, IK8 ik8) {
        C14360o3.A0B(interfaceC60442pS, 3);
        this.A00 = c26080Bg9;
        this.A02 = ik8;
        this.A01 = interfaceC60442pS;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C42334Iow) && C14360o3.A0K(this.A00, ((C42334Iow) obj).A00)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "product-collection-cover-contentile";
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C26080Bg9 c26080Bg9;
        C42334Iow c42334Iow = (C42334Iow) obj;
        C26080Bg9 c26080Bg92 = this.A00;
        if (c42334Iow != null) {
            c26080Bg9 = c42334Iow.A00;
        } else {
            c26080Bg9 = null;
        }
        return C14360o3.A0K(c26080Bg92, c26080Bg9);
    }
}
