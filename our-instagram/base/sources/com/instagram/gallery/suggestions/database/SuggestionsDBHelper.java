package com.instagram.gallery.suggestions.database;

import X.AbstractC167007dF;
import X.AbstractC28241Yh;
import X.AbstractC29601bb;
import X.AbstractC43594JPz;
import X.C1YP;
import X.C1Ye;
import X.C47034Kqr;
import X.C47915LEj;
import X.C49580LvZ;
import X.InterfaceC37561ot;
import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;

/* loaded from: classes8.dex */
public final class SuggestionsDBHelper {
    public static final C47034Kqr A00 = new Object();
    public static volatile SuggestionsDBHelper A01;

    public static final void A00(UserSession userSession, String str) {
        boolean A1R = AbstractC167007dF.A1R(0, userSession, str);
        C49580LvZ c49580LvZ = SuggestionsDatabase.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(SuggestionsDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (c49580LvZ) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(SuggestionsDatabase.class);
                if (igRoomDatabase == null) {
                    C1Ye A0K = AbstractC43594JPz.A0K(userSession, c49580LvZ, SuggestionsDatabase.class);
                    AbstractC28241Yh.A00(A0K, 1771825795, 1771825795, false);
                    igRoomDatabase = AbstractC43594JPz.A0k(A0K, userSession, SuggestionsDatabase.class);
                }
            }
        }
        C47915LEj A002 = ((SuggestionsDatabase) igRoomDatabase).A00();
        C1YP c1yp = A002.A01;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = A002.A02;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADp(A1R ? 1 : 0, str);
        try {
            c1yp.beginTransaction();
            try {
                acquire.ATb();
                c1yp.setTransactionSuccessful();
            } finally {
                c1yp.endTransaction();
            }
        } finally {
            abstractC29601bb.release(acquire);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(3:15|16|17)(2:12|13))(11:18|19|20|(1:22)(2:10a|44)|23|(4:26|(3:28|29|30)(1:32)|31|24)|33|34|(1:36)|16|17))(1:49))(4:60|(1:52)|71|(1:73))|50|(3:52|(1:54)(1:59)|(9:56|(1:58)|20|(0)(0)|23|(1:24)|33|34|(0)))|16|17))|75|6|7|(0)(0)|50|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0133, code lost:
    
        X.C18950wb.A01.AEp("Unable to insert suggestion media", 817897079);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7 A[Catch: SQLiteConstraintException -> 0x0133, TryCatch #1 {SQLiteConstraintException -> 0x0133, blocks: (B:15:0x002f, B:19:0x00dc, B:20:0x00df, B:22:0x00e7, B:23:0x00e9, B:24:0x00f1, B:26:0x00f7, B:29:0x0106, B:34:0x011a, B:37:0x010a, B:48:0x0132, B:52:0x00a3, B:54:0x00ab, B:56:0x00b1, B:39:0x010b, B:41:0x010f, B:42:0x0116, B:43:0x0118), top: B:7:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f7 A[Catch: SQLiteConstraintException -> 0x0133, TryCatch #1 {SQLiteConstraintException -> 0x0133, blocks: (B:15:0x002f, B:19:0x00dc, B:20:0x00df, B:22:0x00e7, B:23:0x00e9, B:24:0x00f1, B:26:0x00f7, B:29:0x0106, B:34:0x011a, B:37:0x010a, B:48:0x0132, B:52:0x00a3, B:54:0x00ab, B:56:0x00b1, B:39:0x010b, B:41:0x010f, B:42:0x0116, B:43:0x0118), top: B:7:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a A[Catch: SQLiteConstraintException -> 0x0133, TRY_LEAVE, TryCatch #1 {SQLiteConstraintException -> 0x0133, blocks: (B:15:0x002f, B:19:0x00dc, B:20:0x00df, B:22:0x00e7, B:23:0x00e9, B:24:0x00f1, B:26:0x00f7, B:29:0x0106, B:34:0x011a, B:37:0x010a, B:48:0x0132, B:52:0x00a3, B:54:0x00ab, B:56:0x00b1, B:39:0x010b, B:41:0x010f, B:42:0x0116, B:43:0x0118), top: B:7:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3 A[Catch: SQLiteConstraintException -> 0x0133, TRY_ENTER, TryCatch #1 {SQLiteConstraintException -> 0x0133, blocks: (B:15:0x002f, B:19:0x00dc, B:20:0x00df, B:22:0x00e7, B:23:0x00e9, B:24:0x00f1, B:26:0x00f7, B:29:0x0106, B:34:0x011a, B:37:0x010a, B:48:0x0132, B:52:0x00a3, B:54:0x00ab, B:56:0x00b1, B:39:0x010b, B:41:0x010f, B:42:0x0116, B:43:0x0118), top: B:7:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r12, java.util.List r13, java.util.List r14, X.InterfaceC23621Ds r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.gallery.suggestions.database.SuggestionsDBHelper.A01(com.instagram.common.session.UserSession, java.util.List, java.util.List, X.1Ds):java.lang.Object");
    }
}
