package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabase;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.2RB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2RB implements InterfaceC13050lr {
    public final UserSession A00;
    public final Object A01;

    public C2RB(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = new Object();
        this.A00 = userSession;
    }

    public final int A03(String str) {
        C49682Qb A00;
        SQLiteDatabase A002;
        C14360o3.A0B(str, 0);
        C49692Qc c49692Qc = C49682Qb.A06;
        if (c49692Qc.A03() || (A00 = c49692Qc.A00()) == null || (A002 = A00.A00()) == null) {
            return -1;
        }
        return A002.delete(A0F(), str, null);
    }

    public final ArrayList A05(String str) {
        C14360o3.A0B(str, 0);
        ArrayList arrayList = new ArrayList();
        C49692Qc c49692Qc = C49682Qb.A06;
        if (!c49692Qc.A03()) {
            boolean z = true;
            String[] strArr = {A0E()};
            Cursor cursor = null;
            C49682Qb A00 = c49692Qc.A00();
            if (A00 != null) {
                SQLiteDatabase A002 = A00.A00();
                try {
                    if (A002 != null) {
                        try {
                            try {
                                try {
                                    cursor = A002.query(A0F(), strArr, str, null, null, null, null);
                                    if (cursor == null || !cursor.moveToFirst()) {
                                        z = false;
                                    }
                                    if (z) {
                                        do {
                                            byte[] blob = cursor.getBlob(0);
                                            if (blob == null) {
                                                C18950wb.A00.AEp("Error reading data", 20134884).report();
                                            } else {
                                                Object A0C = A0C(C07950bF.A04.A02(this.A00, blob), false);
                                                if (A0C != null) {
                                                    arrayList.add(A0C);
                                                }
                                            }
                                        } while (cursor.moveToNext());
                                    }
                                } catch (C90173zy unused) {
                                    C18950wb.A00.AEp("Error parsing json", 20134884).report();
                                }
                            } catch (IOException unused2) {
                                C18950wb.A00.AEp("Error parsing json", 20134884).report();
                            }
                        } catch (SQLiteBlobTooBigException e) {
                            if (C18U.A06(C06090Tz.A05, this.A00, 36325695223379220L)) {
                                C18950wb.A00.AEp("Error parsing json", 20134884).report();
                            } else {
                                throw e;
                            }
                        } catch (IllegalStateException e2) {
                            C18950wb.A00.AEp(AnonymousClass001.A0R("Error reading data: ", e2.getMessage()), 20134884).report();
                        }
                        if (cursor != null) {
                            return arrayList;
                        }
                    }
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r1 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r0 = r9.getBlob(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        X.C18950wb.A00.AEp("Error reading data.", 20134884).report();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r9.moveToNext() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        r3.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A06(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            r4 = 0
            r8 = r14
            X.C14360o3.A0B(r14, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.2Qc r2 = X.C49682Qb.A06
            boolean r0 = r2.A03()
            if (r0 != 0) goto L6b
            java.lang.String r0 = r13.A0E()
            r1 = 1
            java.lang.String[] r7 = new java.lang.String[]{r0}
            r9 = 0
            X.2Qb r0 = r2.A00()
            if (r0 == 0) goto L6b
            android.database.sqlite.SQLiteDatabase r5 = r0.A00()
            if (r5 == 0) goto L6b
            java.lang.String r6 = r13.A0F()     // Catch: java.lang.Throwable -> L64
            r10 = r9
            r11 = r9
            r12 = r15
            android.database.Cursor r9 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L3c
            boolean r0 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L64
            if (r0 != r1) goto L3c
            goto L3d
        L3c:
            r1 = 0
        L3d:
            if (r1 == 0) goto L5e
        L3f:
            byte[] r0 = r9.getBlob(r4)     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L5a
            java.lang.String r2 = "Error reading data."
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            X.0f6 r0 = X.C18950wb.A00     // Catch: java.lang.Throwable -> L64
            X.0f5 r0 = r0.AEp(r2, r1)     // Catch: java.lang.Throwable -> L64
            r0.report()     // Catch: java.lang.Throwable -> L64
        L53:
            boolean r0 = r9.moveToNext()     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L3f
            goto L5e
        L5a:
            r3.add(r0)     // Catch: java.lang.Throwable -> L64
            goto L53
        L5e:
            if (r9 == 0) goto L6b
            r9.close()
            return r3
        L64:
            r0 = move-exception
            if (r9 == 0) goto L6a
            r9.close()
        L6a:
            throw r0
        L6b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2RB.A06(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r0 = r3.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        X.C18950wb.A00.AEp("Error reading ids.", 20134884).report();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r3.moveToNext() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        r4.add(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A07(java.lang.String r16) {
        /*
            r15 = this;
            r10 = 0
            java.lang.String r3 = "thread_id"
            r5 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.2Qc r2 = X.C49682Qb.A06
            boolean r0 = r2.A03()
            if (r0 != 0) goto L69
            r1 = 1
            java.lang.String[] r8 = new java.lang.String[]{r3}
            X.2Qb r0 = r2.A00()
            if (r0 == 0) goto L69
            android.database.sqlite.SQLiteDatabase r6 = r0.A00()
            if (r6 == 0) goto L69
            r3 = 0
            java.lang.String r7 = r15.A0F()     // Catch: java.lang.Throwable -> L5d
            r9 = r16
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            android.database.Cursor r3 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L3b
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L5d
            if (r0 != r1) goto L3b
            goto L3c
        L3b:
            r1 = 0
        L3c:
            if (r1 == 0) goto L64
        L3e:
            java.lang.String r0 = r3.getString(r5)     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L59
            java.lang.String r2 = "Error reading ids."
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            X.0f6 r0 = X.C18950wb.A00     // Catch: java.lang.Throwable -> L5d
            X.0f5 r0 = r0.AEp(r2, r1)     // Catch: java.lang.Throwable -> L5d
            r0.report()     // Catch: java.lang.Throwable -> L5d
        L52:
            boolean r0 = r3.moveToNext()     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L3e
            goto L64
        L59:
            r4.add(r0)     // Catch: java.lang.Throwable -> L5d
            goto L52
        L5d:
            r0 = move-exception
            if (r3 == 0) goto L63
            r3.close()
        L63:
            throw r0
        L64:
            if (r3 == 0) goto L69
            r3.close()
        L69:
            java.util.List r0 = java.util.Collections.unmodifiableList(r4)
            X.C14360o3.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2RB.A07(java.lang.String):java.util.List");
    }

    public final byte[] A0A(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        C14360o3.A0B(byteArrayOutputStream, 1);
        byteArrayOutputStream.reset();
        try {
            C120295cS A08 = AbstractC221915u.A00.A08(byteArrayOutputStream);
            try {
                C14360o3.A0A(A08);
                A0G(A08, obj);
                A08.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C14360o3.A07(byteArray);
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException("Error creating json string", e);
        }
    }

    public abstract ContentValues A0B(ByteArrayOutputStream byteArrayOutputStream, Object obj);

    public abstract Object A0C(C16L c16l, boolean z);

    public abstract Object A0D(UserSession userSession, Object obj);

    public abstract String A0E();

    public abstract String A0F();

    public abstract void A0G(AnonymousClass182 anonymousClass182, Object obj);

    public final int A02(ByteArrayOutputStream byteArrayOutputStream, Object obj, String str) {
        C49682Qb A00;
        SQLiteDatabase A002;
        int update;
        C49692Qc c49692Qc = C49682Qb.A06;
        if (!c49692Qc.A03()) {
            ContentValues A0B = A0B(byteArrayOutputStream, obj);
            if (!c49692Qc.A03() && (A00 = c49692Qc.A00()) != null && (A002 = A00.A00()) != null) {
                synchronized (this.A01) {
                    update = A002.update(A0F(), A0B, str, null);
                }
                return update;
            }
            return -1;
        }
        return -1;
    }

    public final void A09(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        C49682Qb A00;
        SQLiteDatabase A002;
        C49692Qc c49692Qc = C49682Qb.A06;
        if (!c49692Qc.A03() && (A00 = c49692Qc.A00()) != null && (A002 = A00.A00()) != null) {
            synchronized (this.A01) {
                String A0F = A0F();
                ContentValues A0B = A0B(byteArrayOutputStream, obj);
                C0fW.A00(2090242842);
                A002.insertOrThrow(A0F, null, A0B);
                C0fW.A00(-1451909260);
            }
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36319952851967854L)) {
                C0o0 A00 = AbstractC14350nz.A00();
                A00.A01 = C28741aC.class.toString();
                new C18240vB(A00).ATO(new C45700KLd(this));
                return;
            }
            A03(A04());
        }
    }

    public final String A04() {
        return AnonymousClass001.A0S("user_id=='", this.A00.userId, '\'');
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r10.moveToFirst() == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r1 = r10.getString(0);
        r0 = r10.getBlob(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r4.add(r1);
        r3.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r10.moveToNext() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        X.C18950wb.A00.AEp("Error reading data.", 20134884).report();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        r10.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C09530e4 A08(java.lang.Integer r16, java.lang.String r17) {
        /*
            r15 = this;
            java.lang.String r13 = "last_activity_time DESC"
            java.lang.String r6 = "thread_id"
            r5 = 0
            r9 = r17
            X.C14360o3.A0B(r9, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.2Qc r1 = X.C49682Qb.A06
            boolean r0 = r1.A03()
            if (r0 != 0) goto L81
            java.lang.String r0 = r15.A0E()
            r2 = 1
            java.lang.String[] r8 = new java.lang.String[]{r6, r0}
            X.2Qb r0 = r1.A00()
            if (r0 == 0) goto L81
            android.database.sqlite.SQLiteDatabase r6 = r0.A00()
            if (r6 == 0) goto L81
            r10 = 0
            java.lang.String r7 = r15.A0F()     // Catch: java.lang.Throwable -> L77
            if (r16 == 0) goto L75
            java.lang.String r14 = r16.toString()     // Catch: java.lang.Throwable -> L77
        L3e:
            r11 = r10
            r12 = r10
            android.database.Cursor r10 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L77
            if (r10 == 0) goto L81
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L77
            if (r0 != r2) goto L7e
        L4c:
            java.lang.String r1 = r10.getString(r5)     // Catch: java.lang.Throwable -> L77
            byte[] r0 = r10.getBlob(r2)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L59
            if (r0 == 0) goto L59
            goto L68
        L59:
            java.lang.String r6 = "Error reading data."
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            X.0f6 r0 = X.C18950wb.A00     // Catch: java.lang.Throwable -> L77
            X.0f5 r0 = r0.AEp(r6, r1)     // Catch: java.lang.Throwable -> L77
            r0.report()     // Catch: java.lang.Throwable -> L77
            goto L6e
        L68:
            r4.add(r1)     // Catch: java.lang.Throwable -> L77
            r3.add(r0)     // Catch: java.lang.Throwable -> L77
        L6e:
            boolean r0 = r10.moveToNext()     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L4c
            goto L7e
        L75:
            r14 = r10
            goto L3e
        L77:
            r0 = move-exception
            if (r10 == 0) goto L7d
            r10.close()
        L7d:
            throw r0
        L7e:
            r10.close()
        L81:
            X.0e4 r0 = new X.0e4
            r0.<init>(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2RB.A08(java.lang.Integer, java.lang.String):X.0e4");
    }
}
