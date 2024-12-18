package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.SMk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62696SMk {
    public final String A00;
    public final Map A01;
    public final C63365SiO A02;
    public final C63379Sit A03;
    public final C62878SVc A04;
    public volatile SZI A05;

    public C62696SMk(C62999SaN c62999SaN) {
        Map unmodifiableMap;
        this.A03 = c62999SaN.A03;
        this.A00 = c62999SaN.A00;
        this.A02 = new C63365SiO(c62999SaN.A02);
        this.A04 = c62999SaN.A04;
        Map map = c62999SaN.A01;
        byte[] bArr = AbstractC63404SjZ.A07;
        if (map.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        this.A01 = unmodifiableMap;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Request{method=");
        A1C.append(this.A00);
        A1C.append(", url=");
        A1C.append(this.A03);
        A1C.append(", tags=");
        return AbstractC58320PtC.A11(this.A01, A1C);
    }
}
