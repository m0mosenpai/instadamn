package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28451Zg extends C0YY implements InterfaceC16620sF {
    public static final C28451Zg A00 = new C28451Zg();

    public C28451Zg() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.msys.mca.MailboxFeature, X.66g] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5yV, com.facebook.msys.mca.MailboxFeature] */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        final UserSession userSession = (UserSession) obj;
        Mailbox mailbox = (Mailbox) obj2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(mailbox, 1);
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        final ?? mailboxFeature2 = new MailboxFeature(new C137266Jf(mailbox));
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        final ?? mailboxFeature3 = new MailboxFeature(new C137266Jf(mailbox));
        return new InterfaceC41521w1(mailboxFeature2, mailboxFeature3, userSession) { // from class: X.5yW
            public final C132465yV A00;
            public final UserSession A01;
            public final C132485yX A02;

            @Override // X.InterfaceC41521w1
            public final void DpC(java.util.Set set) {
                List list;
                C14360o3.A0B(set, 0);
                if (set.contains("not_presented_client_notifications")) {
                    C132465yV c132465yV = this.A00;
                    UserSession userSession2 = this.A01;
                    String str = userSession2.userId;
                    C14360o3.A0B(str, 0);
                    Long A0k = AbstractC003100w.A0k(10, str);
                    List A0R = AbstractC001900j.A0R(C18U.A04(C06090Tz.A05, userSession2, 36882881330545110L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                    try {
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0R, 10));
                        Iterator it = A0R.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                        }
                        list = AbstractC06960Yn.A0S(arrayList.toArray(new Integer[0]));
                    } catch (NumberFormatException unused) {
                        list = C16930sl.A00;
                    }
                    C132485yX c132485yX = this.A02;
                    InterfaceExecutorC135866Co ASj = c132465yV.mMailboxApiHandleMetaProvider.ASj(0);
                    MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
                    mailboxFutureImpl.Ecq(c132485yX);
                    if (!ASj.ELJ(new YBN(c132465yV, mailboxFutureImpl, A0k, list))) {
                        mailboxFutureImpl.cancel(false);
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.5yX] */
            {
                ?? r0 = new MailboxCallback(mailboxFeature2, mailboxFeature3, userSession) { // from class: X.5yX
                    public final C132505yZ A00;
                    public final C132495yY A01;

                    @Override // com.facebook.msys.mca.MailboxCallback
                    public final /* bridge */ /* synthetic */ void onCompletion(Object obj3) {
                        String str;
                        long j;
                        String str2;
                        Long A002;
                        MailboxNullable mailboxNullable = (MailboxNullable) obj3;
                        C14360o3.A0B(mailboxNullable, 0);
                        AbstractC1351869s abstractC1351869s = (AbstractC1351869s) mailboxNullable.value;
                        if (abstractC1351869s != null) {
                            C51740MtP A003 = this.A01.A00();
                            abstractC1351869s.mResultSet.getCount();
                            C132505yZ c132505yZ = this.A00;
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            UserSession userSession2 = c132505yZ.A01;
                            boolean A02 = C50C.A02(userSession2.userId);
                            int count = abstractC1351869s.mResultSet.getCount();
                            for (int i = 0; i < count; i++) {
                                Long nullableLong = abstractC1351869s.mResultSet.getNullableLong(i, 9);
                                Long nullableLong2 = abstractC1351869s.mResultSet.getNullableLong(i, 36);
                                C54s c54s = new C54s(C913045j.A00);
                                c54s.A0G("is_vanish_mode", false);
                                int integer = abstractC1351869s.mResultSet.getInteger(i, 13);
                                C132515ya c132515ya = c132505yZ.A07;
                                String string = abstractC1351869s.mResultSet.getString(i, 18);
                                String string2 = abstractC1351869s.mResultSet.getString(i, 17);
                                String A022 = C60J.A02(false, false);
                                C132525yb c132525yb = c132515ya.A02;
                                if (c132525yb.A06 && string != null && c132525yb.A03) {
                                    UserFlowLogger userFlowLogger = c132525yb.A05;
                                    long j2 = c132525yb.A04;
                                    C9C9 c9c9 = C132525yb.A0M;
                                    userFlowLogger.flowMarkPoint(j2, c9c9.A01);
                                    userFlowLogger.flowAnnotateWithCrucialData(j2, "c", c9c9.A00);
                                }
                                C132545yd c132545yd = c132515ya.A01;
                                if (c132545yd.A01 && string2 != null && (A002 = C132545yd.A00(c132545yd, string2)) != null) {
                                    long longValue = A002.longValue();
                                    UserFlowLogger userFlowLogger2 = c132545yd.A00;
                                    C9C9 c9c92 = C132545yd.A07;
                                    userFlowLogger2.flowMarkPoint(longValue, c9c92.A01);
                                    if (A022 != null && A022.length() != 0) {
                                        userFlowLogger2.flowAnnotate(longValue, "feature_tags", A022);
                                    }
                                    userFlowLogger2.flowAnnotateWithCrucialData(longValue, "c", c9c92.A00);
                                }
                                C60H c60h = c132505yZ.A04;
                                if (nullableLong != null) {
                                    str = nullableLong.toString();
                                } else {
                                    str = null;
                                }
                                Integer valueOf = Integer.valueOf(integer);
                                String str3 = null;
                                c60h.A03(c54s, valueOf, "ARMADILLO_NOTIFICATIONS_PRESENT_CLIENT_NOTIFICATION_SYNCED", str, null, A02);
                                if (A003.A01) {
                                    String string3 = abstractC1351869s.mResultSet.getString(i, 18);
                                    String string4 = abstractC1351869s.mResultSet.getString(i, 17);
                                    String str4 = A003.A00;
                                    c132515ya.A06(string3, string4, str4, null, false, false);
                                    if (nullableLong != null) {
                                        str3 = nullableLong.toString();
                                    }
                                    c60h.A03(c54s, valueOf, "ARMADILLO_NOTIFICATIONS_SUPPRESSED", str3, str4, A02);
                                }
                                Long nullableLong3 = abstractC1351869s.mResultSet.getNullableLong(i, 8);
                                Long nullableLong4 = abstractC1351869s.mResultSet.getNullableLong(i, 20);
                                String string5 = abstractC1351869s.mResultSet.getString(i, 15);
                                int integer2 = abstractC1351869s.mResultSet.getInteger(i, 11);
                                if (nullableLong3 != null && (nullableLong != null || (integer2 == 18 && integer == 10))) {
                                    arrayList.add(nullableLong3);
                                    arrayList2.add(nullableLong);
                                    if (nullableLong4 != null) {
                                        j = nullableLong4.longValue();
                                    } else {
                                        j = -1;
                                    }
                                    arrayList3.add(Long.valueOf(j));
                                    arrayList4.add(string5);
                                    arrayList5.add(valueOf);
                                    c132505yZ.A06.A00(string5, String.valueOf(nullableLong), "secure_message", null, "synced notification in non engine path", 1);
                                    C132605yj c132605yj = c132505yZ.A05;
                                    String obj4 = nullableLong3.toString();
                                    String str5 = userSession2.userId;
                                    String obj5 = PushChannelType.A0B.toString();
                                    C14360o3.A0B(obj5, 5);
                                    C18920wW c18920wW = (C18920wW) c132605yj.A00;
                                    InterfaceC02590Ai A004 = c18920wW.A00(c18920wW.A00, "ig_push_notification_generated");
                                    if (A004.isSampled()) {
                                        if (C218914p.A08()) {
                                            str2 = AppStateModule.APP_STATE_BACKGROUND;
                                        } else {
                                            str2 = "foreground";
                                        }
                                        A004.AAP(AbstractC43591JPw.A00(295), str2);
                                        A004.AAP("app_startup_type", C1CC.A09.toString());
                                        A004.A7v("is_e2ee", true);
                                        A004.AAP(AbstractC43591JPw.A00(193), obj5);
                                        A004.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, obj4);
                                        A004.A7v(AbstractC43591JPw.A00(169), false);
                                        A004.AAP(AbstractC43591JPw.A00(1262), string5);
                                        A004.AAP("recipient_id", str5);
                                        A004.A7v("is_bg_account", Boolean.valueOf(A02));
                                        A004.A9K("occamadillo_thread_id", nullableLong2);
                                        A004.Cht();
                                    }
                                } else {
                                    C0w9.A04("notification_threadPk_null_or_messagePk_null", "Reding result from not_presented_client_notifications, get null threadPk or messagePk, no further action.", 1);
                                }
                            }
                            if ((!arrayList.isEmpty()) && !A003.A01) {
                                if (!arrayList2.isEmpty()) {
                                    boolean A06 = C18U.A06(C06090Tz.A05, userSession2, 36319729513668214L);
                                    C1345666g c1345666g = c132505yZ.A00;
                                    InterfaceExecutorC135866Co ASj = c1345666g.mMailboxApiHandleMetaProvider.ASj(0);
                                    MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
                                    int A005 = AbstractC1346866s.A00(mailboxFutureImpl);
                                    TraceInfo A01 = AbstractC1346866s.A01(mailboxFutureImpl, "MailboxInstagramSecureMessage", "loadInstagramSecureMessagesForNotifications");
                                    if (!ASj.ELJ(new YBR(c1345666g, mailboxFutureImpl, arrayList, arrayList2, arrayList4, arrayList5, arrayList3, A005, A06))) {
                                        mailboxFutureImpl.cancel(false);
                                        AbstractC1346866s.A02(A005);
                                        AbstractC1346866s.A03(A01, "MailboxInstagramSecureMessage", "loadInstagramSecureMessagesForNotifications");
                                    }
                                    PlatformLogger.platformEventLog(5);
                                    mailboxFutureImpl.addResultCallback(c132505yZ.A08, c132505yZ.A03);
                                }
                                C1345666g c1345666g2 = c132505yZ.A00;
                                InterfaceExecutorC135866Co ASj2 = c1345666g2.mMailboxApiHandleMetaProvider.ASj(0);
                                MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(ASj2);
                                int A006 = AbstractC1346866s.A00(mailboxFutureImpl2);
                                TraceInfo A012 = AbstractC1346866s.A01(mailboxFutureImpl2, "MailboxInstagramSecureMessage", "loadInstagramSecureMessagesForGroupInviteNotifications");
                                if (!ASj2.ELJ(new YBO(c1345666g2, mailboxFutureImpl2, arrayList, arrayList4, A006))) {
                                    mailboxFutureImpl2.cancel(false);
                                    AbstractC1346866s.A02(A006);
                                    AbstractC1346866s.A03(A012, "MailboxInstagramSecureMessage", "loadInstagramSecureMessagesForGroupInviteNotifications");
                                }
                                PlatformLogger.platformEventLog(5);
                                mailboxFutureImpl2.addResultCallback(c132505yZ.A08, c132505yZ.A02);
                            }
                        }
                    }

                    {
                        C132495yY c132495yY = new C132495yY(C13920nI.A00, AbstractC23021Ah.A00(userSession));
                        C132505yZ c132505yZ = new C132505yZ(mailboxFeature2, mailboxFeature3, userSession);
                        this.A01 = c132495yY;
                        this.A00 = c132505yZ;
                    }
                };
                this.A00 = mailboxFeature2;
                this.A01 = userSession;
                this.A02 = r0;
            }
        };
    }
}
