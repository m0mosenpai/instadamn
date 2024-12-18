package X;

import android.content.Context;
import android.os.ParcelUuid;
import com.facebook.R;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString;
import com.instagram.rtc.rsys.models.IgCallModel;
import com.instagram.rtc.rsys.models.ParticipantModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* renamed from: X.OdJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55155OdJ {
    public static final RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId A00(Context context, UserSession userSession, C7T2 c7t2, C7T3 c7t3) {
        if (C18U.A06(AbstractC25225BEi.A0j(c7t2, 2), userSession, 36315868338065050L)) {
            C31227DoA A00 = AbstractC31273Dov.A00(context, userSession);
            if (A00.A0A(c7t2) && A00.A0B(c7t2)) {
                return null;
            }
            C3ER.A00();
            RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId rtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId = new RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId(new ParcelUuid(UUID.randomUUID()));
            OXJ A002 = AbstractC54148Nwk.A00(userSession);
            A002.A01 = AbstractC166987dD.A19(rtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId.A00);
            A002.A01(2);
            A002.A04(c7t3.A00);
            return rtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final void A01(Context context, EnumC46283KeF enumC46283KeF, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7T2 c7t2, RtcCallFunnelSessionId rtcCallFunnelSessionId, C7T3 c7t3, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, boolean z) {
        String C7I;
        String str;
        String C7I2;
        Integer num;
        C51881MwP c51881MwP;
        C193328hC A0I;
        String quantityString;
        String quantityString2;
        ?? r4;
        ArrayList arrayList;
        Object obj;
        User Ba5;
        User Ba52;
        Boolean AaW;
        Boolean AaV;
        String str2;
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(userSession, c7t2);
        C14360o3.A0B(c7t3, 5);
        LGX lgx = new LGX(userSession, context);
        if (lgx.A01()) {
            lgx.A00();
            return;
        }
        if (!c7t2.CLw()) {
            str2 = " startVideoCall with a null thread";
        } else {
            if (c7t2.CX1()) {
                C7I = c7t2.C7q();
            } else {
                C7I = c7t2.C7I();
            }
            if (C7I == null) {
                str2 = " startVideoCall with a null threadId";
            } else {
                AbstractC27671Vv A00 = C3ER.A00();
                User A0Y = AbstractC166997dE.A0Y(userSession);
                List Ab0 = c7t2.Ab0();
                boolean CVQ = c7t2.CVQ();
                String C7m = c7t2.C7m(context, userSession);
                if (c7t2.C7g() != 1013) {
                    if (MU6.A05(userSession, c7t2.Ba5(), c7t2.BJh(), c7t2.C7g(), c7t2.BSD().size()) && (((Ba5 = c7t2.Ba5()) != null && (AaV = Ba5.A03.AaV()) != null && AaV.booleanValue()) || ((Ba52 = c7t2.Ba5()) != null && (AaW = Ba52.A03.AaW()) != null && AaW.booleanValue()))) {
                        C7m = AbstractC31174DnI.A0t(context, context.getString(2131976747), C7m, 2131964621);
                    }
                }
                String username = A0Y.getUsername();
                String id = A0Y.getId();
                ImageUrl Bhu = A0Y.Bhu();
                List BSF = c7t2.BSF();
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj2 : BSF) {
                    AbstractC25228BEl.A1Q(obj2, A1E, C14360o3.A0K(obj2, AbstractC31180DnO.A0k(A0Y.BTC())) ? 1 : 0);
                }
                RtcCallAudience rtcCallAudience = new RtcCallAudience(Bhu, C7m, username, id, Ab0, A1E, CVQ);
                EnumC53137Neq B06 = c7t2.B06();
                EnumC53137Neq enumC53137Neq = EnumC53137Neq.A03;
                String str3 = null;
                if (!AbstractC25229BEm.A1a(B06, enumC53137Neq)) {
                    str = c7t2.C7I();
                    C7I2 = null;
                } else {
                    str = null;
                    C7I2 = c7t2.C7I();
                    str3 = c7t2.C7X();
                }
                RtcCallSource rtcCallSource = new RtcCallSource(enumC46283KeF, c7t3, new RtcThreadKey(C7I, c7t2.C7q(), str, C7I2, str3));
                C31227DoA A002 = AbstractC31273Dov.A00(context, userSession);
                Context applicationContext = context.getApplicationContext();
                if (A002.A0A(c7t2) && (A002.A0B(c7t2) || !A00.A02(context, userSession))) {
                    C55772hI.A00(userSession).A0C(interfaceC11380iw, "call_button", 0);
                    EnumC53137Neq B062 = c7t2.B06();
                    String CEy = c7t2.CEy();
                    if (CEy != null) {
                        A00.A00(context, userSession).A06(new RtcJoinCallArgs(B062, EnumC53138Ner.A03, rtcCallAudience, rtcCallFunnelSessionId, new RtcCallKey(CEy), rtcCallSource, null, null, null, -1, z), new C37054GUk(applicationContext, 26));
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                if (A00.A02(context, userSession)) {
                    List BSH = c7t2.BSH();
                    C27661Vu c27661Vu = (C27661Vu) A00;
                    C56139Ovz A01 = MWJ.A01(c27661Vu.A00(c27661Vu.A00, userSession).A06);
                    if (A01 != null) {
                        IgCallModel A012 = A01.A09.A01();
                        if (A012 != null && (arrayList = A012.participants) != null) {
                            LinkedHashSet A0l = AbstractC31171DnF.A0l();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ParticipantModel A0s = MSW.A0s(it);
                                C56126Ovm c56126Ovm = A01.A05;
                                String str4 = A0s.userId;
                                C14360o3.A07(str4);
                                C51731MtC c51731MtC = (C51731MtC) c56126Ovm.A00.get(str4);
                                if (c51731MtC != null && (obj = c51731MtC.A02) != null) {
                                    A0l.add(obj);
                                }
                            }
                            r4 = AbstractC166987dD.A1E();
                            for (Object obj3 : BSH) {
                                AbstractC25228BEl.A1Q(obj3, r4, AbstractC001800i.A0u(A0l, AbstractC54897OPs.A00((User) obj3).A02) ? 1 : 0);
                            }
                        } else {
                            r4 = BSH;
                        }
                        BSH = r4;
                    }
                    if (c7t2.B06() == enumC53137Neq && C18U.A06(C06090Tz.A05, userSession, 36316534057996780L) && AbstractC166987dD.A1b(BSH)) {
                        D91 d91 = new D91(context, userSession, c7t2, interfaceC11380iw, c7t3, rtcStartCoWatchPlaybackArguments, rtcCallFunnelSessionId, enumC46283KeF, 0, z);
                        if (C36711nU.A00 != null) {
                            ArrayList A0q = AbstractC167017dG.A0q(BSH);
                            Iterator it2 = BSH.iterator();
                            while (it2.hasNext()) {
                                A0q.add(AbstractC25226BEj.A15(it2).getUsername());
                            }
                            DialogInterfaceOnClickListenerC55291OgC dialogInterfaceOnClickListenerC55291OgC = new DialogInterfaceOnClickListenerC55291OgC(context, A00, userSession, c7t2, BSH, C7I, 0);
                            Og5 og5 = new Og5(0, context, d91, userSession, A00);
                            A0I = AbstractC31171DnF.A0I(context);
                            if (A0q.size() == 1) {
                                quantityString = AbstractC167007dF.A0f(context, A0q.get(0), 2131976746);
                            } else {
                                quantityString = context.getResources().getQuantityString(R.plurals.videocall_add_user_when_already_in_call_title_quantity, AbstractC31172DnG.A03(A0q, 1), AbstractC25228BEl.A1Z(A0q.get(0), AbstractC31172DnG.A03(A0q, 1)));
                            }
                            A0I.A05 = quantityString;
                            A0I.A09(2131976759);
                            if (A0q.size() == 1) {
                                quantityString2 = AbstractC167007dF.A0f(context, A0q.get(0), 2131976745);
                            } else {
                                quantityString2 = context.getResources().getQuantityString(R.plurals.videocall_add_user_to_call_quantity, AbstractC31172DnG.A03(A0q, 1), AbstractC25228BEl.A1Z(A0q.get(0), AbstractC31172DnG.A03(A0q, 1)));
                            }
                            C14360o3.A0A(quantityString2);
                            A0I.A0d(dialogInterfaceOnClickListenerC55291OgC, quantityString2);
                            A0I.A0P(og5, EnumC193348hE.A06, 2131976767);
                            A0I.A06();
                            AbstractC166987dD.A1W(A0I);
                            return;
                        }
                        C14360o3.A0F("instance");
                        throw C00O.createAndThrow();
                    }
                } else {
                    C56139Ovz A013 = MWJ.A01(A00.A00(context, userSession).A06);
                    if (A013 != null && (c51881MwP = (C51881MwP) A013.A09.A0K.A00.A00) != null) {
                        num = c51881MwP.A01;
                    } else {
                        num = null;
                    }
                    if (num != C05F.A01) {
                        C55772hI.A00(userSession).A0C(interfaceC11380iw, "call_button", 0);
                        A00.A01(context, userSession, new RtcCreateCallArgs(enumC46283KeF, c7t2.B06(), rtcCallAudience, rtcCallFunnelSessionId, rtcCallSource, null, rtcStartCoWatchPlaybackArguments, null, -1, z, c7t2.CWO(), false), new C37054GUk(applicationContext, 27));
                        return;
                    }
                }
                if (C36711nU.A00 != null) {
                    boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36316534058062317L);
                    DialogInterfaceOnClickListenerC28564Ciw dialogInterfaceOnClickListenerC28564Ciw = new DialogInterfaceOnClickListenerC28564Ciw(8, context, userSession, A00);
                    A0I = AbstractC31171DnF.A0I(context);
                    int i = 2131976760;
                    if (A06) {
                        i = 2131976761;
                    }
                    A0I.A0A(i);
                    A0I.A09(2131976759);
                    int i2 = 2131976785;
                    if (A06) {
                        i2 = 2131976767;
                    }
                    A0I.A0L(dialogInterfaceOnClickListenerC28564Ciw, i2);
                    A0I.A06();
                    AbstractC166987dD.A1W(A0I);
                    return;
                }
                C14360o3.A0F("instance");
                throw C00O.createAndThrow();
            }
        }
        C0w9.A03("DirectVideoCaller", str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r8 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Context r8, X.EnumC46283KeF r9, com.instagram.common.session.UserSession r10, X.C7T2 r11, X.C7T3 r12) {
        /*
            r0 = 2
            X.C14360o3.A0B(r11, r0)
            X.DoA r5 = X.AbstractC31273Dov.A00(r8, r10)
            boolean r0 = r5.A0A(r11)
            if (r0 == 0) goto L73
            java.lang.String r4 = r11.C7I()
            java.lang.String r6 = r11.CEx()
            java.util.List r2 = r11.Bl3()
            if (r2 == 0) goto L71
            X.1wf r1 = X.C41891wf.A01(r10)
            X.1wl r0 = X.C41951wl.A00(r10)
            java.util.List r0 = X.C41891wf.A03(r0, r2)
            boolean r0 = r1.A0D(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L30:
            boolean r0 = r5.A0B(r11)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = X.AbstractC53969Ntg.A00(r12)
            X.0kP r0 = new X.0kP
            r0.<init>(r10)
            r0.A01 = r1
            X.0wW r1 = r0.A00()
            java.lang.String r0 = "direct_join_video_call"
            X.0Ai r5 = X.AbstractC166987dD.A0f(r1, r0)
            if (r6 == 0) goto L58
            java.lang.Long r1 = X.AbstractC166997dE.A0j(r6)
            java.lang.String r0 = "target_id"
            r5.A9K(r0, r1)
        L58:
            if (r4 == 0) goto L5f
            java.lang.String r0 = "thread_id"
            r5.AAP(r0, r4)
        L5f:
            if (r3 == 0) goto L66
            java.lang.String r0 = "is_active"
            r5.A7v(r0, r3)
        L66:
            if (r2 == 0) goto L6d
            java.lang.String r0 = "is_video_call_ongoing"
            r5.A7v(r0, r2)
        L6d:
            r5.Cht()
            return
        L71:
            r3 = 0
            goto L30
        L73:
            X.Neq r1 = r11.B06()
            X.Neq r0 = X.EnumC53137Neq.A03
            boolean r8 = X.AbstractC25229BEm.A1a(r1, r0)
            java.lang.String r7 = r11.C7I()
            r4 = 0
            if (r8 != 0) goto L10c
            java.lang.String r6 = r11.C7I()
        L88:
            r0 = r4
            if (r8 == 0) goto L93
        L8b:
            java.lang.String r1 = r11.C7X()
            java.lang.Long r4 = X.AbstractC37302Gc3.A0V(r1)
        L93:
            java.util.List r3 = r11.Bl3()
            if (r3 == 0) goto L10a
            X.1wf r2 = X.C41891wf.A01(r10)
            X.1wl r1 = X.C41951wl.A00(r10)
            java.util.List r1 = X.C41891wf.A03(r1, r3)
            boolean r1 = r2.A0D(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
        Lad:
            java.lang.String r2 = X.AbstractC53969Ntg.A00(r12)
            X.0kP r1 = new X.0kP
            r1.<init>(r10)
            r1.A01 = r2
            X.0wW r2 = r1.A00()
            java.lang.String r1 = "direct_start_video_call"
            X.0Ai r5 = X.AbstractC166987dD.A0f(r2, r1)
            java.lang.String r2 = ""
            r1 = 904(0x388, float:1.267E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r1)
            r5.A9T(r1, r2)
            if (r7 == 0) goto Ld4
            java.lang.String r1 = "thread_id"
            r5.AAP(r1, r7)
        Ld4:
            if (r6 == 0) goto Ldb
            java.lang.String r1 = "open_thread_id"
            r5.AAP(r1, r6)
        Ldb:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            java.lang.String r1 = "e2ee_mandated"
            r5.A7v(r1, r2)
            if (r0 == 0) goto Lef
            r1 = 174(0xae, float:2.44E-43)
            java.lang.String r1 = X.AbstractC111324zv.A00(r1)
            r5.A9K(r1, r0)
        Lef:
            if (r4 == 0) goto Lfa
            r0 = 50
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r5.A9K(r0, r4)
        Lfa:
            if (r3 == 0) goto L101
            java.lang.String r0 = "is_active"
            r5.A7v(r0, r3)
        L101:
            if (r9 == 0) goto L6d
            java.lang.String r0 = "xma_type"
            r5.A8R(r9, r0)
            goto L6d
        L10a:
            r3 = 0
            goto Lad
        L10c:
            r6 = r4
            java.lang.String r0 = r11.C7I()
            if (r0 == 0) goto L88
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55155OdJ.A02(android.content.Context, X.KeF, com.instagram.common.session.UserSession, X.7T2, X.7T3):void");
    }

    public static final void A03(UserSession userSession, RtcCallFunnelSessionId rtcCallFunnelSessionId, Integer num) {
        String str;
        String A19;
        if (rtcCallFunnelSessionId != null && C18U.A06(C06090Tz.A05, userSession, 36315868338065050L)) {
            C3ER.A00();
            switch (num.intValue()) {
                case 0:
                    str = "no_network_connection_dialog_shown";
                    break;
                case 1:
                    str = "thread_is_null";
                    break;
                case 2:
                    str = "thread_missing_call_capability";
                    break;
                case 3:
                    str = "account_type_not_enabled_hpms_dialog_shown";
                    break;
                default:
                    str = "blocked_account_dialog_user_declined";
                    break;
            }
            AbstractC54148Nwk.A00(userSession);
            if (rtcCallFunnelSessionId instanceof RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString) {
                A19 = ((RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString) rtcCallFunnelSessionId).A00;
            } else {
                A19 = AbstractC166987dD.A19(((RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId) rtcCallFunnelSessionId).A00);
            }
            C14360o3.A0B(A19, 0);
            OXE.A00.A00("IGRTCProductFunnelLogger", AnonymousClass001.A0u("fail local call id ", A19, " due to reason ", str));
            ConnectFunnel.CProxy.fail(A19, str, null);
        }
    }

    public static final void A04(UserSession userSession, C7T3 c7t3, String str) {
        String A00 = AbstractC53969Ntg.A00(c7t3);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "direct_vc_icon_impression");
        if (str != null) {
            A0f.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        }
        A0f.Cht();
    }
}
