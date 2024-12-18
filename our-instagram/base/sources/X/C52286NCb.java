package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.NCb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52286NCb extends AbstractC61132qb {
    public final IGRevShareProductType A00;
    public final UserSession A01;
    public final String A02;

    public C52286NCb(IGRevShareProductType iGRevShareProductType, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = iGRevShareProductType;
        this.A02 = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.NvR] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50934Mf3(this.A00, new O8N(this.A01, new Object()), this.A02);
    }
}
