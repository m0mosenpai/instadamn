package X;

import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.nido.impl.NidoFeatureProviderImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dvv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31690Dvv extends C4A7 {
    public final UserSession A00;
    public final HashMap A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final C05A A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31690Dvv(UserSession userSession) {
        super("nido_explore", C4A8.A00(1561799502));
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = AbstractC09440dt.A01(C31692Dvx.A00);
        this.A02 = AbstractC09440dt.A01(C31689Dvu.A00);
        this.A07 = C10E.A00(NidoFeatureProviderImpl.A00(AbstractC86593tX.A0G(userSession, false)));
        this.A01 = AbstractC166987dD.A1G();
        this.A05 = AbstractC25235BEs.A0t(this, 29);
        this.A04 = AbstractC25235BEs.A0t(this, 28);
        this.A06 = AbstractC25235BEs.A0t(this, 30);
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        this.A01.put(str, AbstractC31173DnH.A0g());
    }

    public static final void A00(C31690Dvv c31690Dvv) {
        InterfaceC09390do interfaceC09390do = c31690Dvv.A05;
        Iterable iterable = (Iterable) ((C0UO) interfaceC09390do.getValue()).getValue();
        ArrayList<C31691Dvw> A1E = AbstractC166987dD.A1E();
        for (Object obj : iterable) {
            if (((C31691Dvw) obj).A01 == C05F.A0Y) {
                A1E.add(obj);
            }
        }
        ArrayList A0i = AbstractC167007dF.A0i(A1E);
        for (C31691Dvw c31691Dvw : A1E) {
            Integer num = C05F.A00;
            String str = c31691Dvw.A02;
            String str2 = c31691Dvw.A03;
            ExploreTopicCluster exploreTopicCluster = c31691Dvw.A00;
            C14360o3.A0B(str2, 1);
            A0i.add(new C31691Dvw(exploreTopicCluster, num, str, str2));
        }
        ArrayList A0U = AbstractC001800i.A0U(AbstractC001800i.A0g(A0i, new C31460Ds4(c31690Dvv, 14)));
        if (A0U.size() < 5) {
            int size = 5 - A0U.size();
            Iterable iterable2 = (Iterable) ((C0UO) interfaceC09390do.getValue()).getValue();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj2 : iterable2) {
                if (((C31691Dvw) obj2).A01 == C05F.A0N) {
                    A1E2.add(obj2);
                }
            }
            List<C31691Dvw> A0d = AbstractC001800i.A0d(C0eM.A1H(A1E2), size);
            ArrayList A0i2 = AbstractC167007dF.A0i(A0d);
            for (C31691Dvw c31691Dvw2 : A0d) {
                Integer num2 = C05F.A01;
                String str3 = c31691Dvw2.A02;
                String str4 = c31691Dvw2.A03;
                ExploreTopicCluster exploreTopicCluster2 = c31691Dvw2.A00;
                C14360o3.A0B(str4, 1);
                A0i2.add(new C31691Dvw(exploreTopicCluster2, num2, str3, str4));
            }
            A0U.addAll(A0i2);
        }
        A01(c31690Dvv, C05F.A00, AbstractC001800i.A0T(new C31691Dvw(null, C05F.A0C, null, ""), A0U));
    }

    public final void A02() {
        Integer num;
        UserSession userSession = this.A00;
        boolean z = false;
        boolean z2 = false;
        if (C18U.A06(C06090Tz.A05, userSession, 36326992303700199L)) {
            Iterator it = AbstractC001800i.A0S((Iterable) ((C0UO) this.A04.getValue()).getValue(), (Collection) ((C0UO) this.A05.getValue()).getValue()).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Integer num2 = ((C31691Dvw) next).A01;
                if (num2 == C05F.A0Y || num2 == C05F.A00) {
                    if (next != null) {
                        z2 = true;
                    }
                    z = !z2;
                }
            }
            z = !z2;
        }
        Integer A0G = AbstractC86593tX.A0G(userSession, z);
        C05A c05a = this.A07;
        MR7 mr7 = (MR7) c05a.getValue();
        Integer num3 = null;
        if (mr7 != null) {
            num = mr7.CAt();
        } else {
            num = null;
        }
        if (A0G != num) {
            MR7 A00 = NidoFeatureProviderImpl.A00(A0G);
            if (mr7 != null) {
                num3 = mr7.CAt();
            }
            if (num3 == C05F.A01) {
                A00(this);
            }
            c05a.Egh(A00);
        }
    }

    public static final void A01(C31690Dvv c31690Dvv, Integer num, List list) {
        C05A c05a;
        if (num.intValue() != 0) {
            c05a = (C05A) c31690Dvv.A03.getValue();
        } else {
            c05a = (C05A) c31690Dvv.A02.getValue();
            if (!C18U.A06(C06090Tz.A05, c31690Dvv.A00, 36326992303438052L)) {
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : list) {
                    if (((C31691Dvw) obj).A01 == C05F.A00) {
                        A1E.add(obj);
                    }
                }
                list = A1E;
            }
        }
        c05a.Egh(list);
    }
}
