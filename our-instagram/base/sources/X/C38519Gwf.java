package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Gwf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38519Gwf extends C3OO implements InterfaceC58117Ppg, JFS {
    public final IgSimpleImageView A00;
    public final IgTextView A01;
    public final FixedAspectRatioVideoLayout A02;
    public final IgImageButton A03;

    @Override // X.InterfaceC58117Ppg
    public final void ABQ(C30R c30r, int i) {
    }

    @Override // X.InterfaceC58117Ppg
    public final IgImageButton BGn() {
        return this.A03;
    }

    @Override // X.InterfaceC58117Ppg
    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BMQ() {
        return this.A02;
    }

    public C38519Gwf(View view) {
        super(view);
        this.A02 = (FixedAspectRatioVideoLayout) AbstractC166987dD.A0c(view, R.id.layout_container);
        IgImageButton igImageButton = (IgImageButton) AbstractC166997dE.A0R(view, R.id.image_preview);
        this.A03 = igImageButton;
        this.A00 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.icon);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.title_text);
        igImageButton.setEnableTouchOverlay(false);
        view.setTag(this);
    }
}
