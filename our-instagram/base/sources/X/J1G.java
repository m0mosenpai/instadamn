package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J1G implements InterfaceC62602sz {
    public final C154796xU A00;
    public final C42509Iro A01;

    public final void A00(boolean z) {
        String str;
        C42509Iro c42509Iro = this.A01;
        if (z) {
            str = null;
        } else {
            str = this.A00.A03.A07;
        }
        C25621Ms A0N = AbstractC31173DnH.A0N(c42509Iro.A02);
        A0N.A0B("media/story_countdowns/");
        A0N.A0S(C214509eo.class, AEG.class);
        if (str != null) {
            A0N.A9s("max_id", str);
        }
        this.A00.A03(A0N.A0N(), new C38290GsZ(5, this, z));
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return AbstractC167007dF.A1O(this.A01.A05.A01.size());
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return this.A00.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC37303Gc4.A1b(this.A00);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        C154796xU c154796xU = this.A00;
        if (!AbstractC37303Gc4.A1b(c154796xU) && !AbstractC37303Gc4.A1a(c154796xU)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A00(AbstractC25229BEm.A1Z(this.A00.A03.A07));
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return AbstractC37303Gc4.A1a(this.A00);
    }

    public J1G(Context context, AbstractC018607g abstractC018607g, UserSession userSession, C42509Iro c42509Iro) {
        this.A01 = c42509Iro;
        this.A00 = new C154796xU(context, abstractC018607g, userSession);
    }
}
