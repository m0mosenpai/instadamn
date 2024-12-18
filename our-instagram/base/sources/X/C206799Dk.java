package X;

/* renamed from: X.9Dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206799Dk extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206799Dk(boolean z, int i) {
        super(1);
        this.A00 = i;
        this.A01 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            InterfaceC144616fh interfaceC144616fh = (InterfaceC144616fh) obj;
            C14360o3.A0B(interfaceC144616fh, 0);
            interfaceC144616fh.Dwo(this.A01);
        } else {
            C2VK c2vk = (C2VK) obj;
            C14360o3.A0B(c2vk, 0);
            c2vk.EUa(this.A01);
        }
        return C0eB.A00;
    }
}
