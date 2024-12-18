package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2k7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC57322k7 {
    public static final int A00(Activity activity) {
        View findViewById = activity.findViewById(R.id.tab_bar);
        if (findViewById != null) {
            return findViewById.getMeasuredHeight();
        }
        return 0;
    }

    public static final void A03(Activity activity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        Iterator it = A02(activity).iterator();
        while (it.hasNext()) {
            ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) it.next();
            int color = activity.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_primary_icon));
            colorFilterAlphaImageView.setActiveColor(color);
            if (!C18U.A06(C06090Tz.A05, userSession, 36315537626369396L)) {
                colorFilterAlphaImageView.setNormalColor(color);
            }
        }
    }

    public static final void A05(Activity activity, UserSession userSession, int i) {
        C14360o3.A0B(userSession, 1);
        ArrayList A02 = A02(activity);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36315537626369396L)) {
            i = R.color.barcelona_story_share_light_mode;
        }
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) it.next();
            int color = activity.getColor(i);
            colorFilterAlphaImageView.setActiveColor(color);
            if (!C18U.A06(c06090Tz, userSession, 36315537626369396L)) {
                colorFilterAlphaImageView.setNormalColor(color);
            }
        }
    }

    public static final int A01(UserSession userSession) {
        if (!C18U.A06(C06090Tz.A05, userSession, 36322980805225272L)) {
            return R.attr.tabBarHeight;
        }
        return R.attr.tabBarHeightStandardized;
    }

    public static final ArrayList A02(Activity activity) {
        View findViewById;
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.tab_bar);
        ViewGroup viewGroup2 = (ViewGroup) activity.findViewById(R.id.ls_nav_bar);
        int i = 0;
        if (viewGroup != null && viewGroup.getChildCount() != 0) {
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.findViewById(R.id.tab_icon_stub) == null && (findViewById = childAt.findViewById(R.id.tab_icon)) != null) {
                    arrayList.add(findViewById);
                }
                i++;
            }
        } else if (viewGroup2 != null && viewGroup2.getChildCount() != 0) {
            int childCount2 = viewGroup2.getChildCount();
            while (i < childCount2) {
                View findViewById2 = viewGroup2.getChildAt(i).findViewById(R.id.tab_icon);
                if (findViewById2 != null) {
                    arrayList.add(findViewById2);
                }
                i++;
            }
        }
        return arrayList;
    }

    public static final void A04(Activity activity, UserSession userSession) {
        ViewGroup.LayoutParams layoutParams;
        int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(AbstractC53242c7.A0H(activity, A01(userSession)));
        Iterator it = AbstractC16960so.A1Q(activity.findViewById(R.id.qe_tool_overlay_stub), activity.findViewById(R.id.network_shaping_stub)).iterator();
        while (true) {
            ViewGroup.LayoutParams layoutParams2 = null;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            if (view != null) {
                layoutParams2 = view.getLayoutParams();
            }
            C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = dimensionPixelOffset;
            }
            if (view != null) {
                view.setLayoutParams(marginLayoutParams);
            }
        }
        for (View view2 : AbstractC16960so.A1Q(activity.findViewById(R.id.tab_bar), activity.findViewById(R.id.tab_button_count), activity.findViewById(R.id.tab_button_badge))) {
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = dimensionPixelOffset;
                }
                view2.setLayoutParams(layoutParams3);
            }
        }
        for (View view3 : AbstractC16960so.A1Q(activity.findViewById(R.id.layout_bottom_searchbar), activity.findViewById(R.id.layout_container_main), activity.findViewById(R.id.tab_bar_shadow), activity.findViewById(R.id.whitehat_indicator_stub), activity.findViewById(R.id.devserver_indicator_stub))) {
            if (view3 != null) {
                layoutParams = view3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = dimensionPixelOffset;
            }
            if (view3 != null) {
                view3.setLayoutParams(marginLayoutParams2);
            }
        }
    }
}
