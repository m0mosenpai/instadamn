package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcEnterCallArgs;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;
import java.util.List;

/* loaded from: classes9.dex */
public final class P9X implements InterfaceC58177Pqh {
    public boolean A00;
    public final int A01;
    public final EnumC46283KeF A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final EnumC53137Neq A05;
    public final EnumC53138Ner A06;
    public final RtcCallAudience A07;
    public final RtcCallKey A08;
    public final C7T3 A09;
    public final RtcEnterCallArgs A0A;
    public final RtcIgNotification A0B;
    public final RtcStartCoWatchPlaybackArguments A0C;
    public final OKi A0D;
    public final RtcCallIntentHandlerActivity A0E;
    public final C54610OAl A0F;
    public final C56139Ovz A0G;
    public final Boolean A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final List A0Q;
    public final List A0R;
    public final C19L A0S;
    public final boolean A0T;
    public final boolean A0U;

    @Override // X.InterfaceC58177Pqh
    public final /* synthetic */ void AIk() {
        this.A00 = false;
        this.A0E.finish();
    }

    @Override // X.InterfaceC58177Pqh
    public final void start() {
        String str;
        C54610OAl c54610OAl;
        InterfaceC58274PsS EnV;
        this.A00 = true;
        if (!this.A0G.A09()) {
            boolean A1Z = AbstractC25229BEm.A1Z(this.A08);
            C7T3 c7t3 = this.A09;
            if ((c7t3 == C7T3.A0D || c7t3 == C7T3.A0F) && this.A0T) {
                if (!A1Z) {
                    c54610OAl = this.A0F;
                    EnV = c54610OAl.A01.EnV(null, this.A0U);
                    c54610OAl.A00 = EnV;
                }
                c54610OAl = this.A0F;
                boolean z = this.A0T;
                boolean z2 = this.A0U;
                String str2 = c7t3.A00;
                C14360o3.A0B(str2, 2);
                EnV = c54610OAl.A01.Enj(null, str2, z, z2);
                c54610OAl.A00 = EnV;
            } else {
                if (!A1Z) {
                    c54610OAl = this.A0F;
                    EnV = c54610OAl.A01.EnP(null, this.A0T, this.A0U);
                    c54610OAl.A00 = EnV;
                }
                c54610OAl = this.A0F;
                boolean z3 = this.A0T;
                boolean z22 = this.A0U;
                String str22 = c7t3.A00;
                C14360o3.A0B(str22, 2);
                EnV = c54610OAl.A01.Enj(null, str22, z3, z22);
                c54610OAl.A00 = EnV;
            }
        }
        String str3 = this.A0L;
        int i = this.A01;
        RtcIgNotification rtcIgNotification = this.A0B;
        RtcCallKey rtcCallKey = this.A08;
        String str4 = this.A0O;
        String str5 = this.A0N;
        String str6 = this.A0I;
        String str7 = this.A0M;
        if (str3 != null && str3.length() != 0) {
            new C23821Ep(this.A0E).A00.cancel(str3, i);
            if (rtcIgNotification != null) {
                C1W4 c1w4 = ((C27661Vu) C3ER.A00()).A01;
                UserSession userSession = this.A04;
                if (rtcCallKey != null) {
                    str = rtcCallKey.A00;
                } else {
                    str = null;
                }
                C19280xC A02 = C1W4.A02(rtcIgNotification, c1w4, C05F.A0N, str, str4, str5, str6, str7);
                if (A02 != null) {
                    A02.A0C("reason", "clicked");
                    AbstractC31173DnH.A1S(A02, userSession);
                }
            } else if (rtcCallKey != null) {
                C1W4 c1w42 = ((C27661Vu) C3ER.A00()).A01;
                C7T3 c7t32 = C7T3.A0M;
                String str8 = this.A04.userId;
                String str9 = rtcCallKey.A00;
                C14360o3.A0B(str8, 1);
                C19280xC A01 = C1W4.A01(c7t32, c1w42, C05F.A0N, str8, null, str9, str4, str5, str6, str7);
                A01.A0C(AbstractC43591JPw.A00(193), "mqtt");
                A01.A0C("reason", "clicked");
                C1W5.A00(A01, str8);
            }
        }
        RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity = this.A0E;
        boolean z4 = true;
        boolean z5 = !this.A0U;
        if (rtcCallKey == null) {
            z4 = false;
        }
        rtcCallIntentHandlerActivity.A02(z5, z4);
    }

