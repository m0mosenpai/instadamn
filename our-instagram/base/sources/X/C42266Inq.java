package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Inq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42266Inq implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C42266Inq(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC41501vz
    public final void onEvent(Object obj) {
        int A03;
        int i;
        C42347Ip9 c42347Ip9;
        String str;
        Integer num;
        switch (this.A00) {
            case 0:
                Product product = (Product) this.A01;
                IMC imc = (IMC) this.A02;
                C42257Inh c42257Inh = (C42257Inh) obj;
                if (!c42257Inh.A02.equals(product.A0H)) {
                    return;
                }
                EnumC77213d7 enumC77213d7 = c42257Inh.A00;
                EnumC77213d7 enumC77213d72 = EnumC77213d7.A04;
                if (enumC77213d7 != enumC77213d72 && enumC77213d7 != EnumC77213d7.A03) {
                    return;
                }
                boolean z = true;
                boolean A1X = AbstractC167007dF.A1X(enumC77213d7, enumC77213d72);
                if (c42257Inh.A01 != C05F.A00) {
                    z = false;
                }
                imc.A00(A1X, z);
                return;
            case 1:
                A03 = C0f9.A03(418633065);
                C42257Inh c42257Inh2 = (C42257Inh) obj;
                int A032 = C0f9.A03(-774027338);
                EnumC77213d7 enumC77213d73 = EnumC77213d7.A04;
                EnumC77213d7 enumC77213d74 = c42257Inh2.A00;
                if (enumC77213d73 == enumC77213d74 || EnumC77213d7.A03 == enumC77213d74) {
                    IMC imc2 = (IMC) this.A02;
                    boolean z2 = true;
                    boolean A1X2 = AbstractC167007dF.A1X(enumC77213d74, enumC77213d73);
                    if (c42257Inh2.A01 != C05F.A00) {
                        z2 = false;
                    }
                    imc2.A00(A1X2, z2);
                }
                C0f9.A0A(176022473, A032);
                i = 1656983425;
                break;
            case 2:
                A03 = C0f9.A03(-183230543);
                C56007Ote c56007Ote = (C56007Ote) obj;
                int A0N = AbstractC167017dG.A0N(c56007Ote, -199662698);
                C37512GfU c37512GfU = ((C37443GeN) this.A02).A01;
                if (c37512GfU == null) {
                    C14360o3.A0F("scheduledContentPublishTimeViewBinder");
                    throw C00O.createAndThrow();
                }
                c37512GfU.A01((C38439GvM) this.A01, c56007Ote.A00);
                C0f9.A0A(773482603, A0N);
                i = -1105370305;
                break;
            case 3:
                A03 = C0f9.A03(-671215041);
                C42248InY c42248InY = (C42248InY) obj;
                int A0N2 = AbstractC167017dG.A0N(c42248InY, -1820878758);
                HCO hco = (HCO) this.A02;
                Product product2 = c42248InY.A00;
                AbstractC37301Gc2.A0P(hco).A01(((HZM) ((AbstractC39662Hir) this.A01)).A01, product2);
                InterfaceC41501vz interfaceC41501vz = hco.A01;
                if (interfaceC41501vz != null) {
                    AbstractC31176DnK.A0Q(hco.A0M).A02(interfaceC41501vz, C42248InY.class);
                }
                C0f9.A0A(-117231618, A0N2);
                i = 363253008;
                break;
            case 4:
                A03 = C0f9.A03(-1272809799);
                C71I c71i = (C71I) obj;
                int A0N3 = AbstractC167017dG.A0N(c71i, -1637588068);
                if (c71i.A05) {
                    if (c71i.A00 == EnumC39539HdB.A02) {
                        I6J.A00((UserSession) this.A02).A01(EnumC39623HeX.A04, c71i.A04, true);
                    }
                    C41642IbY A00 = I6J.A00((UserSession) this.A02);
                    EnumC39623HeX enumC39623HeX = EnumC39623HeX.A04;
                    str = c71i.A04;
                    A00.A02(enumC39623HeX, str, true);
                    c42347Ip9 = (C42347Ip9) this.A01;
                    Integer num2 = C05F.A00;
                    C38685GzQ c38685GzQ = new C38685GzQ(C39335HZa.A00, num2, 1);
                    Map map = c42347Ip9.A03;
                    C05A c05a = (C05A) map.get(str);
                    if (c05a != null) {
                        C38688GzT A04 = AbstractC37300Gc1.A04(c05a);
                        C38685GzQ c38685GzQ2 = (C38685GzQ) A04.A03;
                        C38685GzQ c38685GzQ3 = (C38685GzQ) A04.A02;
                        C38685GzQ c38685GzQ4 = (C38685GzQ) A04.A01;
                        AbstractC167027dH.A13(c38685GzQ2, c38685GzQ3, c38685GzQ4);
                        c05a.Egh(new C38688GzT(c38685GzQ, c38685GzQ2, c38685GzQ3, c38685GzQ4));
                    }
                    C41634IbP c41634IbP = c71i.A01;
                    if (c41634IbP != null) {
                        ArrayList A002 = c41634IbP.A00();
                        if (AbstractC167007dF.A1Z(c42347Ip9.A04)) {
                            if (c42347Ip9.A05.CWa()) {
                                C19K A0w = AbstractC167017dG.A0w(C12L.A00, 301752202);
                                AbstractC23641Du.A03(num2, AnonymousClass191.A00, new MVR(A002, c42347Ip9, enumC39623HeX, str, (InterfaceC23621Ds) null, 22), A0w);
                            }
                            if (c42347Ip9.A07) {
                                num = C05F.A01;
                            } else {
                                num = C05F.A0C;
                            }
                            Object obj2 = map.get(str);
                            if (obj2 != null) {
                                C19K A0w2 = AbstractC167017dG.A0w(C12L.A00, 301752202);
                                AbstractC23641Du.A03(num2, AnonymousClass191.A00, new D54(A002, c42347Ip9, num, obj2, enumC39623HeX, str, (InterfaceC23621Ds) null, 13), A0w2);
                            }
                        } else {
                            for (C05A c05a2 : C42347Ip9.A01(c42347Ip9, str)) {
                                ArrayList A0q = AbstractC167017dG.A0q(A002);
                                Iterator it = A002.iterator();
                                while (it.hasNext()) {
                                    A0q.add(new ProductFeedItem(AbstractC37300Gc1.A0L(it)));
                                }
                                C42347Ip9.A07(enumC39623HeX, str, A0q, c05a2);
                            }
                        }
                    }
                } else {
                    c42347Ip9 = (C42347Ip9) this.A01;
                    str = c71i.A04;
                    C05A c05a3 = (C05A) c42347Ip9.A03.get(str);
                    if (c05a3 != null) {
                        C38688GzT c38688GzT = (C38688GzT) c05a3.getValue();
                        C38685GzQ c38685GzQ5 = (C38685GzQ) c38688GzT.A03;
                        C38685GzQ c38685GzQ6 = (C38685GzQ) c38688GzT.A02;
                        C38685GzQ c38685GzQ7 = (C38685GzQ) c38688GzT.A01;
                        AbstractC167027dH.A13(c38685GzQ5, c38685GzQ6, c38685GzQ7);
                        c05a3.Egh(new C38688GzT((C38685GzQ) null, c38685GzQ5, c38685GzQ6, c38685GzQ7));
                    }
                }
                EnumC39623HeX enumC39623HeX2 = EnumC39623HeX.A04;
                Map A02 = C42347Ip9.A02(c42347Ip9, str);
                AnonymousClass195 anonymousClass195 = (AnonymousClass195) A02.get(enumC39623HeX2);
                if (anonymousClass195 != null) {
                    anonymousClass195.AGH(null);
                }
                A02.remove(enumC39623HeX2);
                C0f9.A0A(971699419, A0N3);
                i = -2137065027;
                break;
            default:
                return;
        }
        C0f9.A0A(i, A03);
    }
}
