package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Mme, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51379Mme extends C3OO implements InterfaceC57985PnV {
    public Bitmap A00;
    public OHM A01;
    public C51906Mwo A02;
    public Float A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final TextView A08;
    public final TextView A09;
    public final InterfaceC11380iw A0A;
    public final IgLinearLayout A0B;
    public final IgProgressImageView A0C;
    public final MediaFrameLayout A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;

    @Override // X.InterfaceC57985PnV
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void ADV(C51906Mwo c51906Mwo) {
        int i;
        int i2;
        int i3;
        C14360o3.A0B(c51906Mwo, 0);
        this.A02 = c51906Mwo;
        int i4 = 0;
        if (c51906Mwo.A0O && c51906Mwo.A0J == null) {
            AbstractC166987dD.A0d(this.A0E).setClickable(false);
            MediaFrameLayout mediaFrameLayout = this.A0D;
            mediaFrameLayout.setVisibility(0);
            float f = c51906Mwo.A00;
            mediaFrameLayout.A00 = f;
            IgProgressImageView igProgressImageView = this.A0C;
            igProgressImageView.setAspectRatio(f);
            boolean z = c51906Mwo.A0S;
            if (z && c51906Mwo.A0Y) {
                i = AbstractC167027dH.A01(this.A0G);
            } else {
                i = 0;
            }
            if (z && c51906Mwo.A0Z) {
                i2 = AbstractC167027dH.A01(this.A0G);
            } else {
                i2 = 0;
            }
            boolean A0I = C14360o3.A0I(this.A03, f);
            this.A03 = Float.valueOf(f);
            mediaFrameLayout.post(new PTL(this, i, i2, A0I));
            boolean z2 = c51906Mwo.A0W;
            View view = this.A06;
            C14360o3.A06(view);
            view.setVisibility(AbstractC167007dF.A05(z2 ? 1 : 0));
            String str = c51906Mwo.A0H;
            String str2 = c51906Mwo.A0G;
            TextView textView = this.A09;
            C14360o3.A06(textView);
            textView.setVisibility(0);
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setText(2131956907);
            }
            TextView textView2 = this.A08;
            C14360o3.A06(textView2);
            textView2.setVisibility(0);
            if (str2 != null) {
                textView2.setText(str2);
            } else {
                textView2.setText(2131956906);
            }
            boolean z3 = c51906Mwo.A0T;
            View view2 = this.A04;
            C14360o3.A06(view2);
            view2.setVisibility(AbstractC167007dF.A05(z3 ? 1 : 0));
            Bitmap bitmap = c51906Mwo.A04;
            if (bitmap != null) {
                if (!bitmap.equals(this.A00)) {
                    BlurUtil.blurInPlace(bitmap, 3);
                    igProgressImageView.setImageBitmap(bitmap);
                    igProgressImageView.setEnableProgressBar(false);
                    igProgressImageView.setVisibility(0);
                }
            } else {
                igProgressImageView.setVisibility(8);
            }
            this.A00 = bitmap;
            igProgressImageView.setAlpha(c51906Mwo.A01);
            ImageUrl imageUrl = c51906Mwo.A07;
            if (imageUrl != null) {
                boolean z4 = c51906Mwo.A0L;
                igProgressImageView.setUrl(imageUrl, this.A0A);
                igProgressImageView.setEnableProgressBar(z4);
                igProgressImageView.setVisibility(0);
            } else {
                igProgressImageView.setVisibility(8);
            }
            View A0d = AbstractC166987dD.A0d(this.A0F);
            if (!c51906Mwo.A0M) {
                i4 = 8;
            }
            A0d.setVisibility(i4);
            boolean z5 = c51906Mwo.A0X;
            float f2 = c51906Mwo.A02;
            IgLinearLayout igLinearLayout = this.A0B;
            if (z5) {
                ViewGroup.LayoutParams layoutParams = igLinearLayout.getLayoutParams();
                C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
                C56302iJ c56302iJ = (C56302iJ) layoutParams;
                c56302iJ.A09 = f2;
                igLinearLayout.setLayoutParams(c56302iJ);
                i3 = 0;
            } else {
                i3 = 8;
            }
            igLinearLayout.setVisibility(i3);
            return;
        }
        this.A0C.A0B(false);
        this.A0D.setVisibility(8);
        AbstractC166987dD.A0d(this.A0E).setClickable(false);
    }

    public C51379Mme(View view, InterfaceC11380iw interfaceC11380iw) {
        super(view);
        this.A07 = view;
        this.A0A = interfaceC11380iw;
        this.A0E = C57520Pfu.A00(this, 4);
        this.A0D = (MediaFrameLayout) view.findViewById(R.id.cowatch_media_container);
        this.A06 = view.findViewById(R.id.cowatch_content_placeholder);
        this.A09 = AbstractC166987dD.A0e(view, R.id.cowatch_content_placeholder_title);
        this.A08 = AbstractC166987dD.A0e(view, R.id.cowatch_content_placeholder_subtitle);
        this.A05 = view.findViewById(R.id.cowatch_paused_indicator);
        this.A04 = view.findViewById(R.id.cowatch_loading_spinner);
        this.A0C = (IgProgressImageView) view.findViewById(R.id.cowatch_image_view);
        this.A0B = (IgLinearLayout) view.findViewById(R.id.cowatch_swipe_nux_container);
        this.A0H = C57520Pfu.A00(this, 7);
        this.A0G = C57520Pfu.A00(this, 6);
        this.A0F = C57520Pfu.A00(this, 5);
    }
}
