package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;

/* renamed from: X.EkJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33172EkJ extends AbstractC86353t7 {
    public final int A00;
    public final Object A01;

    public C33172EkJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void CwQ(float f) {
        InterfaceC1118853a interfaceC1118853a;
        switch (this.A00) {
            case 1:
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = ((FFU) this.A01).A00;
                directPrivateStoryRecipientController.A0a = true;
                DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
                return;
            case 3:
                return;
            case 9:
                IKP ikp = (IKP) this.A01;
                if (ikp.A00 && (interfaceC1118853a = ikp.A05) != null) {
                    interfaceC1118853a.EJJ();
                }
                ikp.A01 = false;
                return;
            default:
                super.CwQ(f);
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c3, code lost:
    
        if (r13 == X.C2EY.A21) goto L87;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DB6() {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33172EkJ.DB6():void");
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DId(Integer num) {
        switch (this.A00) {
            case 1:
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = ((FFU) this.A01).A00;
                directPrivateStoryRecipientController.A0a = true;
                DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
                return;
            case 3:
                return;
            case 9:
                IKP ikp = (IKP) this.A01;
                InterfaceC1118853a interfaceC1118853a = ikp.A05;
                if (interfaceC1118853a != null) {
                    interfaceC1118853a.EJE("bottom_sheet");
                }
                ikp.A01 = true;
                return;
            default:
                super.DId(num);
                return;
        }
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DZk(int i, int i2) {
        C3DN A00;
        switch (this.A00) {
            case 3:
                return;
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                super.DZk(i, i2);
                return;
            case 7:
                RecyclerView recyclerView = ((MerchantShoppingCartFragment) this.A01).mRecyclerView;
                if (recyclerView.getScrollState() == 0) {
                    return;
                }
                recyclerView.A0k();
                return;
            case 9:
                IKP ikp = (IKP) this.A01;
                if (!ikp.A00 && (A00 = C3DN.A00.A00(ikp.A02)) != null && ((C3DP) A00).A0i) {
                    ikp.A00 = true;
                }
                if (ikp.A01 || !ikp.A00) {
                    return;
                }
                InterfaceC1118853a interfaceC1118853a = ikp.A05;
                if (interfaceC1118853a != null) {
                    interfaceC1118853a.EJE("bottom_sheet");
                }
                ikp.A01 = true;
                return;
        }
    }
}
