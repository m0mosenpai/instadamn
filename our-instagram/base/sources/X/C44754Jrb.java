package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jrb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44754Jrb extends C3OO {
    public String A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final UserSession A09;
    public final IgImageView A0A;
    public final C45504KCt A0B;

    public C44754Jrb(View view, UserSession userSession, C45504KCt c45504KCt) {
        super(view);
        this.A09 = userSession;
        this.A0B = c45504KCt;
        this.A0A = AbstractC31172DnG.A0a(view, R.id.episode_thumbnail);
        this.A05 = AbstractC166987dD.A0e(view, R.id.episode_duration);
        this.A06 = AbstractC166987dD.A0e(view, R.id.episode_name);
        this.A04 = AbstractC166987dD.A0e(view, R.id.creator_name);
        this.A08 = AbstractC166987dD.A0e(view, R.id.view_count);
        this.A02 = view.findViewById(R.id.separator);
        this.A07 = AbstractC166987dD.A0e(view, R.id.uploaded_ago);
        this.A03 = (FrameLayout) view.findViewById(R.id.episode_media);
        View findViewById = view.findViewById(R.id.hidden_media_stub);
        C14360o3.A0C(findViewById, AbstractC111324zv.A00(13));
        this.A01 = AbstractC56372iV.A00(findViewById).getView();
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A02 = 0.95f;
        A0s.A07 = true;
        A0s.A04 = new C52374NFq(this, 22);
        A0s.A00();
    }
}
