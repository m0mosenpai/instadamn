package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.JYj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43796JYj {
    public static final void A01(String str) {
        C14360o3.A0B(str, 0);
        C0f5 AEp = C18950wb.A01.AEp("FolderError", 20134884);
        AEp.ABW(DialogModule.KEY_MESSAGE, "CRITICAL: Received null or empty folders");
        AEp.ABW(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, str);
        AEp.report();
    }

    public static final boolean A02(C50092Rx c50092Rx) {
        String str;
        AbstractC46972Dl c2e6;
        C14360o3.A0B(c50092Rx, 0);
        String str2 = c50092Rx.A06;
        String str3 = c50092Rx.A05;
        AbstractC167007dF.A1K(str2, str3);
        for (Integer num : C05F.A00(7)) {
            switch (num.intValue()) {
                case 1:
                    str = "AD_RESPONSES";
                    break;
                case 2:
                    str = "ALL";
                    break;
                case 3:
                    str = "CUSTOM";
                    break;
                case 4:
                    str = "GENERAL";
                    break;
                case 5:
                    str = "PRIMARY";
                    break;
                case 6:
                    str = "REQUESTS";
                    break;
                default:
                    str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                    break;
            }
            if (str.equals(str2)) {
                switch (num.intValue()) {
                    case 1:
                        c2e6 = C47092Dx.A00;
                        break;
                    case 2:
                        c2e6 = C47072Dv.A00;
                        break;
                    case 3:
                        c2e6 = new C2E6(str3);
                        break;
                    case 4:
                        c2e6 = C46962Dk.A00;
                        break;
                    case 5:
                        c2e6 = C47032Dr.A00;
                        break;
                    case 6:
                        c2e6 = C2057498z.A00;
                        break;
                    default:
                        return false;
                }
                c50092Rx.A01 = c2e6;
                return true;
            }
        }
        return false;
    }

    public static final String A00(AbstractC46972Dl abstractC46972Dl) {
        Integer num;
        if (abstractC46972Dl.equals(C47072Dv.A00)) {
            num = C05F.A0C;
        } else if (abstractC46972Dl.equals(C47092Dx.A00)) {
            num = C05F.A01;
        } else if (abstractC46972Dl.equals(C46962Dk.A00)) {
            num = C05F.A0Y;
        } else if (abstractC46972Dl.equals(C47032Dr.A00)) {
            num = C05F.A0j;
        } else {
            if (!abstractC46972Dl.equals(C2057498z.A00)) {
                return null;
            }
            num = C05F.A0u;
        }
        switch (num.intValue()) {
            case 1:
                return "AD_RESPONSES";
            case 2:
                return "ALL";
            case 3:
                return "CUSTOM";
            case 4:
                return "GENERAL";
            case 5:
                return "PRIMARY";
            default:
                return "REQUESTS";
        }
    }
}
