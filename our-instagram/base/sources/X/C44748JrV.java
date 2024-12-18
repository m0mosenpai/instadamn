package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.JrV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44748JrV extends C3OO {
    public final UserSession A00;
    public final IgSimpleImageView A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44748JrV(View view, UserSession userSession) {
        super(view);
        AbstractC167017dG.A1P(view, userSession);
        this.A00 = userSession;
        this.A07 = C18U.A06(C06090Tz.A05, userSession, 36321722382034705L);
        this.A02 = (IgSimpleImageView) view.findViewById(R.id.friend_map_update_row_note);
        this.A06 = AbstractC31172DnG.A0Y(view, R.id.friend_map_update_row_header_title);
        this.A01 = (IgSimpleImageView) view.findViewById(R.id.friend_map_update_direction_arrow);
        this.A03 = AbstractC31172DnG.A0Y(view, R.id.friend_map_update_distance);
        this.A05 = AbstractC31172DnG.A0Y(view, R.id.friend_map_update_row_subtitle);
        this.A04 = AbstractC31172DnG.A0Y(view, R.id.friend_map_update_row_header_updates_badge);
    }
}
