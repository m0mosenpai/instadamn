package X;

import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.MmR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51366MmR extends C3OO {
    public static final /* synthetic */ C0YR[] A06 = {new AnonymousClass019(C51366MmR.class, "highlightTitle", "getHighlightTitle()Landroid/widget/TextView;", 0)};
    public SpinnerImageView A00;
    public final RelativeLayout A01;
    public final IgImageButton A02;
    public final IgImageButton A03;
    public final InterfaceC16130rD A04;
    public final C57012jc A05;

    public C51366MmR(View view) {
        super(view);
        View requireViewById = view.requireViewById(R.id.preview_highlight_thumbnail);
        IgImageButton igImageButton = (IgImageButton) requireViewById;
        ((ConstrainedImageView) igImageButton).A00 = 0.75f;
        C14360o3.A07(requireViewById);
        this.A02 = igImageButton;
        C57012jc A0V = AbstractC31177DnL.A0V(view, R.id.highlight_title_stub);
        this.A05 = A0V;
        this.A04 = new C86133sk(A0V, R.id.preview_highlight_title);
        this.A01 = (RelativeLayout) AbstractC166997dE.A0R(view, R.id.highlight_grid_create);
        this.A03 = (IgImageButton) AbstractC166997dE.A0R(view, R.id.highlight_grid_create_icon);
        this.A00 = (SpinnerImageView) AbstractC166997dE.A0R(view, R.id.item_loading_spinner);
    }
}
