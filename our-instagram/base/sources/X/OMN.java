package X;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes9.dex */
public final class OMN {
    public ChoreographerFrameCallbackC55351OiD A00;
    public Runnable A01;
    public final Choreographer A02;
    public final TiltShiftOverlayFilter A03;
    public final FilterGroupModel A04;
    public final Handler A05;

    public final void A01(C8MA c8ma) {
        A00();
        this.A04.EUV(21, true);
        ChoreographerFrameCallbackC55351OiD choreographerFrameCallbackC55351OiD = new ChoreographerFrameCallbackC55351OiD(this, c8ma, this.A03.A00, 0.9f, ((0.9f - r5) * 1.5E8f) / 0.9f);
        this.A00 = choreographerFrameCallbackC55351OiD;
        this.A02.postFrameCallback(choreographerFrameCallbackC55351OiD);
    }

    public final void A03(C8MA c8ma) {
        A00();
        ChoreographerFrameCallbackC55351OiD choreographerFrameCallbackC55351OiD = new ChoreographerFrameCallbackC55351OiD(this, c8ma, this.A03.A00, 0.0f, (7.5E8f * r4) / 0.9f);
        this.A00 = choreographerFrameCallbackC55351OiD;
        this.A02.postFrameCallback(choreographerFrameCallbackC55351OiD);
    }

    public final void A00() {
        ChoreographerFrameCallbackC55351OiD choreographerFrameCallbackC55351OiD = this.A00;
        if (choreographerFrameCallbackC55351OiD != null) {
            choreographerFrameCallbackC55351OiD.A06.A04.EUV(21, false);
            choreographerFrameCallbackC55351OiD.A01 = true;
            this.A02.removeFrameCallback(choreographerFrameCallbackC55351OiD);
            this.A00 = null;
        }
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A05.removeCallbacks(runnable);
            this.A01 = null;
        }
    }

    public OMN(FilterGroupModel filterGroupModel) {
        this.A04 = filterGroupModel;
        TiltShiftOverlayFilter A01 = OXu.A01(filterGroupModel);
        this.A03 = A01;
        Choreographer choreographer = Choreographer.getInstance();
        C14360o3.A07(choreographer);
        this.A02 = choreographer;
        this.A05 = AbstractC167007dF.A0J();
        A01.A00 = 0.0f;
    }

    public final void A02(C8MA c8ma) {
        A01(c8ma);
        PQL pql = new PQL(this, c8ma);
        this.A01 = pql;
        this.A05.postDelayed(pql, 650L);
    }
}
