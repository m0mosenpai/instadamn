package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1Zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28621Zy {
    public static final String[] A0E = {"UPDATE", "DELETE", "INSERT"};
    public final C58336PtW A00;
    public final C1YP A01;
    public final Object A02;
    public final Runnable A03;
    public final Map A04;
    public final Map A05;
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final String[] A07;
    public final C1a5 A08;
    public final C28651a1 A09;
    public final Object A0A;
    public final Map A0B;
    public volatile InterfaceC37561ot A0C;
    public volatile boolean A0D;

    public final void A00(AbstractC126175nE abstractC126175nE) {
        C126485nj c126485nj;
        boolean z;
        C14360o3.A0B(abstractC126175nE, 0);
        String[] strArr = abstractC126175nE.A00;
        C01G c01g = new C01G();
        for (String str : strArr) {
            Map map = this.A05;
            Locale locale = Locale.US;
            C14360o3.A08(locale);
            String lowerCase = str.toLowerCase(locale);
            C14360o3.A07(lowerCase);
            if (map.containsKey(lowerCase)) {
                Object obj = map.get(lowerCase);
                C14360o3.A0A(obj);
                c01g.addAll((Collection) obj);
            } else {
                c01g.add(str);
            }
        }
        String[] strArr2 = (String[]) AbstractC10090gM.A04(c01g).toArray(new String[0]);
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            Map map2 = this.A04;
            Locale locale2 = Locale.US;
            C14360o3.A08(locale2);
            String lowerCase2 = str2.toLowerCase(locale2);
            C14360o3.A07(lowerCase2);
            Object obj2 = map2.get(lowerCase2);
            if (obj2 != null) {
                arrayList.add(obj2);
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0R("There is no table with name ", str2));
            }
        }
        int[] A0x = AbstractC001800i.A0x(arrayList);
        C126485nj c126485nj2 = new C126485nj(abstractC126175nE, A0x, strArr2);
        C58336PtW c58336PtW = this.A00;
        synchronized (c58336PtW) {
            c126485nj = (C126485nj) c58336PtW.A07(abstractC126175nE, c126485nj2);
        }
        if (c126485nj == null) {
            C28651a1 c28651a1 = this.A09;
            int[] copyOf = Arrays.copyOf(A0x, A0x.length);
            C14360o3.A0B(copyOf, 0);
            synchronized (c28651a1) {
                z = false;
                for (int i : copyOf) {
                    long[] jArr = c28651a1.A01;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        c28651a1.A00 = true;
                        z = true;
                    }
                }
            }
            if (z) {
                C1YP c1yp = this.A01;
                if (c1yp.isOpenInternal()) {
                    A02(c1yp.getOpenHelper().CHx());
                }
            }
        }
    }

    public final void A01(AbstractC126175nE abstractC126175nE) {
        C126485nj c126485nj;
        boolean z;
        C14360o3.A0B(abstractC126175nE, 0);
        C58336PtW c58336PtW = this.A00;
        synchronized (c58336PtW) {
            c126485nj = (C126485nj) c58336PtW.A06(abstractC126175nE);
        }
        if (c126485nj != null) {
            C28651a1 c28651a1 = this.A09;
            int[] iArr = c126485nj.A02;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            C14360o3.A0B(copyOf, 0);
            synchronized (c28651a1) {
                z = false;
                for (int i : copyOf) {
                    long[] jArr = c28651a1.A01;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        c28651a1.A00 = true;
                        z = true;
                    }
                }
            }
            if (z) {
                C1YP c1yp = this.A01;
                if (c1yp.isOpenInternal()) {
                    A02(c1yp.getOpenHelper().CHx());
                }
            }
        }
    }

    public final void A02(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        SQLiteDatabase sQLiteDatabase = ((C37471ok) interfaceC37481ol).A00;
        if (!sQLiteDatabase.inTransaction()) {
            try {
                Lock closeLock$room_runtime_release = this.A01.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    synchronized (this.A0A) {
                        int[] A00 = this.A09.A00();
                        if (A00 != null) {
                            if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                                C0fW.A02(sQLiteDatabase, 532084787);
                            } else {
                                interfaceC37481ol.ADS();
                            }
                            try {
                                int length = A00.length;
                                int i = 0;
                                int i2 = 0;
                                while (i < length) {
                                    int i3 = A00[i];
                                    int i4 = i2 + 1;
                                    if (i3 != 1) {
                                        if (i3 == 2) {
                                            String str = this.A07[i2];
                                            String[] strArr = A0E;
                                            int i5 = 0;
                                            do {
                                                String str2 = strArr[i5];
                                                C14360o3.A0B(str, 0);
                                                C14360o3.A0B(str2, 1);
                                                String A0R = AnonymousClass001.A0R("DROP TRIGGER IF EXISTS ", AnonymousClass001.A0k("`room_table_modification_trigger_", str, str2, '_', '`'));
                                                C14360o3.A07(A0R);
                                                interfaceC37481ol.ATG(A0R);
                                                i5++;
                                            } while (i5 < 3);
                                        }
                                    } else {
                                        interfaceC37481ol.ATG(AnonymousClass001.A0c("INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)", i2));
                                        String str3 = this.A07[i2];
                                        String[] strArr2 = A0E;
                                        int i6 = 0;
                                        do {
                                            String str4 = strArr2[i6];
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
                                            C14360o3.A0B(str3, 0);
                                            C14360o3.A0B(str4, 1);
                                            sb.append(AnonymousClass001.A0k("`room_table_modification_trigger_", str3, str4, '_', '`'));
                                            sb.append(" AFTER ");
                                            sb.append(str4);
                                            sb.append(" ON `");
                                            sb.append(str3);
                                            sb.append("` BEGIN UPDATE ");
                                            sb.append("room_table_modification_log");
                                            sb.append(" SET ");
                                            sb.append("invalidated");
                                            sb.append(" = 1");
                                            sb.append(" WHERE ");
                                            sb.append("table_id");
                                            sb.append(" = ");
                                            sb.append(i2);
                                            sb.append(" AND ");
                                            sb.append("invalidated");
                                            sb.append(" = 0");
                                            sb.append("; END");
                                            String obj = sb.toString();
                                            C14360o3.A07(obj);
                                            interfaceC37481ol.ATG(obj);
                                            i6++;
                                        } while (i6 < 3);
                                    }
                                    i++;
                                    i2 = i4;
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                interfaceC37481ol.ASe();
                            } catch (Throwable th) {
                                interfaceC37481ol.ASe();
                                throw th;
                            }
                        }
                    }
                } finally {
                    closeLock$room_runtime_release.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                android.util.Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1a5] */
    public C28621Zy(final C1YP c1yp, Map map, Map map2, String... strArr) {
        this.A01 = c1yp;
        this.A0B = map;
        this.A05 = map2;
        int length = strArr.length;
        this.A09 = new C28651a1(length);
        this.A08 = new Object(c1yp) { // from class: X.1a5
            public final C1YP A00;
            public final java.util.Set A01;

            {
                this.A00 = c1yp;
                java.util.Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                C14360o3.A07(newSetFromMap);
                this.A01 = newSetFromMap;
            }
        };
        this.A00 = new C58336PtW();
        this.A0A = new Object();
        this.A02 = new Object();
        this.A04 = new LinkedHashMap();
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            C14360o3.A08(locale);
            String lowerCase = str.toLowerCase(locale);
            C14360o3.A07(lowerCase);
            this.A04.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.A0B.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                C14360o3.A07(lowerCase);
            }
            strArr2[i] = lowerCase;
        }
        this.A07 = strArr2;
        for (Map.Entry entry : this.A0B.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            C14360o3.A08(locale2);
            String lowerCase2 = str3.toLowerCase(locale2);
            C14360o3.A07(lowerCase2);
            if (this.A04.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                C14360o3.A07(lowerCase3);
                Map map3 = this.A04;
                C14360o3.A0B(map3, 0);
                map3.put(lowerCase3, AbstractC09990gB.A0I(lowerCase2, map3));
            }
        }
        this.A03 = new Runnable() { // from class: X.1aA
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:59:0x012b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:63:0x00d2 A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.util.AbstractCollection, X.01G] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 319
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC28721aA.run():void");
            }
        };
    }
}
