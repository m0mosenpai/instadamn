package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes10.dex */
public final class T6P implements InterfaceC65420Tjr {
    public static final InterfaceC65420Tjr A00 = new T6P();

    @Override // X.InterfaceC65420Tjr
    public final boolean FFk(int i) {
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
            case 14:
            case Process.SIGTERM /* 15 */:
                return true;
            default:
                switch (i) {
                    case 22:
                    case 23:
                    case 24:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
