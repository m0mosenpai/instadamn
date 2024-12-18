package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.HFz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39023HFz extends C1P1 {
    public final /* synthetic */ C84823qW A00;
    public final /* synthetic */ C106074qN A01;
    public final /* synthetic */ C146036i0 A02;

    public C39023HFz(C84823qW c84823qW, C106074qN c106074qN, C146036i0 c146036i0) {
        this.A02 = c146036i0;
        this.A01 = c106074qN;
        this.A00 = c84823qW;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-506087818);
        this.A00.A17 = this.A01;
        C9GR.A0F(this.A02.A06, "sticker_send_reaction_error", 2131974416);
        C0f9.A0A(74975639, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-715460124);
        int A032 = C0f9.A03(284621812);
        C146036i0 c146036i0 = this.A02;
        InterfaceC1118853a interfaceC1118853a = c146036i0.A0F;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
        if (reelViewerFragment.A0a != null && interfaceC1118853a.AuU() != null) {
            c146036i0.A0D.A07(reelViewerFragment.A0a.A0H, interfaceC1118853a.AuU(), "reaction_sticker", AnonymousClass001.A0R(AbstractC111324zv.A00(4364), this.A01.A00), reelViewerFragment.A0a.A01);
        }
        C0f9.A0A(425615443, A032);
        C0f9.A0A(1898867277, A03);
    }
}
