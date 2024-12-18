package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.CJs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27699CJs {
    public static final void A00(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Reel reel, InterfaceC64002vL interfaceC64002vL, boolean z) {
        ImageUrl A06;
        float f;
        ImageUrl A062;
        IgImageView igImageView = (IgImageView) AbstractC166987dD.A0c(view, R.id.memory_badge_first_card);
        List A0O = reel.A0O(userSession);
        C14360o3.A07(A0O);
        C41181vS c41181vS = (C41181vS) AbstractC001800i.A0J(A0O);
        if (c41181vS != null && (A062 = c41181vS.A06()) != null) {
            igImageView.setUrl(A062, interfaceC11380iw);
        }
        IgImageView igImageView2 = (IgImageView) AbstractC166987dD.A0c(view, R.id.memory_badge_second_card);
        C41181vS c41181vS2 = (C41181vS) AbstractC001800i.A0O(A0O, 1);
        if (c41181vS2 != null && (A06 = c41181vS2.A06()) != null) {
            igImageView2.setUrl(A06, interfaceC11380iw);
            if (z) {
                Context A0L = AbstractC166997dE.A0L(igImageView2);
                igImageView2.setTranslationX(AbstractC13880nE.A00(A0L, -5.0f));
                igImageView2.setTranslationY(AbstractC13880nE.A00(A0L, -4.0f));
                f = -7.0f;
            } else {
                f = 0.0f;
                igImageView2.setTranslationX(0.0f);
                igImageView2.setTranslationY(0.0f);
            }
            igImageView2.setRotation(f);
        } else {
            igImageView2.setVisibility(8);
        }
        ViewOnClickListenerC28666ClE.A01(view, 20, interfaceC64002vL);
    }
}
