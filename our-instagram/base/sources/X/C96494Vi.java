package X;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.reels.persistence.room.UserReelMediaDatabase;
import com.instagram.reels.persistence.room.UserReelMediaDatabase_Impl;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4Vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96494Vi {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C96504Vj A04;
    public final C96534Vo A05;
    public final UserReelMediaDatabase A06;
    public final Map A07;

    public C96494Vi(UserSession userSession, int i, long j, long j2) {
        C96534Vo c96534Vo;
        C14360o3.A0B(userSession, 1);
        this.A02 = j;
        this.A03 = j2;
        this.A00 = i;
        this.A04 = new C96504Vj(userSession);
        this.A07 = new ConcurrentHashMap();
        this.A01 = i;
        C96514Vl c96514Vl = UserReelMediaDatabase.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(UserReelMediaDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (c96514Vl) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(UserReelMediaDatabase.class);
                if (igRoomDatabase == null) {
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    C1Ye A00 = C1Yc.A00(context, UserReelMediaDatabase.class, C1YZ.A00(userSession, c96514Vl));
                    AbstractC28241Yh.A00(A00, 765, 764, true);
                    A00.A01();
                    igRoomDatabase = (IgRoomDatabase) A00.A00();
                    userSession.A04(UserReelMediaDatabase.class, igRoomDatabase);
                }
            }
        }
        UserReelMediaDatabase userReelMediaDatabase = (UserReelMediaDatabase) igRoomDatabase;
        this.A06 = userReelMediaDatabase;
        UserReelMediaDatabase_Impl userReelMediaDatabase_Impl = (UserReelMediaDatabase_Impl) userReelMediaDatabase;
        if (userReelMediaDatabase_Impl.A00 != null) {
            c96534Vo = userReelMediaDatabase_Impl.A00;
        } else {
            synchronized (userReelMediaDatabase_Impl) {
                if (userReelMediaDatabase_Impl.A00 == null) {
                    userReelMediaDatabase_Impl.A00 = new C96534Vo(userReelMediaDatabase_Impl);
                }
                c96534Vo = userReelMediaDatabase_Impl.A00;
            }
        }
        this.A05 = c96534Vo;
        this.A07.putAll(A00());
    }

    public final HashMap A00() {
        HashMap hashMap = new HashMap();
        try {
            C96534Vo c96534Vo = this.A05;
            long max = Math.max(this.A03, System.currentTimeMillis() - this.A02);
            int i = this.A01;
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00("\n    SELECT id, media_ids\n    FROM user_reel_medias\n    WHERE stored_time > ?\n    ORDER BY stored_time DESC\n    LIMIT ?\n  ", 2);
            A00.ADi(1, max);
            A00.ADi(2, i);
            C1YP c1yp = c96534Vo.A01;
            c1yp.assertNotSuspendingTransaction();
            Cursor query = c1yp.query(A00, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    arrayList.add(new C9C9(query.getString(0), query.getString(1), 11));
                }
                query.close();
                A00.A00();
                arrayList.size();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C9C9 c9c9 = (C9C9) it.next();
                    String str = c9c9.A00;
                    String str2 = c9c9.A01;
                    C14360o3.A0B(str2, 0);
                    hashMap.put(str, AbstractC001900j.A0R(str2, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0));
                }
                return hashMap;
            } catch (Throwable th) {
                query.close();
                A00.A00();
                throw th;
            }
        } catch (Exception e) {
            C0K8.A0F("UserReelMediasRoom", "Failed to load user reel media ids from room", e);
            C0w9.A03("UserReelMediasRoom", AnonymousClass001.A0R("Failed to load user reel media ids from room ", e.getMessage()));
            return hashMap;
        }
    }
}
