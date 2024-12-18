package X;

import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.NzW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54312NzW {
    public static final Bundle A00(UserSession userSession, C38321qM c38321qM, String str, String str2, int i, boolean z) {
        AbstractC167007dF.A1G(c38321qM, 0, userSession);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("args_media_id", c38321qM.getId());
        A0b.putInt("args_media_index", i);
        A0b.putBoolean("args_is_feed_preview_entrypoint", z);
        A0b.putString("args_viewer_session_id", str);
        A0b.putString("args_viewer_init_media_id", str2);
        InterfaceC101404gy A00 = AbstractC76903cc.A00(c38321qM);
        if (A00 != null) {
            C101394gx F6v = A00.F6v(C1DS.A00(userSession));
            String str3 = null;
            try {
                StringWriter A0O = AbstractC37300Gc1.A0O();
                C17z A0O2 = MSW.A0O(A0O);
                AbstractC101354gs.A00(A0O2, F6v, true);
                str3 = MSX.A0e(A0O2, A0O);
            } catch (IOException e) {
                AbstractC167007dF.A15(C18950wb.A01.AEp(N60.__redex_internal_original_name, 817902720), DialogModule.KEY_MESSAGE, "Failed to serialize Poll from ClipsEditMetadata", e);
            }
            A0b.putString("args_comment_poll", str3);
        }
        return A0b;
    }
}
