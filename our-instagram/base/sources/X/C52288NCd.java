package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.productsonprofile.producttab.ui.ProductTabRepository;

/* renamed from: X.NCd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52288NCd extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public C52288NCd(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50945MfE(userSession, new ProductTabRepository(userSession), this.A01, this.A02);
    }
}
