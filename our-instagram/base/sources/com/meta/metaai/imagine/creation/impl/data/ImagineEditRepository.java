package com.meta.metaai.imagine.creation.impl.data;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.BUS;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C19L;
import X.C28258Cd3;
import X.C28269CdE;
import X.C28283CdV;
import X.C7N;
import X.CAZ;
import X.DEM;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import java.util.List;

/* loaded from: classes5.dex */
public final class ImagineEditRepository {
    public final C28283CdV A00;
    public final C7N A01;
    public final ImagineNetworkService A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A00(EnumC09460dv.A02, DEM.A00);
    public final C19L A04;
    public final C05A A05;
    public final C0UO A06;
    public final boolean A07;
    public final boolean A08;

    public final void A04(C28269CdE c28269CdE) {
        A03();
        C05A c05a = this.A05;
        List list = ((C28258Cd3) c05a.getValue()).A01;
        int i = ((C28258Cd3) c05a.getValue()).A00 + 1;
        if (i != list.size()) {
            list = list.subList(0, i);
        }
        list.add(c28269CdE);
        c05a.getValue();
        c05a.Egh(new C28258Cd3(list, i));
    }

    public static final C28269CdE A00(ImagineEditRepository imagineEditRepository) {
        C05A c05a = imagineEditRepository.A05;
        List list = ((C28258Cd3) c05a.getValue()).A01;
        int i = ((C28258Cd3) c05a.getValue()).A00;
        if (i >= 0 && i < list.size()) {
            return (C28269CdE) list.get(i);
        }
        return null;
    }

    public static final void A01(ImagineEditRepository imagineEditRepository, CAZ caz) {
        String str;
        C28283CdV c28283CdV = imagineEditRepository.A00;
        if (caz != null) {
            str = caz.toString();
        } else {
            str = null;
        }
        c28283CdV.A03(str);
        C28269CdE A00 = A00(imagineEditRepository);
        if (A00 != null) {
            imagineEditRepository.A04(new C28269CdE(caz, A00.A01, null, null, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r32, X.InterfaceC23621Ds r33) {
        /*
            r31 = this;
            r4 = 37
            r5 = r33
            boolean r0 = X.C57146PWy.A01(r5, r4)
            r6 = r31
            if (r0 == 0) goto Lb0
            r3 = r5
            X.PWy r3 = (X.C57146PWy) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb0
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r14 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L9c
            if (r0 != r1) goto Lb7
            java.lang.Object r12 = r3.A01
            com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository r12 = (com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository) r12
            X.AbstractC09560e7.A00(r14)
        L2c:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L99
            X.CdE r13 = A00(r12)
            if (r13 == 0) goto L99
            X.CWM r0 = r13.A01
            if (r0 == 0) goto L99
            java.lang.String r15 = r0.A0A
            java.lang.String r11 = r0.A05
            java.lang.String r10 = r0.A03
            java.lang.String r9 = r0.A06
            java.lang.String r8 = r0.A08
            java.lang.String r7 = r0.A07
            java.lang.Integer r6 = r0.A02
            X.0e4 r5 = r0.A0C
            java.lang.Integer r4 = r0.A01
            java.lang.String r3 = r0.A09
            java.lang.String r2 = r0.A0B
            X.CVm r1 = r0.A00
            boolean r0 = r0.A0D
            X.CWM r16 = new X.CWM
            r29 = r5
            r30 = r0
            r27 = r3
            r28 = r2
            r26 = r7
            r25 = r8
            r24 = r9
            r23 = r10
            r22 = r11
            r21 = r14
            r20 = r15
            r19 = r4
            r18 = r6
            r17 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r2 = r13.A04
            java.lang.String r1 = r13.A03
            X.CWM r0 = r13.A02
            X.CAZ r5 = r13.A00
            X.CdE r4 = new X.CdE
            r6 = r16
            r7 = r0
            r8 = r1
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            X.05A r3 = r12.A05
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            r1 = -1
            X.Cd3 r0 = new X.Cd3
            r0.<init>(r2, r1)
            r3.Egh(r0)
            r12.A04(r4)
        L99:
            X.0eB r2 = X.C0eB.A00
        L9b:
            return r2
        L9c:
            X.AbstractC09560e7.A00(r14)
            com.meta.metaai.imagine.service.ImagineNetworkService r0 = r6.A02
            r3.A01 = r6
            r3.A00 = r1
            r1 = r32
            java.lang.Object r14 = r0.A08(r1, r3)
            if (r14 == r2) goto L9b
            r12 = r6
            goto L2c
        Lb0:
            X.PWy r3 = new X.PWy
            r3.<init>(r6, r5, r4)
            goto L1a
        Lb7:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository.A02(java.lang.String, X.1Ds):java.lang.Object");
    }

    public final void A03() {
        C05A c05a = this.A05;
        int i = ((C28258Cd3) c05a.getValue()).A00;
        if (i > 0) {
            List list = ((C28258Cd3) c05a.getValue()).A01;
            if (((C28269CdE) list.get(i)).A00 != null) {
                list.remove(i);
                c05a.getValue();
                c05a.Egh(new C28258Cd3(list, i - 1));
            }
        }
    }

    public ImagineEditRepository(C28283CdV c28283CdV, C7N c7n, ImagineNetworkService imagineNetworkService, C19L c19l, boolean z, boolean z2) {
        C28258Cd3 c28258Cd3;
        this.A02 = imagineNetworkService;
        this.A04 = c19l;
        this.A01 = c7n;
        this.A00 = c28283CdV;
        this.A07 = z;
        this.A08 = z2;
        C008002u A1H = AbstractC25225BEi.A1H(new C28258Cd3(AbstractC166987dD.A1E(), -1));
        this.A05 = A1H;
        this.A06 = A1H;
        if (this.A08 && (c28258Cd3 = ((BUS) this.A03.getValue()).A00) != null) {
            this.A05.Egh(c28258Cd3);
        }
    }
}
