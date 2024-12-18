package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.meta.arfx.engine.interfaces.IARExperimentUtilBinding;
import go.Seq;
import java.util.Map;

/* renamed from: X.AWl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23341AWl implements InterfaceC150596qC {
    public IARExperimentUtilBinding A00;
    public final Map A01 = AbstractC166987dD.A1I();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    @Override // X.InterfaceC150596qC
    public final boolean Ah6(EnumC223229t6 enumC223229t6, boolean z) {
        C14360o3.A0B(enumC223229t6, 0);
        if (enumC223229t6 != EnumC223229t6.A03) {
            switch (enumC223229t6.ordinal()) {
                case 1:
                case 4:
                case 18:
                case Process.SIGSTOP /* 19 */:
                case 28:
                case 59:
                case 73:
                case 136:
                    return true;
                case 2:
                case 6:
                case Process.SIGTERM /* 15 */:
                case 31:
                case 32:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case Seq.NULL_REFNUM /* 41 */:
                case 43:
                case 44:
                case 45:
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                case 47:
                case 55:
                case 57:
                case 175:
                case 177:
                    Map map = this.A01;
                    if (map.containsKey(enumC223229t6)) {
                        Boolean bool = (Boolean) map.get(enumC223229t6);
                        if (bool != null) {
                            return bool.booleanValue();
                        }
                    } else {
                        IARExperimentUtilBinding iARExperimentUtilBinding = this.A00;
                        if (iARExperimentUtilBinding != null) {
                            boolean Ah5 = iARExperimentUtilBinding.Ah5(enumC223229t6.A00, z);
                            map.put(enumC223229t6, Boolean.valueOf(Ah5));
                            return Ah5;
                        }
                    }
                    break;
                case 7:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case 16:
                case 17:
                case 21:
                case 24:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                case 30:
                case 35:
                    return false;
            }
        }
        return z;
    }

    @Override // X.InterfaceC150596qC
    public final boolean Ah8(EnumC223229t6 enumC223229t6, boolean z) {
        return z;
    }

    @Override // X.InterfaceC150596qC
    public final double Az4(Integer num, double d) {
        return d;
    }

    @Override // X.InterfaceC150596qC
    public final long BP5(Integer num, long j) {
        return j;
    }

    @Override // X.InterfaceC150596qC
    public final String C2n(Integer num, String str) {
        C14360o3.A0B(num, 0);
        if (num.intValue() == 2) {
            return AbstractC111324zv.A00(3469);
        }
        return str;
    }
}
