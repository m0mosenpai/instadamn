package X;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.L9z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47817L9z {
    public boolean A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final ImageView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final ToggleButton A0B;
    public final ConstraintLayout A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final ViewGroup A0G;
    public final RecyclerView A0H;

    public C47817L9z(View view, View view2, boolean z, boolean z2, boolean z3) {
        ConstraintLayout constraintLayout;
        View view3;
        TextView textView;
        TextView textView2;
        TextView textView3;
        ImageView imageView;
        View view4;
        View view5;
        View view6;
        this.A0E = z;
        this.A0F = z2;
        this.A0D = z3;
        if (view != null) {
            constraintLayout = (ConstraintLayout) view.findViewById(R.id.media_picker_tab_header);
        } else {
            constraintLayout = null;
        }
        this.A0C = constraintLayout;
        if (constraintLayout != null) {
            view3 = constraintLayout.findViewById(R.id.media_picker_header_title_container);
        } else {
            view3 = null;
        }
        this.A04 = view3;
        if (constraintLayout != null) {
            textView = AbstractC166987dD.A0e(constraintLayout, R.id.media_picker_header_title);
        } else {
            textView = null;
        }
        this.A08 = textView;
        if (constraintLayout != null) {
            textView2 = AbstractC166987dD.A0e(constraintLayout, R.id.media_picker_subtitle);
        } else {
            textView2 = null;
        }
        this.A0A = textView2;
        if (view != null) {
            textView3 = AbstractC166987dD.A0e(view, R.id.media_picker_subheader);
        } else {
            textView3 = null;
        }
        this.A09 = textView3;
        this.A06 = (ViewGroup) view2.findViewById(R.id.media_picker_subheader_cell);
        this.A0G = (ViewGroup) view2.findViewById(R.id.magic_media_remix_header);
        this.A0H = AbstractC43592JPx.A0B(view2, R.id.magic_media_remix_recycler_view);
        if (constraintLayout != null) {
            imageView = AbstractC31171DnF.A08(constraintLayout, R.id.media_picker_header_chevron);
        } else {
            imageView = null;
        }
        this.A07 = imageView;
        if (constraintLayout != null) {
            view4 = constraintLayout.findViewById(R.id.media_picker_header_divider);
        } else {
            view4 = null;
        }
        this.A03 = view4;
        if (constraintLayout != null) {
            view5 = constraintLayout.findViewById(R.id.action_bar_button_back);
        } else {
            view5 = null;
        }
        this.A02 = view5;
        if (constraintLayout != null) {
            view6 = constraintLayout.findViewById(R.id.media_picker_toggle_select_button);
        } else {
            view6 = null;
        }
        this.A05 = view6;
        this.A0B = constraintLayout != null ? (ToggleButton) constraintLayout.findViewById(R.id.media_picker_toggle_hd_button) : null;
        if (z2 && constraintLayout != null && textView != null) {
            textView.setPadding((int) TypedValue.applyDimension(1, 12.0f, constraintLayout.getResources().getDisplayMetrics()), 0, 0, 0);
            C110964z8 c110964z8 = new C110964z8();
            c110964z8.A0I(constraintLayout);
            c110964z8.A09(R.id.media_picker_header_title, 2);
            c110964z8.A0G(constraintLayout);
        }
    }

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        TextView textView = this.A08;
        if (textView != null) {
            textView.setText(str);
        }
        View view = this.A04;
        if (view != null) {
            view.setContentDescription(str);
        }
    }

    public final void A00() {
        if (this.A0D) {
            ViewGroup viewGroup = this.A0G;
            int i = 0;
            if (viewGroup != null) {
                int i2 = 8;
                if (viewGroup.getVisibility() == 8) {
                    i2 = 0;
                }
                viewGroup.setVisibility(i2);
            }
            RecyclerView recyclerView = this.A0H;
            if (recyclerView != null) {
                if (recyclerView.getVisibility() != 8) {
                    i = 8;
                }
                recyclerView.setVisibility(i);
            }
        }
    }

    public final void A02(boolean z) {
        boolean z2 = this.A01;
        if (z) {
            if (!z2) {
                this.A01 = true;
                ConstraintLayout constraintLayout = this.A0C;
                if (constraintLayout != null) {
                    constraintLayout.setEnabled(false);
                }
                AbstractC47879LCz.A01(this.A08);
                if (this.A00) {
                    AbstractC47879LCz.A01(this.A07);
                }
                AbstractC47879LCz.A00(this.A0A);
                return;
            }
            return;
        }
        if (!z2) {
            return;
        }
        this.A01 = false;
        ConstraintLayout constraintLayout2 = this.A0C;
        if (constraintLayout2 != null) {
            constraintLayout2.setEnabled(true);
        }
        AbstractC47879LCz.A00(this.A08);
        if (this.A00) {
            AbstractC47879LCz.A00(this.A07);
        }
        AbstractC47879LCz.A01(this.A0A);
    }
}
