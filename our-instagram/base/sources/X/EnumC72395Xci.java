package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.Map;

/* renamed from: X.Xci, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC72395Xci {
    Cp437(new String[0], 0, 2),
    ISO8859_1(new String[]{"ISO-8859-1"}, 1, 3),
    A0K("ISO8859_2", "ISO-8859-2"),
    A0L("ISO8859_3", "ISO-8859-3"),
    A0M("ISO8859_4", "ISO-8859-4"),
    A0N("ISO8859_5", "ISO-8859-5"),
    A0O("ISO8859_6", "ISO-8859-6"),
    A0P("ISO8859_7", "ISO-8859-7"),
    A0Q("ISO8859_8", "ISO-8859-8"),
    A0R("ISO8859_9", "ISO-8859-9"),
    A0E("ISO8859_10", "ISO-8859-10"),
    A0F("ISO8859_11", "ISO-8859-11"),
    A0G("ISO8859_13", "ISO-8859-13"),
    A0H("ISO8859_14", "ISO-8859-14"),
    A0I("ISO8859_15", "ISO-8859-15"),
    A0J("ISO8859_16", "ISO-8859-16"),
    A0S("SJIS", "Shift_JIS"),
    A07("Cp1250", "windows-1250"),
    A08("Cp1251", "windows-1251"),
    A09("Cp1252", "windows-1252"),
    A0A("Cp1256", "windows-1256"),
    A0U("UnicodeBigUnmarked", "UTF-16BE", "UnicodeBig"),
    A0T("UTF8", ReactWebViewManager.HTML_ENCODING),
    ASCII(new String[]{"US-ASCII"}, 27, AbstractC62862SUj.MAX_FACTORIAL),
    Big5(new String[0], 28),
    A0C("GB18030", "GB2312", "EUC_CN", "GBK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF475("EUC_KR", "EUC-KR");

    public final int[] A00;
    public final String[] A01;
    public static final Map A03 = AbstractC166987dD.A1G();
    public static final Map A02 = AbstractC166987dD.A1G();

    static {
        for (EnumC72395Xci enumC72395Xci : values()) {
            for (int i : enumC72395Xci.A00) {
                AbstractC25227BEk.A1O(enumC72395Xci, A03, i);
            }
            A02.put(enumC72395Xci.name(), enumC72395Xci);
            for (String str : enumC72395Xci.A01) {
                A02.put(str, enumC72395Xci);
            }
        }
    }

    EnumC72395Xci(String str, String... strArr) {
        this.A00 = new int[]{r3};
        this.A01 = strArr;
    }

    EnumC72395Xci(String[] strArr, int... iArr) {
        this.A00 = iArr;
        this.A01 = strArr;
    }
}
