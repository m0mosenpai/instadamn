package X;

import com.instagram.user.model.User;

/* renamed from: X.LhT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48761LhT implements InterfaceC50466MPu {
    public final /* synthetic */ KBk A00;

    @Override // X.InterfaceC50466MPu
    public final void CpT(User user) {
        C14360o3.A0B(user, 0);
        LKo lKo = LKo.A00;
        KBk kBk = this.A00;
        lKo.A05(kBk, kBk, AbstractC166987dD.A0r(kBk.A03), user);
    }

    @Override // X.InterfaceC50466MPu
    public final void FDS(User user) {
        C14360o3.A0B(user, 0);
        LKo lKo = LKo.A00;
        KBk kBk = this.A00;
        lKo.A06(kBk.requireActivity(), null, kBk, AbstractC166987dD.A0r(kBk.A03), null, user.getId(), false);
    }

    public C48761LhT(KBk kBk) {
        this.A00 = kBk;
    }
}
