package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Gwe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38518Gwe extends C3OO implements InterfaceC58117Ppg, JFS {
    public final ImageView A00;
    public final FixedAspectRatioVideoLayout A01;
    public final IgImageButton A02;
    public final RoundedCornerFrameLayout A03;

    @Override // X.InterfaceC58117Ppg
    public final void ABQ(C30R c30r, int i) {
    }

    @Override // X.InterfaceC58117Ppg
    public final IgImageButton BGn() {
        return this.A02;
    }

    @Override // X.InterfaceC58117Ppg
    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BMQ() {
        return this.A01;
    }

    public C38518Gwe(View view) {
        super(view);
        this.A03 = (RoundedCornerFrameLayout) AbstractC166987dD.A0c(view, R.id.preview_container);
        this.A02 = (IgImageButton) AbstractC166987dD.A0c(view, R.id.image_button);
        this.A01 = (FixedAspectRatioVideoLayout) AbstractC166987dD.A0c(view, R.id.layout_container);
        this.A00 = (ImageView) AbstractC166987dD.A0c(view, R.id.icon);
    }
}
