package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes9.dex */
public final class PXZ extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXZ(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A04 = z;
        this.A03 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        boolean z;
        String str;
        int i;
        switch (this.A01) {
            case 0:
                obj2 = this.A02;
                z = this.A04;
                str = this.A03;
                i = 0;
                break;
            case 1:
                obj2 = this.A02;
                z = this.A04;
                str = this.A03;
                i = 1;
                break;
            case 2:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 2;
                break;
            case 3:
                obj2 = this.A02;
                z = this.A04;
                str = this.A03;
                i = 3;
                break;
            case 4:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 4;
                break;
            case 5:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 5;
                break;
            case 6:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 6;
                break;
            case 7:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 7;
                break;
            case 8:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 8;
                break;
            case 9:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 9;
                break;
            case 10:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 10;
                break;
            case 11:
                obj2 = this.A02;
                z = this.A04;
                str = this.A03;
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj2 = this.A02;
                z = this.A04;
                str = this.A03;
                i = 12;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 13;
                break;
            case 14:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 14;
                break;
            case Process.SIGTERM /* 15 */:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 15;
                break;
            case 16:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 16;
                break;
            case 17:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 17;
                break;
            case 18:
                z = this.A04;
                obj2 = this.A02;
                str = this.A03;
                i = 18;
                break;
            case Process.SIGSTOP /* 19 */:
                obj2 = this.A02;
                z = this.A04;
                str = this.A03;
                i = 19;
                break;
            case 20:
                obj2 = this.A02;
                z = this.A04;
                str = this.A03;
                i = 20;
                break;
            default:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 21;
                break;
        }
        return new PXZ(obj2, str, interfaceC23621Ds, i, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x046d, code lost:
    
        if (r1 != r0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bd, code lost:
    
        if (r1 == null) goto L90;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x04e9 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PXZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PXZ) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
