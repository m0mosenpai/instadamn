package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes10.dex */
public abstract class S12 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "SERVICE_START";
            case 1:
                return "SERVICE_RESTART";
            case 2:
                return "PERSISTENT_KICK";
            case 3:
                return "CONNECTIVITY_CHANGED";
            case 4:
                return "CONFIG_CHANGED";
            case 5:
                return "EXPIRE_CONNECTION";
            case 6:
                return "CONNECT_NOW";
            case 7:
                return "CONNECTION_LOST";
            case 8:
                return "KEEPALIVE";
            case 9:
                return AbstractC111324zv.A00(3490);
            case 10:
                return "FBNS_REGISTER";
            case 11:
                return "FBNS_REGISTER_RETRY";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "FBNS_UNREGISTER";
            default:
                return "CREDENTIALS_UPDATED";
        }
    }
}
