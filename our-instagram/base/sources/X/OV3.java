package X;

import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* loaded from: classes9.dex */
public final class OV3 {
    public static final OV3 A00 = new Object();

    public final Object A00(C6FW c6fw) {
        C102884kP c102884kP;
        Integer num;
        Integer num2;
        String str = (String) c6fw.A01();
        if (str != null && (c102884kP = (C102884kP) c6fw.A02()) != null) {
            Object A002 = c6fw.A00();
            C14360o3.A0C(A002, AbstractC43591JPw.A00(1));
            AbstractC12990ll A0A = C6BQ.A0A((C6FG) A002);
            AbstractC31171DnF.A1Q(A0A);
            String A0L = c102884kP.A0L(56);
            String A0L2 = c102884kP.A0L(55);
            if (C14360o3.A0K(A0L, "IMAGE")) {
                num = C05F.A00;
            } else if (C14360o3.A0K(A0L, "VIDEO")) {
                num = C05F.A01;
            } else if (C14360o3.A0K(A0L, "SHOWREELS")) {
                num = C05F.A0u;
            } else if (C14360o3.A0K(A0L2, "IGTV")) {
                num = C05F.A0j;
            } else {
                num = C05F.A15;
            }
            String A0L3 = c102884kP.A0L(50);
            String A0L4 = c102884kP.A0L(44);
            if (A0L4 != null) {
                int hashCode = A0L4.hashCode();
                if (hashCode != 3260) {
                    if (hashCode == 3358 && A0L4.equals("ig")) {
                        num2 = C05F.A00;
                        AbstractC25651Mw.A00(A0A).E4s(new C52622NPv(new RtcStartCoWatchPlaybackArguments(num2, num, C05F.A1F, null, str, null), A0L3));
                    }
                } else if (A0L4.equals("fb")) {
                    num2 = C05F.A01;
                    AbstractC25651Mw.A00(A0A).E4s(new C52622NPv(new RtcStartCoWatchPlaybackArguments(num2, num, C05F.A1F, null, str, null), A0L3));
                }
            }
        }
        return null;
    }
}
