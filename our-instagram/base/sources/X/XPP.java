package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class XPP extends SQLiteOpenHelper {
    public static final String A02 = AnonymousClass001.A0e("INSERT INTO global_log_event_state VALUES (", ")", System.currentTimeMillis());
    public static final InterfaceC73593YMt A03;
    public static final InterfaceC73593YMt A04;
    public static final InterfaceC73593YMt A05;
    public static final InterfaceC73593YMt A06;
    public static final InterfaceC73593YMt A07;
    public static final List A08;
    public boolean A00;
    public final int A01;

    public XPP(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.A00 = false;
        this.A01 = i;
    }

    public static void A00(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        int i4 = i;
        List list = A08;
        if (i2 > list.size()) {
            throw AbstractC166987dD.A12(AnonymousClass001.A0z("Migration from ", " to ", " was requested, but cannot be performed. Only ", " migrations are provided", i4, i2, list.size()));
        }
        while (i4 < i2) {
            switch (((YDQ) ((InterfaceC73593YMt) list.get(i4))).A00) {
                case 0:
                    C0fW.A00(872293847);
                    sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                    C0fW.A00(964444809);
                    C0fW.A00(-1679059122);
                    sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                    C0fW.A00(1888224200);
                    C0fW.A00(141164158);
                    sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                    C0fW.A00(-1482004662);
                    C0fW.A00(1766862321);
                    sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                    C0fW.A00(-1863147334);
                    C0fW.A00(1787604563);
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                    i3 = 293994338;
                    break;
                case 1:
                    C0fW.A00(-2002349610);
                    sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                    C0fW.A00(1053140000);
                    C0fW.A00(174688346);
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                    C0fW.A00(1721799102);
                    C0fW.A00(435458980);
                    sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                    i3 = -1863413454;
                    break;
                case 2:
                    C0fW.A00(-1382456598);
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                    i3 = -911584786;
                    break;
                case 3:
                    C0fW.A00(-323555290);
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                    C0fW.A00(121802160);
                    C0fW.A00(-947564199);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                    C0fW.A00(-742929006);
                    C0fW.A00(-1829333376);
                    sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                    i3 = -821582309;
                    break;
                default:
                    C0fW.A00(1927104977);
                    sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                    C0fW.A00(2112923525);
                    C0fW.A00(305138947);
                    sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                    C0fW.A00(1889578299);
                    String str = A02;
                    C0fW.A00(-1983275286);
                    sQLiteDatabase.execSQL(str);
                    i3 = -708043933;
                    break;
            }
            C0fW.A00(i3);
            i4++;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.A00 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    static {
        YDQ ydq = new YDQ(0);
        A03 = ydq;
        YDQ ydq2 = new YDQ(1);
        A04 = ydq2;
        YDQ ydq3 = new YDQ(2);
        A05 = ydq3;
        YDQ ydq4 = new YDQ(3);
        A06 = ydq4;
        YDQ ydq5 = new YDQ(4);
        A07 = ydq5;
        A08 = Arrays.asList(ydq, ydq2, ydq3, ydq4, ydq5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.A01;
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C0fW.A00(-28667001);
        sQLiteDatabase.execSQL("DROP TABLE events");
        C0fW.A00(-530818950);
        C0fW.A00(232898197);
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        C0fW.A00(1035748864);
        C0fW.A00(1646431583);
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        C0fW.A00(-807325544);
        C0fW.A00(-1421196070);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        C0fW.A00(-132062322);
        C0fW.A00(1944392383);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        C0fW.A00(-521031876);
        C0fW.A00(412213073);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        C0fW.A00(-1915604761);
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, 0, i2);
    }
}
