package X;

import android.graphics.ColorFilter;
import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Hza, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40616Hza {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, InterfaceC65702y7 interfaceC65702y7, AbstractC42425IqS abstractC42425IqS, C38321qM c38321qM, IgImageButton igImageButton, float f, int i, int i2, boolean z, boolean z2, boolean z3) {
        AbstractC167027dH.A13(c38321qM, interfaceC11380iw, interfaceC65702y7);
        ImageUrl imageUrl = null;
        ViewOnClickListenerC42034Ik3 viewOnClickListenerC42034Ik3 = null;
        igImageButton.setColorFilter((ColorFilter) null);
        ((IgImageView) igImageButton).A0I = null;
        igImageButton.setVisibility(0);
        igImageButton.setImageAlpha(255);
        igImageButton.setOnTouchListener(null);
        C0fQ.A00(null, igImageButton);
        igImageButton.setClickable(false);
        igImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (z2) {
            igImageButton.setIcon(EnumC153466vG.A0C);
        }
        ((ConstrainedImageView) igImageButton).A00 = f;
        igImageButton.clearAnimation();
        ((IgImageView) igImageButton).A0I = interfaceC65702y7;
        if (z2) {
            if (abstractC42425IqS != null) {
                viewOnClickListenerC42034Ik3 = new ViewOnClickListenerC42034Ik3(13, abstractC42425IqS, c38321qM);
            }
            IZ9.A00(viewOnClickListenerC42034Ik3, interfaceC11380iw, c38321qM, igImageButton, i, i2, false, false);
            return;
        }
        if (c38321qM.A4w()) {
            android.net.Uri uri = c38321qM.A05;
            if (uri != null) {
                imageUrl = AbstractC81033jX.A00(uri, -1, -1);
            }
        } else {
            imageUrl = c38321qM.A1q(AbstractC166997dE.A0L(igImageButton));
        }
        int i3 = 0;
        if (imageUrl != null) {
            igImageButton.A0F(interfaceC11380iw, imageUrl, z3);
        }
        if (z) {
            i3 = 8;
        }
        igImageButton.setVisibility(i3);
    }
}
