package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class KF2 extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new IgImageView(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        Context context;
        int i;
        ImageView imageView = (ImageView) view;
        boolean A1b = AbstractC25233BEq.A1b(imageView, c6fg, c102884kP);
        Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
        A06.getClass();
        C47212Ktl c47212Ktl = (C47212Ktl) A06;
        C58652mO c58652mO = c47212Ktl.A00;
        String A0E = c102884kP.A0E();
        if (c58652mO == null) {
            if (A0E != null) {
                int hashCode = A0E.hashCode();
                if (hashCode != 330418449) {
                    if (hashCode != 1752071467) {
                        if (hashCode == 1895067328 && A0E.equals("ig-qp-meta-ai-donut-spin-animation")) {
                            context = c6fg.A00;
                            i = R.drawable.meta_ai_animations_conversion_kf_mai_100dp_ambientspin;
                            c58652mO = (C58652mO) context.getDrawable(i);
                            c47212Ktl.A00 = c58652mO;
                        }
                    } else if (A0E.equals("ig-qp-meta-ai-donut-flip-animation")) {
                        context = c6fg.A00;
                        i = R.drawable.meta_ai_animations_conversion_kf_mai_100p_flip;
                        c58652mO = (C58652mO) context.getDrawable(i);
                        c47212Ktl.A00 = c58652mO;
                    }
                } else if (A0E.equals("ig-qp-ballot-box-animation-v2")) {
                    context = c6fg.A00;
                    i = R.drawable.civic_engagement_constituent_nux_ig_qp_ballot_box_animation_v2;
                    c58652mO = (C58652mO) context.getDrawable(i);
                    c47212Ktl.A00 = c58652mO;
                }
            }
            return null;
        }
        imageView.setImageDrawable(c58652mO);
        if (A0E != null && A0E.equals("ig-qp-meta-ai-donut-flip-animation")) {
            if (c58652mO != null) {
                c58652mO.EH0(A1b ? 1 : 0);
                c58652mO.E4S();
            }
        } else if (c58652mO != null) {
            c58652mO.EH1();
            c58652mO.E4S();
        }
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ImageView imageView = (ImageView) view;
        AbstractC167027dH.A12(imageView, c6fg, c102884kP);
        Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
        A06.getClass();
        C58652mO c58652mO = ((C47212Ktl) A06).A00;
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
