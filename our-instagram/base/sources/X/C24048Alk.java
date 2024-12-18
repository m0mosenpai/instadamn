package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Alk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24048Alk implements InterfaceC58073Poy {
    public final /* synthetic */ C51761Mtk A00;
    public final /* synthetic */ InterfaceC196248mG A01;
    public final /* synthetic */ AiS A02;

    public C24048Alk(C51761Mtk c51761Mtk, InterfaceC196248mG interfaceC196248mG, AiS aiS) {
        this.A02 = aiS;
        this.A00 = c51761Mtk;
        this.A01 = interfaceC196248mG;
    }

    @Override // X.InterfaceC58073Poy
    public final void DFf() {
        this.A01.DG4("FbCreatorBPLCrossPostingSettingMutator - Mutation failed");
    }

    @Override // X.InterfaceC58073Poy
    public final void Dq3(C213789dd c213789dd) {
        boolean A1a;
        InterfaceC19610xo ARD;
        String str;
        AiS aiS = this.A02;
        Iterator A15 = AbstractC166997dE.A15((Map) this.A00.A02);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            int ordinal = ((EnumC222709sB) A1K.getKey()).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        ((C46552Bt) aiS.A01.getValue()).A06(AbstractC166987dD.A1a(A1K.getValue()));
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    C46552Bt c46552Bt = (C46552Bt) aiS.A01.getValue();
                    A1a = AbstractC166987dD.A1a(A1K.getValue());
                    ARD = c46552Bt.A04.ARD();
                    str = "PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING";
                }
            } else {
                C46552Bt c46552Bt2 = (C46552Bt) aiS.A01.getValue();
                A1a = AbstractC166987dD.A1a(A1K.getValue());
                ARD = c46552Bt2.A04.ARD();
                str = "PREFERENCE_CREATOR_FEED_BPL_AUTO_XPOSTING";
            }
            ARD.E77(str, A1a);
            ARD.apply();
        }
    }
}
