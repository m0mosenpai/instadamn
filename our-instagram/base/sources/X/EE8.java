package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EE8 extends AnonymousClass935 {
    public final int A00;
    public final C32071E6x A01;
    public final AbstractC33630Etg A02;
    public final Integer A03;
    public final Collection A04;
    public final Context A05;

    public EE8(Context context, C32071E6x c32071E6x, UserSession userSession, AbstractC33630Etg abstractC33630Etg, Integer num, Collection collection, int i) {
        super(userSession);
        this.A05 = context;
        this.A02 = abstractC33630Etg;
        this.A01 = c32071E6x;
        this.A03 = num;
        this.A04 = collection;
        this.A00 = i;
    }

    @Override // X.AnonymousClass935
    public final void A01(UserSession userSession) {
        int A0N = AbstractC167017dG.A0N(userSession, 1561425102);
        this.A02.A02(userSession);
        C0f9.A0A(1086739505, A0N);
    }

    @Override // X.AnonymousClass935
    public final void A02(UserSession userSession) {
        int A0N = AbstractC167017dG.A0N(userSession, 645436993);
        this.A02.A03(userSession);
        C0f9.A0A(1868738506, A0N);
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03 = C0f9.A03(1649183190);
        AbstractC167017dG.A1N(userSession, abstractC115105If);
        this.A02.A01(abstractC115105If, userSession);
        C0f9.A0A(1835292165, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(698955452);
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) obj;
        int A032 = C0f9.A03(1920238904);
        AbstractC167017dG.A1N(userSession, interfaceC40821up);
        this.A02.A00(this.A01, interfaceC40821up, userSession);
        C0f9.A0A(-41998316, A032);
        C0f9.A0A(77291950, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        Collection collection;
        int A03 = C0f9.A03(1465499634);
        int A032 = C0f9.A03(1402473591);
        C14360o3.A0B(userSession, 0);
        int intValue = this.A03.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                collection = this.A04;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AbstractC28761aE.A00(userSession).EGR(new DirectThreadKey(AbstractC166987dD.A1B(it), null), true, false);
                }
            } else {
                B4Z A00 = B4Z.A00();
                C0f9.A0A(-930892868, A032);
                throw A00;
            }
        } else {
            collection = this.A04;
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it2);
                AbstractC28761aE.A00(userSession).A7C(new DirectThreadKey(A1B, null));
                C2DS A002 = AbstractC28761aE.A00(userSession);
                C81663kb A0M = AbstractC31175DnJ.A0M(A002, A1B);
                if (A0M != null && !A0M.Cf8(userSession)) {
                    C7TP c7tp = new C7TP(userSession, new G5M(userSession, A0M), A002);
                    C83403nh BLs = A0M.BLs();
                    C83403nh BM6 = A0M.BM6();
                    if (BLs == null) {
                        BLs = BM6;
                    }
                    C206259Bi c206259Bi = null;
                    if (BLs != null && BLs.A0h() != null) {
                        c206259Bi = new C206259Bi(BLs, BM6);
                    }
                    c7tp.CnG(c206259Bi, AbstractC31171DnF.A0N(A1B), true);
                }
            }
        }
        ((C2DU) AbstractC28761aE.A00(userSession)).A0C.A0I(collection.size());
        LA3 la3 = new LA3(userSession);
        ((C2DU) AbstractC28761aE.A00(userSession)).A0C.A0N(la3.A00(), this.A00, false);
        C0f9.A0A(2076160375, A032);
        C0f9.A0A(-56121158, A03);
    }
}
