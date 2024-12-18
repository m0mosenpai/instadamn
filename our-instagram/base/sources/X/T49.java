package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class T49 implements InterfaceC65676Tr6, InterfaceC65400TjX, InterfaceC65242TgY {
    public static final SOM A05 = new SOM("proto");
    public final InterfaceC65398TjV A00;
    public final S70 A01;
    public final InterfaceC65401TjY A02;
    public final InterfaceC65401TjY A03;
    public final XPP A04;

    public static Long A00(SQLiteDatabase sQLiteDatabase, AbstractC61582Rq6 abstractC61582Rq6) {
        Long valueOf;
        StringBuilder A0s = AbstractC58318PtA.A0s("backend_name = ? and priority = ?");
        C60639REy c60639REy = (C60639REy) abstractC61582Rq6;
        ArrayList A12 = AbstractC58319PtB.A12(new String[]{c60639REy.A01, String.valueOf(AbstractC62859SUg.A00(c60639REy.A00))});
        byte[] bArr = c60639REy.A02;
        if (bArr != null) {
            A0s.append(" and extras = ?");
            A12.add(Base64.encodeToString(bArr, 0));
        } else {
            A0s.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, A0s.toString(), (String[]) A12.toArray(new String[0]), null, null, null);
        try {
            if (query.moveToNext()) {
                valueOf = Long.valueOf(query.getLong(0));
            } else {
                valueOf = null;
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String A01(Iterable iterable) {
        StringBuilder A0s = AbstractC58318PtA.A0s("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A0s.append(((RF3) ((AbstractC61294RlE) it.next())).A00);
            if (it.hasNext()) {
                A0s.append(',');
            }
        }
        return AbstractC167017dG.A0p(A0s);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, T49 t49) {
        InterfaceC65401TjY interfaceC65401TjY = t49.A02;
        long C8K = interfaceC65401TjY.C8K();
        while (true) {
            try {
                C0fW.A01(sQLiteDatabase, -1888240604);
                return;
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC65401TjY.C8K() >= ((RF2) t49.A01).A00 + C8K) {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase A03() {
        XPP xpp = this.A04;
        xpp.getClass();
        InterfaceC65401TjY interfaceC65401TjY = this.A02;
        long C8K = interfaceC65401TjY.C8K();
        while (true) {
            try {
                return xpp.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC65401TjY.C8K() >= ((RF2) this.A01).A00 + C8K) {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A04.close();
    }

    public T49(InterfaceC65398TjV interfaceC65398TjV, S70 s70, XPP xpp, InterfaceC65401TjY interfaceC65401TjY, InterfaceC65401TjY interfaceC65401TjY2) {
        this.A04 = xpp;
        this.A03 = interfaceC65401TjY;
        this.A02 = interfaceC65401TjY2;
        this.A01 = s70;
        this.A00 = interfaceC65398TjV;
    }

    @Override // X.InterfaceC65400TjX
    public final void ECW(Rj4 rj4, String str, long j) {
        int i;
        SQLiteDatabase A03 = A03();
        C0fW.A01(A03, -1684447961);
        try {
            int i2 = rj4.A00;
            String num = Integer.toString(i2);
            Cursor rawQuery = A03.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
            try {
                boolean A1O = AbstractC167007dF.A1O(rawQuery.getCount());
                rawQuery.close();
                if (!A1O) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str);
                    contentValues.put("reason", Integer.valueOf(i2));
                    contentValues.put("events_dropped_count", Long.valueOf(j));
                    C0fW.A00(-1871575072);
                    A03.insert("log_event_dropped", null, contentValues);
                    i = 1157403685;
                } else {
                    C0fW.A00(-776868755);
                    A03.execSQL(AnonymousClass001.A0e("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?", j), new String[]{str, num});
                    i = -195764110;
                }
                C0fW.A00(i);
                A03.setTransactionSuccessful();
                C0fW.A03(A03, 1571926387);
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        } catch (Throwable th2) {
            C0fW.A03(A03, -1029534431);
            throw th2;
        }
    }

    @Override // X.InterfaceC65676Tr6
    public final void ECZ(AbstractC61582Rq6 abstractC61582Rq6, long j) {
        SQLiteDatabase A03 = A03();
        C0fW.A01(A03, -1684447961);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("next_request_ms", Long.valueOf(j));
            C60639REy c60639REy = (C60639REy) abstractC61582Rq6;
            String str = c60639REy.A01;
            EnumC61103RfI enumC61103RfI = c60639REy.A00;
            if (A03.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC62859SUg.A00(enumC61103RfI))}) < 1) {
                contentValues.put("backend_name", str);
                contentValues.put("priority", Integer.valueOf(AbstractC62859SUg.A00(enumC61103RfI)));
                C0fW.A00(498492685);
                A03.insert("transport_contexts", null, contentValues);
                C0fW.A00(1077678408);
            }
            A03.setTransactionSuccessful();
            C0fW.A03(A03, 1571926387);
        } catch (Throwable th) {
            C0fW.A03(A03, -1029534431);
            throw th;
        }
    }
}
