package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class HMQ extends AbstractC38513GwY {
    public final JGG A00;
    public final ImageView A01;
    public final TextView A02;

    public final void A03(C38061Goo c38061Goo) {
        C14360o3.A0B(c38061Goo, 0);
        MUD mud = c38061Goo.A00;
        if (mud != null) {
            this.A02.setText(mud.A02);
            AbstractC38055Goi.A00(this.A01, (ImageUrl) mud.A00, null);
            ViewOnClickListenerC42034Ik3.A00(this.itemView, 27, mud, this);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMQ(View view, UserSession userSession, JGG jgg) {
        super(view);
        AbstractC167017dG.A1R(userSession, jgg);
        this.A00 = jgg;
        boolean A03 = C36A.A03(userSession);
        this.A02 = AbstractC167007dF.A0N(view, R.id.grouping_name);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.cover_photo);
        this.A01 = A0D;
        AbstractC38513GwY.A00(AbstractC37301Gc2.A03(this), AbstractC37302Gc3.A05(this), A0D, A03 ? R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size : R.dimen.alert_dialog_button_cell_height);
    }
}
