package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LH0 {
    public static final int A00(Context context, UserSession userSession) {
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36319355851578569L);
        Resources resources = context.getResources();
        int i = R.dimen.add_to_story_dual_destination_share_sheet_story_row_height;
        if (A06) {
            i = R.dimen.audio_translations_language_list_cell_row_height;
        }
        return resources.getDimensionPixelSize(i);
    }

    public static final int A01(Context context, UserSession userSession) {
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36319355851578569L);
        Resources resources = context.getResources();
        int i = R.dimen.abc_button_inset_vertical_material;
        if (A06) {
            i = R.dimen.audience_lists_text_in_badge_horizontal_margin_right;
        }
        return resources.getDimensionPixelSize(i);
    }

    public static final int A02(Context context, UserSession userSession) {
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36319355851578569L);
        Resources resources = context.getResources();
        int i = R.dimen.abc_alert_dialog_button_dimen;
        if (A06) {
            i = R.dimen.action_bar_plus_shadow_height;
        }
        return resources.getDimensionPixelSize(i);
    }
}
