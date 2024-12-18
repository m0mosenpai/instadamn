package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase_Impl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.3EF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EF extends C3EH {
    public final /* synthetic */ C3EE A00;
    public final /* synthetic */ C2L1 A01;

    public C3EF(final C3EE val$workManager, final C2L1 val$querySpec) {
        this.A01 = val$querySpec;
        this.A00 = val$workManager;
    }

    @Override // X.C3EH
    public final /* bridge */ /* synthetic */ List A00() {
        C2MD c2md;
        String str;
        String str2;
        EnumC48482Kp A04;
        byte[] blob;
        C48532Kv A00;
        long j;
        long j2;
        long j3;
        int i;
        Integer A05;
        long j4;
        long j5;
        int i2;
        int i3;
        long j6;
        int i4;
        Integer A06;
        boolean z;
        boolean z2;
        boolean z3;
        long j7;
        byte[] blob2;
        LinkedHashSet A08;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.A01.A04;
        if (workDatabase_Impl.A00 != null) {
            c2md = workDatabase_Impl.A00;
        } else {
            synchronized (workDatabase_Impl) {
                if (workDatabase_Impl.A00 == null) {
                    workDatabase_Impl.A00 = new C3EN(workDatabase_Impl);
                }
                c2md = workDatabase_Impl.A00;
            }
        }
        C3EE c3ee = this.A00;
        C14360o3.A0B(c3ee, 0);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<EnumC48482Kp> list = c3ee.A01;
        String str3 = " AND";
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            for (EnumC48482Kp enumC48482Kp : list) {
                C14360o3.A0A(enumC48482Kp);
                arrayList2.add(Integer.valueOf(C2VW.A00(enumC48482Kp)));
            }
            sb.append(" WHERE state IN (");
            C3EO.A00(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str = " AND";
        } else {
            str = " WHERE";
        }
        List list2 = c3ee.A00;
        if (!list2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(it.next().toString());
            }
            sb.append(AnonymousClass001.A0R(str, " id IN ("));
            C3EO.A00(sb, list2.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str = " AND";
        }
        List list3 = c3ee.A02;
        if (!list3.isEmpty()) {
            sb.append(AnonymousClass001.A0R(str, " id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            C3EO.A00(sb, list3.size());
            sb.append("))");
            arrayList.addAll(list3);
        } else {
            str3 = str;
        }
        List list4 = c3ee.A03;
        if (!list4.isEmpty()) {
            sb.append(AnonymousClass001.A0R(str3, " id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            C3EO.A00(sb, list4.size());
            sb.append("))");
            arrayList.addAll(list4);
        }
        sb.append(";");
        String obj = sb.toString();
        C14360o3.A07(obj);
        C37491om c37491om = new C37491om(obj, arrayList.toArray(new Object[0]));
        C3EN c3en = (C3EN) c2md;
        C1YP c1yp = c3en.A00;
        c1yp.assertNotSuspendingTransaction();
        Cursor A002 = C3EP.A00(c1yp, c37491om, true);
        try {
            int A003 = AbstractC37601ox.A00(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A004 = AbstractC37601ox.A00(A002, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            int A005 = AbstractC37601ox.A00(A002, "output");
            int A006 = AbstractC37601ox.A00(A002, "initial_delay");
            int A007 = AbstractC37601ox.A00(A002, "interval_duration");
            int A008 = AbstractC37601ox.A00(A002, "flex_duration");
            int A009 = AbstractC37601ox.A00(A002, "run_attempt_count");
            int A0010 = AbstractC37601ox.A00(A002, "backoff_policy");
            int A0011 = AbstractC37601ox.A00(A002, "backoff_delay_duration");
            int A0012 = AbstractC37601ox.A00(A002, "last_enqueue_time");
            int A0013 = AbstractC37601ox.A00(A002, "period_count");
            int A0014 = AbstractC37601ox.A00(A002, "generation");
            int A0015 = AbstractC37601ox.A00(A002, "next_schedule_time_override");
            int A0016 = AbstractC37601ox.A00(A002, "stop_reason");
            int A0017 = AbstractC37601ox.A00(A002, "required_network_type");
            int A0018 = AbstractC37601ox.A00(A002, "requires_charging");
            int A0019 = AbstractC37601ox.A00(A002, "requires_device_idle");
            int A0020 = AbstractC37601ox.A00(A002, "requires_battery_not_low");
            int A0021 = AbstractC37601ox.A00(A002, "requires_storage_not_low");
            int A0022 = AbstractC37601ox.A00(A002, "trigger_content_update_delay");
            int A0023 = AbstractC37601ox.A00(A002, "trigger_max_content_delay");
            int A0024 = AbstractC37601ox.A00(A002, "content_uri_triggers");
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (A002.moveToNext()) {
                String string = A002.getString(A003);
                if (((ArrayList) hashMap.get(string)) == null) {
                    hashMap.put(string, new ArrayList());
                }
                String string2 = A002.getString(A003);
                if (((ArrayList) hashMap2.get(string2)) == null) {
                    hashMap2.put(string2, new ArrayList());
                }
            }
            A002.moveToPosition(-1);
            C3EN.A01(c3en, hashMap);
            C3EN.A00(c3en, hashMap2);
            ArrayList arrayList4 = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                if (A003 != -1 && !A002.isNull(A003)) {
                    str2 = A002.getString(A003);
                } else {
                    str2 = null;
                }
                if (A004 == -1) {
                    A04 = null;
                } else {
                    A04 = C2VW.A04(A002.getInt(A004));
                }
                if (A005 == -1) {
                    A00 = null;
                } else {
                    if (A002.isNull(A005)) {
                        blob = null;
                    } else {
                        blob = A002.getBlob(A005);
                    }
                    A00 = C48532Kv.A00(blob);
                }
                long j8 = 0;
                if (A006 == -1) {
                    j = 0;
                } else {
                    j = A002.getLong(A006);
                }
                if (A007 == -1) {
                    j2 = 0;
                } else {
                    j2 = A002.getLong(A007);
                }
                if (A008 == -1) {
                    j3 = 0;
                } else {
                    j3 = A002.getLong(A008);
                }
                boolean z4 = false;
                if (A009 == -1) {
                    i = 0;
                } else {
                    i = A002.getInt(A009);
                }
                if (A0010 == -1) {
                    A05 = null;
                } else {
                    A05 = C2VW.A05(A002.getInt(A0010));
                }
                if (A0011 == -1) {
                    j4 = 0;
                } else {
                    j4 = A002.getLong(A0011);
                }
                if (A0012 == -1) {
                    j5 = 0;
                } else {
                    j5 = A002.getLong(A0012);
                }
                if (A0013 == -1) {
                    i2 = 0;
                } else {
                    i2 = A002.getInt(A0013);
                }
                if (A0014 == -1) {
                    i3 = 0;
                } else {
                    i3 = A002.getInt(A0014);
                }
                if (A0015 == -1) {
                    j6 = 0;
                } else {
                    j6 = A002.getLong(A0015);
                }
                if (A0016 == -1) {
                    i4 = 0;
                } else {
                    i4 = A002.getInt(A0016);
                }
                if (A0017 == -1) {
                    A06 = null;
                } else {
                    A06 = C2VW.A06(A002.getInt(A0017));
                }
                if (A0018 == -1) {
                    z = false;
                } else {
                    z = false;
                    if (A002.getInt(A0018) != 0) {
                        z = true;
                    }
                }
                if (A0019 == -1) {
                    z2 = false;
                } else {
                    z2 = false;
                    if (A002.getInt(A0019) != 0) {
                        z2 = true;
                    }
                }
                if (A0020 == -1) {
                    z3 = false;
                } else {
                    z3 = false;
                    if (A002.getInt(A0020) != 0) {
                        z3 = true;
                    }
                }
                if (A0021 != -1 && A002.getInt(A0021) != 0) {
                    z4 = true;
                }
                if (A0022 == -1) {
                    j7 = 0;
                } else {
                    j7 = A002.getLong(A0022);
                }
                if (A0023 != -1) {
                    j8 = A002.getLong(A0023);
                }
                if (A0024 == -1) {
                    A08 = null;
                } else {
                    if (A002.isNull(A0024)) {
                        blob2 = null;
                    } else {
                        blob2 = A002.getBlob(A0024);
                    }
                    A08 = C2VW.A08(blob2);
                }
                C48562Ky c48562Ky = new C48562Ky(A06, A08, j7, j8, z, z2, z3, z4);
                ArrayList arrayList5 = (ArrayList) hashMap.get(A002.getString(A003));
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                ArrayList arrayList6 = (ArrayList) hashMap2.get(A002.getString(A003));
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList4.add(new SPQ(c48562Ky, A00, A04, A05, str2, arrayList5, arrayList6, i, i2, i3, i4, j, j2, j3, j4, j5, j6));
            }
            A002.close();
            return (List) C48412Ki.A0N.apply(arrayList4);
        } catch (Throwable th) {
            A002.close();
            throw th;
        }
    }
}
