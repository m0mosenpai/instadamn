package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.Oua, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56059Oua implements InterfaceC12870lZ, InterfaceC13000lm {
    public AbstractC10360h2 A00;
    public InterfaceC53842dO A01;
    public WeakReference A02;
    public boolean A03;
    public final C006802i A04 = AbstractC43592JPx.A0N();
    public final UserSession A05;

    public C56059Oua(UserSession userSession) {
        this.A05 = userSession;
        C218914p.A05(this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(302526174);
        C23031Ai A00 = AbstractC23021Ah.A00(this.A05);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
        A0w.E7G("app_reset_background_time", currentTimeMillis);
        A0w.apply();
        C1IN.A00(C226218q.A01(AbstractC12960li.A00).A0D()).markerStart(25113516);
        this.A04.markerStart(728434865);
        this.A03 = true;
        C0f9.A0A(1761643274, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int i;
        C55080Oaa c55080Oaa;
        AbstractC10360h2 abstractC10360h2;
        WeakReference weakReference;
        InterfaceC53842dO interfaceC53842dO;
        int A03 = C0f9.A03(-26313019);
        if (!this.A03) {
            i = -509003003;
        } else {
            UserSession userSession = this.A05;
            String A0f = MSY.A0f(AbstractC23021Ah.A00(userSession), "app_entry_last_interacted_fragment", "");
            long A0L = AbstractC166987dD.A0L(System.currentTimeMillis() - AbstractC31175DnJ.A03(AbstractC166987dD.A0x(userSession), "app_reset_background_time"));
            C226418s A01 = C226218q.A01(AbstractC12960li.A00);
            A01.A0D().A01(25113516, "app_entry_last_interacted_surface", A0f);
            C1IN.A00(A01.A0D()).markerAnnotate(25113516, "app_entry_background_duration", A0L);
            C1IN.A00(A01.A0D()).markerEnd(25113516, (short) 2);
            C006802i c006802i = this.A04;
            c006802i.markerAnnotate(728434865, "AppEntryLastInteractedSurface", A0f);
            c006802i.markerEnd(728434865, (short) 2);
            try {
                c55080Oaa = C55080Oaa.A01;
                abstractC10360h2 = this.A00;
                weakReference = this.A02;
                interfaceC53842dO = this.A01;
            } catch (Exception e) {
                c006802i.markerAnnotate(728434865, "AppEntryOnException", e.toString());
                c006802i.markerAnnotate(728434865, "AppEntryLastInteractedFragmentOnException", A0f);
            }
            if (interfaceC53842dO == null) {
                C14360o3.A0F("appEntryUIInterface");
                throw C00O.createAndThrow();
            }
            c55080Oaa.A01(abstractC10360h2, userSession, interfaceC53842dO, A0f, weakReference, A0L);
            i = 1046601396;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
    }
}
