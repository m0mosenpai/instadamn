package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.5pA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127325pA {
    public static final C9B2 A00(Context context, UserSession userSession, C3G2 c3g2) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        float A00;
        float f;
        float f2;
        Resources resources = context.getResources();
        int ordinal = c3g2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 72 && ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
            } else {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession, 36324222049660912L)) {
                    boolean A06 = C18U.A06(c06090Tz, userSession, 36324222050185206L);
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.clips_netego_card_width);
                    if (A06) {
                        f = dimensionPixelSize;
                        f2 = 1.776f;
                        A00 = f * f2;
                        dimensionPixelSize2 = (int) A00;
                    } else {
                        A00 = AbstractC13890nF.A00(context) / (AbstractC13890nF.A01(context) / dimensionPixelSize);
                        dimensionPixelSize2 = (int) A00;
                    }
                }
            }
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.alt_text_carousel_card_width);
            f = dimensionPixelSize;
            f2 = 1.7777778f;
            A00 = f * f2;
            dimensionPixelSize2 = (int) A00;
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ai_agent_embodiment_video_container_size);
        }
        return new C9B2(dimensionPixelSize, dimensionPixelSize2, 4);
    }
}
