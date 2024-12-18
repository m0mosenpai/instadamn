package X;

import android.graphics.Bitmap;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;

/* renamed from: X.Osf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55947Osf implements C1NJ {
    public final InterfaceC16660sJ A00;
    public final /* synthetic */ QuickSnapReactionEmitterView A01;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            this.A00.invoke(bitmap);
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C55947Osf(QuickSnapReactionEmitterView quickSnapReactionEmitterView, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = quickSnapReactionEmitterView;
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        this.A00.invoke(null);
    }
}
