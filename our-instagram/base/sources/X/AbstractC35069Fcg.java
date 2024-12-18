package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Fcg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35069Fcg {
    public static final C89553yv A00(Context context, User user) {
        C14360o3.A0B(user, 1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
        ArrayList A1E = AbstractC166987dD.A1E();
        Drawable drawable = context.getDrawable(R.drawable.ig_illustrations_illo_subscriber_crown);
        if (drawable != null) {
            A1E.add(drawable);
        }
        A1E.add(new C89533yt(user.Bhu(), null, dimensionPixelSize, C1H4.A01(AbstractC13880nE.A04(context, 14)), 0, 0));
        return new C89553yv(context, C05F.A00, A1E, 0.4f, dimensionPixelSize, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (A02(r0, r6) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r14, android.view.View r15, com.instagram.common.session.UserSession r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35069Fcg.A01(android.content.Context, android.view.View, com.instagram.common.session.UserSession, boolean):void");
    }

    public static final boolean A02(ProductType productType, C143436di c143436di) {
        long currentTimeMillis;
        long A03;
        int ordinal = productType.ordinal();
        if (ordinal != 13) {
            if (ordinal != 1) {
                if (ordinal != 9) {
                    return false;
                }
                InterfaceC19630xq interfaceC19630xq = c143436di.A01;
                if (interfaceC19630xq.getInt("exclusive_content_animation_story_count", 0) >= 3) {
                    return false;
                }
                currentTimeMillis = System.currentTimeMillis();
                A03 = AbstractC31175DnJ.A03(interfaceC19630xq, "exclusive_content_animation_story_timestamp");
            } else {
                InterfaceC19630xq interfaceC19630xq2 = c143436di.A01;
                if (interfaceC19630xq2.getInt("exclusive_content_animation_post_count", 0) >= 3) {
                    return false;
                }
                currentTimeMillis = System.currentTimeMillis();
                A03 = AbstractC31175DnJ.A03(interfaceC19630xq2, "exclusive_content_animation_post_timestamp");
            }
        } else {
            InterfaceC19630xq interfaceC19630xq3 = c143436di.A01;
            if (interfaceC19630xq3.getInt("exclusive_content_animation_tall_video_count", 0) >= 3) {
                return false;
            }
            currentTimeMillis = System.currentTimeMillis();
            A03 = AbstractC31175DnJ.A03(interfaceC19630xq3, "exclusive_content_animation_tall_video_timestamp");
        }
        if (currentTimeMillis - A03 <= TimeUnit.DAYS.toMillis(1L)) {
            return false;
        }
        return true;
    }
}
