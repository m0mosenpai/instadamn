package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wlk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70976Wlk implements InterfaceC64682wS {
    @Override // X.InterfaceC64682wS
    public final boolean CV9() {
        return true;
    }

    @Override // X.InterfaceC64682wS
    public final long EM4() {
        return 2000L;
    }

    @Override // X.InterfaceC64682wS
    public final Integer AwQ() {
        return C05F.A00;
    }

    @Override // X.InterfaceC64682wS
    public final int CI5(Context context, UserSession userSession) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        int i = 1;
        if (AbstractC13620mo.A02(context)) {
            i = -1;
        }
        return dimensionPixelSize * i;
    }

    @Override // X.InterfaceC64682wS
    public final int CIc(Context context) {
        return AbstractC167017dG.A03(context);
    }
}
