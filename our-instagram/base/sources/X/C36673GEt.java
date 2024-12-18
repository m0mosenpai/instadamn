package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36673GEt implements GYB {
    public C31349DqE A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;

    public C36673GEt(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(abstractC59962oe, 1);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
    }

    public static final void A00(C36673GEt c36673GEt) {
        AbstractC59962oe abstractC59962oe = c36673GEt.A01;
        UserSession userSession = c36673GEt.A02;
        int i = EnumC33412Epj.A08.A00;
        Integer valueOf = Integer.valueOf(i);
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        AbstractC31181DnP.A0m(A0q);
        if (valueOf != null) {
            A0q.A0D("visibility_status", i);
        }
        C1ON A0T = AbstractC31172DnG.A0T(A0q, "surface", "qp");
        C14360o3.A0C(A0T, AbstractC111324zv.A00(1138));
        C31702Dw7.A01(A0T, c36673GEt, 29);
        abstractC59962oe.schedule(A0T);
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        A00(this);
    }
}
