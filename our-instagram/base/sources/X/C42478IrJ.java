package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IrJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42478IrJ implements InterfaceC76813cT {
    public final UserSession A00;

    public C42478IrJ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC76813cT
    public final String BTZ(Context context, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 1);
        JLT BZV = c38321qM.A0C.BZV();
        if (BZV != null) {
            return BZV.getCtaSubtitle();
        }
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final boolean EjR(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        if (!c38321qM.CdW() && c38321qM.A0C.BZV() != null) {
            String A0o = AbstractC25233BEq.A0o(c38321qM);
            UserSession userSession = this.A00;
            if (C14360o3.A0K(A0o, userSession.userId) || C18U.A06(C06090Tz.A05, userSession, 36319119628311494L)) {
                return true;
            }
            return false;
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
    public final CharSequence C5v(Context context, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        String ctaTitle;
        AbstractC167017dG.A1N(context, c38321qM);
        JLT BZV = c38321qM.A0C.BZV();
        if (BZV != null && (ctaTitle = BZV.getCtaTitle()) != null) {
            return ctaTitle;
        }
        return AbstractC166997dE.A0p(context, 2131959938);
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

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ CharSequence Brc(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        return null;
    }
}
