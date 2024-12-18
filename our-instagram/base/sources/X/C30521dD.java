package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1dD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30521dD extends SQLiteOpenHelper {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final C30491d9 A03;
    public final boolean A04;
    public final AbstractC28901aT A05;
    public final C30731dc A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C30521dD(android.content.Context r9, final X.AbstractC28901aT r10, final X.C30491d9 r11, java.lang.String r12, boolean r13) {
        /*
            r8 = this;
            r4 = r12
            int r6 = r10.A00
            X.1dO r7 = new X.1dO
            r7.<init>()
            r5 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A02 = r9
            r8.A03 = r11
            r8.A05 = r10
            r8.A04 = r13
            if (r12 != 0) goto L23
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            X.C14360o3.A07(r4)
        L23:
            java.io.File r1 = r9.getCacheDir()
            X.1dc r0 = new X.1dc
            r0.<init>(r1, r4)
            r8.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30521dD.<init>(android.content.Context, X.1aT, X.1d9, java.lang.String, boolean):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C14360o3.A0B(sQLiteDatabase, 0);
        if (!this.A01 && this.A05.A00 != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            this.A05.A02(AbstractC37461oj.A00(sQLiteDatabase, this.A03));
        } catch (Throwable th) {
            throw new AnonymousClass402(C05F.A00, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C14360o3.A0B(sQLiteDatabase, 0);
        try {
            this.A05.A04(AbstractC37461oj.A00(sQLiteDatabase, this.A03));
        } catch (Throwable th) {
            throw new AnonymousClass402(C05F.A01, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C14360o3.A0B(sQLiteDatabase, 0);
        this.A01 = true;
        try {
            this.A05.A05(AbstractC37461oj.A00(sQLiteDatabase, this.A03), i, i2);
        } catch (Throwable th) {
            throw new AnonymousClass402(C05F.A0N, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C14360o3.A0B(sQLiteDatabase, 0);
        if (!this.A01) {
            try {
                this.A05.A03(AbstractC37461oj.A00(sQLiteDatabase, this.A03));
            } catch (Throwable th) {
                throw new AnonymousClass402(C05F.A0Y, th);
            }
        }
        this.A00 = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C14360o3.A0B(sQLiteDatabase, 0);
        this.A01 = true;
        try {
            this.A05.A06(AbstractC37461oj.A00(sQLiteDatabase, this.A03), i, i2);
        } catch (Throwable th) {
            throw new AnonymousClass402(C05F.A0C, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (getDatabaseName() == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC37481ol A00() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30521dD.A00():X.1ol");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            C30731dc c30731dc = this.A06;
            Lock lock = c30731dc.A02;
            lock.lock();
            super.close();
            this.A03.A00 = null;
            this.A00 = false;
            try {
                FileChannel fileChannel = c30731dc.A00;
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } catch (IOException unused) {
            }
            lock.unlock();
        } catch (Throwable th) {
            C30731dc c30731dc2 = this.A06;
            try {
                FileChannel fileChannel2 = c30731dc2.A00;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (IOException unused2) {
            }
            c30731dc2.A02.unlock();
            throw th;
        }
    }
}
