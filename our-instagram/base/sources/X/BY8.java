package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes5.dex */
public final class BY8 implements InterfaceC58362lv, InterfaceC14180ni {
    public final int A00;
    public final Object A01;

    public BY8(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        this.A01 = interfaceC16660sJ;
    }

    public static void A00(C07X c07x, C2GT c2gt, InterfaceC16660sJ interfaceC16660sJ, int i) {
        c2gt.A06(c07x, new BY8(i, interfaceC16660sJ));
    }

    public final boolean equals(Object obj) {
        switch (this.A00) {
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
            case 16:
            case 17:
                if (!(obj instanceof InterfaceC58362lv) || !(obj instanceof InterfaceC14180ni)) {
                    return false;
                }
                return AbstractC167007dF.A1Y(obj, this.A01);
            default:
                return super.equals(obj);
        }
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return (InterfaceC09250da) this.A01;
    }

    public final int hashCode() {
        switch (this.A00) {
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
            case 16:
            case 17:
                return this.A01.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // X.InterfaceC58362lv
    public final /* synthetic */ void onChanged(Object obj) {
        AbstractC25225BEi.A1U(this.A01, obj);
    }
}
