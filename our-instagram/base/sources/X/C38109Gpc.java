package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gpc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C38109Gpc extends C03E implements InterfaceC16590sC {
    public C38109Gpc(Object obj) {
        super(5, obj, C38P.class, "handleTriMediaKeywordMediaClick", "handleTriMediaKeywordMediaClick(Lcom/instagram/discovery/recyclerview/model/TriMediaKeywordGridItemViewModel;Lcom/instagram/feed/media/Media;Lcom/instagram/common/recyclerview/grid/model/GridPosition;ILandroid/view/View;)V", 0);
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ArrayList arrayList;
        HKX hkx = (HKX) obj;
        C38321qM c38321qM = (C38321qM) obj2;
        C5qT c5qT = (C5qT) obj3;
        ((Number) obj4).intValue();
        AbstractC167027dH.A12(hkx, c38321qM, c5qT);
        C14360o3.A0B(obj5, 4);
        C38089GpI c38089GpI = ((C38P) this.receiver).A0C;
        if (c38089GpI == null) {
            C14360o3.A0F("exploreGridDelegate");
            throw C00O.createAndThrow();
        }
        C38089GpI.A01(c5qT, hkx, c38089GpI, c38321qM);
        FragmentActivity requireActivity = c38089GpI.A0G.A00.requireActivity();
        UserSession userSession = c38089GpI.A0B;
        AnonymousClass309 anonymousClass309 = c38089GpI.A0K;
        C132835z6 c132835z6 = hkx.A02;
        Keyword A00 = c132835z6.A00();
        String moduleName = anonymousClass309.getModuleName();
        String A0j = AbstractC167017dG.A0j();
        List list = c132835z6.A05;
        if (list != null) {
            arrayList = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0g = AbstractC37302Gc3.A0g(it);
                if (A0g != null) {
                    arrayList.add(A0g);
                }
            }
        } else {
            arrayList = null;
        }
        IS3.A01(requireActivity, userSession, null, anonymousClass309, c38321qM, A00, A0j, moduleName, "", null, arrayList, C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36317534786164060L));
        return C0eB.A00;
    }
}
