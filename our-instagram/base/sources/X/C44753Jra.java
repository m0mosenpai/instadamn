package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igtv.widget.ExpandableTextView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Jra, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44753Jra extends C3OO {
    public final int A00;
    public final int A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final UserSession A05;
    public final IgImageView A06;
    public final C45504KCt A07;
    public final ExpandableTextView A08;
    public final FollowButton A09;
    public final InterfaceC09390do A0A;

    public C44753Jra(View view, UserSession userSession, C45504KCt c45504KCt) {
        super(view);
        this.A05 = userSession;
        this.A07 = c45504KCt;
        IgImageView A0a = AbstractC31172DnG.A0a(view, R.id.profile_picture);
        this.A06 = A0a;
        TextView A0e = AbstractC166987dD.A0e(view, R.id.user_name);
        this.A04 = A0e;
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.user_name_full);
        this.A03 = A0e2;
        ExpandableTextView expandableTextView = (ExpandableTextView) view.findViewById(R.id.series_description);
        this.A08 = expandableTextView;
        this.A02 = view.findViewById(R.id.info_separator);
        this.A09 = (FollowButton) view.findViewById(R.id.follow_button);
        Context context = view.getContext();
        this.A00 = context.getColor(AbstractC53242c7.A0C(context));
        this.A01 = AbstractC31174DnI.A03(context);
        this.A0A = AbstractC09440dt.A01(new C57251PbZ(13, view, this));
        expandableTextView.setTextLayoutHorizontalPadding(AbstractC167017dG.A0F(context));
        expandableTextView.A01 = new C49509LuM(this);
        ViewOnClickListenerC48074LPz.A01(A0e, 68, this);
        ViewOnClickListenerC48074LPz.A01(A0e2, 69, this);
        ViewOnClickListenerC48074LPz.A01(A0a, 70, this);
    }
}
