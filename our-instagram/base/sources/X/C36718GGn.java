package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.GGn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36718GGn implements InterfaceC125355lh {
    public final /* synthetic */ long A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ IgFrameLayout A03;
    public final /* synthetic */ C3B1 A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C36718GGn(View view, View view2, IgFrameLayout igFrameLayout, C3B1 c3b1, long j, boolean z, boolean z2) {
        this.A04 = c3b1;
        this.A02 = view;
        this.A01 = view2;
        this.A06 = z;
        this.A00 = j;
        this.A03 = igFrameLayout;
        this.A05 = z2;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        View view;
        C3B1 c3b1 = this.A04;
        if (c3b1.A09) {
            view = this.A02.findViewById(R.id.group_story_peek_layout);
        } else {
            view = this.A01;
        }
        if (this.A06 && view != null) {
            C5SU A0f = AbstractC167017dG.A0f(c3b1.A03, c3b1.A04.getResources().getString(2131954742));
            A0f.A03(view);
            A0f.A01();
            A0f.A00 = (int) (1000 * this.A00);
            A0f.A0A = true;
            C5SW A00 = A0f.A00();
            UserSession userSession = c3b1.A06;
            A00.A07(userSession);
            InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
            A0e.E77("has_seen_group_stories_peek_nux_tooltip", true);
            A0e.apply();
        }
        View view2 = this.A01;
        IgFrameLayout igFrameLayout = this.A03;
        View view3 = this.A02;
        C0fQ.A00(new ViewOnClickListenerC35617Fo8(1, view2, view3, igFrameLayout, c3b1, this.A05), view2);
        view3.postDelayed(new GQU(view2, view3, igFrameLayout, c3b1), 1000 * this.A00);
    }
}
