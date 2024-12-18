package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes6.dex */
public final class E43 extends C3OO {
    public C32828EcW A00;
    public String A01;
    public final View A02;
    public final UserSession A03;
    public final IgTextView A04;
    public final CircularImageView A05;
    public final InterfaceC56392iX A06;
    public final InterfaceC56392iX A07;
    public final InterfaceC56392iX A08;
    public final InterfaceC56392iX A09;
    public final InterfaceC56392iX A0A;
    public final InterfaceC56392iX A0B;
    public final InterfaceC56392iX A0C;
    public final C34543FKd A0D;
    public final MediaFrameLayout A0E;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0bW, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.7QG, X.EcW, android.view.View$OnTouchListener] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(androidx.fragment.app.Fragment r13, X.C36211FyP r14, X.C31831Dyp r15) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E43.A00(androidx.fragment.app.Fragment, X.FyP, X.Dyp):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E43(View view, UserSession userSession, C34543FKd c34543FKd) {
        super(view);
        AbstractC167017dG.A1P(view, userSession);
        this.A02 = view;
        this.A03 = userSession;
        this.A0D = c34543FKd;
        this.A0E = (MediaFrameLayout) AbstractC166997dE.A0R(view, R.id.card);
        this.A05 = AbstractC31176DnK.A0U(view, R.id.profile_picture);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.username);
        this.A0B = AbstractC166997dE.A0X(view, R.id.text);
        this.A07 = AbstractC166997dE.A0X(view, R.id.media_overlay_gradient);
        this.A06 = AbstractC166997dE.A0X(view, R.id.full_bleed_media);
        this.A08 = AbstractC166997dE.A0X(view, R.id.media_container);
        this.A09 = AbstractC166997dE.A0X(view, R.id.overflow_menu);
        this.A0C = AbstractC166997dE.A0X(view, R.id.upvote_pill);
        this.A0A = AbstractC166997dE.A0X(view, R.id.reply_pill);
    }
}
