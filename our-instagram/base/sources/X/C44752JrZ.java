package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JrZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44752JrZ extends C3OO {
    public final Activity A00;
    public final View A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgImageView A08;
    public final LE1 A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44752JrZ(Activity activity, View view, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        super(view);
        AbstractC25233BEq.A0w(2, abstractC59962oe, userSession, activity);
        this.A01 = view;
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A00 = activity;
        this.A09 = new LE1(abstractC59962oe, userSession);
        this.A08 = AbstractC167007dF.A0T(view, R.id.direct_inbox_campaign_thread_profile_image);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.direct_inbox_campaign_thread_name);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.direct_inbox_campaign_thread_message_preview);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.direct_inbox_campaign_thread_message_preview_divider);
        this.A07 = AbstractC25231BEo.A0d(view, R.id.direct_inbox_campaign_thread_message_preview_timestamp);
    }
}
