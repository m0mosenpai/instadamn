package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OU6 {
    public final Context A00;
    public final UserSession A01;
    public final C4hj A02;
    public final C33P A03;
    public final boolean A04;

    public static final void A00(C54641OBr c54641OBr, OU6 ou6, C38321qM c38321qM, C75113Zb c75113Zb) {
        Object obj;
        View view = c54641OBr.A02.A0F;
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof C3Y7) {
            ou6.A03.A09(c38321qM, (C3Y7) obj, c75113Zb, new C4QP(false, false, false, false), c75113Zb.A31);
        }
    }

    public OU6(Context context, UserSession userSession, C4hj c4hj, C33P c33p, boolean z) {
        AbstractC37302Gc3.A1U(c4hj, userSession);
        this.A00 = context;
        this.A02 = c4hj;
        this.A03 = c33p;
        this.A01 = userSession;
        this.A04 = z;
    }
}
