package X;

import java.util.ArrayList;

/* renamed from: X.WhV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70812WhV implements InterfaceC13000lm, InterfaceC13030lp {
    public final ArrayList igBloksIdfaDialogList = AbstractC166987dD.A1E();

    @Override // X.InterfaceC13030lp
    public final void DyC(boolean z) {
        this.igBloksIdfaDialogList.clear();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.igBloksIdfaDialogList.clear();
    }
}
