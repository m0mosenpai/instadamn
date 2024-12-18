package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes9.dex */
public final class MU8 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MU8(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        super(3, interfaceC23621Ds);
        this.A04 = 6;
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
    }

    public static Object A00(Object obj, MU8 mu8, InterfaceC19960yQ interfaceC19960yQ, int i) {
        mu8.A00 = i;
        return interfaceC19960yQ.emit(obj, mu8);
    }

    public static boolean A02(Boolean[] boolArr, int i) {
        Boolean bool = boolArr[i];
        C14360o3.A0C(bool, "null cannot be cast to non-null type kotlin.Boolean");
        return bool.booleanValue();
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i;
        Object obj5;
        int i2;
        MU8 mu8;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        switch (this.A04) {
            case 0:
                obj5 = this.A01;
                i2 = 0;
                mu8 = new MU8(interfaceC23621Ds, obj5, i2);
                mu8.A02 = obj;
                mu8.A03 = obj2;
                break;
            case 1:
                obj4 = this.A03;
                i = 1;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 2:
                obj4 = this.A03;
                i = 2;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 3:
                obj4 = this.A03;
                i = 3;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 4:
                obj4 = this.A03;
                i = 4;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 5:
                obj4 = this.A03;
                i = 5;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 6:
                mu8 = new MU8(interfaceC23621Ds, (InterfaceC16660sJ) this.A02, (InterfaceC16660sJ) this.A01);
                mu8.A03 = obj;
                break;
            case 7:
                obj4 = this.A03;
                i = 7;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 8:
                obj4 = this.A03;
                i = 8;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 9:
                obj5 = this.A01;
                i2 = 9;
                mu8 = new MU8(interfaceC23621Ds, obj5, i2);
                mu8.A02 = obj;
                mu8.A03 = obj2;
                break;
            case 10:
                obj4 = this.A03;
                i = 10;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 11:
                obj4 = this.A03;
                i = 11;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj5 = this.A01;
                i2 = 12;
                mu8 = new MU8(interfaceC23621Ds, obj5, i2);
                mu8.A02 = obj;
                mu8.A03 = obj2;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj4 = this.A03;
                i = 13;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 14:
                obj4 = this.A03;
                i = 14;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case Process.SIGTERM /* 15 */:
                obj4 = this.A03;
                i = 15;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 16:
                obj4 = this.A03;
                i = 16;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 17:
                obj5 = this.A01;
                i2 = 17;
                mu8 = new MU8(interfaceC23621Ds, obj5, i2);
                mu8.A02 = obj;
                mu8.A03 = obj2;
                break;
            case 18:
                obj4 = this.A03;
                i = 18;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case Process.SIGSTOP /* 19 */:
                obj4 = this.A03;
                i = 19;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 20:
                obj4 = this.A03;
                i = 20;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 21:
                obj4 = this.A03;
                i = 21;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 22:
                obj4 = this.A03;
                i = 22;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 23:
                obj4 = this.A03;
                i = 23;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 24:
                obj4 = this.A03;
                i = 24;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 25:
                obj4 = this.A03;
                i = 25;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 26:
                obj4 = this.A03;
                i = 26;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 27:
                obj4 = this.A03;
                i = 27;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 28:
                obj4 = this.A03;
                i = 28;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj4 = this.A03;
                i = 29;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 30:
                obj4 = this.A03;
                i = 30;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 31:
                obj5 = this.A01;
                i2 = 31;
                mu8 = new MU8(interfaceC23621Ds, obj5, i2);
                mu8.A02 = obj;
                mu8.A03 = obj2;
                break;
            case 32:
                obj5 = this.A01;
                i2 = 32;
                mu8 = new MU8(interfaceC23621Ds, obj5, i2);
                mu8.A02 = obj;
                mu8.A03 = obj2;
                break;
            case 33:
                obj5 = this.A01;
                i2 = 33;
                mu8 = new MU8(interfaceC23621Ds, obj5, i2);
                mu8.A02 = obj;
                mu8.A03 = obj2;
                break;
            case 34:
                obj4 = this.A03;
                i = 34;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 35:
                obj4 = this.A03;
                i = 35;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 36:
                obj4 = this.A03;
                i = 36;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 37:
                obj4 = this.A03;
                i = 37;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 38:
                obj4 = this.A03;
                i = 38;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 39:
                obj4 = this.A03;
                i = 39;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 40:
                obj4 = this.A03;
                i = 40;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                obj4 = this.A03;
                i = 41;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj4 = this.A03;
                i = 42;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 43:
                obj4 = this.A03;
                i = 43;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case 44:
                obj5 = this.A01;
                i2 = 44;
                mu8 = new MU8(interfaceC23621Ds, obj5, i2);
                mu8.A02 = obj;
                mu8.A03 = obj2;
                break;
            case 45:
                obj4 = this.A03;
                i = 45;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj4 = this.A03;
                i = 46;
                mu8 = new MU8(obj4, interfaceC23621Ds, i);
                mu8.A01 = obj;
                mu8.A02 = obj2;
                break;
            default:
                obj5 = this.A01;
                i2 = 47;
                mu8 = new MU8(interfaceC23621Ds, obj5, i2);
                mu8.A02 = obj;
                mu8.A03 = obj2;
                break;
        }
        return mu8.invokeSuspend(C0eB.A00);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 1977
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // X.C1Dr
    public final java.lang.Object invokeSuspend(java.lang.Object r65) {
        /*
            Method dump skipped, instructions count: 11068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MU8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static InterfaceC19960yQ A01(Object obj, MU8 mu8) {
        AbstractC09560e7.A00(obj);
        return (InterfaceC19960yQ) mu8.A01;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MU8(InterfaceC23621Ds interfaceC23621Ds, Object obj, int i) {
        super(3, interfaceC23621Ds);
        this.A04 = i;
        this.A01 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MU8(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
    }
}
