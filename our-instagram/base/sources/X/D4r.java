package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes5.dex */
public final class D4r extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4r(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        int i;
        int i2;
        switch (this.A01) {
            case 0:
                obj2 = this.A00;
                i = 0;
                break;
            case 1:
                i2 = 1;
                D4r d4r = new D4r(i2, interfaceC23621Ds);
                d4r.A00 = obj;
                return d4r;
            case 2:
                i2 = 2;
                D4r d4r2 = new D4r(i2, interfaceC23621Ds);
                d4r2.A00 = obj;
                return d4r2;
            case 3:
                obj2 = this.A00;
                i = 3;
                break;
            case 4:
                obj2 = this.A00;
                i = 4;
                break;
            case 5:
                obj2 = this.A00;
                i = 5;
                break;
            case 6:
                obj2 = this.A00;
                i = 6;
                break;
            case 7:
                obj2 = this.A00;
                i = 7;
                break;
            case 8:
                obj2 = this.A00;
                i = 8;
                break;
            case 9:
                obj2 = this.A00;
                i = 9;
                break;
            case 10:
                obj2 = this.A00;
                i = 10;
                break;
            case 11:
                obj2 = this.A00;
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj2 = this.A00;
                i = 12;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj2 = this.A00;
                i = 13;
                break;
            case 14:
                obj2 = this.A00;
                i = 14;
                break;
            case Process.SIGTERM /* 15 */:
                obj2 = this.A00;
                i = 15;
                break;
            case 16:
                obj2 = this.A00;
                i = 16;
                break;
            case 17:
                obj2 = this.A00;
                i = 17;
                break;
            case 18:
                obj2 = this.A00;
                i = 18;
                break;
            case Process.SIGSTOP /* 19 */:
                obj2 = this.A00;
                i = 19;
                break;
            case 20:
                obj2 = this.A00;
                i = 20;
                break;
            case 21:
                obj2 = this.A00;
                i = 21;
                break;
            case 22:
                obj2 = this.A00;
                i = 22;
                break;
            case 23:
                obj2 = this.A00;
                i = 23;
                break;
            case 24:
                obj2 = this.A00;
                i = 24;
                break;
            case 25:
                i2 = 25;
                D4r d4r22 = new D4r(i2, interfaceC23621Ds);
                d4r22.A00 = obj;
                return d4r22;
            case 26:
                i2 = 26;
                D4r d4r222 = new D4r(i2, interfaceC23621Ds);
                d4r222.A00 = obj;
                return d4r222;
            default:
                i2 = 27;
                D4r d4r2222 = new D4r(i2, interfaceC23621Ds);
                d4r2222.A00 = obj;
                return d4r2222;
        }
        return new D4r(obj2, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC23621Ds create;
        if (4 - this.A01 != 0) {
            create = AbstractC166987dD.A1M(obj2, obj, this);
        } else {
            create = create(Integer.valueOf(AbstractC166987dD.A0H(obj)), (InterfaceC23621Ds) obj2);
        }
        return ((D4r) create).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0256, code lost:
    
        if (r3 == 0.0f) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018f, code lost:
    
        if (r7.A03 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019c, code lost:
    
        if (r3 < 0.2f) goto L66;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4r(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A00 = obj;
    }
}
