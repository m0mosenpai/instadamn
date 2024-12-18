package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes11.dex */
public final class UJX extends C3OO {
    public final View A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgImageView A07;
    public final LE1 A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJX(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, LE1 le1) {
        super(view);
        AbstractC25233BEq.A0w(2, abstractC59962oe, userSession, le1);
        this.A00 = view;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A08 = le1;
        this.A07 = AbstractC167007dF.A0T(view, R.id.direct_inbox_campaign_item_thumbnail);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.direct_inbox_campaign_active_date);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.direct_inbox_campaign_budget_spent);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.direct_inbox_campaign_info_divider);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.direct_inbox_campaign_message_counter);
    }
}
