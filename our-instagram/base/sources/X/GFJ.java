package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GFJ implements InterfaceC37179GZq {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C154796xU A02;
    public final GZP A03;
    public final List A04;
    public final List A05;
    public final Map A06;

    public GFJ(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, GZP gzp, List list, List list2, Map map) {
        AbstractC25233BEq.A0x(2, userSession, gzp, list);
        C14360o3.A0B(list2, 8);
        this.A01 = userSession;
        this.A03 = gzp;
        this.A04 = list;
        this.A06 = map;
        this.A05 = list2;
        this.A00 = interfaceC11380iw;
        this.A02 = new C154796xU(context, abstractC018607g, userSession);
    }

    private final void A00(boolean z, boolean z2) {
        try {
            C154796xU c154796xU = this.A02;
            String str = z ? null : c154796xU.A03.A07;
            UserSession userSession = this.A01;
            EnumC33416Epn[] values = EnumC33416Epn.values();
            C14360o3.A0B(values, 0);
            ArrayList A1F = AbstractC166987dD.A1F(new C17000ss(values, false));
            A1F.remove(EnumC33416Epn.A0D);
            c154796xU.A03(AbstractC35217FgA.A01(userSession, str, A1F, this.A06), new C32954Eel(this, 0, z2, z));
        } catch (IOException unused) {
            this.A03.DGh(z);
        }
    }

    @Override // X.InterfaceC37179GZq
    public final void AAa(SavedCollection savedCollection) {
    }

    @Override // X.InterfaceC37179GZq
    public final void EFA(String str) {
    }

    public final void A01() {
        if (this.A02.A06()) {
            A00(false, true);
        }
    }

    public final void A02(boolean z, boolean z2) {
        C36295Fzp A00 = FBA.A00(this.A01);
        if (A00.A07() && z) {
            this.A03.DGr(A00.A02(this.A04, this.A05), true);
        } else {
            A00(true, z2);
        }
    }

    public final boolean A03() {
        return AbstractC167007dF.A1X(this.A02.A03.A03, C05F.A00);
    }

    @Override // X.InterfaceC37179GZq
    public final void ECo(InterfaceC16820sZ interfaceC16820sZ) {
        if (!A03()) {
            A00(true, true);
        }
    }
}
