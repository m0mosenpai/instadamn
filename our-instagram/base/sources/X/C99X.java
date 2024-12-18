package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.PowerUpsData;
import com.instagram.direct.armadilloexpress.transportpayload.Text;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.99X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C99X {
    public final UserSession A00;
    public final C2057799c A01;
    public final C120005by A02;
    public final List A03;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.99b, java.lang.Object] */
    public C99X(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C2057799c(userSession, new Object());
        C120005by A00 = C120005by.A00(userSession);
        C14360o3.A07(A00);
        this.A02 = A00;
        this.A03 = AbstractC16960so.A1Q(13, 15, 14);
    }

    public final void A00(int i) {
        List list;
        AddMessagePayload A0L;
        AddMessageContent addMessageContent;
        C83403nh c83403nh;
        byte[] blob;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        C2057799c c2057799c = this.A01;
        ArmadilloExpressEncryptedBackupDatabase armadilloExpressEncryptedBackupDatabase = c2057799c.A02;
        C2059699y c2059699y = (C2059699y) armadilloExpressEncryptedBackupDatabase.A02();
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM messages_table WHERE hidden == 1 AND hidden_ts_sec < ?", 1);
        long j = i;
        A00.ADi(1, j);
        C1YP c1yp = c2059699y.A00;
        c1yp.assertNotSuspendingTransaction();
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
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                long j2 = query.getLong(A01);
                long j3 = query.getLong(A012);
                String string = query.getString(A013);
                String string2 = query.getString(A014);
                if (query.isNull(A015)) {
                    blob = null;
                } else {
                    blob = query.getBlob(A015);
                }
                boolean z = false;
                if (query.getInt(A016) != 0) {
                    z = true;
                }
                int i2 = query.getInt(A017);
                String string3 = query.getString(A018);
                if (query.isNull(A019)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(query.getInt(A019));
                }
                if (query.isNull(A0110)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(query.getInt(A0110));
                }
                if (query.isNull(A0111)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf(query.getInt(A0111));
                }
                arrayList.add(new C9ZN(valueOf, valueOf2, valueOf3, string, string2, string3, blob, i2, j2, j3, z));
            }
            query.close();
            A00.A00();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C9ZN c9zn = (C9ZN) it.next();
                    UserSession userSession = c2057799c.A00;
                    byte[] bArr = c9zn.A0A;
                    if (bArr != null) {
                        TransportPayload A002 = LJ5.A00(bArr);
                        if (A002 != null && (A0L = A002.A0L()) != null && ((addMessageContent = A0L.content_) != null || (addMessageContent = AddMessageContent.DEFAULT_INSTANCE) != null)) {
                            int i3 = addMessageContent.addMessageContentCase_;
                            if (i3 == 5) {
                                Media A0L2 = addMessageContent.A0L();
                                C14360o3.A07(A0L2);
                                c83403nh = new C83403nh();
                                c83403nh.A0g();
                                LL2.A04(userSession, null, A0L2, c83403nh, false);
                            } else if (i3 == 1 && (addMessageContent.A0N().bitField0_ & 8) != 0) {
                                PowerUpsData powerUpsData = addMessageContent.A0N().powerUpData_;
                                if (powerUpsData == null) {
                                    powerUpsData = PowerUpsData.DEFAULT_INSTANCE;
                                }
                                if ((powerUpsData.bitField0_ & 2) != 0) {
                                    c83403nh = new C83403nh();
                                    Text A0N = addMessageContent.A0N();
                                    C14360o3.A07(A0N);
                                    AbstractC46836KnV.A00(userSession, A0N, c83403nh);
                                }
                            }
                            list = LIM.A00.A01(c83403nh);
                            InterfaceC09390do interfaceC09390do = LKn.A05;
                            AbstractC46712KlV.A00(userSession).A06(list);
                        }
                        list = C16930sl.A00;
                        InterfaceC09390do interfaceC09390do2 = LKn.A05;
                        AbstractC46712KlV.A00(userSession).A06(list);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C9ZN) it2.next()).A06);
                }
                Iterator it3 = AbstractC001800i.A0Q(arrayList2, 800).iterator();
                while (it3.hasNext()) {
                    List list2 = (List) it3.next();
                    C1YP c1yp2 = ((C2059699y) armadilloExpressEncryptedBackupDatabase.A02()).A00;
                    c1yp2.assertNotSuspendingTransaction();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DELETE FROM messages_table WHERE hidden == 1 AND hidden_ts_sec < ");
                    sb.append("?");
                    sb.append(" AND item_id in (");
                    AbstractC73723Sa.A00(sb, list2.size());
                    sb.append(")");
                    InterfaceC37561ot compileStatement = c1yp2.compileStatement(sb.toString());
                    compileStatement.ADi(1, j);
                    Iterator it4 = list2.iterator();
                    int i4 = 2;
                    while (it4.hasNext()) {
                        compileStatement.ADp(i4, (String) it4.next());
                        i4++;
                    }
                    c1yp2.beginTransaction();
                    try {
                        compileStatement.ATb();
                        c1yp2.setTransactionSuccessful();
                    } finally {
                        c1yp2.endTransaction();
                    }
                }
                KOF kof = (KOF) armadilloExpressEncryptedBackupDatabase.A01();
                C1YP c1yp3 = kof.A00;
                c1yp3.assertNotSuspendingTransaction();
                AbstractC29601bb abstractC29601bb = kof.A01;
                InterfaceC37561ot acquire = abstractC29601bb.acquire();
                acquire.ADi(1, j);
                try {
                    c1yp3.beginTransaction();
                    try {
                        acquire.ATb();
                        c1yp3.setTransactionSuccessful();
                        abstractC29601bb.release(acquire);
                        String A04 = C4H6.A04("0", j);
                        KOE koe = (KOE) armadilloExpressEncryptedBackupDatabase.A00();
                        C1YP c1yp4 = koe.A00;
                        c1yp4.assertNotSuspendingTransaction();
                        AbstractC29601bb abstractC29601bb2 = koe.A01;
                        InterfaceC37561ot acquire2 = abstractC29601bb2.acquire();
                        acquire2.ADp(1, A04);
                        try {
                            c1yp4.beginTransaction();
                            try {
                                acquire2.ATb();
                                c1yp4.setTransactionSuccessful();
                            } finally {
                                c1yp4.endTransaction();
                            }
                        } finally {
                            abstractC29601bb2.release(acquire2);
                        }
                    } finally {
                        c1yp3.endTransaction();
                    }
                } catch (Throwable th) {
                    abstractC29601bb.release(acquire);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            query.close();
            A00.A00();
            throw th2;
        }
    }
}
