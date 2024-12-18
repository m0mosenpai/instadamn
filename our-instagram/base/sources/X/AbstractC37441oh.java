package X;

/* renamed from: X.1oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37441oh implements InterfaceC37451oi {
    public abstract void onEventReceivedWithParamsCollectionMap(C0CA c0ca, C42751y3 c42751y3);

    @Override // X.InterfaceC37451oi
    public void onEventsWritten(int i) {
    }

    @Override // X.InterfaceC37451oi
    public final void onEventReceived() {
        throw new UnsupportedOperationException("The debug event listener expects only onEventReceivedWithParamsCollectionMap to be called. For production, use EventListener instead.");
    }
}
