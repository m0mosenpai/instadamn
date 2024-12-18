package X;

/* renamed from: X.58f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1129658f {
    public final C18570vk A00;
    public final C18570vk A01;
    public final C18570vk A02;
    public final C18570vk A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16660sJ A05;

    public final boolean A01() {
        if (this.A02.A01 == 0 && this.A01.A01 == 0 && this.A00.A01 == 0) {
            return false;
        }
        return true;
    }

    public C1129658f(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A05 = interfaceC16660sJ;
        this.A04 = interfaceC16820sZ;
        C18570vk c18570vk = AbstractC004901o.A00;
        this.A02 = new C18570vk(6);
        this.A00 = new C18570vk(6);
        this.A01 = new C18570vk(6);
        this.A03 = new C18570vk(6);
    }

    public static final void A00(C18570vk c18570vk, C1129658f c1129658f, Object obj) {
        if (c18570vk.A09(obj) && c1129658f.A02.A01 + c1129658f.A00.A01 + c1129658f.A01.A01 == 1) {
            c1129658f.A05.invoke(new C5EI(c1129658f));
        }
    }
}
