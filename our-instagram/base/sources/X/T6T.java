package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes10.dex */
public final class T6T implements InterfaceC65420Tjr {
    public static final InterfaceC65420Tjr A00 = new T6T();

    @Override // X.InterfaceC65420Tjr
    public final boolean FFk(int i) {
        if (i == 17) {
            return true;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return true;
            default:
                return false;
        }
    }
}