    public static final boolean A00(P9X p9x) {
        if (p9x.A08 == null) {
            OWS ows = new OWS(new OLI(C18950wb.A01).A00, "Call Key cant be null for incoming calls", 659044095);
            boolean z = p9x.A0A instanceof RtcJoinCallArgs;
            ows.A01.ABX("isJoiningCall", z);
            ows.A03.put("isJoiningCall", String.valueOf(z));
            ows.A02(CacheBehaviorLogger.SOURCE, p9x.A09.A00);
            ows.A02("threadId", String.valueOf(p9x.A0O));
            ows.A02("target", p9x.A0J);
            ows.A02("call State", Nx9.A00(((C51881MwP) p9x.A0G.A09.A0K.A00.A00).A01));
            ows.A02("e2eeCallType", p9x.A05.toString());
            ows.A01();
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58177Pqh
    public final RtcCallIntentHandlerActivity Bpn() {
        return this.A0E;
    }

    @Override // X.InterfaceC58177Pqh
    public final UserSession CE4() {
        return this.A04;
    }

    @Override // X.InterfaceC58177Pqh
    public final void EoJ() {
        RtcCallIntentHandlerActivity Bpn = Bpn();
        Bpn.A02.postDelayed(new PRI(this, Bpn), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        OXE.A00.A00("RtcCallIntentHandlerActivity.EnterCallOperation", "Starting EnterCallOperation");
        PZC.A02(this, this.A0S, 0);
    }

    @Override // X.InterfaceC58177Pqh
    public final boolean isRunning() {
        return this.A00;
    }

    public /* synthetic */ P9X(InterfaceC11380iw interfaceC11380iw, UserSession userSession, RtcEnterCallArgs rtcEnterCallArgs, RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity) {
        Boolean bool;
        RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments;
        RtcCallKey rtcCallKey;
        String str;
        RtcCreateCallArgs rtcCreateCallArgs;
        int i;
        RtcCreateCallArgs rtcCreateCallArgs2;
        RtcIgNotification rtcIgNotification;
        RtcCreateCallArgs rtcCreateCallArgs3;
        RtcJoinCallArgs rtcJoinCallArgs;
        EnumC53138Ner enumC53138Ner;
        RtcJoinCallArgs rtcJoinCallArgs2;
        RtcJoinCallArgs rtcJoinCallArgs3;
        RtcJoinCallArgs rtcJoinCallArgs4;
        C56139Ovz A00 = MWJ.A00(AbstractC166987dD.A0O(rtcCallIntentHandlerActivity), userSession);
        OKi oKi = new OKi(rtcCallIntentHandlerActivity, interfaceC11380iw, userSession);
        C57312k6 A0a = AbstractC25229BEm.A0a(rtcCallIntentHandlerActivity);
        C54610OAl c54610OAl = A00.A06.A0G;
        C14360o3.A0B(c54610OAl, 9);
        this.A0E = rtcCallIntentHandlerActivity;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A0G = A00;
        this.A00 = false;
        this.A0D = oKi;
        this.A0S = A0a;
        this.A0F = c54610OAl;
        this.A0A = rtcEnterCallArgs;
        RtcCallAudience AdT = rtcEnterCallArgs.AdT();
        this.A07 = AdT;
        RtcCallSource Bye = rtcEnterCallArgs.Bye();
        this.A09 = Bye.A01;
        this.A0U = rtcEnterCallArgs.CHn();
        this.A05 = rtcEnterCallArgs.B06();
        this.A0R = AdT.A05;
        RtcThreadKey rtcThreadKey = Bye.A02;
        DirectThreadKey directThreadKey = rtcThreadKey.A00;
        this.A0O = directThreadKey.A00;
        this.A0P = directThreadKey.A01;
        this.A0N = rtcThreadKey.A04;
        this.A0I = rtcThreadKey.A01;
        this.A0M = rtcThreadKey.A03;
        this.A02 = Bye.A00;
        this.A0Q = AdT.A04;
        this.A0K = AbstractC43592JPx.A0w(AdT.A00);
        this.A0J = AdT.A01;
        this.A0T = AdT.A06;
        boolean z = rtcEnterCallArgs instanceof RtcCreateCallArgs;
        if (z) {
            bool = Boolean.valueOf(((RtcCreateCallArgs) rtcEnterCallArgs).A0A);
        } else {
            bool = null;
        }
        this.A0H = bool;
        if (z) {
            rtcStartCoWatchPlaybackArguments = ((RtcCreateCallArgs) rtcEnterCallArgs).A07;
        } else {
            rtcStartCoWatchPlaybackArguments = null;
        }
        this.A0C = rtcStartCoWatchPlaybackArguments;
        boolean z2 = rtcEnterCallArgs instanceof RtcJoinCallArgs;
        if (z2) {
            rtcCallKey = ((RtcJoinCallArgs) rtcEnterCallArgs).A02;
        } else {
            rtcCallKey = null;
        }
        this.A08 = rtcCallKey;
        if (!z2 || (rtcJoinCallArgs4 = (RtcJoinCallArgs) rtcEnterCallArgs) == null || (str = rtcJoinCallArgs4.A04) == null) {
            if (z && (rtcCreateCallArgs = (RtcCreateCallArgs) rtcEnterCallArgs) != null) {
                str = rtcCreateCallArgs.A08;
            } else {
                str = null;
            }
        }
        this.A0L = str;
        if (z2 && (rtcJoinCallArgs3 = (RtcJoinCallArgs) rtcEnterCallArgs) != null) {
            i = rtcJoinCallArgs3.A00;
        } else if (z && (rtcCreateCallArgs2 = (RtcCreateCallArgs) rtcEnterCallArgs) != null) {
            i = rtcCreateCallArgs2.A00;
        } else {
            i = -1;
        }
        this.A01 = i;
        if (!z2 || (rtcJoinCallArgs2 = (RtcJoinCallArgs) rtcEnterCallArgs) == null || (rtcIgNotification = rtcJoinCallArgs2.A03) == null) {
            if (z && (rtcCreateCallArgs3 = (RtcCreateCallArgs) rtcEnterCallArgs) != null) {
                rtcIgNotification = rtcCreateCallArgs3.A06;
            } else {
                rtcIgNotification = null;
            }
        }
        this.A0B = rtcIgNotification;
        this.A06 = (!z2 || (rtcJoinCallArgs = (RtcJoinCallArgs) rtcEnterCallArgs) == null || (enumC53138Ner = rtcJoinCallArgs.A01) == null) ? EnumC53138Ner.A03 : enumC53138Ner;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EnterCallOperation: callKey=");
        A1C.append(this.A08);
        A1C.append(", threadId=");
        A1C.append(this.A0O);
        A1C.append(", source=");
        return AbstractC166997dE.A0v(this.A09, A1C);
    }
}
