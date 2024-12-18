package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.Jey, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44133Jey extends AbstractRunnableC14200nk {
    public final /* synthetic */ C44125Jep A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44133Jey(C44125Jep c44125Jep, boolean z) {
        super(1927605572, 3, false, true);
        this.A01 = z;
        this.A00 = c44125Jep;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C37581ov A00;
        Cursor query;
        int i;
        ArrayList arrayList;
        String string;
        String string2;
        String string3;
        String string4;
        try {
            C44131Jew c44131Jew = C44131Jew.A00;
            C44132Jex c44132Jex = C44132Jex.A00;
            List<AbstractC46402KgO> A1Q = AbstractC16960so.A1Q(c44131Jew, c44132Jex);
            C44125Jep c44125Jep = this.A00;
            for (AbstractC46402KgO abstractC46402KgO : A1Q) {
                if (C14360o3.A0K(abstractC46402KgO, c44132Jex)) {
                    C72110XOg A002 = c44125Jep.A05.A00();
                    TreeMap treeMap = C37581ov.A08;
                    A00 = AbstractC37591ow.A00("SELECT * FROM bff_ranked_user_model", 0);
                    C1YP c1yp = A002.A01;
                    c1yp.assertNotSuspendingTransaction();
                    query = c1yp.query(A00, (CancellationSignal) null);
                    try {
                        int A01 = AbstractC37601ox.A01(query, "igid");
                        int A012 = AbstractC37601ox.A01(query, "entity_type");
                        int A013 = AbstractC37601ox.A01(query, "score");
                        i = 8;
                        int A014 = AbstractC37601ox.A01(query, AbstractC37315GcH.A00(19, 8, 112));
                        int A015 = AbstractC37601ox.A01(query, "profile_picture_url");
                        arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            String string5 = query.getString(A01);
                            String string6 = query.getString(A012);
                            double d = query.getDouble(A013);
                            if (query.isNull(A014)) {
                                string3 = null;
                            } else {
                                string3 = query.getString(A014);
                            }
                            if (query.isNull(A015)) {
                                string4 = null;
                            } else {
                                string4 = query.getString(A015);
                            }
                            arrayList.add(new C72111XOh(new C50679MYx(string3, string4, 23), string5, string6, d));
                        }
                    } catch (Throwable th) {
                        query.close();
                        A00.A00();
                        throw th;
                    }
                } else if (C14360o3.A0K(abstractC46402KgO, c44131Jew)) {
                    C72108XOe A016 = c44125Jep.A05.A01();
                    TreeMap treeMap2 = C37581ov.A08;
                    A00 = AbstractC37591ow.A00("SELECT * FROM call_recipients_ranked_user_model", 0);
                    C1YP c1yp2 = A016.A01;
                    c1yp2.assertNotSuspendingTransaction();
                    query = c1yp2.query(A00, (CancellationSignal) null);
                    int A017 = AbstractC37601ox.A01(query, "igid");
                    int A018 = AbstractC37601ox.A01(query, "entity_type");
                    int A019 = AbstractC37601ox.A01(query, "score");
                    i = 8;
                    int A0110 = AbstractC37601ox.A01(query, AbstractC37315GcH.A00(19, 8, 112));
                    int A0111 = AbstractC37601ox.A01(query, "profile_picture_url");
                    arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        String string7 = query.getString(A017);
                        String string8 = query.getString(A018);
                        double d2 = query.getDouble(A019);
                        if (query.isNull(A0110)) {
                            string = null;
                        } else {
                            string = query.getString(A0110);
                        }
                        if (query.isNull(A0111)) {
                            string2 = null;
                        } else {
                            string2 = query.getString(A0111);
                        }
                        arrayList.add(new C72109XOf(new C50679MYx(string, string2, 23), string7, string8, d2));
                    }
                } else {
                    throw B4Z.A00();
                }
                query.close();
                A00.A00();
                AbstractC001800i.A0g(arrayList, new JUD(i));
                List A0d = AbstractC001800i.A0d(C44125Jep.A00(c44125Jep, arrayList), Math.min(100, arrayList.size()));
                c44125Jep.A07.put(abstractC46402KgO, A0d);
                c44125Jep.A02.accept(new C44134Jez(abstractC46402KgO, A0d));
            }
            if (this.A01) {
                C44125Jep.A01(c44125Jep);
            }
        } catch (SQLiteDiskIOException | SQLiteException e) {
            C18950wb.A01.AEp(AbstractC166997dE.A0y("Error retrieving Ranking Models: ", e), 20134288);
        }
    }
}
