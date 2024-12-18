package X;

import com.instagram.user.model.CreatorShoppingInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GtE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38319GtE extends AbstractC52922bZ {
    public final InterfaceC60442pS A00;
    public final AbstractC39667Hiw A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final Map A09;
    public final Map A0A;
    public final InterfaceC224417g A0B;

    public C38319GtE(InterfaceC60442pS interfaceC60442pS, AbstractC39667Hiw abstractC39667Hiw, User user, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        CreatorShoppingInfo At3;
        List BNf;
        C14360o3.A0B(interfaceC60442pS, 4);
        AbstractC167017dG.A1T(str, str2);
        C14360o3.A0B(abstractC39667Hiw, 9);
        this.A02 = user;
        this.A00 = interfaceC60442pS;
        this.A03 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A01 = abstractC39667Hiw;
        this.A04 = str5;
        C225117n A05 = AbstractC224517h.A05(AbstractC001800i.A0o(AbstractC001800i.A0S((user == null || (At3 = user.A03.At3()) == null || (BNf = At3.BNf()) == null) ? C16930sl.A00 : BNf, AbstractC166987dD.A1J(z ? user : null))));
        this.A0B = A05;
        C225017m A09 = AbstractC224517h.A09(C43345JDm.A00, A05);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        AbstractC06930Yk.A0G(A1I, A09);
        this.A0A = AbstractC06930Yk.A0A(A1I);
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            AbstractC166997dE.A1R(A15.getUsername(), A15, A0i);
        }
        this.A09 = AbstractC06930Yk.A08(A0i);
        C225017m A092 = AbstractC224517h.A09(C43361JEc.A01(this, 29), this.A0B);
        ArrayList A0i2 = AbstractC167007dF.A0i(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            User A152 = AbstractC25226BEj.A15(it2);
            String A0U = AbstractC37300Gc1.A0U(A152);
            C14360o3.A0A(A0U);
            A0i2.add(new C38652Gyt(A152.A03.Bhu(), A0U, AbstractC37303Gc4.A0W(A152), AbstractC37303Gc4.A0W(A152), this.A03, this.A05, this.A06, this.A07, this.A04, -1, false));
        }
        C225117n A052 = AbstractC224517h.A05(new M9O(JEY.A00, C50353MLf.A00, new C0eE(new InterfaceC224417g[]{A092, AbstractC001800i.A0o(A0i2)})));
        C43364JEf c43364JEf = C43364JEf.A00;
        C14360o3.A0B(c43364JEf, 1);
        this.A08 = AbstractC224517h.A02(new PV2(c43364JEf, A052));
    }
}
