package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes9.dex */
public final class PZK extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public boolean A01;
    public final int A02;
    public final Object A03;

    public static Object A00(String str, PZK pzk) {
        C52679NSc c52679NSc = (C52679NSc) pzk.A03;
        C1ON A00 = AbstractC54245NyQ.A00(c52679NSc.A00, c52679NSc.A02.getId(), str);
        pzk.A00 = 1;
        return A00.A00(854803684, pzk);
    }

    public static void A01(Object obj, C19L c19l, int i, boolean z) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZK(obj, null, i, z), c19l);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZK(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z;
        Object obj2;
        int i;
        Object obj3;
        boolean z2;
        int i2;
        switch (this.A02) {
            case 0:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 0;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case 1:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 1;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case 2:
                z = this.A01;
                obj2 = this.A03;
                i = 2;
                break;
            case 3:
                z = this.A01;
                obj2 = this.A03;
                i = 3;
                break;
            case 4:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 4;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case 5:
                z = this.A01;
                obj2 = this.A03;
                i = 5;
                break;
            case 6:
                z = this.A01;
                obj2 = this.A03;
                i = 6;
                break;
            case 7:
                z = this.A01;
                obj2 = this.A03;
                i = 7;
                break;
            case 8:
                z = this.A01;
                obj2 = this.A03;
                i = 8;
                break;
            case 9:
                z = this.A01;
                obj2 = this.A03;
                i = 9;
                break;
            case 10:
                PZK pzk = new PZK(this.A03, interfaceC23621Ds, 10);
                pzk.A01 = AbstractC166987dD.A1a(obj);
                return pzk;
            case 11:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 11;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 12;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 13;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case 14:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 14;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case Process.SIGTERM /* 15 */:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 15;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case 16:
                PZK pzk2 = new PZK(this.A03, interfaceC23621Ds, 16);
                pzk2.A01 = AbstractC166987dD.A1a(obj);
                return pzk2;
            case 17:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 17;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case 18:
                z = this.A01;
                obj2 = this.A03;
                i = 18;
                break;
            case Process.SIGSTOP /* 19 */:
                z = this.A01;
                obj2 = this.A03;
                i = 19;
                break;
            case 20:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 20;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case 21:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 21;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case 22:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 22;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            case 23:
                z = this.A01;
                obj2 = this.A03;
                i = 23;
                break;
            case 24:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 24;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
            default:
                obj3 = this.A03;
                z2 = this.A01;
                i2 = 25;
                return new PZK(obj3, interfaceC23621Ds, i2, z2);
        }
        return new PZK(obj2, interfaceC23621Ds, i, z);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0738 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0691 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PZK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PZK) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZK(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = z;
    }
}
