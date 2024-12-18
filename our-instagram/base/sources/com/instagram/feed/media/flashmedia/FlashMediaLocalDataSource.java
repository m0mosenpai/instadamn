package com.instagram.feed.media.flashmedia;

import X.AbstractC167017dG;
import X.AbstractC28241Yh;
import X.AbstractC43594JPz;
import X.C0f5;
import X.C0f6;
import X.C13920nI;
import X.C18950wb;
import X.C1Ye;
import X.C43611JQu;
import X.C43612JQv;
import X.XME;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.flashmedia.persistence.MediaDatabase;
import com.instagram.feed.media.flashmedia.persistence.MediaDatabase_Impl;
import com.instagram.roomdb.IgRoomDatabase;

/* loaded from: classes8.dex */
public final class FlashMediaLocalDataSource {
    public final C0f6 A00;
    public final UserSession A01;
    public final C13920nI A02;
    public final C43612JQv A03;

    public /* synthetic */ FlashMediaLocalDataSource(UserSession userSession) {
        C43612JQv c43612JQv;
        C43611JQu c43611JQu = MediaDatabase.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(MediaDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (c43611JQu) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(MediaDatabase.class);
                if (igRoomDatabase == null) {
                    C1Ye A0K = AbstractC43594JPz.A0K(userSession, c43611JQu, MediaDatabase.class);
                    AbstractC28241Yh.A00(A0K, 272551949, 424218535, false);
                    A0K.A03(XME.A00);
                    igRoomDatabase = (IgRoomDatabase) A0K.A00();
                    userSession.A04(MediaDatabase.class, igRoomDatabase);
                }
            }
        }
        MediaDatabase_Impl mediaDatabase_Impl = (MediaDatabase_Impl) ((MediaDatabase) igRoomDatabase);
        if (mediaDatabase_Impl.A00 != null) {
            c43612JQv = mediaDatabase_Impl.A00;
        } else {
            synchronized (mediaDatabase_Impl) {
                if (mediaDatabase_Impl.A00 == null) {
                    mediaDatabase_Impl.A00 = new C43612JQv(mediaDatabase_Impl);
                }
                c43612JQv = mediaDatabase_Impl.A00;
            }
        }
        C13920nI c13920nI = C13920nI.A00;
        AbstractC167017dG.A1R(c43612JQv, c13920nI);
        this.A01 = userSession;
        this.A03 = c43612JQv;
        this.A02 = c13920nI;
        this.A00 = C18950wb.A01;
    }

    public static final void A00(FlashMediaLocalDataSource flashMediaLocalDataSource, String str, Throwable th) {
        C0f5 AEp = flashMediaLocalDataSource.A00.AEp(str, 817892378);
        AEp.ERI(th);
        AEp.report();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(2:10|11)(2:15|16))(6:17|18|(3:21|(1:23)(3:24|25|26)|19)|27|28|(1:30))|12|13))|33|6|7|(0)(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        A00(r18, "replaceAll", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.EnumC37328GcW r19, java.util.Collection r20, X.InterfaceC23621Ds r21, long r22) {
        /*
            r18 = this;
            r5 = 14
            r6 = r21
            boolean r0 = X.MAH.A01(r6, r5)
            r2 = r18
            if (r0 == 0) goto L2a
            r3 = r6
            X.MAH r3 = (X.MAH) r3
            int r4 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L2a
            int r4 = r4 - r1
            r3.A00 = r4
        L1a:
            java.lang.Object r4 = r3.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L39
            if (r0 != r5) goto L34
            java.lang.Object r2 = r3.A01
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r2 = (com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r2
            goto L30
        L2a:
            X.MAH r3 = new X.MAH
            r3.<init>(r2, r6, r5)
            goto L1a
        L30:
            X.AbstractC09560e7.A00(r4)     // Catch: android.database.SQLException -> L88
            goto L8e
        L34:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L39:
            X.AbstractC09560e7.A00(r4)
            X.JQv r13 = r2.A03     // Catch: android.database.SQLException -> L88
            r0 = r19
            java.lang.String r8 = r0.A01     // Catch: android.database.SQLException -> L88
            long r11 = java.lang.System.currentTimeMillis()     // Catch: android.database.SQLException -> L88
            java.util.ArrayList r15 = X.AbstractC167017dG.A0q(r20)     // Catch: android.database.SQLException -> L88
            java.util.Iterator r4 = r20.iterator()     // Catch: android.database.SQLException -> L88
        L4e:
            boolean r0 = r4.hasNext()     // Catch: android.database.SQLException -> L88
            if (r0 == 0) goto L73
            java.lang.Object r0 = r4.next()     // Catch: android.database.SQLException -> L88
            X.1qM r0 = (X.C38321qM) r0     // Catch: android.database.SQLException -> L88
            java.lang.String r7 = r0.A38()     // Catch: android.database.SQLException -> L88
            if (r7 == 0) goto L6e
            byte[] r9 = X.C38801rC.A0A(r0)     // Catch: android.database.SQLException -> L88
            r10 = 0
            X.5nk r6 = new X.5nk     // Catch: android.database.SQLException -> L88
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: android.database.SQLException -> L88
            r15.add(r6)     // Catch: android.database.SQLException -> L88
            goto L4e
        L6e:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: android.database.SQLException -> L88
            throw r0     // Catch: android.database.SQLException -> L88
        L73:
            r3.A01 = r2     // Catch: android.database.SQLException -> L88
            r3.A00 = r5     // Catch: android.database.SQLException -> L88
            X.1YP r0 = r13.A01     // Catch: android.database.SQLException -> L88
            X.66f r12 = new X.66f     // Catch: android.database.SQLException -> L88
            r16 = r22
            r14 = r8
            r12.<init>(r13, r14, r15, r16)     // Catch: android.database.SQLException -> L88
            java.lang.Object r0 = X.C4HQ.A00(r0, r3, r12)     // Catch: android.database.SQLException -> L88
            if (r0 != r1) goto L8e
            return r1
        L88:
            r1 = move-exception
            java.lang.String r0 = "replaceAll"
            A00(r2, r0, r1)
        L8e:
            X.0eB r1 = X.C0eB.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource.A01(X.GcW, java.util.Collection, X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.EnumC37328GcW r19, java.util.Collection r20, X.InterfaceC23621Ds r21, long r22, boolean r24) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource.A02(X.GcW, java.util.Collection, X.1Ds, long, boolean):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.1JX] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.EnumC37328GcW r11, X.InterfaceC23621Ds r12) {
        /*
            r10 = this;
            r3 = 16
            boolean r0 = X.MAH.A01(r12, r3)
            if (r0 == 0) goto La1
            r6 = r12
            X.MAH r6 = (X.MAH) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La1
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A02
            X.1JX r7 = X.C1JX.A02
            int r0 = r6.A00
            r9 = 1
            if (r0 == 0) goto L69
            if (r0 != r9) goto La8
            java.lang.Object r5 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r5 = (com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r5
            X.AbstractC09560e7.A00(r1)
        L28:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r7 = X.AbstractC166987dD.A1E()
            java.util.Iterator r4 = r1.iterator()
        L32:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r4.next()
            X.5nk r0 = (X.C126495nk) r0
            com.instagram.common.session.UserSession r1 = r5.A01     // Catch: java.io.IOException -> L50
            byte[] r0 = r0.A04     // Catch: java.io.IOException -> L50
            X.9BW r1 = X.C51I.A00(r1, r0)     // Catch: java.io.IOException -> L50
            java.lang.Object r0 = r1.A00     // Catch: java.io.IOException -> L50
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.io.IOException -> L50
            if (r0 != 0) goto L4f
            java.lang.Object r0 = r1.A01     // Catch: java.io.IOException -> L50
            goto L63
        L4f:
            throw r0     // Catch: java.io.IOException -> L50
        L50:
            r3 = move-exception
            X.0f6 r2 = r5.A00
            r1 = 817892378(0x30c00c1a, float:1.3973278E-9)
            java.lang.String r0 = "retrieveAllByType"
            X.0f5 r0 = r2.AEp(r0, r1)
            r0.ERI(r3)
            r0.report()
            r0 = 0
        L63:
            if (r0 == 0) goto L32
            r7.add(r0)
            goto L32
        L69:
            X.AbstractC09560e7.A00(r1)
            X.JQv r5 = r10.A03
            java.lang.String r8 = r11.A01
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r11.A00
            long r1 = r1 - r3
            r6.A01 = r10
            r6.A00 = r9
            java.lang.String r4 = "\n    SELECT *\n    FROM medias\n    WHERE type = ?\n      AND stored_time > ?"
            r3 = 2
            java.util.TreeMap r0 = X.C37581ov.A08
            X.1ov r4 = X.AbstractC37591ow.A00(r4, r3)
            r4.ADp(r9, r8)
            r4.ADi(r3, r1)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.1YP r2 = r5.A01
            r0 = 10
            X.JZn r1 = new X.JZn
            r1.<init>(r0, r5, r4)
            r0 = 0
            java.lang.Object r1 = X.C2Q9.A00(r3, r2, r1, r6, r0)
            if (r1 == r7) goto Lad
            r5 = r10
            goto L28
        La1:
            X.MAH r6 = new X.MAH
            r6.<init>(r10, r12, r3)
            goto L16
        La8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lad:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource.A03(X.GcW, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.1JX] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.EnumC37328GcW r11, X.InterfaceC23621Ds r12, long r13) {
        /*
            r10 = this;
            r3 = 17
            boolean r0 = X.MAH.A01(r12, r3)
            if (r0 == 0) goto La5
            r5 = r12
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r9 = 1
            if (r0 == 0) goto L69
            if (r0 != r9) goto Lac
            java.lang.Object r5 = r5.A01
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r5 = (com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r5
            X.AbstractC09560e7.A00(r1)
        L28:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = X.AbstractC166987dD.A1E()
            java.util.Iterator r4 = r1.iterator()
        L32:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r4.next()
            X.5nk r0 = (X.C126495nk) r0
            com.instagram.common.session.UserSession r1 = r5.A01     // Catch: java.io.IOException -> L50
            byte[] r0 = r0.A04     // Catch: java.io.IOException -> L50
            X.9BW r1 = X.C51I.A00(r1, r0)     // Catch: java.io.IOException -> L50
            java.lang.Object r0 = r1.A00     // Catch: java.io.IOException -> L50
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.io.IOException -> L50
            if (r0 != 0) goto L4f
            java.lang.Object r0 = r1.A01     // Catch: java.io.IOException -> L50
            goto L63
        L4f:
            throw r0     // Catch: java.io.IOException -> L50
        L50:
            r3 = move-exception
            X.0f6 r2 = r5.A00
            r1 = 817892378(0x30c00c1a, float:1.3973278E-9)
            java.lang.String r0 = "retrieveSomeByType"
            X.0f5 r0 = r2.AEp(r0, r1)
            r0.ERI(r3)
            r0.report()
            r0 = 0
        L63:
            if (r0 == 0) goto L32
            r6.add(r0)
            goto L32
        L69:
            X.AbstractC09560e7.A00(r1)
            X.JQv r7 = r10.A03
            java.lang.String r8 = r11.A01
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r11.A00
            long r1 = r1 - r3
            r5.A01 = r10
            r5.A00 = r9
            java.lang.String r4 = "\n    SELECT *\n    FROM medias\n    WHERE type = ?\n      AND stored_time > ?\n    LIMIT ?"
            r3 = 3
            java.util.TreeMap r0 = X.C37581ov.A08
            X.1ov r4 = X.AbstractC37591ow.A00(r4, r3)
            r4.ADp(r9, r8)
            r0 = 2
            r4.ADi(r0, r1)
            r4.ADi(r3, r13)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.1YP r2 = r7.A01
            r0 = 8
            X.JZn r1 = new X.JZn
            r1.<init>(r0, r7, r4)
            r0 = 0
            java.lang.Object r1 = X.C2Q9.A00(r3, r2, r1, r5, r0)
            if (r1 == r6) goto Lb1
            r5 = r10
            goto L28
        La5:
            X.MAH r5 = new X.MAH
            r5.<init>(r10, r12, r3)
            goto L16
        Lac:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lb1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource.A04(X.GcW, X.1Ds, long):java.lang.Object");
    }
}
