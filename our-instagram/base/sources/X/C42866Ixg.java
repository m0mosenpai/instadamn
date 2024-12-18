package X;

import com.instagram.model.shopping.ProductSource;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;
import java.util.List;

/* renamed from: X.Ixg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42866Ixg implements InterfaceC58157PqM {
    public final int A00;
    public final Object A01;

    public C42866Ixg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0131, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0135  */
    @Override // X.InterfaceC58157PqM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DG9(java.lang.String r14, java.lang.Throwable r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42866Ixg.DG9(java.lang.String, java.lang.Throwable, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019c  */
    @Override // X.InterfaceC58157PqM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DO1(java.lang.String r20, java.util.List r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42866Ixg.DO1(java.lang.String, java.util.List, boolean, boolean):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC58157PqM
    public final void DqP(HBD hbd, String str, boolean z) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(str, 2);
                HCL hcl = (HCL) this.A01;
                HCL.A01(hbd.A00, hcl);
                ProductSourceOverrideState productSourceOverrideState = hcl.A09;
                if (productSourceOverrideState == null) {
                    C14360o3.A0F("productSourceOverrideState");
                    throw C00O.createAndThrow();
                }
                ProductSource productSource = hbd.A00;
                C14360o3.A07(productSource);
                ProductSourceOverrideStatus productSourceOverrideStatus = productSourceOverrideState.A01;
                String str2 = productSourceOverrideState.A02;
                C14360o3.A0B(productSourceOverrideStatus, 0);
                hcl.A09 = new ProductSourceOverrideState(productSource, productSourceOverrideStatus, str2);
                List list = hbd.A01.A02;
                C14360o3.A07(list);
                DO1(str, list, z, hbd.CLI());
                return;
            case 1:
                C14360o3.A0B(str, 2);
                List list2 = hbd.A01.A02;
                C14360o3.A07(list2);
                DO1(str, list2, z, hbd.CLI());
                return;
            case 2:
                C14360o3.A0B(str, 2);
                C38327GtM c38327GtM = (C38327GtM) this.A01;
                C43361JEc A01 = C43361JEc.A01(hbd, 11);
                AbstractC37304Gc5.A0x(c38327GtM.A01, c38327GtM.A02, A01);
                List list22 = hbd.A01.A02;
                C14360o3.A07(list22);
                DO1(str, list22, z, hbd.CLI());
                return;
            case 3:
                C14360o3.A0B(str, 2);
                C38323GtI c38323GtI = (C38323GtI) this.A01;
                C39324HYp c39324HYp = c38323GtI.A04;
                c39324HYp.A00 = hbd.A00;
                c39324HYp.A04(true);
                C43361JEc A012 = C43361JEc.A01(hbd, 14);
                AbstractC37304Gc5.A0x(c38323GtI.A01, c38323GtI.A02, A012);
                List list222 = hbd.A01.A02;
                C14360o3.A07(list222);
                DO1(str, list222, z, hbd.CLI());
                return;
            default:
                C14360o3.A0B(str, 2);
                C39325HYq c39325HYq = ((C38328GtN) this.A01).A02;
                ((INS) c39325HYq).A00 = hbd.A00;
                c39325HYq.A04(true);
                List list2222 = hbd.A01.A02;
                C14360o3.A07(list2222);
                DO1(str, list2222, z, hbd.CLI());
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC58157PqM
    public final boolean isEmpty() {
        C2GT c2gt;
        List list;
        Object obj;
        switch (this.A00) {
            case 0:
                return AbstractC167007dF.A1N(((HCL) this.A01).A0M.getItemCount());
            case 1:
                obj = ((C38680GzL) AbstractC37301Gc2.A0e(((C38322GtH) this.A01).A00)).A01;
                list = (List) obj;
                return list.isEmpty();
            case 2:
                c2gt = ((C38327GtM) this.A01).A01;
                list = AbstractC37302Gc3.A0N(c2gt).A04;
                return list.isEmpty();
            case 3:
                c2gt = ((C38323GtI) this.A01).A01;
                list = AbstractC37302Gc3.A0N(c2gt).A04;
                return list.isEmpty();
            default:
                obj = ((C26063Bfr) AbstractC37301Gc2.A0e(((C38328GtN) this.A01).A01)).A02;
                list = (List) obj;
                return list.isEmpty();
        }
    }
}
