package X;

import com.instagram.registration.model.RegFlowExtras;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class GFE implements GYF {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C07270a1 A01;
    public final /* synthetic */ AbstractC32549EUz A02;
    public final /* synthetic */ RegFlowExtras A03;
    public final /* synthetic */ EnumC33445EqI A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ AtomicInteger A06;

    public GFE(AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, AbstractC32549EUz abstractC32549EUz, RegFlowExtras regFlowExtras, EnumC33445EqI enumC33445EqI, Integer num, AtomicInteger atomicInteger) {
        this.A01 = c07270a1;
        this.A06 = atomicInteger;
        this.A03 = regFlowExtras;
        this.A04 = enumC33445EqI;
        this.A00 = abstractC59962oe;
        this.A02 = abstractC32549EUz;
        this.A05 = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r1 < 600) goto L10;
     */
    @Override // X.GYF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADL(X.AbstractC115105If r22, X.FPP r23) {
        /*
            r21 = this;
            r6 = r21
            X.0a1 r10 = r6.A01
            X.02i r2 = X.C006802i.A0p
            r1 = 4197923(0x400e23, float:5.882543E-39)
            r0 = 3
            r2.markerEnd(r1, r0)
            r5 = r22
            java.lang.Throwable r0 = r5.A01()
            r4 = r23
            if (r0 != 0) goto L2e
            boolean r0 = r5 instanceof X.C115115Ig
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r5.A00()
            r0.getClass()
            X.1um r0 = (X.C40791um) r0
            int r1 = r0.mStatusCode
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 < r0) goto Ld7
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto Ld7
        L2e:
            java.util.concurrent.atomic.AtomicInteger r2 = r6.A06
            int r0 = r2.get()
            r9 = 1
            if (r0 != r9) goto Ld7
            com.instagram.registration.model.RegFlowExtras r7 = r6.A03
            java.lang.String r0 = r7.A0Z
            if (r0 == 0) goto Ld7
            java.lang.String r0 = r7.A0P
            if (r0 == 0) goto Ld7
            java.lang.Integer r1 = X.AbstractC35794FrW.A00()
            java.lang.Integer r0 = X.C05F.A00
            if (r1 == r0) goto Ld7
            X.1Q9 r0 = X.C1Q9.A1J
            X.FgN r3 = r0.A02(r10)
            X.DwI r1 = X.EnumC31713DwI.A0c
            X.EqI r0 = r6.A04
            X.FcA r8 = r3.A06(r0, r1)
            java.lang.Integer r0 = X.AbstractC35794FrW.A00()
            java.lang.String r3 = X.AbstractC34292FAm.A00(r0)
            int r1 = r2.get()
            java.lang.String r0 = "retry_strategy"
            r8.A04(r0, r3)
            java.lang.String r0 = "attempt_count"
            r8.A03(r0, r1)
            r8.A02()
            java.lang.Integer r0 = X.AbstractC35794FrW.A00()
            int r1 = r0.intValue()
            if (r1 == r9) goto L91
            r0 = 2
            if (r1 != r0) goto L8a
            r2.incrementAndGet()
            X.2oe r2 = r6.A00
            java.lang.Integer r1 = r6.A05
            X.EUz r0 = r6.A02
            X.AbstractC35794FrW.A05(r2, r10, r0, r7, r1)
            return
        L8a:
            java.lang.String r0 = "Unsupported retry strategy type."
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L91:
            X.2oe r3 = r6.A00
            java.lang.String r12 = X.AbstractC31173DnH.A0l(r3)
            X.0qx r1 = X.C16030qx.A02
            android.content.Context r0 = r3.requireContext()
            java.lang.String r15 = r1.A05(r0)
            r2.incrementAndGet()
            java.lang.String r2 = r7.A0Z
            java.lang.String r1 = ""
            java.util.regex.Pattern r0 = X.AbstractC13670mt.A01
            if (r2 != 0) goto Lad
            r2 = r1
        Lad:
            java.lang.String r0 = r7.A0P
            if (r0 != 0) goto Lb2
            r0 = r1
        Lb2:
            int r20 = X.C35264Fgy.A00()
            r11 = 0
            r13 = r11
            r14 = r11
            r17 = r11
            r19 = r11
            r16 = r0
            r18 = r2
            X.1ON r1 = X.AbstractC35276FhB.A0E(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r12 = 7
            X.EUr r0 = new X.EUr
            r11 = r0
            r13 = r5
            r14 = r6
            r15 = r10
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r1.A00 = r0
            r3.schedule(r1)
            return
        Ld7:
            r4.A00(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFE.ADL(X.5If, X.FPP):void");
    }
}
