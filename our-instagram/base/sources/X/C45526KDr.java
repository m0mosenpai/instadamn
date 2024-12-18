package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.io.Closeable;

/* renamed from: X.KDr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45526KDr extends AbstractC61152qd {
    public final KZB A00;
    public final InterfaceC19390xP A01;

    public C45526KDr(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        KZB kzb = new KZB(userSession);
        this.A00 = kzb;
        this.A01 = new M9S(kzb.A04, 1);
        addCloseable((Closeable) kzb);
    }

    public final void A00(DirectThreadKey directThreadKey) {
        C14360o3.A0B(directThreadKey, 0);
        KZB kzb = this.A00;
        String str = directThreadKey.A00;
        if (str != null) {
            AbstractC166987dD.A1Z(new MC9(kzb, directThreadKey, str, (InterfaceC23621Ds) null, 38), ((C4A7) kzb).A01);
        }
    }
}
