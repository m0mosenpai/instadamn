package X;

import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6TY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6TY {
    public int A00;
    public int A01;
    public TransitionDrawable A02;
    public final long A03;
    public final View A04;
    public final InterfaceC56392iX A05;
    public final boolean A06;

    public final void A00() {
        ((TextView) this.A05.getView()).setTextColor(this.A01);
        TransitionDrawable transitionDrawable = this.A02;
        if (transitionDrawable != null) {
            transitionDrawable.resetTransition();
        }
    }

    public C6TY(View view, UserSession userSession) {
        this.A04 = view;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A06 = C18U.A06(c06090Tz, userSession, 36317788188513853L);
        this.A03 = C18U.A01(c06090Tz, userSession, 36599263165287913L);
        this.A05 = AbstractC56372iV.A01(view.requireViewById(R.id.reel_item_action_button_stub), false, false);
        Context context = view.getContext();
        this.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media));
        this.A00 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_text_on_white));
    }
}
