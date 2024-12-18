package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.HJh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39109HJh extends AbstractC64162vb {
    public final IIH A00;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        User user = (User) obj;
        C14360o3.A0B(user, 0);
        IIH iih = this.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(iih.A03, "instagram_shopping_continue_shopping_row_impression");
        if (A0f.isSampled()) {
            AbstractC37300Gc1.A0f(A0f, iih.A02);
            AbstractC37301Gc2.A17(A0f, AbstractC76433bn.A00(user));
            A0f.AAK(null, "marketer_id");
            A0f.AAQ(iih.A00, "collections_logging_info");
            A0f.AAQ(iih.A01, "feed_item_info");
            A0f.Cht();
        }
    }

    public C39109HJh(UserSession userSession, IIH iih) {
        super(AbstractC37302Gc3.A0J(userSession));
        this.A00 = iih;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
