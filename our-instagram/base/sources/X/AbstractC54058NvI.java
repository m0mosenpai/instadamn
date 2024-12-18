package X;

import com.instagram.model.rtc.RtcIgNotification;

/* renamed from: X.NvI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54058NvI {
    public static final RtcIgNotification A00(C116155Nu c116155Nu) {
        String str;
        String str2 = c116155Nu.A1V;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = c116155Nu.A1I;
        if (str3 != null && str3.length() != 0) {
            str = AnonymousClass001.A0R(str2, str3);
        } else {
            str = null;
        }
        String str4 = c116155Nu.A0g;
        String str5 = c116155Nu.A0j;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = c116155Nu.A0X;
        String str7 = c116155Nu.A11;
        String str8 = c116155Nu.A12;
        String str9 = c116155Nu.A1H;
        if (str9 == null) {
            str9 = c116155Nu.A0r;
        }
        return new RtcIgNotification(str4, str5, str6, str7, str8, str9, c116155Nu.A1C, str, c116155Nu.A17, c116155Nu.A18);
    }
}
