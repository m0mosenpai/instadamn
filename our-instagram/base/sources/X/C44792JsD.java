package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.JsD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44792JsD extends C3OO implements InterfaceC58117Ppg, JFS {
    public final int A00;
    public final InterfaceC11380iw A01;
    public final IgTextView A02;
    public final InterfaceC56392iX A03;
    public final FixedAspectRatioVideoLayout A04;
    public final IgImageButton A05;
    public final SlideInAndOutIconView A06;
    public final InterfaceC09390do A07;
    public final boolean A08;

    @Override // X.InterfaceC58117Ppg
    public final void ABQ(C30R c30r, int i) {
        C14360o3.A0B(c30r, 1);
        Resources A0M = AbstractC25228BEl.A0M(this.itemView);
        C14360o3.A07(A0M);
        SlideInAndOutIconView slideInAndOutIconView = this.A06;
        TitleTextView titleTextView = slideInAndOutIconView.A0C;
        int lineHeight = titleTextView.getLineHeight() + (A0M.getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
        int lineHeight2 = (titleTextView.getLineHeight() - A0M.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
        slideInAndOutIconView.A03(AbstractC31172DnG.A05(this).getDrawable(i), lineHeight, lineHeight);
        slideInAndOutIconView.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
        slideInAndOutIconView.setIconColor(AbstractC31172DnG.A05(this).getColor(R.color.audio_bar_action_color_enabled));
        slideInAndOutIconView.setIconScale(0.5f);
        slideInAndOutIconView.A03 = C3WD.END;
        slideInAndOutIconView.A02 = C30Q.SLIDE_OUT;
        C4ZF c4zf = new C4ZF();
        c4zf.A07.add(AbstractC25225BEi.A16(slideInAndOutIconView));
        c4zf.A02(c30r);
    }

    @Override // X.InterfaceC58117Ppg
    public final IgImageButton BGn() {
        return this.A05;
    }

    @Override // X.InterfaceC58117Ppg
    public final FixedAspectRatioVideoLayout BMQ() {
        return this.A04;
    }

    public C44792JsD(View view, boolean z) {
        super(view);
        this.A08 = z;
        this.A01 = AbstractC31171DnF.A0D("media_kit_media_item");
        this.A00 = AbstractC166987dD.A0C(AbstractC37301Gc2.A03(this), 178);
        this.A07 = AbstractC09440dt.A01(new C57247PbV(this, 9));
        InterfaceC56392iX A01 = AbstractC56372iV.A01(view.requireViewById(R.id.mk_audio_icon_view_stub), false, false);
        this.A03 = A01;
        this.A06 = (SlideInAndOutIconView) AbstractC166997dE.A0R(A01.getView(), R.id.indicator);
        View requireViewById = view.requireViewById(R.id.media_frame);
        C14360o3.A07(requireViewById);
        this.A04 = (FixedAspectRatioVideoLayout) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.image_preview);
        IgImageButton igImageButton = (IgImageButton) requireViewById2;
        ((ConstrainedImageView) igImageButton).A00 = 1.0f;
        igImageButton.setEnableTouchOverlay(false);
        ((IgImageView) igImageButton).A0A = new C80673iw();
        C14360o3.A07(requireViewById2);
        this.A05 = igImageButton;
        this.A02 = AbstractC25231BEo.A0d(view, R.id.media_likes);
        view.setTag(this);
    }
}
