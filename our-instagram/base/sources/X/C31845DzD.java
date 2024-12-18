package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveHomeViewModel$makeRequest$1;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DzD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31845DzD extends AbstractC52922bZ implements InterfaceC37179GZq {
    public C05A A00;
    public final UserSession A01;
    public final FLD A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.FLD, java.lang.Object] */
    public C31845DzD(UserSession userSession, String str, List list, List list2, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        AbstractC167017dG.A1U(list, list2);
        this.A01 = userSession;
        this.A03 = str;
        this.A06 = z;
        this.A07 = z2;
        this.A04 = list;
        this.A05 = list2;
        this.A02 = new Object();
        this.A00 = AbstractC25227BEk.A0z();
    }

    public static final void A00(C31845DzD c31845DzD, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        Integer num = c31845DzD.A02.A00;
        Integer num2 = C05F.A00;
        if (num != num2) {
            C141796aw A00 = AbstractC141776au.A00(c31845DzD);
            AbstractC23641Du.A03(num2, AnonymousClass191.A00, new SaveHomeViewModel$makeRequest$1(c31845DzD, null, interfaceC16820sZ, z, true), A00);
        }
    }

    @Override // X.InterfaceC37179GZq
    public final void AAa(SavedCollection savedCollection) {
        C05A c05a = this.A00;
        AbstractC33568Esg abstractC33568Esg = (AbstractC33568Esg) c05a.getValue();
        if (abstractC33568Esg instanceof C33133Ejc) {
            C33133Ejc c33133Ejc = (C33133Ejc) abstractC33568Esg;
            ArrayList A0U = AbstractC001800i.A0U(c33133Ejc.A00);
            Iterator it = A0U.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((SavedCollection) it.next()).A07 == EnumC33416Epn.A0A) {
                    if (i != -1) {
                        A0U.add(i, savedCollection);
                    }
                } else {
                    i++;
                }
            }
            A0U.add(savedCollection);
            c05a.Egh(new C33133Ejc(A0U, c33133Ejc.A01));
        }
    }

    @Override // X.InterfaceC37179GZq
    public final void ECo(InterfaceC16820sZ interfaceC16820sZ) {
        if (this.A02.A00 != C05F.A00) {
            A00(this, interfaceC16820sZ, true);
        }
    }

    @Override // X.InterfaceC37179GZq
    public final void EFA(String str) {
        C05A c05a = this.A00;
        AbstractC33568Esg abstractC33568Esg = (AbstractC33568Esg) c05a.getValue();
        if (abstractC33568Esg instanceof C33133Ejc) {
            C33133Ejc c33133Ejc = (C33133Ejc) abstractC33568Esg;
            List list = c33133Ejc.A00;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                AbstractC25232BEp.A1Q(((SavedCollection) obj).A0F, str, obj, A1E);
            }
            c05a.Egh(new C33133Ejc(A1E, c33133Ejc.A01));
        }
    }
}
