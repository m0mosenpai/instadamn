package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.util.HashSet;

/* renamed from: X.Ipo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42387Ipo implements InterfaceC43071ya {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final SavedCollection A02;
    public final HashSet A03 = AbstractC166987dD.A1H();

    public C42387Ipo(InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection) {
        this.A01 = userSession;
        this.A02 = savedCollection;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            C38321qM BQN = ((InterfaceC127975qQ) c59062n7.A03).BQN();
            if (this.A03.add(BQN.getId())) {
                C5qT c5qT = ((C38162GqT) c59062n7.A04).A00;
                int i = c5qT.A01;
                int i2 = c5qT.A00;
                InterfaceC11380iw interfaceC11380iw = this.A00;
                UserSession userSession = this.A01;
                SavedCollection savedCollection = this.A02;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_collection_home_impression");
                if (A0f.isSampled()) {
                    String A01 = AbstractC154266wb.A01(i, i2);
                    User A2E = BQN.A2E(userSession);
                    A0f.AAP("collection_id", savedCollection.A0F);
                    A0f.AAP("collection_name", savedCollection.A0G);
                    A0f.AAP("position", A01);
                    A0f.A9T(AbstractC111324zv.A00(904), "");
                    AbstractC37302Gc3.A0t(A0f);
                    A0f.A9K("m_t", AbstractC37302Gc3.A0U(BQN));
                    AbstractC37302Gc3.A0x(A0f, BQN);
                    A0f.AAP("algorithm", BQN.A0C.getAlgorithm());
                    if (A2E != null) {
                        A0f.A9K("a_pk", AbstractC25231BEo.A0k(A2E));
                    }
                    AbstractC25234BEr.A11(A0f, "device_aspect_ratio_category", AbstractC37301Gc2.A0g(A0f));
                    A0f.Cht();
                }
            }
        }
    }
}
