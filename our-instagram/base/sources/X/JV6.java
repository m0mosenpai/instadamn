package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.msys.reverb.ReverbMessage;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Deprecated;

/* loaded from: classes8.dex */
public final class JV6 {
    public final UserSession A00;
    public final JV0 A01;
    public final L9R A02;
    public final C4KT A03;
    public final C4KN A04;
    public final KWL A05;
    public final C4KV A06;

    public JV6(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A06 = (C4KV) userSession.A01(C4KV.class, MHJ.A00(userSession, 39));
        this.A04 = (C4KN) userSession.A01(C4KN.class, MHJ.A00(userSession, 37));
        this.A05 = (KWL) userSession.A01(KWL.class, MHJ.A00(userSession, 38));
        this.A03 = C4KS.A00(userSession);
        this.A01 = AbstractC44195Jfy.A00(userSession);
        this.A02 = (L9R) userSession.A01(L9R.class, MHS.A00(userSession, 14));
        C47880LDa.A00();
    }

    public static final int A00(String str) {
        Integer num;
        if (AbstractC001900j.A0a(str, "Failed to parse transport event", false)) {
            num = C05F.A06;
        } else if (AbstractC001900j.A0a(str, "Failed to parse transport payload", false)) {
            num = C05F.A07;
        } else if (AbstractC001900j.A0a(str, "Not a top level payload", false)) {
            num = C05F.A09;
        } else if (AbstractC001900j.A0a(str, "Failed to parse protobuf", false)) {
            num = C05F.A08;
        } else if (AbstractC001900j.A0a(str, "Not able to resolve senderIgid", false)) {
            num = C05F.A0A;
        } else if (AbstractC001900j.A0a(str, "Not able to resolve threadIgId", false)) {
            num = C05F.A0B;
        } else if (AbstractC001900j.A0a(str, "Not able to resolve message metadata", false)) {
            num = C05F.A0D;
        } else {
            num = C05F.A01;
        }
        switch (num.intValue()) {
            case 1:
                return 10001;
            case 2:
                return 10002;
            case 3:
                return 10010;
            case 4:
                return 10011;
            case 5:
                return 10012;
            case 6:
                return 10013;
            case 7:
                return 10014;
            case 8:
                return 10015;
            case 9:
                return 10016;
            case 10:
                return 10017;
            case 11:
                return 10018;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return 10019;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return 10020;
            case 14:
                return 10021;
            case Process.SIGTERM /* 15 */:
                return 10022;
            case 16:
                return 10023;
            case 17:
                return 10024;
            case 18:
                return 10025;
            case Process.SIGSTOP /* 19 */:
                return 10026;
            default:
                return 10027;
        }
    }

