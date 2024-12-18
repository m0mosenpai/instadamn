package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* loaded from: classes8.dex */
public abstract class L8D {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final InterfaceC11380iw A07;
    public final C18920wW A08;
    public final UserSession A09;
    public final C2AH A0A;
    public final CirclePageIndicator A0B;
    public final boolean A0C;

    public final void A01() {
        View view = this.A05;
        int i = 4;
        if (view != null) {
            view.setVisibility(4);
        }
        CirclePageIndicator circlePageIndicator = this.A0B;
        if (circlePageIndicator != null) {
            circlePageIndicator.setVisibility(4);
        }
        View view2 = this.A04;
        if (view2 != null) {
            if (this.A0C) {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    public L8D(Context context, ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z) {
        int i;
        this.A03 = context;
        this.A06 = viewGroup;
        this.A07 = interfaceC11380iw;
        this.A09 = userSession;
        this.A0C = z;
        this.A08 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A0B = (CirclePageIndicator) viewGroup.findViewById(R.id.page_indicator);
        View findViewById = viewGroup.findViewById(R.id.profile_share_card);
        this.A05 = findViewById;
        this.A04 = viewGroup.findViewById(R.id.background_image_view);
        int A03 = AbstractC43594JPz.A03(context);
        this.A02 = A03;
        this.A01 = A03 * 2;
        if (findViewById != null) {
            i = findViewById.getHeight();
        } else {
            i = 0;
        }
        this.A00 = i;
        this.A0A = new C43922JbX(this, 2);
    }
}
