package X;

import com.instagram.camera.effect.mq.IgCameraEffectsController;

/* loaded from: classes4.dex */
public final class AV6 implements BCN {
    public final /* synthetic */ IgCameraEffectsController A00;
    public final /* synthetic */ C203628zP A01;

    public AV6(IgCameraEffectsController igCameraEffectsController, C203628zP c203628zP) {
        this.A00 = igCameraEffectsController;
        this.A01 = c203628zP;
    }

    @Override // X.BCN
    public final void Cye() {
        C203588zK c203588zK = this.A01.A00;
        if (c203588zK != null) {
            AnonymousClass860 anonymousClass860 = c203588zK.A00;
            AbstractC166997dE.A1Y(anonymousClass860.A0W, false);
            anonymousClass860.A0D.markerEnd(660604063, (short) 3);
        }
    }

    @Override // X.BCN
    public final void Cyf() {
        C203588zK c203588zK = this.A01.A00;
        if (c203588zK != null) {
            AnonymousClass860 anonymousClass860 = c203588zK.A00;
            AbstractC166997dE.A1Y(anonymousClass860.A0W, true);
            anonymousClass860.A0D.markerEnd(660604063, (short) 2);
        }
    }
}
