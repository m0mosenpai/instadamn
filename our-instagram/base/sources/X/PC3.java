package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PC3 implements InterfaceC57985PnV {
    public C54466O4u A00;
    public final View A01;
    public final InterfaceC09390do A02 = C57516Pfq.A00(this, 17);
    public final InterfaceC09390do A03 = C57516Pfq.A00(this, 18);

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        C51897Mwf c51897Mwf = (C51897Mwf) interfaceC57856PlM;
        C14360o3.A0B(c51897Mwf, 0);
        if (c51897Mwf.A01) {
            C54466O4u c54466O4u = this.A00;
            if (c54466O4u != null) {
                c54466O4u.A00.A02.A00(PAW.A00);
            } else {
                C14360o3.A0F("listener");
                throw C00O.createAndThrow();
            }
        }
    }

    public PC3(View view) {
        this.A01 = view;
    }
}
