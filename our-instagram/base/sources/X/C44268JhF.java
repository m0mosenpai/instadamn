package X;

import com.instagram.creation.base.ui.mediatabbar.MediaTabBar;

/* renamed from: X.JhF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44268JhF extends C668630d {
    public final /* synthetic */ GestureDetectorOnGestureListenerC44266JhD A00;

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        double d = c55982hj.A09.A00;
        this.A00.A0I.setTranslationY((float) AbstractC70163Da.A01(d, r3.getHeight()));
    }

    public C44268JhF(GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD) {
        this.A00 = gestureDetectorOnGestureListenerC44266JhD;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        this.A00.A0I.setVisibility(0);
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD = this.A00;
        MediaTabBar mediaTabBar = gestureDetectorOnGestureListenerC44266JhD.A0I;
        double d = gestureDetectorOnGestureListenerC44266JhD.A0H.A01;
        int i = 8;
        if (d == 0.0d) {
            i = 0;
        }
        mediaTabBar.setVisibility(i);
    }
}
