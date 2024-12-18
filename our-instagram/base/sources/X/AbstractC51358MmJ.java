package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.freetransform.widget.ClipTransformItemView;
import com.instagram.music.common.ui.LoadingSpinnerView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.MmJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51358MmJ extends C3OO {
    public static final List A00 = AbstractC16960so.A1Q(AbstractC166987dD.A1L(AbstractC25225BEi.A1D(NHY.class), C57768Pjv.A00), AbstractC166987dD.A1L(AbstractC25225BEi.A1D(NHZ.class), C57769Pjw.A00), AbstractC166987dD.A1L(AbstractC25225BEi.A1D(C52405NHa.class), C57770Pjx.A00), AbstractC166987dD.A1L(AbstractC25225BEi.A1D(NHW.class), C57771Pjy.A00), AbstractC166987dD.A1L(AbstractC25225BEi.A1D(NHX.class), C57772Pjz.A00));

    public final void A00(InterfaceC58034PoK interfaceC58034PoK, InterfaceC16660sJ interfaceC16660sJ) {
        C51828MvW c51828MvW;
        C3T1 c3t1;
        C51830MvY c51830MvY;
        int i;
        C51826MvU c51826MvU;
        C51827MvV c51827MvV;
        C51829MvX c51829MvX;
        MY0 my0;
        if (this instanceof NHZ) {
            NHZ nhz = (NHZ) this;
            if ((interfaceC58034PoK instanceof C51829MvX) && (c51829MvX = (C51829MvX) interfaceC58034PoK) != null) {
                IgImageView igImageView = nhz.A01;
                boolean z = c51829MvX.A02;
                int i2 = 8;
                igImageView.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
                if (igImageView.getVisibility() == 0) {
                    String str = c51829MvX.A00;
                    if (str != null) {
                        Spannable spannable = C6RB.A0d;
                        C6RB c6rb = new C6RB(AbstractC166997dE.A0L(igImageView), igImageView.getWidth());
                        c6rb.A0M(str);
                        igImageView.setImageDrawable(c6rb);
                    }
                    String str2 = c51829MvX.A01;
                    if (C14360o3.A0K(str2, "None")) {
                        Context context = igImageView.getContext();
                        AbstractC166997dE.A19(context, igImageView, R.drawable.instagram_circle_x_pano_outline_24);
                        AbstractC31173DnH.A11(context, igImageView, AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_06));
                    }
                    Resources A0M = AbstractC25228BEl.A0M(igImageView);
                    boolean A0K = C14360o3.A0K(str2, "None");
                    int i3 = R.dimen.ad4ad_button_bottom_margin;
                    if (A0K) {
                        i3 = R.dimen.abc_select_dialog_padding_start_material;
                    }
                    int dimensionPixelSize = A0M.getDimensionPixelSize(i3);
                    igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    igImageView.setSelected(c51829MvX.A03);
                }
                LoadingSpinnerView loadingSpinnerView = nhz.A02;
                if (z) {
                    i2 = 0;
                }
                loadingSpinnerView.setVisibility(i2);
                if (loadingSpinnerView.getVisibility() == 0) {
                    my0 = MY0.A02;
                } else {
                    my0 = MY0.A03;
                }
                loadingSpinnerView.setLoadingStatus(my0);
                IgTextView igTextView = nhz.A00;
                igTextView.setText(c51829MvX.A01);
                Context context2 = igTextView.getContext();
                boolean z2 = c51829MvX.A03;
                int i4 = R.attr.igds_color_creation_tools_grey_06;
                if (z2) {
                    i4 = R.attr.igds_color_primary_text_on_media;
                }
                AbstractC31177DnL.A0q(context2, igTextView, i4);
                ViewOnClickListenerC55464OkJ.A01(nhz.itemView, 47, c51829MvX, interfaceC16660sJ);
                return;
            }
            return;
        }
        if (this instanceof NHY) {
            NHY nhy = (NHY) this;
            if (!(interfaceC58034PoK instanceof C51827MvV) || (c51827MvV = (C51827MvV) interfaceC58034PoK) == null) {
                return;
            }
            IgImageView igImageView2 = nhy.A02;
            boolean z3 = c51827MvV.A03;
            igImageView2.setSelected(z3);
            int i5 = c51827MvV.A00;
            IgTextView igTextView2 = nhy.A01;
            if (i5 == 0) {
                int i6 = 2131955898;
                if (C18U.A06(C06090Tz.A05, nhy.A00, 36320725947392866L)) {
                    i6 = 2131955899;
                }
                igTextView2.setText(i6);
            } else {
                igTextView2.setText(c51827MvV.A01);
            }
            Context context3 = igTextView2.getContext();
            int i7 = R.attr.igds_color_creation_tools_grey_06;
            if (z3) {
                i7 = R.attr.igds_color_primary_text_on_media;
            }
            AbstractC31177DnL.A0q(context3, igTextView2, i7);
            ViewOnClickListenerC55464OkJ.A01(igImageView2, 45, interfaceC16660sJ, c51827MvV);
            ViewOnClickListenerC55464OkJ.A01(igTextView2, 46, interfaceC16660sJ, c51827MvV);
            igImageView2.setImageBitmap(null);
            c51827MvV.A02.invoke(Integer.valueOf(i5), new C30192DRx(nhy, 31));
            return;
        }
        if (this instanceof NHX) {
            NHX nhx = (NHX) this;
            if (!(interfaceC58034PoK instanceof C51826MvU) || (c51826MvU = (C51826MvU) interfaceC58034PoK) == null) {
                return;
            }
            RoundedCornerFrameLayout roundedCornerFrameLayout = nhx.A02;
            roundedCornerFrameLayout.setSelected(c51826MvU.A04);
            ViewOnClickListenerC55464OkJ.A01(roundedCornerFrameLayout, 43, c51826MvU, interfaceC16660sJ);
            nhx.A01.setBackgroundResource(c51826MvU.A00);
            nhx.A00.setText(c51826MvU.A02);
            ViewOnClickListenerC55464OkJ.A01(nhx.itemView, 44, c51826MvU, interfaceC16660sJ);
            return;
        }
        if (this instanceof NHW) {
            NHW nhw = (NHW) this;
            if (!(interfaceC58034PoK instanceof C51830MvY) || (c51830MvY = (C51830MvY) interfaceC58034PoK) == null) {
                return;
            }
            ViewOnClickListenerC55464OkJ.A01(nhw.A02, 41, interfaceC16660sJ, c51830MvY);
            IgTextView igTextView3 = nhw.A00;
            ViewOnClickListenerC55464OkJ.A01(igTextView3, 42, interfaceC16660sJ, c51830MvY);
            String str3 = c51830MvY.A06;
            C14360o3.A0B(igTextView3, 0);
            if (str3 != null) {
                switch (C6DO.valueOf(str3).ordinal()) {
                    case 0:
                        i = 2131955983;
                        break;
                    case 1:
                        i = 2131955996;
                        break;
                    case 2:
                        i = 2131955995;
                        break;
                    case 3:
                        i = 2131956009;
                        break;
                    case 4:
                        i = 2131956002;
                        break;
                    case 5:
                        i = 2131956003;
                        break;
                    case 6:
                        i = 2131956006;
                        break;
                    case 7:
                        i = 2131956004;
                        break;
                    case 8:
                        i = 2131956005;
                        break;
                    case 9:
                        i = 2131956007;
                        break;
                    case 10:
                        i = 2131955998;
                        break;
                    case 11:
                        i = 2131955999;
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        i = 2131956000;
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        i = 2131955997;
                        break;
                    case 14:
                        i = 2131956008;
                        break;
                    default:
                        throw B4Z.A00();
                }
                igTextView3.setText(i);
            }
            ClipTransformItemView clipTransformItemView = nhw.A01;
            clipTransformItemView.setVideoAspect(c51830MvY.A04);
            float f = c51830MvY.A01;
            float f2 = c51830MvY.A00;
            float f3 = c51830MvY.A02;
            float f4 = c51830MvY.A03;
            if (clipTransformItemView.A01 != f || clipTransformItemView.A00 != f2 || clipTransformItemView.A02 != f3 || clipTransformItemView.A03 != f4) {
                clipTransformItemView.A01 = f;
                clipTransformItemView.A00 = f2;
                clipTransformItemView.A02 = f3;
                clipTransformItemView.A03 = f4;
                ClipTransformItemView.A02(clipTransformItemView);
            }
            clipTransformItemView.setBitmap(c51830MvY.A05);
            return;
        }
        C52405NHa c52405NHa = (C52405NHa) this;
        if (!(interfaceC58034PoK instanceof C51828MvW) || (c51828MvW = (C51828MvW) interfaceC58034PoK) == null) {
            return;
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout2 = c52405NHa.A02;
        roundedCornerFrameLayout2.setSelected(c51828MvW.A04);
        ViewOnClickListenerC55464OkJ.A01(roundedCornerFrameLayout2, 39, interfaceC16660sJ, c51828MvW);
        Integer num = c51828MvW.A01;
        if (num != null) {
            c52405NHa.A01.setBackgroundResource(num.intValue());
        }
        c52405NHa.A00.setText(c51828MvW.A02);
        boolean z4 = c51828MvW.A03;
        SpinnerImageView spinnerImageView = c52405NHa.A03;
        if (z4) {
            c3t1 = C3T1.LOADING;
        } else {
            c3t1 = C3T1.LOADED;
        }
        spinnerImageView.setLoadingStatus(c3t1);
        ViewOnClickListenerC55464OkJ.A01(c52405NHa.itemView, 40, interfaceC16660sJ, c51828MvW);
    }
}
