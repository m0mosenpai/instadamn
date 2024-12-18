package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes8.dex */
public final class M76 implements Runnable {
    public final /* synthetic */ LnQ A00;
    public final /* synthetic */ AbstractC46511KiA A01;
    public final /* synthetic */ C3o9 A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ InterfaceC16620sF A06;

    public M76(LnQ lnQ, AbstractC46511KiA abstractC46511KiA, C3o9 c3o9, Boolean bool, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        this.A03 = bool;
        this.A01 = abstractC46511KiA;
        this.A02 = c3o9;
        this.A06 = interfaceC16620sF;
        this.A04 = interfaceC16820sZ;
        this.A00 = lnQ;
        this.A05 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3o9 c3o9;
        String valueOf;
        boolean z;
        String str;
        C910143t c910143t;
        ImmutableList A01;
        C9CP c9cp;
        if (AbstractC31172DnG.A1b(this.A03)) {
            AbstractC46511KiA abstractC46511KiA = this.A01;
            boolean z2 = abstractC46511KiA instanceof KWh;
            if (z2) {
                c3o9 = this.A02;
                valueOf = AbstractC31172DnG.A15(c3o9);
            } else if (abstractC46511KiA instanceof KWg) {
                c3o9 = this.A02;
                valueOf = String.valueOf(JRE.A03(c3o9).A00);
            } else {
                throw B4Z.A00();
            }
            this.A06.invoke(abstractC46511KiA.A00(), valueOf);
            InterfaceC83733oI A05 = JRE.A05(c3o9);
            if (A05 != null) {
                C25671My A00 = AbstractC25651Mw.A00(this.A00.A01);
                String A002 = abstractC46511KiA.A00();
                if (z2) {
                    ImmutableList A0H = ((KWh) abstractC46511KiA).A00.A0H();
                    if (A0H != null && (c910143t = (C910143t) AbstractC001800i.A0J(A0H)) != null && (A01 = c910143t.A01()) != null && (c9cp = (C9CP) AbstractC001800i.A0J(A01)) != null) {
                        str = c9cp.A05;
                    } else {
                        str = null;
                    }
                    z = C14360o3.A0K(str, AbstractC111324zv.A00(3323));
                } else {
                    z = false;
                }
                A00.E4s(new C160997Ji(A05, A002, z));
            }
            InterfaceC16820sZ interfaceC16820sZ = this.A04;
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
                return;
            }
            return;
        }
        this.A00.A02.A00("direct_unknown_error");
        this.A05.invoke(this.A01.A00());
    }
}
