package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.Kkt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46676Kkt {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, IgImageView igImageView, NoteBubbleView noteBubbleView, RoundedCornerConstraintLayout roundedCornerConstraintLayout, int i, int i2, boolean z, boolean z2, boolean z3) {
        ViewGroup.LayoutParams layoutParams;
        C14360o3.A0B(interfaceC11380iw, 8);
        if (igImageView != null) {
            if (imageUrl != null) {
                igImageView.setUrl(imageUrl, interfaceC11380iw);
            } else {
                return;
            }
        }
        if (z && roundedCornerConstraintLayout != null && (layoutParams = roundedCornerConstraintLayout.getLayoutParams()) != null) {
            layoutParams.width = AbstractC166987dD.A0C(context, i);
            layoutParams.height = AbstractC166987dD.A0C(context, i2);
            roundedCornerConstraintLayout.setLayoutParams(layoutParams);
        }
        if (noteBubbleView != null) {
            noteBubbleView.A0J(z2, false, z3, false);
            noteBubbleView.setCreationLayoutForContentNotesShare(AbstractC53242c7.A09(context));
        }
    }
}
