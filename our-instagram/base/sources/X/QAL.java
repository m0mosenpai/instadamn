package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public final class QAL extends C3EH {
    public final /* synthetic */ C2L1 A00;
    public final /* synthetic */ String A01;

    public QAL(final C2L1 val$workManager, final String val$name) {
        this.A00 = val$workManager;
        this.A01 = val$name;
    }

    @Override // X.C3EH
    public final /* bridge */ /* synthetic */ List A00() {
        String string;
        byte[] blob;
        byte[] blob2;
        C2M2 A05 = this.A00.A04.A05();
        String str = this.A01;
        C2TF c2tf = (C2TF) A05;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            A00.ADj(1);
        } else {
            A00.ADp(1, str);
        }
        C1YP c1yp = c2tf.A02;
        c1yp.assertNotSuspendingTransaction();
        c1yp.beginTransaction();
        try {
            Cursor A002 = C3EP.A00(c1yp, A00, true);
            try {
                HashMap A1G = AbstractC166987dD.A1G();
                HashMap A1G2 = AbstractC166987dD.A1G();
                while (A002.moveToNext()) {
                    AbstractC58321PtD.A18(A002, A1G);
                    AbstractC58321PtD.A18(A002, A1G2);
                }
                A002.moveToPosition(-1);
                C2TF.A01(c2tf, A1G);
                C2TF.A00(c2tf, A1G2);
                ArrayList A11 = AbstractC43593JPy.A11(A002);
                while (A002.moveToNext()) {
                    if (A002.isNull(0)) {
                        string = null;
                    } else {
                        string = A002.getString(0);
                    }
                    EnumC48482Kp A04 = C2VW.A04(A002.getInt(1));
                    if (A002.isNull(2)) {
                        blob = null;
                    } else {
                        blob = A002.getBlob(2);
                    }
                    C48532Kv A003 = C48532Kv.A00(blob);
                    int i = A002.getInt(3);
                    int i2 = A002.getInt(4);
                    long j = A002.getLong(13);
                    long j2 = A002.getLong(14);
                    long j3 = A002.getLong(15);
                    Integer A052 = C2VW.A05(A002.getInt(16));
                    long j4 = A002.getLong(17);
                    long j5 = A002.getLong(18);
                    int i3 = A002.getInt(19);
                    long j6 = A002.getLong(20);
                    int i4 = A002.getInt(21);
                    Integer A06 = C2VW.A06(A002.getInt(5));
                    boolean A1M = AbstractC167007dF.A1M(A002.getInt(6));
                    boolean A1M2 = AbstractC167007dF.A1M(A002.getInt(7));
                    boolean A1M3 = AbstractC167007dF.A1M(A002.getInt(8));
                    boolean A1M4 = AbstractC167007dF.A1M(A002.getInt(9));
                    long j7 = A002.getLong(10);
                    long j8 = A002.getLong(11);
                    if (A002.isNull(12)) {
                        blob2 = null;
                    } else {
                        blob2 = A002.getBlob(12);
                    }
                    A11.add(new SPQ(new C48562Ky(A06, C2VW.A08(blob2), j7, j8, A1M, A1M2, A1M3, A1M4), A003, A04, A052, string, AbstractC58321PtD.A13(A002, A1G), AbstractC58321PtD.A13(A002, A1G2), i, i3, i2, i4, j, j2, j3, j4, j5, j6));
                }
                c1yp.setTransactionSuccessful();
                c1yp.endTransaction();
                return (List) C48412Ki.A0N.apply(A11);
            } finally {
                A002.close();
                A00.A00();
            }
        } catch (Throwable th) {
            c1yp.endTransaction();
            throw th;
        }
    }
}
