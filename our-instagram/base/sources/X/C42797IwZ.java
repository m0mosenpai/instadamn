package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.IwZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42797IwZ implements InterfaceC58290Psi {
    public final ImageView A00;
    public final C41066IGj A01;
    public final IJ5 A02;
    public final IIC A03;

    @Override // X.InterfaceC58290Psi
    public final /* synthetic */ void El5(boolean z) {
    }

    @Override // X.InterfaceC72963Ox
    /* renamed from: Bfj */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A02.A01);
    }

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
        this.A02.A01.setVisibility(4);
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        this.A02.A01.setVisibility(0);
    }

    public C42797IwZ(View view, int i) {
        this.A02 = new IJ5(view, i);
        this.A01 = new C41066IGj(view, R.id.container);
        this.A00 = AbstractC31176DnK.A0D(view, R.id.featured_product_overflow_button);
        this.A03 = new IIC(AbstractC31176DnK.A0C(view, R.id.hero_carousel_media_overlay));
    }
}
