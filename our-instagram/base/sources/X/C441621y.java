package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.21y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C441621y implements InterfaceC13000lm {
    public static final String[] A03 = {C189588ad.__redex_internal_original_name, C207549Gh.__redex_internal_original_name, C9LP.__redex_internal_original_name, "MediaCaptureFragment", C8HI.__redex_internal_original_name, "ClipsShareSheetFragment", N6J.__redex_internal_original_name, C222389rf.__redex_internal_original_name, C222409rh.__redex_internal_original_name, C222329rZ.__redex_internal_original_name};
    public boolean A00;
    public final java.util.Set A01;
    public final UserSession A02;

    public C441621y(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = new LinkedHashSet();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (this.A00) {
            Iterator it = this.A01.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onSessionEnd");
            }
            this.A00 = false;
        }
        this.A01.clear();
    }
}
