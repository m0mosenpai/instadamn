package androidx.work.impl.workers;

import X.AbstractC1114350h;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC37591ow;
import X.AbstractC37601ox;
import X.AbstractC43593JPy;
import X.C14360o3;
import X.C1YP;
import X.C2L1;
import X.C2M2;
import X.C2M5;
import X.C2M6;
import X.C2M9;
import X.C2TF;
import X.C2VW;
import X.C37581ov;
import X.C48412Ki;
import X.C48442Kl;
import X.C48532Kv;
import X.C48562Ky;
import X.C51A;
import X.EnumC48482Kp;
import X.SQX;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class DiagnosticsWorker extends Worker {
    @Override // androidx.work.Worker
    public final AbstractC1114350h doWork() {
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        byte[] blob3;
        C2L1 A00 = C2L1.A00(this.mAppContext);
        C14360o3.A07(A00);
        WorkDatabase workDatabase = A00.A04;
        C14360o3.A07(workDatabase);
        C2M2 A05 = workDatabase.A05();
        C2M9 A03 = workDatabase.A03();
        C2M5 A06 = workDatabase.A06();
        C2M6 A02 = workDatabase.A02();
        long currentTimeMillis = System.currentTimeMillis() - AbstractC43593JPy.A09(TimeUnit.DAYS);
        TreeMap treeMap = C37581ov.A08;
        C37581ov A002 = AbstractC37591ow.A00("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        A002.ADi(1, currentTimeMillis);
        C1YP c1yp = ((C2TF) A05).A02;
        c1yp.assertNotSuspendingTransaction();
        Cursor query = c1yp.query(A002, (CancellationSignal) null);
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
            ArrayList A11 = AbstractC43593JPy.A11(query);
            while (query.moveToNext()) {
                if (query.isNull(A01)) {
                    string = null;
                } else {
                    string = query.getString(A01);
                }
                EnumC48482Kp A04 = C2VW.A04(query.getInt(A012));
                if (query.isNull(A013)) {
                    string2 = null;
                } else {
                    string2 = query.getString(A013);
                }
                if (query.isNull(A014)) {
                    string3 = null;
                } else {
                    string3 = query.getString(A014);
                }
                if (query.isNull(A015)) {
                    blob = null;
                } else {
                    blob = query.getBlob(A015);
                }
                C48532Kv A003 = C48532Kv.A00(blob);
                if (query.isNull(A016)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(A016);
                }
                C48532Kv A004 = C48532Kv.A00(blob2);
                long j = query.getLong(A017);
                long j2 = query.getLong(A018);
                long j3 = query.getLong(A019);
                int i = query.getInt(A0110);
                Integer A052 = C2VW.A05(query.getInt(A0111));
                long j4 = query.getLong(A0112);
                long j5 = query.getLong(A0113);
                long j6 = query.getLong(A0114);
                long j7 = query.getLong(A0115);
                boolean A1M = AbstractC167007dF.A1M(query.getInt(A0116));
                Integer A07 = C2VW.A07(query.getInt(A0117));
                int i2 = query.getInt(A0118);
                int i3 = query.getInt(A0119);
                long j8 = query.getLong(A0120);
                int i4 = query.getInt(A0121);
                int i5 = query.getInt(A0122);
                Integer A062 = C2VW.A06(query.getInt(A0123));
                boolean A1M2 = AbstractC167007dF.A1M(query.getInt(A0124));
                boolean A1M3 = AbstractC167007dF.A1M(query.getInt(A0125));
                boolean A1M4 = AbstractC167007dF.A1M(query.getInt(A0126));
                boolean A1M5 = AbstractC167007dF.A1M(query.getInt(A0127));
                long j9 = query.getLong(A0128);
                long j10 = query.getLong(A0129);
                if (query.isNull(A0130)) {
                    blob3 = null;
                } else {
                    blob3 = query.getBlob(A0130);
                }
                A11.add(new C48412Ki(new C48562Ky(A062, C2VW.A08(blob3), j9, j10, A1M2, A1M3, A1M4, A1M5), A003, A004, A04, A052, A07, string, string2, string3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, A1M));
            }
            query.close();
            A002.A00();
            ArrayList Bpr = A05.Bpr();
            ArrayList Ab4 = A05.Ab4(200);
            if (AbstractC25226BEj.A1b(A11)) {
                C48442Kl.A00();
                C48442Kl.A00();
                SQX.A00(A02, A03, A06, A11);
            }
            if (AbstractC25226BEj.A1b(Bpr)) {
                C48442Kl.A00();
                C48442Kl.A00();
                SQX.A00(A02, A03, A06, Bpr);
            }
            if (AbstractC25226BEj.A1b(Ab4)) {
                C48442Kl.A00();
                C48442Kl.A00();
                SQX.A00(A02, A03, A06, Ab4);
            }
            return new C51A();
        } catch (Throwable th) {
            query.close();
            A002.A00();
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
    }
}
