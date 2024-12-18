package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes9.dex */
public final class PXT extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXT(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        int i;
        switch (this.A01) {
            case 0:
                obj2 = this.A02;
                i = 0;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 1:
                obj2 = this.A02;
                i = 1;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 2:
                obj2 = this.A02;
                i = 2;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 3:
                obj2 = this.A02;
                i = 3;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 4:
                obj2 = this.A02;
                i = 4;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 5:
                obj2 = this.A02;
                i = 5;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 6:
                obj2 = this.A02;
                i = 6;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 7:
                obj2 = this.A02;
                i = 7;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 8:
                obj2 = this.A02;
                i = 8;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 9:
                obj2 = this.A02;
                i = 9;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 10:
                obj2 = this.A02;
                i = 10;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 11:
                obj2 = this.A02;
                i = 11;
                return new PXT(obj2, interfaceC23621Ds, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj2 = this.A02;
                i = 12;
                return new PXT(obj2, interfaceC23621Ds, i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj2 = this.A02;
                i = 13;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 14:
                PXT pxt = new PXT(this.A02, interfaceC23621Ds, 14);
                pxt.A00 = AbstractC166987dD.A0H(obj);
                return pxt;
            case Process.SIGTERM /* 15 */:
                obj2 = this.A02;
                i = 15;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 16:
                obj2 = this.A02;
                i = 16;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 17:
                obj2 = this.A02;
                i = 17;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 18:
                obj2 = this.A02;
                i = 18;
                return new PXT(obj2, interfaceC23621Ds, i);
            case Process.SIGSTOP /* 19 */:
                obj2 = this.A02;
                i = 19;
                return new PXT(obj2, interfaceC23621Ds, i);
            case 20:
                obj2 = this.A02;
                i = 20;
                return new PXT(obj2, interfaceC23621Ds, i);
            default:
                obj2 = this.A02;
                i = 21;
                return new PXT(obj2, interfaceC23621Ds, i);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC23621Ds create;
        if (14 - this.A01 != 0) {
            create = AbstractC166987dD.A1M(obj2, obj, this);
        } else {
            create = create(Integer.valueOf(AbstractC166987dD.A0H(obj)), (InterfaceC23621Ds) obj2);
        }
        return ((PXT) create).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x021e, code lost:
    
        if (r1 == r0) goto L165;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03b9 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PXT.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