    public static final C83403nh A01(JV6 jv6, C83403nh c83403nh, DirectThreadKey directThreadKey) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC126255nM.A00(A0A, c83403nh);
            A0A.close();
            String obj = stringWriter.toString();
            C07880b8 c07880b8 = C07950bF.A04;
            UserSession userSession = jv6.A00;
            C14360o3.A0A(obj);
            C83403nh A00 = C83403nh.A00(c07880b8.A01(userSession, obj), directThreadKey, false);
            if (A00 != null) {
                return A00;
            }
            throw AbstractC166997dE.A0g();
        } catch (IOException unused) {
            C0K8.A0C("ArmadilloExpressEncryptedBackupReverbImpl", "cannot clone a direct message by serializing and deserializing to JSON");
            return c83403nh;
        }
    }

    public static final C09530e4 A03(JV6 jv6, MRE mre, C7OH c7oh, long j, boolean z) {
        C45120Jxp c45120Jxp;
        C09530e4 A03 = LJ5.A00.A03(jv6.A00, mre, c7oh, j);
        C83403nh c83403nh = (C83403nh) A03.A00;
        if (c83403nh != null) {
            C45120Jxp c45120Jxp2 = c83403nh.A0D;
            if (c45120Jxp2 != null) {
                c45120Jxp = new C45120Jxp((Boolean) c45120Jxp2.A03, (Boolean) c45120Jxp2.A02, !z, c45120Jxp2.A06, z);
            } else {
                c45120Jxp = null;
            }
            c83403nh.A0x(c45120Jxp);
            return AbstractC166987dD.A1L(c83403nh, null);
        }
        return A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.C11T.A08() != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C09530e4 A05(X.JV6 r10, X.AnonymousClass776 r11, java.lang.String r12, java.lang.String r13, java.util.List r14, java.util.List r15, long r16, boolean r18) {
        /*
            X.KWL r3 = r10.A05
            java.lang.String r0 = "reverb_mailbox_api_start"
            r3.A07(r11, r0)
            int r0 = com.facebook.msys.mci.Execution.getExecutionContext()
            boolean r0 = X.AbstractC167007dF.A1M(r0)
            r1 = 0
            if (r0 != 0) goto L19
            boolean r0 = X.C11T.A08()
            r2 = 1
            if (r0 == 0) goto L1a
        L19:
            r2 = 0
        L1a:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Synchronous call to load messages from Reverb must NOT be on Msys thread or UI thread."
            X.C18C.A0J(r2, r0, r1)
            com.instagram.common.session.UserSession r2 = r10.A00
            X.0lq r0 = r2.sessionState
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "user_session_state"
            r3.A09(r11, r0, r1)
            if (r13 != 0) goto L78
            if (r11 == 0) goto L76
            java.lang.String r13 = ""
        L34:
            int r1 = r11.A01
            int r0 = r11.A00
        L38:
            com.facebook.simplejni.NativeHolder r1 = com.instagram.msys.reverb.MCAReverbLoggingContextMCFBridgejniDispatcher.MCAReverbLoggingContextCreateWithQPLInstanceNative(r13, r1, r0)
            r0 = -1974637912(0xffffffff8a4d6aa8, float:-9.890451E-33)
            X.Kb1 r7 = new X.Kb1
            r7.<init>(r0, r1)
        L44:
            X.JVD r0 = X.AbstractC47170Kt5.A00
            r9 = 14
            X.JSi r4 = new X.JSi
            r8 = r12
            r6 = r14
            r5 = r15
            r10 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.google.common.util.concurrent.SettableFuture r1 = r0.A01(r2, r4)
            java.lang.String r0 = "Synchronous message fetch of Reverb loadMessagesByOTIDs"
            r4 = r16
            X.0e4 r0 = A06(r0, r1, r4)
            java.lang.Object r2 = r0.A00
            java.lang.Object r1 = r0.A01
            java.lang.Exception r1 = (java.lang.Exception) r1
            java.lang.String r0 = "reverb_mailbox_api_end"
            r3.A07(r11, r0)
            if (r1 == 0) goto L71
            if (r11 == 0) goto L71
            r0 = 0
            r3.A06(r11, r1, r0)
        L71:
            X.0e4 r0 = X.AbstractC166987dD.A1L(r2, r1)
            return r0
        L76:
            r7 = 0
            goto L44
        L78:
            r0 = -1
            if (r11 != 0) goto L34
            r1 = -1
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JV6.A05(X.JV6, X.776, java.lang.String, java.lang.String, java.util.List, java.util.List, long, boolean):X.0e4");
    }

    @Deprecated(message = "Use the futures and passing them downstream.")
    public static final C09530e4 A06(String str, Future future, long j) {
        Object obj;
        try {
            if (j > 0) {
                obj = future.get(j, TimeUnit.MILLISECONDS);
            } else {
                obj = future.get();
            }
            return AbstractC166987dD.A1L(obj, null);
        } catch (InterruptedException e) {
            C0K8.A0E("ArmadilloExpressEncryptedBackupReverbImpl", AnonymousClass001.A0R(str, " failed on InterruptedException"));
            return AbstractC166987dD.A1L(null, e);
        } catch (ExecutionException e2) {
            C0K8.A0E("ArmadilloExpressEncryptedBackupReverbImpl", AnonymousClass001.A0R(str, " failed on ExecutionException"));
            return AbstractC166987dD.A1L(null, e2);
        } catch (TimeoutException e3) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder A11 = AbstractC166997dE.A11(str);
            A11.append(" failed on timeout at ");
            A11.append(currentTimeMillis);
            C0K8.A0E("ArmadilloExpressEncryptedBackupReverbImpl", A11.toString());
            return AbstractC166987dD.A1L(null, e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x04e6, code lost:
    
        X.C14360o3.A0A(r4);
        r7.add(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.JV6 r33, X.C7OH r34, X.AnonymousClass776 r35, X.C43707JUs r36, java.util.List r37, java.util.List r38, java.util.Map r39, long r40) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JV6.A07(X.JV6, X.7OH, X.776, X.JUs, java.util.List, java.util.List, java.util.Map, long):void");
    }

    public static final void A08(C43707JUs c43707JUs, String str) {
        StringBuilder sb;
        String A0l;
        String A0E = AnonymousClass001.A0E(str, ' ', '.');
        List<C83403nh> list = c43707JUs.A06;
        C14360o3.A07(list);
        for (C83403nh c83403nh : list) {
            if (c83403nh.A10 == C2EY.A0n) {
                if (c83403nh.A0l() == null) {
                    sb = new StringBuilder();
                    A0l = "default error is";
                } else {
                    sb = new StringBuilder();
                    A0l = c83403nh.A0l();
                }
                sb.append(A0l);
                sb.append(A0E);
                c83403nh.A1G(sb.toString());
            }
        }
    }

    public final C09530e4 A09(C7OH c7oh, String str, String str2, List list, List list2, int i, long j, long j2) {
        Integer num;
        int i2;
        C2EY c2ey;
        int i3;
        String str3;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A03 = C4H6.A03(AbstractC166987dD.A1B(it));
            if (A03 != null) {
                A1E.add(A03);
            }
        }
        LinkedHashMap linkedHashMap = null;
        if (A1E.isEmpty()) {
            list.size();
        } else {
            KWL kwl = this.A05;
            UserSession userSession = this.A00;
            String valueOf = String.valueOf(j);
            String str4 = c7oh.A00.A01;
            AnonymousClass776 A01 = kwl.A01(userSession, Boolean.valueOf(AbstractC167007dF.A1P(i, 2)), Boolean.valueOf(AbstractC167007dF.A1P(i, 1)), null, 20128172, this.A03.A00(), AbstractC453326q.A02(userSession), false);
            C006802i c006802i = kwl.A00;
            int i4 = A01.A01;
            int i5 = A01.A00;
            MarkerEditor withMarker = c006802i.withMarker(i4, i5);
            withMarker.annotate("thread_jid", valueOf);
            withMarker.annotate("network_fetch_disabled", true);
            withMarker.annotate(DialogModule.KEY_MESSAGE, AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A1E, null));
            withMarker.annotate("message_count", A1E.size());
            withMarker.annotate("fetch_reason", str2);
            withMarker.annotate("reverb_include_deleted_messages", false);
            withMarker.annotate("reverb_include_replied_messages", false);
            withMarker.markerEditingCompleted();
            if (str4 != null) {
                c006802i.markerAnnotate(i4, i5, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str4);
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Object A0E = AbstractC06930Yk.A0E();
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            LinkedHashSet A0l = AbstractC31171DnF.A0l();
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36318861938793174L) && (list2 == null || list2.isEmpty())) {
                K3Q A00 = JVE.A00(userSession);
                int size = list.size();
                ArrayList A17 = AbstractC25225BEi.A17(size);
                for (int i6 = 0; i6 < size; i6++) {
                    A17.add(valueOf);
                }
                InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(A00, 2);
                MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
                AbstractC25231BEo.A1C(A0C, new LUR(2, A00, A17, A0D, A1E), A0D);
                C45322K3z c45322K3z = (C45322K3z) ((MailboxNullable) A0D.get()).value;
                if (c45322K3z != null) {
                    int A02 = AbstractC43592JPx.A02(c45322K3z);
                    for (int i7 = 0; i7 < A02; i7++) {
                        C09530e4 A032 = A03(this, new C48658Lfj(c45322K3z, i7), c7oh, j, false);
                        C83403nh c83403nh = (C83403nh) A032.A00;
                        if (c83403nh != null) {
                            A1E2.add(c83403nh);
                            String A0g = c83403nh.A0g();
                            if (A0g != null) {
                                A0l.add(A0g);
                            }
                        } else {
                            Object obj = A032.A01;
                            if (obj != null) {
                                Throwable th = (Throwable) obj;
                                if (th == null || (str3 = th.getMessage()) == null) {
                                    str3 = "unknown";
                                }
                                AbstractC37301Gc2.A1T(new C48658Lfj(c45322K3z, i7).BaC(), A1I, A00(str3));
                            }
                        }
                    }
                }
            } else {
                kwl.A07(A01, "reverb_intercept_start");
                C09530e4 A05 = A05(this, A01, valueOf, str, A1E, list2, j2, false);
                C47493KyM c47493KyM = (C47493KyM) A05.A00;
                Exception exc = (Exception) A05.A01;
                kwl.A07(A01, "reverb_intercept_end");
                if (exc != null) {
                    kwl.A06(A01, exc, null);
                }
                if (c47493KyM == null) {
                    A1E.size();
                    kwl.A0A(A01, "reverb_error", "queryMessageByOTIDS response is null");
                    if (exc instanceof TimeoutException) {
                        num = C05F.A0u;
                    } else if (exc instanceof ExecutionException) {
                        num = C05F.A15;
                    } else if (exc instanceof InterruptedException) {
                        num = C05F.A1F;
                    }
                    switch (num.intValue()) {
                        case 6:
                            i2 = 10013;
                            break;
                        case 7:
                            i2 = 10014;
                            break;
                        default:
                            i2 = 10015;
                            break;
                    }
                    Integer valueOf2 = Integer.valueOf(i2);
                    if (valueOf2 != null) {
                        linkedHashMap = AbstractC06930Yk.A07(AbstractC25230BEn.A1b("message_fetch_infra_exception_key", valueOf2));
                    }
                } else {
                    List list3 = c47493KyM.A00;
                    A0E = c47493KyM.A01;
                    C14360o3.A0C(A0E, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                    int size2 = list3.size();
                    A1I.putAll(A0E);
                    for (int i8 = 0; i8 < size2; i8++) {
                        Object obj2 = list3.get(i8);
                        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.msys.reverb.ReverbMessage");
                        ReverbMessage reverbMessage = (ReverbMessage) obj2;
                        C09530e4 A002 = this.A02.A00(c7oh, reverbMessage, j, false);
                        C83403nh c83403nh2 = (C83403nh) A002.A00;
                        String str5 = (String) A002.A01;
                        if (c83403nh2 != null) {
                            A1E2.add(c83403nh2);
                            String A0g2 = c83403nh2.A0g();
                            if (A0g2 != null) {
                                A0l.add(A0g2);
                            }
                        }
                        if (str5 != null) {
                            int A003 = A00(str5);
                            String messageId = reverbMessage.getMessageId();
                            C14360o3.A07(messageId);
                            AbstractC37301Gc2.A1T(messageId, A1I, A003);
                        }
                    }
                }
            }
            Iterator it2 = A1E.iterator();
            while (it2.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it2);
                if (!A0l.contains(A1B)) {
                    AbstractC37301Gc2.A1T(A1B, A1I, 10016);
                    C0f5 AEp = C18950wb.A01.AEp("Message point query fetch fails", 20123732);
                    AEp.ABW("fetchReason", str2);
                    AEp.ABV("threadId", j);
                    AEp.ABW("messageId", A1B);
                    Number A0W = AbstractC31171DnF.A0W(A1B, A1I);
                    if (A0W != null) {
                        i3 = A0W.intValue();
                    } else {
                        i3 = 10001;
                    }
                    AEp.ABU("error", i3);
                    AEp.report();
                }
            }
            if (A1E2.size() < A1E.size()) {
                kwl.A0A(A01, "reverb_error", AnonymousClass001.A0R("Few messages were not fetched, possible reasons are ", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A1I.entrySet(), null)));
            } else {
                kwl.A0C(A01);
            }
            if (!C18U.A06(c06090Tz, userSession, 2342161871149210290L)) {
                ArrayList A1E3 = AbstractC166987dD.A1E();
                Iterator it3 = A1E2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    AnonymousClass442 A0P = ((C83403nh) next).A0P();
                    if (A0P != null) {
                        c2ey = A0P.A0F;
                    } else {
                        c2ey = null;
                    }
                    if (c2ey == C2EY.A1O) {
                        A1E3.add(next);
                    }
                }
                Iterator it4 = A1E3.iterator();
                while (it4.hasNext()) {
                    AbstractC43592JPx.A0e(it4).A14(null);
                }
            }
            return AbstractC166987dD.A1L(A1E2, A0E);
        }
        return AbstractC166987dD.A1L(C16930sl.A00, linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0313, code lost:
    
        X.C14360o3.A0A(r12);
        r10.add(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0468 A[LOOP:9: B:183:0x0462->B:185:0x0468, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v6, types: [X.K3z, X.69s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(X.C7OH r42, X.AnonymousClass776 r43, X.C43707JUs r44, java.lang.String r45, java.lang.String r46, int r47, long r48, long r50, boolean r52) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JV6.A0B(X.7OH, X.776, X.JUs, java.lang.String, java.lang.String, int, long, long, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (X.C11T.A08() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A02(X.JV6 r4, java.lang.Long r5, int r6, long r7, boolean r9) {
        /*
            int r0 = com.facebook.msys.mci.Execution.getExecutionContext()
            boolean r0 = X.AbstractC167007dF.A1M(r0)
            r1 = 0
            if (r0 != 0) goto L12
            boolean r0 = X.C11T.A08()
            r2 = 1
            if (r0 == 0) goto L13
        L12:
            r2 = 0
        L13:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Synchronous call to load messages from Reverb must NOT be on Msys thread or UI thread."
            X.C18C.A0J(r2, r0, r1)
            X.JVD r1 = X.AbstractC47170Kt5.A00
            com.instagram.common.session.UserSession r0 = r4.A00
            X.MI2 r2 = new X.MI2
            r3 = r5
            r4 = r6
            r5 = r7
            r7 = r9
            r2.<init>(r3, r4, r5, r7)
            com.google.common.util.concurrent.SettableFuture r3 = r1.A01(r0, r2)
            r1 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r0 = "Synchronous data fetch of ReverbForThreadMessagesForReporting"
            X.0e4 r0 = A06(r0, r3, r1)
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JV6.A02(X.JV6, java.lang.Long, int, long, boolean):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (X.C11T.A08() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C09530e4 A04(X.JV6 r8, X.AnonymousClass776 r9, java.lang.Long r10, java.lang.String r11, java.lang.String r12, java.util.List r13, java.util.List r14, int r15, long r16) {
        /*
            int r0 = com.facebook.msys.mci.Execution.getExecutionContext()
            boolean r0 = X.AbstractC167007dF.A1M(r0)
            r1 = 0
            if (r0 != 0) goto L12
            boolean r0 = X.C11T.A08()
            r2 = 1
            if (r0 == 0) goto L13
        L12:
            r2 = 0
        L13:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Synchronous call to load messages from Reverb must NOT be on Msys thread or UI thread."
            X.C18C.A0J(r2, r0, r1)
            java.lang.String r6 = "SHH_"
            if (r13 == 0) goto L6e
            r0 = r6
        L1f:
            X.4KV r5 = r8.A06
            java.lang.String r7 = "load_message_list_api_call"
            java.lang.String r1 = "_start"
            java.lang.String r1 = X.AnonymousClass001.A0g(r0, r7, r1)
            r5.A07(r9, r1)
            java.lang.String r1 = "user_session_state"
            java.lang.String r3 = X.AnonymousClass001.A0R(r0, r1)
            com.instagram.common.session.UserSession r2 = r8.A00
            X.0lq r1 = r2.sessionState
            java.lang.String r1 = r1.name()
            r5.A09(r9, r3, r1)
            X.JVD r1 = X.AbstractC47170Kt5.A00
            X.JVB r8 = new X.JVB
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            com.google.common.util.concurrent.SettableFuture r2 = r1.A01(r2, r8)
            java.lang.String r1 = "Synchronous data fetch of Reverb loadMessageList"
            r3 = r16
            X.0e4 r2 = A06(r1, r2, r3)
            java.lang.String r1 = "_end"
            java.lang.String r1 = X.AnonymousClass001.A0g(r0, r7, r1)
            r5.A07(r9, r1)
            java.lang.Object r1 = r2.A01
            if (r1 == 0) goto L6a
            java.lang.Exception r1 = (java.lang.Exception) r1
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L6b
            java.lang.String r0 = "shh_message_fetch_failed"
        L67:
            r5.A06(r9, r1, r0)
        L6a:
            return r2
        L6b:
            java.lang.String r0 = "message_fetch_failed"
            goto L67
        L6e:
            java.lang.String r0 = ""
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JV6.A04(X.JV6, X.776, java.lang.Long, java.lang.String, java.lang.String, java.util.List, java.util.List, int, long):X.0e4");
    }

    public final void A0A(long j, long j2) {
        C50263MHs c50263MHs = new C50263MHs(j, j2, AbstractC43593JPy.A0w());
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36325892791875041L)) {
            c50263MHs.invoke(new MailboxFeature(JVC.A00.A00(userSession)));
        } else {
            JVD.A00(c50263MHs, userSession);
        }
    }
}
