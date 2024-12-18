package com.instagram.direct.realtime.armadilloexpress.plugins.adapter;

import X.AbstractC109484wa;
import X.AbstractC111324zv;
import X.AbstractC120975dp;
import X.AbstractC1345065z;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25228BEl;
import X.AbstractC25233BEq;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.AbstractC37591ow;
import X.AbstractC37601ox;
import X.AbstractC43592JPx;
import X.AbstractC43593JPy;
import X.AbstractC46894Kob;
import X.AbstractC46903Kok;
import X.AbstractC47885LDf;
import X.AbstractC60877RXa;
import X.AbstractC94034Kn;
import X.AbstractRunnableC14200nk;
import X.AnonymousClass001;
import X.C06090Tz;
import X.C09530e4;
import X.C0K8;
import X.C120005by;
import X.C125815mW;
import X.C14120nc;
import X.C14360o3;
import X.C18U;
import X.C1OW;
import X.C1YP;
import X.C2059699y;
import X.C26141Ov;
import X.C37581ov;
import X.C44106JeV;
import X.C46328Key;
import X.C46905Kom;
import X.C47303KvE;
import X.C47618L1d;
import X.C47883LDd;
import X.C48502Lct;
import X.C4A7;
import X.C50222MGd;
import X.C99V;
import X.C9ZN;
import X.EnumC46309Kef;
import X.EnumC46311Keh;
import X.InterfaceC135846Cm;
import X.InterfaceC14020nS;
import X.JVC;
import X.KLX;
import X.KLY;
import X.KOE;
import X.KOF;
import X.L4J;
import X.LFR;
import X.LJ5;
import X.LJg;
import X.LVF;
import X.RYn;
import android.database.Cursor;
import android.os.CancellationSignal;
import com.facebook.mcrypto.mem.EnvelopeProperties;
import com.facebook.mcrypto.mem.OutgoingMessage;
import com.facebook.mcrypto.mem.PlaintextApplicationPayload;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase;
import com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;
import com.instagram.direct.securityalert.data.SecurityAlertRepository$handleParticipantDeviceChange$2;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes8.dex */
public final class InstagramAdapterPluginPremailbox extends Premailbox {
    public static final C46905Kom Companion = new Object();
    public static final String TAG = "InstagramAdapterPluginPremailbox";
    public final C48502Lct outgoingMessageCache;
    public final UserSession userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAdapterPluginPremailbox(UserSession userSession) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
        this.userSession = userSession;
        this.outgoingMessageCache = (C48502Lct) userSession.A01(C48502Lct.class, C50222MGd.A00);
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_CheckMessageExists(long j, String str) {
        return false;
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public void ArmadilloExpressMCPPluginAndroidAdapter_ExecuteTask(String str) {
        InterfaceC14020nS A00;
        AbstractRunnableC14200nk kly;
        C14360o3.A0B(str, 0);
        C47883LDd c47883LDd = C47883LDd.A00;
        UserSession userSession = this.userSession;
        synchronized (c47883LDd) {
            C14360o3.A0B(userSession, 0);
            if (str.equals("ephemeral_expiration")) {
                A00 = C14120nc.A00();
                kly = new KLX(userSession);
            } else if (str.equals("ephemeral_deletion")) {
                A00 = C14120nc.A00();
                kly = new KLY(userSession);
            }
            A00.ATO(kly);
        }
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public Long ArmadilloExpressMCPPluginAndroidAdapter_HandleCreateAppDataThreadIDForPersistenceStore(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        return LJg.A00(bArr);
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleInsertPlaceholder(long j, int i, int i2, int i3, long j2, long j3, String str, int i4, long j4) {
        C14360o3.A0B(str, 6);
        AbstractC46903Kok.A00(this.userSession, str, i, i2, i3, i4, j4, j, j2, j3);
        return true;
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public OutgoingMessage ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageCreateRetryMessageBinaryContent(long j, int i, String str) {
        C09530e4 A1L;
        C09530e4 A1L2;
        byte[] bArr;
        C09530e4 A1L3;
        byte[] blob;
        Integer A0p;
        Integer A0p2;
        String str2 = null;
        byte[] bArr2 = null;
        String str3 = null;
        C14360o3.A0B(str, 2);
        UserSession userSession = this.userSession;
        C14360o3.A0B(userSession, 0);
        C14360o3.A07(C120005by.A00(userSession));
        String traceIdForAliasId = TraceLogger.getTraceIdForAliasId(13, str);
        if (traceIdForAliasId != null || (traceIdForAliasId = TraceLogger.getTraceIdForAliasId(15, str)) != null) {
            C120005by.A03(traceIdForAliasId, null, 0, 1262, 0);
        }
        ArmadilloExpressEncryptedBackupDatabase armadilloExpressEncryptedBackupDatabase = C99V.A00(userSession).A01.A02;
        C2059699y c2059699y = (C2059699y) armadilloExpressEncryptedBackupDatabase.A02();
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM messages_table WHERE offline_threading_id == ? ORDER BY item_id DESC LIMIT 1", 1);
        A00.ADp(1, str);
        C1YP c1yp = c2059699y.A00;
        c1yp.assertNotSuspendingTransaction();
        C9ZN c9zn = null;
        Integer num = null;
        Cursor query = c1yp.query(A00, (CancellationSignal) null);
        try {
            int A01 = AbstractC37601ox.A01(query, "thread_jid");
            int A012 = AbstractC37601ox.A01(query, "sender_jid");
            int A013 = AbstractC37601ox.A01(query, "item_id");
            int A014 = AbstractC37601ox.A01(query, "payload");
            int A015 = AbstractC37601ox.A01(query, "payload_blob");
            int A016 = AbstractC37601ox.A01(query, "hidden");
            int A017 = AbstractC37601ox.A01(query, "shh");
            int A018 = AbstractC37601ox.A01(query, "offline_threading_id");
            int A019 = AbstractC37601ox.A01(query, "message_expiration_ts_sec");
            int A0110 = AbstractC37601ox.A01(query, "hidden_ts_sec");
            int A0111 = AbstractC37601ox.A01(query, "message_deletion_ts_sec");
            if (query.moveToFirst()) {
                long j2 = query.getLong(A01);
                long j3 = query.getLong(A012);
                String string = query.getString(A013);
                String string2 = query.getString(A014);
                if (query.isNull(A015)) {
                    blob = null;
                } else {
                    blob = query.getBlob(A015);
                }
                boolean A1M = AbstractC167007dF.A1M(query.getInt(A016));
                int i2 = query.getInt(A017);
                String string3 = query.getString(A018);
                if (query.isNull(A019)) {
                    A0p = null;
                } else {
                    A0p = AbstractC43593JPy.A0p(query, A019);
                }
                if (query.isNull(A0110)) {
                    A0p2 = null;
                } else {
                    A0p2 = AbstractC43593JPy.A0p(query, A0110);
                }
                if (!query.isNull(A0111)) {
                    num = AbstractC43593JPy.A0p(query, A0111);
                }
                c9zn = new C9ZN(A0p, A0p2, num, string, string2, string3, blob, i2, j2, j3, A1M);
            }
            if (c9zn == null) {
                A1L = new C09530e4(null, null);
            } else {
                String str4 = c9zn.A06;
                byte[] bArr3 = c9zn.A0A;
                if (bArr3 != null) {
                    A1L = AbstractC166987dD.A1L(str4, new C47303KvE(bArr3));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            Object obj = A1L.A00;
            C47303KvE c47303KvE = (C47303KvE) A1L.A01;
            if (obj != null && c47303KvE != null) {
                try {
                    TransportPayload A002 = LJ5.A00(c47303KvE.A00);
                    C14360o3.A0B(A002, 1);
                    if (A002.transportPayloadCase_ == 1 && (A002.A0L().bitField0_ & 2) != 0) {
                        bArr = A002.A0H();
                    } else {
                        return null;
                    }
                } catch (C46328Key e) {
                    C0K8.A0F("ArmadilloExpressOutgoingMessageStatusPublisher", "Failed to retry message from Reverb", e);
                    return null;
                }
            } else {
                KOF kof = (KOF) armadilloExpressEncryptedBackupDatabase.A01();
                C37581ov A003 = AbstractC37591ow.A00("SELECT * FROM message_updates_table WHERE offline_threading_id == ? ORDER BY item_id DESC LIMIT 1", 1);
                A003.ADp(1, str);
                C1YP c1yp2 = kof.A00;
                c1yp2.assertNotSuspendingTransaction();
                boolean z = false;
                Cursor query2 = c1yp2.query(A003, (CancellationSignal) null);
                try {
                    int A0112 = AbstractC37601ox.A01(query2, "thread_jid");
                    int A0113 = AbstractC37601ox.A01(query2, "sender_jid");
                    int A0114 = AbstractC37601ox.A01(query2, "item_id");
                    int A0115 = AbstractC37601ox.A01(query2, "target_item_id");
                    int A0116 = AbstractC37601ox.A01(query2, "payload");
                    int A0117 = AbstractC37601ox.A01(query2, "payload_blob");
                    int A0118 = AbstractC37601ox.A01(query2, "offline_threading_id");
                    int A0119 = AbstractC37601ox.A01(query2, "hidden_ts_sec");
                    if (query2.moveToFirst()) {
                        query2.getLong(A0112);
                        query2.getLong(A0113);
                        String string4 = query2.getString(A0114);
                        String string5 = query2.getString(A0115);
                        String string6 = query2.getString(A0116);
                        if (!query2.isNull(A0117)) {
                            bArr2 = query2.getBlob(A0117);
                        }
                        String string7 = query2.getString(A0118);
                        if (!query2.isNull(A0119)) {
                            query2.getInt(A0119);
                        }
                        z = true;
                        AbstractC25233BEq.A0x(3, string4, string5, string6);
                        C14360o3.A0B(string7, 7);
                        str2 = string4;
                    }
                    if (!z) {
                        A1L2 = new C09530e4(null, null);
                    } else if (bArr2 != null) {
                        A1L2 = AbstractC166987dD.A1L(str2, new C47303KvE(bArr2));
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                    C47303KvE c47303KvE2 = (C47303KvE) A1L2.A01;
                    if (c47303KvE2 == null) {
                        KOE koe = (KOE) armadilloExpressEncryptedBackupDatabase.A00();
                        C37581ov A004 = AbstractC37591ow.A00("SELECT * FROM message_deletes_table WHERE offline_threading_id == ? ORDER BY item_id DESC LIMIT 1", 1);
                        A004.ADp(1, str);
                        C1YP c1yp3 = koe.A00;
                        c1yp3.assertNotSuspendingTransaction();
                        boolean z2 = false;
                        byte[] bArr4 = null;
                        Cursor query3 = c1yp3.query(A004, (CancellationSignal) null);
                        try {
                            int A0120 = AbstractC37601ox.A01(query3, "thread_jid");
                            int A0121 = AbstractC37601ox.A01(query3, "sender_jid");
                            int A0122 = AbstractC37601ox.A01(query3, "item_id");
                            int A0123 = AbstractC37601ox.A01(query3, "target_item_id");
                            int A0124 = AbstractC37601ox.A01(query3, "payload");
                            int A0125 = AbstractC37601ox.A01(query3, "payload_blob");
                            int A0126 = AbstractC37601ox.A01(query3, "offline_threading_id");
                            if (query3.moveToFirst()) {
                                query3.getLong(A0120);
                                query3.getLong(A0121);
                                str3 = query3.getString(A0122);
                                String string8 = query3.getString(A0123);
                                String string9 = query3.getString(A0124);
                                if (!query3.isNull(A0125)) {
                                    bArr4 = query3.getBlob(A0125);
                                }
                                String string10 = query3.getString(A0126);
                                z2 = true;
                                AbstractC25233BEq.A0x(3, str3, string8, string9);
                                C14360o3.A0B(string10, 7);
                            }
                            if (!z2) {
                                A1L3 = new C09530e4(null, null);
                            } else if (bArr4 != null) {
                                A1L3 = AbstractC166987dD.A1L(str3, new C47303KvE(bArr4));
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                            c47303KvE2 = (C47303KvE) A1L3.A01;
                            if (c47303KvE2 == null) {
                                return null;
                            }
                        } finally {
                        }
                    }
                    bArr = c47303KvE2.A00;
                } finally {
                }
            }
            PlaintextApplicationPayload plaintextApplicationPayload = new PlaintextApplicationPayload(bArr, 3);
            EnvelopeProperties envelopeProperties = EnvelopeProperties.$redex_init_class;
            return new OutgoingMessage(plaintextApplicationPayload, new EnvelopeProperties(true, false, 0, 0, Integer.valueOf(i), 5, 0));
        } finally {
        }
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public int ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageGetThreadMode(long j, String str) {
        return 5;
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageMarkMessageDelivered(String str, long j) {
        String str2;
        C14360o3.A0B(str, 0);
        UserSession userSession = this.userSession;
        C14360o3.A0B(userSession, 0);
        L4J l4j = (L4J) ((C48502Lct) userSession.A01(C48502Lct.class, C50222MGd.A00)).A00.remove(str);
        C26141Ov A01 = C26141Ov.A01(userSession);
        if (l4j != null) {
            str2 = l4j.A03.A05;
        } else {
            str2 = str;
        }
        C1OW A08 = A01.A08(str2, null, null);
        if (A08 != null) {
            LFR lfr = LFR.A00;
            DirectThreadKey A012 = A08.A01();
            if (A012 != null) {
                lfr.A00(userSession, A08, A012, 1);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C47618L1d A00 = AbstractC46894Kob.A00(userSession);
        Set set = A00.A01;
        if (set.contains(str)) {
            if (set.contains(str)) {
                A00.A00.markerPoint(20128010, str.hashCode(), AnonymousClass001.A0R("dr_pending", "_end"));
            }
            A00.A00.markerEnd(20128010, str.hashCode(), (short) 2);
            set.remove(str);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fd, code lost:
    
        if (X.AbstractC162597Pw.A01(r13, r0.userId) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x026c, code lost:
    
        if (r16 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r50 != 7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ff, code lost:
    
        if (r17 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.1OW, X.1jr] */
    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageUpdateMessageStatus(long r47, java.lang.String r49, int r50, long r51, long r53, long r55) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.realtime.armadilloexpress.plugins.adapter.InstagramAdapterPluginPremailbox.ArmadilloExpressMCPPluginAndroidAdapter_HandleOutgoingMessageUpdateMessageStatus(long, java.lang.String, int, long, long, long):boolean");
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public void InstagramAdapterPluginPremailboxExtensionsDestroy() {
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleIncomingPayload(long j, int i, int i2, long j2, long j3, String str, String str2, byte[] bArr, int i3, long j4) {
        throw AbstractC166987dD.A18(AbstractC111324zv.A00(87));
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [X.5mW, com.facebook.msys.mca.MailboxFeature] */
    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleParticipantDeviceChange(long j, String str, int i, long j2, String str2, boolean z, boolean z2) {
        EnumC46311Keh enumC46311Keh;
        InterfaceC135846Cm A00;
        String str3 = str;
        UserSession userSession = this.userSession;
        C14360o3.A0B(userSession, 0);
        try {
            if (C18U.A06(C06090Tz.A06, userSession, 36321438911768006L)) {
                SecurityAlertRepository A002 = SecurityAlertRepository.A04.A00(userSession);
                if (A002.A00) {
                    boolean A003 = AbstractC94034Kn.A00(userSession);
                    AbstractC1345065z abstractC1345065z = C125815mW.A00;
                    if (A003) {
                        A00 = C44106JeV.A00(userSession);
                    } else {
                        A00 = JVC.A00.A00(userSession);
                    }
                    C14360o3.A0A(new MailboxFeature(A00).A00(LVF.A00, str3, i, j, j2, z, z2));
                } else {
                    AbstractC166987dD.A1Z(new SecurityAlertRepository$handleParticipantDeviceChange$2(userSession, A002, str3, null, i, j, j2, z, z2), ((C4A7) A002).A01);
                }
            }
        } catch (Throwable unused) {
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    enumC46311Keh = EnumC46311Keh.NONE;
                } else {
                    enumC46311Keh = EnumC46311Keh.REMOVED;
                }
            } else {
                enumC46311Keh = EnumC46311Keh.ADDED;
            }
        } else {
            enumC46311Keh = EnumC46311Keh.REPLACED;
        }
        AbstractC60877RXa A0I = TransportEvent.Event.DEFAULT_INSTANCE.A0I();
        AbstractC60877RXa A0I2 = TransportEvent.Event.DeviceChange.DEFAULT_INSTANCE.A0I();
        TransportEvent.Event.DeviceChange deviceChange = (TransportEvent.Event.DeviceChange) AbstractC43592JPx.A0K(A0I2);
        deviceChange.type_ = enumC46311Keh.A00;
        deviceChange.bitField0_ |= 1;
        if (str == null) {
            str3 = "";
        }
        TransportEvent.Event.DeviceChange deviceChange2 = (TransportEvent.Event.DeviceChange) AbstractC43592JPx.A0K(A0I2);
        deviceChange2.bitField0_ |= 2;
        deviceChange2.deviceName_ = str3;
        TransportEvent.Event event = (TransportEvent.Event) AbstractC43592JPx.A0K(A0I);
        RYn A02 = A0I2.A02();
        A02.getClass();
        event.event_ = A02;
        event.eventCase_ = 1;
        TransportEvent.Event event2 = (TransportEvent.Event) A0I.A02();
        LJg lJg = LJg.A00;
        UserSession userSession2 = this.userSession;
        long A0L = AbstractC166987dD.A0L(j2);
        C14360o3.A0A(event2);
        return lJg.A02(userSession2, event2, str2, j, A0L);
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandleParticipantICDCEvent(int i, long j, long j2) {
        EnumC46309Kef enumC46309Kef;
        UserSession userSession = this.userSession;
        if (!AbstractC31177DnL.A1U(AbstractC25228BEl.A0l(userSession), userSession, 36314481063627390L)) {
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                enumC46309Kef = EnumC46309Kef.NONE;
            } else {
                enumC46309Kef = EnumC46309Kef.CLEARED;
            }
        } else {
            enumC46309Kef = EnumC46309Kef.DETECTED;
        }
        AbstractC60877RXa A0I = TransportEvent.Event.DEFAULT_INSTANCE.A0I();
        AbstractC60877RXa A0I2 = TransportEvent.Event.IcdcAlert.DEFAULT_INSTANCE.A0I();
        TransportEvent.Event.IcdcAlert icdcAlert = (TransportEvent.Event.IcdcAlert) AbstractC43592JPx.A0K(A0I2);
        icdcAlert.type_ = enumC46309Kef.A00;
        icdcAlert.bitField0_ |= 1;
        TransportEvent.Event event = (TransportEvent.Event) AbstractC43592JPx.A0K(A0I);
        RYn A02 = A0I2.A02();
        A02.getClass();
        event.event_ = A02;
        event.eventCase_ = 2;
        TransportEvent.Event event2 = (TransportEvent.Event) A0I.A02();
        LJg lJg = LJg.A00;
        UserSession userSession2 = this.userSession;
        long A0L = AbstractC166987dD.A0L(j2);
        C14360o3.A0A(event2);
        return lJg.A02(userSession2, event2, null, j, A0L);
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_HandlePeerDeviceChangeEvent(int i, int i2, int i3, Number number, String str, String str2, String str3, Number number2, Number number3, boolean z) {
        return AbstractC47885LDf.A01(this.userSession, number, number2, number3, str, str2, str3, i, i2, i3);
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldMovePeerDeviceAdminMessageToSetting() {
        return AbstractC120975dp.A00(this.userSession);
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldPersistContactDeviceChangeAlert() {
        return AbstractC31172DnG.A1a(AbstractC109484wa.A00(this.userSession).A01, "is_contact_security_alert_enabled");
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public boolean ArmadilloExpressMCPPluginAndroidAdapter_ShouldPersistPeerDeviceChangeAlert() {
        return AbstractC109484wa.A00(this.userSession).A02();
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.adapter.Premailbox
    public /* bridge */ /* synthetic */ Number ArmadilloExpressMCPPluginAndroidAdapter_HandleCreateAppDataThreadIDForPersistenceStore(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        return LJg.A00(bArr);
    }
}
