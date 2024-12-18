package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EOk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32384EOk extends AbstractC193068gm {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
    }

    public C32384EOk(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q A0E = AbstractC31175DnJ.A0E(obj);
        UserSession userSession = this.A01;
        AbstractC33787EwD.A00(AbstractC31178DnM.A0G(this.A00, userSession, "UserBlockPluginImpl"), A0E);
        InterfaceC19610xo A0e = AbstractC31174DnI.A0e(userSession, AnonymousClass280.A01);
        A0e.E77("HAS_SEEN_SUPERVISION_UPSELL", true);
        A0e.apply();
    }
}
