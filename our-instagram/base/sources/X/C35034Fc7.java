package X;

import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Fc7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35034Fc7 {
    public BusinessConversionFlowStatus A00;
    public final Map A03 = AbstractC166987dD.A1I();
    public java.util.Set A02 = AbstractC166987dD.A1H();
    public java.util.Set A01 = AbstractC166987dD.A1H();

    public static int A00(C35034Fc7 c35034Fc7, int i) {
        C1LC it = c35034Fc7.A00.A01.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            ConversionStep conversionStep = ((BusinessConversionStep) it.next()).A01;
            if (i2 >= i) {
                break;
            }
            if (conversionStep != ConversionStep.A09 && conversionStep != ConversionStep.A05) {
                i3++;
            }
            i2++;
        }
        return i3;
    }

    public final void A01() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C34399FEp) it.next()).A00.setResult(-1);
        }
        this.A02 = AbstractC166987dD.A1H();
        this.A01 = AbstractC166987dD.A1H();
    }

    public final void A02() {
        BusinessConversionFlowStatus businessConversionFlowStatus = this.A00;
        C14360o3.A0B(businessConversionFlowStatus, 0);
        BusinessConversionFlowStatus A01 = C35220FgD.A01(businessConversionFlowStatus, EnumC33376Ep9.A03);
        if (A01 != null) {
            this.A00 = A01;
            if (A01.A00 != A01.A01.size()) {
                return;
            }
        }
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0.A00 == r0.A01.size()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(java.util.List r6) {
        /*
            r5 = this;
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r4 = r5.A00
            r3 = 0
            X.C14360o3.A0B(r4, r3)
            X.Ep9 r0 = X.EnumC33376Ep9.A04
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r0 = X.C35220FgD.A01(r4, r0)
            if (r0 == 0) goto L1a
            r5.A00 = r0
            int r1 = r0.A00
            com.google.common.collect.ImmutableList r0 = r0.A01
            int r0 = r0.size()
            if (r1 != r0) goto L1d
        L1a:
            r5.A01()
        L1d:
            java.util.Map r2 = r5.A03
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = r5.A00
            int r0 = r1.A00
            if (r0 <= 0) goto L3e
            com.google.common.collect.ImmutableList r1 = r1.A01
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
        L2d:
            r2.put(r0, r4)
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = r5.A00
            X.C14360o3.A0B(r1, r3)
            int r0 = r1.A00
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r0 = X.C35220FgD.A02(r1, r6, r0, r0)
            r5.A00 = r0
            return
        L3e:
            r0 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35034Fc7.A03(java.util.List):void");
    }

    public C35034Fc7(BusinessConversionFlowStatus businessConversionFlowStatus) {
        this.A00 = businessConversionFlowStatus;
    }
}
