package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Fd7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35096Fd7 {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.E0t] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.3OO, X.E16] */
    public static final View A00(Context context, int i, ViewGroup viewGroup) {
        View view;
        Object obj;
        C14360o3.A0B(context, 0);
        if (i != 0) {
            if (i == 1) {
                View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.see_more_with_chevron_row, false);
                C14360o3.A0B(A0D, 1);
                ?? c3oo = new C3OO(A0D);
                c3oo.A02 = AbstractC167007dF.A0N(A0D, R.id.see_more_button);
                c3oo.A01 = AbstractC31176DnK.A0D(A0D, R.id.see_more_chevron);
                c3oo.A00 = AbstractC31176DnK.A0D(A0D, R.id.loading_spinner);
                obj = c3oo;
                view = A0D;
            } else {
                throw new UnsupportedOperationException("Unknown viewType");
            }
        } else {
            View A0D2 = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.row_userlist_view_all, false);
            C14360o3.A0B(A0D2, 1);
            ?? c3oo2 = new C3OO(A0D2);
            c3oo2.A00 = AbstractC167007dF.A0N(A0D2, R.id.see_all_button);
            obj = c3oo2;
            view = A0D2;
        }
        view.setTag(obj);
        return view;
    }

    public static final void A01(Context context, C3OO c3oo, C31576Du4 c31576Du4, C38M c38m, int i) {
        int i2;
        ViewOnClickListenerC35684FpJ viewOnClickListenerC35684FpJ;
        View view;
        C14360o3.A0B(context, 0);
        int A07 = AbstractC25230BEn.A07(2, c31576Du4, c38m);
        Integer num = c31576Du4.A03;
        if (i != 0) {
            if (i == 1) {
                View A06 = AbstractC31171DnF.A06(c3oo);
                if (num == C05F.A0Y && (A06.getLayoutParams() instanceof C3OP)) {
                    ViewGroup.LayoutParams layoutParams = A06.getLayoutParams();
                    C14360o3.A0C(layoutParams, AbstractC111324zv.A00(17));
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(AbstractC31171DnF.A02(context.getResources(), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), 0, (int) AbstractC31173DnH.A00(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), (int) AbstractC31173DnH.A00(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                } else if (num == C05F.A0j) {
                    int A02 = AbstractC31171DnF.A02(context.getResources(), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                    A06.setPadding(A02, A02, A02, A02);
                    AbstractC13880nE.A0W(A06, -2);
                }
                E16 e16 = (E16) c3oo;
                e16.A02.setVisibility(0);
                e16.A01.setVisibility(0);
                e16.A00.setVisibility(8);
                viewOnClickListenerC35684FpJ = new ViewOnClickListenerC35684FpJ(67, c38m, c3oo, c31576Du4);
                view = A06;
            } else {
                return;
            }
        } else {
            TextView textView = ((C31913E0t) c3oo).A00;
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != A07) {
                            if (intValue == 6) {
                                A02(textView, context);
                                int A04 = AbstractC167017dG.A04(context);
                                AbstractC13880nE.A0k(textView, A04, A04, AbstractC167017dG.A05(context), A04);
                            }
                        } else {
                            A02(textView, context);
                        }
                    } else {
                        AbstractC166987dD.A1P(context, textView, 2131973176);
                        if (c31576Du4.A02) {
                            AbstractC13880nE.A0U(textView, AbstractC167017dG.A09(context));
                        }
                    }
                    viewOnClickListenerC35684FpJ = new ViewOnClickListenerC35684FpJ(66, c38m, c31576Du4, num);
                    view = textView;
                } else {
                    i2 = 2131973168;
                }
            } else {
                i2 = 2131973173;
            }
            AbstractC166987dD.A1P(context, textView, i2);
            viewOnClickListenerC35684FpJ = new ViewOnClickListenerC35684FpJ(66, c38m, c31576Du4, num);
            view = textView;
        }
        C0fQ.A00(viewOnClickListenerC35684FpJ, view);
    }

    public static final void A02(TextView textView, Context context) {
        AbstractC166987dD.A1P(context, textView, 2131973168);
        AbstractC166987dD.A1O(context, textView, C1QI.A01(context));
        Drawable drawable = context.getDrawable(R.drawable.instagram_chevron_right_outline_rtl_16);
        if (drawable != null) {
            AbstractC85953sP.A02(context, drawable, R.attr.glyphColorSecondary);
            RectF rectF = AbstractC13880nE.A01;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        AbstractC13880nE.A0W(textView, context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width));
    }
}
