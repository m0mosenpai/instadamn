package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RMY extends AbstractC63371Sic implements InterfaceC65513Tli {
    public static DecimalFormat A03;
    public final android.net.Uri A00;
    public final C63335Shm A01;
    public final String A02;

    public static void A01(String str, Map map, double d) {
        if (d != 0.0d) {
            DecimalFormat decimalFormat = A03;
            if (decimalFormat == null) {
                decimalFormat = new DecimalFormat("0.######");
                A03 = decimalFormat;
            }
            map.put(str, decimalFormat.format(d));
        }
    }

    @Override // X.InterfaceC65513Tli
    public final android.net.Uri FFl() {
        return this.A00;
    }

    @Override // X.InterfaceC65513Tli
    public final void FFt(C63197Sez c63197Sez) {
        long j;
        int i;
        C60687RMf c60687RMf;
        HashMap A00;
        String str;
        C3U5.A02(c63197Sez);
        C3U5.A08(c63197Sez.A03, "Can't deliver not submitted measurement");
        C3U5.A05("deliver should be called on worker thread");
        C63197Sez c63197Sez2 = new C63197Sez(c63197Sez);
        C60643RFt c60643RFt = (C60643RFt) c63197Sez2.A01(C60643RFt.class);
        if (TextUtils.isEmpty(c60643RFt.A01)) {
            c60687RMf = super.A00.A0C;
            C63335Shm.A02(c60687RMf);
            A00 = A00(c63197Sez2);
            str = "Ignoring measurement without type";
        } else if (TextUtils.isEmpty(c60643RFt.A02)) {
            c60687RMf = super.A00.A0C;
            C63335Shm.A02(c60687RMf);
            A00 = A00(c63197Sez2);
            str = "Ignoring measurement without client id";
        } else {
            RFi rFi = this.A01.A02;
            C3U5.A02(rFi);
            C3U5.A08(AbstractC167007dF.A1M(rFi.A01 ? 1 : 0), "Analytics instance not initialized");
            double d = c60643RFt.A00;
            String str2 = c60643RFt.A02;
            if (d > 0.0d && d < 100.0d) {
                if (!TextUtils.isEmpty(str2)) {
                    i = 0;
                    for (int length = str2.length() - 1; length >= 0; length--) {
                        char charAt = str2.charAt(length);
                        i = ((i << 6) & 268435455) + charAt + (charAt << 14);
                        int i2 = 266338304 & i;
                        if (i2 != 0) {
                            i ^= i2 >> 21;
                        }
                    }
                } else {
                    i = 1;
                }
                if (i % 10000 >= d * 100.0d) {
                    A0E("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                    return;
                }
            }
            HashMap A002 = A00(c63197Sez2);
            A002.put("v", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A002.put("_v", AbstractC62369S8t.A01);
            String str3 = this.A02;
            A002.put("tid", str3);
            C3U5.A08(AbstractC167007dF.A1M(rFi.A01 ? 1 : 0), "Analytics instance not initialized");
            if (rFi.A02) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                Iterator A14 = AbstractC166997dE.A14(A002);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    if (A1C.length() != 0) {
                        AbstractC58318PtA.A1S(A1C);
                    }
                    A1C.append(AbstractC31172DnG.A17(A1K));
                    A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                    A1C.append(AbstractC58318PtA.A0p(A1K));
                }
                AbstractC63371Sic.A08(this, A1C.toString(), null, null, "Dry run is enabled. GoogleAnalytics would have sent", 4);
                return;
            }
            HashMap A1G = AbstractC166987dD.A1G();
            AbstractC63066Sbn.A02(A1G, "uid", c60643RFt.A03);
            C60645RFv c60645RFv = (C60645RFv) ((AbstractC63157Se6) c63197Sez.A09.get(C60645RFv.class));
            if (c60645RFv != null) {
                AbstractC63066Sbn.A02(A1G, "an", c60645RFv.A00);
                AbstractC63066Sbn.A02(A1G, "aid", c60645RFv.A02);
                AbstractC63066Sbn.A02(A1G, "av", c60645RFv.A01);
                AbstractC63066Sbn.A02(A1G, "aiid", c60645RFv.A03);
            }
            SIQ siq = new SIQ(c60643RFt.A02, str3, A1G, 0L, AbstractC31171DnF.A1X(c60643RFt.A04));
            C63335Shm c63335Shm = super.A00;
            C60683RMb c60683RMb = c63335Shm.A06;
            C63335Shm.A02(c60683RMb);
            c60683RMb.A0I();
            SX6.A00();
            C60692RMk c60692RMk = c60683RMb.A00;
            c60692RMk.A0I();
            SX6.A00();
            try {
                try {
                    C60693RMl c60693RMl = c60692RMk.A04;
                    c60693RMl.A0I();
                    C0fW.A01(c60693RMl.A0J(), -1896096357);
                    String str4 = siq.A01;
                    C3U5.A04(str4);
                    c60693RMl.A0I();
                    SX6.A00();
                    SQLiteDatabase A0J = c60693RMl.A0J();
                    String valueOf = String.valueOf(0L);
                    int i3 = 0;
                    int delete = A0J.delete("properties", "app_uid=? AND cid<>?", new String[]{valueOf, str4});
                    if (delete > 0) {
                        c60693RMl.A0D("Deleted property records", Integer.valueOf(delete));
                    }
                    String str5 = siq.A02;
                    C3U5.A04(str4);
                    C3U5.A04(str5);
                    c60693RMl.A0I();
                    SX6.A00();
                    j = C60693RMl.A01(c60693RMl, "SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{valueOf, str4, str5});
                    siq.A00 = 1 + j;
                    c60693RMl.A0I();
                    SX6.A00();
                    SQLiteDatabase A0J2 = c60693RMl.A0J();
                    Map map = siq.A03;
                    C3U5.A02(map);
                    Uri.Builder builder = new Uri.Builder();
                    Iterator A15 = AbstractC166997dE.A15(map);
                    while (A15.hasNext()) {
                        Map.Entry A1K2 = AbstractC166987dD.A1K(A15);
                        builder.appendQueryParameter(AbstractC31172DnG.A17(A1K2), AbstractC58318PtA.A0p(A1K2));
                    }
                    String encodedQuery = builder.build().getEncodedQuery();
                    if (encodedQuery == null) {
                        encodedQuery = "";
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_uid", (Long) 0L);
                    contentValues.put("cid", str4);
                    contentValues.put("tid", str5);
                    if (siq.A04) {
                        i3 = 1;
                    }
                    AbstractC58318PtA.A1B(contentValues, "adid", i3);
                    contentValues.put("hits_count", Long.valueOf(siq.A00));
                    contentValues.put("params", encodedQuery);
                    try {
                        C0fW.A00(-1992842745);
                        long insertWithOnConflict = A0J2.insertWithOnConflict("properties", null, contentValues, 5);
                        C0fW.A00(-1447504665);
                        if (insertWithOnConflict == -1) {
                            AbstractC63371Sic.A09(c60693RMl, "Failed to insert/update a property (got -1)", 6);
                        }
                    } catch (SQLiteException e) {
                        c60693RMl.A0G("Error storing a property", e);
                    }
                    c60693RMl.A0I();
                    c60693RMl.A0J().setTransactionSuccessful();
                    try {
                        c60693RMl.A0L();
                    } catch (SQLiteException e2) {
                        c60692RMk.A0G("Failed to end transaction", e2);
                    }
                    if (j == 0) {
                        SX6.A00();
                        c60692RMk.A0E("Sending first hit to property", str5);
                        C63335Shm c63335Shm2 = ((AbstractC63371Sic) c60692RMk).A00;
                        C60688RMg c60688RMg = c63335Shm2.A0D;
                        C63335Shm.A02(c60688RMg);
                        if (!new SYI(((AbstractC63371Sic) c60688RMg).A00.A04, c60688RMg.A0J()).A00(AbstractC166987dD.A0N(SVM.A04.A00))) {
                            C63335Shm.A02(c60688RMg);
                            SX6.A00();
                            c60688RMg.A0I();
                            String string = c60688RMg.A00.getString("installation_campaign", null);
                            if (TextUtils.isEmpty(string)) {
                                string = null;
                            }
                            if (!TextUtils.isEmpty(string)) {
                                C60687RMf c60687RMf2 = c63335Shm2.A0C;
                                C63335Shm.A02(c60687RMf2);
                                C60644RFu A003 = AbstractC63066Sbn.A00(c60687RMf2, string);
                                c60692RMk.A0E("Found relevant installation campaign", A003);
                                C60692RMk.A02(siq, c60692RMk, A003);
                            }
                        }
                    }
                } catch (SQLiteException e3) {
                    c60692RMk.A0G("Failed to update Analytics property", e3);
                    try {
                        c60692RMk.A04.A0L();
                    } catch (SQLiteException e4) {
                        c60692RMk.A0G("Failed to end transaction", e4);
                    }
                    j = -1;
                }
                A002.put("_s", String.valueOf(j));
                C60687RMf c60687RMf3 = c63335Shm.A0C;
                C63335Shm.A02(c60687RMf3);
                SZ8 sz8 = new SZ8(c60687RMf3, null, A002, 0, c63197Sez.A00, 0L, true);
                C63335Shm.A02(c60683RMb);
                c60683RMb.A0I();
                c60683RMb.A0E("Hit delivery requested", sz8);
                C63335Shm.A00(c60683RMb).A02.submit(new RunnableC64644TOa(c60683RMb, sz8));
                return;
            } catch (Throwable th) {
                try {
                    c60692RMk.A04.A0L();
                    throw th;
                } catch (SQLiteException e5) {
                    c60692RMk.A0G("Failed to end transaction", e5);
                    throw th;
                }
            }
        }
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        Iterator A142 = AbstractC166997dE.A14(A00);
        while (A142.hasNext()) {
            Map.Entry A1K3 = AbstractC166987dD.A1K(A142);
            if (A1C2.length() > 0) {
                A1C2.append(',');
            }
            AbstractC58322PtE.A1S(A1C2, AbstractC31172DnG.A17(A1K3));
            A1C2.append(AbstractC58318PtA.A0p(A1K3));
        }
        c60687RMf.A0F(AbstractC58321PtD.A0w("Discarding hit. ", str), A1C2.toString());
    }

    public RMY(C63335Shm c63335Shm, String str) {
        super(c63335Shm);
        C3U5.A04(str);
        this.A01 = c63335Shm;
        this.A02 = str;
        C3U5.A04(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        this.A00 = builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x001c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap A00(X.C63197Sez r8) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RMY.A00(X.Sez):java.util.HashMap");
    }

    public static void A02(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
