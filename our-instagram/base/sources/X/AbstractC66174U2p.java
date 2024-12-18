package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.U2p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66174U2p {
    public static final void A01(View view) {
        C14360o3.A0B(view, 0);
        view.setMinimumHeight(AbstractC25228BEl.A0M(view).getDimensionPixelSize(R.dimen.challenge_sticker_v2_4_winner2_submission_offsetX));
        view.getLayoutParams().height = -2;
    }

    public static final void A02(View view) {
        C14360o3.A0B(view, 0);
        view.setMinimumHeight(AbstractC43594JPz.A06(view.getContext()));
        view.getLayoutParams().height = -2;
    }

    public static final void A03(CircularImageView circularImageView) {
        Context context = circularImageView.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Avatar_Search_Redesign, AbstractC55922hc.A0F);
        C14360o3.A07(obtainStyledAttributes);
        int color = obtainStyledAttributes.getColor(2, context.getColor(AbstractC53242c7.A0H(context, R.attr.avatarInnerStroke)));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize > 0) {
            C58932mr c58932mr = new C58932mr(dimensionPixelSize, color);
            RectF rectF = AbstractC13880nE.A01;
            circularImageView.setBackground(c58932mr);
        }
    }

    public static final void A04(CircularImageView circularImageView) {
        C14360o3.A0B(circularImageView, 0);
        Context context = circularImageView.getContext();
        int A06 = AbstractC43594JPz.A06(context);
        int A0E = AbstractC167017dG.A0E(context);
        AbstractC43592JPx.A1F(circularImageView, A06);
        circularImageView.getLayoutParams().width = A06;
        circularImageView.setPadding(A0E, A0E, A0E, A0E);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Avatar_Search_DenseRow, AbstractC55922hc.A0F);
        C14360o3.A07(obtainStyledAttributes);
        int color = obtainStyledAttributes.getColor(2, AbstractC167007dF.A09(context, R.attr.avatarInnerStroke));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize > 0) {
            C58932mr c58932mr = new C58932mr(dimensionPixelSize, color);
            RectF rectF = AbstractC13880nE.A01;
            circularImageView.setBackground(c58932mr);
        }
    }

    public static final void A00(View view) {
        C14360o3.A0B(view, 0);
        Object parent = view.getParent();
        if (parent != null) {
            View view2 = (View) parent;
            view2.post(new U38(view, AbstractC166997dE.A04(view2.getContext(), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), view2));
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
