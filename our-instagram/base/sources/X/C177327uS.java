package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.bubblespinner.BubbleSpinner;

/* renamed from: X.7uS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177327uS {
    public int A00;
    public C88X A01;
    public final GradientDrawable A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final IgImageView A09;
    public final InterfaceC65702y7 A0A;
    public final BubbleSpinner A0B;
    public final Handler A0C;
    public final C174437pd A0D;

    public C177327uS(View view, C174437pd c174437pd, final C88L c88l) {
        float dimension;
        C14360o3.A0B(view, 1);
        this.A05 = view;
        this.A0D = c174437pd;
        View requireViewById = view.requireViewById(R.id.ar_effect_in_tray_icon);
        C14360o3.A07(requireViewById);
        IgImageView igImageView = (IgImageView) requireViewById;
        this.A07 = igImageView;
        this.A03 = view.findViewById(R.id.empty_ar_effect_in_tray_icon);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A02 = gradientDrawable;
        this.A0C = new Handler();
        this.A00 = -1;
        Resources resources = view.getContext().getResources();
        if (c174437pd != null) {
            dimension = resources.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height) / 2.0f;
        } else {
            dimension = resources.getDimension(R.dimen.action_bar_item_spacing_right);
        }
        gradientDrawable.setCornerRadius(dimension);
        this.A0B = (BubbleSpinner) view.findViewById(R.id.face_effect_loading_indicator);
        this.A06 = (ImageView) view.findViewById(R.id.camera_mq_button_badge);
        this.A08 = (IgImageView) view.findViewById(R.id.camera_mq_deactivated);
        this.A09 = (IgImageView) view.findViewById(R.id.face_effect_selected);
        this.A04 = view.findViewById(R.id.effect_icon_background);
        igImageView.setRequestStartListener(new InterfaceC177347uU() { // from class: X.7uT
            @Override // X.InterfaceC177347uU
            public final void DgF() {
                BubbleSpinner bubbleSpinner = C177327uS.this.A0B;
                if (bubbleSpinner != null) {
                    bubbleSpinner.setVisibility(0);
                    bubbleSpinner.setLoadingStatus(C8ZZ.LOADING);
                }
            }
        });
        igImageView.A0E = new InterfaceC73023Pd() { // from class: X.7uV
            @Override // X.InterfaceC73023Pd
            public final void DFp() {
            }

            @Override // X.InterfaceC73023Pd
            public final void DPX(C73083Pj c73083Pj) {
                BubbleSpinner bubbleSpinner = C177327uS.this.A0B;
                if (bubbleSpinner != null) {
                    bubbleSpinner.setLoadingStatus(C8ZZ.DONE);
                    bubbleSpinner.setVisibility(8);
                }
            }
        };
        InterfaceC65702y7 interfaceC65702y7 = new InterfaceC65702y7() { // from class: X.7uW
            @Override // X.InterfaceC65702y7
            public final void EGm(Bitmap bitmap, IgImageView igImageView2) {
                C14360o3.A0B(igImageView2, 0);
                C14360o3.A0B(bitmap, 1);
                igImageView2.setImageDrawable(new C8FY(igImageView2.getResources(), bitmap));
                C177327uS c177327uS = this;
                c177327uS.A00();
                C88L c88l2 = c88l;
                if (c88l2 != null) {
                    c88l2.DA8(c177327uS.A00);
                } else {
                    AbstractC12120kG.A07("DialElementViewHolder", "DialElementViewHolder.Listener is null", null);
                }
            }
        };
        this.A0A = interfaceC65702y7;
        igImageView.A0I = interfaceC65702y7;
    }

    public final void A00() {
        C174437pd c174437pd = this.A0D;
        if (c174437pd != null) {
            IgImageView igImageView = this.A07;
            Drawable background = igImageView.getBackground();
            C14360o3.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            float f = c174437pd.A02 / 2.0f;
            ((GradientDrawable) background).setCornerRadius(f);
            Drawable drawable = igImageView.getDrawable();
            if (drawable != null && (drawable instanceof C8FY)) {
                ((C8FY) drawable).A02(f);
            }
        }
    }
}
