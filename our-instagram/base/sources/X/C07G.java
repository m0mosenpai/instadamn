package X;

/* renamed from: X.07G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C07G {
    public final /* synthetic */ int[] A00;
    public final /* synthetic */ InterfaceC06630Wx[] A01;

    public C07G(int[] iArr, InterfaceC06630Wx[] interfaceC06630WxArr) {
        this.A00 = iArr;
        this.A01 = interfaceC06630WxArr;
    }

    public final InterfaceC06630Wx A00(int i) {
        InterfaceC06630Wx interfaceC06630Wx = this.A01[i];
        if (interfaceC06630Wx != null) {
            return interfaceC06630Wx;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown provider with id = ", i));
    }
}
