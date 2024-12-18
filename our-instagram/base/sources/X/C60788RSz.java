package X;

/* renamed from: X.RSz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60788RSz extends AbstractC25341Lo {
    @Override // X.AbstractC25341Lo
    public final int A00(C1LW state) {
        int i;
        synchronized (state) {
            AbstractC25341Lo abstractC25341Lo = C1LW.A00;
            i = state.remaining - 1;
            state.remaining = i;
        }
        return i;
    }

    @Override // X.AbstractC25341Lo
    public final void A01(C1LW state, java.util.Set expect, java.util.Set update) {
        synchronized (state) {
            AbstractC25341Lo abstractC25341Lo = C1LW.A00;
            if (state.seenExceptions == null) {
                state.seenExceptions = update;
            }
        }
    }
}
