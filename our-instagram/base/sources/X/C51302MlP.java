package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.MlP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51302MlP extends C3OO {
    public final IgImageButton A00;
    public final IgImageButton A01;
    public final N5W A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51302MlP(View view, N5W n5w) {
        super(view);
        C14360o3.A0B(n5w, 2);
        this.A02 = n5w;
        this.A01 = (IgImageButton) AbstractC166997dE.A0R(this.itemView, R.id.mk_delete_selected_media);
        View requireViewById = this.itemView.requireViewById(R.id.mini_media_image_view);
        IgImageButton igImageButton = (IgImageButton) requireViewById;
        ((ConstrainedImageView) igImageButton).A00 = 1.0f;
        C14360o3.A07(requireViewById);
        this.A00 = igImageButton;
    }
}
