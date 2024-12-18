package X;

import java.util.HashSet;

/* renamed from: X.DqA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31345DqA implements InterfaceC13050lr {
    public final HashSet A00 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.A00.clear();
        }
    }
}
