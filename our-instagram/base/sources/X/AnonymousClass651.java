package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView;

/* renamed from: X.651, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass651 implements AnonymousClass652 {
    @Override // X.AnonymousClass652
    public void D38(MotionEvent motionEvent, View view) {
    }

    @Override // X.AnonymousClass652
    public void DLs(ReboundHorizontalScrollView reboundHorizontalScrollView, int i, int i2) {
    }

    @Override // X.AnonymousClass652
    public void Dio(ReboundHorizontalScrollView reboundHorizontalScrollView, float f, int i, int i2) {
    }

    @Override // X.AnonymousClass652
    public void Dj2(EnumC131525wo enumC131525wo, EnumC131525wo enumC131525wo2, ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    @Override // X.AnonymousClass652
    public void DsC(View view, int i) {
        if (this instanceof AnonymousClass650) {
            AnonymousClass650 anonymousClass650 = (AnonymousClass650) this;
            anonymousClass650.Du6(anonymousClass650.A00.A06);
        }
    }

    @Override // X.AnonymousClass652
    public void Du6(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        if (this instanceof AnonymousClass650) {
            LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = ((AnonymousClass650) this).A00;
            legacyCameraDestinationScrollView.A02 = false;
            LegacyCameraDestinationScrollView.A01(legacyCameraDestinationScrollView, legacyCameraDestinationScrollView.A00);
        }
    }

    @Override // X.AnonymousClass652
    public void DuG(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        if (this instanceof AnonymousClass650) {
            LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = ((AnonymousClass650) this).A00;
            legacyCameraDestinationScrollView.A02 = true;
            LegacyCameraDestinationScrollView.A01(legacyCameraDestinationScrollView, legacyCameraDestinationScrollView.A00);
        }
    }
}
