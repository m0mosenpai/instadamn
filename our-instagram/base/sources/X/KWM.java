package X;

import com.instagram.api.schemas.CreatorSegmentation;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KWM extends C98O {
    public final C69613Av A00;
    public final C69613Av A01;
    public final C69613Av A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWM(UserSession userSession, boolean z, boolean z2) {
        super(userSession, "pending_threads", 31791050, z, z2);
        C14360o3.A0B(userSession, 1);
        this.A01 = A02("server_fetch");
        this.A02 = A02("server_rendered");
        this.A00 = A02("cache_rendered");
    }

    @Override // X.C98O, X.AbstractC69603Au
    public final void A05() {
        super.A05();
        InterfaceC224116z Asx = AbstractC31171DnF.A0T(((C98O) this).A07, C17060sy.A01).Asx();
        if (Asx != null) {
            Boolean CRv = Asx.CRv();
            if (CRv != null) {
                A0K("is_creator", CRv.booleanValue());
            }
            CreatorSegmentation At2 = Asx.At2();
            if (At2 != null) {
                A0J("creator_segmentation", At2.toString());
            }
        }
    }
}
