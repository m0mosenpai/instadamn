package X;

import android.content.Context;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2Qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49682Qb extends SQLiteOpenHelper implements InterfaceC12870lZ {
    public static C49682Qb A04;
    public static boolean A05;
    public static final C49692Qc A06 = new Object();
    public static final AtomicBoolean A07 = new AtomicBoolean(false);
    public SQLiteDatabase A00;
    public C46912Df A01;
    public final Context A02;
    public final String A03;

    public final synchronized SQLiteDatabase A00() {
        return this.A00;
    }

    public final synchronized SQLiteDatabase A01() {
        return A02(null);
    }

    public final synchronized SQLiteDatabase A02(C46912Df c46912Df) {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = this.A00;
        boolean z = true;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            z = false;
        }
        if (!z) {
            try {
                this.A01 = c46912Df;
                this.A00 = getWritableDatabase();
            } catch (Exception e) {
                this.A01 = null;
                A06.A02(e);
                this.A02.deleteDatabase("direct.db");
            }
            sQLiteDatabase = this.A00;
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.A00 = null;
    }

    @Override // X.InterfaceC12870lZ
    public final synchronized void onAppBackgrounded() {
        int A03 = C0f9.A03(1181997287);
        if (A05) {
            A06.A01();
        }
        C0f9.A0A(-100251748, A03);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C14360o3.A0B(sQLiteDatabase, 0);
        if (!sQLiteDatabase.isReadOnly() && A07.get()) {
            sQLiteDatabase.enableWriteAheadLogging();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C14360o3.A0B(sQLiteDatabase, 0);
        C0fW.A00(-1348273174);
        sQLiteDatabase.execSQL("create table if not exists threads(_id integer primary key autoincrement, user_id text, thread_id text, recipient_ids text, last_activity_time integer, is_permitted integer, thread_info text not null);");
        C0fW.A00(-1428541849);
        C0fW.A00(-1133543099);
        sQLiteDatabase.execSQL("create table if not exists messages(_id integer primary key autoincrement, user_id text, server_item_id text, client_item_id text, thread_id text, recipient_ids text, timestamp integer not null, message_type text not null, text text, message text not null);");
        C0fW.A00(2017532348);
        C0fW.A00(803384943);
        sQLiteDatabase.execSQL("CREATE INDEX threadId ON messages (thread_id);");
        C0fW.A00(-1636477035);
        C0fW.A00(-2140080552);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS session(user_id TEXT PRIMARY KEY, value TEXT NOT NULL);");
        C0fW.A00(-1356570048);
        C0fW.A00(-98986391);
        sQLiteDatabase.execSQL("create table if not exists mutations(_id integer primary key autoincrement, user_id text, mutation_type text not null, mutation text not null);");
        C0fW.A00(581667085);
        C0fW.A00(-10960123);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS db_created_config(user_id TEXT PRIMARY KEY, value TEXT NOT NULL);");
        C0fW.A00(-138178312);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized void onOpen(SQLiteDatabase sQLiteDatabase) {
        C18240vB c18240vB;
        AbstractRunnableC14200nk c27090BxF;
        C14360o3.A0B(sQLiteDatabase, 0);
        C46912Df c46912Df = this.A01;
        if (c46912Df != null) {
            String str = this.A03;
            C14360o3.A0B(str, 1);
            UserSession userSession = c46912Df.A00;
            if (C18U.A06(C06090Tz.A05, userSession, 36324703085801888L)) {
                C18920wW A02 = AbstractC12220kQ.A02(userSession);
                InterfaceC02590Ai A00 = A02.A00(A02.A00, "ig_direct_db_bootstrap");
                if (A00.isSampled()) {
                    A00.AAP("db_name", str);
                    A00.Cht();
                }
                if (!c46912Df.A01.getBoolean(c46912Df.A02, false)) {
                    C0o0 A002 = AbstractC14350nz.A00();
                    A002.A01 = C28741aC.class.toString();
                    c18240vB = new C18240vB(A002);
                    c27090BxF = new C27088BxD(c46912Df);
                } else {
                    C0o0 A003 = AbstractC14350nz.A00();
                    A003.A01 = C28741aC.class.toString();
                    c18240vB = new C18240vB(A003);
                    c27090BxF = new C27090BxF(c46912Df, str);
                }
                c18240vB.ATO(c27090BxF);
            }
            this.A01 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d1, code lost:
    
        if (r4 < 8) goto L5;
     */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
        /*
            r2 = this;
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            r0 = 7
            if (r4 >= r0) goto Lcf
            r0 = 1735665718(0x67742836, float:1.1529992E24)
            X.C0fW.A00(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS threads;"
            r3.execSQL(r0)
            r0 = -2019806101(0xffffffff879c346b, float:-2.350308E-34)
            X.C0fW.A00(r0)
            r0 = 557346523(0x21386edb, float:6.248834E-19)
            X.C0fW.A00(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS messages;"
            r3.execSQL(r0)
            r0 = -860737649(0xffffffffccb22f8f, float:-9.3420664E7)
            X.C0fW.A00(r0)
            r0 = -1970713293(0xffffffff8a894d33, float:-1.3221659E-32)
            X.C0fW.A00(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS threadId;"
            r3.execSQL(r0)
            r0 = 2099882097(0x7d29a871, float:1.4094633E37)
            X.C0fW.A00(r0)
            r0 = 629462690(0x2584d6a2, float:2.304379E-16)
            X.C0fW.A00(r0)
            java.lang.String r0 = "create table if not exists threads(_id integer primary key autoincrement, user_id text, thread_id text, recipient_ids text, last_activity_time integer, is_permitted integer, thread_info text not null);"
            r3.execSQL(r0)
            r0 = -870464356(0xffffffffcc1dc49c, float:-4.1357936E7)
            X.C0fW.A00(r0)
            r0 = -1928069019(0xffffffff8d140065, float:-4.5606496E-31)
            X.C0fW.A00(r0)
            java.lang.String r0 = "create table if not exists messages(_id integer primary key autoincrement, user_id text, server_item_id text, client_item_id text, thread_id text, recipient_ids text, timestamp integer not null, message_type text not null, text text, message text not null);"
            r3.execSQL(r0)
            r0 = 1365102856(0x515dd108, float:5.954342E10)
            X.C0fW.A00(r0)
            r0 = -9757173(0xffffffffff6b1e0b, float:-3.1252457E38)
            X.C0fW.A00(r0)
            java.lang.String r0 = "CREATE INDEX threadId ON messages (thread_id);"
            r3.execSQL(r0)
            r0 = -1714460543(0xffffffff99cf6881, float:-2.1445507E-23)
            X.C0fW.A00(r0)
        L6f:
            r0 = -267474134(0xfffffffff00eab2a, float:-1.7661518E29)
            X.C0fW.A00(r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS session(user_id TEXT PRIMARY KEY, value TEXT NOT NULL);"
            r3.execSQL(r0)
            r0 = -22550742(0xfffffffffea7e72a, float:-1.1159067E38)
            X.C0fW.A00(r0)
        L80:
            java.lang.String r1 = "create table if not exists mutations(_id integer primary key autoincrement, user_id text, mutation_type text not null, mutation text not null);"
            r0 = 9
            if (r4 >= r0) goto Lb7
            r0 = 1907492870(0x71b20806, float:1.763137E30)
            X.C0fW.A00(r0)
            r3.execSQL(r1)
            r0 = 180675688(0xac4e468, float:1.896003E-32)
        L93:
            X.C0fW.A00(r0)
            r0 = 1852103091(0x6e64d9b3, float:1.7706441E28)
            X.C0fW.A00(r0)
            r3.execSQL(r1)
            r0 = 79770991(0x4c1356f, float:4.5423153E-36)
            X.C0fW.A00(r0)
        La5:
            r0 = -807832944(0xffffffffcfd97290, float:-7.2963277E9)
            X.C0fW.A00(r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS db_created_config(user_id TEXT PRIMARY KEY, value TEXT NOT NULL);"
            r3.execSQL(r0)
            r0 = -1774975507(0xffffffff963405ed, float:-1.4542154E-25)
            X.C0fW.A00(r0)
        Lb6:
            return
        Lb7:
            r0 = 10
            if (r4 >= r0) goto Lca
            r0 = 1948444161(0x7422e601, float:5.162458E31)
            X.C0fW.A00(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS mutations;"
            r3.execSQL(r0)
            r0 = -594743783(0xffffffffdc8cee19, float:-3.173463E17)
            goto L93
        Lca:
            r0 = 11
            if (r4 >= r0) goto Lb6
            goto La5
        Lcf:
            r0 = 8
            if (r4 >= r0) goto L80
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49682Qb.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public C49682Qb(Context context) {
        super(context, "direct.db", null, 11, new DefaultDatabaseErrorHandler());
        this.A02 = context;
        this.A03 = "direct.db";
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-158857705);
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.3Jl
            @Override // java.lang.Runnable
            public final void run() {
                C49682Qb c49682Qb = C49682Qb.A04;
                if (c49682Qb != null) {
                    c49682Qb.A01();
                }
            }
        });
        C0f9.A0A(-789636910, A03);
    }
}
