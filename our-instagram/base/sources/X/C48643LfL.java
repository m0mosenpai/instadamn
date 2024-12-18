package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.LfL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48643LfL implements InterfaceC25215BDn {
    public final /* synthetic */ GestureDetectorOnGestureListenerC43829JZs A00;

    @Override // X.InterfaceC25215BDn
    public final void Dz1(String str) {
    }

    @Override // X.InterfaceC25215BDn
    public final void Dzd() {
    }

    @Override // X.InterfaceC25215BDn
    public final void Dzf() {
    }

    @Override // X.InterfaceC25215BDn
    public final void E03() {
    }

    @Override // X.InterfaceC25215BDn
    public final void E0B() {
    }

    public C48643LfL(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        this.A00 = gestureDetectorOnGestureListenerC43829JZs;
    }

    @Override // X.InterfaceC25215BDn
    public final void Dz9(int i) {
        this.A00.A1E.CoQ();
        AbstractC44261Jh7.A00(true, MediaStreamTrack.VIDEO_TRACK_KIND);
    }
}
