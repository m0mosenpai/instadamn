package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Fd4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35093Fd4 {
    public static void A01(C31335Dq0 c31335Dq0, GYQ gyq, E1F e1f, GYR gyr) {
        View.OnClickListener onClickListener;
        String str;
        if (e1f != null) {
            int i = 0;
            A02(c31335Dq0, e1f, false, false);
            TextView textView = e1f.A04;
            textView.getClass();
            ImageView imageView = e1f.A03;
            imageView.getClass();
            Drawable drawable = c31335Dq0.A08;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                int i2 = c31335Dq0.A00;
                if (i2 != -1) {
                    imageView.setColorFilter(C3DY.A00(i2));
                }
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            int i3 = c31335Dq0.A00;
            if (i3 == -1) {
                i3 = textView.getContext().getColor(C1QI.A00(R.color.igds_primary_button));
            }
            textView.setTextColor(i3);
            textView.setText(c31335Dq0.A0G);
            if (gyq != null || c31335Dq0.A09 != null) {
                AbstractC56952jT.A01(textView);
                if (gyq != null) {
                    onClickListener = new ViewOnClickListenerC35687FpM(65, gyq, c31335Dq0);
                } else {
                    onClickListener = c31335Dq0.A09;
                }
                C0fQ.A00(onClickListener, textView);
            }
            if (gyr != null && (str = c31335Dq0.A0H) != null) {
                gyr.Elo(textView, str);
            }
        }
    }

    public static void A02(C31335Dq0 c31335Dq0, E1F e1f, boolean z, boolean z2) {
        TextView textView = e1f.A04;
        if (textView != null) {
            textView.setId(c31335Dq0.A01);
        }
        View view = e1f.A01;
        if (view.getLayoutParams() != null) {
            if (!z2 && !c31335Dq0.A0M) {
                AbstractC31172DnG.A1F(e1f.itemView.getResources(), view.getLayoutParams(), R.dimen.abc_alert_dialog_button_dimen);
                view.setMinimumHeight(e1f.itemView.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen));
            } else {
                view.setLayoutParams(new C56302iJ(-1, -2));
                FrameLayout frameLayout = e1f.A02;
                if (frameLayout != null) {
                    frameLayout.setMinimumHeight(0);
                    frameLayout.setLayoutParams(new C56302iJ(-1, -2));
                }
                if (z2) {
                    AbstractC13880nE.A0Y(e1f.A06, 0);
                }
            }
            if (c31335Dq0.A0M) {
                AbstractC13880nE.A0f(view, e1f.itemView.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material));
            }
        }
        if (z) {
            AbstractC13880nE.A0f(view, 0);
        }
        TextView textView2 = e1f.A06;
        textView2.setAlpha(1.0f);
        if (textView2.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams.gravity = 8388611;
            textView2.setGravity(0);
            textView2.setLayoutParams(layoutParams);
        }
        view.setFocusable(true);
        AbstractC010103p.A0B(view, new UEG(4));
        textView2.setSingleLine(c31335Dq0.A0K);
        TextView textView3 = e1f.A05;
        if (textView3 != null) {
            textView3.setSingleLine(c31335Dq0.A0L);
            textView3.setPaddingRelative(textView3.getPaddingStart(), c31335Dq0.A06, textView3.getPaddingEnd(), textView3.getPaddingBottom());
        }
        e1f.A00.setVisibility(AbstractC167007dF.A05(c31335Dq0.A0I ? 1 : 0));
        c31335Dq0.A05(textView2, textView3, null);
        CharSequence charSequence = c31335Dq0.A0F;
        if (charSequence != null && charSequence.length() != 0) {
            boolean z3 = c31335Dq0.A0M;
            int paddingStart = textView2.getPaddingStart();
            if (z3) {
                textView2.setPaddingRelative(paddingStart, textView2.getPaddingTop(), textView2.getPaddingEnd(), 0);
            } else {
                textView2.setPaddingRelative(paddingStart, 0, textView2.getPaddingEnd(), 0);
            }
        }
        e1f.itemView.setBackgroundColor(c31335Dq0.A02);
        if (c31335Dq0.A07 != 0 || c31335Dq0.A03 != 0) {
            ViewGroup.LayoutParams layoutParams2 = e1f.itemView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                e1f.itemView.setLayoutParams(layoutParams2);
            }
            View view2 = e1f.itemView;
            view2.setPadding(view2.getPaddingLeft(), c31335Dq0.A07, e1f.itemView.getPaddingRight(), c31335Dq0.A03);
        }
        int i = c31335Dq0.A04;
        if (i != -1) {
            textView2.setTextAppearance(i);
        }
        e1f.itemView.setClickable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, X.E1F, java.lang.Object] */
    public static E1F A00(Context context, ViewGroup viewGroup, boolean z) {
        LayoutInflater from = LayoutInflater.from(context);
        int i = R.layout.row_header;
        if (z) {
            i = R.layout.row_header_with_action;
        }
        View A0A = AbstractC31172DnG.A0A(from, viewGroup, i);
        ?? c3oo = new C3OO(A0A);
        if (!z) {
            c3oo.A02 = (FrameLayout) A0A.requireViewById(R.id.row_title_textview);
            c3oo.A05 = AbstractC166997dE.A0T(A0A, R.id.row_header_subtitle_textview);
        }
        c3oo.A06 = AbstractC166997dE.A0T(A0A, R.id.row_header_textview);
        c3oo.A01 = A0A.requireViewById(R.id.frame_header);
        c3oo.A00 = A0A.requireViewById(R.id.row_divider);
        c3oo.A04 = AbstractC166987dD.A0e(A0A, R.id.row_header_action);
        c3oo.A03 = AbstractC31171DnF.A08(A0A, R.id.row_header_action_icon);
        A0A.setTag(c3oo);
        return c3oo;
    }
}
