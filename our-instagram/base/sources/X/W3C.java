package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W3C {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C69658Vsz A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final W50 A0B;

    public W3C(W50 w50) {
        C14360o3.A0B(w50, 1);
        this.A0B = w50;
        this.A08 = "";
        this.A03 = -1;
        this.A02 = -1;
        this.A05 = -1;
        this.A04 = -1;
        this.A01 = -1;
        this.A00 = -1;
        this.A06 = new C69658Vsz(C05F.A0N);
    }

    public static final void A00(W3C w3c, ImageUrl imageUrl) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        C3QR c3qr = new C3QR(C3QQ.A03, AbstractC06930Yk.A0E(), w3c.A01, w3c.A00, w3c.A03);
        C69658Vsz c69658Vsz = w3c.A06;
        c69658Vsz.A08 = c3qr;
        C59392ni c59392ni = c69658Vsz.A06;
        if (c59392ni == null) {
            c59392ni = new C59392ni();
        }
        c59392ni.A01 = w3c.A05;
        c59392ni.A00 = w3c.A04;
        Map map = c59392ni.A0A;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put("encoded_width", Integer.valueOf(imageUrl.getWidth()));
        linkedHashMap.put("encoded_height", Integer.valueOf(imageUrl.getHeight()));
        linkedHashMap.put("encoded_size", Integer.valueOf(w3c.A02));
        c59392ni.A0A = linkedHashMap;
        Map map2 = c59392ni.A09;
        if (map2 != null) {
            linkedHashMap2 = new LinkedHashMap(map2);
        } else {
            linkedHashMap2 = new LinkedHashMap();
        }
        String str = w3c.A07;
        if (str != null) {
            linkedHashMap2.put("origin", str);
        } else {
            linkedHashMap2.remove("origin");
        }
        linkedHashMap2.put("custom_uri_key", String.valueOf(imageUrl.hashCode()));
        c59392ni.A09 = linkedHashMap2;
        C69658Vsz c69658Vsz2 = w3c.A06;
        c69658Vsz2.A06 = c59392ni;
        if (w3c.A0A) {
            w3c.A0B.A00(c69658Vsz2, C05F.A0N);
        }
    }
}
