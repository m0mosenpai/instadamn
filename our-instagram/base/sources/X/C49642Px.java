package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2Px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49642Px {
    public final Context A00;
    public final UserSession A01;

    public C49642Px(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:13)(2:10|11))(2:16|(4:18|(1:4b)|30|(1:32)))|14|15))|35|6|7|(0)(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        new X.C09540e5(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r11, boolean r12) {
        /*
            r10 = this;
            r3 = 47
            boolean r0 = X.C9CX.A00(r11, r3)
            if (r0 == 0) goto L22
            r6 = r11
            X.9CX r6 = (X.C9CX) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r7 = 1
            if (r0 == 0) goto L36
            if (r0 != r7) goto L2e
            goto L2a
        L22:
            r0 = 42
            X.9CX r6 = new X.9CX
            r6.<init>(r10, r11, r3, r0)
            goto L16
        L2a:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> L93
            goto L99
        L2e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L36:
            X.AbstractC09560e7.A00(r1)
            if (r12 == 0) goto L99
            android.content.Context r9 = r10.A00     // Catch: java.lang.Throwable -> L93
            com.instagram.common.session.UserSession r8 = r10.A01     // Catch: java.lang.Throwable -> L93
            X.2Of r4 = com.instagram.creation.persistence.CreationDatabase.A00     // Catch: java.lang.Throwable -> L93
            java.lang.Class<com.instagram.creation.persistence.CreationDatabase> r3 = com.instagram.creation.persistence.CreationDatabase.class
            java.lang.Object r0 = r8.A00(r3)     // Catch: java.lang.Throwable -> L93
            com.instagram.roomdb.IgRoomDatabase r0 = (com.instagram.roomdb.IgRoomDatabase) r0     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto L7b
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = r8.A00(r3)     // Catch: java.lang.Throwable -> L77
            com.instagram.roomdb.IgRoomDatabase r0 = (com.instagram.roomdb.IgRoomDatabase) r0     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L7a
            android.content.Context r1 = X.AbstractC12290kX.A00     // Catch: java.lang.Throwable -> L77
            X.C14360o3.A07(r1)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = X.C1YZ.A00(r8, r4)     // Catch: java.lang.Throwable -> L77
            X.1Ye r2 = X.C1Yc.A00(r1, r3, r0)     // Catch: java.lang.Throwable -> L77
            r1 = 1702658258(0x657c80d2, float:7.452579E22)
            r0 = 1401021912(0x5381e5d8, float:1.1158138E12)
            X.AbstractC28241Yh.A00(r2, r1, r0, r7)     // Catch: java.lang.Throwable -> L77
            r4.A00(r2)     // Catch: java.lang.Throwable -> L77
            X.1YP r0 = r2.A00()     // Catch: java.lang.Throwable -> L77
            com.instagram.roomdb.IgRoomDatabase r0 = (com.instagram.roomdb.IgRoomDatabase) r0     // Catch: java.lang.Throwable -> L77
            r8.A04(r3, r0)     // Catch: java.lang.Throwable -> L77
            goto L7a
        L77:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.Throwable -> L93
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L93
        L7b:
            com.instagram.creation.persistence.CreationDatabase r0 = (com.instagram.creation.persistence.CreationDatabase) r0     // Catch: java.lang.Throwable -> L93
            X.2PV r2 = r0.A00()     // Catch: java.lang.Throwable -> L93
            X.2Pt r1 = X.C2Ps.A00(r9, r8)     // Catch: java.lang.Throwable -> L93
            com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob r0 = new com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob     // Catch: java.lang.Throwable -> L93
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L93
            r6.A00 = r7     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = r0.A01(r8, r6)     // Catch: java.lang.Throwable -> L93
            if (r0 != r5) goto L99
            return r5
        L93:
            r1 = move-exception
            X.0e5 r0 = new X.0e5
            r0.<init>(r1)
        L99:
            X.0eB r5 = X.C0eB.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49642Px.A00(X.1Ds, boolean):java.lang.Object");
    }
}
