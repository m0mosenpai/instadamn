package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.WnY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71076WnY implements InterfaceC62602sz, InterfaceC62612t0 {
    public final UserSession A00;
    public final C154796xU A01;
    public final C70851WiH A02;
    public final Context A03;
    public final AbstractC018607g A04;

    public final void A00(boolean z) {
        String str;
        if (z) {
            str = null;
        } else {
            str = this.A01.A03.A07;
        }
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A00);
        A0M.A0B("upcoming_events/list_story_taggable_events/");
        A0M.A0R(C171937lO.class, C171947lP.class);
        if (str != null) {
            A0M.A9s("max_id", str);
        }
        this.A01.A03(A0M.A0N(), new C68044V7w(2, this, z));
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (this.A01.A05()) {
            A00(false);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        if (this.A02.A00 != null) {
            return !r0.A00.isEmpty();
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return this.A01.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC37303Gc4.A1b(this.A01);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        C154796xU c154796xU = this.A01;
        if (!AbstractC37303Gc4.A1b(c154796xU) && !AbstractC37303Gc4.A1a(c154796xU) && CL7()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A00(AbstractC25229BEm.A1Z(this.A01.A03.A07));
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return AbstractC37303Gc4.A1a(this.A01);
    }

    public C71076WnY(Context context, AbstractC018607g abstractC018607g, UserSession userSession, C70851WiH c70851WiH) {
        this.A03 = context;
        this.A04 = abstractC018607g;
        this.A00 = userSession;
        this.A02 = c70851WiH;
        this.A01 = new C154796xU(context, abstractC018607g, userSession);
    }
}
