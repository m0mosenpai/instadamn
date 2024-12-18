package X;

import android.text.TextUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MCF extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCF(String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = 36;
        this.A02 = str;
    }

    public static void A01(C47798L9g c47798L9g, Throwable th) {
        c47798L9g.A02("client_reg_query_verifier_failed", "exception when getting enc verifier from feo2 client", "registration_flow", null, th.getMessage(), TextUtils.join("\n", th.getStackTrace()), null);
    }

    public static void A02(C47798L9g c47798L9g, Throwable th) {
        c47798L9g.A02("client_auth_response_not_found", "auto_conf_client_authenticate_failed", "optimistic_authentication_flow", null, th.getMessage(), TextUtils.join("\n", th.getStackTrace()), "authenticate_exception_caught");
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        Object obj2;
        int i;
        Object obj3;
        String str2;
        int i2;
        switch (this.A01) {
            case 0:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 0;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 1:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 1;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 2:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 2;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 3:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 3;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 4:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 4;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 5:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 5;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 6:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 6;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 7:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 7;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 8:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 8;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 9:
                str = this.A02;
                obj2 = this.A00;
                i = 9;
                break;
            case 10:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 10;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 11:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 11;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 12;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = this.A02;
                obj2 = this.A00;
                i = 13;
                break;
            case 14:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 14;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case Process.SIGTERM /* 15 */:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 15;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 16:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 16;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 17:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 17;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 18:
                str = this.A02;
                obj2 = this.A00;
                i = 18;
                break;
            case Process.SIGSTOP /* 19 */:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 19;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 20:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 20;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 21:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 21;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 22:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 22;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 23:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 23;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 24:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 24;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 25:
                str = this.A02;
                obj2 = this.A00;
                i = 25;
                break;
            case 26:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 26;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 27:
                str = this.A02;
                obj2 = this.A00;
                i = 27;
                break;
            case 28:
                str = this.A02;
                obj2 = this.A00;
                i = 28;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 29;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 30:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 30;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 31:
                str = this.A02;
                obj2 = this.A00;
                i = 31;
                break;
            case 32:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 32;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 33:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 33;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 34:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 34;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 35:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 35;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 36:
                MCF mcf = new MCF(this.A02, interfaceC23621Ds);
                mcf.A00 = obj;
                return mcf;
            case 37:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 37;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 38:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 38;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 39:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 39;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case 40:
                str = this.A02;
                obj2 = this.A00;
                i = 40;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 41;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 42;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
            default:
                obj3 = this.A00;
                str2 = this.A02;
                i2 = 43;
                return new MCF(obj3, str2, interfaceC23621Ds, i2);
        }
        return new MCF(obj2, str, interfaceC23621Ds, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x070d  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 3018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, MCF mcf) {
        AbstractC09560e7.A00(obj);
        return mcf.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MCF) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCF(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A00 = obj;
        this.A02 = str;
    }
}
