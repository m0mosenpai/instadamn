package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes9.dex */
public final class PYX extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYX(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A00;
        Object obj2 = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 12;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            case Process.SIGTERM /* 15 */:
                i = 15;
                break;
            case 16:
                i = 16;
                break;
            case 17:
                i = 17;
                break;
            case 18:
                i = 18;
                break;
            case Process.SIGSTOP /* 19 */:
                i = 19;
                break;
            case 20:
                i = 20;
                break;
            case 21:
                i = 21;
                break;
            case 22:
                i = 22;
                break;
            case 23:
                i = 23;
                break;
            case 24:
                i = 24;
                break;
            case 25:
                i = 25;
                break;
            case 26:
                i = 26;
                break;
            case 27:
                i = 27;
                break;
            case 28:
                i = 28;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                i = 29;
                break;
            case 30:
                i = 30;
                break;
            case 31:
                i = 31;
                break;
            case 32:
                i = 32;
                break;
            case 33:
                i = 33;
                break;
            case 34:
                i = 34;
                break;
            case 35:
                i = 35;
                break;
            case 36:
                i = 36;
                break;
            case 37:
                i = 37;
                break;
            case 38:
                i = 38;
                break;
            case 39:
                i = 39;
                break;
            case 40:
                i = 40;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                i = 41;
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                i = 42;
                break;
            case 43:
                i = 43;
                break;
            case 44:
                i = 44;
                break;
            case 45:
                i = 45;
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                i = 46;
                break;
            case 47:
                i = 47;
                break;
            case 48:
                i = 48;
                break;
            default:
                i = 49;
                break;
        }
        return new PYX(obj2, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC23621Ds interfaceC23621Ds;
        Object valueOf;
        InterfaceC23621Ds create;
        switch (this.A00) {
            case 6:
            case 24:
                interfaceC23621Ds = (InterfaceC23621Ds) obj2;
                valueOf = Float.valueOf(AbstractC166987dD.A09(obj));
                create = create(valueOf, interfaceC23621Ds);
                break;
            case 21:
                interfaceC23621Ds = (InterfaceC23621Ds) obj2;
                valueOf = Integer.valueOf(AbstractC166987dD.A0H(obj));
                create = create(valueOf, interfaceC23621Ds);
                break;
            case 47:
                interfaceC23621Ds = (InterfaceC23621Ds) obj2;
                valueOf = Long.valueOf(AbstractC166987dD.A0N(obj));
                create = create(valueOf, interfaceC23621Ds);
                break;
            default:
                create = AbstractC166987dD.A1M(obj2, obj, this);
                break;
        }
        return ((PYX) create).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x049e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0o(r4.A0J), 36328972283428769L) != false) goto L137;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b7  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, PYX pyx) {
        AbstractC09560e7.A00(obj);
        return pyx.A01;
    }
}
