package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.2VU, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2VU {
    static {
        C48442Kl.A01("Schedulers");
    }

    public static void A00(WorkDatabase workDatabase, List list) {
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        byte[] blob3;
        String string4;
        String string5;
        String string6;
        byte[] blob4;
        byte[] blob5;
        byte[] blob6;
        if (list != null && list.size() != 0) {
            C2M2 A05 = workDatabase.A05();
            workDatabase.beginTransaction();
            try {
                TreeMap treeMap = C37581ov.A08;
                C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
                C1YP c1yp = ((C2TF) A05).A02;
                c1yp.assertNotSuspendingTransaction();
                Cursor query = c1yp.query(A00, (CancellationSignal) null);
                try {
                    int A01 = AbstractC37601ox.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    int A012 = AbstractC37601ox.A01(query, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                    int A013 = AbstractC37601ox.A01(query, "worker_class_name");
                    int A014 = AbstractC37601ox.A01(query, "input_merger_class_name");
                    int A015 = AbstractC37601ox.A01(query, "input");
                    int A016 = AbstractC37601ox.A01(query, "output");
                    int A017 = AbstractC37601ox.A01(query, "initial_delay");
                    int A018 = AbstractC37601ox.A01(query, "interval_duration");
                    int A019 = AbstractC37601ox.A01(query, "flex_duration");
                    int A0110 = AbstractC37601ox.A01(query, "run_attempt_count");
                    int A0111 = AbstractC37601ox.A01(query, "backoff_policy");
                    int A0112 = AbstractC37601ox.A01(query, "backoff_delay_duration");
                    int A0113 = AbstractC37601ox.A01(query, "last_enqueue_time");
                    int A0114 = AbstractC37601ox.A01(query, "minimum_retention_duration");
                    int A0115 = AbstractC37601ox.A01(query, "schedule_requested_at");
                    int A0116 = AbstractC37601ox.A01(query, "run_in_foreground");
                    int A0117 = AbstractC37601ox.A01(query, "out_of_quota_policy");
                    int A0118 = AbstractC37601ox.A01(query, "period_count");
                    int A0119 = AbstractC37601ox.A01(query, "generation");
                    int A0120 = AbstractC37601ox.A01(query, "next_schedule_time_override");
                    int A0121 = AbstractC37601ox.A01(query, "next_schedule_time_override_generation");
                    int A0122 = AbstractC37601ox.A01(query, "stop_reason");
                    int A0123 = AbstractC37601ox.A01(query, "required_network_type");
                    int A0124 = AbstractC37601ox.A01(query, "requires_charging");
                    int A0125 = AbstractC37601ox.A01(query, "requires_device_idle");
                    int A0126 = AbstractC37601ox.A01(query, "requires_battery_not_low");
                    int A0127 = AbstractC37601ox.A01(query, "requires_storage_not_low");
                    int A0128 = AbstractC37601ox.A01(query, "trigger_content_update_delay");
                    int A0129 = AbstractC37601ox.A01(query, "trigger_max_content_delay");
                    int A0130 = AbstractC37601ox.A01(query, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        if (query.isNull(A01)) {
                            string4 = null;
                        } else {
                            string4 = query.getString(A01);
                        }
                        EnumC48482Kp A04 = C2VW.A04(query.getInt(A012));
                        if (query.isNull(A013)) {
                            string5 = null;
                        } else {
                            string5 = query.getString(A013);
                        }
                        if (query.isNull(A014)) {
                            string6 = null;
                        } else {
                            string6 = query.getString(A014);
                        }
                        if (query.isNull(A015)) {
                            blob4 = null;
                        } else {
                            blob4 = query.getBlob(A015);
                        }
                        C48532Kv A002 = C48532Kv.A00(blob4);
                        if (query.isNull(A016)) {
                            blob5 = null;
                        } else {
                            blob5 = query.getBlob(A016);
                        }
                        C48532Kv A003 = C48532Kv.A00(blob5);
                        long j = query.getLong(A017);
                        long j2 = query.getLong(A018);
                        long j3 = query.getLong(A019);
                        int i = query.getInt(A0110);
                        Integer A052 = C2VW.A05(query.getInt(A0111));
                        long j4 = query.getLong(A0112);
                        long j5 = query.getLong(A0113);
                        long j6 = query.getLong(A0114);
                        long j7 = query.getLong(A0115);
                        boolean z = false;
                        if (query.getInt(A0116) != 0) {
                            z = true;
                        }
                        Integer A07 = C2VW.A07(query.getInt(A0117));
                        int i2 = query.getInt(A0118);
                        int i3 = query.getInt(A0119);
                        long j8 = query.getLong(A0120);
                        int i4 = query.getInt(A0121);
                        int i5 = query.getInt(A0122);
                        Integer A06 = C2VW.A06(query.getInt(A0123));
                        boolean z2 = false;
                        if (query.getInt(A0124) != 0) {
                            z2 = true;
                        }
                        boolean z3 = false;
                        if (query.getInt(A0125) != 0) {
                            z3 = true;
                        }
                        boolean z4 = false;
                        if (query.getInt(A0126) != 0) {
                            z4 = true;
                        }
                        boolean z5 = false;
                        if (query.getInt(A0127) != 0) {
                            z5 = true;
                        }
                        long j9 = query.getLong(A0128);
                        long j10 = query.getLong(A0129);
                        if (query.isNull(A0130)) {
                            blob6 = null;
                        } else {
                            blob6 = query.getBlob(A0130);
                        }
                        arrayList.add(new C48412Ki(new C48562Ky(A06, C2VW.A08(blob6), j9, j10, z2, z3, z4, z5), A002, A003, A04, A052, A07, string4, string5, string6, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, z));
                    }
                    query.close();
                    A00.A00();
                    A01(A05, arrayList);
                    C37581ov A004 = AbstractC37591ow.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
                    A004.ADi(1, 20L);
                    c1yp.assertNotSuspendingTransaction();
                    Cursor query2 = c1yp.query(A004, (CancellationSignal) null);
                    try {
                        int A0131 = AbstractC37601ox.A01(query2, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        int A0132 = AbstractC37601ox.A01(query2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                        int A0133 = AbstractC37601ox.A01(query2, "worker_class_name");
                        int A0134 = AbstractC37601ox.A01(query2, "input_merger_class_name");
                        int A0135 = AbstractC37601ox.A01(query2, "input");
                        int A0136 = AbstractC37601ox.A01(query2, "output");
                        int A0137 = AbstractC37601ox.A01(query2, "initial_delay");
                        int A0138 = AbstractC37601ox.A01(query2, "interval_duration");
                        int A0139 = AbstractC37601ox.A01(query2, "flex_duration");
                        int A0140 = AbstractC37601ox.A01(query2, "run_attempt_count");
                        int A0141 = AbstractC37601ox.A01(query2, "backoff_policy");
                        int A0142 = AbstractC37601ox.A01(query2, "backoff_delay_duration");
                        int A0143 = AbstractC37601ox.A01(query2, "last_enqueue_time");
                        int A0144 = AbstractC37601ox.A01(query2, "minimum_retention_duration");
                        int A0145 = AbstractC37601ox.A01(query2, "schedule_requested_at");
                        int A0146 = AbstractC37601ox.A01(query2, "run_in_foreground");
                        int A0147 = AbstractC37601ox.A01(query2, "out_of_quota_policy");
                        int A0148 = AbstractC37601ox.A01(query2, "period_count");
                        int A0149 = AbstractC37601ox.A01(query2, "generation");
                        int A0150 = AbstractC37601ox.A01(query2, "next_schedule_time_override");
                        int A0151 = AbstractC37601ox.A01(query2, "next_schedule_time_override_generation");
                        int A0152 = AbstractC37601ox.A01(query2, "stop_reason");
                        int A0153 = AbstractC37601ox.A01(query2, "required_network_type");
                        int A0154 = AbstractC37601ox.A01(query2, "requires_charging");
                        int A0155 = AbstractC37601ox.A01(query2, "requires_device_idle");
                        int A0156 = AbstractC37601ox.A01(query2, "requires_battery_not_low");
                        int A0157 = AbstractC37601ox.A01(query2, "requires_storage_not_low");
                        int A0158 = AbstractC37601ox.A01(query2, "trigger_content_update_delay");
                        int A0159 = AbstractC37601ox.A01(query2, "trigger_max_content_delay");
                        int A0160 = AbstractC37601ox.A01(query2, "content_uri_triggers");
                        ArrayList arrayList2 = new ArrayList(query2.getCount());
                        while (query2.moveToNext()) {
                            if (query2.isNull(A0131)) {
                                string = null;
                            } else {
                                string = query2.getString(A0131);
                            }
                            EnumC48482Kp A042 = C2VW.A04(query2.getInt(A0132));
                            if (query2.isNull(A0133)) {
                                string2 = null;
                            } else {
                                string2 = query2.getString(A0133);
                            }
                            if (query2.isNull(A0134)) {
                                string3 = null;
                            } else {
                                string3 = query2.getString(A0134);
                            }
                            if (query2.isNull(A0135)) {
                                blob = null;
                            } else {
                                blob = query2.getBlob(A0135);
                            }
                            C48532Kv A005 = C48532Kv.A00(blob);
                            if (query2.isNull(A0136)) {
                                blob2 = null;
                            } else {
                                blob2 = query2.getBlob(A0136);
                            }
                            C48532Kv A006 = C48532Kv.A00(blob2);
                            long j11 = query2.getLong(A0137);
                            long j12 = query2.getLong(A0138);
                            long j13 = query2.getLong(A0139);
                            int i6 = query2.getInt(A0140);
                            Integer A053 = C2VW.A05(query2.getInt(A0141));
                            long j14 = query2.getLong(A0142);
                            long j15 = query2.getLong(A0143);
                            long j16 = query2.getLong(A0144);
                            long j17 = query2.getLong(A0145);
                            boolean z6 = false;
                            if (query2.getInt(A0146) != 0) {
                                z6 = true;
                            }
                            Integer A072 = C2VW.A07(query2.getInt(A0147));
                            int i7 = query2.getInt(A0148);
                            int i8 = query2.getInt(A0149);
                            long j18 = query2.getLong(A0150);
                            int i9 = query2.getInt(A0151);
                            int i10 = query2.getInt(A0152);
                            Integer A062 = C2VW.A06(query2.getInt(A0153));
                            boolean z7 = false;
                            if (query2.getInt(A0154) != 0) {
                                z7 = true;
                            }
                            boolean z8 = false;
                            if (query2.getInt(A0155) != 0) {
                                z8 = true;
                            }
                            boolean z9 = false;
                            if (query2.getInt(A0156) != 0) {
                                z9 = true;
                            }
                            boolean z10 = false;
                            if (query2.getInt(A0157) != 0) {
                                z10 = true;
                            }
                            long j19 = query2.getLong(A0158);
                            long j20 = query2.getLong(A0159);
                            if (query2.isNull(A0160)) {
                                blob3 = null;
                            } else {
                                blob3 = query2.getBlob(A0160);
                            }
                            arrayList2.add(new C48412Ki(new C48562Ky(A062, C2VW.A08(blob3), j19, j20, z7, z8, z9, z10), A005, A006, A042, A053, A072, string, string2, string3, i6, i7, i8, i9, i10, j11, j12, j13, j14, j15, j16, j17, j18, z6));
                        }
                        query2.close();
                        A004.A00();
                        A01(A05, arrayList2);
                        arrayList2.addAll(arrayList);
                        ArrayList Ab4 = A05.Ab4(200);
                        workDatabase.setTransactionSuccessful();
                        workDatabase.endTransaction();
                        if (arrayList2.size() > 0) {
                            C48412Ki[] c48412KiArr = (C48412Ki[]) arrayList2.toArray(new C48412Ki[arrayList2.size()]);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                InterfaceC48882Mg interfaceC48882Mg = (InterfaceC48882Mg) it.next();
                                if (interfaceC48882Mg.CL9()) {
                                    interfaceC48882Mg.EM3(c48412KiArr);
                                }
                            }
                        }
                        if (Ab4.size() > 0) {
                            C48412Ki[] c48412KiArr2 = (C48412Ki[]) Ab4.toArray(new C48412Ki[Ab4.size()]);
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                InterfaceC48882Mg interfaceC48882Mg2 = (InterfaceC48882Mg) it2.next();
                                if (!interfaceC48882Mg2.CL9()) {
                                    interfaceC48882Mg2.EM3(c48412KiArr2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        query2.close();
                        A004.A00();
                        throw th;
                    }
                } catch (Throwable th2) {
                    query.close();
                    A00.A00();
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase.endTransaction();
                throw th3;
            }
        }
    }

    public static void A01(C2M2 c2m2, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c2m2.CnQ(currentTimeMillis, ((C48412Ki) it.next()).A0M);
            }
        }
    }
}
