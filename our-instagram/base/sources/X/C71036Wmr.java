package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Wmr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71036Wmr implements InterfaceC71960XCm {
    public final /* synthetic */ C70191WFu A00;

    @Override // X.InterfaceC71960XCm
    public final void DLX(Drawable drawable) {
        C70191WFu c70191WFu = this.A00;
        IgImageView igImageView = c70191WFu.A00;
        if (igImageView != null) {
            igImageView.setImageDrawable(drawable);
            IgImageView igImageView2 = c70191WFu.A00;
            if (igImageView2 != null) {
                igImageView2.setVisibility(0);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C71036Wmr(C70191WFu c70191WFu) {
        this.A00 = c70191WFu;
    }

    @Override // X.InterfaceC71960XCm
    public final void DE2() {
        this.A00.A00 = null;
    }
}
