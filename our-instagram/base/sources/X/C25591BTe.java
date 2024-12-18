package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BTe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25591BTe {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;

    public C25591BTe(View view, UserSession userSession) {
        ImageView imageView = (ImageView) view.requireViewById(R.id.row_profile_header_empty_profile_notice_icon);
        ImageView imageView2 = (ImageView) view.requireViewById(R.id.row_profile_header_empty_profile_notice_icon_updated);
        if (C18U.A06(C06090Tz.A05, userSession, 36329620823359936L)) {
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            this.A00 = imageView2;
        } else {
            this.A00 = imageView;
        }
        this.A03 = AbstractC166997dE.A0T(view, R.id.row_profile_header_empty_profile_notice_title);
        this.A02 = AbstractC166997dE.A0T(view, R.id.row_profile_header_empty_profile_notice_subtitle);
        this.A01 = (LinearLayout) view.requireViewById(R.id.row_profile_header_empty_profile_notice_container);
    }
}
