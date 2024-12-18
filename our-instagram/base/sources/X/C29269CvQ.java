package X;

import com.instagram.user.model.User;

/* renamed from: X.CvQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29269CvQ implements InterfaceC50466MPu {
    public final /* synthetic */ C26863BtP A00;

    @Override // X.InterfaceC50466MPu
    public final void CpT(User user) {
        C14360o3.A0B(user, 0);
        LKo lKo = LKo.A00;
        C26863BtP c26863BtP = this.A00;
        lKo.A05(c26863BtP, c26863BtP, AbstractC166987dD.A0r(c26863BtP.A09), user);
    }

    @Override // X.InterfaceC50466MPu
    public final void FDS(User user) {
        C14360o3.A0B(user, 0);
        LKo lKo = LKo.A00;
        C26863BtP c26863BtP = this.A00;
        lKo.A06(c26863BtP.requireActivity(), null, c26863BtP, AbstractC166987dD.A0r(c26863BtP.A09), null, user.getId(), false);
    }

    public C29269CvQ(C26863BtP c26863BtP) {
        this.A00 = c26863BtP;
    }
}
