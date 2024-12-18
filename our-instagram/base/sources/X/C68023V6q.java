package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.V6q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68023V6q extends AbstractC64162vb {
    public final UserSession A00;
    public final InterfaceC60442pS A01;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        SavedCollection savedCollection = (SavedCollection) obj;
        C51737MtK c51737MtK = (C51737MtK) obj2;
        AbstractC167017dG.A1N(savedCollection, c51737MtK);
        UserSession userSession = this.A00;
        InterfaceC02590Ai A09 = AbstractC37302Gc3.A09(this.A01, userSession);
        if (A09.isSampled()) {
            String str = savedCollection.A0F;
            C14360o3.A07(str);
            A09.A9K("entity_id", AbstractC166997dE.A0j(str));
            A09.AAP("collection_id", savedCollection.A0F);
            A09.AAP("position", AbstractC154266wb.A00(c51737MtK.A01, c51737MtK.A00));
            A09.AAP("collection_name", savedCollection.A0G);
            A09.AAP("collection_type", savedCollection.A02());
            AbstractC25233BEq.A17(A09, "user_type", AbstractC35089Fd0.A01(savedCollection.A01(userSession)));
            AbstractC25234BEr.A11(A09, AbstractC111324zv.A00(205), AbstractC37301Gc2.A0g(A09));
            A09.Cht();
        }
    }

    public C68023V6q(C1BX c1bx, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        super(c1bx);
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
