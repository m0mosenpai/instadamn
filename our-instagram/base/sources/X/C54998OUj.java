package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.OUj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54998OUj {
    public static final int A00(UserSession userSession, ClipInfo clipInfo) {
        return Math.max(Math.min((int) Math.ceil(clipInfo.A0A / 1000.0d), (int) C36J.A06(C36G.A09, AbstractC54246NyR.A00(userSession))), 15);
    }

    public final double A01(Context context, UserSession userSession, ClipInfo clipInfo) {
        AbstractC167017dG.A1P(clipInfo, userSession);
        float A00 = A00(userSession, clipInfo);
        float f = (float) clipInfo.A0A;
        return (AbstractC13880nE.A0A(context) - (AbstractC166997dE.A0M(context).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2)) / (A00 / (f / (AbstractC166987dD.A0B(8.0f, f / (A00(userSession, clipInfo) * 1000.0f)) * 1000.0f)));
    }
}
