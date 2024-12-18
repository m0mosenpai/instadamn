package X;

import android.graphics.RectF;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.V9a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68070V9a extends AbstractC140596Xn {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ MediaMapFragment A01;
    public final /* synthetic */ GradientSpinner A02;

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
    }

    public C68070V9a(RectF rectF, MediaMapFragment mediaMapFragment, GradientSpinner gradientSpinner) {
        this.A01 = mediaMapFragment;
        this.A00 = rectF;
        this.A02 = gradientSpinner;
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        return C6PN.A03(this.A00);
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
        boolean A16 = reel.A16(this.A01.A02);
        GradientSpinner gradientSpinner = this.A02;
        if (A16) {
            gradientSpinner.A04();
        } else {
            gradientSpinner.A02();
        }
    }

    @Override // X.AbstractC140596Xn
    public final void A0A(Reel reel, C41181vS c41181vS) {
        C70684Wf5 c70684Wf5 = this.A01.mMapChromeController;
        if (c70684Wf5 != null) {
            c70684Wf5.A03();
        }
    }
}
