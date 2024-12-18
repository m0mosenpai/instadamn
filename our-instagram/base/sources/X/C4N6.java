package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.4N6, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4N6 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "analytics";
            case 2:
                return AbstractC58317Pt9.A00(787);
            case 3:
                return "fbns_state";
            case 4:
                return "flags";
            case 5:
                return "ids";
            case 6:
                return "keypair";
            case 7:
                return AbstractC58317Pt9.A00(899);
            case 8:
                return "registrations";
            case 9:
                return "retry";
            case 10:
                return "gk";
            case 11:
                return AbstractC58317Pt9.A00(865);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "token_store";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC43591JPw.A00(202);
            case 14:
                return "mqtt_debug";
            case Process.SIGTERM /* 15 */:
                return "mqtt_config";
            case 16:
                return "mqtt_last_host";
            case 17:
                return "third_party_auth_pn_config";
            case 18:
                return "third_party_auth_sig_config";
            default:
                return "address";
        }
    }
}
