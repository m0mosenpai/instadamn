package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.ui.LoadingSpinnerView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.MkE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51229MkE extends C3OO {
    public final void A00(InterfaceC185318Jx interfaceC185318Jx, InterfaceC16660sJ interfaceC16660sJ) {
        MY0 my0;
        if (this instanceof NHU) {
            NHU nhu = (NHU) this;
            C14360o3.A0B(interfaceC185318Jx, 0);
            C51823MvR c51823MvR = (C51823MvR) interfaceC185318Jx;
            IgImageView igImageView = nhu.A01;
            boolean z = c51823MvR.A03;
            int i = 8;
            igImageView.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
            if (igImageView.getVisibility() == 0) {
                String str = c51823MvR.A01;
                if (str != null) {
                    Spannable spannable = C6RB.A0d;
                    C6RB c6rb = new C6RB(AbstractC166997dE.A0L(igImageView), igImageView.getWidth());
                    c6rb.A0M(str);
                    igImageView.setImageDrawable(c6rb);
                }
                String str2 = c51823MvR.A02;
                if (C14360o3.A0K(str2, "None")) {
                    Context context = igImageView.getContext();
                    AbstractC166997dE.A19(context, igImageView, R.drawable.instagram_circle_x_pano_outline_24);
                    AbstractC31173DnH.A11(context, igImageView, AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_06));
                }
                Resources A0M = AbstractC25228BEl.A0M(igImageView);
                boolean A0K = C14360o3.A0K(str2, "None");
                int i2 = R.dimen.ad4ad_button_bottom_margin;
                if (A0K) {
                    i2 = R.dimen.abc_select_dialog_padding_start_material;
                }
                int dimensionPixelSize = A0M.getDimensionPixelSize(i2);
                igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                igImageView.setSelected(c51823MvR.A04);
            }
            LoadingSpinnerView loadingSpinnerView = nhu.A02;
            if (z) {
                i = 0;
            }
            loadingSpinnerView.setVisibility(i);
            if (loadingSpinnerView.getVisibility() == 0) {
                my0 = MY0.A02;
            } else {
                my0 = MY0.A03;
            }
            loadingSpinnerView.setLoadingStatus(my0);
            IgTextView igTextView = nhu.A00;
            igTextView.setText(c51823MvR.A02);
            Context context2 = igTextView.getContext();
            boolean z2 = c51823MvR.A04;
            int i3 = R.attr.igds_color_creation_tools_grey_06;
            if (z2) {
                i3 = R.attr.igds_color_primary_text_on_media;
            }
            AbstractC31177DnL.A0q(context2, igTextView, i3);
            ViewOnClickListenerC55464OkJ.A01(nhu.itemView, 57, interfaceC16660sJ, interfaceC185318Jx);
            return;
        }
        NHV nhv = (NHV) this;
        C14360o3.A0B(interfaceC185318Jx, 0);
        C185308Jw c185308Jw = (C185308Jw) interfaceC185318Jx;
        RoundedCornerFrameLayout roundedCornerFrameLayout = nhv.A02;
        roundedCornerFrameLayout.setSelected(c185308Jw.A04);
        ViewOnClickListenerC55464OkJ.A01(roundedCornerFrameLayout, 37, interfaceC16660sJ, interfaceC185318Jx);
        EnumC185288Jt enumC185288Jt = c185308Jw.A01;
        if (enumC185288Jt != null) {
            nhv.A01.setBackgroundResource(enumC185288Jt.A02);
        }
        nhv.A00.setText(c185308Jw.A03);
        Integer num = c185308Jw.A02;
        Integer num2 = C05F.A01;
        SpinnerImageView spinnerImageView = nhv.A03;
        if (num == num2) {
            AbstractC31171DnF.A1M(spinnerImageView);
            nhv.A01.setVisibility(8);
        } else {
            spinnerImageView.setLoadingStatus(C3T1.LOADED);
            nhv.A01.setVisibility(0);
        }
        ViewOnClickListenerC55464OkJ.A01(nhv.itemView, 38, interfaceC16660sJ, interfaceC185318Jx);
    }
}
