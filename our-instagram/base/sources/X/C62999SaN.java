package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.SaN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62999SaN {
    public String A00;
    public Map A01;
    public SNS A02;
    public C63379Sit A03;
    public C62878SVc A04;

    public final void A01(String str) {
        StringBuilder A1C;
        String str2;
        String str3 = str;
        if (str != null) {
            int i = 3;
            if (str3.regionMatches(true, 0, "ws:", 0, 3)) {
                A1C = AbstractC166987dD.A1C();
                str2 = "http:";
            } else {
                i = 4;
                if (str3.regionMatches(true, 0, "wss:", 0, 4)) {
                    A1C = AbstractC166987dD.A1C();
                    str2 = "https:";
                }
                C62754SPl c62754SPl = new C62754SPl();
                c62754SPl.A02(str3, null);
                this.A03 = c62754SPl.A00();
                return;
            }
            A1C.append(str2);
            str3 = AbstractC166997dE.A0x(str.substring(i), A1C);
            C62754SPl c62754SPl2 = new C62754SPl();
            c62754SPl2.A02(str3, null);
            this.A03 = c62754SPl2.A00();
            return;
        }
        throw AbstractC166987dD.A15("url == null");
    }

    public final C62696SMk A00() {
        if (this.A03 != null) {
            return new C62696SMk(this);
        }
        throw AbstractC166987dD.A14("url == null");
    }

    public final void A02(String str, String str2) {
        SNS sns = this.A02;
        C63365SiO.A02(str);
        C63365SiO.A03(str2, str);
        sns.A00(str);
        sns.A01(str, str2);
    }

    public C62999SaN(C62696SMk c62696SMk) {
        Map linkedHashMap;
        this.A01 = Collections.emptyMap();
        this.A03 = c62696SMk.A03;
        this.A00 = c62696SMk.A00;
        this.A04 = c62696SMk.A04;
        Map map = c62696SMk.A01;
        if (map.isEmpty()) {
            linkedHashMap = Collections.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap(map);
        }
        this.A01 = linkedHashMap;
        this.A02 = C63365SiO.A00(c62696SMk.A02);
    }

    public C62999SaN() {
        this.A01 = Collections.emptyMap();
        this.A00 = "GET";
        this.A02 = new SNS();
    }
}
