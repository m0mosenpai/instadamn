package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.8c2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190448c2 {
    public C5SW A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;

    public C190448c2(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        this.A02 = context;
        this.A03 = userSession;
    }

    public final void A00(View view, Integer num, boolean z) {
        if (view != null && view.getVisibility() == 0 && this.A00 == null) {
            if (num.intValue() != 0) {
                UserSession userSession = this.A03;
                if (AbstractC23021Ah.A00(userSession).A1i() || this.A01 || AbstractC23021Ah.A00(userSession).A01.getInt("story_private_mention_reshare_tooltip_impression_count", 0) >= 2) {
                    return;
                }
            } else {
                C23031Ai A00 = AbstractC23021Ah.A00(this.A03);
                if (((Boolean) A00.A3z.CES(A00, C23031Ai.A8c[193])).booleanValue()) {
                    return;
                }
            }
            view.post(new RunnableC24842Az2(view, this, num, z));
        }
    }
}
