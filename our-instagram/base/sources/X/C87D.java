package X;

import android.app.Application;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.87D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87D extends C193578hc {
    public final C2GS A00;
    public final ClipsAudioStore A01;
    public final ClipsCreationViewModel A02;
    public final InterfaceC19390xP A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87D(Application application, C84A c84a, ClipsCreationViewModel clipsCreationViewModel) {
        super(application);
        C14360o3.A0B(clipsCreationViewModel, 2);
        C14360o3.A0B(c84a, 3);
        this.A02 = clipsCreationViewModel;
        ClipsAudioStore clipsAudioStore = c84a.A00(clipsCreationViewModel.A0S).A01;
        this.A01 = clipsAudioStore;
        this.A03 = C10Q.A02(C87E.A00, clipsAudioStore.A0k, clipsAudioStore.A0W, clipsAudioStore.A0n, clipsAudioStore.A0g, clipsAudioStore.A0i);
        this.A00 = new C2GS();
        C141796aw A00 = AbstractC141776au.A00(this);
        C206639Cu c206639Cu = new C206639Cu(this, null, 47);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A00);
    }

    public final float A0E() {
        return ((Number) this.A01.A0k.getValue()).floatValue();
    }

    public final void A0F(float f) {
        this.A01.A0H.Egh(Float.valueOf(C17s.A02(f, 0.0f, 1.0f)));
    }

    public final void A0G(float f) {
        this.A01.A0O.Egh(Float.valueOf(C17s.A02(f, 0.0f, 1.0f)));
    }

    public final void A0H(float f) {
        this.A01.A0Q.Egh(Float.valueOf(C17s.A02(f, 0.0f, 1.0f)));
    }

    public final void A0I(float f) {
        this.A01.A0U.Egh(Float.valueOf(C17s.A02(f, 0.0f, 1.0f)));
    }
}
