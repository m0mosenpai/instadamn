package X;

/* renamed from: X.InC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42226InC implements InterfaceC58028PoE {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ViewOnKeyListenerC55334Ogx A01;

    @Override // X.InterfaceC58028PoE
    public final void DZC(EnumC222789sJ enumC222789sJ, EnumC222789sJ enumC222789sJ2) {
    }

    public C42226InC(ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx, long j) {
        this.A00 = j;
        this.A01 = viewOnKeyListenerC55334Ogx;
    }

    @Override // X.InterfaceC58028PoE
    public final void DZ5(long j) {
        IE1 ie1;
        if (j >= Math.min(this.A00, 3000L) && (ie1 = this.A01.A04) != null) {
            C41594Iah c41594Iah = ie1.A00;
            ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx = c41594Iah.A01;
            if (viewOnKeyListenerC55334Ogx != null) {
                viewOnKeyListenerC55334Ogx.A00 = false;
                viewOnKeyListenerC55334Ogx.A02.A05();
            }
            c41594Iah.A00 = (c41594Iah.A00 + 1) % 4;
            C41594Iah.A00(c41594Iah);
        }
    }
}
