package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gvv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38474Gvv extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IJ5 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38474Gvv(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = new IJ5(view, view.getId());
        this.A01 = AbstractC31178DnM.A0C(view);
        this.A00 = AbstractC167007dF.A0N(view, R.id.subtitle);
        View requireViewById = view.requireViewById(R.id.image);
        IgImageView igImageView = (IgImageView) requireViewById;
        igImageView.A0I = C42358IpK.A00;
        C14360o3.A07(requireViewById);
        this.A02 = igImageView;
    }
}
