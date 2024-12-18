package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.N9n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52224N9n extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C41181vS A04;
    public final /* synthetic */ InterfaceC146876jP A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C52224N9n(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, InterfaceC146876jP interfaceC146876jP, String str, int i, boolean z) {
        this.A02 = interfaceC11380iw;
        this.A06 = str;
        this.A03 = userSession;
        this.A04 = c41181vS;
        this.A05 = interfaceC146876jP;
        this.A00 = i;
        this.A01 = context;
        this.A07 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String A38;
        int i;
        int A03 = C0f9.A03(459447451);
        super.onFail(abstractC115105If);
        InterfaceC11380iw interfaceC11380iw = this.A02;
        String str = this.A06;
        UserSession userSession = this.A03;
        C41181vS c41181vS = this.A04;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM == null) {
            A38 = "";
        } else {
            A38 = c38321qM.A38();
        }
        if (c41181vS.A0C() == null) {
            i = -1;
        } else {
            i = c41181vS.A0C().A00;
        }
        C55185Odq.A01(interfaceC11380iw, userSession, str, A38, "one_tap_share", abstractC115105If.A01(), i);
        AbstractC54107Nw5.A00(userSession, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, "self_story", AbstractC166997dE.A0t(userSession), str, null);
        InterfaceC146876jP interfaceC146876jP = this.A05;
        Context context = this.A01;
        CallerContext callerContext = C55625OnA.A00;
        interfaceC146876jP.DFP(EnumC76753cN.A04, c41181vS);
        C9GR.A08(context, 2131973843, 0);
        C0f9.A0A(-559844972, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String A38;
        int i;
        int A03 = C0f9.A03(1433957780);
        int A032 = C0f9.A03(-121153653);
        super.onSuccess(obj);
        InterfaceC11380iw interfaceC11380iw = this.A02;
        String str = this.A06;
        UserSession userSession = this.A03;
        C41181vS c41181vS = this.A04;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM == null) {
            A38 = "";
        } else {
            A38 = c38321qM.A38();
        }
        if (c41181vS.A0C() == null) {
            i = -1;
        } else {
            i = c41181vS.A0C().A00;
        }
        C55185Odq.A03(userSession, interfaceC11380iw, str, A38, "one_tap_share", i);
        AbstractC54107Nw5.A00(userSession, "success", "self_story", AbstractC166997dE.A0t(userSession), str, null);
        InterfaceC146876jP interfaceC146876jP = this.A05;
        int i2 = this.A00;
        Context context = this.A01;
        boolean z = this.A07;
        CallerContext callerContext = C55625OnA.A00;
        interfaceC146876jP.DFP(EnumC76753cN.A06, c41181vS);
        if (z) {
            C9GR.A08(context, i2, 0);
        }
        C0f9.A0A(25250952, A032);
        C0f9.A0A(-321497427, A03);
    }
}
