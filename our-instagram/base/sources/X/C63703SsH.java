package X;

import java.util.LinkedHashMap;

/* renamed from: X.SsH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63703SsH implements InterfaceC65468Tkk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C63703SsH(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65468Tkk
    public final void CzL() {
        if (this.A00 == 0) {
            C64103SzK c64103SzK = (C64103SzK) this.A02;
            c64103SzK.A03.A00.Ci3(null, null, "client_init_iap_store_connection_stopped");
            long j = c64103SzK.A00;
            if (j <= 16000) {
                c64103SzK.A00 = 4 * j;
                c64103SzK.A02.postDelayed(new RunnableC64622TNe(this, c64103SzK), j);
            }
        }
    }

    @Override // X.InterfaceC65468Tkk
    public final void CzM(SYG syg) {
        int i = this.A00;
        C14360o3.A0B(syg, 0);
        int i2 = syg.A00;
        if (i != 0) {
            C63005SaT c63005SaT = (C63005SaT) this.A02;
            if (i2 == 0) {
                if (c63005SaT.A07.A00().A00.getBoolean("ig_in_app_purchases_synchronization_required", true)) {
                    ((InterfaceC16820sZ) this.A01).invoke();
                }
                c63005SaT.A01(null, EnumC61185Rgl.A0L, null);
                return;
            }
            String str = syg.A01;
            C14360o3.A07(str);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            AbstractC63051SbX.A02(str, A1I);
            AbstractC63051SbX.A00(syg, A1I);
            int i3 = syg.A00;
            EnumC61185Rgl enumC61185Rgl = EnumC61185Rgl.A0C;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 3) {
                        if (i3 == 7) {
                            enumC61185Rgl = EnumC61185Rgl.A0I;
                        }
                    } else {
                        enumC61185Rgl = EnumC61185Rgl.A05;
                    }
                } else {
                    enumC61185Rgl = EnumC61185Rgl.A0P;
                }
            } else {
                enumC61185Rgl = EnumC61185Rgl.A0L;
            }
            c63005SaT.A01(syg, enumC61185Rgl, A1I);
            return;
        }
        C64103SzK c64103SzK = (C64103SzK) this.A02;
        C63222SfT c63222SfT = c64103SzK.A03;
        if (i2 == 0) {
            c63222SfT.A00.Ci3(null, null, "client_init_iap_store_connection_success");
            c64103SzK.A00 = 1000L;
            ((InterfaceC65468Tkk) this.A01).CzM(syg);
            return;
        }
        String str2 = syg.A01;
        C14360o3.A07(str2);
        LinkedHashMap A1I2 = AbstractC166987dD.A1I();
        AbstractC63051SbX.A02(str2, A1I2);
        AbstractC63051SbX.A00(syg, A1I2);
        InterfaceC65615To6 interfaceC65615To6 = c63222SfT.A00;
        LinkedHashMap A03 = AbstractC06930Yk.A03(A1I2);
        AbstractC63051SbX.A00(syg, A03);
        interfaceC65615To6.Ci3(A03, null, "client_init_iap_store_connection_fail");
        ((InterfaceC65468Tkk) this.A01).CzM(syg);
        long j = c64103SzK.A00;
        if (j > 16000) {
            return;
        }
        c64103SzK.A00 = 4 * j;
        c64103SzK.A02.postDelayed(new RunnableC64622TNe(this, c64103SzK), j);
    }
}
