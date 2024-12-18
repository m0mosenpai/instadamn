package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/* renamed from: X.3EN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EN implements C2MD {
    public final C1YP A00;

    public C3EN(C1YP __db) {
        this.A00 = __db;
    }

    public static void A00(C3EN c3en, HashMap hashMap) {
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
                    A00(c3en, hashMap2);
                    hashMap2 = new HashMap(999);
                }
                if (i > 0) {
                    A00(c3en, hashMap2);
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
            Cursor A002 = C3EP.A00(c3en.A00, A00, false);
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

    public static void A01(C3EN c3en, HashMap hashMap) {
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
                    A01(c3en, hashMap2);
                    hashMap2 = new HashMap(999);
                }
                if (i > 0) {
                    A01(c3en, hashMap2);
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
            Cursor A002 = C3EP.A00(c3en.A00, A00, false);
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
