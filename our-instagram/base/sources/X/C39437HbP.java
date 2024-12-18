package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;

/* renamed from: X.HbP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39437HbP extends C30O {
    public IntentAwareAdsInfoIntf A00;
    public Integer A01;
    public final UserSession A02;

    public C39437HbP(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Integer num) {
        super(userSession, interfaceC60442pS, null, false);
        this.A02 = userSession;
        this.A00 = intentAwareAdsInfoIntf;
        this.A01 = num;
    }

    @Override // X.C30P
    public final void A0A(C19280xC c19280xC, C4SW c4sw) {
        C95714Sf c95714Sf;
        C14360o3.A0B(c19280xC, 0);
        if (c4sw != null && (c95714Sf = c4sw.A07) != null) {
            c95714Sf.A00 = this.A00;
            c95714Sf.A0I = this.A01;
        }
    }

    @Override // X.C30P
    public final Integer A08() {
        return C05F.A1I;
    }
}
