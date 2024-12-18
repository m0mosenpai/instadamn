package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.smartcapture.ui.SelfieCaptureUi;
import com.facebook.smartcapture.ui.ig.XMDSIgSelfieCaptureUi;

/* renamed from: X.Jkn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44434Jkn extends LinearLayout {
    public View.OnClickListener A00;

    public C44434Jkn(Context context, MRQ mrq, SelfieCaptureUi selfieCaptureUi, boolean z) {
        super(context);
        Drawable drawable;
        View inflate;
        View inflate2;
        int i;
        setOrientation(1);
        setBackground(AbstractC46570Kj9.A00(AbstractC31173DnH.A00(context, R.dimen.abc_edit_text_inset_top_material), AbstractC31173DnH.A00(context, R.dimen.abc_edit_text_inset_top_material), 0.0f, 0.0f, AbstractC47994LKy.A01(context, R.attr.sc_popover_background)));
        if (selfieCaptureUi != null) {
            boolean z2 = selfieCaptureUi instanceof XMDSIgSelfieCaptureUi;
            LayoutInflater A0P = AbstractC25228BEl.A0P(this);
            if (z2) {
                i = R.layout.xmds_selfie_capture_help_view;
            } else {
                i = R.layout.selfie_capture_help_view;
            }
            A0P.inflate(i, (ViewGroup) this, true);
        }
        setOnClickListener(LPX.A00);
        View A00 = AbstractC47961LGz.A00(this, R.id.view_pin);
        int A01 = AbstractC47994LKy.A01(context, R.attr.sc_popover_handle);
        float A02 = AbstractC43594JPz.A02(context) / 2.0f;
        A00.setBackground(AbstractC46570Kj9.A00(A02, A02, A02, A02, A01));
        ImageView A012 = AbstractC47961LGz.A01(this, R.id.iv_help_close);
        A012.setColorFilter(AbstractC47994LKy.A01(context, R.attr.sc_popover_primary_icon));
        if (mrq != null) {
            A012.setImageDrawable(mrq.AtM(context));
        }
        A012.setOnClickListener(LQ0.A01(this, 38));
        AbstractC47994LKy.A04(context, AbstractC47961LGz.A02(this, R.id.tv_help_title), R.attr.sc_popover_primary_text);
        AbstractC47994LKy.A04(context, AbstractC47961LGz.A02(this, R.id.tv_help_description), R.attr.sc_popover_primary_text);
        if (mrq != null) {
            drawable = mrq.B3x(context);
        } else {
            drawable = null;
        }
        A00(context, drawable, R.id.help_item_eye_level, R.string.res_0x7f1300c3_name_removed, R.string.res_0x7f1300be_name_removed);
        A00(context, mrq != null ? mrq.Acg(context) : null, R.id.help_item_on_screen_instructions, R.string.res_0x7f1300c5_name_removed, R.string.res_0x7f1300bf_name_removed);
        if (selfieCaptureUi != null) {
            ViewGroup viewGroup = (ViewGroup) AbstractC47961LGz.A00(this, R.id.ll_help_body_container);
            boolean z3 = selfieCaptureUi instanceof XMDSIgSelfieCaptureUi;
            if (!z3 && (inflate2 = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.ig_selfie_help_header, viewGroup, false)) != null) {
                viewGroup.addView(inflate2, 0);
            }
            if (!z3 && (inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.ig_selfie_help_footer, viewGroup, false)) != null && !z) {
                viewGroup.addView(inflate);
            }
        }
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    private final void A00(Context context, Drawable drawable, int i, int i2, int i3) {
        View A00 = AbstractC47961LGz.A00(this, i);
        ImageView A01 = AbstractC47961LGz.A01(A00, R.id.iv_item_icon);
        A01.setColorFilter(AbstractC47994LKy.A01(context, R.attr.selfie_help_icons_color));
        int A012 = AbstractC47994LKy.A01(context, R.attr.selfie_help_icons_background);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(A012);
        A01.setBackground(gradientDrawable);
        A01.setImageDrawable(drawable);
        TextView A02 = AbstractC47961LGz.A02(A00, R.id.tv_item_title);
        A02.setText(i2);
        Context A0L = AbstractC166997dE.A0L(this);
        AbstractC47994LKy.A04(A0L, A02, R.attr.sc_popover_primary_text);
        TextView A022 = AbstractC47961LGz.A02(A00, R.id.tv_item_subtitle);
        A022.setText(i3);
        AbstractC47994LKy.A04(A0L, A022, R.attr.sc_popover_secondary_text);
    }
}
