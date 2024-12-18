package X;

import android.view.View;
import com.facebook.R;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Gwd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38517Gwd extends C3OO implements InterfaceC58117Ppg, JFS {
    public final FixedAspectRatioVideoLayout A00;
    public final IgImageButton A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38517Gwd(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = (FixedAspectRatioVideoLayout) AbstractC166987dD.A0c(view, R.id.layout_container);
        IgImageButton igImageButton = (IgImageButton) AbstractC166997dE.A0R(view, R.id.image_preview);
        this.A01 = igImageButton;
        igImageButton.setEnableTouchOverlay(false);
        view.setTag(this);
    }

    @Override // X.InterfaceC58117Ppg
    public final void ABQ(C30R c30r, int i) {
    }

    @Override // X.InterfaceC58117Ppg
    public final IgImageButton BGn() {
        return this.A01;
    }

    @Override // X.InterfaceC58117Ppg
    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BMQ() {
        return this.A00;
    }
}
