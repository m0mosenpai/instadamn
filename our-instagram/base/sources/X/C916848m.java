package X;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;

/* renamed from: X.48m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C916848m {
    public InterfaceC37481ol A00;
    public InterfaceC29101an A01;
    public final Context A02;
    public final C29051ai A03;
    public final InterfaceC28351Yw A04;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.1Yu] */
    public final synchronized InterfaceC37481ol A00(String str) {
        InterfaceC37481ol interfaceC37481ol;
        String str2;
        interfaceC37481ol = this.A00;
        if (interfaceC37481ol == null) {
            try {
                try {
                    interfaceC37481ol = this.A01.CHx();
                } catch (SQLiteException unused) {
                    InterfaceC29101an AL5 = this.A04.AL5(this.A03);
                    this.A01 = AL5;
                    AL5.EhP(false);
                    interfaceC37481ol = this.A01.CHx();
                }
            } catch (Exception e) {
                Exception exc = e;
                while (e.getCause() instanceof Exception) {
                    exc = (Exception) e.getCause();
                }
                if (e instanceof SQLiteException) {
                    if (e.getMessage().contains("PRAGMA journal_mode")) {
                        str2 = "getWritableDatabaseError_writeAheadLogging";
                    } else if (e instanceof SQLiteFullException) {
                        str2 = "getWritableDatabaseError_diskFull";
                    } else if (e instanceof SQLiteCantOpenDatabaseException) {
                        str2 = "getWritableDatabaseError_cantOpen";
                    } else if (e instanceof SQLiteDiskIOException) {
                        str2 = "getWritableDatabaseError_diskIO";
                    } else {
                        str2 = "getWritableDatabaseError_other_sqlite";
                    }
                } else {
                    str2 = "getWritableDatabaseError_other";
                }
                C0w9.A06(str2, str, exc);
                try {
                    this.A02.deleteDatabase(this.A03.A02);
                } catch (RuntimeException unused2) {
                }
                interfaceC37481ol = new Object().AL5(AbstractC28981ab.A00(this.A02, this.A03.A01, null, false, false)).CHx();
                this.A00 = interfaceC37481ol;
            }
        }
        return interfaceC37481ol;
    }

    public C916848m(Context context, C29051ai c29051ai, InterfaceC28351Yw interfaceC28351Yw) {
        this.A02 = context;
        this.A03 = c29051ai;
        this.A04 = interfaceC28351Yw;
        InterfaceC29101an AL5 = interfaceC28351Yw.AL5(c29051ai);
        this.A01 = AL5;
        AL5.EhP(true);
    }
}
