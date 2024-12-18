package X;

import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalEditRepository;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mer, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50922Mer extends AbstractC52922bZ {
    public final UserSession A00;
    public final OpalEditRepository A01;
    public final MV3 A02;
    public final User A03;
    public final C05A A04;
    public final C0UO A05;

    public /* synthetic */ C50922Mer(UserSession userSession, OpalEditRepository opalEditRepository) {
        MV3 mv3 = new MV3(userSession);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = opalEditRepository;
        this.A02 = mv3;
        C008002u A1H = AbstractC25225BEi.A1H(new C51760Mtj((OpalProfileData) null, (OpalProfileData) null, (C74) null, (DefaultConstructorMarker) null, 7, 45));
        this.A04 = A1H;
        this.A05 = A1H;
        this.A03 = AbstractC166997dE.A0Y(userSession);
        PZG.A01(this, AbstractC141776au.A00(this), 18);
    }
}
