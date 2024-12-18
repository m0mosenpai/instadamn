package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.BFi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25249BFi implements C6MC {
    public final /* synthetic */ C6NZ A00;
    public final /* synthetic */ ScrollingLogic A01;

    public C25249BFi(C6NZ c6nz, ScrollingLogic scrollingLogic) {
        this.A01 = scrollingLogic;
        this.A00 = c6nz;
    }

    @Override // X.C6MC
    public final float EMD(float f) {
        ScrollingLogic scrollingLogic = this.A01;
        C6NZ c6nz = this.A00;
        long A02 = scrollingLogic.A02(f);
        if (scrollingLogic.A07) {
            A02 = C119365at.A05(-1.0f, A02);
        }
        float A01 = scrollingLogic.A01(c6nz.EMF(A02, 2));
        if (scrollingLogic.A07) {
            return A01 * (-1.0f);
        }
        return A01;
    }
}
