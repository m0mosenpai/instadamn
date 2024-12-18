package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.FrS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35790FrS implements CallerContextable {
    public static C35790FrS A04 = null;
    public static final String __redex_internal_original_name = "AutoCrosspostingNuxHelper";
    public InterfaceC41501vz A00;
    public boolean A01;
    public final UserSession A02;
    public final C82L A03;

    public final synchronized void A01() {
        InterfaceC41501vz interfaceC41501vz = this.A00;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(this.A02).A02(interfaceC41501vz, C121295eS.class);
        }
    }

    public static final boolean A00(Context context, C35790FrS c35790FrS, EnumC33445EqI enumC33445EqI) {
        if (!AbstractC49092Nc.A00(c35790FrS.A02).A00(CallerContext.A00(C35790FrS.class), AbstractC111324zv.A00(2485)) && enumC33445EqI != EnumC33445EqI.A04) {
            return false;
        }
        c35790FrS.A01 = false;
        c35790FrS.A03.A03(context, new C36711GGg(c35790FrS));
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.82I, X.0Zx] */
    public C35790FrS(UserSession userSession) {
        this.A02 = userSession;
        C82G c82g = C82G.A0L;
        C82H c82h = C82H.A0o;
        ?? c0Zx = new C0Zx();
        Boolean A0b = AbstractC166997dE.A0b();
        c0Zx.A0A(A0b);
        c0Zx.A09(A0b);
        this.A03 = new C82L(c82g, c82h, c0Zx, userSession, false);
    }
}
