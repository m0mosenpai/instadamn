package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HFu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39018HFu extends C1P1 {
    public final /* synthetic */ C41187ILa A00;
    public final /* synthetic */ C70Y A01;

    public C39018HFu(C41187ILa c41187ILa, C70Y c70y) {
        this.A01 = c70y;
        this.A00 = c41187ILa;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-157411856);
        C70Y c70y = this.A01;
        C70Y.A02(c70y.A03(), c70y, EnumC39539HdB.A02, false);
        C0f9.A0A(1911929637, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        MultiProductComponent multiProductComponent;
        String A00;
        int i;
        int A03 = C0f9.A03(791107876);
        C38887HAj c38887HAj = (C38887HAj) obj;
        int A032 = C0f9.A03(927756478);
        C70Y c70y = this.A01;
        C1563470e c1563470e = c70y.A07;
        C14360o3.A0B(c38887HAj, 0);
        C1563470e.A03(c1563470e, c38887HAj.A02, c38887HAj.A01);
        Iterator A0i = AbstractC31177DnL.A0i(c38887HAj.A02);
        while (A0i.hasNext()) {
            IIP iip = (IIP) A0i.next();
            User user = iip.A01;
            if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                Map map = c1563470e.A0C;
                INR A06 = c1563470e.A06(A00);
                if (A06 != null) {
                    i = A06.A00;
                } else {
                    i = iip.A00;
                }
                AbstractC37301Gc2.A1T(A00, map, i);
                Number A0Q = AbstractC37300Gc1.A0Q(A00, map);
                if (A0Q != null) {
                    iip.A00 = A0Q.intValue();
                }
                c1563470e.A01 = iip.A02;
                c1563470e.A0D.put(A00, iip.A03);
            } else {
                throw AbstractC25227BEk.A0n();
            }
        }
        C1563470e.A02(c1563470e);
        LinkedHashMap linkedHashMap = c70y.A05;
        if (linkedHashMap == null) {
            c70y.A05 = AbstractC166987dD.A1I();
        } else {
            linkedHashMap.clear();
        }
        LinkedHashMap linkedHashMap2 = c70y.A04;
        if (linkedHashMap2 == null) {
            c70y.A04 = AbstractC166987dD.A1I();
        } else {
            linkedHashMap2.clear();
        }
        Iterator A0i2 = AbstractC31177DnL.A0i(c38887HAj.A02);
        while (A0i2.hasNext()) {
            IIP iip2 = (IIP) A0i2.next();
            if (iip2.A00 > 0) {
                c70y.A05.put(AbstractC76433bn.A00(iip2.A01), iip2);
            }
        }
        Iterator A0i3 = AbstractC31177DnL.A0i(c38887HAj.A01);
        while (A0i3.hasNext()) {
            C41634IbP c41634IbP = (C41634IbP) A0i3.next();
            c70y.A04.put(AbstractC76433bn.A00(c41634IbP.A05), c41634IbP);
        }
        if (AbstractC31172DnG.A19(c38887HAj.A03).isEmpty()) {
            multiProductComponent = null;
        } else {
            multiProductComponent = (MultiProductComponent) AbstractC31172DnG.A19(c38887HAj.A03).get(0);
        }
        c70y.A01 = multiProductComponent;
        c70y.A00 = c38887HAj.A00;
        C70Y.A02(c70y.A03(), c70y, EnumC39539HdB.A03, false);
        C41187ILa c41187ILa = this.A00;
        if (c41187ILa != null) {
            c41187ILa.A00();
        }
        C0f9.A0A(270974100, A032);
        C0f9.A0A(852667036, A03);
    }
}
