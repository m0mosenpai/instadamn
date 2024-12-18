package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.Ipn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42386Ipn implements InterfaceC43071ya {
    public final InterfaceC61782rf A01;
    public final C33P A02;
    public final WeakReference A03 = AbstractC25225BEi.A16(null);
    public final Rect A00 = AbstractC166987dD.A0U();

    public C42386Ipn(InterfaceC61782rf interfaceC61782rf, C33P c33p) {
        this.A02 = c33p;
        this.A01 = interfaceC61782rf;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        HBC hbc = ((C38626GyT) c59062n7.A03).A03;
        List list = hbc.A0B;
        Object obj = c59062n7.A04;
        C14360o3.A06(obj);
        C38321qM A00 = ((IL5) list.get(AbstractC166987dD.A0H(obj))).A00();
        float CGk = interfaceC57162jr.CGk(c59062n7);
        Rect rect = this.A00;
        interfaceC57162jr.BA6(rect, c59062n7);
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        boolean z = false;
        if (A01 != A1R) {
            if (A01 != 0) {
                if (A01 == 2) {
                    this.A01.BRZ(A00).A0l(false);
                    this.A02.A06(A00);
                    return;
                }
                throw B4Z.A00();
            }
            C75113Zb BRZ = this.A01.BRZ(A00);
            BRZ.A0E(0, BRZ.A03);
            BRZ.A0l(A1R);
            C33P c33p = this.A02;
            int i = rect.top;
            int i2 = rect.left;
            View view = (View) this.A03.get();
            int i3 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            c33p.A04(view, A00, hbc, CGk, i, i2, false, false, false);
            return;
        }
        C75113Zb BRZ2 = this.A01.BRZ(A00);
        if (CGk >= 0.99d) {
            z = true;
        }
        if (z != BRZ2.A2G) {
            BRZ2.A2G = z;
            C75113Zb.A00(BRZ2, 3);
        }
        this.A02.A03((View) this.A03.get(), A00, hbc, CGk, rect.top, rect.left);
    }
}
