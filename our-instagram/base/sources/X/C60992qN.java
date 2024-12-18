package X;

import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* renamed from: X.2qN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60992qN implements InterfaceC12870lZ, InterfaceC13000lm {
    public static final C61002qO A02 = new Object();
    public WeakReference A00;
    public final UserSession A01;

    public C60992qN(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(-812823775, C0f9.A03(-1766441363));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        AbstractC59962oe abstractC59962oe;
        int A03 = C0f9.A03(-294530484);
        WeakReference weakReference = this.A00;
        if (weakReference != null && (abstractC59962oe = (AbstractC59962oe) weakReference.get()) != null) {
            UserSession userSession = this.A01;
            C54882fm c54882fm = new C54882fm(userSession.deviceSession.A06(), userSession);
            EnumSet of = EnumSet.of(Trigger.A0A);
            C14360o3.A07(of);
            C54892fn c54892fn = c54882fm.A03;
            if (!c54892fn.A00) {
                c54892fn.A01.markerStart(716775037, false);
                c54892fn.A00 = true;
            }
            C54882fm.A00(abstractC59962oe, c54882fm, of);
        }
        C0f9.A0A(93400448, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
    }
}
