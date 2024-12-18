package X;

/* renamed from: X.Wof, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71144Wof implements InterfaceC43428JGs {
    public final int A00;
    public final Object A01;

    public C71144Wof(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC43428JGs
    public final void DKc(EnumC75193Zm enumC75193Zm) {
        if (this.A00 != 0) {
            C14360o3.A0B(enumC75193Zm, 0);
            AnonymousClass308.A02((AnonymousClass308) this.A01, enumC75193Zm);
        } else {
            if (!enumC75193Zm.equals(EnumC75193Zm.A0I)) {
                return;
            }
            ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p = ((C68764Vbh) this.A01).A00;
            ViewOnTouchListenerC67974V4p.A05(viewOnTouchListenerC67974V4p, true);
            C9GR.A08(viewOnTouchListenerC67974V4p.A0D, 2131972409, 1);
        }
    }
}
