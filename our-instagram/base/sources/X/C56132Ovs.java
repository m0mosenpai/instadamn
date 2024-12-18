package X;

import java.util.Map;

/* renamed from: X.Ovs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56132Ovs implements InterfaceC13000lm {
    public final Map A02 = AbstractC166987dD.A1G();
    public final Map A00 = AbstractC166987dD.A1G();
    public final Map A01 = AbstractC166987dD.A1G();

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.clear();
        this.A00.clear();
        this.A01.clear();
    }
}
