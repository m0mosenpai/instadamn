package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.J6c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43164J6c extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43164J6c(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
        this.A03 = obj2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        long j;
        Object obj3;
        int i;
        switch (this.A00) {
            case 0:
                obj3 = null;
                obj2 = this.A02;
                j = this.A01;
                i = 0;
                break;
            case 1:
                obj3 = this.A03;
                j = this.A01;
                obj2 = this.A02;
                i = 1;
                break;
            case 2:
                obj2 = this.A02;
                j = this.A01;
                obj3 = this.A03;
                i = 2;
                break;
            default:
                obj2 = this.A02;
                j = this.A01;
                obj3 = this.A03;
                i = 3;
                break;
        }
        return new C43164J6c(obj2, obj3, interfaceC23621Ds, i, j);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C191778eZ c191778eZ;
        Context context;
        HashMap A01;
        long j;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                AbstractC09560e7.A00(obj);
                throw AbstractC166987dD.A15("looperHistory");
            case 1:
                AbstractC09560e7.A00(obj);
                IJF ijf = (IJF) this.A03;
                if (ijf.A02.nextClearBit(0) >= 2) {
                    AbstractC191798eb.A03(ijf.A00, (InterfaceC191788ea) this.A02, AbstractC111324zv.A00(363), null, AbstractC191768eY.A01(ijf.A04), this.A01);
                    return C0eB.A00;
                }
                throw AbstractC31173DnH.A0f();
            case 2:
                AbstractC09560e7.A00(obj);
                IJW ijw = (IJW) this.A02;
                ijw.A00 = this.A01;
                c191778eZ = new C191778eZ(((C41749IeN) this.A03).A0Q);
                if (ijw.A02.nextClearBit(0) >= 1) {
                    context = ijw.A01;
                    A01 = AbstractC191768eY.A01(ijw.A05);
                    j = ijw.A00;
                    str = null;
                    str2 = "com.bloks.www.minishops.storefront.ig";
                    break;
                } else {
                    throw AbstractC31173DnH.A0f();
                }
            default:
                AbstractC09560e7.A00(obj);
                IJV ijv = (IJV) this.A02;
                ijv.A00 = this.A01;
                c191778eZ = new C191778eZ(((INB) this.A03).A09);
                if (ijv.A02.nextClearBit(0) >= 1) {
                    context = ijv.A01;
                    A01 = AbstractC191768eY.A01(ijv.A05);
                    j = ijv.A00;
                    str = null;
                    str2 = AbstractC111324zv.A00(365);
                    break;
                } else {
                    throw AbstractC31173DnH.A0f();
                }
        }
        AbstractC191798eb.A03(context, c191778eZ, str2, str, A01, j);
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C43164J6c) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
