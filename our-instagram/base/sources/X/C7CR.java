package X;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.locationsharing.core.models.LiveLocationSharer;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.7CR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7CR {
    public final Context A03;
    public final UserSession A04;
    public volatile C7CX A05;
    public final Executor A01 = new C14140ne(163434731, 2, false, false);
    public final Executor A02 = C7CS.A00;
    public final C7CT A00 = new C7CU() { // from class: X.7CT
        public final Map A00 = new LinkedHashMap();

        @Override // X.C7CU
        public final void FDG(InterfaceC65635Tpw interfaceC65635Tpw, LiveLocationSharer liveLocationSharer, String str) {
            C14360o3.A0B(liveLocationSharer, 1);
            this.A00.put(liveLocationSharer.A04, liveLocationSharer);
            interfaceC65635Tpw.onSuccess();
        }

        @Override // X.C7CU
        public final void FDH(InterfaceC65635Tpw interfaceC65635Tpw, String str, List list) {
            C14360o3.A0B(list, 1);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LiveLocationSharer liveLocationSharer = (LiveLocationSharer) it.next();
                this.A00.put(liveLocationSharer.A04, liveLocationSharer);
            }
            interfaceC65635Tpw.onSuccess();
        }

        @Override // X.C7CU
        public final void BuS(InterfaceC65636Tpx interfaceC65636Tpx, String str) {
            interfaceC65636Tpx.onSuccess(ImmutableList.copyOf((Collection) AbstractC001800i.A0X(this.A00.values())));
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [X.7CT] */
    public C7CR(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = userSession;
    }

    public final C7CX A00() {
        C7CX c7cx = this.A05;
        if (c7cx == null) {
            final Context context = this.A03;
            final String str = this.A04.userId;
            C7CX c7cx2 = new C7CX(new C7CW(context, str) { // from class: X.7CV
                public final Context A00;
                public final String A01;

                /* JADX WARN: Not initialized variable reg: 5, insn: 0x0105: INVOKE (r5 I:X.YA8) VIRTUAL call: X.YA8.close():void A[Catch: all -> 0x0109, MD:():void (m), TRY_ENTER, TRY_LEAVE] (LINE:261), block:B:27:0x0105 */
                private Pair A00(String str2) {
                    YA8 close;
                    Cursor query;
                    YA8 ya8;
                    long j;
                    Cursor query2;
                    YAC A00 = YAC.A00(this.A00);
                    String str3 = this.A01;
                    long j2 = 0;
                    try {
                        if (str3.isEmpty()) {
                            Object[] objArr = {"live_location_sessions ", new String[]{"_id", "start_time_millis"}, "groupish_id = ?", new String[]{String.valueOf(str2)}, null, null, null};
                            if (objArr[5] != null) {
                                query2 = A00.AX9().rawQuery((String) objArr[5], (String[]) objArr[6]);
                            } else {
                                query2 = A00.AX9().query((String) objArr[0], (String[]) objArr[1], (String) objArr[2], (String[]) objArr[3], null, null, (String) objArr[4]);
                            }
                            ya8 = new YA8(query2);
                            j = 0;
                            while (ya8.moveToNext()) {
                                Cursor cursor = ya8.A01;
                                j2 = cursor.getLong(0);
                                j = cursor.getLong(1);
                            }
                        } else {
                            Object[] objArr2 = {"live_location_sessions ", new String[]{"_id", "start_time_millis"}, "groupish_id = ? AND user_alias_id = ?", new String[]{String.valueOf(str2), String.valueOf(str3)}, null, null, null};
                            if (objArr2[5] != null) {
                                query = A00.AX9().rawQuery((String) objArr2[5], (String[]) objArr2[6]);
                            } else {
                                query = A00.AX9().query((String) objArr2[0], (String[]) objArr2[1], (String) objArr2[2], (String[]) objArr2[3], null, null, (String) objArr2[4]);
                            }
                            ya8 = new YA8(query);
                            j = 0;
                            while (ya8.moveToNext()) {
                                Cursor cursor2 = ya8.A01;
                                j2 = cursor2.getLong(0);
                                j = cursor2.getLong(1);
                            }
                        }
                        ya8.close();
                        return Pair.create(Long.valueOf(j2), Long.valueOf(j));
                    } catch (Throwable th) {
                        try {
                            close.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                }

                @Override // X.C7CW
                public final void AOk(InterfaceC65635Tpw interfaceC65635Tpw, String str2) {
                    YAC A00 = YAC.A00(this.A00);
                    Xkw xkw = new Xkw();
                    AbstractC09780fb.A01("DirectTransactionExecutor.startTransaction", 464807821);
                    Y42 y42 = new Y42(xkw, A00);
                    y42.A03();
                    try {
                        XS8 xs8 = new XS8();
                        C68897Vdu c68897Vdu = Y42.A00(y42).A03.A00;
                        ArrayList arrayList = c68897Vdu.A00;
                        if (!arrayList.contains(InterfaceC73584YMg.class)) {
                            arrayList.add(InterfaceC73584YMg.class);
                        }
                        c68897Vdu.A01.add(xs8);
                        YPZ ypz = ((XS5) AbstractC72543XgC.A00(xs8, y42)).A00;
                        ypz.EOz(0L, 0);
                        ypz.EOz((Long) A00(str2).first, 1);
                        ypz.ABp();
                        y42.A02();
                        y42.A01();
                        interfaceC65635Tpw.onSuccess();
                    } catch (Throwable th) {
                        y42.A01();
                        throw th;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r27v0, types: [X.WUC] */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r5v21 */
                /* JADX WARN: Type inference failed for: r5v22 */
                /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
                @Override // X.C7CW
                public final void AYs(WUC wuc, String str2) {
                    Object obj;
                    LiveLocationSession liveLocationSession;
                    Cursor query;
                    ?? r5 = this.A01;
                    boolean isEmpty = r5.isEmpty();
                    YAC A00 = YAC.A00(this.A00);
                    String[] strArr = {"_id", "user_alias_id", AbstractC58461Pvm.A00(9, 10, 49), "optimistic_session_id", "groupish_id", "start_time_millis", "expiration_time_millis", "message_id"};
                    try {
                        if (isEmpty) {
                            obj = null;
                            Object[] objArr = {"live_location_sessions ", strArr, "groupish_id = ? AND (expiration_time_millis > 0 OR expiration_time_millis = -1)", new String[]{String.valueOf(str2)}, null, null, null};
                            if (objArr[5] != null) {
                                query = A00.AX9().rawQuery((String) objArr[5], (String[]) objArr[6]);
                            } else {
                                query = A00.AX9().query((String) objArr[0], (String[]) objArr[1], (String) objArr[2], (String[]) objArr[3], null, null, (String) objArr[4]);
                            }
                            if (query != null) {
                                liveLocationSession = null;
                                while (!query.isClosed()) {
                                    if (query.moveToNext()) {
                                        long j = query.getLong(6);
                                        String string = query.getString(4);
                                        AbstractC63311ShH.A04(string, "groupishId");
                                        String string2 = query.getString(2);
                                        AbstractC63311ShH.A04(string2, "sessionId");
                                        String string3 = query.getString(1);
                                        AbstractC63311ShH.A04(string3, "userAliasId");
                                        long j2 = query.getLong(5);
                                        boolean z = false;
                                        if (query.getInt(3) != 0) {
                                            z = true;
                                        }
                                        liveLocationSession = new LiveLocationSession(string, query.getString(7), string2, string3, j, j2, z);
                                    } else {
                                        query.close();
                                    }
                                }
                                String stackTraceString = android.util.Log.getStackTraceString(null);
                                C0K8.A0C("AbstractDAOItem", stackTraceString);
                                throw new IllegalStateException(AnonymousClass001.A0R("Can't access DAO when it is already closed: ", stackTraceString));
                            }
                            throw new IllegalArgumentException("cursor is null");
                        }
                        obj = null;
                        Object[] objArr2 = {"live_location_sessions ", strArr, "groupish_id = ? AND user_alias_id = ? AND (expiration_time_millis > 0 OR expiration_time_millis = -1)", new String[]{String.valueOf(str2), String.valueOf((Object) r5)}, null, null, null};
                        if (objArr2[5] != null) {
                            r5 = A00.AX9().rawQuery((String) objArr2[5], (String[]) objArr2[6]);
                        } else {
                            r5 = A00.AX9().query((String) objArr2[0], (String[]) objArr2[1], (String) objArr2[2], (String[]) objArr2[3], null, null, (String) objArr2[4]);
                        }
                        if (r5 != 0) {
                            liveLocationSession = null;
                            while (!r5.isClosed()) {
                                if (r5.moveToNext()) {
                                    long j3 = r5.getLong(6);
                                    String string4 = r5.getString(4);
                                    AbstractC63311ShH.A04(string4, "groupishId");
                                    String string5 = r5.getString(2);
                                    AbstractC63311ShH.A04(string5, "sessionId");
                                    String string6 = r5.getString(1);
                                    AbstractC63311ShH.A04(string6, "userAliasId");
                                    long j4 = r5.getLong(5);
                                    boolean z2 = false;
                                    if (r5.getInt(3) != 0) {
                                        z2 = true;
                                    }
                                    liveLocationSession = new LiveLocationSession(string4, r5.getString(7), string5, string6, j3, j4, z2);
                                } else {
                                    r5.close();
                                }
                            }
                            String stackTraceString2 = android.util.Log.getStackTraceString(null);
                            C0K8.A0C("AbstractDAOItem", stackTraceString2);
                            throw new IllegalStateException(AnonymousClass001.A0R("Can't access DAO when it is already closed: ", stackTraceString2));
                        }
                        throw new IllegalArgumentException("cursor is null");
                        if (liveLocationSession != null) {
                            long j5 = liveLocationSession.A00;
                            if (j5 == -1 || j5 > System.currentTimeMillis()) {
                                wuc.onSuccess(liveLocationSession);
                                return;
                            }
                        }
                        wuc.A00(obj);
                    } catch (Throwable th) {
                        try {
                            r5.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                }

                @Override // X.C7CW
                public final void AYt(InterfaceC65636Tpx interfaceC65636Tpx) {
                    Cursor query;
                    String str2 = this.A01;
                    boolean isEmpty = str2.isEmpty();
                    ImmutableList.Builder builder = ImmutableList.builder();
                    YAC A00 = YAC.A00(this.A00);
                    try {
                        if (isEmpty) {
                            Object[] objArr = {"live_location_sessions ", new String[]{"_id", "user_alias_id", AbstractC58461Pvm.A00(9, 10, 49), "optimistic_session_id", "groupish_id", "start_time_millis", "expiration_time_millis", "message_id"}, "expiration_time_millis > 0 OR expiration_time_millis = -1", null, null, null, null};
                            if (objArr[5] != null) {
                                query = A00.AX9().rawQuery((String) objArr[5], (String[]) objArr[6]);
                            } else {
                                query = A00.AX9().query((String) objArr[0], (String[]) objArr[1], (String) objArr[2], (String[]) objArr[3], null, null, (String) objArr[4]);
                            }
                            if (query == null) {
                                throw new IllegalArgumentException("cursor is null");
                            }
                            while (!query.isClosed()) {
                                if (query.moveToNext()) {
                                    long j = query.getLong(6);
                                    String string = query.getString(4);
                                    AbstractC63311ShH.A04(string, "groupishId");
                                    String string2 = query.getString(2);
                                    AbstractC63311ShH.A04(string2, "sessionId");
                                    String string3 = query.getString(1);
                                    AbstractC63311ShH.A04(string3, "userAliasId");
                                    long j2 = query.getLong(5);
                                    boolean z = false;
                                    if (query.getInt(3) != 0) {
                                        z = true;
                                    }
                                    LiveLocationSession liveLocationSession = new LiveLocationSession(string, query.getString(7), string2, string3, j, j2, z);
                                    long j3 = liveLocationSession.A00;
                                    if (j3 == -1 || j3 > System.currentTimeMillis()) {
                                        builder.add((Object) liveLocationSession);
                                    }
                                }
                            }
                            String stackTraceString = android.util.Log.getStackTraceString(null);
                            C0K8.A0C("AbstractDAOItem", stackTraceString);
                            throw new IllegalStateException(AnonymousClass001.A0R("Can't access DAO when it is already closed: ", stackTraceString));
                        }
                        Object[] objArr2 = {"live_location_sessions ", new String[]{"_id", "user_alias_id", AbstractC58461Pvm.A00(9, 10, 49), "optimistic_session_id", "groupish_id", "start_time_millis", "expiration_time_millis", "message_id"}, "user_alias_id = ? AND (expiration_time_millis > 0 OR expiration_time_millis = -1)", new String[]{String.valueOf(str2)}, null, null, null};
                        if (objArr2[5] != null) {
                            query = A00.AX9().rawQuery((String) objArr2[5], (String[]) objArr2[6]);
                        } else {
                            query = A00.AX9().query((String) objArr2[0], (String[]) objArr2[1], (String) objArr2[2], (String[]) objArr2[3], null, null, (String) objArr2[4]);
                        }
                        if (query == null) {
                            throw new IllegalArgumentException("cursor is null");
                        }
                        while (!query.isClosed()) {
                            if (query.moveToNext()) {
                                long j4 = query.getLong(6);
                                String string4 = query.getString(4);
                                AbstractC63311ShH.A04(string4, "groupishId");
                                String string5 = query.getString(2);
                                AbstractC63311ShH.A04(string5, "sessionId");
                                String string6 = query.getString(1);
                                AbstractC63311ShH.A04(string6, "userAliasId");
                                long j5 = query.getLong(5);
                                boolean z2 = false;
                                if (query.getInt(3) != 0) {
                                    z2 = true;
                                }
                                LiveLocationSession liveLocationSession2 = new LiveLocationSession(string4, query.getString(7), string5, string6, j4, j5, z2);
                                long j6 = liveLocationSession2.A00;
                                if (j6 == -1 || j6 > System.currentTimeMillis()) {
                                    builder.add((Object) liveLocationSession2);
                                }
                            }
                        }
                        String stackTraceString2 = android.util.Log.getStackTraceString(null);
                        C0K8.A0C("AbstractDAOItem", stackTraceString2);
                        throw new IllegalStateException(AnonymousClass001.A0R("Can't access DAO when it is already closed: ", stackTraceString2));
                        query.close();
                        interfaceC65636Tpx.onSuccess(builder.build());
                    } catch (Throwable th) {
                        try {
                            query.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v133, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v137 */
                /* JADX WARN: Type inference failed for: r0v143 */
                /* JADX WARN: Type inference failed for: r0v68, types: [X.YQO] */
                /* JADX WARN: Type inference failed for: r0v69, types: [int, X.YQO] */
                /* JADX WARN: Type inference failed for: r0v87 */
                /* JADX WARN: Type inference failed for: r0v88, types: [X.Xku, int] */
                /* JADX WARN: Type inference failed for: r0v93 */
                /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v1, types: [int] */
                /* JADX WARN: Type inference failed for: r2v2, types: [X.Y42] */
                /* JADX WARN: Type inference failed for: r2v6, types: [X.Y42] */
                /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object[]] */
                @Override // X.C7CW
                public final void FDF(InterfaceC65635Tpw interfaceC65635Tpw, LiveLocationSession liveLocationSession) {
                    Y42 y42;
                    Y0B y0b;
                    boolean z;
                    SQLiteStatement sQLiteStatement;
                    String str2;
                    ?? r0;
                    int length;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    String str8 = liveLocationSession.A02;
                    Pair A00 = A00(str8);
                    long longValue = ((Number) A00.first).longValue();
                    long longValue2 = ((Number) A00.second).longValue();
                    ?? r2 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                    YAC A002 = YAC.A00(this.A00);
                    try {
                        if (r2 == 0) {
                            Xkw xkw = new Xkw();
                            AbstractC09780fb.A01("DirectTransactionExecutor.startTransaction", 464807821);
                            r2 = new Y42(xkw, A002);
                            r2.A03();
                            XS7 xs7 = new XS7();
                            C68897Vdu c68897Vdu = Y42.A00(r2).A03.A00;
                            ArrayList arrayList = c68897Vdu.A00;
                            if (!arrayList.contains(InterfaceC73584YMg.class)) {
                                arrayList.add(InterfaceC73584YMg.class);
                            }
                            c68897Vdu.A01.add(xs7);
                            r2.A05.A00++;
                            YQO yqo = r2.A04;
                            Xkw xkw2 = r2.A03;
                            Object[] objArr = xs7.A01;
                            C72675Xku c72675Xku = r2.A02;
                            synchronized (xkw2) {
                                try {
                                    String str9 = (String) objArr[0];
                                    String str10 = (String) objArr[1];
                                    String[] strArr = (String[]) objArr[4];
                                    String[] strArr2 = (String[]) objArr[2];
                                    String str11 = (String) objArr[6];
                                    C005001p c005001p = xkw2.A00;
                                    y0b = (Y0B) c005001p.get(str9);
                                    if (y0b == null) {
                                        y0b = new Y0B(str10, str11, strArr, strArr2);
                                        c005001p.put(str9, y0b);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            String[] strArr3 = (String[]) objArr[2];
                            int intValue = ((Integer) objArr[3]).intValue();
                            String[] strArr4 = (String[]) objArr[4];
                            int[] iArr = (int[]) objArr[5];
                            int intValue2 = ((Integer) objArr[7]).intValue();
                            String str12 = (String) objArr[8];
                            int intValue3 = ((Integer) objArr[9]).intValue();
                            if (str12 == null) {
                                intValue3 = strArr3.length + intValue2;
                            }
                            ?? r7 = new Object[intValue3];
                            if (intValue == 5) {
                                String str13 = liveLocationSession.A04;
                                if (str13 == null) {
                                    str13 = null;
                                }
                                r7[1] = str13;
                                String str14 = liveLocationSession.A05;
                                int i = 0;
                                if (str14 == null) {
                                    str14 = null;
                                }
                                r7[0] = str14;
                                Boolean valueOf = Boolean.valueOf(liveLocationSession.A06);
                                if (valueOf == null) {
                                    valueOf = null;
                                }
                                r7[2] = valueOf;
                                if (str8 == null) {
                                    str8 = null;
                                }
                                r7[3] = str8;
                                Long valueOf2 = Long.valueOf(liveLocationSession.A01);
                                if (valueOf2 == null) {
                                    valueOf2 = null;
                                }
                                r7[4] = valueOf2;
                                Long valueOf3 = Long.valueOf(liveLocationSession.A00);
                                if (valueOf3 == null) {
                                    valueOf3 = null;
                                }
                                r7[5] = valueOf3;
                                String str15 = liveLocationSession.A03;
                                ?? r02 = str15;
                                if (str15 == null) {
                                    r02 = 0;
                                }
                                r7[6] = r02;
                                SQLiteDatabase AX9 = r02.AX9();
                                int length2 = strArr4.length;
                                String[] strArr5 = new String[length2];
                                for (int i2 = 0; i2 < length2; i2++) {
                                    ?? r03 = r7[iArr[i2]];
                                    if (r03 != 0) {
                                        str7 = r03.toString();
                                    } else {
                                        str7 = null;
                                    }
                                    strArr5[i2] = str7;
                                }
                                long j = -1;
                                if (length2 > 0) {
                                    synchronized (y0b) {
                                        try {
                                            C72776Xmv A003 = Y0B.A00(AX9, y0b);
                                            int i3 = 0;
                                            int i4 = 0;
                                            do {
                                                if (strArr5[i3] == null) {
                                                    i4 |= 1 << i3;
                                                }
                                                i3++;
                                            } while (i3 < length2);
                                            SparseArray sparseArray = A003.A03;
                                            str5 = (String) sparseArray.get(i4);
                                            if (str5 == null) {
                                                String str16 = y0b.A00;
                                                String[] strArr6 = y0b.A03;
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("SELECT ");
                                                sb.append("_id");
                                                sb.append(" FROM ");
                                                sb.append(str16);
                                                sb.append(" WHERE ");
                                                for (int i5 = 0; i5 < strArr6.length; i5++) {
                                                    if (i5 > 0) {
                                                        sb.append(" AND ");
                                                    }
                                                    sb.append(strArr6[i5]);
                                                    if (strArr5[i5] == null) {
                                                        str6 = " IS NULL";
                                                    } else {
                                                        str6 = "=?";
                                                    }
                                                    sb.append(str6);
                                                }
                                                sb.append(" LIMIT 1");
                                                str5 = sb.toString();
                                                sparseArray.put(i4, str5);
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(length2);
                                    int i6 = 0;
                                    do {
                                        String str17 = strArr5[i6];
                                        if (str17 != null) {
                                            arrayList2.add(str17);
                                        }
                                        i6++;
                                    } while (i6 < length2);
                                    Cursor rawQuery = AX9.rawQuery(str5, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                                    j = -1;
                                    try {
                                        int columnCount = rawQuery.getColumnCount();
                                        if (columnCount <= 1) {
                                            if (rawQuery.moveToFirst()) {
                                                j = rawQuery.getLong(0);
                                            }
                                            rawQuery.close();
                                        } else {
                                            throw new IllegalArgumentException(AnonymousClass001.A0O("Expected 1 column, got ", columnCount));
                                        }
                                    } catch (Throwable th3) {
                                        rawQuery.close();
                                        throw th3;
                                    }
                                }
                                ?? r04 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                                if (r04 == 0) {
                                    z = true;
                                    SQLiteDatabase AX92 = r04.AX9();
                                    synchronized (y0b) {
                                        C72776Xmv A004 = Y0B.A00(AX92, y0b);
                                        sQLiteStatement = A004.A00;
                                        if (sQLiteStatement == null) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("INSERT");
                                            sb2.append(" INTO ");
                                            sb2.append(y0b.A00);
                                            sb2.append('(');
                                            int i7 = 0;
                                            while (true) {
                                                String[] strArr7 = y0b.A02;
                                                length = strArr7.length;
                                                if (i7 >= length) {
                                                    break;
                                                }
                                                if (i7 > 0) {
                                                    str4 = InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1;
                                                } else {
                                                    str4 = "";
                                                }
                                                sb2.append(str4);
                                                sb2.append(strArr7[i7]);
                                                i7++;
                                            }
                                            sb2.append(')');
                                            sb2.append(" VALUES (");
                                            for (int i8 = 0; i8 < length; i8++) {
                                                if (i8 > 0) {
                                                    str3 = ",?";
                                                } else {
                                                    str3 = "?";
                                                }
                                                sb2.append(str3);
                                            }
                                            sb2.append(')');
                                            sQLiteStatement = AX92.compileStatement(sb2.toString());
                                            A004.A00 = sQLiteStatement;
                                        }
                                    }
                                } else {
                                    z = false;
                                    SQLiteDatabase AX93 = r04.AX9();
                                    synchronized (y0b) {
                                        C72776Xmv A005 = Y0B.A00(AX93, y0b);
                                        sQLiteStatement = A005.A01;
                                        if (sQLiteStatement == null) {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("UPDATE ");
                                            sb3.append(y0b.A00);
                                            sb3.append(" SET ");
                                            int i9 = 0;
                                            while (true) {
                                                String[] strArr8 = y0b.A02;
                                                if (i9 >= strArr8.length) {
                                                    break;
                                                }
                                                if (i9 > 0) {
                                                    str2 = InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1;
                                                } else {
                                                    str2 = "";
                                                }
                                                sb3.append(str2);
                                                sb3.append(strArr8[i9]);
                                                sb3.append("=?");
                                                i9++;
                                            }
                                            sb3.append(" WHERE ");
                                            sb3.append("_id");
                                            sb3.append("=?");
                                            sQLiteStatement = AX93.compileStatement(sb3.toString());
                                            A005.A01 = sQLiteStatement;
                                        }
                                    }
                                    sQLiteStatement.bindLong(strArr3.length + 1, j);
                                }
                                while (i < intValue3) {
                                    int i10 = i + 1;
                                    DatabaseUtils.bindObjectToProgram(sQLiteStatement, i10, r7[i]);
                                    i = i10;
                                }
                                try {
                                    if (z) {
                                        C0fW.A00(-2038690264);
                                        sQLiteStatement.executeInsert();
                                        r0 = 123914462;
                                    } else {
                                        C0fW.A00(1426615759);
                                        sQLiteStatement.execute();
                                        r0 = 1848906915;
                                    }
                                    C0fW.A00(r0);
                                    if (r0 != 0) {
                                        r0.A00.A06.A00++;
                                    }
                                    sQLiteStatement.clearBindings();
                                    y42 = r2;
                                } catch (Throwable th4) {
                                    sQLiteStatement.clearBindings();
                                    throw th4;
                                }
                            } else {
                                throw new UnsupportedOperationException();
                            }
                        } else {
                            Xkw xkw3 = new Xkw();
                            AbstractC09780fb.A01("DirectTransactionExecutor.startTransaction", 464807821);
                            Y42 y422 = new Y42(xkw3, A002);
                            y422.A03();
                            XS9 xs9 = new XS9();
                            C68897Vdu c68897Vdu2 = Y42.A00(y422).A03.A00;
                            ArrayList arrayList3 = c68897Vdu2.A00;
                            if (!arrayList3.contains(InterfaceC73584YMg.class)) {
                                arrayList3.add(InterfaceC73584YMg.class);
                            }
                            c68897Vdu2.A01.add(xs9);
                            XS6 xs6 = (XS6) AbstractC72543XgC.A00(xs9, y422);
                            String str18 = liveLocationSession.A04;
                            YPZ ypz = xs6.A00;
                            ypz.EP0(str18, 1);
                            ypz.EP0(liveLocationSession.A05, 0);
                            ypz.EP1(Boolean.valueOf(liveLocationSession.A06), 2);
                            ypz.EOz(Long.valueOf(Math.max(longValue2, liveLocationSession.A01)), 3);
                            ypz.EOz(Long.valueOf(liveLocationSession.A00), 4);
                            ypz.EP0(liveLocationSession.A03, 5);
                            ypz.EOz(Long.valueOf(longValue), 6);
                            ypz.ABp();
                            y42 = y422;
                        }
                        y42.A02();
                        y42.A01();
                        interfaceC65635Tpw.onSuccess();
                    } catch (Throwable th5) {
                        r2.A01();
                        throw th5;
                    }
                }

                {
                    this.A00 = context.getApplicationContext();
                    this.A01 = str;
                }
            }, this.A01, this.A02);
            this.A05 = c7cx2;
            return c7cx2;
        }
        return c7cx;
    }
}
