package X;

/* loaded from: classes5.dex */
public final class BVM implements InterfaceC150336ph {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlaybackStarted() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackSeekComplete() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStartedPlaying() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
    }

    public BVM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackCompleted() {
        C147416kR c147416kR;
        if (this.A00 != 0) {
            C37707Gii c37707Gii = (C37707Gii) this.A01;
            C147416kR c147416kR2 = c37707Gii.A03;
            if (c147416kR2 != null && c147416kR2.A08() && (c147416kR = c37707Gii.A03) != null) {
                c147416kR.A06(0);
                return;
            }
            return;
        }
        C25626BUo.A00((C25626BUo) this.A01);
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
        C147416kR c147416kR;
        C147416kR c147416kR2;
        if (this.A00 != 0) {
            C37707Gii c37707Gii = (C37707Gii) this.A01;
            long j = c37707Gii.A00;
            if (j != -1 && i >= j && (c147416kR = c37707Gii.A03) != null && c147416kR.A08() && (c147416kR2 = c37707Gii.A03) != null) {
                c147416kR2.A06(0);
                return;
            }
            return;
        }
        C25626BUo c25626BUo = (C25626BUo) this.A01;
        int i2 = C25626BUo.A0A;
        int i3 = c25626BUo.A01;
        if (i3 == -1 || i < i3) {
            return;
        }
        C25626BUo.A00(c25626BUo);
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPrepared(int i) {
    }
}
