package X;

import android.content.Context;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes11.dex */
public abstract class W6g {
    public static final int A00(XIGIGBoostCallToAction xIGIGBoostCallToAction) {
        switch (AbstractC25227BEk.A05(xIGIGBoostCallToAction, 1)) {
            case 1:
                return 2131970357;
            case 2:
                return 2131970358;
            case 3:
                return 2131970359;
            case 4:
                return 2131970409;
            case 5:
            case 6:
                return 2131970410;
            case 7:
                return 2131970448;
            case 8:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGSTOP /* 19 */:
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unimplemented ");
                sb.append(xIGIGBoostCallToAction);
                throw new RuntimeException(AbstractC166997dE.A0x(", would have crashed anyway.", sb));
            case 9:
                return 2131970465;
            case 10:
                return 2131970466;
            case 11:
                return 2131970468;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return 2131970739;
            case 14:
                return 2131970740;
            case Process.SIGTERM /* 15 */:
                return 2131970643;
            case 16:
                return 2131970756;
            case 17:
                return 2131970758;
            case 18:
                return 2131970762;
            case 20:
                return 2131970822;
            case 21:
                return 2131970940;
            case 22:
                return 2131970943;
            case 23:
                return 2131970982;
            case 24:
                return 2131970874;
            case 25:
                return 2131971007;
            case 26:
                return 2131971008;
            case 27:
                return 2131971017;
        }
    }

    public static final XIGIGBoostCallToAction A01(XIGIGBoostDestination xIGIGBoostDestination, PromoteData promoteData) {
        XIGIGBoostCallToAction xIGIGBoostCallToAction;
        String name;
        XIGIGBoostCallToAction valueOf;
        String name2;
        XIGIGBoostCallToAction valueOf2;
        String name3;
        if (xIGIGBoostDestination == null) {
            return null;
        }
        switch (xIGIGBoostDestination.ordinal()) {
            case 1:
                XIGIGBoostCallToAction xIGIGBoostCallToAction2 = promoteData.A0e;
                if (xIGIGBoostCallToAction2 == null || (name = xIGIGBoostCallToAction2.name()) == null || (valueOf = XIGIGBoostCallToAction.valueOf(name)) == null) {
                    return XIGIGBoostCallToAction.A0J;
                }
                return valueOf;
            case 2:
            case 10:
                xIGIGBoostCallToAction = promoteData.A0b;
                break;
            case 3:
            case 6:
            case 7:
            case 9:
            case 11:
            default:
                throw new Throwable("Unhandled XIGIGBoostDestination type");
            case 4:
                xIGIGBoostCallToAction = promoteData.A0d;
                break;
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                XIGIGBoostCallToAction xIGIGBoostCallToAction3 = promoteData.A0e;
                if (xIGIGBoostCallToAction3 == null || (name2 = xIGIGBoostCallToAction3.name()) == null || (valueOf2 = XIGIGBoostCallToAction.valueOf(name2)) == null) {
                    return XIGIGBoostCallToAction.A0W;
                }
                return valueOf2;
            case 8:
                return XIGIGBoostCallToAction.A0T;
        }
        if (xIGIGBoostCallToAction == null || (name3 = xIGIGBoostCallToAction.name()) == null) {
            return null;
        }
        return XIGIGBoostCallToAction.valueOf(name3);
    }

    public static void A02(Context context, XIGIGBoostCallToAction xIGIGBoostCallToAction, StringBuilder sb, int i) {
        sb.append(context.getString(i, context.getString(A00(xIGIGBoostCallToAction))));
    }
}
