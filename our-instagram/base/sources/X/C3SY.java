package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.3SY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3SY implements C3SZ {
    public final C3SV A00;
    public final C0JM A01;

    public C3SY(C0JM c0jm, C3SV c3sv) {
        C14360o3.A0B(c3sv, 1);
        this.A00 = c3sv;
        this.A01 = c0jm;
    }

    @Override // X.C3SZ
    public final C3SN E8E(List list, int i) {
        Map A00 = A00(list, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(A00.size()));
        for (Map.Entry entry : A00.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Long l = ((C73753Sd) it.next()).A06;
                if (l != null) {
                    arrayList.add(l);
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        return new C3SN(linkedHashMap, null, true);
    }

    @Override // X.C3SZ
    public final void FEK(String str, long j, long j2) {
        long now = this.A01.now();
        List singletonList = Collections.singletonList(new C73753Sd(null, null, Long.valueOf(j), str, null, null, 0, 0, now, now + j2));
        C14360o3.A07(singletonList);
        try {
            if (!singletonList.isEmpty()) {
                C3SV c3sv = this.A00;
                C1YP c1yp = c3sv.A01;
                c1yp.assertNotSuspendingTransaction();
                c1yp.beginTransaction();
                try {
                    c3sv.A00.insert((Iterable) singletonList);
                    c1yp.setTransactionSuccessful();
                } finally {
                    c1yp.endTransaction();
                }
            }
        } catch (SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteReadOnlyDatabaseException | SQLiteException unused) {
        }
    }

    private final Map A00(List list, int i) {
        Integer valueOf;
        String string;
        Long valueOf2;
        Float valueOf3;
        String string2;
        int i2 = i;
        if (i <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        try {
            C3SV c3sv = this.A00;
            long now = this.A01.now();
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            sb.append("        SELECT * FROM signals");
            sb.append("\n");
            sb.append("        WHERE signal_id IN (");
            int size = list.size();
            AbstractC73723Sa.A00(sb, size);
            sb.append(")");
            sb.append("\n");
            sb.append("        AND expiration_timestamp > ");
            sb.append("?");
            sb.append("\n");
            sb.append("      ");
            String obj = sb.toString();
            int i3 = size + 1;
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00(obj, i3);
            Iterator it = list.iterator();
            int i4 = 1;
            while (it.hasNext()) {
                A00.ADp(i4, (String) it.next());
                i4++;
            }
            A00.ADi(i3, now);
            C1YP c1yp = c3sv.A01;
            c1yp.assertNotSuspendingTransaction();
            Cursor query = c1yp.query(A00, (CancellationSignal) null);
            try {
                int A01 = AbstractC37601ox.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                int A012 = AbstractC37601ox.A01(query, "signal_id");
                int A013 = AbstractC37601ox.A01(query, "timestamp");
                int A014 = AbstractC37601ox.A01(query, "signal_component_id");
                int A015 = AbstractC37601ox.A01(query, "context");
                int A016 = AbstractC37601ox.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                int A017 = AbstractC37601ox.A01(query, "long_value");
                int A018 = AbstractC37601ox.A01(query, "float_value");
                int A019 = AbstractC37601ox.A01(query, "text_value");
                int A0110 = AbstractC37601ox.A01(query, "expiration_timestamp");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    int i5 = query.getInt(A01);
                    String string3 = query.getString(A012);
                    long j = query.getLong(A013);
                    if (query.isNull(A014)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(query.getInt(A014));
                    }
                    if (query.isNull(A015)) {
                        string = null;
                    } else {
                        string = query.getString(A015);
                    }
                    int i6 = query.getInt(A016);
                    if (query.isNull(A017)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(query.getLong(A017));
                    }
                    if (query.isNull(A018)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Float.valueOf(query.getFloat(A018));
                    }
                    if (query.isNull(A019)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(A019);
                    }
                    arrayList.add(new C73753Sd(valueOf3, valueOf, valueOf2, string3, string, string2, i5, i6, j, query.getLong(A0110)));
                }
                query.close();
                A00.A00();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    String str = ((C73753Sd) next).A08;
                    Object obj2 = linkedHashMap.get(str);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(str, obj2);
                    }
                    ((List) obj2).add(next);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC16850sd.A0L(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), AbstractC001800i.A0h(AbstractC001800i.A0g((Iterable) entry.getValue(), new Comparator() { // from class: X.3Sf
                        @Override // java.util.Comparator
                        public final int compare(Object obj3, Object obj4) {
                            return C2BS.A00(Long.valueOf(((C73753Sd) obj3).A02), Long.valueOf(((C73753Sd) obj4).A02));
                        }
                    }), i2));
                }
                return linkedHashMap2;
            } catch (Throwable th) {
                query.close();
                A00.A00();
                throw th;
            }
        } catch (SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException unused) {
            return AbstractC06930Yk.A0E();
        }
    }

    @Override // X.C3SZ
    public final void CgV(int i) {
        Integer valueOf;
        String string;
        Long valueOf2;
        Float valueOf3;
        String string2;
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        try {
            C3SV c3sv = this.A00;
            C0JM c0jm = this.A01;
            c3sv.A00(c0jm.now());
            long now = c0jm.now();
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00("\n        SELECT * FROM signals\n        WHERE expiration_timestamp > ?\n      ", 1);
            A00.ADi(1, now);
            C1YP c1yp = c3sv.A01;
            c1yp.assertNotSuspendingTransaction();
            Cursor query = c1yp.query(A00, (CancellationSignal) null);
            try {
                int A01 = AbstractC37601ox.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                int A012 = AbstractC37601ox.A01(query, "signal_id");
                int A013 = AbstractC37601ox.A01(query, "timestamp");
                int A014 = AbstractC37601ox.A01(query, "signal_component_id");
                int A015 = AbstractC37601ox.A01(query, "context");
                int A016 = AbstractC37601ox.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                int A017 = AbstractC37601ox.A01(query, "long_value");
                int A018 = AbstractC37601ox.A01(query, "float_value");
                int A019 = AbstractC37601ox.A01(query, "text_value");
                int A0110 = AbstractC37601ox.A01(query, "expiration_timestamp");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    int i2 = query.getInt(A01);
                    String string3 = query.getString(A012);
                    long j = query.getLong(A013);
                    if (query.isNull(A014)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(query.getInt(A014));
                    }
                    if (query.isNull(A015)) {
                        string = null;
                    } else {
                        string = query.getString(A015);
                    }
                    int i3 = query.getInt(A016);
                    if (query.isNull(A017)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(query.getLong(A017));
                    }
                    if (query.isNull(A018)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Float.valueOf(query.getFloat(A018));
                    }
                    if (query.isNull(A019)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(A019);
                    }
                    arrayList.add(new C73753Sd(valueOf3, valueOf, valueOf2, string3, string, string2, i2, i3, j, query.getLong(A0110)));
                }
                query.close();
                A00.A00();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String str = ((C73753Sd) next).A08;
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(str, obj);
                    }
                    ((List) obj).add(next);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC16850sd.A0L(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    List A0g = AbstractC001800i.A0g((Iterable) entry.getValue(), new Comparator() { // from class: X.94i
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return C2BS.A00(Long.valueOf(((C73753Sd) obj2).A02), Long.valueOf(((C73753Sd) obj3).A02));
                        }
                    });
                    C14360o3.A0B(A0g, 0);
                    int size = A0g.size() - i;
                    if (size < 0) {
                        size = 0;
                    }
                    linkedHashMap2.put(key, AbstractC001800i.A0d(A0g, size));
                }
                ArrayList A1F = AbstractC06950Ym.A1F(linkedHashMap2.values());
                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A1F, 10));
                Iterator it2 = A1F.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((C73753Sd) it2.next()).A00));
                }
                AbstractC001800i.A0s(arrayList2, new C206999Ee(this, 21), 500);
            } catch (Throwable th) {
                query.close();
                A00.A00();
                throw th;
            }
        } catch (SQLiteDiskIOException | SQLiteException unused) {
        }
    }

    @Override // X.C3SZ
    public final void EEz() {
        this.A00.A00(Long.MAX_VALUE);
    }

    @Override // X.C3SZ
    public final C3SN E8D(String str, int i) {
        ArrayList arrayList;
        List singletonList = Collections.singletonList(str);
        C14360o3.A07(singletonList);
        List list = (List) A00(singletonList, i).get(str);
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Long l = ((C73753Sd) it.next()).A06;
                if (l != null) {
                    arrayList.add(l);
                }
            }
        } else {
            arrayList = new ArrayList();
        }
        return new C3SN(arrayList, null, true);
    }
}
