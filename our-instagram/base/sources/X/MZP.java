package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes9.dex */
public final class MZP implements InterfaceC19390xP {
    public final int A00;
    public final Object A01;

    public MZP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC19390xP A00(Object obj, int i) {
        return C0ST.A01(new MZP(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC19390xP interfaceC19390xP;
        int i;
        InterfaceC19960yQ mtk;
        InterfaceC19390xP[] interfaceC19390xPArr;
        InterfaceC16820sZ A01;
        InterfaceC23621Ds interfaceC23621Ds2;
        int i2;
        Object A00;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i = 4;
                mtk = new MTK(interfaceC19960yQ, i);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 1:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i = 12;
                mtk = new MTK(interfaceC19960yQ, i);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 2:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i = 13;
                mtk = new MTK(interfaceC19960yQ, i);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 3:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i = 14;
                mtk = new MTK(interfaceC19960yQ, i);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 4:
                interfaceC19390xPArr = (InterfaceC19390xP[]) this.A01;
                A01 = C57554PgS.A01(interfaceC19390xPArr, 49);
                interfaceC23621Ds2 = null;
                i2 = 12;
                A00 = AnonymousClass104.A00(interfaceC23621Ds, A01, new C50541MSu(i2, interfaceC23621Ds2), interfaceC19960yQ, interfaceC19390xPArr);
                break;
            case 5:
                interfaceC19390xPArr = (InterfaceC19390xP[]) this.A01;
                A01 = new C37015GSu(interfaceC19390xPArr, 10);
                interfaceC23621Ds2 = null;
                i2 = 13;
                A00 = AnonymousClass104.A00(interfaceC23621Ds, A01, new C50541MSu(i2, interfaceC23621Ds2), interfaceC19960yQ, interfaceC19390xPArr);
                break;
            case 6:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i3 = 45;
                mtk = MV6.A00(interfaceC19960yQ, i3);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 7:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i3 = 52;
                mtk = MV6.A00(interfaceC19960yQ, i3);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 8:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i3 = 57;
                mtk = MV6.A00(interfaceC19960yQ, i3);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 9:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i3 = 69;
                mtk = MV6.A00(interfaceC19960yQ, i3);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 10:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 2;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 11:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 6;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 7;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 8;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 14:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 9;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case Process.SIGTERM /* 15 */:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 15;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 16:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 21;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 17:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 22;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 18:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 23;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case Process.SIGSTOP /* 19 */:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 24;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 20:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 25;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 21:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 31;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 22:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 32;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 23:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 33;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 24:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 34;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 25:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 35;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 26:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 36;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 27:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 37;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 28:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 38;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 39;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 30:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                i4 = 42;
                mtk = MWC.A00(interfaceC19960yQ, i4);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 31:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                mtk = C50536MSp.A00(interfaceC19960yQ, 1);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 32:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                mtk = C50536MSp.A00(interfaceC19960yQ, 14);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            case 33:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                mtk = C50536MSp.A00(interfaceC19960yQ, 15);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
            default:
                interfaceC19390xP = (InterfaceC19390xP) this.A01;
                mtk = C50536MSp.A00(interfaceC19960yQ, 16);
                A00 = interfaceC19390xP.collect(mtk, interfaceC23621Ds);
                break;
        }
        return MSX.A0b(A00);
    }
}
