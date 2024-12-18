package X;

import java.util.Map;

/* renamed from: X.IpA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42348IpA implements InterfaceC13050lr {
    public final Map A00 = AbstractC166987dD.A1G();

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.A00.clear();
        }
    }
}
