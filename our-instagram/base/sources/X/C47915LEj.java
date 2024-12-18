package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: X.LEj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47915LEj {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;
    public final AbstractC29601bb A03;

    public C47915LEj(C1YP c1yp) {
        this.A01 = c1yp;
        this.A00 = new C43906JbH(c1yp, this, 7);
        this.A02 = new C44083Je8(c1yp, this, 19);
        this.A03 = new C44083Je8(c1yp, this, 20);
    }

    public static void A00(C47915LEj c47915LEj, HashMap hashMap) {
        int i;
        java.util.Set keySet = hashMap.keySet();
        if (!keySet.isEmpty()) {
            if (hashMap.size() > 999) {
                HashMap hashMap2 = new HashMap(999);
                Iterator A0l = AbstractC167007dF.A0l(hashMap);
                loop0: while (true) {
                    i = 0;
                    while (A0l.hasNext()) {
                        Object A0l2 = AbstractC166997dE.A0l(A0l);
                        hashMap2.put(A0l2, hashMap.get(A0l2));
                        i++;
                        if (i == 999) {
                            break;
                        }
                    }
                    A00(c47915LEj, hashMap2);
                    hashMap2.clear();
                }
                if (i > 0) {
                    A00(c47915LEj, hashMap2);
                    return;
                }
                return;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("SELECT `id`,`medium_id`,`suggestion_id` FROM `suggestion_medium` WHERE `suggestion_id` IN (");
            int size = keySet.size();
            AbstractC73723Sa.A00(A1C, size);
            String A0x = AbstractC166997dE.A0x(")", A1C);
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00(A0x, size);
            Iterator it = keySet.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                A00.ADp(i2, AbstractC166987dD.A1B(it));
                i2++;
            }
            Cursor A002 = C3EP.A00(c47915LEj.A01, A00, false);
            try {
                int A003 = AbstractC37601ox.A00(A002, "suggestion_id");
                if (A003 != -1) {
                    while (A002.moveToNext()) {
                        ArrayList arrayList = (ArrayList) hashMap.get(A002.getString(A003));
                        if (arrayList != null) {
                            arrayList.add(new C47634L1t(A002.getLong(0), A002.getString(1), A002.getString(2)));
                        }
                    }
                }
            } finally {
                A002.close();
            }
        }
    }
}
