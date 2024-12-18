package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Gnx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38011Gnx extends C3OO {
    public static final /* synthetic */ C0YR[] A0E = {new AnonymousClass019(C38011Gnx.class, "clipPlayCount", "getClipPlayCount()Landroid/widget/TextView;", 0), new AnonymousClass019(C38011Gnx.class, "playCountContainer", "getPlayCountContainer()Landroid/view/View;", 0), new AnonymousClass019(C38011Gnx.class, "selectedCheckbox", "getSelectedCheckbox()Landroid/widget/CheckBox;", 0)};
    public final TextView A00;
    public final TextView A01;
    public final IgLinearLayout A02;
    public final IgSimpleImageView A03;
    public final IgSimpleImageView A04;
    public final CircularImageView A05;
    public final C57012jc A06;
    public final C86073se A07;
    public final IgImageButton A08;
    public final InterfaceC09390do A09;
    public final InterfaceC16130rD A0A;
    public final InterfaceC16130rD A0B;
    public final InterfaceC16130rD A0C;
    public final C57012jc A0D;

    public C38011Gnx(View view) {
        super(view);
        View requireViewById = view.requireViewById(R.id.preview_clip_thumbnail);
        IgImageButton igImageButton = (IgImageButton) requireViewById;
        ((ConstrainedImageView) igImageButton).A00 = 0.5625f;
        C14360o3.A07(requireViewById);
        this.A08 = igImageButton;
        C57012jc A0V = AbstractC31177DnL.A0V(view, R.id.play_count_stub);
        this.A0D = A0V;
        this.A0A = new C86133sk(A0V, R.id.preview_clip_play_count);
        this.A0B = new C86133sk(A0V, R.id.play_count_container);
        this.A04 = AbstractC31176DnK.A0T(view, R.id.sender_facepile);
        this.A02 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.primary_label);
        this.A01 = AbstractC167007dF.A0N(view, R.id.primary_label_text);
        this.A05 = AbstractC31176DnK.A0U(view, R.id.primary_label_profile_picture);
        this.A03 = AbstractC31176DnK.A0T(view, R.id.indicator_icon);
        this.A07 = AbstractC86053sc.A00(AbstractC31173DnH.A0G(view, R.id.media_cover_view_stub));
        C57012jc A0V2 = AbstractC31177DnL.A0V(view, R.id.selection_container);
        this.A06 = A0V2;
        this.A0C = new C86133sk(A0V2, R.id.selection_checkbox);
        this.A09 = AbstractC09440dt.A01(new C57537PgB(view, 44));
        this.A00 = AbstractC167007dF.A0N(view, R.id.clip_just_watched_overlay);
    }
}
