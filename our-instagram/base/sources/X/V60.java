package X;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* loaded from: classes11.dex */
public final class V60 extends C42H {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public V60(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        if (this.A00 != 0) {
            super.DXP(i, i2);
            return;
        }
        UJQ ujq = (UJQ) this.A01;
        CirclePageIndicator circlePageIndicator = ujq.A04;
        circlePageIndicator.setCurrentPage(i);
        boolean z = true;
        if (circlePageIndicator.A06 + 1 != ((C41L) circlePageIndicator).A05) {
            z = false;
        }
        ImageView imageView = ujq.A02;
        if (z) {
            imageView.setVisibility(8);
            WH7 wh7 = (WH7) ((C69218Vjl) this.A02).A03.getValue();
            wh7.A01 = true;
            wh7.A03.end();
            return;
        }
        imageView.setVisibility(0);
        WH7 wh72 = (WH7) ((C69218Vjl) this.A02).A03.getValue();
        if (!wh72.A01) {
            return;
        }
        wh72.A01 = false;
        ValueAnimator valueAnimator = wh72.A03;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.start();
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
        if (this.A00 != 0) {
            ((C114385Ef) this.A02).A02 = i;
        } else {
            ((C69218Vjl) this.A02).A00 = i;
        }
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
        C3A9 c3a9;
        if (1 - this.A00 != 0) {
            super.Diq(c3vz, f, f2);
            return;
        }
        C14360o3.A0B(c3vz, 2);
        if (c3vz == C3VZ.A03 || (c3a9 = ((C69229Vjx) this.A01).A03) == null) {
            return;
        }
        c3a9.A01();
    }
}
