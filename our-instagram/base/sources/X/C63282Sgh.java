package X;

import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Sgh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C63282Sgh {
    public Integer A00;
    public ScanResult A01;
    public final int A02;
    public final long A03;
    public final Boolean A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public C63282Sgh(Boolean bool, Integer num, String str, String str2, int i, long j) {
        this.A03 = j;
        this.A07 = str;
        this.A02 = i;
        this.A08 = str2;
        this.A00 = num;
        this.A09 = null;
        this.A0A = null;
        this.A0B = null;
        this.A04 = bool;
        this.A05 = null;
        this.A06 = null;
    }

    public static ArrayList A01(C0JM c0jm, C0JO c0jo, List list) {
        String str;
        String str2;
        ArrayList A1E = AbstractC166987dD.A1E();
        StringBuilder A1C = AbstractC166987dD.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            A1C.setLength(0);
            String str3 = scanResult.capabilities;
            if (str3 != null) {
                A1C.append(str3);
            }
            CharSequence charSequence = scanResult.operatorFriendlyName;
            if (charSequence != null && charSequence.length() > 0) {
                str = scanResult.operatorFriendlyName.toString();
            } else {
                str = null;
            }
            CharSequence charSequence2 = scanResult.venueName;
            if (charSequence2 != null && charSequence2.length() > 0) {
                str2 = scanResult.venueName.toString();
            } else {
                str2 = null;
            }
            if (scanResult.is80211mcResponder()) {
                A1C.append("[MC]");
            }
            long now = c0jm.now() - (c0jo.now() - AbstractC166987dD.A0L(scanResult.timestamp));
            C63282Sgh c63282Sgh = new C63282Sgh(Integer.valueOf(scanResult.frequency), scanResult.BSSID, scanResult.SSID, A1C.toString(), str, str2, scanResult.level, now);
            c63282Sgh.A01 = scanResult;
            A1E.add(c63282Sgh);
        }
        return A1E;
    }

    public C63282Sgh(Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, int i, long j) {
        this.A03 = j;
        this.A07 = str;
        this.A02 = i;
        this.A08 = str2;
        this.A00 = num;
        this.A09 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A04 = bool;
        this.A05 = num2;
        this.A06 = num3;
    }

    public C63282Sgh(Integer num, String str, String str2, String str3, String str4, String str5, int i, long j) {
        this.A03 = j;
        this.A07 = str;
        this.A02 = i;
        this.A08 = str2;
        this.A00 = num;
        this.A09 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A04 = null;
        this.A05 = null;
        this.A06 = null;
    }
}
