package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/* renamed from: X.2TF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2TF implements C2M2 {
    public final AbstractC49502Ph A00;
    public final AbstractC29571bY A01;
    public final C1YP A02;
    public final AbstractC29601bb A03;
    public final AbstractC29601bb A04;
    public final AbstractC29601bb A05;
    public final AbstractC29601bb A06;
    public final AbstractC29601bb A07;
    public final AbstractC29601bb A08;
    public final AbstractC29601bb A09;
    public final AbstractC29601bb A0A;
    public final AbstractC29601bb A0B;
    public final AbstractC29601bb A0C;
    public final AbstractC29601bb A0D;
    public final AbstractC29601bb A0E;
    public final AbstractC29601bb A0F;
    public final AbstractC29601bb A0G;
    public final AbstractC29601bb A0H;

    @Override // X.C2M2
    public final void AOZ(final String id) {
        C1YP c1yp = this.A02;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = this.A08;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        if (id == null) {
            acquire.ADj(1);
        } else {
            acquire.ADp(1, id);
        }
        c1yp.beginTransaction();
        try {
            acquire.ATb();
            c1yp.setTransactionSuccessful();
        } finally {
            c1yp.endTransaction();
            abstractC29601bb.release(acquire);
        }
    }

    @Override // X.C2M2
    public final ArrayList Ab4(final int maxLimit) {
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        byte[] blob3;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        A00.ADi(1, 200L);
        C1YP c1yp = this.A02;
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
                C48532Kv A002 = C48532Kv.A00(blob);
                if (query.isNull(A016)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(A016);
                }
                C48532Kv A003 = C48532Kv.A00(blob2);
                long j = query.getLong(A017);
                long j2 = query.getLong(A018);
                long j3 = query.getLong(A019);
                int i = query.getInt(A0110);
                Integer A05 = C2VW.A05(query.getInt(A0111));
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
                    blob3 = null;
                } else {
                    blob3 = query.getBlob(A0130);
                }
                arrayList.add(new C48412Ki(new C48562Ky(A06, C2VW.A08(blob3), j9, j10, z2, z3, z4, z5), A002, A003, A04, A05, A07, string, string2, string3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, z));
            }
            return arrayList;
        } finally {
            query.close();
            A00.A00();
        }
    }

    @Override // X.C2M2
    public final ArrayList Bpr() {
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        byte[] blob3;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM workspec WHERE state=1", 0);
        C1YP c1yp = this.A02;
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
                C48532Kv A002 = C48532Kv.A00(blob);
                if (query.isNull(A016)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(A016);
                }
                C48532Kv A003 = C48532Kv.A00(blob2);
                long j = query.getLong(A017);
                long j2 = query.getLong(A018);
                long j3 = query.getLong(A019);
                int i = query.getInt(A0110);
                Integer A05 = C2VW.A05(query.getInt(A0111));
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
                    blob3 = null;
                } else {
                    blob3 = query.getBlob(A0130);
                }
                arrayList.add(new C48412Ki(new C48562Ky(A06, C2VW.A08(blob3), j9, j10, z2, z3, z4, z5), A002, A003, A04, A05, A07, string, string2, string3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, z));
            }
            return arrayList;
        } finally {
            query.close();
            A00.A00();
        }
    }

    @Override // X.C2M2
    public final ArrayList BqY() {
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        byte[] blob3;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        C1YP c1yp = this.A02;
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
                C48532Kv A002 = C48532Kv.A00(blob);
                if (query.isNull(A016)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(A016);
                }
                C48532Kv A003 = C48532Kv.A00(blob2);
                long j = query.getLong(A017);
                long j2 = query.getLong(A018);
                long j3 = query.getLong(A019);
                int i = query.getInt(A0110);
                Integer A05 = C2VW.A05(query.getInt(A0111));
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
                    blob3 = null;
                } else {
                    blob3 = query.getBlob(A0130);
                }
                arrayList.add(new C48412Ki(new C48562Ky(A06, C2VW.A08(blob3), j9, j10, z2, z3, z4, z5), A002, A003, A04, A05, A07, string, string2, string3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, z));
            }
            return arrayList;
        } finally {
            query.close();
            A00.A00();
        }
    }

    @Override // X.C2M2
    public final EnumC48482Kp Bzz(final String id) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT state FROM workspec WHERE id=?", 1);
        if (id == null) {
            A00.ADj(1);
        } else {
            A00.ADp(1, id);
        }
        C1YP c1yp = this.A02;
        c1yp.assertNotSuspendingTransaction();
        EnumC48482Kp enumC48482Kp = null;
        Cursor query = c1yp.query(A00, (CancellationSignal) null);
        try {
            if (query.moveToFirst() && !query.isNull(0)) {
                int i = query.getInt(0);
                if (Integer.valueOf(i) != null) {
                    enumC48482Kp = C2VW.A04(i);
                }
            }
            return enumC48482Kp;
        } finally {
            query.close();
            A00.A00();
        }
    }

    @Override // X.C2M2
    public final C48412Ki CHq(final String id) {
        C48412Ki c48412Ki;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        byte[] blob3;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM workspec WHERE id=?", 1);
        if (id == null) {
            A00.ADj(1);
        } else {
            A00.ADp(1, id);
        }
        C1YP c1yp = this.A02;
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
            if (query.moveToFirst()) {
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
                C48532Kv A002 = C48532Kv.A00(blob);
                if (query.isNull(A016)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(A016);
                }
                C48532Kv A003 = C48532Kv.A00(blob2);
                long j = query.getLong(A017);
                long j2 = query.getLong(A018);
                long j3 = query.getLong(A019);
                int i = query.getInt(A0110);
                Integer A05 = C2VW.A05(query.getInt(A0111));
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
                int i6 = query.getInt(A0124);
                boolean z2 = false;
                if (i6 != 0) {
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
                    blob3 = null;
                } else {
                    blob3 = query.getBlob(A0130);
                }
                c48412Ki = new C48412Ki(new C48562Ky(A06, C2VW.A08(blob3), j9, j10, z2, z3, z4, z5), A002, A003, A04, A05, A07, string, string2, string3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, z);
            } else {
                c48412Ki = null;
            }
            return c48412Ki;
        } finally {
            query.close();
            A00.A00();
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.2Zu] */
    @Override // X.C2M2
    public final ArrayList CHr(final String name) {
        String string;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            A00.ADj(1);
        } else {
            A00.ADp(1, name);
        }
        C1YP c1yp = this.A02;
        c1yp.assertNotSuspendingTransaction();
        Cursor query = c1yp.query(A00, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                EnumC48482Kp A04 = C2VW.A04(query.getInt(1));
                C14360o3.A0B(string, 1);
                C14360o3.A0B(A04, 2);
                ?? obj = new Object();
                obj.A01 = string;
                obj.A00 = A04;
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            query.close();
            A00.A00();
        }
    }

    @Override // X.C2M2
    public final int CnQ(final long id, final String startTime) {
        C1YP c1yp = this.A02;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = this.A0A;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADi(1, id);
        if (startTime == null) {
            acquire.ADj(2);
        } else {
            acquire.ADp(2, startTime);
        }
        c1yp.beginTransaction();
        try {
            int ATb = acquire.ATb();
            c1yp.setTransactionSuccessful();
            return ATb;
        } finally {
            c1yp.endTransaction();
            abstractC29601bb.release(acquire);
        }
    }

    @Override // X.C2M2
    public final void EK4(final String id, final int overrideGeneration) {
        C1YP c1yp = this.A02;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = this.A0C;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADp(1, id);
        acquire.ADi(2, overrideGeneration);
        c1yp.beginTransaction();
        try {
            acquire.ATb();
            c1yp.setTransactionSuccessful();
        } finally {
            c1yp.endTransaction();
            abstractC29601bb.release(acquire);
        }
    }

    @Override // X.C2M2
    public final void EWu(final String id, final long enqueueTime) {
        C1YP c1yp = this.A02;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = this.A0D;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADi(1, enqueueTime);
        if (id == null) {
            acquire.ADj(2);
        } else {
            acquire.ADp(2, id);
        }
        c1yp.beginTransaction();
        try {
            acquire.ATb();
            c1yp.setTransactionSuccessful();
        } finally {
            c1yp.endTransaction();
            abstractC29601bb.release(acquire);
        }
    }

    @Override // X.C2M2
    public final void EaM(final C48532Kv id, final String output) {
        C1YP c1yp = this.A02;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = this.A0F;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        byte[] A01 = C48532Kv.A01(id);
        if (A01 == null) {
            acquire.ADj(1);
        } else {
            acquire.ADc(1, A01);
        }
        acquire.ADp(2, output);
        c1yp.beginTransaction();
        try {
            acquire.ATb();
            c1yp.setTransactionSuccessful();
        } finally {
            c1yp.endTransaction();
            abstractC29601bb.release(acquire);
        }
    }

    @Override // X.C2M2
    public final int Eei(final EnumC48482Kp state, final String id) {
        C1YP c1yp = this.A02;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = this.A0G;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADi(1, C2VW.A00(state));
        if (id == null) {
            acquire.ADj(2);
        } else {
            acquire.ADp(2, id);
        }
        c1yp.beginTransaction();
        try {
            int ATb = acquire.ATb();
            c1yp.setTransactionSuccessful();
            return ATb;
        } finally {
            c1yp.endTransaction();
            abstractC29601bb.release(acquire);
        }
    }

    @Override // X.C2M2
    public final void Eeq(final String id, final int stopReason) {
        C1YP c1yp = this.A02;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = this.A0H;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADi(1, stopReason);
        acquire.ADp(2, id);
        c1yp.beginTransaction();
        try {
            acquire.ATb();
            c1yp.setTransactionSuccessful();
        } finally {
            c1yp.endTransaction();
            abstractC29601bb.release(acquire);
        }
    }

    public C2TF(final C1YP __db) {
        this.A02 = __db;
        this.A01 = new AbstractC29571bY(__db) { // from class: X.2TG
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C48412Ki c48412Ki = (C48412Ki) obj;
                interfaceC37561ot.ADp(1, c48412Ki.A0M);
                interfaceC37561ot.ADi(2, C2VW.A00(c48412Ki.A0E));
                interfaceC37561ot.ADp(3, c48412Ki.A0I);
                String str = c48412Ki.A0H;
                if (str == null) {
                    interfaceC37561ot.ADj(4);
                } else {
                    interfaceC37561ot.ADp(4, str);
                }
                byte[] A01 = C48532Kv.A01(c48412Ki.A0C);
                if (A01 == null) {
                    interfaceC37561ot.ADj(5);
                } else {
                    interfaceC37561ot.ADc(5, A01);
                }
                byte[] A012 = C48532Kv.A01(c48412Ki.A0D);
                if (A012 == null) {
                    interfaceC37561ot.ADj(6);
                } else {
                    interfaceC37561ot.ADc(6, A012);
                }
                interfaceC37561ot.ADi(7, c48412Ki.A05);
                interfaceC37561ot.ADi(8, c48412Ki.A06);
                interfaceC37561ot.ADi(9, c48412Ki.A04);
                interfaceC37561ot.ADi(10, c48412Ki.A02);
                interfaceC37561ot.ADi(11, C2VW.A01(c48412Ki.A0F));
                interfaceC37561ot.ADi(12, c48412Ki.A03);
                interfaceC37561ot.ADi(13, c48412Ki.A07);
                interfaceC37561ot.ADi(14, c48412Ki.A08);
                interfaceC37561ot.ADi(15, c48412Ki.A0A);
                interfaceC37561ot.ADi(16, c48412Ki.A0J ? 1L : 0L);
                interfaceC37561ot.ADi(17, C2VW.A03(c48412Ki.A0G));
                interfaceC37561ot.ADi(18, c48412Ki.A01);
                interfaceC37561ot.ADi(19, c48412Ki.A0K);
                interfaceC37561ot.ADi(20, c48412Ki.A09);
                interfaceC37561ot.ADi(21, c48412Ki.A00);
                interfaceC37561ot.ADi(22, c48412Ki.A0L);
                C48562Ky c48562Ky = c48412Ki.A0B;
                if (c48562Ky != null) {
                    interfaceC37561ot.ADi(23, C2VW.A02(c48562Ky.A02));
                    interfaceC37561ot.ADi(24, c48562Ky.A05 ? 1L : 0L);
                    interfaceC37561ot.ADi(25, c48562Ky.A06 ? 1L : 0L);
                    interfaceC37561ot.ADi(26, c48562Ky.A04 ? 1L : 0L);
                    interfaceC37561ot.ADi(27, c48562Ky.A07 ? 1L : 0L);
                    interfaceC37561ot.ADi(28, c48562Ky.A01);
                    interfaceC37561ot.ADi(29, c48562Ky.A00);
                    interfaceC37561ot.ADc(30, C2VW.A09(c48562Ky.A03));
                    return;
                }
                interfaceC37561ot.ADj(23);
                interfaceC37561ot.ADj(24);
                interfaceC37561ot.ADj(25);
                interfaceC37561ot.ADj(26);
                interfaceC37561ot.ADj(27);
                interfaceC37561ot.ADj(28);
                interfaceC37561ot.ADj(29);
                interfaceC37561ot.ADj(30);
            }
        };
        this.A00 = new AbstractC49502Ph(__db) { // from class: X.2TH
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }

            @Override // X.AbstractC49502Ph
            public final /* bridge */ /* synthetic */ void A01(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C48412Ki c48412Ki = (C48412Ki) obj;
                String str = c48412Ki.A0M;
                interfaceC37561ot.ADp(1, str);
                interfaceC37561ot.ADi(2, C2VW.A00(c48412Ki.A0E));
                interfaceC37561ot.ADp(3, c48412Ki.A0I);
                String str2 = c48412Ki.A0H;
                if (str2 == null) {
                    interfaceC37561ot.ADj(4);
                } else {
                    interfaceC37561ot.ADp(4, str2);
                }
                byte[] A01 = C48532Kv.A01(c48412Ki.A0C);
                if (A01 == null) {
                    interfaceC37561ot.ADj(5);
                } else {
                    interfaceC37561ot.ADc(5, A01);
                }
                byte[] A012 = C48532Kv.A01(c48412Ki.A0D);
                if (A012 == null) {
                    interfaceC37561ot.ADj(6);
                } else {
                    interfaceC37561ot.ADc(6, A012);
                }
                interfaceC37561ot.ADi(7, c48412Ki.A05);
                interfaceC37561ot.ADi(8, c48412Ki.A06);
                interfaceC37561ot.ADi(9, c48412Ki.A04);
                interfaceC37561ot.ADi(10, c48412Ki.A02);
                interfaceC37561ot.ADi(11, C2VW.A01(c48412Ki.A0F));
                interfaceC37561ot.ADi(12, c48412Ki.A03);
                interfaceC37561ot.ADi(13, c48412Ki.A07);
                interfaceC37561ot.ADi(14, c48412Ki.A08);
                interfaceC37561ot.ADi(15, c48412Ki.A0A);
                interfaceC37561ot.ADi(16, c48412Ki.A0J ? 1L : 0L);
                interfaceC37561ot.ADi(17, C2VW.A03(c48412Ki.A0G));
                interfaceC37561ot.ADi(18, c48412Ki.A01);
                interfaceC37561ot.ADi(19, c48412Ki.A0K);
                interfaceC37561ot.ADi(20, c48412Ki.A09);
                interfaceC37561ot.ADi(21, c48412Ki.A00);
                interfaceC37561ot.ADi(22, c48412Ki.A0L);
                C48562Ky c48562Ky = c48412Ki.A0B;
                if (c48562Ky != null) {
                    interfaceC37561ot.ADi(23, C2VW.A02(c48562Ky.A02));
                    interfaceC37561ot.ADi(24, c48562Ky.A05 ? 1L : 0L);
                    interfaceC37561ot.ADi(25, c48562Ky.A06 ? 1L : 0L);
                    interfaceC37561ot.ADi(26, c48562Ky.A04 ? 1L : 0L);
                    interfaceC37561ot.ADi(27, c48562Ky.A07 ? 1L : 0L);
                    interfaceC37561ot.ADi(28, c48562Ky.A01);
                    interfaceC37561ot.ADi(29, c48562Ky.A00);
                    interfaceC37561ot.ADc(30, C2VW.A09(c48562Ky.A03));
                } else {
                    interfaceC37561ot.ADj(23);
                    interfaceC37561ot.ADj(24);
                    interfaceC37561ot.ADj(25);
                    interfaceC37561ot.ADj(26);
                    interfaceC37561ot.ADj(27);
                    interfaceC37561ot.ADj(28);
                    interfaceC37561ot.ADj(29);
                    interfaceC37561ot.ADj(30);
                }
                interfaceC37561ot.ADp(31, str);
            }
        };
        this.A08 = new AbstractC29601bb(__db) { // from class: X.2TI
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.A0G = new AbstractC29601bb(__db) { // from class: X.2TJ
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET state=? WHERE id=?";
            }
        };
        this.A07 = new AbstractC29601bb(__db) { // from class: X.2TK
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            }
        };
        this.A03 = new AbstractC29601bb(__db) { // from class: X.2TL
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            }
        };
        this.A0F = new AbstractC29601bb(__db) { // from class: X.2TM
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.A0D = new AbstractC29601bb(__db) { // from class: X.2TO
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            }
        };
        this.A04 = new AbstractC29601bb(__db) { // from class: X.2TP
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.A06 = new AbstractC29601bb(__db) { // from class: X.2TR
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.A0E = new AbstractC29601bb(__db) { // from class: X.2TS
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            }
        };
        this.A0C = new AbstractC29601bb(__db) { // from class: X.2TT
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            }
        };
        this.A0A = new AbstractC29601bb(__db) { // from class: X.2TU
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.A05 = new AbstractC29601bb(__db) { // from class: X.2TV
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.A0B = new AbstractC29601bb(__db) { // from class: X.2TW
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
        this.A09 = new AbstractC29601bb(__db) { // from class: X.2TX
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            }
        };
        this.A0H = new AbstractC29601bb(__db) { // from class: X.2TY
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            }
        };
    }

    public static void A00(C2TF c2tf, HashMap hashMap) {
        byte[] blob;
        int i;
        java.util.Set<String> keySet = hashMap.keySet();
        if (!keySet.isEmpty()) {
            if (hashMap.size() > 999) {
                HashMap hashMap2 = new HashMap(999);
                loop0: while (true) {
                    i = 0;
                    for (Object obj : keySet) {
                        hashMap2.put(obj, hashMap.get(obj));
                        i++;
                        if (i == 999) {
                            break;
                        }
                    }
                    A00(c2tf, hashMap2);
                    hashMap2 = new HashMap(999);
                }
                if (i > 0) {
                    A00(c2tf, hashMap2);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            AbstractC73723Sa.A00(sb, size);
            sb.append(")");
            String obj2 = sb.toString();
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00(obj2, size);
            int i2 = 1;
            for (String str : keySet) {
                if (str == null) {
                    A00.ADj(i2);
                } else {
                    A00.ADp(i2, str);
                }
                i2++;
            }
            Cursor A002 = C3EP.A00(c2tf.A02, A00, false);
            try {
                int A003 = AbstractC37601ox.A00(A002, "work_spec_id");
                if (A003 != -1) {
                    while (A002.moveToNext()) {
                        ArrayList arrayList = (ArrayList) hashMap.get(A002.getString(A003));
                        if (arrayList != null) {
                            if (A002.isNull(0)) {
                                blob = null;
                            } else {
                                blob = A002.getBlob(0);
                            }
                            arrayList.add(C48532Kv.A00(blob));
                        }
                    }
                }
            } finally {
                A002.close();
            }
        }
    }

    public static void A01(C2TF c2tf, HashMap hashMap) {
        String string;
        int i;
        java.util.Set<String> keySet = hashMap.keySet();
        if (!keySet.isEmpty()) {
            if (hashMap.size() > 999) {
                HashMap hashMap2 = new HashMap(999);
                loop0: while (true) {
                    i = 0;
                    for (Object obj : keySet) {
                        hashMap2.put(obj, hashMap.get(obj));
                        i++;
                        if (i == 999) {
                            break;
                        }
                    }
                    A01(c2tf, hashMap2);
                    hashMap2 = new HashMap(999);
                }
                if (i > 0) {
                    A01(c2tf, hashMap2);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            AbstractC73723Sa.A00(sb, size);
            sb.append(")");
            String obj2 = sb.toString();
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00(obj2, size);
            int i2 = 1;
            for (String str : keySet) {
                if (str == null) {
                    A00.ADj(i2);
                } else {
                    A00.ADp(i2, str);
                }
                i2++;
            }
            Cursor A002 = C3EP.A00(c2tf.A02, A00, false);
            try {
                int A003 = AbstractC37601ox.A00(A002, "work_spec_id");
                if (A003 != -1) {
                    while (A002.moveToNext()) {
                        ArrayList arrayList = (ArrayList) hashMap.get(A002.getString(A003));
                        if (arrayList != null) {
                            if (A002.isNull(0)) {
                                string = null;
                            } else {
                                string = A002.getString(0);
                            }
                            arrayList.add(string);
                        }
                    }
                }
            } finally {
                A002.close();
            }
        }
    }
}
