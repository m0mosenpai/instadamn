package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.IrK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42479IrK implements InterfaceC76813cT {
    public final UserSession A00;

    public C42479IrK(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC76813cT
    public final CharSequence C5v(Context context, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(context, 0);
        return AbstractC166997dE.A0p(context, 2131976886);
    }

    @Override // X.InterfaceC76813cT
    public final boolean EjR(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        List A0Y;
        String id;
        AbstractCollection abstractCollection;
        C14360o3.A0B(c38321qM, 0);
        if (!c38321qM.A5F() || !c38321qM.A53() || (A0Y = AbstractC37300Gc1.A0Y(c38321qM)) == null || (id = AbstractC25225BEi.A0x(A0Y, 0).getId()) == null || (abstractCollection = (AbstractCollection) c38321qM.A3V().get(id)) == null || !abstractCollection.isEmpty()) {
            return true;
        }
        if (!C18U.A06(C06090Tz.A05, this.A00, 36326597166446572L)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ Integer BEt() {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean Ejq() {
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final CharSequence Brc(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        InterfaceC38831rF interfaceC38831rF;
        C38321qM A0x;
        AbstractC37302Gc3.A1U(c38321qM, c75113Zb);
        if (c38321qM.A5M() && AbstractC37300Gc1.A0Y(c38321qM) != null) {
            List A0Y = AbstractC37300Gc1.A0Y(c38321qM);
            if (A0Y == null || (A0x = AbstractC25225BEi.A0x(A0Y, c75113Zb.A02)) == null) {
                return null;
            }
            interfaceC38831rF = A0x.A0C;
        } else {
            interfaceC38831rF = c38321qM.A0C;
        }
        List BNS = interfaceC38831rF.BNS();
        if (BNS == null) {
            return null;
        }
        return (String) AbstractC001800i.A0O(BNS, 0);
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ String BTZ(Context context, C38321qM c38321qM, C75113Zb c75113Zb) {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ List Bre(C38321qM c38321qM, C75113Zb c75113Zb) {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean EjP(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean EjQ(UserSession userSession, C38321qM c38321qM) {
        return false;
    }
}
