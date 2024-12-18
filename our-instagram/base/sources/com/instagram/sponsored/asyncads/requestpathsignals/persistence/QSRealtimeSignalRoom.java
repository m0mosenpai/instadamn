package com.instagram.sponsored.asyncads.requestpathsignals.persistence;

import X.AbstractC28241Yh;
import X.AbstractC43594JPz;
import X.C1Ye;
import X.LJY;
import X.MSW;
import X.P9S;
import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.sponsored.asyncads.requestpathsignals.persistence.room.QSRealtimeSignalDatabase;
import com.instagram.sponsored.asyncads.requestpathsignals.persistence.room.QSRealtimeSignalDatabase_Impl;

/* loaded from: classes9.dex */
public final class QSRealtimeSignalRoom {
    public final UserSession A00;
    public final LJY A01;
    public final QSRealtimeSignalDatabase A02;

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0115, code lost:
    
        if (r2 == r3) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.1JX] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.LinkedHashMap, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(final java.util.Collection r22, X.InterfaceC23621Ds r23, final long r24) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.sponsored.asyncads.requestpathsignals.persistence.QSRealtimeSignalRoom.A00(java.util.Collection, X.1Ds, long):java.lang.Object");
    }

    public QSRealtimeSignalRoom(UserSession userSession) {
        LJY ljy;
        this.A00 = userSession;
        P9S p9s = QSRealtimeSignalDatabase.A00;
        IgRoomDatabase A0p = MSW.A0p(userSession, QSRealtimeSignalDatabase.class);
        if (A0p == null) {
            synchronized (p9s) {
                A0p = MSW.A0p(userSession, QSRealtimeSignalDatabase.class);
                if (A0p == null) {
                    C1Ye A0K = AbstractC43594JPz.A0K(userSession, p9s, QSRealtimeSignalDatabase.class);
                    AbstractC28241Yh.A00(A0K, 1648458087, 1195563475, false);
                    A0p = AbstractC43594JPz.A0k(A0K, userSession, QSRealtimeSignalDatabase.class);
                }
            }
        }
        QSRealtimeSignalDatabase qSRealtimeSignalDatabase = (QSRealtimeSignalDatabase) A0p;
        this.A02 = qSRealtimeSignalDatabase;
        QSRealtimeSignalDatabase_Impl qSRealtimeSignalDatabase_Impl = (QSRealtimeSignalDatabase_Impl) qSRealtimeSignalDatabase;
        if (qSRealtimeSignalDatabase_Impl.A00 != null) {
            ljy = qSRealtimeSignalDatabase_Impl.A00;
        } else {
            synchronized (qSRealtimeSignalDatabase_Impl) {
                if (qSRealtimeSignalDatabase_Impl.A00 == null) {
                    qSRealtimeSignalDatabase_Impl.A00 = new LJY(qSRealtimeSignalDatabase_Impl);
                }
                ljy = qSRealtimeSignalDatabase_Impl.A00;
            }
        }
        this.A01 = ljy;
    }
}
