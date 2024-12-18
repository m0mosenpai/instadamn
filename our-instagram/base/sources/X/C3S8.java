package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.model.Example;
import com.facebook.odin.model.ExampleContext;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.FeatureData$$serializer;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.3S8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3S8 implements C3S9 {
    public final C0JM A00;
    public final C3RU A01;
    public final C3S0 A02;

    public C3S8(C0JM c0jm, C3S0 c3s0, C3RU c3ru) {
        C14360o3.A0B(c3s0, 1);
        C14360o3.A0B(c3ru, 2);
        C14360o3.A0B(c0jm, 3);
        this.A02 = c3s0;
        this.A01 = c3ru;
        this.A00 = c0jm;
    }

    @Override // X.C3S9
    public final List Aay() {
        ExampleContext exampleContext;
        C3S0 c3s0 = this.A02;
        C3RU c3ru = this.A01;
        String CDV = c3ru.CDV();
        String CDY = c3ru.CDY();
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("\n        SELECT * FROM examples\n        WHERE use_case = ?\n        AND use_case_version = ?\n        ", 2);
        A00.ADp(1, CDV);
        A00.ADp(2, CDY);
        C1YP c1yp = c3s0.A01;
        c1yp.assertNotSuspendingTransaction();
        Cursor query = c1yp.query(A00, (CancellationSignal) null);
        try {
            int A01 = AbstractC37601ox.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A012 = AbstractC37601ox.A01(query, "example_id");
            int A013 = AbstractC37601ox.A01(query, "use_case");
            int A014 = AbstractC37601ox.A01(query, "use_case_version");
            int A015 = AbstractC37601ox.A01(query, "model_version");
            int A016 = AbstractC37601ox.A01(query, "label");
            int A017 = AbstractC37601ox.A01(query, "features");
            int A018 = AbstractC37601ox.A01(query, "timestamp");
            int A019 = AbstractC37601ox.A01(query, "label_timestamp");
            int A0110 = AbstractC37601ox.A01(query, "context");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i = query.getInt(A01);
                String string = query.getString(A012);
                String string2 = query.getString(A013);
                String string3 = query.getString(A014);
                long j = query.getLong(A015);
                long j2 = query.getLong(A016);
                arrayList.add(new C4DI(string, string2, string3, query.getString(A017), query.getString(A0110), i, j, j2, query.getLong(A018), query.getLong(A019)));
            }
            query.close();
            A00.A00();
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C4DI c4di = (C4DI) it.next();
                String str = c4di.A06;
                String str2 = c4di.A05;
                if (str2.length() == 0) {
                    exampleContext = ExampleContext.A05;
                } else {
                    exampleContext = new ExampleContext(null, str2, 30);
                }
                C73773Sh c73773Sh = AbstractC73763Sg.A03;
                String str3 = c4di.A07;
                C3RD c3rd = C3RD.A01;
                C3R9[] c3r9Arr = FeatureData.A0E;
                HashMap hashMap = (HashMap) c73773Sh.A00(str3, new C73863Sv(c3rd, FeatureData$$serializer.INSTANCE));
                long j3 = c4di.A00;
                Type type = Type.A09;
                hashMap.put("2474", new FeatureData(type, "2474", null, null, 0.0d, 16376, j3));
                hashMap.put("100001", new FeatureData(type, "100001", null, null, 0.0d, 16376, c4di.A03));
                hashMap.put("100002", new FeatureData(type, "100002", null, null, 0.0d, 16376, c4di.A01));
                arrayList2.add(new Example(exampleContext, str, hashMap));
            }
            return arrayList2;
        } catch (Throwable th) {
            query.close();
            A00.A00();
            throw th;
        }
    }

    @Override // X.C3S9
    public final void EEt() {
        C3S0 c3s0 = this.A02;
        C3RU c3ru = this.A01;
        String CDV = c3ru.CDV();
        String CDY = c3ru.CDY();
        C1YP c1yp = c3s0.A01;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = c3s0.A02;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADp(1, CDV);
        acquire.ADp(2, CDY);
        try {
            c1yp.beginTransaction();
            try {
                acquire.ATb();
                c1yp.setTransactionSuccessful();
            } finally {
                c1yp.endTransaction();
            }
        } finally {
            abstractC29601bb.release(acquire);
        }
    }

    @Override // X.C3S9
    public final void Eos(List list) {
        C3S0 c3s0 = this.A02;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Example example = (Example) it.next();
            String str = example.A01;
            C3RU c3ru = this.A01;
            String CDV = c3ru.CDV();
            String CDY = c3ru.CDY();
            long BUS = c3ru.BUS();
            C73773Sh c73773Sh = AbstractC73763Sg.A03;
            HashMap hashMap = example.A02;
            C3RD c3rd = C3RD.A01;
            C3R9[] c3r9Arr = FeatureData.A0E;
            arrayList.add(new C4DI(str, CDV, CDY, c73773Sh.A02(hashMap, new C73863Sv(c3rd, FeatureData$$serializer.INSTANCE)), example.A00.A01, 0, BUS, -1L, this.A00.now(), 0L));
        }
        C1YP c1yp = c3s0.A01;
        c1yp.assertNotSuspendingTransaction();
        c1yp.beginTransaction();
        try {
            c3s0.A00.insert((Iterable) arrayList);
            c1yp.setTransactionSuccessful();
        } finally {
            c1yp.endTransaction();
        }
    }
}
