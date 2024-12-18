package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.ISt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41366ISt {
    public static final void A01(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, IJL ijl, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(ijl, 0);
        int i = 0;
        View view = ijl.A01;
        if (z2) {
            view.setVisibility(8);
            ijl.A02.setVisibility(0);
            if (imageUrl != null) {
                ((IgImageView) AbstractC166987dD.A17(ijl.A03)).setUrl(imageUrl, interfaceC11380iw);
            }
            A00(AbstractC167007dF.A0L(ijl.A03), z4);
            AbstractC167017dG.A1W(ijl.A04, 8);
            return;
        }
        if (z) {
            view.setVisibility(0);
            ijl.A02.setVisibility(0);
            InterfaceC09390do interfaceC09390do = ijl.A04;
            AbstractC167017dG.A1W(interfaceC09390do, 0);
            if (imageUrl != null) {
                ((IgImageView) AbstractC166987dD.A17(ijl.A03)).setUrl(imageUrl, interfaceC11380iw);
            }
            A00(AbstractC167007dF.A0L(ijl.A03), z4);
            AbstractC37302Gc3.A06(interfaceC09390do).setText(str);
            View A0L = AbstractC167007dF.A0L(interfaceC09390do);
            if (z3) {
                i = ijl.A00.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
            }
            AbstractC13880nE.A0c(A0L, i);
            return;
        }
        view.setVisibility(8);
        ijl.A02.setVisibility(8);
    }

    public static final void A00(View view, boolean z) {
        int dimensionPixelSize;
        Resources resources = view.getResources();
        if (z) {
            dimensionPixelSize = AbstractC166997dE.A06(resources);
            AbstractC13880nE.A0e(view, dimensionPixelSize);
            AbstractC13880nE.A0V(view, dimensionPixelSize);
        } else {
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
            AbstractC13880nE.A0e(view, dimensionPixelSize2);
            AbstractC13880nE.A0V(view, dimensionPixelSize2);
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        }
        AbstractC13880nE.A0f(view, dimensionPixelSize);
        AbstractC13880nE.A0U(view, dimensionPixelSize);
    }
}
