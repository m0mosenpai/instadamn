package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collections;
import java.util.Map;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.7py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C174647py implements InterfaceC174657pz {
    public static final Map A01 = Collections.emptyMap();
    public final SparseArray A00 = new SparseArray();

    public C174647py(C174687q2 c174687q2, EnumC174667q0 enumC174667q0, EnumC174667q0 enumC174667q02, InterfaceC174637px interfaceC174637px, boolean z, boolean z2, boolean z3) {
        A00(InterfaceC174657pz.A0R, enumC174667q0);
        A00(InterfaceC174657pz.A0W, enumC174667q02);
        A00(InterfaceC174657pz.A0U, interfaceC174637px);
        A00(InterfaceC174657pz.A0A, c174687q2);
        A00(InterfaceC174657pz.A0F, false);
        A00(InterfaceC174657pz.A0S, Boolean.valueOf(z));
        A00(InterfaceC174657pz.A0G, Boolean.valueOf(z2));
        A00(InterfaceC174657pz.A05, Boolean.valueOf(z3));
    }

    public final void A00(C7q3 c7q3, Object obj) {
        this.A00.put(c7q3.A00, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x002b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x002e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0031. Please report as an issue. */
    @Override // X.InterfaceC174657pz
    public Object AXQ(C7q3 c7q3) {
        int i;
        SparseArray sparseArray = this.A00;
        int i2 = c7q3.A00;
        Object obj = sparseArray.get(i2);
        if (obj != null) {
            return obj;
        }
        if (i2 != 0) {
            if (i2 != 3 && i2 != 31 && i2 != 33 && i2 != 43 && i2 != 7 && i2 != 8) {
                if (i2 != 23) {
                    if (i2 != 24) {
                        switch (i2) {
                            case 10:
                            case 11:
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            case 14:
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                return A01;
                            default:
                                switch (i2) {
                                    default:
                                        switch (i2) {
                                            case 26:
                                                break;
                                            case 27:
                                                i = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                                                break;
                                            case 28:
                                                return 30000000L;
                                            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                                                i = 16;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 45:
                                                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                                                    case 47:
                                                        break;
                                                    case 48:
                                                        return this;
                                                    default:
                                                        throw new RuntimeException(AnonymousClass001.A0O("Invalid Settings key: ", i2));
                                                }
                                        }
                                    case 16:
                                    case 17:
                                    case 18:
                                        return Boolean.FALSE;
                                }
                        }
                    } else {
                        i = -1;
                    }
                } else {
                    i = 0;
                }
                return Integer.valueOf(i);
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // X.InterfaceC174657pz
    public final Integer CEw(int i, int i2, int i3) {
        double d;
        if (this instanceof C174677q1) {
            C174677q1 c174677q1 = (C174677q1) this;
            C178317w5 c178317w5 = new C178317w5(c174677q1.A01);
            Context context = c174677q1.A00;
            if (AbstractC225229wl.A00(context, c178317w5)) {
                if (AbstractC225229wl.A00(context, c178317w5)) {
                    if (C04100Kb.A00(AbstractC12290kX.A00) >= 2016) {
                        d = 0.16d;
                    } else {
                        d = 0.14d;
                    }
                    return Integer.valueOf((int) (d * i * i2 * i3));
                }
                throw new IllegalStateException("Should not be querying the bitrate if not in the experiment");
            }
            return null;
        }
        if (this instanceof C212549bN) {
            return ((C212549bN) this).A01;
        }
        return null;
    }
}
