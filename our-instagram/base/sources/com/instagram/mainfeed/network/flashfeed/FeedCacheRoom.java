package com.instagram.mainfeed.network.flashfeed;

import X.AbstractC12290kX;
import X.AbstractC28241Yh;
import X.C06090Tz;
import X.C0K8;
import X.C0f5;
import X.C0fO;
import X.C108104tt;
import X.C13920nI;
import X.C14360o3;
import X.C18950wb;
import X.C18U;
import X.C1XV;
import X.C1YW;
import X.C1YZ;
import X.C1Yc;
import X.C1Ye;
import X.C1Yi;
import X.C29461bN;
import X.C38321qM;
import X.C3XG;
import X.C3XH;
import X.C51I;
import X.C51M;
import X.C88533xB;
import X.C9BW;
import android.content.Context;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class FeedCacheRoom {
    public final UserSession A00;
    public final C13920nI A01;
    public final C29461bN A02;
    public final Map A03;

    public final C3XG A01(C108104tt c108104tt) {
        C14360o3.A0B(c108104tt, 0);
        try {
            return A00(c108104tt);
        } catch (Exception e) {
            C0K8.A0F("FeedCacheRoom", "Failed to add feed items to cache", e);
            C0f5 AEp = C18950wb.A00.AEp("Failed to deserialize media to feed item", 817905005);
            AEp.ERI(e);
            AEp.ABW("media_id", c108104tt.A04);
            AEp.report();
            return null;
        }
    }

    public FeedCacheRoom(UserSession userSession) {
        C29461bN c29461bN;
        C1YW c1yw = FeedItemDatabase.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(FeedItemDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (c1yw) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(FeedItemDatabase.class);
                if (igRoomDatabase == null) {
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    C1Ye A00 = C1Yc.A00(context, FeedItemDatabase.class, C1YZ.A00(userSession, c1yw));
                    AbstractC28241Yh.A00(A00, 767, 766, true);
                    A00.A03(C1Yi.A00);
                    A00.A01();
                    igRoomDatabase = (IgRoomDatabase) A00.A00();
                    userSession.A04(FeedItemDatabase.class, igRoomDatabase);
                }
            }
        }
        FeedItemDatabase feedItemDatabase = (FeedItemDatabase) igRoomDatabase;
        C13920nI c13920nI = C13920nI.A00;
        C14360o3.A0B(feedItemDatabase, 2);
        C14360o3.A0B(c13920nI, 3);
        this.A00 = userSession;
        this.A01 = c13920nI;
        FeedItemDatabase_Impl feedItemDatabase_Impl = (FeedItemDatabase_Impl) feedItemDatabase;
        if (feedItemDatabase_Impl.A00 != null) {
            c29461bN = feedItemDatabase_Impl.A00;
        } else {
            synchronized (feedItemDatabase_Impl) {
                if (feedItemDatabase_Impl.A00 == null) {
                    feedItemDatabase_Impl.A00 = new C29461bN(feedItemDatabase_Impl);
                }
                c29461bN = feedItemDatabase_Impl.A00;
            }
        }
        this.A02 = c29461bN;
        this.A03 = new LinkedHashMap();
    }

    private final C3XG A00(C108104tt c108104tt) {
        int i;
        C3XG c3xg;
        if (Systrace.A0E(1L)) {
            C0fO.A01("FeedCacheRoom.deserializeEntityToFeedItem", 751494795);
        }
        try {
            synchronized (this) {
                UserSession userSession = this.A00;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36328426822581771L) && (c3xg = (C3XG) this.A03.get(c108104tt.A04)) != null) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1880727059);
                    }
                    return c3xg;
                }
                C9BW A00 = C51I.A00(userSession, c108104tt.A05);
                IOException iOException = (IOException) A00.A00;
                if (iOException == null) {
                    C38321qM c38321qM = (C38321qM) A00.A01;
                    C3XG c3xg2 = null;
                    if (c38321qM == null) {
                        if (Systrace.A0E(1L)) {
                            i = -884223413;
                            C0fO.A00(i);
                        }
                        return c3xg2;
                    }
                    int ordinal = c108104tt.A01.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 14) {
                            if (ordinal == 13) {
                                C88533xB A002 = C51M.A00(c38321qM);
                                c3xg2 = new C3XG(A002, C1XV.A0H, A002.getId());
                            }
                        } else if (c38321qM.B5n() == C1XV.A0Y) {
                            c3xg2 = C3XH.A01(c38321qM);
                        } else {
                            C1XV B5n = c38321qM.B5n();
                            C1XV c1xv = C1XV.A0H;
                            if (B5n == c1xv) {
                                C88533xB A003 = C51M.A00(c38321qM);
                                c3xg2 = new C3XG(A003, c1xv, A003.getId());
                            }
                        }
                    } else {
                        c3xg2 = C3XH.A01(c38321qM);
                    }
                    if (C18U.A06(c06090Tz, userSession, 36328426822581771L) && c3xg2 != null) {
                        this.A03.put(c108104tt.A04, c3xg2);
                    }
                    if (Systrace.A0E(1L)) {
                        i = -1958594786;
                        C0fO.A00(i);
                    }
                    return c3xg2;
                }
                throw iOException;
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1522042723);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:3|(14:5|6|7|(1:(2:10|11)(2:65|66))(8:67|68|(1:70)|71|(1:73)|(1:75)|76|(1:78))|12|(3:14|(6:17|(3:29|(3:32|(3:34|35|36)(1:37)|30)|38)(1:21)|22|(3:24|25|26)(1:28)|27|15)|39)(1:64)|(1:41)|(1:43)|44|(5:47|(1:49)(1:56)|(3:51|52|53)(1:55)|54|45)|57|(1:59)|61|62))|7|(0)(0)|12|(0)(0)|(0)|(0)|44|(1:45)|57|(0)|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0187, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0188, code lost:
    
        X.C0K8.A0F("FeedCacheRoom", "Failed to get feed items from cache", r3);
        r0 = X.C18950wb.A00.AEp("Failed to get feed items from cache", 817905005);
        r0.ERI(r3);
        r0.report();
        r10 = X.C16930sl.A00;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00eb A[Catch: Exception -> 0x0187, all -> 0x01a4, TryCatch #1 {Exception -> 0x0187, blocks: (B:11:0x00d7, B:12:0x00da, B:14:0x00eb, B:15:0x00f4, B:17:0x00fa, B:19:0x0105, B:25:0x0128, B:29:0x010c, B:30:0x0110, B:32:0x0116, B:41:0x012f, B:43:0x0148, B:44:0x0151, B:45:0x0155, B:47:0x015b, B:49:0x016c, B:52:0x0177, B:56:0x0171, B:59:0x017d, B:68:0x0061, B:70:0x006e, B:71:0x007b, B:73:0x0083, B:75:0x00a0, B:76:0x00a9), top: B:7:0x0026, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f A[Catch: Exception -> 0x0187, all -> 0x01a4, TryCatch #1 {Exception -> 0x0187, blocks: (B:11:0x00d7, B:12:0x00da, B:14:0x00eb, B:15:0x00f4, B:17:0x00fa, B:19:0x0105, B:25:0x0128, B:29:0x010c, B:30:0x0110, B:32:0x0116, B:41:0x012f, B:43:0x0148, B:44:0x0151, B:45:0x0155, B:47:0x015b, B:49:0x016c, B:52:0x0177, B:56:0x0171, B:59:0x017d, B:68:0x0061, B:70:0x006e, B:71:0x007b, B:73:0x0083, B:75:0x00a0, B:76:0x00a9), top: B:7:0x0026, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148 A[Catch: Exception -> 0x0187, all -> 0x01a4, TryCatch #1 {Exception -> 0x0187, blocks: (B:11:0x00d7, B:12:0x00da, B:14:0x00eb, B:15:0x00f4, B:17:0x00fa, B:19:0x0105, B:25:0x0128, B:29:0x010c, B:30:0x0110, B:32:0x0116, B:41:0x012f, B:43:0x0148, B:44:0x0151, B:45:0x0155, B:47:0x015b, B:49:0x016c, B:52:0x0177, B:56:0x0171, B:59:0x017d, B:68:0x0061, B:70:0x006e, B:71:0x007b, B:73:0x0083, B:75:0x00a0, B:76:0x00a9), top: B:7:0x0026, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b A[Catch: Exception -> 0x0187, all -> 0x01a4, TryCatch #1 {Exception -> 0x0187, blocks: (B:11:0x00d7, B:12:0x00da, B:14:0x00eb, B:15:0x00f4, B:17:0x00fa, B:19:0x0105, B:25:0x0128, B:29:0x010c, B:30:0x0110, B:32:0x0116, B:41:0x012f, B:43:0x0148, B:44:0x0151, B:45:0x0155, B:47:0x015b, B:49:0x016c, B:52:0x0177, B:56:0x0171, B:59:0x017d, B:68:0x0061, B:70:0x006e, B:71:0x007b, B:73:0x0083, B:75:0x00a0, B:76:0x00a9), top: B:7:0x0026, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d A[Catch: Exception -> 0x0187, all -> 0x01a4, TRY_LEAVE, TryCatch #1 {Exception -> 0x0187, blocks: (B:11:0x00d7, B:12:0x00da, B:14:0x00eb, B:15:0x00f4, B:17:0x00fa, B:19:0x0105, B:25:0x0128, B:29:0x010c, B:30:0x0110, B:32:0x0116, B:41:0x012f, B:43:0x0148, B:44:0x0151, B:45:0x0155, B:47:0x015b, B:49:0x016c, B:52:0x0177, B:56:0x0171, B:59:0x017d, B:68:0x0061, B:70:0x006e, B:71:0x007b, B:73:0x0083, B:75:0x00a0, B:76:0x00a9), top: B:7:0x0026, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.Integer r27, java.lang.Integer r28, java.util.List r29, java.util.List r30, X.InterfaceC23621Ds r31, int r32, long r33) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.flashfeed.FeedCacheRoom.A02(java.lang.Integer, java.lang.Integer, java.util.List, java.util.List, X.1Ds, int, long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (((X.C206469Cd) r26).A05 != 1) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8 A[Catch: Exception -> 0x00d5, all -> 0x00f0, Merged into TryCatch #0 {all -> 0x00f0, Exception -> 0x00d5, blocks: (B:15:0x00c1, B:16:0x00c4, B:18:0x00c8, B:26:0x005c, B:28:0x0069, B:31:0x0079, B:33:0x0096, B:34:0x009f, B:41:0x00d6), top: B:11:0x002f }, TRY_LEAVE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.Integer r23, java.lang.Integer r24, java.util.List r25, X.InterfaceC23621Ds r26, int r27, long r28) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.flashfeed.FeedCacheRoom.A03(java.lang.Integer, java.lang.Integer, java.util.List, X.1Ds, int, long):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(6:22|23|(4:26|(9:28|29|(1:31)(1:44)|32|(1:34)|35|(1:43)(1:39)|40|41)(1:45)|42|24)|46|47|(1:49)(1:50))|12|(1:14)|15|16|17))|53|6|7|(0)(0)|12|(0)|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
    
        X.C0K8.A0F("FeedCacheRoom", "Failed to add feed items to cache", r3);
        r0 = X.C18950wb.A00.AEp("Failed to add feed items to cache", 817905005);
        r0.ERI(r3);
        r0.report();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e0 A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:11:0x00ce, B:12:0x00d1, B:14:0x00e0, B:15:0x00f7, B:23:0x0042, B:24:0x004f, B:26:0x0055, B:29:0x0063, B:31:0x006c, B:32:0x0072, B:34:0x007e, B:35:0x0087, B:37:0x0096, B:39:0x00a0, B:40:0x00a2, B:43:0x00b1, B:47:0x00b7), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.util.Collection r24, X.InterfaceC23621Ds r25) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.flashfeed.FeedCacheRoom.A04(java.util.Collection, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(3:18|19|(1:21))|14|15|16))|24|6|7|(0)(0)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        r0 = X.C18950wb.A00.AEp("Failed to clear feed item cache", 817905005);
        r0.ERI(r3);
        r0.report();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.util.List r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 41
            boolean r0 = X.PX9.A03(r7, r3)
            if (r0 == 0) goto L22
            r4 = r7
            X.PX9 r4 = (X.PX9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r2 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L2e
            goto L2a
        L22:
            r0 = 42
            X.PX9 r4 = new X.PX9
            r4.<init>(r5, r7, r3, r0)
            goto L16
        L2a:
            X.AbstractC09560e7.A00(r2)     // Catch: java.lang.Exception -> L4b
            goto L5d
        L2e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L36:
            X.AbstractC09560e7.A00(r2)
            X.1bN r2 = r5.A02     // Catch: java.lang.Exception -> L4b
            r4.A00 = r0     // Catch: java.lang.Exception -> L4b
            X.1YP r1 = r2.A01     // Catch: java.lang.Exception -> L4b
            X.M7x r0 = new X.M7x     // Catch: java.lang.Exception -> L4b
            r0.<init>(r2, r6)     // Catch: java.lang.Exception -> L4b
            java.lang.Object r0 = X.C2Q9.A01(r1, r0, r4)     // Catch: java.lang.Exception -> L4b
            if (r0 != r3) goto L5d
            return r3
        L4b:
            r3 = move-exception
            java.lang.String r2 = "Failed to clear feed item cache"
            r1 = 817905005(0x30c03d6d, float:1.3987297E-9)
            X.0f6 r0 = X.C18950wb.A00
            X.0f5 r0 = r0.AEp(r2, r1)
            r0.ERI(r3)
            r0.report()
        L5d:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.flashfeed.FeedCacheRoom.A05(java.util.List, X.1Ds):java.lang.Object");
    }
}
