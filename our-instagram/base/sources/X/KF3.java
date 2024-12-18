package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class KF3 extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new IgImageView(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        ImageView imageView = (ImageView) view;
        AbstractC167027dH.A12(imageView, c6fg, c102884kP);
        Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
        A06.getClass();
        C47213Ktm c47213Ktm = (C47213Ktm) A06;
        C58652mO c58652mO = c47213Ktm.A00;
        if (c58652mO == null) {
            c58652mO = (C58652mO) c6fg.A00.getDrawable(R.drawable.civic_engagement_constituent_nux_ig_qp_ballot_box_animation_v2);
            c47213Ktm.A00 = c58652mO;
        }
        imageView.setImageDrawable(c58652mO);
        if (c58652mO != null) {
            c58652mO.EH1();
            c58652mO.E4S();
            return null;
        }
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ImageView imageView = (ImageView) view;
        AbstractC167027dH.A12(imageView, c6fg, c102884kP);
        Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
        A06.getClass();
        C58652mO c58652mO = ((C47213Ktm) A06).A00;
        if (c58652mO != null) {
            c58652mO.pause();
        }
        imageView.setImageDrawable(null);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }
}
