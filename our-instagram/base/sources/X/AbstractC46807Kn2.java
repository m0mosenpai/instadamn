package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Kn2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46807Kn2 {
    public static final void A00(Context context, UserSession userSession, C7QV c7qv, ArrayList arrayList) {
        if (c7qv.A0Z) {
            JQ0.A1L(C05F.A0N, AbstractC166997dE.A0p(context, 2131960355), arrayList, R.drawable.instagram_report_pano_outline_24);
        }
        if (c7qv.A0b) {
            JQ0.A1L(C05F.A0o, AbstractC166997dE.A0p(context, 2131960355), arrayList, R.drawable.instagram_report_pano_outline_24);
        }
        if (c7qv.A0q) {
            Integer num = C05F.A0Y;
            int i = 2131960785;
            if (c7qv.A10) {
                i = 2131960774;
            }
            String A0p = AbstractC166997dE.A0p(context, i);
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36320893449806821L);
            int i2 = R.drawable.instagram_delete_pano_outline_24;
            if (A06) {
                i2 = R.drawable.instagram_undo_circle_pano_outline_24;
            }
            JQ0.A1L(num, A0p, arrayList, i2);
        }
        if (c7qv.A0W) {
            JQ0.A1L(C05F.A0j, AbstractC166997dE.A0p(context, 2131972171), arrayList, R.drawable.instagram_delete_pano_outline_24);
        }
        if (c7qv.A0J) {
            JQ0.A1L(C05F.A0F, AbstractC166997dE.A0p(context, 2131957640), arrayList, R.drawable.instagram_delete_pano_outline_24);
        }
        if (c7qv.A0r) {
            JQ0.A1L(C05F.A0m, AbstractC166997dE.A0p(context, 2131960774), arrayList, R.drawable.instagram_undo_circle_pano_outline_24);
        }
    }
}
