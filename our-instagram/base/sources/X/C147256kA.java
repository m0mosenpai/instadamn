package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.6kA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147256kA implements InterfaceC147266kB {
    public C3Vd A00;
    public final Context A01;
    public final ViewGroup A02;
    public final UserSession A03;
    public final ReboundViewPager A04;
    public final C146226iL A05;

    public C147256kA(View view, UserSession userSession, C146226iL c146226iL) {
        C14360o3.A0B(c146226iL, 1);
        C14360o3.A0B(view, 2);
        C14360o3.A0B(userSession, 3);
        this.A05 = c146226iL;
        this.A03 = userSession;
        View requireViewById = view.requireViewById(R.id.view_pager);
        C14360o3.A07(requireViewById);
        ViewStub viewStub = (ViewStub) requireViewById;
        viewStub.setLayoutResource(R.layout.layout_reel_viewer_rebound_viewpager);
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager");
        ReboundViewPager reboundViewPager = (ReboundViewPager) inflate;
        this.A04 = reboundViewPager;
        if (C18U.A06(C06090Tz.A05, userSession, 36328160534674703L)) {
            reboundViewPager.A0S = true;
        }
        Context context = reboundViewPager.getContext();
        C14360o3.A07(context);
        this.A01 = context;
        this.A02 = reboundViewPager;
    }

    @Override // X.InterfaceC147266kB
    public final void A95(InterfaceC62892tS interfaceC62892tS) {
        C14360o3.A0B(interfaceC62892tS, 0);
        this.A04.A0P(interfaceC62892tS);
    }

    @Override // X.InterfaceC147266kB
    public final boolean Ca0() {
        if (this.A04.A0O == C3VZ.A03) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC147266kB
    public final void ELH(InterfaceC16660sJ interfaceC16660sJ) {
        View view = this.A04.A0F;
        if (view != null) {
            interfaceC16660sJ.invoke(view);
        }
    }

    @Override // X.InterfaceC147266kB
    public final boolean isIdle() {
        if (this.A04.A0O != C3VZ.A03) {
            return false;
        }
        return true;
    }
}
