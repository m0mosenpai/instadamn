package X;

import android.content.Context;

/* renamed from: X.L4y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47717L4y {
    public final InterfaceC65489TlA A00;
    public final SO7 A01;
    public final Integer A02;
    public final InterfaceC19390xP A03;
    public final C2GT A04;
    public final AbstractC61599RqO A05;
    public final C47231Ku4 A06;
    public final SMT A07;
    public final InterfaceC19390xP A08;

    public C47717L4y(Context context, final AbstractC61599RqO abstractC61599RqO, final InterfaceC65489TlA interfaceC65489TlA) {
        SO7 so7;
        InterfaceC19390xP c16240rS;
        this.A05 = abstractC61599RqO;
        this.A00 = interfaceC65489TlA;
        final C47231Ku4 c47231Ku4 = new C47231Ku4(context);
        this.A06 = c47231Ku4;
        new SLB(interfaceC65489TlA).A00(new Runnable() { // from class: X.TPq
            @Override // java.lang.Runnable
            public final void run() {
                C47231Ku4 c47231Ku42 = c47231Ku4;
                InterfaceC65489TlA interfaceC65489TlA2 = interfaceC65489TlA;
                AbstractC61599RqO abstractC61599RqO2 = abstractC61599RqO;
                try {
                    C63166SeQ.A01(c47231Ku42.A00, interfaceC65489TlA2).A02(abstractC61599RqO2.A00());
                } catch (RkF e) {
                    interfaceC65489TlA2.EmQ("OxygenInstallSDK_MARK_EXPOSURE_FAILED", e);
                }
            }
        });
        SMT smt = new SMT(c47231Ku4.A00, abstractC61599RqO, interfaceC65489TlA);
        this.A07 = smt;
        Integer A00 = smt.A00();
        C14360o3.A07(A00);
        this.A02 = A00;
        Integer A002 = smt.A00();
        Integer num = C05F.A01;
        if (A002 == num) {
            so7 = new SO7(smt.A00, smt.A01, smt.A02);
        } else {
            so7 = null;
        }
        this.A01 = so7;
        C16360rh c16360rh = new C16360rh(new MU8(this, (InterfaceC23621Ds) null, 1), C0JE.A00(new MCH(this, (InterfaceC23621Ds) null, 9)));
        this.A03 = c16360rh;
        if (A00 != num) {
            c16240rS = new C16440rp(AbstractC166997dE.A0a());
        } else {
            c16240rS = new C16240rS(new C50540MSt(c16360rh, 4));
        }
        this.A08 = c16240rS;
        this.A04 = AbstractC31172DnG.A0E(c16240rS);
    }
}
