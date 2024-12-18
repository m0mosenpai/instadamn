package X;

import com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* renamed from: X.TEr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64455TEr implements InterfaceC65452TkO {
    public InstantExperiencesSaveAutofillDialog A00;
    public final SHH A01;
    public final SLL A02 = new C60897RbC(this);
    public final Executor A03;
    public final UserSession A04;

    @Override // X.InterfaceC65452TkO
    public final SLL C07() {
        return this.A02;
    }

    public C64455TEr(SHH shh, UserSession userSession, Executor executor) {
        this.A04 = userSession;
        this.A03 = executor;
        this.A01 = shh;
    }
}
