package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.GqV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38164GqV extends C3OO implements InterfaceC58117Ppg, JFS {
    public static final /* synthetic */ C0YR[] A0B = {new AnonymousClass019(C38164GqV.class, "playCountContainer", "getPlayCountContainer()Landroid/view/View;", 0), new AnonymousClass019(C38164GqV.class, "clipPlayCount", "getClipPlayCount()Landroid/widget/TextView;", 0)};
    public C57012jc A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final ConstraintLayout A05;
    public final FixedAspectRatioVideoLayout A06;
    public final IgImageButton A07;
    public final InterfaceC16130rD A08;
    public final InterfaceC16130rD A09;
    public final C57012jc A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38164GqV(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A06 = (FixedAspectRatioVideoLayout) AbstractC166987dD.A0c(view, R.id.layout_container);
        this.A07 = (IgImageButton) AbstractC166987dD.A0c(view, R.id.image_preview);
        this.A05 = (ConstraintLayout) AbstractC166987dD.A0c(view, R.id.overlay);
        this.A01 = (ImageView) AbstractC166987dD.A0c(view, R.id.icon);
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.text);
        this.A02 = (ImageView) AbstractC166987dD.A0c(view, R.id.trending_badge);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.trending_badge_label);
        this.A00 = AbstractC31177DnL.A0U(view, R.id.client_branding_icon_stub);
        C57012jc A0U = AbstractC31177DnL.A0U(view, R.id.play_count_stub);
        this.A0A = A0U;
        this.A09 = new C86133sk(A0U, R.id.play_count_container);
        this.A08 = new C86133sk(A0U, R.id.preview_clip_play_count);
        view.setTag(this);
    }

    @Override // X.InterfaceC58117Ppg
    public final void ABQ(C30R c30r, int i) {
    }

    @Override // X.InterfaceC58117Ppg
    public final IgImageButton BGn() {
        return this.A07;
    }

    @Override // X.InterfaceC58117Ppg
    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BMQ() {
        return this.A06;
    }
}
