package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes10.dex */
public final class T30 implements InterfaceC65507Tlc {
    public final C07X A00;
    public final C2GS A01;
    public final C58770Q8c A02;
    public final SE2 A03;
    public final C63345Si1 A04;
    public final C58443PvM A05;
    public final Object A06;
    public final String A07;
    public final Queue A08;

    private void A00(InterfaceC65391TjO interfaceC65391TjO, java.util.Set set) {
        String str = this.A07;
        Object obj = this.A06;
        Bundle bundle = this.A03.A01;
        String string = bundle.getString("PAYMENT_ACCOUNT_ID");
        String string2 = bundle.getString("PAYMENT_OTC_SESSION_ID");
        String string3 = bundle.getString("PAYMENT_OTC_TYPE");
        Map A01 = SSA.A01(bundle);
        AbstractC167017dG.A1N(str, obj);
        C14360o3.A0B(A01, 7);
        SXG sxg = new SXG(AbstractC63063Sbk.A00(interfaceC65391TjO, set), obj, str, string, string2, string3, null, null, A01, set);
        C60623REi A03 = AbstractC63245Sfz.A03(C2FP.A04(), this.A05, sxg);
        AbstractC63144Sdq.A02(A03);
        ((AbstractC63144Sdq) A03).A03.A06(this.A00, C63628Sqa.A00(this.A01, 53));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r1.A00 == 10) goto L11;
     */
    @Override // X.InterfaceC65507Tlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CyJ(java.lang.Throwable r7) {
        /*
            r6 = this;
            boolean r3 = r7 instanceof X.C64864TXp
            if (r3 == 0) goto Ld
            r0 = r7
            X.TXp r0 = (X.C64864TXp) r0
            int r1 = r0.A00
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L34
        Ld:
            boolean r0 = r7 instanceof X.C64852TXc
            r2 = 0
            if (r0 != 0) goto L21
            if (r3 == 0) goto L35
            r1 = r7
            X.TXp r1 = (X.C64864TXp) r1
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            int r1 = r1.A00
            r0 = 10
            if (r1 != r0) goto L35
        L21:
            X.Q8c r0 = r6.A02
            r0.A01()
            X.2GS r1 = r6.A01
            X.TXc r0 = new X.TXc
            r0.<init>(r7)
            X.Sjd r0 = X.C63406Sjd.A05(r2, r0)
        L31:
            r1.A0A(r0)
        L34:
            return
        L35:
            boolean r0 = r7 instanceof X.REY
            if (r0 == 0) goto L40
            X.2GS r1 = r6.A01
            X.Sjd r0 = X.C63406Sjd.A05(r2, r7)
            goto L31
        L40:
            java.util.Queue r5 = r6.A08
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L60
            r0 = 0
            X.Se0[] r0 = new X.C63152Se0[r0]
            java.util.HashSet r3 = X.AbstractC166987dD.A1H()
            java.util.Collections.addAll(r3, r0)
            X.Si2 r2 = X.C63174SeZ.A01()
            r1 = 1
            X.T3b r0 = new X.T3b
            r0.<init>(r2, r1)
            r6.A00(r0, r3)
            return
        L60:
            X.Si1 r0 = r6.A04
            X.2GS r1 = r6.A01
            java.lang.String r4 = r6.A07
            java.lang.Object r3 = r6.A06
            X.SE2 r2 = r6.A03
            r0.A06(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T30.CyJ(java.lang.Throwable):void");
    }

    @Override // X.InterfaceC65507Tlc
    public final void CyK(SGB sgb) {
        HashSet A1H;
        C64192T3b c64192T3b;
        C63152Se0 c63152Se0 = sgb.A01;
        if (c63152Se0 != null) {
            A1H = AbstractC58322PtE.A0x(c63152Se0);
            if ("BIO".equalsIgnoreCase(c63152Se0.A03)) {
                c64192T3b = new C64192T3b(sgb, 0);
            } else {
                c64192T3b = new C64192T3b(C63174SeZ.A01(), 1);
            }
        } else {
            A1H = AbstractC166987dD.A1H();
            Collections.addAll(A1H, new C63152Se0[0]);
            c64192T3b = new C64192T3b(C63174SeZ.A01(), 1);
        }
        A00(c64192T3b, A1H);
    }

    public T30(C07X c07x, C2GS c2gs, C58770Q8c c58770Q8c, SE2 se2, C63345Si1 c63345Si1, C58443PvM c58443PvM, Object obj, String str, Queue queue) {
        this.A04 = c63345Si1;
        this.A05 = c58443PvM;
        this.A00 = c07x;
        this.A02 = c58770Q8c;
        this.A01 = c2gs;
        this.A07 = str;
        this.A06 = obj;
        this.A03 = se2;
        this.A08 = queue;
    }
}
