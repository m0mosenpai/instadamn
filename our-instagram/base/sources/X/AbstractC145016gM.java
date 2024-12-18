package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6gM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC145016gM {
    public static void A04(Activity activity, UserSession userSession, boolean z) {
        A02(activity, null, userSession, false, z);
    }

    public static void A05(Activity activity, UserSession userSession, boolean z) {
        A03(activity, null, userSession, false, z);
    }

    public static void A00(final Activity activity, final int i) {
        C57982lB.A0B.A05(activity, new Runnable() { // from class: X.MaH
            @Override // java.lang.Runnable
            public final void run() {
                Activity activity2 = activity;
                int i2 = i;
                View findViewById = activity2.findViewById(R.id.layout_container_center_right_coordinator_layout);
                if (findViewById != null) {
                    findViewById.setBackgroundColor(i2);
                }
            }
        });
    }

    public static void A02(final Activity activity, Fragment fragment, UserSession userSession, boolean z, boolean z2) {
        if (z) {
            C14360o3.A0B(activity, 0);
            View findViewById = activity.findViewById(R.id.tab_bar);
            View findViewById2 = activity.findViewById(R.id.ls_nav_bar);
            if (findViewById != null) {
                findViewById.setBackgroundColor(activity.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_primary_background)));
            }
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(activity.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_primary_background)));
            }
            View findViewById3 = activity.findViewById(R.id.tab_bar_shadow);
            View findViewById4 = activity.findViewById(R.id.ls_nav_bar_shadow);
            if (findViewById3 != null) {
                findViewById3.setBackgroundColor(activity.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_separator)));
            }
            if (findViewById4 != null) {
                findViewById4.setBackgroundColor(activity.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_separator)));
            }
            AbstractC57322k7.A03(activity, userSession);
        }
        final int color = activity.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_primary_background));
        C30D.A04(activity, color);
        C30D.A06(activity, true);
        Window window = activity.getWindow();
        window.getClass();
        final View decorView = window.getDecorView();
        if (z2) {
            AbstractC56402iY.A07(decorView, window, true);
            decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: X.LQN
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i) {
                    View view = decorView;
                    Activity activity2 = activity;
                    int i2 = color;
                    if ((i & 4) == 0) {
                        view.setOnSystemUiVisibilityChangeListener(null);
                        if (AbstractC145016gM.A06(activity2)) {
                            view.setBackgroundColor(i2);
                        } else {
                            AbstractC145016gM.A00(activity2, 0);
                        }
                    }
                }
            });
        } else {
            if (A06(activity)) {
                decorView.setBackgroundColor(color);
            } else {
                A00(activity, 0);
            }
            AbstractC56402iY.A04(activity, fragment, color, false);
        }
    }

    public static void A01(Activity activity, Fragment fragment, UserSession userSession, int i, boolean z, boolean z2, boolean z3) {
        Context A01 = AbstractC53172bz.A01(activity);
        int color = A01.getColor(AbstractC53242c7.A0H(A01, R.attr.igds_color_primary_background));
        if (z) {
            int A0H = AbstractC53242c7.A0H(activity, R.attr.igds_color_clips_tab_bar_background);
            int A0H2 = AbstractC53242c7.A0H(activity, R.attr.igds_color_reels_tab_bar_separator);
            View findViewById = activity.findViewById(R.id.tab_bar);
            View findViewById2 = activity.findViewById(R.id.ls_nav_bar);
            if (findViewById != null) {
                findViewById.setBackgroundColor(activity.getColor(A0H));
            }
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(activity.getColor(A0H));
            }
            View findViewById3 = activity.findViewById(R.id.tab_bar_shadow);
            View findViewById4 = activity.findViewById(R.id.ls_nav_bar_shadow);
            if (findViewById3 != null) {
                findViewById3.setBackgroundColor(activity.getColor(A0H2));
            }
            if (findViewById4 != null) {
                findViewById4.setBackgroundColor(activity.getColor(A0H2));
            }
            AbstractC57322k7.A05(activity, userSession, i);
        }
        C30D.A04(activity, color);
        C30D.A06(activity, false);
        Window window = activity.getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        if (A06(activity)) {
            decorView.setBackgroundColor(color);
        } else {
            A00(activity, color);
        }
        if (z2) {
            AbstractC56402iY.A07(decorView, window, false);
            return;
        }
        if (!AbstractC56402iY.A0B(decorView, window)) {
            AbstractC56402iY.A07(decorView, window, true);
        }
        if (z3) {
            return;
        }
        AbstractC56402iY.A04(activity, fragment, color, true);
    }

    public static void A03(Activity activity, Fragment fragment, UserSession userSession, boolean z, boolean z2) {
        A01(activity, fragment, userSession, AbstractC53242c7.A0H(activity, R.attr.igds_color_clips_tab_bar_icon), z, z2, false);
    }

    public static boolean A06(Activity activity) {
        if (AbstractC13180m4.A02(activity) && activity.findViewById(R.id.swipe_navigation_container) != null) {
            return false;
        }
        return true;
    }
}
