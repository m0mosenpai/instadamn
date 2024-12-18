package X;

import android.os.Handler;

/* renamed from: X.14P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14P extends AbstractC211911v {
    @Override // X.AbstractC211911v
    public final String A06() {
        return "PeriodicThreadBoostInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        if (!JQ4.A00) {
            ((JQ6) JQ4.A01.getValue()).A00();
        }
        InterfaceC09390do interfaceC09390do = JQ4.A01;
        if (((JQ6) interfaceC09390do.getValue()).A06) {
            InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.2Ub
                @Override // X.InterfaceC12870lZ
                public final void onAppBackgrounded() {
                    int A03 = C0f9.A03(1399527043);
                    JQ6 jq6 = (JQ6) JQ4.A01.getValue();
                    InterfaceC09390do interfaceC09390do2 = jq6.A04;
                    ((Handler) interfaceC09390do2.getValue()).removeCallbacks((Runnable) jq6.A05.getValue());
                    ((Handler) interfaceC09390do2.getValue()).post(new RunnableC49828LzZ(jq6));
                    C0f9.A0A(-18311313, A03);
                }

                @Override // X.InterfaceC12870lZ
                public final void onAppForegrounded() {
                    int A03 = C0f9.A03(64209475);
                    ((JQ6) JQ4.A01.getValue()).A00();
                    C0f9.A0A(-1066740812, A03);
                }
            };
            if (((JQ6) interfaceC09390do.getValue()).A07) {
                C218914p.A04(EnumC220415e.A02, interfaceC12870lZ, false, false);
            } else {
                C218914p.A03(EnumC220415e.A03, interfaceC12870lZ);
            }
        }
    }
}
