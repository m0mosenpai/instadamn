package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.FrF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35777FrF implements InterfaceC131195w7 {
    public final UserSession A00;

    @Override // X.InterfaceC131195w7
    public final /* bridge */ /* synthetic */ Object AUr(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str = (String) obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C89563yw.A01;
        C89563yw c89563yw = new C89563yw(C1E2.A02(interfaceC23621Ds));
        C2JM A0b = AbstractC25225BEi.A0b();
        A0b.A04("encoded_token", str);
        boolean A1W = AbstractC167007dF.A1W(str);
        A0b.A04("item_capability", "DA");
        A0b.A04("target_platform", "INSTAGRAM_ADS");
        C18C.A0E(A1W);
        C907442n c907442n = new C907442n(A0b, E5W.class, "InstagramAREffectMetadataQuery", false);
        C195928le.A00(this.A00).ATV(new C64006Sxd(c89563yw, 2), new C64018Sxp(2, this, c89563yw), c907442n);
        return c89563yw.A00();
    }

    public C35777FrF(UserSession userSession) {
        this.A00 = userSession;
    }
}
