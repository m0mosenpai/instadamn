package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class LXE implements InterfaceC57925PmV {
    public final /* synthetic */ C44454JlM A00;
    public final /* synthetic */ String A01;

    @Override // X.InterfaceC57925PmV
    public final void DBt(String str) {
        Object value;
        C50627MWo c50627MWo;
        ArrayList A0q;
        C44454JlM c44454JlM = this.A00;
        UserSession userSession = c44454JlM.A01;
        PendingMediaStore A00 = C25A.A00(userSession);
        String str2 = this.A01;
        C47Z A03 = A00.A03(str2);
        if (A03 != null) {
            C40121td A01 = C40121td.A0G.A01(AbstractC166987dD.A0O(c44454JlM.A00), userSession);
            A03.A2m = str;
            A01.A05.A04();
            C25A.A00(userSession).A0A();
            C05A c05a = c44454JlM.A05;
            do {
                value = c05a.getValue();
                c50627MWo = (C50627MWo) value;
                List<C45057Jwm> list = (List) c50627MWo.A01;
                A0q = AbstractC167017dG.A0q(list);
                for (C45057Jwm c45057Jwm : list) {
                    String str3 = c45057Jwm.A02;
                    if (C14360o3.A0K(str3, str2)) {
                        String str4 = c45057Jwm.A04;
                        String str5 = c45057Jwm.A01;
                        C7U c7u = c45057Jwm.A00;
                        boolean z = c45057Jwm.A06;
                        String str6 = c45057Jwm.A03;
                        boolean z2 = c45057Jwm.A07;
                        AbstractC167027dH.A0a(0, str3, str4, str5, c7u);
                        c45057Jwm = new C45057Jwm(c7u, str3, str, str4, str5, str6, z, z2);
                    }
                    A0q.add(c45057Jwm);
                }
            } while (!c05a.AIi(value, C50627MWo.A00((C7U) c50627MWo.A00, AbstractC133095zb.A00(A0q))));
            AnonymousClass229.A01(userSession).A1r(str2);
            if (A03.A0D() == ShareType.A09) {
                C43904JbF c43904JbF = c44454JlM.A02;
                AbstractC23641Du.A05(C12L.A00.CPG(603422383, 3), new MBX(c43904JbF, str2, str, (InterfaceC23621Ds) null, 9), AbstractC141776au.A00(c43904JbF));
            }
        }
    }

    public LXE(C44454JlM c44454JlM, String str) {
        this.A00 = c44454JlM;
        this.A01 = str;
    }
}
