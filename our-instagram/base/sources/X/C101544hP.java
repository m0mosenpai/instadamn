package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.clips.animatedthumbnail.AnimatedThumbnailView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.4hP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101544hP extends C3OO implements C3Y7, InterfaceC101554hQ {
    public int A00;
    public C120985dq A01;
    public C75113Zb A02;
    public C38625GyS A03;
    public final View A04;
    public final View A05;
    public final AnimatedThumbnailView A06;
    public final C3W4 A07;
    public final IgSimpleImageView A08;
    public final IgTextView A09;
    public final IgTextView A0A;
    public final IgTextView A0B;
    public final IgTextView A0C;
    public final IgImageView A0D;
    public final IgImageView A0E;
    public final IgImageView A0F;
    public final InterfaceC56392iX A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C101544hP(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.preview_image);
        C14360o3.A07(requireViewById);
        this.A0E = (IgImageView) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.animated_thumbnail);
        C14360o3.A07(requireViewById2);
        this.A06 = (AnimatedThumbnailView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.card_title);
        C14360o3.A07(requireViewById3);
        this.A0C = (IgTextView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.card_subtitle_text_view);
        C14360o3.A07(requireViewById4);
        this.A0B = (IgTextView) requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.card_facepile);
        C14360o3.A07(requireViewById5);
        this.A08 = (IgSimpleImageView) requireViewById5;
        View requireViewById6 = view.requireViewById(R.id.card_count_view);
        C14360o3.A07(requireViewById6);
        this.A09 = (IgTextView) requireViewById6;
        this.A00 = view.getContext().getResources().getDimensionPixelSize(R.dimen.clips_netego_card_width);
        View requireViewById7 = view.requireViewById(R.id.card_description_container);
        C14360o3.A07(requireViewById7);
        this.A05 = requireViewById7;
        View requireViewById8 = view.requireViewById(R.id.background_content_black_gradient);
        C14360o3.A07(requireViewById8);
        this.A04 = requireViewById8;
        this.A0G = AbstractC56372iV.A01(view.requireViewById(R.id.mifu_album_cover_image_view_stub), false, false);
        View requireViewById9 = view.requireViewById(R.id.dynamic_text_view);
        C14360o3.A07(requireViewById9);
        this.A0A = (IgTextView) requireViewById9;
        View requireViewById10 = view.requireViewById(R.id.like_heart_view);
        C14360o3.A07(requireViewById10);
        this.A0D = (IgImageView) requireViewById10;
        View requireViewById11 = view.requireViewById(R.id.template_icon_view);
        C14360o3.A07(requireViewById11);
        this.A0F = (IgImageView) requireViewById11;
        this.A07 = new C3W4((ViewStub) view.requireViewById(R.id.audio_icon_view_stub));
    }

    @Override // X.C3Y7
    public final C86083sf B61() {
        return null;
    }

    @Override // X.C3Y7
    public final InterfaceC80343iO BRd() {
        return null;
    }

    @Override // X.C3Y7
    public final C86033sa BS3() {
        return null;
    }

    @Override // X.InterfaceC101554hQ
    public final void DXz() {
    }

    @Override // X.InterfaceC101554hQ
    public final void DY1() {
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A0E.A0D(interfaceC11380iw, null, imageUrl, z);
    }

    @Override // X.C3Y7
    public final C3W4 Adr() {
        return this.A07;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3Vo] */
    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return new Object();
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A0E;
    }

    @Override // X.C3Y7
    public final View BQt() {
        View view = this.itemView;
        C14360o3.A06(view);
        return view;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A02;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        KeyEvent.Callback callback = this.itemView;
        C14360o3.A0C(callback, "null cannot be cast to non-null type com.instagram.ui.widget.videocontainer.TextureViewContainer");
        return (InterfaceC74623Ww) callback;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final int CFi() {
        return this.itemView.getWidth();
    }
}
