package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.api.schemas.ProductTileBannerMetadataDecoration;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VWe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68577VWe {
    public static final void A00(C66479UJd c66479UJd, C42333Iov c42333Iov) {
        int i;
        int i2;
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout;
        float f;
        WeakReference weakReference;
        View view = c66479UJd.A00;
        Context A0L = AbstractC166997dE.A0L(view);
        UPZ upz = c42333Iov.A00;
        boolean z = c66479UJd.A09;
        Resources resources = A0L.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        if (z) {
            i = resources.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
        } else {
            i = dimensionPixelSize;
        }
        int A0A = (AbstractC13880nE.A0A(A0L) - ((dimensionPixelSize * 2) + i)) / 2;
        view.setVisibility(0);
        IN7 in7 = c66479UJd.A03;
        in7.A00 = new C43208J8f(33, c66479UJd, c42333Iov);
        C69450VnZ c69450VnZ = c42333Iov.A01;
        in7.A01 = c69450VnZ.A0A;
        C69310VlI c69310VlI = c66479UJd.A01;
        C14360o3.A0B(c69310VlI, 0);
        boolean z2 = upz.A0I;
        if (z2) {
            c69310VlI.A02.setVisibility(0);
            c69310VlI.A04.setVisibility(8);
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = c69310VlI.A03;
            igBouncyUfiButtonImageView.setVisibility(0);
            int paddingStart = igBouncyUfiButtonImageView.getPaddingStart();
            int paddingTop = igBouncyUfiButtonImageView.getPaddingTop();
            Context context = c69310VlI.A01;
            igBouncyUfiButtonImageView.setPaddingRelative(paddingStart, paddingTop, AbstractC167017dG.A06(context), igBouncyUfiButtonImageView.getPaddingBottom());
            AbstractC166997dE.A18(context, igBouncyUfiButtonImageView, 2131972699);
            igBouncyUfiButtonImageView.setSelected(upz.A0H);
            igBouncyUfiButtonImageView.A05();
            WNW.A00(igBouncyUfiButtonImageView, 12, c69310VlI, c42333Iov);
            C41219IMi c41219IMi = c69310VlI.A00;
            C41219IMi c41219IMi2 = c69450VnZ.A02;
            if (c41219IMi != c41219IMi2) {
                if (c41219IMi != null && (weakReference = c41219IMi.A00) != null && weakReference.get() == igBouncyUfiButtonImageView) {
                    c41219IMi.A01(null);
                }
                c69310VlI.A00 = c41219IMi2;
                c41219IMi2.A01(igBouncyUfiButtonImageView);
            }
        } else if (upz.A0L) {
            c69310VlI.A02.setVisibility(0);
            c69310VlI.A03.setVisibility(8);
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView2 = c69310VlI.A04;
            igBouncyUfiButtonImageView2.setVisibility(0);
            WNS.A00(igBouncyUfiButtonImageView2, 6, c69450VnZ.A07);
        } else {
            c69310VlI.A03.setVisibility(8);
            c69310VlI.A04.setVisibility(8);
            c69310VlI.A02.setVisibility(8);
        }
        C69161Viq c69161Viq = c66479UJd.A04;
        C14360o3.A0B(c69161Viq, 0);
        List list = upz.A09;
        if (list.isEmpty()) {
            c69161Viq.A02.setVisibility(8);
            c69161Viq.A01.setVisibility(8);
        } else {
            ClickableTextContainer clickableTextContainer = c69161Viq.A02;
            clickableTextContainer.setVisibility(0);
            TextView textView = c69161Viq.A01;
            textView.setVisibility(0);
            Integer num = upz.A06;
            if (num != null) {
                AbstractC13880nE.A0W(clickableTextContainer, num.intValue() * c69161Viq.A00);
            }
            Resources resources2 = clickableTextContainer.getResources();
            boolean z3 = upz.A0D;
            int i3 = R.dimen.abc_button_inset_vertical_material;
            if (z3) {
                i3 = R.dimen.abc_action_bar_elevation_material;
            }
            AbstractC13880nE.A0f(clickableTextContainer, resources2.getDimensionPixelSize(i3));
            Resources resources3 = textView.getResources();
            int i4 = R.dimen.abc_button_padding_horizontal_material;
            if (z3) {
                i4 = R.dimen.abc_action_bar_elevation_material;
            }
            AbstractC13880nE.A0e(textView, resources3.getDimensionPixelSize(i4));
            if (z2) {
                i2 = AbstractC25228BEl.A0M(textView).getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
            } else {
                i2 = 0;
            }
            int i5 = A0A - i2;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(((INN) it.next()).A00(AbstractC166997dE.A0L(textView), new C57482kN(Layout.Alignment.ALIGN_NORMAL, textView.getPaint(), null, textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier(), i5 - resources3.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material), textView.getIncludeFontPadding())));
            }
            textView.setContentDescription(BHX.A01(resources3, upz.A02));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            AbstractC001800i.A0q(spannableStringBuilder, "\n", "", "", A0q, null);
            textView.setText(spannableStringBuilder);
            if (upz.A0J) {
                textView.setMinLines(2);
                textView.setMaxLines(2);
            }
            textView.setOnLongClickListener(c69450VnZ.A00);
        }
        C69396Vmg c69396Vmg = c66479UJd.A05;
        C14360o3.A0B(c69396Vmg, 0);
        View view2 = c69396Vmg.A02;
        if (view2 instanceof RoundedCornerMediaFrameLayout) {
            roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) view2;
            if (roundedCornerMediaFrameLayout != null) {
                if (upz.A0K) {
                    f = c69396Vmg.A00.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
                } else {
                    f = 0.0f;
                }
                roundedCornerMediaFrameLayout.setStrokeWidth(f);
            }
        } else {
            roundedCornerMediaFrameLayout = null;
        }
        Integer num2 = upz.A07;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (roundedCornerMediaFrameLayout != null) {
                roundedCornerMediaFrameLayout.setRadius(intValue);
            }
        }
        ImageInfo imageInfo = upz.A04;
        if (imageInfo != null) {
            ExtendedImageUrl A04 = AbstractC40161tk.A04(imageInfo, C05F.A0C, Math.min(A0A, 1080));
            if (A04 != null) {
                IgImageView igImageView = c69396Vmg.A04;
                igImageView.setUrl(A04, c69450VnZ.A01);
                igImageView.A0E = new C70823Whg(3, c42333Iov, A04);
            }
        }
        boolean z4 = upz.A0B;
        IgImageView igImageView2 = c69396Vmg.A04;
        if (z4) {
            igImageView2.setImageAlpha(128);
            igImageView2.setImageRendererAndReset(VZ3.A00);
            igImageView2.setColorFilter(c69396Vmg.A00.getColor(R.color.black_25_transparent), PorterDuff.Mode.SRC_OVER);
        } else {
            igImageView2.setImageAlpha(255);
            igImageView2.A0I = null;
            igImageView2.clearColorFilter();
        }
        AbstractC56952jT.A01(igImageView2);
        Resources resources4 = c69396Vmg.A00.getResources();
        C14360o3.A07(resources4);
        igImageView2.setContentDescription(VSL.A00(resources4, upz.A01));
        float f2 = 1.0f;
        if (upz.A0A) {
            f2 = 0.3f;
        }
        igImageView2.setAlpha(f2);
        View[] viewArr = {igImageView2};
        if (upz.A05 == EnumC39541HdD.A03) {
            C150956qv.A08(viewArr, true);
        } else {
            C150956qv.A09(viewArr, false);
        }
        igImageView2.setTransitionName(null);
        MediaFrameLayout mediaFrameLayout = c69396Vmg.A06;
        mediaFrameLayout.A00 = 1.0f;
        mediaFrameLayout.setOnLongClickListener(c69450VnZ.A00);
        AbstractC68575VWc.A00(c69396Vmg.A01, igImageView2);
        c69396Vmg.A05.setVisibility(AbstractC167007dF.A05(upz.A0C ? 1 : 0));
        C68847Vd3 c68847Vd3 = c66479UJd.A08;
        int i6 = 0;
        C14360o3.A0B(c68847Vd3, 0);
        InterfaceC56392iX interfaceC56392iX = c68847Vd3.A00;
        ProductTileBannerMetadataDecoration productTileBannerMetadataDecoration = upz.A00;
        if (productTileBannerMetadataDecoration != null) {
            ((TextView) interfaceC56392iX.getView()).setText(productTileBannerMetadataDecoration.AfT());
        } else {
            i6 = 8;
        }
        interfaceC56392iX.setVisibility(i6);
        IJL ijl = c66479UJd.A06;
        C14360o3.A0B(ijl, 0);
        boolean z5 = upz.A0E;
        boolean z6 = upz.A0F;
        boolean z7 = upz.A0G;
        AbstractC41366ISt.A01(c69450VnZ.A01, upz.A03, ijl, upz.A08, z5, z6, z7, upz.A0D);
        C68846Vd2 c68846Vd2 = c66479UJd.A07;
        C14360o3.A0B(c68846Vd2, 0);
        InterfaceC56392iX interfaceC56392iX2 = c68846Vd2.A00;
        if (z7) {
            interfaceC56392iX2.setVisibility(0);
            WNS.A00(interfaceC56392iX2.getView(), 7, c42333Iov);
        } else {
            interfaceC56392iX2.setVisibility(8);
        }
        C69160Vip c69160Vip = c66479UJd.A02;
        C14360o3.A0B(c69160Vip, 0);
        boolean z8 = upz.A0J;
        ConstraintLayout constraintLayout = c69160Vip.A00;
        if (z8) {
            constraintLayout.setVisibility(0);
            IgdsButton igdsButton = c69160Vip.A01;
            igdsButton.setAlpha(1.0f);
            IgdsButton igdsButton2 = c69160Vip.A02;
            igdsButton2.setAlpha(1.0f);
            WNW.A00(igdsButton, 13, c69160Vip, c42333Iov);
            WNW.A00(igdsButton2, 14, c69160Vip, c42333Iov);
            return;
        }
        constraintLayout.setVisibility(8);
        c69160Vip.A01.setOnClickListener(null);
        c69160Vip.A02.setOnClickListener(null);
    }
}
