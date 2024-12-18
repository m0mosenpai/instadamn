package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.F0k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34031F0k {
    public static final C33210Eky A00(UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putBoolean("should_show_captions_toggle_description", z);
        A05.putBoolean("is_surface_elevated", z2);
        A05.putString("entrypoint", str);
        A05.putString("media_id", str2);
        A05.putBoolean("media_has_caption_translations", z3);
        A05.putBoolean("media_has_sticker_dubbing", z4);
        A05.putBoolean("media_has_dubbing", z5);
        C33210Eky c33210Eky = new C33210Eky();
        c33210Eky.setArguments(A05);
        return c33210Eky;
    }
}
