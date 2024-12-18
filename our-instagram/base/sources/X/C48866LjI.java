package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

/* renamed from: X.LjI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48866LjI implements C79L {
    @Override // X.C79L
    public final CharSequence AXg(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C18A c18a) {
        boolean A1Y = AbstractC43594JPz.A1Y(userSession, c160787Im.A0e);
        C14360o3.A0B(context, 0);
        Resources resources = context.getResources();
        int i = 2131959763;
        if (A1Y) {
            i = 2131959764;
        }
        return AbstractC43592JPx.A07(resources.getString(i));
    }
}
