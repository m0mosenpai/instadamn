package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.PlatformLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.LUl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48187LUl implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C48187LUl(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A06 = obj;
        this.A01 = obj4;
        this.A04 = obj2;
        this.A03 = obj5;
        this.A02 = obj6;
        this.A05 = obj3;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [X.K3z, X.69s] */
    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        String str;
        boolean z;
        C47977LIp c47977LIp;
        C2EC c2ec;
        int intValue;
        MsysError msysError;
        EnumC46247KdO enumC46247KdO;
        String str2;
        String str3;
        String str4;
        C114675Fx c114675Fx;
        String str5;
        String str6;
        String str7;
        int code;
        switch (this.A00) {
            case 0:
                AbstractC1351869s abstractC1351869s = (AbstractC1351869s) ((MailboxNullable) obj).value;
                if (abstractC1351869s != null) {
                    C47769L7q c47769L7q = (C47769L7q) this.A06;
                    C15100pQ c15100pQ = (C15100pQ) this.A01;
                    Map map = (Map) this.A04;
                    C15100pQ c15100pQ2 = (C15100pQ) this.A03;
                    C15100pQ c15100pQ3 = (C15100pQ) this.A02;
                    Map map2 = (Map) this.A05;
                    int i = 0;
                    AbstractC1351869s abstractC1351869s2 = new AbstractC1351869s(abstractC1351869s.mResultSet.getChildResultSet(0, 2));
                    L67 l67 = c47769L7q.A03;
                    C006802i c006802i = l67.A00;
                    c006802i.markerStart(20128504);
                    int A02 = AbstractC43592JPx.A02(abstractC1351869s2);
                    int i2 = 0;
                    while (i2 < A02) {
                        long A05 = AbstractC43592JPx.A05(AbstractC43592JPx.A0v(abstractC1351869s2, i2, i));
                        C2DS c2ds = c47769L7q.A04;
                        C81663kb B3V = c2ds.B3V(A05);
                        if (B3V == null) {
                            C28811aJ A00 = C28811aJ.A00(c47769L7q.A02);
                            List A13 = AbstractC43592JPx.A13(String.valueOf(A05), c47769L7q.A05);
                            ThreadFetchReason threadFetchReason = ThreadFetchReason.MISSING_DATA_IN_INBOX_SNAPSHOT_E2E;
                            C49275LqV c49275LqV = C49275LqV.A00;
                            Collections.sort(A13);
                            new C7J0(threadFetchReason, (InterfaceC2056798r) c49275LqV, A00, (Boolean) true, A13).A03();
                            c15100pQ.A00++;
                        } else {
                            boolean z2 = abstractC1351869s2.mResultSet.getBoolean(i2, 2);
                            ArrayList A1E = AbstractC166987dD.A1E();
                            List BTB = c2ds.BTB(LWK.A00, B3V.BKb(), null);
                            if (BTB == null) {
                                BTB = C16930sl.A00;
                            }
                            boolean CLS = B3V.CLS();
                            ?? abstractC1351869s3 = new AbstractC1351869s(abstractC1351869s2.mResultSet.getChildResultSet(i2, 4));
                            int A022 = AbstractC43592JPx.A02(abstractC1351869s3);
                            while (i < A022) {
                                Object obj2 = LJ5.A00.A03(c47769L7q.A02, new C48658Lfj(abstractC1351869s3, i), new C7OH(B3V), A05).A00;
                                if (obj2 != null) {
                                    A1E.add(obj2);
                                }
                                i++;
                            }
                            Comparator comparator = C93394Gs.A04;
                            C51u A002 = AbstractC46791Kmm.A00(comparator, AbstractC001800i.A0g(BTB, comparator), AbstractC001800i.A0g(A1E, comparator), CLS, false, z2, false);
                            List list = (List) A002.A00;
                            boolean A1a = AbstractC166987dD.A1a(A002.A01);
                            boolean A1a2 = AbstractC166987dD.A1a(A002.A02);
                            int size = BTB.size();
                            int size2 = list.size();
                            String valueOf = String.valueOf(A05);
                            map.put(valueOf, AbstractC167007dF.A0o(Integer.valueOf(size), size2));
                            c15100pQ2.A00 += size;
                            int i3 = 0;
                            for (int i4 = 0; i3 < size && i4 < size2; i4++) {
                                if (comparator.compare(BTB.get(i3), list.get(i4)) == 0) {
                                    i3++;
                                } else {
                                    c15100pQ3.A00++;
                                }
                            }
                            if (i3 < size) {
                                AbstractC37301Gc2.A1T(valueOf, map2, size - i3);
                            }
                            if (AbstractC166987dD.A1b(list)) {
                                K8O k8o = new K8O();
                                ArrayList A1E2 = AbstractC166987dD.A1E();
                                for (Object obj3 : list) {
                                    if (((C83403nh) obj3).A10 == C2EY.A0q) {
                                        A1E2.add(obj3);
                                    }
                                }
                                k8o.A04 = A1E2;
                                DirectThreadKey BKb = B3V.BKb();
                                String A0h = ((C83403nh) AbstractC001800i.A0K(list)).A0h();
                                String str8 = "";
                                if (A0h == null) {
                                    A0h = "";
                                }
                                String A0h2 = ((C83403nh) AbstractC001800i.A0I(list)).A0h();
                                if (A0h2 != null) {
                                    str8 = A0h2;
                                }
                                Object A0K = AbstractC001800i.A0K(list);
                                C16930sl c16930sl = C16930sl.A00;
                                C4GV A04 = ((C2DU) c2ds).A0F.A04(BKb);
                                if (A04 != null) {
                                    synchronized (A04) {
                                        ArrayList A1E3 = AbstractC166987dD.A1E();
                                        ArrayList A1E4 = AbstractC166987dD.A1E();
                                        ArrayList A1E5 = AbstractC166987dD.A1E();
                                        ArrayList A1E6 = AbstractC166987dD.A1E();
                                        ArrayList A1F = AbstractC166987dD.A1F(k8o.A04);
                                        Collections.sort(A1F, comparator);
                                        ArrayList A1F2 = AbstractC166987dD.A1F(list);
                                        Collections.sort(A1F2, comparator);
                                        ArrayList A1F3 = AbstractC166987dD.A1F(c16930sl);
                                        Collections.sort(A1F3, comparator);
                                        ArrayList A023 = AnonymousClass483.A02(comparator, A1F2, A1F3);
                                        ArrayList A024 = AnonymousClass483.A02(comparator, A1F, A023);
                                        if (A0K != null) {
                                            A024 = AnonymousClass483.A02(comparator, A024, Collections.singletonList(A0K));
                                        }
                                        C4H4 c4h4 = new C4H4(C93404Gt.A00, C93404Gt.A01(str8, A1a, true), C93404Gt.A00(A0h, A1a2));
                                        C4H4 A025 = C93394Gs.A02(k8o);
                                        C4GV.A0D(A04, A04.A0K, A024, A1E3, A1E4, A1E5);
                                        C81663kb c81663kb = A04.A0I;
                                        C4GV.A07(c4h4, (C83403nh) AnonymousClass483.A00(A04.A07, A1F3), c81663kb, A023);
                                        C4GV.A08(C4GV.A01(A025, c4h4), c81663kb, A024);
                                        C4GV.A0B(A04, A1E3, A1E6);
                                        A1E5.addAll(A1E6);
                                        C4GV.A0A(A04);
                                        A04.A0T();
                                        c81663kb.A07(0);
                                        Collections.unmodifiableList(A1E3);
                                        Collections.unmodifiableList(A1E4);
                                        Collections.unmodifiableList(A1E5);
                                        Collections.unmodifiableList(A1E6);
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2++;
                        i = 0;
                    }
                    c006802i.markerAnnotate(20128504, "count_of_restored_missing_messages", c15100pQ3.A00);
                    int i5 = c15100pQ2.A00;
                    if (i5 != 0) {
                        str = String.valueOf(c15100pQ3.A00 / i5);
                    } else {
                        str = "Error! Count of total messages in cache is 0!";
                    }
                    l67.A00("missing_messages_ratio", str);
                    c006802i.markerAnnotate(20128504, "count_of_missing_threads", c15100pQ.A00);
                    c006802i.markerAnnotate(20128504, "count_of_total_messages_in_cache", c15100pQ2.A00);
                    l67.A00("thread_size_before_and_after_merge", AbstractC001800i.A0P("; ", "", "", map.entrySet(), null));
                    l67.A00("threads_have_cache_messages_trimmed_after_merge", AbstractC001800i.A0P("; ", "", "", map2.entrySet(), null));
                    if (C0BQ.A00(c47769L7q.A02).CLL()) {
                        l67.A00("has_multiple_account_logged_in", "true");
                    }
                    c006802i.markerEnd(20128504, (short) 2);
                    return;
                }
                C0K8.A0C("ArmadilloExpressInboxSnapshotMissingThreadChecker", "inbox result set is null");
                return;
            case 1:
                C47489KyI c47489KyI = (C47489KyI) obj;
                z = false;
                C14360o3.A0B(c47489KyI, 0);
                c47977LIp = (C47977LIp) this.A06;
                c2ec = (C2EC) this.A01;
                intValue = c47489KyI.A01.intValue();
                msysError = c47489KyI.A00;
                break;
            default:
                C47490KyJ c47490KyJ = (C47490KyJ) obj;
                z = false;
                C14360o3.A0B(c47490KyJ, 0);
                c47977LIp = (C47977LIp) this.A06;
                c2ec = (C2EC) this.A01;
                intValue = c47490KyJ.A01.intValue();
                msysError = c47490KyJ.A00;
                break;
        }
        String str9 = (String) ((C15370ps) this.A04).A00;
        C1OW c1ow = (C1OW) this.A03;
        InterfaceC37261GbE interfaceC37261GbE = (InterfaceC37261GbE) this.A02;
        TransportPayload transportPayload = (TransportPayload) this.A05;
        c47977LIp.A03.A03(null, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, str9);
        PlatformLogger.platformEventStructuredLoggerInsertMsysApiCallBackStart(c1ow.A05);
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue == 3) {
                    if (msysError != null && (code = msysError.getCode()) == 1 && c2ec.CZe()) {
                        UserSession userSession = c47977LIp.A00;
                        if (c2ec.CWj(userSession)) {
                            long j = c1ow.A00;
                            C06090Tz c06090Tz = C06090Tz.A05;
                            if (j < C18U.A01(c06090Tz, userSession, 36609223194384243L) && C18U.A06(c06090Tz, userSession, 36327748217617239L)) {
                                c114675Fx = new C114675Fx(null, EnumC46247KdO.A06, String.valueOf(code), null, "ae", null, AbstractC166997dE.A0y("Retriable error: ", msysError), null, AbstractC166987dD.A1I(), true, z, z, z, z, true);
                            }
                        }
                    }
                    enumC46247KdO = EnumC46247KdO.A06;
                    if (msysError == null || (str2 = Integer.valueOf(msysError.getCode()).toString()) == null) {
                        str2 = "0";
                    }
                    if (msysError == null || (str7 = msysError.getMessage()) == null) {
                        str7 = "unknown error";
                    }
                    str4 = AnonymousClass001.A0R("Permanent error: ", str7);
                    str3 = "ae";
                } else {
                    return;
                }
            } else {
                EnumC46247KdO enumC46247KdO2 = EnumC46247KdO.A06;
                if (msysError == null || (str5 = Integer.valueOf(msysError.getCode()).toString()) == null) {
                    str5 = "0";
                }
                if (msysError == null || (str6 = msysError.getMessage()) == null) {
                    str6 = "unknown error";
                }
                c114675Fx = new C114675Fx(enumC46247KdO2, str5, "ae", AnonymousClass001.A0R("Retriable error: ", str6), true, true);
            }
            c47977LIp.A02.A01(transportPayload, interfaceC37261GbE, c114675Fx, c1ow.A05);
        }
        enumC46247KdO = EnumC46247KdO.A06;
        if (msysError == null || (str2 = Integer.valueOf(msysError.getCode()).toString()) == null) {
            str2 = "0";
        }
        str3 = "ae";
        str4 = "Unknown error during MEM send";
        c114675Fx = new C114675Fx(enumC46247KdO, str2, str3, str4, z, z);
        c47977LIp.A02.A01(transportPayload, interfaceC37261GbE, c114675Fx, c1ow.A05);
    }
}
