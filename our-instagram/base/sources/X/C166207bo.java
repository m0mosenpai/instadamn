package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166207bo implements InterfaceC13000lm {
    public final WeakReference A00;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    public C166207bo(C166217bp c166217bp) {
        this.A00 = new WeakReference(c166217bp);
    }
}
