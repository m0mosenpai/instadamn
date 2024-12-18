package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.Gvk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38463Gvk extends C3OO {
    public final IgImageView A00;
    public final IgdsMediaButton A01;
    public final IJ5 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38463Gvk(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = new IJ5(view, view.getId());
        this.A01 = (IgdsMediaButton) AbstractC166997dE.A0R(view, R.id.see_all);
        View requireViewById = view.requireViewById(R.id.image);
        IgImageView igImageView = (IgImageView) requireViewById;
        igImageView.A0I = C42359IpL.A00;
        C14360o3.A07(requireViewById);
        this.A00 = igImageView;
    }
}
