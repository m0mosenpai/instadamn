package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.MmK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51359MmK extends C3OO {
    public final UserSession A00;
    public final C50811Mcd A01;

    public final void A00(Drawable drawable, View.OnClickListener onClickListener, EnumC151036r4 enumC151036r4, C5SW c5sw, CharSequence charSequence, CharSequence charSequence2, float f, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(enumC151036r4, 4);
        C0fQ.A00(onClickListener, this.itemView);
        C50811Mcd c50811Mcd = this.A01;
        if (drawable == null) {
            ImageView imageView = c50811Mcd.A01;
            if (imageView == null) {
                C14360o3.A0F("iconImageView");
                throw C00O.createAndThrow();
            }
            if (c50811Mcd.indexOfChild(imageView) != -1) {
                c50811Mcd.removeView(imageView);
                c50811Mcd.A00 = null;
            }
        } else {
            c50811Mcd.setIcon(drawable);
        }
        c50811Mcd.setLabel(charSequence);
        if (charSequence2 != null) {
            charSequence = charSequence2;
        }
        c50811Mcd.setContentDescription(charSequence);
        c50811Mcd.setButtonStyle(enumC151036r4);
        c50811Mcd.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        c50811Mcd.setEnabled(z2);
        c50811Mcd.setActivated(z3);
        c50811Mcd.setAlpha(f);
        if (c5sw != null) {
            c50811Mcd.postDelayed(new PQ2(this, c5sw), 500L);
        }
        c50811Mcd.A02();
    }

    public C51359MmK(View view, UserSession userSession, C50811Mcd c50811Mcd) {
        super(view);
        this.A01 = c50811Mcd;
        this.A00 = userSession;
    }
}
