package X;

import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public final class HG1 extends C1P1 {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-1242675345);
            InterfaceC40821up interfaceC40821up = (InterfaceC40821up) obj;
            int A0N = AbstractC167017dG.A0N(interfaceC40821up, -1892019503);
            ((C41203ILr) this.A04).A01.DqQ(interfaceC40821up, (C41643IbZ) this.A02, (Product) this.A03, this.A01, System.currentTimeMillis());
            C0f9.A0A(1780297630, A0N);
            i = -106672361;
        } else {
            A03 = C0f9.A03(-1589926703);
            InterfaceC40821up interfaceC40821up2 = (InterfaceC40821up) obj;
            int A0N2 = AbstractC167017dG.A0N(interfaceC40821up2, 1821917899);
            ((C41202ILq) this.A04).A01.DqQ(interfaceC40821up2, (C41643IbZ) this.A02, (Product) this.A03, this.A01, System.currentTimeMillis());
            C0f9.A0A(168952883, A0N2);
            i = 298787439;
        }
        C0f9.A0A(i, A03);
    }

    public HG1(int i, long j, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A04 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = j;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        if (this.A00 != 0) {
            A0N = AbstractC167017dG.A0N(abstractC115105If, -1154421074);
            ((C41203ILr) this.A04).A01.DFn((C41643IbZ) this.A02, (Product) this.A03, abstractC115105If.A01(), this.A01, System.currentTimeMillis());
            i = -620595446;
        } else {
            A0N = AbstractC167017dG.A0N(abstractC115105If, 1479100464);
            ((C41202ILq) this.A04).A01.DFn((C41643IbZ) this.A02, (Product) this.A03, abstractC115105If.A01(), this.A01, System.currentTimeMillis());
            i = -2022691489;
        }
        C0f9.A0A(i, A0N);
    }
}
