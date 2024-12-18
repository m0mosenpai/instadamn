package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.8zF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203548zF {
    public static Integer A00(String str) {
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return C05F.A00;
        }
        if (str.equals("INPUT")) {
            return C05F.A01;
        }
        if (str.equals("MODEL")) {
            return C05F.A0C;
        }
        if (str.equals("INPUT_AND_MODEL")) {
            return C05F.A0N;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INPUT";
            case 2:
                return "MODEL";
            case 3:
                return "INPUT_AND_MODEL";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
