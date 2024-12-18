package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OTo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54980OTo {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public C54980OTo(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58307Psz interfaceC58307Psz) {
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        C57530Pg4 A00 = C57530Pg4.A00(abstractC59962oe, this, 2);
        InterfaceC09390do A01 = C57542PgG.A01(new C57542PgG(abstractC59962oe, 15), EnumC09460dv.A02, 16);
        this.A02 = AbstractC25225BEi.A0a(new C57542PgG(A01, 17), A00, C57530Pg4.A00(null, A01, 1), AbstractC25225BEi.A1D(C51027Mga.class));
        this.A00 = abstractC59962oe.requireContext();
        JQ0.A11(abstractC59962oe, new PZ3(interfaceC58307Psz, abstractC59962oe, this, null, 35), ((C51027Mga) this.A02.getValue()).A0F);
    }

    public static C51027Mga A00(Object obj) {
        return (C51027Mga) ((C54980OTo) obj).A02.getValue();
    }
}
