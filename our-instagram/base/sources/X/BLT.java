package X;

import com.facebook.react.modules.dialog.DialogModule;

/* loaded from: classes5.dex */
public final class BLT implements InterfaceC31052Dks {
    public InterfaceC16660sJ A00;
    public InterfaceC16620sF A01;
    public final BML A02;

    @Override // X.InterfaceC31052Dks
    public final void DGG(C26246BjF c26246BjF) {
        C14360o3.A0B(c26246BjF, 0);
        if (this.A02.A01) {
            int ordinal = c26246BjF.A00.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 1) {
                        throw B4Z.A00();
                    }
                } else {
                    InterfaceC16620sF interfaceC16620sF = this.A01;
                    if (interfaceC16620sF != null) {
                        interfaceC16620sF.invoke(c26246BjF.A01, c26246BjF.A02);
                        return;
                    }
                    return;
                }
            } else {
                C0f5 AEp = C18950wb.A01.AEp("onFanClubBadgeClick", 817902720);
                AEp.ABW(DialogModule.KEY_MESSAGE, "default visibility");
                AEp.report();
                return;
            }
        }
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(c26246BjF.A02);
        }
    }

    @Override // X.InterfaceC31052Dks
    public final void DGH() {
        InterfaceC19630xq interfaceC19630xq = this.A02.A00.A01;
        AbstractC167007dF.A18(interfaceC19630xq, "exclusive_content_animation_reels_count", interfaceC19630xq.getInt("exclusive_content_animation_reels_count", 0) + 1);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7G("exclusive_content_animation_reels_timestamp", currentTimeMillis);
        ARD.apply();
    }

    public BLT(BML bml) {
        this.A02 = bml;
    }

    @Override // X.InterfaceC31052Dks
    public final void EXR(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31052Dks
    public final void EXU(InterfaceC16620sF interfaceC16620sF) {
        this.A01 = interfaceC16620sF;
    }
}
