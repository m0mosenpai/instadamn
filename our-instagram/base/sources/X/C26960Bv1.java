package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Bv1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26960Bv1 extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C34487FHz A02;

    public C26960Bv1(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C34487FHz c34487FHz) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = c34487FHz;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C26026BfF c26026BfF = (C26026BfF) obj;
        C14360o3.A0B(anonymousClass306, 0);
        if (c26026BfF != null && c26026BfF.A00 > 0) {
            if (C18U.A06(C06090Tz.A05, this.A01, 36329376010289461L)) {
                anonymousClass306.A7a(0);
            }
        }
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        C25940Bdh c25940Bdh;
        C26026BfF c26026BfF;
        String string;
        long j;
        Long A0j;
        int A0G = AbstractC25231BEo.A0G(view, 527761703);
        Object tag = view.getTag();
        if ((tag instanceof C25940Bdh) && (c25940Bdh = (C25940Bdh) tag) != null) {
            if ((obj instanceof C26026BfF) && (c26026BfF = (C26026BfF) obj) != null) {
                view.setVisibility(0);
                GradientSpinnerAvatarView gradientSpinnerAvatarView = c25940Bdh.A04;
                Context A0L = AbstractC166997dE.A0L(view);
                gradientSpinnerAvatarView.setAvatarViewDrawable(A0L.getDrawable(R.drawable.instagram_app_threads_pano_outline_24));
                gradientSpinnerAvatarView.setScaleType(ImageView.ScaleType.CENTER);
                gradientSpinnerAvatarView.setVisibility(0);
                c25940Bdh.A00.setVisibility(0);
                IgTextView igTextView = c25940Bdh.A02;
                UserSession userSession = this.A01;
                if (C18U.A06(C06090Tz.A05, userSession, 36329376010420534L)) {
                    int i3 = c26026BfF.A00;
                    string = A0L.getResources().getQuantityString(R.plurals.unified_feedback_likes_on_threads, i3, C84963qk.A04(AbstractC166997dE.A0M(A0L), Integer.valueOf(i3), 10000, false, false));
                } else {
                    string = A0L.getString(2131976112);
                }
                C14360o3.A07(string);
                igTextView.setText(string);
                igTextView.setVisibility(0);
                IgTextView igTextView2 = c25940Bdh.A03;
                igTextView2.setText(AbstractC166997dE.A0p(A0L, 2131976113));
                igTextView2.setVisibility(0);
                c25940Bdh.A01.setVisibility(8);
                ViewOnClickListenerC28668ClG.A02(view, 36, c26026BfF, this);
                C8V c8v = C8V.FEED;
                InterfaceC11380iw interfaceC11380iw = this.A00;
                AbstractC167007dF.A1F(userSession, 0, interfaceC11380iw);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "cross_app_feedback_impression");
                if (A0f.isSampled()) {
                    A0f.AAP("feedback_surface", "IG_PRODUCER_PLAYS_AND_LIKES_ROW");
                    String str = c26026BfF.A01;
                    if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                        j = A0j.longValue();
                    } else {
                        j = 0;
                    }
                    AbstractC25225BEi.A1N(A0f, AbstractC25234BEr.A0e(c8v, A0f, j));
                    A0f.A9K("th_reaction_count", Long.valueOf(c26026BfF.A00));
                    A0f.Cht();
                }
                i2 = -374384239;
            } else {
                i2 = 141841995;
            }
        } else {
            i2 = -518733220;
        }
        C0f9.A0A(i2, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        int i2;
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1643717669);
        if (i == 0) {
            view = AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.feedback_from_facebook_likes_list_row, false);
            view.setTag(new C25940Bdh(view));
            AbstractC56952jT.A01(view);
            i2 = -506955658;
        } else {
            view = null;
            i2 = -1681459314;
        }
        C0f9.A0A(i2, A0G);
        return view;
    }
}
