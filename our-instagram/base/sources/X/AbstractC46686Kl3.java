package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kl3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46686Kl3 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.KNU, X.KC7, androidx.fragment.app.Fragment] */
    public static final KNU A00(UserSession userSession, C47539Kz7 c47539Kz7) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("args_below_status_bar", true);
        A0b.putBoolean("has_album_picker_config", true);
        A0b.putBoolean("args_apc__meta_gallery_enabled", c47539Kz7.A01);
        A0b.putBoolean("args_is_photo_only", c47539Kz7.A00);
        AbstractC03240Dh.A00(A0b, userSession);
        ?? kc7 = new KC7();
        kc7.setArguments(A0b);
        return kc7;
    }
}
