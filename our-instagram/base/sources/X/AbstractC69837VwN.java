package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.VwN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69837VwN {
    public static Integer A00(String str) {
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return C05F.A00;
        }
        if (str.equals("EDITABLE")) {
            return C05F.A01;
        }
        if (str.equals("SELECTED")) {
            return C05F.A0C;
        }
        if (str.equals("UNSELECTED")) {
            return C05F.A0N;
        }
        if (str.equals("UNEDITABLE")) {
            return C05F.A0Y;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "EDITABLE";
            case 2:
                return "SELECTED";
            case 3:
                return "UNSELECTED";
            case 4:
                return "UNEDITABLE";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
