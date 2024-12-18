package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ips, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42391Ips implements InterfaceC43071ya {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final String A04;
    public final java.util.Set A05;

    public C42391Ips(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, java.util.Set set, int i, int i2) {
        C14360o3.A0B(interfaceC60442pS, 2);
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = set;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Integer num;
        String A01;
        C14360o3.A0B(c59062n7, 0);
        java.util.Set set = this.A05;
        String str = c59062n7.A05;
        C14360o3.A06(str);
        if (set.add(str)) {
            if (interfaceC57162jr != null) {
                num = interfaceC57162jr.CFq(c59062n7);
            } else {
                num = null;
            }
            if (num == C05F.A00) {
                InterfaceC02590Ai A09 = AbstractC37302Gc3.A09(this.A03, this.A02);
                A09.AAP("media_thumbnail_section", "ads_products_tab");
                AbstractC37300Gc1.A0o(A09, this.A04);
                int i = this.A00;
                if (i != 0) {
                    int i2 = this.A01;
                    int i3 = i2 / i;
                    if ((i2 ^ i) < 0 && i3 * i != i2) {
                        i3--;
                    }
                    A01 = AbstractC154266wb.A01(i3, i2 % i);
                } else {
                    A01 = AbstractC154266wb.A01(0, 0);
                }
                C14360o3.A0A(A01);
                A09.AAP("position", A01);
                AbstractC25234BEr.A11(A09, "device_aspect_ratio_category", AbstractC37301Gc2.A0g(A09));
                A09.Cht();
            }
        }
    }
}
