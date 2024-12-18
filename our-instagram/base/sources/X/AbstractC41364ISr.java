package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;
import com.instagram.ui.widget.thumbnailview.ThumbnailView;
import java.util.List;

/* renamed from: X.ISr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41364ISr {
    public static final void A00(C38509GwU c38509GwU, C42307IoV c42307IoV) {
        C38623GyQ c38623GyQ = c42307IoV.A00;
        if (c38623GyQ.A01 == null && c38623GyQ.A02 == null) {
            c38509GwU.A09.setVisibility(8);
            return;
        }
        ClickableTextContainer clickableTextContainer = c38509GwU.A09;
        clickableTextContainer.setVisibility(0);
        Resources resources = clickableTextContainer.getResources();
        AbstractC13880nE.A0f(clickableTextContainer, resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
        AbstractC13880nE.A0e(clickableTextContainer, AbstractC166997dE.A08(resources));
    }

    public static final void A01(C38509GwU c38509GwU, C42307IoV c42307IoV, boolean z) {
        View view;
        int i;
        boolean A1Y = AbstractC25229BEm.A1Y(c42307IoV);
        if (z) {
            ViewOnClickListenerC42035Ik4.A01(c38509GwU.itemView, 2, c42307IoV);
            c38509GwU.itemView.setOnTouchListener(new ViewOnTouchListenerC42050IkJ(c38509GwU, 4));
            A00(c38509GwU, c42307IoV);
            C38623GyQ c38623GyQ = c42307IoV.A00;
            String str = c38623GyQ.A01;
            if (str != null) {
                TextView textView = c38509GwU.A04;
                textView.setVisibility(A1Y ? 1 : 0);
                textView.setText(str);
            } else {
                c38509GwU.A04.setVisibility(8);
            }
            String str2 = c38623GyQ.A02;
            if (str2 != null) {
                TextView textView2 = c38509GwU.A05;
                textView2.setVisibility(A1Y ? 1 : 0);
                textView2.setText(str2);
                return;
            }
            view = c38509GwU.A05;
        } else {
            c38509GwU.itemView.setVisibility(A1Y ? 1 : 0);
            ViewOnClickListenerC42035Ik4.A01(c38509GwU.itemView, 2, c42307IoV);
            c38509GwU.itemView.setOnTouchListener(new ViewOnTouchListenerC42050IkJ(c38509GwU, 4));
            C38623GyQ c38623GyQ2 = c42307IoV.A00;
            ImageUrl imageUrl = c38623GyQ2.A00;
            IgImageView igImageView = c38509GwU.A07;
            if (imageUrl == null) {
                igImageView.setVisibility(8);
            } else {
                igImageView.setVisibility(A1Y ? 1 : 0);
                igImageView.setUrl(imageUrl, c42307IoV.A01.A00);
            }
            List list = c38623GyQ2.A03;
            boolean isEmpty = list.isEmpty();
            ThumbnailView thumbnailView = c38509GwU.A0A;
            if (isEmpty) {
                thumbnailView.setVisibility(8);
            } else {
                thumbnailView.setVisibility(A1Y ? 1 : 0);
                thumbnailView.setGridImages(list, c42307IoV.A01.A00);
            }
            List list2 = c38623GyQ2.A04;
            boolean isEmpty2 = list2.isEmpty();
            TransitionCarouselImageView transitionCarouselImageView = c38509GwU.A08;
            if (isEmpty2) {
                transitionCarouselImageView.setVisibility(8);
            } else {
                transitionCarouselImageView.setVisibility(A1Y ? 1 : 0);
                transitionCarouselImageView.A04(list2, A1Y);
                c42307IoV.A01.A02.invoke(transitionCarouselImageView);
            }
            A00(c38509GwU, c42307IoV);
            String str3 = c38623GyQ2.A01;
            if (str3 != null) {
                TextView textView3 = c38509GwU.A04;
                textView3.setVisibility(A1Y ? 1 : 0);
                textView3.setText(str3);
            } else {
                c38509GwU.A04.setVisibility(8);
            }
            String str4 = c38623GyQ2.A02;
            if (str4 != null) {
                TextView textView4 = c38509GwU.A05;
                textView4.setVisibility(A1Y ? 1 : 0);
                textView4.setText(str4);
            } else {
                c38509GwU.A05.setVisibility(8);
            }
            c38509GwU.A03.setVisibility(8);
            c38509GwU.A02.setVisibility(8);
            if (imageUrl == null && list.isEmpty() && list2.isEmpty()) {
                view = c38509GwU.A00;
                i = 0;
                view.setVisibility(i);
            }
            view = c38509GwU.A00;
        }
        i = 8;
        view.setVisibility(i);
    }
}
