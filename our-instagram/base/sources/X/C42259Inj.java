package X;

/* renamed from: X.Inj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42259Inj implements InterfaceC42271xH {
    public final /* synthetic */ C51622Yk A00;

    public C42259Inj(C51622Yk c51622Yk) {
        this.A00 = c51622Yk;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        return this.A00.isShowing();
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(812920797);
        int A032 = C0f9.A03(2091659523);
        C51622Yk c51622Yk = this.A00;
        if (((C38013Gnz) obj).A00) {
            InterfaceC147206jw interfaceC147206jw = c51622Yk.A03;
            if (interfaceC147206jw != null) {
                interfaceC147206jw.DZe();
            }
            JXE jxe = c51622Yk.A0G;
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le.A01(jxe, 0).A0G();
            c51622Yk.A06 = false;
            jxe.setVisibility(4);
        } else {
            if (c51622Yk.A0G.getVisibility() == 0) {
                c51622Yk.A03(false);
            } else {
                super/*android.widget.PopupWindow*/.dismiss();
            }
            AbstractC25651Mw.A00(c51622Yk.A0I.A09).A02(this, C38013Gnz.class);
        }
        C0f9.A0A(346233040, A032);
        C0f9.A0A(1549645490, A03);
    }
}
