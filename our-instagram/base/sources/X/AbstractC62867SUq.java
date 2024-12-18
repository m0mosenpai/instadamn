package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.SUq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62867SUq {
    public static final Map A00;
    public static final C63205Sf9[] A01;

    static {
        C63205Sf9[] c63205Sf9Arr = new C63205Sf9[61];
        C63205Sf9 c63205Sf9 = new C63205Sf9("", C63205Sf9.A05);
        C64531TIl c64531TIl = C63205Sf9.A06;
        C63205Sf9 c63205Sf92 = new C63205Sf9("GET", c64531TIl);
        C63205Sf9 c63205Sf93 = new C63205Sf9("POST", c64531TIl);
        C64531TIl c64531TIl2 = C63205Sf9.A07;
        C63205Sf9 c63205Sf94 = new C63205Sf9("/", c64531TIl2);
        C63205Sf9 c63205Sf95 = new C63205Sf9("/index.html", c64531TIl2);
        C64531TIl c64531TIl3 = C63205Sf9.A08;
        C63205Sf9 c63205Sf96 = new C63205Sf9("http", c64531TIl3);
        C63205Sf9 c63205Sf97 = new C63205Sf9("https", c64531TIl3);
        C64531TIl c64531TIl4 = C63205Sf9.A04;
        int i = 0;
        System.arraycopy(new C63205Sf9[]{c63205Sf9, c63205Sf92, c63205Sf93, c63205Sf94, c63205Sf95, c63205Sf96, c63205Sf97, new C63205Sf9("200", c64531TIl4), new C63205Sf9("204", c64531TIl4), new C63205Sf9("206", c64531TIl4), new C63205Sf9("304", c64531TIl4), new C63205Sf9("400", c64531TIl4), new C63205Sf9("404", c64531TIl4), new C63205Sf9("500", c64531TIl4), AbstractC58321PtD.A16("accept-charset", ""), AbstractC58321PtD.A16("accept-encoding", "gzip, deflate"), AbstractC58321PtD.A16("accept-language", ""), AbstractC58321PtD.A16("accept-ranges", ""), AbstractC58321PtD.A16("accept", ""), AbstractC58321PtD.A16("access-control-allow-origin", ""), AbstractC58321PtD.A16("age", ""), AbstractC58321PtD.A16("allow", ""), AbstractC58321PtD.A16("authorization", ""), AbstractC58321PtD.A16("cache-control", ""), AbstractC58321PtD.A16("content-disposition", ""), AbstractC58321PtD.A16("content-encoding", ""), AbstractC58321PtD.A16("content-language", "")}, 0, c63205Sf9Arr, 0, 27);
        System.arraycopy(new C63205Sf9[]{AbstractC58321PtD.A16(IgNetworkingModule.CONTENT_LENGTH_HEADER_NAME, ""), AbstractC58321PtD.A16("content-location", ""), AbstractC58321PtD.A16("content-range", ""), AbstractC58321PtD.A16(IgNetworkingModule.CONTENT_TYPE_HEADER_NAME, ""), AbstractC58321PtD.A16("cookie", ""), AbstractC58321PtD.A16(DatePickerDialogModule.ARG_DATE, ""), AbstractC58321PtD.A16("etag", ""), AbstractC58321PtD.A16("expect", ""), AbstractC58321PtD.A16("expires", ""), AbstractC58321PtD.A16("from", ""), AbstractC58321PtD.A16("host", ""), AbstractC58321PtD.A16("if-match", ""), AbstractC58321PtD.A16("if-modified-since", ""), AbstractC58321PtD.A16("if-none-match", ""), AbstractC58321PtD.A16("if-range", ""), AbstractC58321PtD.A16("if-unmodified-since", ""), AbstractC58321PtD.A16("last-modified", ""), AbstractC58321PtD.A16("link", ""), AbstractC58321PtD.A16("location", ""), AbstractC58321PtD.A16("max-forwards", ""), AbstractC58321PtD.A16("proxy-authenticate", ""), AbstractC58321PtD.A16("proxy-authorization", ""), AbstractC58321PtD.A16("range", ""), AbstractC58321PtD.A16("referer", ""), AbstractC58321PtD.A16("refresh", ""), AbstractC58321PtD.A16("retry-after", ""), AbstractC58321PtD.A16("server", "")}, 0, c63205Sf9Arr, 27, 27);
        System.arraycopy(new C63205Sf9[]{AbstractC58321PtD.A16("set-cookie", ""), AbstractC58321PtD.A16("strict-transport-security", ""), AbstractC58321PtD.A16("transfer-encoding", ""), AbstractC58321PtD.A16("user-agent", ""), AbstractC58321PtD.A16("vary", ""), AbstractC58321PtD.A16("via", ""), AbstractC58321PtD.A16("www-authenticate", "")}, 0, c63205Sf9Arr, 54, 7);
        A01 = c63205Sf9Arr;
        LinkedHashMap A18 = AbstractC25225BEi.A18(61);
        do {
            if (!A18.containsKey(c63205Sf9Arr[i].A01)) {
                AbstractC37301Gc2.A1T(c63205Sf9Arr[i].A01, A18, i);
            }
            i++;
        } while (i < 61);
        A00 = Collections.unmodifiableMap(A18);
    }

    public static void A00(C64531TIl c64531TIl) {
        int A05 = c64531TIl.A05();
        for (int i = 0; i < A05; i++) {
            byte A04 = c64531TIl.A04(i);
            if (A04 >= 65 && A04 <= 90) {
                throw MSY.A0X("PROTOCOL_ERROR response malformed: mixed case name: ", c64531TIl.A07());
            }
        }
    }
}
