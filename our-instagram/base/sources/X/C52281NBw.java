package X;

import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.expandablefooter.retailads.viewmodel.IGMetadataFooterRepository;

/* renamed from: X.NBw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52281NBw extends AbstractC61132qb {
    public final UserSession A00;
    public final C38321qM A01;

    public C52281NBw(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c38321qM;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50911Meg(userSession, this.A01, new IGMetadataFooterRepository(userSession));
    }
}
