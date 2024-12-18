package X;

import java.util.Arrays;

/* renamed from: X.8Nv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186278Nv implements InterfaceC52932ba {
    public final C186258Nt[] A00;

    public C186278Nv(C186258Nt... c186258NtArr) {
        C14360o3.A0B(c186258NtArr, 1);
        this.A00 = c186258NtArr;
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls) {
        throw new UnsupportedOperationException(MSV.A00(79));
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 0);
        C14360o3.A0B(abstractC52972be, 1);
        C0YZ c0yz = new C0YZ(cls);
        C186258Nt[] c186258NtArr = this.A00;
        C186258Nt[] c186258NtArr2 = (C186258Nt[]) Arrays.copyOf(c186258NtArr, c186258NtArr.length);
        C14360o3.A0B(c186258NtArr2, 2);
        int length = c186258NtArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C186258Nt c186258Nt = c186258NtArr2[i];
            if (C14360o3.A0K(c186258Nt.A01, c0yz)) {
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) c186258Nt.A00.invoke(abstractC52972be);
                if (abstractC52922bZ != null) {
                    return abstractC52922bZ;
                }
            } else {
                i++;
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("No initializer set for given class ", AbstractC13230m9.A00(c0yz.A00)));
    }
}
