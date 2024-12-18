package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.Olw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55562Olw implements InterfaceC58362lv, InterfaceC14180ni {
    public final int A00;
    public final Object A01;

    public C55562Olw(N6M n6m) {
        this.A00 = 2;
        this.A01 = n6m;
    }

    public static void A00(C2GT c2gt, C58252li c58252li, InterfaceC16660sJ interfaceC16660sJ, int i) {
        c58252li.A0E(c2gt, new C55562Olw(i, interfaceC16660sJ));
    }

    public final boolean equals(Object obj) {
        Object functionDelegate;
        boolean z = obj instanceof InterfaceC58362lv;
        if (2 - this.A00 != 0) {
            if (!z || !(obj instanceof InterfaceC14180ni)) {
                return false;
            }
            functionDelegate = this.A01;
        } else {
            if (!z || !(obj instanceof InterfaceC14180ni)) {
                return false;
            }
            functionDelegate = getFunctionDelegate();
        }
        return AbstractC167007dF.A1Y(obj, functionDelegate);
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        if (2 - this.A00 != 0) {
            return (InterfaceC09250da) this.A01;
        }
        return new C03E(1, this.A01, N6M.class, "maybeDisplayTaggedItemsView", "maybeDisplayTaggedItemsView(Ljava/util/List;)V", 0);
    }

    public final int hashCode() {
        Object functionDelegate;
        if (2 - this.A00 != 0) {
            functionDelegate = this.A01;
        } else {
            functionDelegate = getFunctionDelegate();
        }
        return functionDelegate.hashCode();
    }

    @Override // X.InterfaceC58362lv
    public final /* synthetic */ void onChanged(Object obj) {
        if (2 - this.A00 != 0) {
            AbstractC25225BEi.A1U(this.A01, obj);
        } else {
            ((N6M) this.A01).A08(AbstractC25228BEl.A1C(obj));
        }
    }

    public C55562Olw(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
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
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 44:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
            case 48:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                break;
            case 2:
            case 24:
            default:
                C14360o3.A0B(interfaceC16660sJ, 1);
                break;
        }
        this.A01 = interfaceC16660sJ;
    }
}
