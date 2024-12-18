package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Alf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24043Alf implements InterfaceC58072Pox {
    public final /* synthetic */ C51761Mtk A00;
    public final /* synthetic */ InterfaceC196248mG A01;
    public final /* synthetic */ AiT A02;

    public C24043Alf(C51761Mtk c51761Mtk, InterfaceC196248mG interfaceC196248mG, AiT aiT) {
        this.A02 = aiT;
        this.A00 = c51761Mtk;
        this.A01 = interfaceC196248mG;
    }

    @Override // X.InterfaceC58072Pox
    public final void DFf() {
        this.A01.DG4("UnifiedConfigCrossPostingSettingMutator - Mutation failed");
    }

    @Override // X.InterfaceC58072Pox
    public final void Dq5(C213849dj c213849dj) {
        AiT aiT = this.A02;
        Iterator A15 = AbstractC166997dE.A15((Map) this.A00.A02);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            int ordinal = ((EnumC222709sB) A1K.getKey()).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        ((C46552Bt) aiT.A01.getValue()).A09(AbstractC166987dD.A1a(A1K.getValue()));
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    ((C23031Ai) aiT.A02.getValue()).A1L(AbstractC166987dD.A1a(A1K.getValue()));
                }
            } else {
                C23031Ai c23031Ai = (C23031Ai) aiT.A02.getValue();
                boolean A1a = AbstractC166987dD.A1a(A1K.getValue());
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
                A0w.E77("auto_cross_post_to_facebook_feed", A1a);
                A0w.apply();
            }
        }
    }
}
