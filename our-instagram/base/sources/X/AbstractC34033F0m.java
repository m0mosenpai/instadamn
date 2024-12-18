package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.F0m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34033F0m {
    public static final C33211Ekz A00(UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(userSession, 0);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putBoolean("is_surface_elevated", z);
        A05.putString("entrypoint", str);
        A05.putString("media_id", str2);
        A05.putBoolean("media_has_caption_translations", z2);
        A05.putBoolean("media_has_sticker_dubbing", z3);
        A05.putBoolean("media_has_dubbing", z4);
        C33211Ekz c33211Ekz = new C33211Ekz();
        c33211Ekz.setArguments(A05);
        return c33211Ekz;
    }
}
