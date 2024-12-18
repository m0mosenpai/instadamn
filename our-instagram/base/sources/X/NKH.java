package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NKH extends OX6 {
    public C52094N2u A00;
    public C47Z A01;
    public TaggingFeedMultiSelectState A02;
    public List A03;
    public List A04;
    public List A05;
    public final UserSession A06;
    public final AbstractC55082Oac A07;
    public final String A08;
    public final C05A A09;
    public final C0UO A0A;
    public final InterfaceC11380iw A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKH(InterfaceC11380iw interfaceC11380iw, UserSession userSession, AbstractC55082Oac abstractC55082Oac, String str) {
        super(abstractC55082Oac);
        AbstractC25233BEq.A0w(2, userSession, interfaceC11380iw, str);
        this.A07 = abstractC55082Oac;
        this.A06 = userSession;
        this.A0B = interfaceC11380iw;
        this.A08 = str;
        C008002u A1H = AbstractC25225BEi.A1H(new C52460NJe(null, null, false, false));
        this.A09 = A1H;
        this.A0A = A1H;
        C16930sl c16930sl = C16930sl.A00;
        this.A05 = c16930sl;
        this.A04 = c16930sl;
        this.A03 = AbstractC166987dD.A1E();
    }

    public static final void A00(NKH nkh, List list) {
        C47Z c47z = nkh.A01;
        if (c47z != null) {
            c47z.A43 = AbstractC166987dD.A1F(list);
        }
        C05A c05a = nkh.A09;
        C52460NJe c52460NJe = (C52460NJe) c05a.getValue();
        c05a.Egh(new C52460NJe(c52460NJe.A00, list, c52460NJe.A02, c52460NJe.A03));
    }

    public final void A08() {
        C47Z c47z;
        JWd jWd = A04().A05;
        if (jWd != null && jWd.A01 != null) {
            UserSession userSession = this.A06;
            C52094N2u c52094N2u = this.A00;
            if ((Ny2.A00(userSession) || (c52094N2u != null && c52094N2u.A01 != null)) && (c47z = this.A01) != null) {
                InterfaceC11380iw interfaceC11380iw = this.A0B;
                String str = this.A08;
                List list = this.A04;
                List list2 = this.A03;
                C14360o3.A0B(list2, 5);
                String str2 = c47z.A33;
                if (str2 != null) {
                    if (AbstractC199308rX.A03(userSession)) {
                        new C55067OaN(userSession, (ArrayList) null, str, AbstractC55229Oez.A05(AbstractC31174DnI.A0z(str2)), "reels", interfaceC11380iw).A01();
                    }
                    if (Ny2.A00(userSession)) {
                        if (!list2.isEmpty()) {
                            ArrayList A0q = AbstractC167017dG.A0q(list2);
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                AbstractC167017dG.A1V(A0q, it);
                            }
                            ArrayList A1E = AbstractC166987dD.A1E();
                            for (Object obj : A0q) {
                                AbstractC25228BEl.A1Q(obj, A1E, list.contains(obj) ? 1 : 0);
                            }
                            list = AbstractC06950Ym.A1F(AbstractC16960so.A1Q(list, A1E));
                        }
                        if (list.isEmpty()) {
                            c47z.A43 = AbstractC166987dD.A1E();
                            return;
                        }
                        ArrayList A05 = AbstractC55229Oez.A05(AbstractC31174DnI.A0z(str2));
                        ArrayList arrayList = null;
                        if (list instanceof ArrayList) {
                            arrayList = (ArrayList) list;
                        }
                        new C55067OaN(interfaceC11380iw, userSession, str, "reels", A05, arrayList).A01();
                    }
                }
            }
        }
    }
}
