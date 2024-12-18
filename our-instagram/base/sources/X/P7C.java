package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P7C implements InterfaceC64682wS {
    public final Integer A00 = C05F.A00;

    @Override // X.InterfaceC64682wS
    public final int CI5(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.action_button_min_width);
        int i = -1;
        if (AbstractC13620mo.A02(context)) {
            i = 1;
        }
        return dimensionPixelOffset * i;
    }

    @Override // X.InterfaceC64682wS
    public final long EM4() {
        return 0L;
    }

    @Override // X.InterfaceC64682wS
    public final Integer AwQ() {
        return this.A00;
    }

    @Override // X.InterfaceC64682wS
    public final boolean CV9() {
        return true;
    }

    @Override // X.InterfaceC64682wS
    public final int CIc(Context context) {
        return AbstractC50523MSb.A00(context);
    }
}
