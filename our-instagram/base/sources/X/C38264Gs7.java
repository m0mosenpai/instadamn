package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.feed.widget.IgProgressImageViewProgressBar;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Gs7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38264Gs7 implements InterfaceC37188GZz {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public ImageView A0B;
    public TextView A0C;
    public IgFrameLayout A0D;
    public IgProgressImageViewProgressBar A0E;
    public Reel A0F;
    public C41181vS A0G;
    public C41551w4 A0H;
    public ReelViewerConfig A0I;
    public C3G2 A0J;
    public InterfaceC55362gb A0K;
    public C52672NRt A0L;
    public C81423kC A0M;
    public C66082yk A0N;
    public ReelDashboardFragment A0O;
    public String A0P;
    public boolean A0Q;
    public final int A0R;
    public final View A0S;
    public final View A0T;
    public final View A0U;
    public final ViewStub A0V;
    public final ViewStub A0W;
    public final ViewStub A0X;
    public final ViewStub A0Y;
    public final ViewStub A0Z;
    public final ViewStub A0a;
    public final ViewStub A0b;
    public final ViewStub A0c;
    public final ViewStub A0d;
    public final ViewStub A0e;
    public final TextView A0f;
    public final C57012jc A0g;
    public final C3FQ A0h;
    public final C31543DtT A0i;
    public final IJR A0j;
    public final C37986GnW A0k;

    public final void A00(UserSession userSession, boolean z) {
        C41181vS c41181vS = this.A0G;
        c41181vS.getClass();
        if (!c41181vS.A1Z()) {
            this.A0U.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            ImageView imageView = this.A0B;
            if (imageView != null) {
                Context context = imageView.getContext();
                int i = R.attr.igds_color_primary_icon;
                if (z) {
                    i = R.attr.igds_color_primary_button;
                }
                AbstractC31173DnH.A11(imageView.getContext(), imageView, AbstractC53242c7.A0H(context, i));
                imageView.setActivated(z);
            }
            this.A0f.setActivated(!z);
            if (z) {
                C38262Gs5.A05(this);
                AbstractC13880nE.A0O(this.A0h.CFj());
            } else {
                C38262Gs5.A04(userSession, this.A0F, this.A0I, this.A0J, this, this.A0O);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C38264Gs7(View view, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ReelDashboardFragment reelDashboardFragment, boolean z, boolean z2) {
        int i;
        this.A0S = view.requireViewById(R.id.dashboard_container);
        this.A0T = view.requireViewById(R.id.delete_button);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.views_textview);
        this.A0f = A0T;
        this.A0Q = z2;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean booleanValue = AbstractC166997dE.A0c(c06090Tz, userSession, 36322465407838464L).booleanValue();
        Context context = A0T.getContext();
        int i2 = booleanValue ? R.drawable.viewers_tab_eye_icon : R.drawable.viewers_icon;
        int A07 = AbstractC53242c7.A07(context);
        Paint paint = C3LQ.A00;
        C14360o3.A0B(context, 0);
        A0T.setCompoundDrawablesWithIntrinsicBounds(C3LQ.A09(context, new int[]{i2, i2}, new int[]{R.color.badge_color, A07}, new int[][]{new int[]{android.R.attr.state_activated}, new int[0]}), (Drawable) null, (Drawable) null, (Drawable) null);
        this.A0R = (int) (view.getResources().getDisplayMetrics().density * 4.0f);
        this.A0c = AbstractC31173DnH.A0G(view, R.id.qp_megaphone_stub);
        this.A0Z = AbstractC31173DnH.A0G(view, R.id.no_views_stub);
        this.A0d = AbstractC31173DnH.A0G(view, R.id.retry_upload_stub);
        C31543DtT c31543DtT = new C31543DtT(abstractC59962oe, userSession, this);
        this.A0i = c31543DtT;
        C57112jm A0E = AbstractC37301Gc2.A0E();
        boolean A06 = C18U.A06(c06090Tz, userSession, 36311753759458053L);
        InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) abstractC59962oe;
        C148426mC c148426mC = new C148426mC(new C675432t(userSession, interfaceC60442pS, null), userSession, A0E, interfaceC60442pS, null, null);
        CallerContext callerContext = C37986GnW.A11;
        Context context2 = view.getContext();
        C37986GnW c37986GnW = new C37986GnW(context2, abstractC59962oe, interfaceC11380iw, userSession, A0E, c148426mC, c31543DtT, reelDashboardFragment, z, A06);
        this.A0k = c37986GnW;
        ViewStub A0G = AbstractC31173DnH.A0G(view, R.id.menu);
        if (z) {
            A0G.setLayoutResource(R.layout.layout_recyclerview);
        }
        C3FQ A00 = C3FN.A00((ViewGroup) A0G.inflate());
        this.A0h = A00;
        if (z) {
            AbstractC31174DnI.A15(context2, (RecyclerView) A00.CFj());
        }
        A00.EPJ(c37986GnW);
        A00.AI0();
        A00.AAJ(c31543DtT);
        A00.CFj().setSaveFromParentEnabled(false);
        A0E.A06(A00.CFj(), new ViewOnAttachStateChangeListenerC56972jY(view));
        this.A0e = AbstractC31173DnH.A0G(view, R.id.uploading_stub);
        this.A0X = AbstractC31173DnH.A0G(view, R.id.delete_stub);
        this.A0Y = AbstractC31173DnH.A0G(view, R.id.insights_button_stub);
        this.A0b = AbstractC31173DnH.A0G(view, R.id.promote_button_stub);
        View requireViewById = view.requireViewById(R.id.insights_fragment_container);
        this.A0U = requireViewById;
        this.A0W = AbstractC31173DnH.A0G(view, R.id.close_friends_badge_stub);
        this.A0a = AbstractC31173DnH.A0G(view, R.id.opal_badge_stub);
        this.A0V = AbstractC31173DnH.A0G(view, R.id.campfire_badge_stub);
        this.A0g = AbstractC31177DnL.A0U(view, R.id.dashboard_footer_stub);
        this.A0j = new IJR(AbstractC31173DnH.A0G(view, R.id.call_to_action_stub));
        int i3 = C38262Gs5.A0H;
        C38262Gs5.A0H = i3 + 1;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            C0w9.A03(C38262Gs5.__redex_internal_original_name, AnonymousClass001.A0c("Setting id for Insights container [", "]", 5));
                            i = R.id.story_insights_holder_6;
                        } else {
                            C0w9.A03(C38262Gs5.__redex_internal_original_name, AnonymousClass001.A0c("Setting id for Insights container [", "]", 4));
                            i = R.id.story_insights_holder_5;
                        }
                    } else {
                        C0w9.A03(C38262Gs5.__redex_internal_original_name, AnonymousClass001.A0c("Setting id for Insights container [", "]", 3));
                        i = R.id.story_insights_holder_4;
                    }
                } else {
                    i = R.id.story_insights_holder_3;
                }
            } else {
                i = R.id.story_insights_holder_2;
            }
        } else {
            i = R.id.story_insights_holder_1;
        }
        requireViewById.setId(i);
    }

    @Override // X.InterfaceC37188GZz
    public final boolean CL7() {
        return !this.A0k.isEmpty();
    }

    @Override // X.InterfaceC37188GZz
    public final void Chd() {
        ReelDashboardFragment reelDashboardFragment = this.A0O;
        reelDashboardFragment.getClass();
        String str = this.A0P;
        String str2 = this.A0i.A00;
        C41181vS c41181vS = this.A0G;
        c41181vS.getClass();
        boolean z = c41181vS.A0N;
        C41181vS c41181vS2 = this.A0G;
        c41181vS2.getClass();
        boolean A0r = c41181vS2.A0r();
        if (z) {
            ReelDashboardFragment.A08(new C43075J2p(reelDashboardFragment, str), reelDashboardFragment, str, str2, false);
        } else {
            ReelDashboardFragment.A09(new C43077J2r(reelDashboardFragment, str), reelDashboardFragment, str, str2, false, A0r, false);
        }
    }

    @Override // X.InterfaceC37188GZz
    public final void Dit() {
        ReelDashboardFragment reelDashboardFragment;
        if (this.A0Q && (reelDashboardFragment = this.A0O) != null) {
            reelDashboardFragment.A0H();
        }
    }
}
