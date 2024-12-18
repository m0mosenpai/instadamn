package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.2zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66682zl extends AbstractC65632xz implements CallerContextable {
    public static final String __redex_internal_original_name = "FeedEmptyStateBinderGroup";
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC64612wK A02;

    public C66682zl(Context context, UserSession userSession, InterfaceC64612wK interfaceC64612wK) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(interfaceC64612wK, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = interfaceC64612wK;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "FeedEmptyState";
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(0);
        }
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C1571273r c1571273r;
        InterfaceC1571373s c43032J0x;
        int A03 = C0f9.A03(1620831938);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj2, 3);
        Object tag = view.getTag();
        C14360o3.A0C(tag, AbstractC111324zv.A00(2798));
        C153276uw c153276uw = (C153276uw) tag;
        int ordinal = ((Hd8) obj2).ordinal();
        if (ordinal != 2) {
            Resources resources = this.A00.getResources();
            if (ordinal != 1) {
                c1571273r = new C1571273r();
                c1571273r.A02 = R.drawable.nux_main_feed_empty_icon;
                c1571273r.A0D = resources.getString(2131968898);
                c1571273r.A07 = resources.getString(2131968896);
                int i2 = 2131962602;
                if (AbstractC49092Nc.A00(this.A01).A00(CallerContext.A00(C66682zl.class), "ig_feed_empty_state_binder_group")) {
                    i2 = 2131962613;
                }
                c1571273r.A0C = resources.getString(i2);
                c1571273r.A0Q = true;
                c43032J0x = new C43033J0y(this);
            } else {
                c1571273r = new C1571273r();
                if (C18U.A06(C06090Tz.A05, this.A01, 36331171306751178L)) {
                    c1571273r.A02 = R.drawable.instagram_illustrations_product_illustration_pi_plus_favourites;
                    c1571273r.A01 = 0;
                } else {
                    c1571273r.A02 = R.drawable.instagram_star_outline_96;
                }
                c1571273r.A0D = resources.getString(2131968893);
                c1571273r.A07 = resources.getString(2131968892);
                c1571273r.A0C = resources.getString(2131968891);
                c1571273r.A0Q = true;
                c43032J0x = new C43032J0x(this);
            }
            c1571273r.A06 = c43032J0x;
        } else {
            c1571273r = new C1571273r();
            c1571273r.A02 = R.drawable.instagram_crown_outline_96;
            Context context = this.A00;
            c1571273r.A0D = context.getString(2131968890);
            c1571273r.A07 = context.getString(2131968889);
            c1571273r.A0Q = false;
        }
        AbstractC153236ur.A02(c1571273r, c153276uw, EnumC153216up.A02);
        C0f9.A0A(-1889829630, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1413549166);
        C14360o3.A0B(viewGroup, 1);
        View A00 = AbstractC153236ur.A00(this.A00, viewGroup);
        C0f9.A0A(2005656408, A03);
        return A00;
    }
}
