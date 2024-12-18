package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Is9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42530Is9 implements JH8 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public C42530Is9(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A04 = z;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.JH8
    public final void Dpz(HAO hao) {
        C19L A03;
        InterfaceC16620sF pz0;
        switch (this.A00) {
            case 0:
                boolean z = this.A04;
                C37675GiC c37675GiC = (C37675GiC) this.A03;
                if (!z) {
                    EnumC114765Gh enumC114765Gh = c37675GiC.A0K;
                    if (enumC114765Gh != null) {
                        Integer num = C05F.A00;
                        UserSession userSession = c37675GiC.A0C;
                        InterfaceC60442pS interfaceC60442pS = c37675GiC.A0D;
                        String A2u = ((C38321qM) this.A02).A2u();
                        if (A2u != null) {
                            IT8.A00(interfaceC60442pS, userSession, enumC114765Gh, num, A2u);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    AbstractC59962oe abstractC59962oe = c37675GiC.A08;
                    if (abstractC59962oe.getContext() == null || !abstractC59962oe.isAdded() || abstractC59962oe.mRemoving) {
                        return;
                    }
                    InterfaceC37071o5 A00 = C37091o7.A00();
                    UserSession userSession2 = c37675GiC.A0C;
                    Context requireContext = abstractC59962oe.requireContext();
                    InterfaceC60442pS interfaceC60442pS2 = c37675GiC.A0D;
                    EnumC39589Hdz enumC39589Hdz = EnumC39589Hdz.A0U;
                    C38321qM c38321qM = (C38321qM) this.A02;
                    String id = c38321qM.getId();
                    if (id != null) {
                        A00.Cot(requireContext, interfaceC60442pS2, userSession2, c38321qM.A2E(userSession2), enumC39589Hdz, id);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                C37711Gim c37711Gim = c37675GiC.A0U;
                InterfaceC60442pS interfaceC60442pS3 = c37675GiC.A0D;
                c37711Gim.A04(c37675GiC.A08.mView, (C120985dq) this.A01, interfaceC60442pS3, C37675GiC.A02(c37675GiC));
                return;
            case 1:
                boolean z2 = this.A04;
                C37640GhZ c37640GhZ = (C37640GhZ) this.A03;
                if (!z2) {
                    EnumC114765Gh enumC114765Gh2 = c37640GhZ.A07;
                    C38321qM c38321qM2 = (C38321qM) this.A02;
                    if (enumC114765Gh2 != null) {
                        String A2u2 = c38321qM2.A2u();
                        if (A2u2 == null) {
                            return;
                        }
                        Integer num2 = C05F.A00;
                        IT8.A00(c37640GhZ.A03, c37640GhZ.A02, enumC114765Gh2, num2, A2u2);
                        return;
                    }
                    String id2 = c38321qM2.getId();
                    if (id2 == null) {
                        return;
                    }
                    A03 = c37640GhZ.A03();
                    pz0 = new C57148PXa(c37640GhZ, c38321qM2, id2, null, 3);
                } else {
                    A03 = c37640GhZ.A03();
                    pz0 = new PZ0(this.A01, c37640GhZ, null, 2);
                }
                AbstractC166987dD.A1Z(pz0, A03);
                return;
            default:
                return;
        }
    }

    @Override // X.JH8
    public final void onFail(AbstractC115105If abstractC115105If) {
    }
}
