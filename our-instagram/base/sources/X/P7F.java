package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P7F implements InterfaceC64682wS {
    public final Integer A00 = C05F.A00;

    @Override // X.InterfaceC64682wS
    public final int CI5(Context context, UserSession userSession) {
        return 0;
    }

    @Override // X.InterfaceC64682wS
    public final int CIc(Context context) {
        C14360o3.A0B(context, 0);
        return context.getResources().getDimensionPixelOffset(R.dimen.album_preview_add_item_margin);
    }

    @Override // X.InterfaceC64682wS
    public final long EM4() {
        return 2000L;
    }

    @Override // X.InterfaceC64682wS
    public final Integer AwQ() {
        return this.A00;
    }

    @Override // X.InterfaceC64682wS
    public final boolean CV9() {
        return true;
    }
}