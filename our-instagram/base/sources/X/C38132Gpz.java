package X;

import android.graphics.Rect;

/* renamed from: X.Gpz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38132Gpz implements InterfaceC43071ya {
    public final Rect A00 = AbstractC166987dD.A0U();
    public final JI3 A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        Object obj = c59062n7.A03;
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) obj;
        float CGk = interfaceC57162jr.CGk(c59062n7);
        Rect rect = this.A00;
        interfaceC57162jr.BA8(rect, c59062n7);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                JI3 ji3 = this.A01;
                C14360o3.A0A(abstractC127945qN);
                ji3.E0I(abstractC127945qN);
                return;
            } else {
                JI3 ji32 = this.A01;
                C14360o3.A06(obj);
                ji32.E0K(rect, abstractC127945qN, CGk, rect.top);
                return;
            }
        }
        JI3 ji33 = this.A01;
        C14360o3.A06(obj);
        ji33.E0H(rect, abstractC127945qN, CGk, rect.top);
    }

    public C38132Gpz(JI3 ji3) {
        this.A01 = ji3;
    }
}
