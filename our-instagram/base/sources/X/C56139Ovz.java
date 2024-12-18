package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Ovz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56139Ovz implements InterfaceC13000lm {
    public InterfaceC03960Jm A00;
    public final Context A01;
    public final UserSession A02;
    public final RealtimeClientManager A03;
    public final O4S A04;
    public final C56126Ovm A05;
    public final OWf A06;
    public final C55865OrF A07;
    public final PBM A08;
    public final OW9 A09;
    public final PBK A0A;
    public final PBL A0B;
    public final C55044OZq A0C;
    public final InterfaceC09390do A0D;
    public final DevXAgentApi A0E;
    public final C54446O4a A0F;

    public C56139Ovz(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        OWf oWf = new OWf(context, userSession, MSW.A1F(this, 35), MSW.A1F(this, 36));
        this.A06 = oWf;
        O4S o4s = new O4S(userSession);
        this.A04 = o4s;
        C54446O4a c54446O4a = new C54446O4a();
        this.A0F = c54446O4a;
        RealtimeClientManager realtimeClientManager = RealtimeClientManager.getInstance(userSession);
        this.A03 = realtimeClientManager;
        C3ER.A00();
        DevXAgentApi devXAgentApi = C2QN.A00;
        this.A0E = devXAgentApi;
        OW9 ow9 = new OW9(context, devXAgentApi, userSession, realtimeClientManager, oWf.A0G, o4s, c54446O4a, oWf, oWf, this);
        this.A09 = ow9;
        this.A07 = new C55865OrF(userSession);
        this.A0D = C57548PgM.A00(this, 32);
        C55044OZq c55044OZq = new C55044OZq(context, userSession, o4s, ow9);
        this.A0C = c55044OZq;
        this.A05 = (C56126Ovm) userSession.A01(C56126Ovm.class, C57419PeH.A00);
        this.A08 = new PBM(userSession, this, ow9, c55044OZq);
        this.A0A = new PBK(ow9);
        this.A0B = new PBL(this, ow9);
        c54446O4a.A00.add(new PET(this));
    }

    public final void A02(Activity activity, C7T3 c7t3) {
        C18950wb c18950wb;
        String str;
        C14360o3.A0B(c7t3, 1);
        C55135Oc3 c55135Oc3 = this.A09.A0K;
        C51678Ms9 c51678Ms9 = c55135Oc3.A03;
        if (c51678Ms9 == null) {
            c18950wb = C18950wb.A01;
            str = "Incoming params not present when accepting call";
        } else {
            RtcCallKey rtcCallKey = ((C51881MwP) c55135Oc3.A00.A00).A00;
            if (rtcCallKey == null) {
                c18950wb = C18950wb.A01;
                str = "Call key is not present when accepting the call";
            } else if (!rtcCallKey.equals(c51678Ms9.A03.A03)) {
                c18950wb = C18950wb.A01;
                str = "Call ID mismatch when accepting call";
            } else {
                if (!A09()) {
                    OWM owm = OWM.A03;
                    owm.A00(C05F.A01, !c51678Ms9.A09);
                    owm.A01("product_loading");
                }
                C29901DGp c29901DGp = new C29901DGp(22, rtcCallKey, c7t3, this, c51678Ms9);
                C63002SaQ c63002SaQ = new C63002SaQ(activity, (ViewGroup) AbstractC166987dD.A0c(AbstractC43592JPx.A08(activity), R.id.content), this.A02, new SM4(activity), new C56685PEd(c29901DGp));
                if (c51678Ms9.A09 && !AbstractC23451Ch.A08(c63002SaQ.A04.A01, (String[]) Arrays.copyOf(new String[]{"android.permission.RECORD_AUDIO"}, 1))) {
                    c63002SaQ.A01();
                    return;
                }
                SM4 sm4 = c63002SaQ.A04;
                String[] strArr = O0S.A00;
                C14360o3.A0B(strArr, 0);
                if (!AbstractC23451Ch.A08(sm4.A01, (String[]) Arrays.copyOf(strArr, 2))) {
                    c63002SaQ.A02(true);
                    return;
                } else {
                    c29901DGp.invoke();
                    return;
                }
            }
        }
        AbstractC166987dD.A1T(c18950wb, str, 245701013);
    }

    public final void A04(EnumC53137Neq enumC53137Neq, EnumC53138Ner enumC53138Ner, RtcCallFunnelSessionId rtcCallFunnelSessionId, RtcCallKey rtcCallKey, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2, boolean z3) {
        AbstractC25233BEq.A0x(0, str, enumC53137Neq, enumC53138Ner);
        AbstractC167007dF.A1J(str4, 7, rtcCallKey);
        C14360o3.A0B(str5, 11);
        C14360o3.A0B(list, 13);
        this.A03.addKeepAliveCondition("RTC_CALL_CONDITION");
        Integer A0Y = MSX.A0Y(z3 ? 1 : 0);
        OWf oWf = this.A06;
        Integer num = C05F.A01;
        EnumC53137Neq enumC53137Neq2 = EnumC53137Neq.A03;
        boolean A1a = AbstractC25229BEm.A1a(enumC53137Neq, enumC53137Neq2);
        String A0n = AbstractC166997dE.A0n();
        new String();
        String A01 = oWf.A01(null, rtcCallFunnelSessionId, rtcCallKey, null, num, A0Y, str5, A0n, str, str2, str3, null, A1a);
        OW9 ow9 = this.A09;
        C55135Oc3 c55135Oc3 = ow9.A0K;
        C51679MsA c51679MsA = new C51679MsA(enumC53137Neq, enumC53138Ner, rtcCallKey, num, str, str6, str5, A01, str4, list, z, z2, z3);
        c55135Oc3.A02 = null;
        c55135Oc3.A04 = null;
        boolean z4 = false;
        c55135Oc3.A06 = false;
        c55135Oc3.A04 = c51679MsA;
        if (c51679MsA.A00 != enumC53137Neq2) {
            z4 = true;
        }
        c55135Oc3.A06 = z4;
        if (!((C51881MwP) c55135Oc3.A00.A00).A00()) {
            RtcCallKey rtcCallKey2 = c51679MsA.A02;
            Integer num2 = C05F.A0C;
            C55135Oc3.A02(new C51759Mti(new C51881MwP(rtcCallKey2, num2, num), C05F.A00), c55135Oc3);
        }
        ow9.A0Q.A01.invoke();
    }

    public final void A05(RtcCallKey rtcCallKey, String str) {
        Object obj;
        CallApi callApi;
        C14360o3.A0B(rtcCallKey, 0);
        C55207OeK c55207OeK = this.A09.A0Z;
        OXE.A00.A00("RtcRsysInteractor", AbstractC167017dG.A0n(rtcCallKey, "declineIncomingCall callKey: ", AbstractC166987dD.A1C()));
        Iterator it = c55207OeK.A0P.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C52000Myq) obj).A01.A05, rtcCallKey)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C52000Myq c52000Myq = (C52000Myq) obj;
        if (c52000Myq != null && (callApi = c52000Myq.A01.A02) != null) {
            callApi.removeWhenEnded();
            callApi.end(0, str, true);
        }
    }

    public final boolean A0A(RtcCallKey rtcCallKey) {
        C14360o3.A0B(rtcCallKey, 0);
        C55207OeK c55207OeK = this.A09.A0Z;
        OXE.A00.A00("RtcRsysInteractor", AbstractC167017dG.A0n(rtcCallKey, "hasClient callKey: ", AbstractC166987dD.A1C()));
        java.util.Set set = c55207OeK.A0P;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C52000Myq) it.next()).A01.A05, rtcCallKey)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final AudioModule A00() {
        C55207OeK c55207OeK = this.A09.A0Z;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C55207OeK.A04(c55207OeK, new C57753Pjg(countDownLatch, 12), false, false);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            OXE.A00.A02("RtcRsysInteractor", "Exception while initiating RTC Call Manager", e);
        }
        return c55207OeK.A0F.A01;
    }

    public final void A01(int i, boolean z) {
        RtcCallKey rtcCallKey;
        C55207OeK c55207OeK = this.A09.A0Z;
        OXE oxe = OXE.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("leaveCall removeAfterLeave: ");
        A1C.append(z);
        A1C.append(" callKey: ");
        C52000Myq c52000Myq = c55207OeK.A02;
        if (c52000Myq != null) {
            rtcCallKey = c52000Myq.A01.A05;
        } else {
            rtcCallKey = null;
        }
        A1C.append(rtcCallKey);
        oxe.A00("RtcRsysInteractor", MSX.A0l(A1C, ' '));
        C55207OeK.A02(c55207OeK, new C57563Pgb(c55207OeK, i, z));
    }

    public final void A06(RtcCreateCallArgs rtcCreateCallArgs) {
        RtcCallSource rtcCallSource = rtcCreateCallArgs.A05;
        RtcThreadKey rtcThreadKey = rtcCallSource.A02;
        DirectThreadKey directThreadKey = rtcThreadKey.A00;
        String str = directThreadKey.A00;
        if (str == null) {
            str = "";
        }
        String str2 = directThreadKey.A01;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = rtcThreadKey.A04;
        String str4 = rtcThreadKey.A01;
        String str5 = rtcThreadKey.A03;
        RtcCallAudience rtcCallAudience = rtcCreateCallArgs.A03;
        EnumC46283KeF enumC46283KeF = rtcCreateCallArgs.A01;
        EnumC53137Neq enumC53137Neq = rtcCreateCallArgs.A02;
        List list = rtcCallAudience.A05;
        List list2 = rtcCallAudience.A04;
        String str6 = rtcCallAudience.A01;
        String A0w = AbstractC43592JPx.A0w(rtcCallAudience.A00);
        boolean z = rtcCreateCallArgs.A0B;
        boolean z2 = rtcCreateCallArgs.A0A;
        A03(enumC46283KeF, enumC53137Neq, rtcCreateCallArgs.A04, rtcCallSource, rtcCreateCallArgs.A07, str, str2, str3, str4, str5, str6, A0w, list, list2, z, z2);
    }

    public final void A07(String str) {
        C18950wb c18950wb;
        String str2;
        C55135Oc3 c55135Oc3 = this.A09.A0K;
        C51678Ms9 c51678Ms9 = c55135Oc3.A03;
        if (c51678Ms9 == null) {
            c18950wb = C18950wb.A01;
            str2 = "Incoming params not present when declining call";
        } else {
            RtcCallKey rtcCallKey = ((C51881MwP) c55135Oc3.A00.A00).A00;
            RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = c51678Ms9.A03;
            if (!C14360o3.A0K(rtcCallKey, rtcCallConnectionEntity.A03)) {
                c18950wb = C18950wb.A01;
                str2 = "Call ID mismatch when declining call";
            } else {
                new C23821Ep(this.A01).A00.cancel(c51678Ms9.A07, c51678Ms9.A00);
                RtcCallKey rtcCallKey2 = rtcCallConnectionEntity.A03;
                if (A0A(rtcCallKey2)) {
                    A05(rtcCallKey2, str);
                }
                ((C54819OKw) this.A0D.getValue()).A00(rtcCallConnectionEntity, AnonymousClass001.A0R("[CallManager]", str), C57699Pio.A00);
                if (((C51881MwP) c55135Oc3.A00.A00).A01 != C05F.A01) {
                    return;
                }
                c55135Oc3.A03();
                return;
            }
        }
        AbstractC166987dD.A1T(c18950wb, str2, 245701013);
    }

    public final void A08(String str) {
        if (str == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "Rtc message not present when declining live", 245701013);
        } else {
            ((C54819OKw) this.A0D.getValue()).A01(str, null, "[CallManager] decline_live", C57700Pip.A00);
        }
    }

    public final boolean A09() {
        return ((C51881MwP) this.A09.A0K.A00.A00).A00();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C55865OrF c55865OrF = this.A07;
        AbstractC75493aG.A00(c55865OrF.A01).A00(c55865OrF);
        c55865OrF.A00 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a9, code lost:
    
        if (r0.A02() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d2, code lost:
    
        if (r9 == 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d8, code lost:
    
        if (r8 != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.EnumC46283KeF r35, X.EnumC53137Neq r36, com.instagram.model.rtc.RtcCallFunnelSessionId r37, com.instagram.model.rtc.RtcCallSource r38, com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.util.List r47, java.util.List r48, boolean r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56139Ovz.A03(X.KeF, X.Neq, com.instagram.model.rtc.RtcCallFunnelSessionId, com.instagram.model.rtc.RtcCallSource, com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean):void");
    }
}
