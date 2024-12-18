package X;

import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceEventType;

/* loaded from: classes11.dex */
public abstract class U6u {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 2:
                return R.anim.left_in;
            case 3:
            default:
                return 0;
            case 4:
                return R.anim.fade_in;
        }
    }

    public static int A01(Integer num) {
        if (2 - num.intValue() != 0) {
            return 0;
        }
        return R.anim.right_out;
    }

    public static int A02(Integer num) {
        if (2 - num.intValue() != 0) {
            return 0;
        }
        return R.anim.right_in;
    }

    public static int A03(Integer num) {
        if (2 - num.intValue() != 0) {
            return 0;
        }
        return R.anim.left_out;
    }

    public static String A04(Integer num) {
        switch (num.intValue()) {
            case 1:
                return TraceEventType.Push;
            case 2:
                return "right_out";
            case 3:
                return "modal";
            case 4:
                return "cds_fade_in";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE;
        }
    }
}
