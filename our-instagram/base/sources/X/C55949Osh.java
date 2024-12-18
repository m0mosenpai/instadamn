package X;

import android.graphics.Bitmap;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.SfxSeekBarView;

/* renamed from: X.Osh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55949Osh implements C1NJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C51757Mtg A01;
    public final /* synthetic */ C52151N6b A02;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            C52151N6b c52151N6b = this.A02;
            InterfaceC09390do interfaceC09390do = c52151N6b.A0B;
            Bitmap A00 = C0fK.A00(bitmap, AbstractC167027dH.A01(interfaceC09390do), AbstractC167027dH.A01(interfaceC09390do), false);
            C14360o3.A07(A00);
            SfxSeekBarView sfxSeekBarView = c52151N6b.A08;
            if (sfxSeekBarView == null) {
                C14360o3.A0F("sfxSeekBarView");
                throw C00O.createAndThrow();
            }
            C51757Mtg c51757Mtg = this.A01;
            sfxSeekBarView.A01(A00, c51757Mtg.A02, this.A00, ((C211729Zg) c51757Mtg.A00).A01);
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C55949Osh(C51757Mtg c51757Mtg, C52151N6b c52151N6b, int i) {
        this.A02 = c52151N6b;
        this.A01 = c51757Mtg;
        this.A00 = i;
    }
}
