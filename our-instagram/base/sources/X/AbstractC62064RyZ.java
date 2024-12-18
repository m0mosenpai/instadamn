package X;

import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.RyZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62064RyZ {
    public static String A00(int i) {
        if (i == 3) {
            return "REACT_NATIVE_BRIDGE_PROCESS_PACKAGES";
        }
        if (i == 23) {
            return "REACT_NATIVE_BRIDGE_CREATE_MOBILE_CONFIG_MODULE";
        }
        if (i == 25) {
            return "REACT_NATIVE_BRIDGE_CREATE_MOBILE_CONFIG_MODULE_GET_METADATA";
        }
        if (i == 30) {
            return "REACT_NATIVE_BRIDGE_GET_CONSTANTS";
        }
        if (i == 42) {
            return "REACT_NATIVE_BRIDGE_PRE_SETUP_REACT_CONTEXT";
        }
        if (i == 44) {
            return "REACT_NATIVE_BRIDGE_CORE";
        }
        if (i == 47) {
            return "REACT_NATIVE_BRIDGE_PRE_RUN_APPLICATION";
        }
        if (i == 7) {
            return "REACT_NATIVE_BRIDGE_RUN_JS_BUNDLE";
        }
        if (i == 8) {
            return "REACT_NATIVE_BRIDGE_NATIVE_MODULE_INITIALIZE";
        }
        if (i == 27) {
            return "REACT_NATIVE_BRIDGE_I18N_MODULE_CONSTANTS_CONVERT";
        }
        if (i == 28) {
            return "REACT_NATIVE_BRIDGE_CREATE_I18N_MODULE_CONSTANTS";
        }
        switch (i) {
            case 10:
                return "REACT_NATIVE_BRIDGE_CREATE_UI_MANAGER_MODULE";
            case 11:
                return "REACT_NATIVE_BRIDGE_CREATE_VIEW_MANAGERS";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "REACT_NATIVE_BRIDGE_CREATE_UI_MANAGER_MODULE_CONSTANTS";
            default:
                switch (i) {
                    case 14:
                        return "REACT_NATIVE_BRIDGE_FBREACT_BUILD_REACT_INSTANCE_MANAGER";
                    case Process.SIGTERM /* 15 */:
                        return "REACT_NATIVE_BRIDGE_FBREACT_GET_REACT_INSTANCE_HOLDER_SPEC";
                    case 16:
                        return "REACT_NATIVE_BRIDGE_CREATE_MODULE";
                    case 17:
                        return "REACT_NATIVE_BRIDGE_PROCESS_CORE_REACT_PACKAGE";
                    case 18:
                        return "REACT_NATIVE_BRIDGE_PROCESS_FB4A_INFRA_PACKAGE";
                    case Process.SIGSTOP /* 19 */:
                        return "REACT_NATIVE_BRIDGE_PROCESS_FB4A_PRODUCT_PACKAGE";
                    default:
                        switch (i) {
                            case 36:
                                return "REACT_NATIVE_BRIDGE_INITIALIZE_MODULE";
                            case 37:
                                return "REACT_NATIVE_BRIDGE_ON_HOST_RESUME";
                            case 38:
                                return "REACT_NATIVE_BRIDGE_ON_HOST_PAUSE";
                            case 39:
                                return "REACT_NATIVE_BRIDGE_CONVERT_CONSTANTS";
                            default:
                                switch (i) {
                                    case 52:
                                        return "REACT_NATIVE_BRIDGE_UNPACK_JS_BUNDLE";
                                    case 53:
                                        return "REACT_NATIVE_BRIDGE_UNPACK_JS_BUNDLE_EAGERLY";
                                    case 54:
                                        return "REACT_NATIVE_BRIDGE_DESTROY_CATALYST_INSTANCE";
                                    case 55:
                                        return "REACT_NATIVE_BRIDGE_REGISTER_JS_SEGMENT";
                                    case 56:
                                        return "REACT_NATIVE_BRIDGE_NATIVE_MODULE_SETUP";
                                    case 57:
                                        return "REACT_NATIVE_BRIDGE_LOAD_RN_SO_FILE";
                                    case 58:
                                        return "REACT_NATIVE_BRIDGE_LOAD_RN_FABRIC_SO_FILE";
                                    case 59:
                                        return "REACT_NATIVE_BRIDGE_FABRIC_RENDER_TTRC";
                                    case 60:
                                        return "REACT_NATIVE_BRIDGE_FABRIC_RENDER_TTI";
                                    default:
                                        return "UNDEFINED_QPL_EVENT";
                                }
                        }
                }
        }
    }
}
