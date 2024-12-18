package X;

/* loaded from: classes12.dex */
public final class YFM implements InterfaceC150336ph {
    public final InterfaceC150336ph A00;
    public final C72786Xn6 A01;
    public final YQT A02;
    public final C43647JSf A03;

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackCompleted() {
        InterfaceC150336ph interfaceC150336ph = this.A00;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackCompleted();
        }
        InterfaceC678133v interfaceC678133v = this.A01.A01;
        interfaceC678133v.seekTo(0);
        interfaceC678133v.E4S();
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
        InterfaceC150336ph interfaceC150336ph = this.A00;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackPlayTimeUpdated(i);
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlaybackStarted() {
        InterfaceC150336ph interfaceC150336ph = this.A00;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackPlaybackStarted();
        }
        this.A02.Cjc();
        this.A01.A00 = C05F.A0Y;
        C43647JSf c43647JSf = this.A03;
        if (c43647JSf != null) {
            c43647JSf.A01();
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPrepared(int i) {
        InterfaceC150336ph interfaceC150336ph = this.A00;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackPrepared(i);
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackSeekComplete() {
        InterfaceC150336ph interfaceC150336ph = this.A00;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackSeekComplete();
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStartedPlaying() {
        InterfaceC150336ph interfaceC150336ph = this.A00;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackStartedPlaying();
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
        InterfaceC150336ph interfaceC150336ph = this.A00;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackStopped();
        }
        C72786Xn6 c72786Xn6 = this.A01;
        Integer num = c72786Xn6.A00;
        Integer num2 = C05F.A0N;
        if (num != num2 && num != C05F.A00) {
            this.A02.CjV();
            c72786Xn6.A00 = num2;
            C43647JSf c43647JSf = this.A03;
            if (c43647JSf != null) {
                c43647JSf.A00();
            }
        }
    }

    public YFM(InterfaceC150336ph interfaceC150336ph, C72786Xn6 c72786Xn6) {
        this.A01 = c72786Xn6;
        this.A00 = interfaceC150336ph;
        this.A02 = c72786Xn6.A03;
        this.A03 = c72786Xn6.A02.A01;
    }
}
