package X;

import android.os.Bundle;
import java.util.UUID;

/* renamed from: X.2qZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC61112qZ {
    public static final String A00(Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("shopping_session_id")) == null) {
            String obj = UUID.randomUUID().toString();
            C14360o3.A07(obj);
            return obj;
        }
        return string;
    }
}
