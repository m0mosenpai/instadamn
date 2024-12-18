package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Ant, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24170Ant implements InterfaceC185448Km {
    public final /* synthetic */ C23874AhT A00;

    public C24170Ant(C23874AhT c23874AhT) {
        this.A00 = c23874AhT;
    }

    @Override // X.InterfaceC185448Km
    public final void onFinish() {
        C131425wZ c131425wZ;
        C23874AhT c23874AhT = this.A00;
        c23874AhT.A04.getWindow().addFlags(128);
        C185458Kn c185458Kn = c23874AhT.A02;
        if (c185458Kn != null) {
            c185458Kn.A02.removeCallbacksAndMessages(null);
        }
        ShutterButton shutterButton = c23874AhT.A01;
        if (shutterButton != null && (c131425wZ = shutterButton.A0i) != null) {
            c131425wZ.A01("start_audio_mixing_voiceover_stacked_timeline");
        }
    }
}
