package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.F7z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34227F7z {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "tos";
            case 2:
                return "dob";
            case 3:
                return "parental_consent";
            case 4:
                return "third_party_data";
            case 5:
                return "finished";
            case 6:
                return "already_finished";
            case 7:
                return "under_13";
            case 8:
                return NetInfoModule.CONNECTION_TYPE_NONE;
            default:
                return "qp_intro";
        }
    }
}
