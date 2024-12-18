package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.4AB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AB {
    public final C19L A00 = AnonymousClass194.A02(C12L.A00.CPG(1622264421, 3));

    public static final void A00(ImageUrl imageUrl, C19L c19l) {
        if (imageUrl != null) {
            C206629Ct c206629Ct = new C206629Ct(imageUrl, null, 24);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206629Ct, c19l);
        }
    }

    public final void A01(UserSession userSession, List list) {
        int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36608961201575723L);
        if (A01 > 0) {
            C19L c19l = this.A00;
            C9DH c9dh = new C9DH(this, list, (InterfaceC23621Ds) null, A01);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dh, c19l);
        }
    }
}
