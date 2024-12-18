package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GCT implements InterfaceC64682wS {
    public final /* synthetic */ EM6 A00;

    @Override // X.InterfaceC64682wS
    public final int CI5(Context context, UserSession userSession) {
        return 0;
    }

    @Override // X.InterfaceC64682wS
    public final boolean CV9() {
        return true;
    }

    @Override // X.InterfaceC64682wS
    public final long EM4() {
        return 1000L;
    }

    public GCT(EM6 em6) {
        this.A00 = em6;
    }

    @Override // X.InterfaceC64682wS
    public final Integer AwQ() {
        return C05F.A00;
    }

    @Override // X.InterfaceC64682wS
    public final int CIc(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material);
    }
}
