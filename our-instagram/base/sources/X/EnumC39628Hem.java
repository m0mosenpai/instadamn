package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Hem, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC39628Hem {
    GO_TO_POST("GO_TO_POST"),
    CLEAR_MEDIA_COVER("CLEAR_MEDIA_COVER"),
    OPEN_BLOKS_APP("OPEN_BLOKS_APP"),
    OPEN_EXTERNAL_URL("OPEN_EXTERNAL_URL"),
    OTHER("OTHER");

    public static final Map A02;
    public String A00;
    public String A01;

    static {
        EnumC39628Hem enumC39628Hem = GO_TO_POST;
        EnumC39628Hem enumC39628Hem2 = CLEAR_MEDIA_COVER;
        EnumC39628Hem enumC39628Hem3 = OPEN_BLOKS_APP;
        EnumC39628Hem enumC39628Hem4 = OPEN_EXTERNAL_URL;
        HashMap A1G = AbstractC166987dD.A1G();
        A02 = A1G;
        A1G.put(enumC39628Hem, "go_to_post");
        A1G.put(enumC39628Hem2, "clear_media_cover");
        A1G.put(enumC39628Hem3, "see_why");
        A1G.put(enumC39628Hem4, "open_external_url");
    }

    EnumC39628Hem(String str) {
        this.A01 = str;
    }

    public static EnumC39628Hem A00(InterfaceC109864xE interfaceC109864xE) {
        Integer A01 = AbstractC28293Cdf.A01(interfaceC109864xE);
        if (A01 != null) {
            int intValue = A01.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        return OPEN_BLOKS_APP;
                    }
                } else {
                    return CLEAR_MEDIA_COVER;
                }
            } else {
                return OPEN_EXTERNAL_URL;
            }
        }
        return OTHER;
    }
}
