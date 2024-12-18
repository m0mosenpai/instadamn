package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicSearchPlaylist;

/* loaded from: classes7.dex */
public final class HMS extends AbstractC38513GwY {
    public final JGI A00;
    public final ImageView A01;
    public final TextView A02;

    public final void A03(MusicSearchPlaylist musicSearchPlaylist) {
        C14360o3.A0B(musicSearchPlaylist, 0);
        this.A02.setText(musicSearchPlaylist.A00().getTitle());
        AbstractC38055Goi.A00(this.A01, musicSearchPlaylist.A00().BEx(), null);
        ViewOnClickListenerC42034Ik3.A00(this.itemView, 30, musicSearchPlaylist, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMS(View view, UserSession userSession, JGI jgi) {
        super(view);
        AbstractC167017dG.A1R(userSession, jgi);
        this.A00 = jgi;
        boolean A03 = C36A.A03(userSession);
        this.A02 = AbstractC167007dF.A0N(view, R.id.grouping_name);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.cover_photo);
        this.A01 = A0D;
        AbstractC38513GwY.A00(AbstractC37301Gc2.A03(this), AbstractC37302Gc3.A05(this), A0D, A03 ? R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size : R.dimen.alert_dialog_button_cell_height);
    }
}
