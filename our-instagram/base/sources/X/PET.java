package X;

import android.content.IntentFilter;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.rtc.analytics.RtcCallSurveyLogger;
import com.instagram.rtc.rsys.models.IgCallModel;

/* loaded from: classes9.dex */
public final class PET implements InterfaceC58155PqK {
    public final /* synthetic */ C56139Ovz A00;

    @Override // X.InterfaceC58155PqK
    public final void DDj(C51759Mti c51759Mti) {
    }

    public PET(C56139Ovz c56139Ovz) {
        this.A00 = c56139Ovz;
    }

    @Override // X.InterfaceC58155PqK
    public final void D1H(RtcCallKey rtcCallKey) {
        String str;
        String str2;
        C56139Ovz c56139Ovz = this.A00;
        OWf oWf = c56139Ovz.A06;
        OW9 ow9 = c56139Ovz.A09;
        IgCallModel A01 = ow9.A01();
        if (A01 != null) {
            str = A01.localCallId;
        } else {
            str = null;
        }
        String str3 = rtcCallKey.A00;
        C14360o3.A0B(str3, 1);
        C10850hu c10850hu = C0LK.A6b;
        if (str != null) {
            C0L6.A05(c10850hu, str);
        } else {
            C0L6.A05(c10850hu, str3);
        }
        C0AI.A00(oWf.A0I);
        C55213OeY c55213OeY = oWf.A03;
        if (c55213OeY != null) {
            RtcCallKey rtcCallKey2 = c55213OeY.A0K;
            if (rtcCallKey2 == null) {
                c55213OeY.A0K = rtcCallKey;
            } else if (!rtcCallKey2.equals(rtcCallKey)) {
                C0w9.A03("RtcWaterfallImpl", "Attempt to update waterfall with different key");
            }
        } else {
            C18950wb c18950wb = C18950wb.A01;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Waterfall is null in setup(");
            A1C.append(rtcCallKey);
            AbstractC166987dD.A1T(c18950wb, MSX.A0l(A1C, ')'), 245701013);
        }
        C55906Orv c55906Orv = oWf.A01;
        if (c55906Orv != null) {
            c55906Orv.A00 = rtcCallKey;
        } else {
            C18950wb c18950wb2 = C18950wb.A01;
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append("Avatar logger is null in setup(");
            A1C2.append(rtcCallKey);
            AbstractC166987dD.A1T(c18950wb2, MSX.A0l(A1C2, ')'), 245701013);
        }
        C54609OAk c54609OAk = oWf.A00;
        if (c54609OAk != null) {
            if (!c54609OAk.A02) {
                UserSession userSession = c54609OAk.A01;
                AnonymousClass229.A00(null, userSession, null, null, null, null);
                AnonymousClass229.A01(userSession).A17(C22P.A5Z, EnumC50631MWs.A0N, null, null, C56D.A00(c54609OAk.A00));
            }
        } else {
            C18950wb c18950wb3 = C18950wb.A01;
            StringBuilder A1C3 = AbstractC166987dD.A1C();
            A1C3.append("AR effect impression logger is null in setup(");
            A1C3.append(rtcCallKey);
            AbstractC166987dD.A1T(c18950wb3, MSX.A0l(A1C3, ')'), 245701013);
        }
        RtcCallSurveyLogger rtcCallSurveyLogger = oWf.A02;
        if (rtcCallSurveyLogger != null) {
            rtcCallSurveyLogger.A00 = rtcCallKey;
        } else {
            AbstractC166987dD.A1T(C18950wb.A01, AbstractC167017dG.A0n(rtcCallKey, "Survey logger is null in setup ", AbstractC166987dD.A1C()), 245701013);
        }
        C55133Obx c55133Obx = oWf.A0C;
        c55133Obx.A00 = rtcCallKey;
        String str4 = null;
        if (c55213OeY != null) {
            str2 = c55213OeY.A0Y.A05();
        } else {
            str2 = null;
        }
        c55133Obx.A01 = str2;
        if (!oWf.A04) {
            C18150uz.A0B.A03(oWf.A0A);
            oWf.A04 = true;
        }
        C218914p.A05(oWf.A0H);
        IgCallModel A012 = ow9.A01();
        if (A012 != null) {
            str4 = A012.localCallId;
        }
        C50737Mar c50737Mar = new C50737Mar(str4);
        ow9.A00 = c50737Mar;
        C0DJ.A00(c50737Mar, ow9.A01, new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
        c56139Ovz.A07.A00 = rtcCallKey;
    }

    @Override // X.InterfaceC58155PqK
    public final void D1I() {
        C56139Ovz c56139Ovz = this.A00;
        OW9 ow9 = c56139Ovz.A09;
        C55207OeK c55207OeK = ow9.A0Z;
        C57415PeD c57415PeD = C57415PeD.A00;
        C57416PeE c57416PeE = C57416PeE.A00;
        C57417PeF c57417PeF = C57417PeF.A00;
        C57418PeG c57418PeG = C57418PeG.A00;
        AbstractC25234BEr.A0k(4, c57415PeD, c57416PeE, c57417PeF, c57418PeG);
        C55207OeK.A02(c55207OeK, new C25079B8a(null, c55207OeK, null, null, c57415PeD, c57416PeE, c57417PeF, c57418PeG, false, false));
        C50737Mar c50737Mar = ow9.A00;
        if (c50737Mar != null) {
            try {
                ow9.A01.unregisterReceiver(c50737Mar);
            } finally {
                ow9.A00 = null;
            }
        }
        c56139Ovz.A03.removeKeepAliveCondition("RTC_CALL_CONDITION");
        OWf oWf = c56139Ovz.A06;
        C0L6.A04(C0LK.A6Y);
        C0L6.A04(C0LK.A6b);
        C0L6.A04(C0LK.A6Z);
        C0L6.A04(C0LK.A6a);
        if (oWf.A04) {
            C15670qN.A00(oWf.A0A);
            oWf.A04 = false;
        }
        C218914p.A06(oWf.A0H);
        C0AI.A01(oWf.A0I);
        C54678ODe c54678ODe = oWf.A0B;
        c54678ODe.A01 = AbstractC166987dD.A1I();
        c54678ODe.A00 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        if (r0 == false) goto L9;
     */
    @Override // X.InterfaceC58155PqK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1J(X.C19L r18) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PET.D1J(X.19L):void");
    }
}
