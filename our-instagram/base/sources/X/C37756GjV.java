package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.GjV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37756GjV extends AbstractC37623GhI implements InterfaceC116905Qw {
    public int A00 = 2;
    public final ArrayList A01 = AbstractC166987dD.A1E();
    public final Map A02;
    public final InterfaceC16820sZ A03;
    public final UserSession A04;

    public C37756GjV(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = interfaceC16820sZ;
        this.A04 = userSession;
        C18U.A06(C06090Tz.A05, userSession, 36315726604144125L);
        this.A02 = AbstractC166987dD.A1I();
    }

    @Override // X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5F() {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        Integer valueOf;
        C14360o3.A0B(c37818GkY, 0);
        if (c37818GkY.A0G) {
            A00();
        }
        InterfaceC16820sZ interfaceC16820sZ = this.A03;
        if (!AbstractC166987dD.A1b(((C37546Gg2) interfaceC16820sZ.invoke()).A0A.A0L(EnumC129395t1.A0J))) {
            ArrayList arrayList = this.A01;
            if (AbstractC25226BEj.A1b(arrayList) && C37546Gg2.A01(interfaceC16820sZ) - 2 >= this.A00) {
                Object A13 = AnonymousClass016.A13(arrayList);
                if (A13 != null) {
                    C4NL c4nl = (C4NL) A13;
                    C14360o3.A0B(c4nl, 0);
                    while (((C37546Gg2) interfaceC16820sZ.invoke()).A0A.A0B() - 2 >= this.A00) {
                        C37556GgC c37556GgC = super.A02;
                        if (c37556GgC != null && (valueOf = Integer.valueOf(c37556GgC.A03())) != null) {
                            int intValue = valueOf.intValue();
                            int i = this.A00;
                            if (intValue < i) {
                                AbstractC37552Gg8 abstractC37552Gg8 = ((C37546Gg2) interfaceC16820sZ.invoke()).A0A;
                                C120985dq A0F = abstractC37552Gg8.A0F(i - 1);
                                C120985dq A0F2 = abstractC37552Gg8.A0F(i);
                                EnumC129395t1 enumC129395t1 = A0F.A01;
                                EnumC129395t1 enumC129395t12 = EnumC129395t1.A0G;
                                if (enumC129395t1 == enumC129395t12 && A0F2.A01 == enumC129395t12) {
                                    C4NJ c4nj = (C4NJ) c4nl;
                                    C14360o3.A0B(c4nj, 0);
                                    C120985dq c120985dq = new C120985dq(new C42156Im4(c4nj));
                                    ((C37546Gg2) interfaceC16820sZ.invoke()).A0A.A0c(c120985dq, this.A00);
                                    this.A02.put(c4nl, c120985dq);
                                    A00();
                                    return;
                                }
                            }
                        }
                        C120985dq A0F3 = ((C37546Gg2) interfaceC16820sZ.invoke()).A0A.A0F(this.A00);
                        int i2 = this.A00;
                        EnumC129395t1 enumC129395t13 = A0F3.A01;
                        int i3 = 2;
                        if (enumC129395t13 == EnumC129395t1.A0G) {
                            i3 = 1;
                        }
                        this.A00 = i2 + i3;
                    }
                    if (!arrayList.isEmpty()) {
                        return;
                    }
                    arrayList.add(c4nl);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r1 >= 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r3 = this;
            java.util.ArrayList r1 = r3.A01
            boolean r0 = X.AbstractC25226BEj.A1b(r1)
            if (r0 == 0) goto L3d
            java.lang.Object r2 = X.AbstractC001800i.A0I(r1)
            X.4NL r2 = (X.C4NL) r2
            r1 = 0
            r0 = 2792(0xae8, float:3.912E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)     // Catch: java.lang.NumberFormatException -> L32
            X.C14360o3.A0C(r2, r0)     // Catch: java.lang.NumberFormatException -> L32
            X.4NJ r2 = (X.C4NJ) r2     // Catch: java.lang.NumberFormatException -> L32
            X.4NP r2 = r2.A09     // Catch: java.lang.NumberFormatException -> L32
            java.lang.String r0 = "ig_qp_reels_midcard_placement"
            X.4Ne r0 = r2.A00(r0)     // Catch: java.lang.NumberFormatException -> L32
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.A03     // Catch: java.lang.NumberFormatException -> L32
            if (r0 == 0) goto L3d
            java.lang.String r0 = X.AbstractC25228BEl.A1A(r0)     // Catch: java.lang.NumberFormatException -> L32
            if (r0 == 0) goto L3d
            java.lang.Integer r1 = X.AbstractC003100w.A0i(r0)     // Catch: java.lang.NumberFormatException -> L32
        L32:
            if (r1 == 0) goto L3d
            int r1 = r1.intValue()
            r0 = 1
            int r1 = r1 - r0
            if (r1 < r0) goto L3d
            goto L3e
        L3d:
            r1 = 2
        L3e:
            r3.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37756GjV.A00():void");
    }
}
