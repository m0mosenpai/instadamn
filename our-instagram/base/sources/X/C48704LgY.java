package X;

import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.LgY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48704LgY implements InterfaceC50457MPl {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C47340Kvp A02;

    public C48704LgY(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47340Kvp c47340Kvp) {
        this.A02 = c47340Kvp;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC50457MPl
    public final C7IK Auw() {
        return this.A02.A00.A03.A0A;
    }

    @Override // X.InterfaceC50457MPl
    public final void DE1() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A00, this.A01), "direct_custom_cutout_sticker_tap");
        if (A0f.isSampled()) {
            A0f.AAP("target", "custom_cutout_sticker");
            A0f.Cht();
        }
        C48733Lh1 c48733Lh1 = this.A02.A00.A03;
        UserSession userSession = c48733Lh1.A0G;
        AbstractC46702KlL.A00(new MUW(C05F.A0Y, (Integer) null, "custom_cutout_sticker", (String) null, 12), AbstractC31176DnK.A0O(userSession, "ig_direct_expression_tray"), userSession, c48733Lh1.A0S, c48733Lh1.A0U);
        C47933LFf c47933LFf = c48733Lh1.A0J.A00.A00;
        if (c47933LFf != null) {
            KCW A00 = C47933LFf.A00(c47933LFf);
            C6XJ.A05(A00.getActivity(), AbstractC166987dD.A0b(), TransparentModalActivity.class, AbstractC111324zv.A00(1522), 1109);
        }
    }
}
