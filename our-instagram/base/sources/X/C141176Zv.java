package X;

import android.content.Context;
import com.instagram.api.schemas.CreateModeType;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Zv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141176Zv extends C6ZL {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C41181vS A02;
    public final C6eI A03;
    public final InterfaceC144596ff A04;

    public static final C88X A00(C141176Zv c141176Zv) {
        C120915dj c120915dj;
        C88Z A00;
        C38321qM c38321qM = c141176Zv.A02.A0b;
        c38321qM.getClass();
        InterfaceC120925dk AsX = c38321qM.A0C.AsX();
        if (AsX != null) {
            c120915dj = AsX.Esf(C1DS.A00(((C6ZL) c141176Zv).A01));
        } else {
            c120915dj = null;
        }
        C88X c88x = C88X.A0T;
        if (c120915dj == null) {
            return null;
        }
        CreateModeType createModeType = c120915dj.A00;
        if (createModeType == null) {
            A00 = C88Z.A0G;
        } else {
            A00 = AbstractC225759xu.A00(createModeType.toString());
        }
        C88X c88x2 = new C88X(new C189128Zd(null, null, A00, null, null, null, c120915dj.A05, c120915dj.A04));
        c88x2.A0C = c120915dj.A03;
        return c88x2;
    }

    public C141176Zv(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A00 = context;
        this.A03 = c6eI;
        this.A02 = c41181vS;
        this.A04 = interfaceC144596ff;
        this.A01 = ReelHeaderAttributionType.A0B;
    }
}
