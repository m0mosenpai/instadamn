package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.meta.compose.component.swipeable.SwipeableState;

/* loaded from: classes9.dex */
public final class PYa extends AbstractC23611Dp implements InterfaceC16620sF {
    public float A00;
    public int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r0 != r3) goto L83;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYa(Object obj, InterfaceC23621Ds interfaceC23621Ds, float f, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A00 = f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        float f;
        int i;
        switch (this.A02) {
            case 0:
                obj2 = this.A03;
                f = this.A00;
                i = 0;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 1:
                obj2 = this.A03;
                f = this.A00;
                i = 1;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 2:
                obj2 = this.A03;
                f = this.A00;
                i = 2;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 3:
                obj2 = this.A03;
                f = this.A00;
                i = 3;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 4:
                obj2 = this.A03;
                f = this.A00;
                i = 4;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 5:
                obj2 = this.A03;
                f = this.A00;
                i = 5;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 6:
                obj2 = this.A03;
                f = this.A00;
                i = 6;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 7:
                obj2 = this.A03;
                f = this.A00;
                i = 7;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 8:
                obj2 = this.A03;
                f = this.A00;
                i = 8;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 9:
                obj2 = this.A03;
                f = this.A00;
                i = 9;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 10:
                obj2 = this.A03;
                f = this.A00;
                i = 10;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 11:
                obj2 = this.A03;
                f = this.A00;
                i = 11;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj2 = this.A03;
                f = this.A00;
                i = 12;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj2 = this.A03;
                f = this.A00;
                i = 13;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            case 14:
                PYa pYa = new PYa((SwipeableState) this.A03, interfaceC23621Ds);
                pYa.A00 = AbstractC166987dD.A09(obj);
                return pYa;
            case Process.SIGTERM /* 15 */:
                obj2 = this.A03;
                f = this.A00;
                i = 15;
                return new PYa(obj2, interfaceC23621Ds, f, i);
            default:
                obj2 = this.A03;
                f = this.A00;
                i = 16;
                return new PYa(obj2, interfaceC23621Ds, f, i);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC23621Ds create;
        if (14 - this.A02 != 0) {
            create = AbstractC166987dD.A1M(obj2, obj, this);
        } else {
            create = create(Float.valueOf(AbstractC166987dD.A09(obj)), (InterfaceC23621Ds) obj2);
        }
        return ((PYa) create).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYa(SwipeableState swipeableState, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = 14;
        this.A03 = swipeableState;
    }
}
