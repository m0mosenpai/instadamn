package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes9.dex */
public final class PXV extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXV(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        int i;
        switch (this.A01) {
            case 0:
                obj2 = this.A02;
                str = this.A03;
                i = 0;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 1:
                obj2 = this.A02;
                str = this.A03;
                i = 1;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 2:
                obj2 = this.A02;
                str = this.A03;
                i = 2;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 3:
                obj2 = this.A02;
                str = this.A03;
                i = 3;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 4:
                obj2 = this.A02;
                str = this.A03;
                i = 4;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 5:
                obj2 = this.A02;
                str = this.A03;
                i = 5;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 6:
                obj2 = this.A02;
                str = this.A03;
                i = 6;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 7:
                obj2 = this.A02;
                str = this.A03;
                i = 7;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 8:
                obj2 = this.A02;
                str = this.A03;
                i = 8;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 9:
                obj2 = this.A02;
                str = this.A03;
                i = 9;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 10:
                obj2 = this.A02;
                str = this.A03;
                i = 10;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 11:
                obj2 = this.A02;
                str = this.A03;
                i = 11;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new PXV(this.A02, this.A03, interfaceC23621Ds, 12);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj2 = this.A02;
                str = this.A03;
                i = 13;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case 14:
                obj2 = this.A02;
                str = this.A03;
                i = 14;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            case Process.SIGTERM /* 15 */:
                obj2 = this.A02;
                str = this.A03;
                i = 15;
                return new PXV(obj2, str, interfaceC23621Ds, i);
            default:
                obj2 = this.A02;
                str = this.A03;
                i = 16;
                return new PXV(obj2, str, interfaceC23621Ds, i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0308 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0387 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x038b A[PHI: r3
      0x038b: PHI (r3v4 java.lang.Object) = (r3v0 java.lang.Object), (r3v5 java.lang.Object) binds: [B:100:0x0388, B:97:0x0385] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PXV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PXV) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
