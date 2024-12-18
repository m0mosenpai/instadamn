package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.72p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1568772p {
    public static final int A01(Resources resources, ViewGroup viewGroup, UserSession userSession) {
        int i;
        C14360o3.A0B(resources, 2);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327700973501226L);
        Integer A02 = A02(viewGroup);
        if (A06) {
            int intValue = A02.intValue();
            if (intValue != 0) {
                i = R.dimen.prism_avatar_size_medium_device_variant;
                if (intValue != 1) {
                    i = R.dimen.appreciation_reels_grid_item_width;
                }
            } else {
                i = R.dimen.action_button_min_width;
            }
        } else {
            int intValue2 = A02.intValue();
            if (intValue2 != 0) {
                if (intValue2 != 1) {
                    i = R.dimen.activation_card_icon_container_width;
                    if (intValue2 != 2) {
                        i = R.dimen.profile_header_avatar_size_new;
                    }
                } else {
                    i = R.dimen.abc_list_item_height_material;
                }
            } else {
                i = R.dimen.prism_avatar_size_small_device;
            }
        }
        return resources.getDimensionPixelSize(i);
    }

    public static final int A00(Resources resources, ViewGroup viewGroup) {
        int i;
        boolean A02 = C14640oc.A02();
        Context context = viewGroup.getContext();
        if (A02) {
            C14360o3.A07(context);
            int A06 = AbstractC13880nE.A06(context);
            if (A06 < 667) {
                i = R.dimen.prism_avatar_story_ring_width_small_device;
            } else {
                i = R.dimen.prism_avatar_story_ring_width_large_device;
                if (A06 < 1000) {
                    i = R.dimen.prism_avatar_story_ring_width_medium_device;
                }
            }
            return resources.getDimensionPixelSize(i);
        }
        C14360o3.A07(context);
        return (int) AbstractC13880nE.A00(context, 2.5f);
    }

    public static final Integer A02(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        int A06 = AbstractC13880nE.A06(context);
        if (!C14640oc.A02()) {
            return C05F.A0N;
        }
        if (A06 < 667) {
            return C05F.A00;
        }
        if (A06 < 1000) {
            return C05F.A01;
        }
        return C05F.A0C;
    }
}
